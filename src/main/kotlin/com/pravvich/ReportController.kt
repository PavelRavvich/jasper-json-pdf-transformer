package com.pravvich

import jakarta.enterprise.context.ApplicationScoped
import jakarta.validation.Valid
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response

@ApplicationScoped
@Path("/api/v1/report")
class ReportController(
    private val reportService: ReportService
) {

    @POST
    @Path("/generate")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("application/pdf")
    fun generateReport(@Valid reportDto: ReportDto): Response {
        return Response
            .ok(reportService.generatePdfReport(reportDto), "application/pdf")
            .header("Content-Disposition", "inline; filename=\"Report.pdf\"")
            .build()
    }
}