package com.lcl.fav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcl.fav.entity.Favorite;
import com.lcl.fav.entity.Tag;
import com.lcl.fav.mapper.FavoriteMapper;
import com.lcl.fav.service.FavoriteService;

@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService {

	@Autowired
	private FavoriteMapper favoriteMapper;
	
	@Override
	public List<Favorite> listFavs(String tagName){
		
		return favoriteMapper.findFavs(new Tag(tagName));
		
	}
}
