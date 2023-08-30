package com.example.demo.Controller;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Child;
import com.example.demo.Service.ChildService;

@RestController
public class ChildController {
    @Autowired
	ChildService bs;
	@PostMapping("addbaby")
	public List<Child> add(@RequestBody List<Child> ss)
	{
		return bs.saveinfo(ss);
	}
	@GetMapping("showbaby")
	public List<Child> show()
	{
		return bs.showinfo();
	} 
	@GetMapping("show/{id}")
	public Optional<Child> showparent(@PathVariable int id)
    {
		return bs.getbyid(id);
	}
	@GetMapping("sort/{fname}")
	public List<Child> getsortinfo(@PathVariable String fname)
	{
		return bs.sortinfo(fname);
	}
	@GetMapping("paging/{pageno}/{pagesize}")
	public List<Child> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
		return bs.getbypage(pageno, pagesize);
	}
}