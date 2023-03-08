package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "football")
public class model {
	@Id
	private int serialno;
	private String clubname;
	private String captain;
	private String coach;
	private int trophy;


	public int getSerialno() {
		return serialno;
	}

	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}

	public String getClubname() {
		return clubname;
	}

	public void setClubname(String clubname) {
		this.clubname = clubname;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public int getTrophy() {
		return trophy;
	}

	public void setTrophy(int trophy) {
		this.trophy = trophy;
	}
	

	public model(int serialno, String clubname, String captain, String coach, int trophy) {
		super();
		this.serialno = serialno;
		this.clubname = clubname;
		this.captain = captain;
		this.coach = coach;
		this.trophy = trophy;
	}

	public model() {
		
	}

	public String toString() {
		return "sno="+serialno+"clubname="+clubname+"cap="+captain+"coach="+coach+"trophy="+trophy;
	}

}