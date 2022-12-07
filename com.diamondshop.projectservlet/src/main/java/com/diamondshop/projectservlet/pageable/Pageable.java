package com.diamondshop.projectservlet.pageable;

import com.diamondshop.projectservlet.sorter.Sorter;

public interface Pageable {
	Integer getPage();
	Integer	getOffset();
	Integer getLimit();
	Sorter getSorter();
}
