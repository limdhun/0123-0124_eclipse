package org.zerock.service;

import java.util.List;

import org.zerock.dto.MenuDTO;

public class MenuService {
	
	public List<MenuDTO> getMenus(){
	//Arraylist말고, List같은 추상화된 타입 사용
	return List.of(MenuDTO.builder().mno(1L).mname("Newyork Pizza")
			.price(20000).fileName("pizza1.jpg").build(),
			MenuDTO.builder().mno(1L).mname("Cicago Pizza")
			.price(27000).fileName("pizza2.jpg").build(),
			MenuDTO.builder().mno(1L).mname("Ditroit Pizza")
			.price(30000).fileName("pizza3.jpg").build()
			);
	
	//방법1
	//MenuDTO menu1 = new MenuDTO();
	
//		List<MenuDTO> list = new ArrayList<>();
//		list.add(
//				MenuDTO.builder()
//				.mno(1L)
//				.mname("Newyork Pizza")
//				.price(20000)
//				.fileName("pizza1.jpg")
//				.build()
//				);
//		return list;
	}
}
