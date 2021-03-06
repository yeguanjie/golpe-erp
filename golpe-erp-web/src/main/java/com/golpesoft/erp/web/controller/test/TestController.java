package com.golpesoft.erp.web.controller.test;

import com.golpesoft.erp.facade.models.request.QueryPageReqDTO;
import com.golpesoft.erp.facade.models.response.AdminRoleVO;
import com.golpesoft.erp.facade.models.response.QueryPageResDTO;
import com.golpesoft.erp.process.admin.AdminRoleProcessImpl;
import com.golpesoft.erp.service.admin.AdminRoleServiceImpl;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by guanjieye on 2018/5/19.
 */
@Controller
public class TestController {

    @Autowired
    private AdminRoleServiceImpl adminRoleService;

    @RequestMapping("/test")
    public ModelAndView test(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
        System.out.println(request.getContextPath());
        mav.setViewName("test");
        return mav;
    }

    @RequestMapping("/test1")
    @ResponseBody
    private Object adminRoleList(){
        QueryPageReqDTO<String> queryPageReqDTO = new QueryPageReqDTO<>();
        queryPageReqDTO.setReqDTO("123");
        QueryPageResDTO<AdminRoleVO> resDTO = adminRoleService.queryAdminRole(queryPageReqDTO);
        return resDTO;
    }
}
