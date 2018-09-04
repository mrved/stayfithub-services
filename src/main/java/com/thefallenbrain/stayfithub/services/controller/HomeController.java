package com.thefallenbrain.stayfithub.services.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController
@RequestMapping("/")
public class HomeController {

    private static final String MESSAGE_FORMAT = "%s!";

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity helloWorldGet(@RequestParam(value = "name", defaultValue = "stayfithub services") String name) {
        return ResponseEntity.ok(createResponse(name));
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity helloWorldPost(@RequestParam(value = "name", defaultValue = "stayfithub services") String name) {
        return ResponseEntity.ok(createResponse(name));
    }

    private String createResponse(String name) {
        try {
			return new JSONObject().put("Output", String.format(MESSAGE_FORMAT, name)).toString();
		} catch (JSONException e) {
			return "error";
		}
    }
}
