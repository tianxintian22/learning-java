package com.test.card;

public class Card implements Comparable<Card> {
	private String color;
	private String point;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	
	public Card(String color, String point) {
		this.color = color;
		this.point = point;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((point == null) ? 0 : point.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Card))
			return false;
		Card other = (Card) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (point == null) {
			if (other.point != null)
				return false;
		} else if (!point.equals(other.point))
			return false;
		return true;
	}
	@Override
	public int compareTo(Card o) {
		String[] points = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		int key1 = 0;
		int key2 = 0;
		for (int i = 0; i < points.length; i++) {
			if (o.point.equals(points[i])) {
				key1 = i;
			}
			if (this.point.equals(points[i])) {
				key2 = i;
			}
		}
		if (key1 > key2){
			return 1;
		} else if (key1 < key2) {
			return -1;
		} else {
			return 0;
		}
	}

}
