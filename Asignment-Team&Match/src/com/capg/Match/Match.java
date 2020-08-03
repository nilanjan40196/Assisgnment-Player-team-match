package com.capg.Match;

import com.capg.Team.Team;

public class Match {
	
	private String date;
	private Team teamone;
	private Team teamtwo;
	private String venue;
	
	private Team team;

	@Override
	public String toString() {
		return String.format("Date \t\tTeamone \t\tTeamtwo \t\tvenue\n%s%9s%24s%42s ", date, teamone.getName(), teamtwo.getName(), venue +"\n");
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Team getTeamone() {
		return teamone;
	}

	public void setTeamone(Team teamone) {
		this.teamone = teamone;
	}

	public Team getTeamtwo() {
		return teamtwo;
	}

	public void setTeamtwo(Team teamtwo) {
		this.teamtwo = teamtwo;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Match(String date, Team teamone, Team teamtwo, String venue, Team team) {
		super();
		this.date = date;
		this.teamone = teamone;
		this.teamtwo = teamtwo;
		this.venue = venue;
		this.team = team;
	}

	public Match() {
		super();
	}
	
	

}
