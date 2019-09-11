package me.adedoja.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/blog")
    public List<Category> index(){
        return categoryRepository.findAll();
    }
}
