package com.example.traintricketbookingapp.restcontroller;

import com.example.traintricketbookingapp.beans.Train;
import com.example.traintricketbookingapp.exception.mvc.train.TrainNotFoundException;
import com.example.traintricketbookingapp.exception.restapi.train.ApiTrainNotFoundException;
import com.example.traintricketbookingapp.service.mvc.ITrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trains")
public class TrainRestController {

	@Autowired
	private ITrainService trainService;

	/**
	 * Retrieves a list of all trains.
	 *
	 * @return ResponseEntity containing the list of all trains.
	 */
	@GetMapping("/list")
	public ResponseEntity<?> getAllTrains() {
		List<Train> trains = trainService.getAllTrains();
		return ResponseEntity.ok(trains);
	}

	/**
	 * Retrieves a specific train based on the train number.
	 *
	 * @param trainNo The train number.
	 * @return ResponseEntity containing the requested train.
	 * @throws ApiTrainNotFoundException If the requested train is not found.
	 */
	@GetMapping("/{trainNo}")
	public ResponseEntity<?> getTrainByNumber(
			@PathVariable Long trainNo) throws TrainNotFoundException {
		
		Train train = trainService.getTrainByNumber(trainNo);
		return ResponseEntity.ok(train);
	}

	/**
	 * Retrieves a list of trains between the specified source and destination
	 * stations.
	 *
	 * @param fromStation The source station.
	 * @param toStation   The destination station.
	 * @return ResponseEntity containing the list of trains between the specified
	 *         stations.
	 */
	@GetMapping("/between/{source}/{destination}")
	public ResponseEntity<?> getTrainsBetweenStations(
			@PathVariable("source") String fromStation,
			@PathVariable("destination") String toStation) {
		
		List<Train> trains = trainService.getTrainsBetweenStations(fromStation, toStation);
		return ResponseEntity.ok(trains);
	}
}
