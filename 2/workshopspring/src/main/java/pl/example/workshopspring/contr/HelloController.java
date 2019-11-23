package pl.example.workshopspring.contr;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // nie obsluguja zadan htpp
/*Controller jest komponentem @Component
* Model(paczka danych, np. name itd.) generalnie backend
* Controller np.getHello
* View(HTML, generalnie frontend)mozemy zwrocic za pomoca viewResolver
*
* */
public class HelloController {
    @GetMapping(value = "/Hello") //pobieramy dane,
    public String getHello(@RequestParam String name, Model model){
        model.addAttribute() // todo
        return "Hello"; //bedzie szuka plikow ktora maja "Hello" i rozszerzenie HTML
    }
}
