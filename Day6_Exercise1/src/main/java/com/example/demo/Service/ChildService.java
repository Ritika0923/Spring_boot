package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Child;
import com.example.demo.Repository.ChildRepo;

@Service
public class ChildService {

	@Autowired
    ChildRepo br;
	
	public List<Child> saveinfo(List<Child> ss)
	{
		return (List<Child>)br.saveAll(ss);
	}
	public List<Child> showinfo()
	{
		return br.findAll();
	}
	public Child changeinfo(Child ss)
	{
		return br.saveAndFlush(ss);
	}
	public void delete(Child ss)
	{
		br.delete(ss);
	}
	public Optional<Child> getbyid(int id)
	{
		return br.findById(id);
	}
	public List<Child> sortinfo(String s)
	{
		return br.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	public List<Child> getbypage(int pgno,int pgsize)
	{
		Page<Child> p=br.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
}