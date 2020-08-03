package com.capg.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.capg.Match.Match;
import com.capg.Match.MatchBO;
import com.capg.Player.Player;
import com.capg.Player.PlayerBO;
import com.capg.Team.Team;
import com.capg.Team.TeamBO;

public class Program {

	public static void main(String[] args) throws IOException {
		
		PlayerBO pbo = new PlayerBO();
		TeamBO tbo = new TeamBO();
		MatchBO mbo = new MatchBO();
		
		Player player ;
		Team team;// = new Team();
		Match match;// = new Match();
		
		Scanner sc = new Scanner(System.in);
		BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the player count : ");
		int pcount = sc.nextInt();
		Player[] players = new Player[pcount];
		for(int i=1,j=0;i<=pcount;i++,j++) {
			System.out.println("Enter player "+i+" details :");
			String data = reader.readLine();
			player = pbo.createPlayer(data);
			players[j]=player;
		}
		
		System.out.println("Enter the team count :");
		int tcount = sc.nextInt();
		Team[] teams = new Team[tcount]; 
		for(int i=1,j=0;i<=tcount;i++,j++) {
			System.out.println("Enter team "+i+" details :");
			String data = reader.readLine();
			team = tbo.createTeam(data, players);
			teams[j] = team;
		}
		
		System.out.println("Enter the match count : ");
		int mcount = sc.nextInt();
		Match []matches = new Match[mcount];
		for(int i=1,j=0;i<=mcount;i++,j++) {
			System.out.println("Enter match "+i+" details :");
			String data = reader.readLine();
			match=mbo.createMatch(data, teams);
			matches[j] = match;
		}
//		
		
		do {
			System.out.println("Menu : \r\n" + 
					"1) Find Team \r\n" + 
					"2) Find All Matches In A Specific Venue \r" + 
					"");
			
			switch(sc.nextInt()) {
			case 1 :
					System.out.println("Enter Match date : ");
					String date = sc.next();
					Team[] t = mbo.findTeam(date, matches);
					System.out.println("Teams : ");
					System.out.println(t[0].getName()+","+t[1].getName());
					break;
			case 2 :
					System.out.println("Enter Team Name :");
					String tname = sc.next();
					mbo.findAllMatchesOfTeam(tname, matches);
					break;
			default:
					System.out.println("Invalid Input!!!");
					break;
			}
			System.out.println("Do you want to continue? Type Yes or No ");
		}while(!(sc.next().equalsIgnoreCase("no")));
	}

}
