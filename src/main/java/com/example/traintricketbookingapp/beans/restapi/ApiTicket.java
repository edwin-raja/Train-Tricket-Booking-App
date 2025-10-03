package com.example.traintricketbookingapp.beans.restapi;

import com.example.traintricketbookingapp.beans.Train;
import com.example.traintricketbookingapp.constants.TicketStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "api_ticket")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiTicket {
	/**
	 * The unique identifier for the ticket.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "apiUserTicketIdGenerator")
	@GenericGenerator(name = "apiUserTicketIdGenerator", strategy = "com.example.traintricketbookingapp.util.ApiUserTicketIdGenerator")
	@Column(name = "ticket_id")
	private String ticketId;

	/**
	 * The transaction ID associated with the ticket.
	 */
	@Column(name = "transaction_id")
	private String transactionId;

	/**
	 * The status of the ticket.
	 */
	@Column(name = "ticket_status")
	@Enumerated(EnumType.STRING)
	private TicketStatus ticketStatus;

	/**
	 * The date of the journey.
	 */
	@Column(name = "journey_date")
	private LocalDate journeyDate;

	/**
	 * The number of seats required for the ticket.
	 */
	@Column(name = "seats_required")
	private Integer seatsRequired;

	/**
	 * The type of seat for the ticket.
	 */
	@Column(name = "seat_type")
	private String seatType;

	/**
	 * The amount of the ticket.
	 */
	@Column(name = "amount")
	private Double ticketAmount;

	/**
	 * The train associated with the ticket.
	 * 
	 * This is a many-to-one relationship where a ticket can be associated with a
	 * single train.
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
	@JoinColumn(name = "trainNo")
	private Train train;

}
