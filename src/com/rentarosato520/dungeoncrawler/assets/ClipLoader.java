package com.rentarosato520.dungeoncrawler.assets;

import java.applet.Applet;
import java.applet.AudioClip;

public class ClipLoader {
	public static final ClipLoader hurt = new ClipLoader("/HitSound.wav");
	public static final ClipLoader exp = new ClipLoader("/Explosion.wav");
	public static final ClipLoader exp1 = new ClipLoader("/Explosion2.wav");
	
	private AudioClip clip;
	
	private ClipLoader(String name){
		clip = Applet.newAudioClip(ClipLoader.class.getResource(name));
	}
	
	public void play(){
		new Thread(){
			public void run(){
				clip.play();
			}
		}.start();
	}
}
