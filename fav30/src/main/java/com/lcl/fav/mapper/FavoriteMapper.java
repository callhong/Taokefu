package com.lcl.fav.mapper;

import java.util.List;

import com.lcl.fav.entity.Favorite;
import com.lcl.fav.entity.Tag;

public interface FavoriteMapper {


	List<Favorite> findFavs(Tag tag);


}
