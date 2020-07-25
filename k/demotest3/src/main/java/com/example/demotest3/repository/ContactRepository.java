package com.example.demotest3.repository;

import com.example.demotest3.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository <Contact, Long> {
}
