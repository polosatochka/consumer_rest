package ru.anna.rest_dealer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank
    @Size(max = 32)
    private String uId;

    @NotBlank
    @Size(max = 32)
    private String operationUid;

    private String systemName;

    @NotBlank
    private String systemTime;

    private String source;

    private Integer communicationId;

    private Integer templateId;

    @Max(7)
    private Integer productCode;

    @Max(5)
    private Integer smsCode;
}
