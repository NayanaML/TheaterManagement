package in.nayana.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import in.nayana.Entity.Theater;
import in.nayana.Service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@org.springframework.stereotype.Controller 

@RequestMapping("/theater")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/")
    public String listTheater(Model model) {
        model.addAttribute("theater", service.getAllTheater());
        return "home";
    }

    @GetMapping("/new")
    public String loadNewForm(Model model) {
        model.addAttribute("theater", new Theater());
        return "edit";
    }

    @PostMapping("/save")
    public String saveTheater(@ModelAttribute Theater theater) {
        service.saveTheater(theater);
        return "home";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable int id, Model model) {
        model.addAttribute("theater", service.getTheaterById(id));
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String deleteTheater(@PathVariable int id) {
        service.deleteTheater(id);
        return "home";
    }
    
    
}
