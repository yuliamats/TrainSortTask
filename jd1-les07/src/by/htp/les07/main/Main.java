package by.htp.les07.main;

import java.util.List;

import by.htp.les07.bean.Train;
import by.htp.les07.service.TrainLogic;
import by.htp.les07.view.TrainConsoleInput;
import by.htp.les07.view.TrainView;

public class Main {

	public static void main(String[] args) {
		TrainView view = new TrainView();
		TrainConsoleInput input = new TrainConsoleInput();

		TrainLogic logic = new TrainLogic();

		List<Train> trains;
		trains = input.create();

		view.print(trains);

		System.out.println("--------------");

		logic.sortByNumber(trains);
		logic.sortByStationAndDate(trains);
			
		view.print(trains);
		
	}
}