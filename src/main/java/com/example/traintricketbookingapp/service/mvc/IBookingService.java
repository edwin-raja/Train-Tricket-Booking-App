package com.example.traintricketbookingapp.service.mvc;

import com.example.traintricketbookingapp.beans.Ticket;
import com.example.traintricketbookingapp.beans.User;
import com.example.traintricketbookingapp.exception.mvc.booking.BookingFailedException;
import com.example.traintricketbookingapp.exception.mvc.booking.NoEnoughSeatsForBooking;
import com.example.traintricketbookingapp.exception.restapi.booking.ApiBookingFailedException;
import com.example.traintricketbookingapp.exception.restapi.booking.ApiNoEnoughSeatsForBooking;

import java.util.List;

/**
 * The IBookingService interface provides methods for booking tickets and
 * retrieving all tickets.
 *
 */
public interface IBookingService {

	/**
	 * Books a ticket based on the provided ticket details.
	 *
	 * @param ticket The Ticket object containing the details of the ticket to be
	 *               booked.
	 * @return The Ticket object representing the booked ticket.
	 * @throws ApiNoEnoughSeatsForBooking If there are not enough seats available on
	 *                                 the train for booking.
	 * @throws ApiBookingFailedException  If an error occurs while booking the ticket.
	 */
	public Ticket bookTicket(Ticket ticket) 
			throws NoEnoughSeatsForBooking, BookingFailedException;
	

	/**
	 * Retrieves a list of all tickets from the database.
	 *
	 * @return A list of Ticket objects representing all tickets in the system.
	 */
	public List<Ticket> getAllTickets();

	/**
	 * Retrieves all tickets booked by a specific user.
	 * 
	 * @param user the user object representing the customer.
	 * @return a List of tickets booked by the user.
	 */
	public List<Ticket> getTicketsByUser(User user);
}
