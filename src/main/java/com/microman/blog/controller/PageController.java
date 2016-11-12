package com.microman.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.microman.blog.common.CommonStatus;
import com.microman.blog.common.JsonResult;
import com.microman.blog.service.PageRecordService;
import com.microman.blog.vo.PageRecord;

/**
 * 页面转换
 * @author helijun
 *
 * @Date 2016-10-25
 */
@Controller
@RequestMapping("/")
public class PageController {

	@Autowired
	PageRecordService pageRecordService;
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcomePage() {
        //return new ModelAndView("mogu/index");
    	return new ModelAndView("blog/list");
    }
    
    @RequestMapping(value = "{fileName}/{pageName}", method = RequestMethod.GET)
    public ModelAndView Page(
    		@PathVariable("fileName") String fileName,
    		@PathVariable("pageName") String pageName) {
        return new ModelAndView(fileName + "/"+ pageName);
    }
    
    @RequestMapping(value = "/rest/record/page", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult PageRecord(PageRecord pageRecord) {
    	int count = pageRecordService.insertRecord(pageRecord);
    	return new JsonResult(CommonStatus.SUCCESS,count);
    }
}
