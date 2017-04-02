package com.lcl.fav.web.handler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcl.fav.entity.Tag;
import com.lcl.fav.service.TagService;

@Controller
@RequestMapping("tag")
public class TagHandler {
	@Autowired
	private TagService tagService;

	@RequestMapping(value="", method=RequestMethod.GET)
	@ResponseBody
	public List<Tag> list(){
		return tagService.listTags();
	}
}
