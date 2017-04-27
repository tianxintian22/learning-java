package com.test.card;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private int id;
	private String name;
	private List<Card> selectCards;
	
	public Player(int id, String name) {
		this.id = id;
		this.name = name;
		this.selectCards = new ArrayList<Card>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Card> getSelectCards() {
		return selectCards;
	}

	public void setSelectCards(List<Card> selectCards) {
		this.selectCards = selectCards;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Player))
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
