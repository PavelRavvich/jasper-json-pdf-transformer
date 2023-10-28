package com.pravvich

import jakarta.annotation.PostConstruct
import jakarta.inject.Singleton
import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource
import org.eclipse.microprofile.config.inject.ConfigProperty


@Singleton
class ReportService(
    @ConfigProperty(name = "jasper-report.filename") private val filename: String
) {

    private var resourcePath: String? = null

    @PostConstruct
    fun init() {
        resourcePath = javaClass.getClassLoader().getResource("reports.config/$filename")?.path
    }

    fun generatePdfReport(dto: ReportDto): ByteArray {
        val params = mapOf(
            "companyUrl" to dto.companyUrl!!,
            "companyName" to dto.companyName!!
        )
        val dataSource = JRBeanCollectionDataSource(dto.rows)
        val report = JasperCompileManager.compileReport(resourcePath!!)
        val jasperPrint = JasperFillManager.fillReport(report, params, dataSource)
        return JasperExportManager.exportReportToPdf(jasperPrint)
    }
}