package com.lcl.fav.service;

import java.util.List;

import com.lcl.fav.entity.Favorite;

public interface FavoriteService {


	List<Favorite> listFavs(String tagName);

}
