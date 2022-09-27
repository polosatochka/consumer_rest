package ru.anna.rest_dealer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    private String uId;

    private String operationUid;

    private String systemTime;

    private String code;

    private String errorCode;

    private String errorMessage;

}
