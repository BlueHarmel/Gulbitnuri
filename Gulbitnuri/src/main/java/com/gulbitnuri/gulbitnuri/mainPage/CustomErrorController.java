package com.gulbitnuri.gulbitnuri.mainPage;

import jakarta.servlet.RequestDispatcher;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController {

    private String VIEW_PATH = "/pages/errors";

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            int statusCode = Integer.valueOf(status.toString());
            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                return VIEW_PATH + "/404";
            } else if (statusCode == HttpStatus.FORBIDDEN.value()||statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                return VIEW_PATH + "/500";
            }
        }
        // 기본적으로 처리할 페이지를 반환합니다.
        return "/error";
    }
}
