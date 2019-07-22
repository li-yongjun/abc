package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-07-22T14:30:59.788Z")

@RestSchema(schemaId = "projectxy4o")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectxy4oImpl {

    @Autowired
    private Projectxy4oDelegate userProjectxy4oDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectxy4oDelegate.helloworld(name);
    }

}
