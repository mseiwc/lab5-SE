package th.ac.ku.menu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.menu.model.Menu;
import th.ac.ku.menu.repository.MenuRepository;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    // select all
    public List<Menu> getAll() {
        return menuRepository.findAll(); // --> ฟังก์ชัน .findAll() มากับ jpa
    }

    // insert
    public Menu create(Menu menu) {
        Menu record = menuRepository.save(menu); // object
        return record;
    }
}

