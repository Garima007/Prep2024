package com.prep.java8.core;

import java.util.Random;

class RandomThreadCode {
	
	public void playGame(String game) throws InterruptedException {
		System.out.println("Playing "+game);
		Thread.sleep(500);
		System.out.println("Ended "+game);
	}
	
	public void playSong(String song) throws InterruptedException {
		System.out.println("Playing "+song);
		Thread.sleep(200);
		System.out.println("Ended "+song);
	}

}

public class RandomThreadCodeTest{

	public static void main(String[] args) {
		
		RandomThreadCode rtc = new RandomThreadCode();
		
		String[] games = {"cs-go","mario","vice-city"};
		String[] songs = {"stars","thank you","humma- humma","ooooo","kabiraaaa"};
		
		Random random = new Random();
		
		Runnable playGame = () ->
		{
			try {
				rtc.playGame(games[random.nextInt(games.length)]);
				
			} catch (InterruptedException e) {
				e.getMessage();
			}
			
		};
		
		Runnable playSongs = () ->
		{
			try {
				rtc.playSong(songs[random.nextInt(songs.length)]);
				
			} catch (InterruptedException e) {
				e.getMessage();
			}
			
		};
		
		Thread tpg = new Thread(playGame);
		Thread tps = new Thread(playSongs);
		
		tpg.start();
		tps.start();
		
	}
	
	
	
	
	
}
