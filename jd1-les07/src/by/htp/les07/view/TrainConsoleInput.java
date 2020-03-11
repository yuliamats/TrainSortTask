package by.htp.les07.view;

import java.util.ArrayList;
import java.util.List;

import by.htp.les07.bean.Date;
import by.htp.les07.bean.Train;

public class TrainConsoleInput {

	public List<Train> create() {
		List<Train> trains = new ArrayList<Train>();
		
		Train tr = new Train(123, "Minsk", new Date(2020,2,5,3,42));
		trains.add(tr);
		
		tr = new Train(455, "Minsk", new Date(2020,2,2,2,30));
		trains.add(tr);
		
		tr = new Train(12, "Minsk", new Date(2020,2,2,2,20));
		trains.add(tr);
		
		tr = new Train(346, "Vitebsk", new Date(2020,2,2,2,12));
		trains.add(tr);
		
		tr = new Train(498, "Brest", new Date(2020,2,6,2,10));
		trains.add(tr);
		
		tr = new Train(499, "Brest", new Date(2020,2,6,3,22));
		trains.add(tr);
		
		tr = new Train(500, "Brest", new Date(2020,2,6,3,13));
		trains.add(tr);
		
		tr = new Train(501, "Brest", new Date(2021,2,6,3,33));
		trains.add(tr);
		
		tr = new Train(521, "Brest", new Date(2020,2,6,3,33));
		trains.add(tr);
		
		tr = new Train(347, "Vitebsk", new Date(2021,1,1,2,12));
		trains.add(tr);
		return trains;
		
		
	}

}

