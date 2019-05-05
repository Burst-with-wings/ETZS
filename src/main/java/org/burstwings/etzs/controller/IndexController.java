package org.burstwings.etzs.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 主页控制器
 *
 * @author Nosolution
 * @version 1.0
 * @since 2019/4/29
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ResponseEntity<?> getIndex(HttpServletRequest request) {
        return ResponseEntity.ok("Hello");
    }
}
