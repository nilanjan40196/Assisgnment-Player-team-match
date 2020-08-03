package com.capg.Team;

import com.capg.Player.Player;

public class TeamBO {
	
	public Team createTeam(String data,Player[] playerList) {
		String[] teamInfo = data.split(",");
		Team team = new Team();
		team.setName(teamInfo[0]);
		for(Player p : playerList) {
			if(p.getName().equalsIgnoreCase(teamInfo[1])) {
				team.setPlayer(p);
			}
		}
		return team;
		
	}
}
