package ru.anna.rest_dealer.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.anna.rest_dealer.model.Request;
import ru.anna.rest_dealer.model.Response;

@RestController
@Log4j2
public class ConsumerController {

  /*  LOG LEVELS

        public String logging() {
        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");
        return "Howdy! Check out the Logs to see the output...";
    } */

    @PostMapping(value = "/feed")
    public ResponseEntity<Response> feedback(@RequestBody Request request){

        log.info("Получаем ответ от первого сервиса...");

        Response response = Response.builder()
                .uId(request.getUId())
                .operationUid(request.getOperationUid())
                .systemTime(request.getSystemTime())
                .code("successful")
                .errorCode("")
                .errorMessage("")
                .build();

     //   System.out.println(response);
        log.info(response);
      //  System.out.println("Ответ доставлен успешно");
        log.info("Ответ получен успешно");
         return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
