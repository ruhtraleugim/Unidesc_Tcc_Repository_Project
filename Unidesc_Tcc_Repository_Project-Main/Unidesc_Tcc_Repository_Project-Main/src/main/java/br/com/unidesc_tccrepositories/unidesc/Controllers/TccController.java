package br.com.unidesc_tccrepositories.unidesc.Controllers;

//#region Imports
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.unidesc_tccrepositories.unidesc.Services.TccsService;
import br.com.unidesc_tccrepositories.unidesc.model.TccModel;
//#endregion
@RestController
@RequestMapping("/api/Tcc")
public class TccController {
    @Autowired
    private TccsService tccService;
    @GetMapping
    public List<TccModel> getAll(){
        return tccService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<TccModel> getById(@PathVariable Integer id){
        return tccService.getByID(id);
    }
    @PostMapping
    public TccModel adicionarTcc(@RequestBody TccModel tcc){
        return tccService.adicionarTcc(tcc);
    }
     @DeleteMapping("/{id}")
    public void DeleteTcc(@PathVariable Integer id){
        tccService.deleteTcc(id);
    }
    @PutMapping("/{id}")
    public TccModel atualizarTcc(@RequestBody TccModel tcc,@PathVariable Integer id){
        return tccService.atualizarTcc(id, null);
    }
}
