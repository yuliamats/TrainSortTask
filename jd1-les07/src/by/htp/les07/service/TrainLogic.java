package by.htp.les07.service;

import java.util.ArrayList;
import java.util.List;

import by.htp.les07.bean.Train;
import by.htp.les07.view.TrainView;

public class TrainLogic {

	public Train findTrainByNumber(List<Train> trains, int trainNumber) {

		for (Train train : trains) {
			if (train.getNumber() == trainNumber) {
				return train;
			}
		}
		return null;
	}

	public void sortByNumber(List<Train> trains) {

		for (int i = 0; i < trains.size() - 1; i++) {
			int minTrainNumber = trains.get(i).getNumber();
			int minTrainNumberIndex = i;

			for (int j = i + 1; j < trains.size(); j++) {
				Train currentTrain = trains.get(j);

				if (minTrainNumber > currentTrain.getNumber()) {
					minTrainNumber = currentTrain.getNumber();
					minTrainNumberIndex = j;
				}

			}

			Train temp1 = trains.get(i);
			Train temp2 = trains.get(minTrainNumberIndex);

			trains.set(i, temp2);
			trains.set(minTrainNumberIndex, temp1);

		}

	}

	public void sortByDestinationStation(List<Train> trains) {

		for (int i = 0; i < trains.size() - 1; i++) {
			String minStationName = trains.get(i).getDestinationStation();
			int minStationNameIndex = i;

			for (int j = i + 1; j < trains.size(); j++) {
				Train currentTrain = trains.get(j);

				if (minStationName.compareToIgnoreCase(currentTrain.getDestinationStation()) > 0) {
					minStationName = currentTrain.getDestinationStation();
					minStationNameIndex = j;
				}

			}

			Train temp1 = trains.get(i);
			Train temp2 = trains.get(minStationNameIndex);

			trains.set(i, temp2);
			trains.set(minStationNameIndex, temp1);
		}
	}

	public List<Integer> findDublicateStations(List<Train> trains, int from) {
		List<Integer> result = new ArrayList<Integer>();
		
		String firstStationName;
		String nextStationName;
		String lastStationName;

		for (int i = from; i < trains.size() - 1; i++) {
			firstStationName = trains.get(i).getDestinationStation();
			nextStationName = trains.get(i + 1).getDestinationStation();

			if (firstStationName.compareToIgnoreCase(nextStationName) == 0) {
				result.add(0, i);

				for (int j = i + 1; j < trains.size(); j++) {
					if (j == (trains.size() - 1)) {
						result.add(1, j);
						return result;
					} else {
						lastStationName = trains.get(j + 1).getDestinationStation();
					}

					if (nextStationName.compareToIgnoreCase(lastStationName) != 0) {
						result.add(1, j);
						return result;
					}
				}
			}
		}
		return result;
	}

	public void sortByDate(List<Train> trains, int start, int end) {
		sortByMonth(trains, start, end);
		for (int i = start; i <= end; i++) {
			int minTrainDate = trains.get(i).getDate().getYear();
			int minTrainDateIndex = i;

			for (int j = i + 1; j <= end; j++) {
				Train currentTrain = trains.get(j);

				if (minTrainDate > currentTrain.getDate().getYear()) {
					minTrainDate = currentTrain.getDate().getYear();
					minTrainDateIndex = j;
				}
			}

			Train temp1 = trains.get(i);
			Train temp2 = trains.get(minTrainDateIndex);

			trains.set(i, temp2);
			trains.set(minTrainDateIndex, temp1);
		}
	}

	public void sortByMonth(List<Train> trains, int start, int end) {

		for (int i = start; i <= end; i++) {
			int minTrainDate = trains.get(i).getDate().getMonth();
			int minTrainDateIndex = i;

			for (int j = i + 1; j <= end; j++) {
				Train currentTrain = trains.get(j);

				if (minTrainDate > currentTrain.getDate().getMonth()) {
					minTrainDate = currentTrain.getDate().getMonth();
					minTrainDateIndex = j;
				}
			}

			Train temp1 = trains.get(i);
			Train temp2 = trains.get(minTrainDateIndex);

			trains.set(i, temp2);
			trains.set(minTrainDateIndex, temp1);
		}
	}

	public void sortByDay(List<Train> trains, int start, int end) {
		sortByMonth(trains, start, end);
		for (int i = start; i <= end; i++) {
			int minTrainDate = trains.get(i).getDate().getDay();
			int minTrainDateIndex = i;

			for (int j = i + 1; j <= end; j++) {
				Train currentTrain = trains.get(j);

				if (minTrainDate > currentTrain.getDate().getDay()) {
					minTrainDate = currentTrain.getDate().getDay();
					minTrainDateIndex = j;
				}
			}

			Train temp1 = trains.get(i);
			Train temp2 = trains.get(minTrainDateIndex);

			trains.set(i, temp2);
			trains.set(minTrainDateIndex, temp1);
		}
	}

	public void sortByHour(List<Train> trains, int start, int end) {
		sortByDay(trains, start, end);
		for (int i = start; i <= end; i++) {
			int minTrainDate = trains.get(i).getDate().getHour();
			int minTrainDateIndex = i;

			for (int j = i + 1; j <= end; j++) {
				Train currentTrain = trains.get(j);

				if (minTrainDate > currentTrain.getDate().getHour()) {
					minTrainDate = currentTrain.getDate().getHour();
					minTrainDateIndex = j;
				}
			}

			Train temp1 = trains.get(i);
			Train temp2 = trains.get(minTrainDateIndex);

			trains.set(i, temp2);
			trains.set(minTrainDateIndex, temp1);
		}
	}

	public void sortByMinute(List<Train> trains, int start, int end) {
		sortByHour(trains, start, end);
		for (int i = start; i <= end; i++) {
			int minTrainDate = trains.get(i).getDate().getMinute();
			int minTrainDateIndex = i;

			for (int j = i + 1; j <= end; j++) {
				Train currentTrain = trains.get(j);

				if (minTrainDate > currentTrain.getDate().getMinute()) {
					minTrainDate = currentTrain.getDate().getMinute();
					minTrainDateIndex = j;
				}
			}

			Train temp1 = trains.get(i);
			Train temp2 = trains.get(minTrainDateIndex);

			trains.set(i, temp2);
			trains.set(minTrainDateIndex, temp1);
		}
	}

	public void sortByStationAndDate(List<Train> trains) {
		int start = 0;
		List<Integer> range;

		sortByDestinationStation(trains);
		range = findDublicateStations(trains, start);

		while (range.size() > 0) {
			sortByDate(trains, range.get(0), range.get(1));
			start = range.get(1);
			range = findDublicateStations(trains, start);
		}
	}
}
