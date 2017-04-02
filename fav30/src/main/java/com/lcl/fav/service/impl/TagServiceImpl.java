package com.lcl.fav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcl.fav.entity.Tag;
import com.lcl.fav.mapper.TagMapper;
import com.lcl.fav.service.TagService;

@Service("tagService")
public class TagServiceImpl implements TagService {
	@Autowired
	private TagMapper tagMapper;

	@Override
	public List<Tag> listTags() {
		
		return tagMapper.findAllTags();
	}

}
