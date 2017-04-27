package com.test.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CardGames {
	private List<Card> cardList;
	private List<Player> playerList;
	private List<Card> compareList;
	public Scanner console;
	public CardGames() {
		this.cardList = new ArrayList<Card>();
		this.playerList = new ArrayList<Player>();
		this.compareList = new ArrayList<Card>();
		this.console = new Scanner(System.in);
	}
	
	public List<Card> getCardList() {
		return cardList;
	}

	public void setCardList(List<Card> cardList) {
		this.cardList = cardList;
	}

	public void createCards() {
		System.out.println("========�����˿���=========");
		String[] colors = {"����", "����", "÷��", "��Ƭ"};
		String[] points = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

		for (String color : colors) {
			for (String point : points) {
				cardList.add(new Card(color, point));
			}
		}
		System.out.println("========�����˿��Ƴɹ�========");
		System.out.print(cardList.size() + "�ţ�Ϊ��[");
		for (Card card : cardList) {
			System.out.print(card.getColor() + card.getPoint() + ",");
		}
		System.out.println("]");
	}

	public void shuffleCards() {
		System.out.println("========��ʼϴ��=========");
		Random random = new Random();
		int cardsCount = cardList.size();
		for (int i = 0; i < cardsCount; i++) {
			Card temp = cardList.get(0);
			cardList.remove(0);
			cardList.add(random.nextInt(cardsCount), temp);
		}
		System.out.println("========ϴ�ƽ���=========");
		System.out.print(cardList.size() + "�ţ�Ϊ��[");
		for (Card card : cardList) {
			System.out.print(card.getColor() + card.getPoint() + ",");
		}
		System.out.print("]");
	}
	
	public void createPlayer() {
		System.out.println("========�������=========");
		for (int i = 0; i < 2; i++) {
			while (true){
				try {
					System.out.println("���������ID��");
					int playerId = console.nextInt();
					
					if (playerList.contains(new Player(playerId, null))) {
						throw new Exception();
					}
					
					System.out.println("���������������");
					String playerName = console.next();
					
					Player p1 = new Player(playerId, playerName);
					playerList.add(p1);
					break;
				} catch (InputMismatchException  e) {
					console = new Scanner(System.in);
					System.out.println("�������������͵�ID!");
				} catch (Exception e) {
					System.out.println("��ID�Ѵ���!");
				}
			}
		}
		for (Player player : playerList) {
			System.out.println("========��ӭ���:" + player.getName() + "=========");
		}
	}
	
	public void dealCards() {
		System.out.println("========��ʼ����=========");
		int cardKey = 0;
		for (int i = 0; i < 2; i++) {
			for (Player player : playerList) {
				Card c1 = cardList.get(cardKey);
				player.getSelectCards().add(c1);
				System.out.println("========��ң�" +player.getName() + "����," + c1.getColor() + c1.getPoint());
				cardKey++;
			}
		}
		System.out.println("========���ƽ���=========");
	}
	
	public void playGames() {
		System.out.println("========��ʼ��Ϸ=========");
		for (Player player : playerList) {
			System.out.print("��ң�" + player.getName() + "��������");
			for (Card card : player.getSelectCards()) {
				System.out.print(card.getColor() + card.getPoint());
			}
			System.out.println("");
			Collections.sort(player.getSelectCards());
			Card maxCard = player.getSelectCards().get(0);
			compareList.add(maxCard);
		}
		//��������
		Collections.sort(compareList);
		//����ɫ����
		if (compareList.get(0).getPoint() == compareList.get(1).getPoint()) {
			Collections.sort(compareList, new ComparatorCard());
		}
		Card finalMaxCard = compareList.get(0);
		for (Player player : playerList) {
			if (player.getSelectCards().contains(finalMaxCard)) {
				System.out.println("========��ң�" + player.getName() + "��ʤ=========");
			}
		}
	}

	public static void main(String[] args) {
		CardGames cg = new CardGames();
		cg.createCards();
		cg.shuffleCards();
		cg.createPlayer();
		cg.dealCards();
		cg.playGames();
	}

}
