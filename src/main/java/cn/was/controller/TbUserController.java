package cn.was.controller;


import cn.was.enums.SexEnum;
import cn.was.entity.TbUser;
import cn.was.service.ITbUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 王安顺
 * @since 2022-08-10
 */
@RestController
@Api(tags = "TbUserController", description = "后台用户管理")
@RequestMapping("/tbUser")
public class TbUserController {

    @Autowired
    private ITbUserService tbUserService;

    @ApiOperation("添加用户")
    @PostMapping("/save")
    public boolean save(@RequestBody TbUser user){

        boolean b = tbUserService.save(user);

        return b;


    }

    @ApiOperation("删除用户")
    @DeleteMapping("/delete")
    public boolean delete(@RequestBody TbUser t){
        TbUser tbUser = new TbUser();
        tbUser.setId(t.getId());

        boolean b = tbUserService.removeById(tbUser);
        return b;
    }

    @ApiOperation("查询用户")
    @GetMapping("/list")
    public List<TbUser> find(){
        List<TbUser> list = tbUserService.list();
        return list;
    }

    @ApiOperation("查询用户by id")
    @GetMapping("/findByID")
    public String find(@RequestParam Integer id){


        TbUser user = tbUserService.getById(id);
        return user.getSex().getName();
    }






}

