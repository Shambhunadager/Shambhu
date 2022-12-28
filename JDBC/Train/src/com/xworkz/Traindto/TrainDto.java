package com.xworkz.Traindto;

public class TrainDto {
	private String TrainName;
	private int noOfseat;
	private boolean Sleepercoach;
	private String Startlocation;
	private String Endlocation;
	
	
	@Override
	public String toString() {
		return "TrainDto [TrainName=" + TrainName + ", noOfseat=" + noOfseat + ", Sleepercoach=" + Sleepercoach
				+ ", Startlocation=" + Startlocation + ", Endlocation=" + Endlocation + "]";
	}
	public TrainDto(String trainName, int noOfseat, boolean sleepercoach, String startlocation, String endlocation) {
		super();
		TrainName = trainName;
		this.noOfseat = noOfseat;
		Sleepercoach = sleepercoach;
		Startlocation = startlocation;
		Endlocation = endlocation;

	}
	public String getTrainName() {
		return TrainName;
	}
	public void setTrainName(String trainName) {
		TrainName = trainName;
	}
	public int getNoOfseat() {
		return noOfseat;
	}
	public void setNoOfseat(int noOfseat) {
		this.noOfseat = noOfseat;
	}
	public boolean isSleepercoach() {
		return Sleepercoach;
	}
	public void setSleepercoach(boolean sleepercoach) {
		Sleepercoach = sleepercoach;
	}
	public String getStartlocation() {
		return Startlocation;
	}
	public void setStartlocation(String startlocation) {
		Startlocation = startlocation;
	}
	public String getEndlocation() {
		return Endlocation;
	}
	public void setEndlocation(String endlocation) {
		Endlocation = endlocation;
	}
	
	

}
