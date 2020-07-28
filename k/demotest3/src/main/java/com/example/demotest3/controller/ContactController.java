package com.example.demotest3.controller;

import com.example.demotest3.entity.Contact;
import com.example.demotest3.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @RequestMapping(value = { "/contact"}, method = RequestMethod.GET)
    public String contactPage(Model model) {
        model.addAttribute("contact",new Contact());
        return "/client/contactPage";
    }

    @RequestMapping("/contactAdmin")
    public String contactAdmin(Model model){
        List<Contact> contacts = (List<Contact>) contactRepository.findAll();
        model.addAttribute("contacts",contacts);
        return "/admin/contactAdmin";
    }
    //lưu contact
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(Contact contact){
        contactRepository.save(contact);
        return "redirect:/";
    }
    //xóa contact
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String deleteContact(@RequestParam("id") Long contactId, Model model){
        contactRepository.deleteById(contactId);
        return "redirect:/";
    }
}
