package com.example.traintricketbookingapp.repository.restapi;

import com.example.traintricketbookingapp.beans.restapi.ApiTicket;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IApiTicketRespository extends PagingAndSortingRepository<ApiTicket, String> {

}
