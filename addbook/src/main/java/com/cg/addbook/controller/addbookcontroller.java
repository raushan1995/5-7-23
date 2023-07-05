package com.cg.addbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.addbook.model.AddBook;
import com.cg.addbook.repository.addbookrepository;
import com.cg.addbook.service.addbookservice;

@RestController
@RequestMapping("/api/employee")
public class addbookcontroller {
	
	@Autowired
    addbookrepository abr;
   private addbookservice abs;

    @GetMapping("/getAll")
    public List<AddBook> getAllAddBook(){
        List<AddBook> allAddBookList=abs.findAll();
        abs.findAll();
        return allAddBookList;
    }

    @GetMapping("/get-employee/{id}")
    public AddBook getAddBookByTitle(@PathVariable(value = "id") String title)
    {
        AddBook addbook = abs.findByTitle(addbook).get();

        return addbook;
    }

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        Employee savedEmployee = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update-employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Integer employeeId,
                                                   @RequestBody Employee employeeDetails) {
        Employee employee = employeeRepository.findById(employeeId).get();

        employee.setEmailId(employeeDetails.getEmailId());
        employee.setName(employeeDetails.getName());
        employee.setLocation(employeeDetails.getLocation());
        final Employee updatedEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/delete-employees/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Integer employeeId)
    {
        Employee employee = employeeRepository.findById(employeeId).get();

        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }


}
