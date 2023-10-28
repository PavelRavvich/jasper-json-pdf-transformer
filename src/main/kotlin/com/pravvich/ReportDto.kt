package com.pravvich

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

@JsonIgnoreProperties(ignoreUnknown = true)
class ReportDto {

    @JsonProperty("companyName")
    @NotNull(message = "can not be null")
    @Size(min = 1, max = 30, message = "can not be blank")
    var companyName: String? = null

    @JsonProperty("companyUrl")
    @NotNull(message = "can not be null")
    @Size(min = 1, max = 30, message = "can not be blank")
    var companyUrl: String? = null

    @Valid
    @JsonProperty("rows")
    @NotNull(message = "can not be null")
    @Size(min = 1, message = "rows can not be empty")
    var rows: List<ReportRowDto>? = null
}

@JsonIgnoreProperties(ignoreUnknown = true)
class ReportRowDto {

    @JsonProperty("name")
    @NotNull(message = "can not be null")
    @Size(min = 1, message = "can not be blank")
    var name: String? = null

    @JsonProperty("age")
    var age: String = "-"

    @JsonProperty("gender")
    var gender: String = "-"

    @JsonProperty("phone")
    var phone: String = "-"

    @JsonProperty("birthday")
    var birthday: String = "-"
}
