package by.htp.les07.view;

import java.util.ArrayList;
import java.util.List;

import by.htp.les07.bean.Date;
import by.htp.les07.bean.Train;

public class TrainConsoleInput {

	public List<Train> create() {
		List<Train> trains = new ArrayList<Train>();
		
		Train tr = new Train(123, "Minsk", new Date(2020,2,12,12,12));
		trains.add(tr);
		
		tr = new Train(455, "Moskva", new Date(2020,2,12,12,10));
		trains.add(tr);
		
		tr = new Train(12, "Mogilev", new Date(2020,2,12,12,12));
		trains.add(tr);
		
		tr = new Train(346, "Moskva", new Date(2020,2,12,2,12));
		trains.add(tr);
		
		tr = new Train(498, "Brest", new Date(2021,3,13,11,10));
		trains.add(tr);
		
		tr = new Train(499, "Brest", new Date(2021,3,12,6,10));
		trains.add(tr);
		
		tr = new Train(500, "Brest", new Date(2020,2,12,6,20));
		trains.add(tr);
		
		tr = new Train(501, "Vitebsk", new Date(2020,2,12,7,30));
		trains.add(tr);
		
		return trains;
		
	}

}

