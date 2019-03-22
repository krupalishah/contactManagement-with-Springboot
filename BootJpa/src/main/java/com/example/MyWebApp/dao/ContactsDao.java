package com.example.MyWebApp.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.MyWebApp.model.Contacts;

public interface ContactsDao extends JpaRepository<Contacts,Integer>,PagingAndSortingRepository<Contacts,Integer>
{
	Page<Contacts> findAll(Pageable pageable);

 List<Contacts> findAll(Sort sort);
}
