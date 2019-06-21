package com.technicolor.swagger.controller;



import com.technicolor.swagger.pojo.ResObject;
import com.technicolor.swagger.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Technicolor
 * @version v1.0
 * @date 2019/6/20 16:33
 * @description
 **/

@Api(description = "用户接口")
@RestController
@RequestMapping("/demoController")
public class SwaggerDemoController {

    @ApiOperation(value = "新增用户" ,notes = "新增注册")
    @RequestMapping(value = "/creatUser",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResObject createUser(@RequestBody User user){
        System.out.println("createUser:::"+user.toString());
//        return new ResObject(200,"","新增成功");
        return new ResObject(HttpStatus.OK.value(), "新增成功.");
    }

    @ApiOperation(value = "修改用户" ,notes = "修改用户")
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResObject updateUser(@RequestBody User user){
        System.out.println("updateUser:::"+user.toString());
//        return new ResObject(200,"","新增成功");
        return new ResObject(HttpStatus.OK.value(), "新增成功.");
    }

}
