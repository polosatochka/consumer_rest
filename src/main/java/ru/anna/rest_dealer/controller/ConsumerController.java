package ru.anna.rest_dealer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.anna.rest_dealer.model.Request;
import ru.anna.rest_dealer.model.Response;

@RestController
public class ConsumerController {

    @PostMapping(value = "/feed")
    public ResponseEntity<Response> feedback(@RequestBody Request request){

        Response response = Response.builder()
                .uId(request.getUId())
                .operationUid(request.getOperationUid())
                .systemTime(request.getSystemTime())
                .code("successful")
                .errorCode("")
                .errorMessage("")
                .build();

        System.out.println(response);
        System.out.println("Ответ доставлен успешно");
         return new ResponseEntity<>(response, HttpStatus.OK);

    }
}
