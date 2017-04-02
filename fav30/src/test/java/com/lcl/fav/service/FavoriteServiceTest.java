package com.lcl.fav.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lcl.fav.entity.Favorite;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class FavoriteServiceTest {

	@Autowired
	private FavoriteService favoriteService;
	@Test
	public void testListFavs() {
		List<Favorite> favs = favoriteService.listFavs("java");
		System.out.println(favs);
		assertNotNull(favs);
	}

}
