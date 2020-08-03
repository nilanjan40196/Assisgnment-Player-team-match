package com.capg.Match;

import com.capg.Team.Team;

public class MatchBO {
	private Team findteam(String team,Team[] teamList) {
		
		for(Team t : teamList) {
			if(t.getName().equalsIgnoreCase(team)) {
				//System.out.println(t.getName());
				return t;
			}
		}
		//System.out.println("nnn");
		return null;
		
	}
	
	public Match createMatch(String data,Team[] teamList) {
		String[] matchInfo = data.split(",");
		Match match = new Match();
		match.setDate(matchInfo[0]);
		System.out.println(matchInfo[1]+" "+matchInfo[2]);
		/*
		 * for(Team t : teamList) { System.out.println(t.getName()+" "+matchInfo[1]);
		 * if(t.getName().equalsIgnoreCase(matchInfo[1])) { System.out.println("true");
		 * match.setTeamone(t); } }
		 * 
		 * for(Team t : teamList) { if(t.getName().equalsIgnoreCase(matchInfo[2])) {
		 * match.setTeamtwo(t); } }
		 */
		Team t1 = findteam(matchInfo[1], teamList);
		//System.out.println("t1.getName"+t1.getName());
		Team t2 = findteam(matchInfo[2], teamList);
		//System.out.println("t2.getName"+t2.getName());
		match.setTeamone(t1);
		match.setTeamtwo(t2);
		match.setVenue(matchInfo[3]);
		return match;
		
	}
	
	public Team[] findTeam(String matchDate,Match[] matchList) {
		Team[] t =new Team[2];//= new Team();
		for(Match m : matchList) {
			if(m.getDate().equals(matchDate)) {
				t[0]=m.getTeamone();
				//System.out.println(t[0].getName());
				t[1]=m.getTeamtwo();
				//System.out.println(t[1].getName());
				return t;
			}
		}
		return t;
		
	}
	public void findAllMatchesOfTeam(String teamName, Match[] matchList) {
		for(Match m : matchList) {
			if(m.getTeamone().getName().equalsIgnoreCase(teamName) || m.getTeamtwo().getName().equalsIgnoreCase(teamName)) {
				System.out.println(m);
			}
		}
	}
}
