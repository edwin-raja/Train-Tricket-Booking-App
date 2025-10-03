package com.example.traintricketbookingapp.repository.mvc;

import com.example.traintricketbookingapp.beans.Ticket;
import com.example.traintricketbookingapp.beans.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * ITicketRepository interface.
 * 
 * This interface extends the PagingAndSortingRepository interface provided by
 * Spring Data. It allows performing CRUD ,Sorting,paging operations on the
 * Ticket entity.
 *
 */
public interface ITicketRepository extends PagingAndSortingRepository<Ticket, String> {
	/**
	 * Find all tickets booked by a user (Customer) and return as a list.
	 * 
	 * @param user the user object representing the customer.
	 * @return a List of tickets booked by the user.
	 */
	public List<Ticket> findByUser(User user);

}
