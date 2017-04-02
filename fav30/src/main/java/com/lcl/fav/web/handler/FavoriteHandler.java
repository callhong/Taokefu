package com.lcl.fav.web.handler;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcl.fav.entity.Favorite;
import com.lcl.fav.service.FavoriteService;

@Controller("favoriteHandler")
@RequestMapping("fav")
public class FavoriteHandler {
	@Autowired
	private FavoriteService favoriteService;
	
	@RequestMapping(value="/{tagName}",method=RequestMethod.GET)
	@ResponseBody
	public List<Favorite> list(@PathVariable("tagName")String tagName) throws UnsupportedEncodingException{
		System.out.println("fav==============啦啦啦啦");
		tagName = new String(tagName.getBytes("ISO-8859-1"),"UTF-8");
		System.out.println(tagName);
		return favoriteService.listFavs(tagName);
	}
}
