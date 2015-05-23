package com.rentarosato520.dungeoncrawler.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import com.rentarosato520.dungeoncrawler.GameMain;

public class GameClient extends Thread{
	//InetAddress is the ip address of the server this client will connect to
	private InetAddress ipaddress;
	private DatagramSocket socket;
	private GameMain game;
	
	public GameClient(GameMain game, String ip){
		this.game = game;
		try {
			this.socket = new DatagramSocket();
			this.ipaddress = InetAddress.getByName(ip);
		} catch (SocketException e) {
			
			e.printStackTrace();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	}
	
	public void run(){
		while(true){
			byte[] data = new byte[1024];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			try {
				socket.receive(packet);
			} catch (IOException e) {

				e.printStackTrace();
			}
			String message = new String(packet.getData());
			System.out.println("Server > "+message);
		}
	}
	
	public void sendData(byte[] data){
		DatagramPacket packet = new DatagramPacket(data, data.length, ipaddress, 1331);
		try {
			socket.send(packet);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
