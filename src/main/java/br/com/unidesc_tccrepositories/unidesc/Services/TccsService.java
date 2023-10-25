package br.com.unidesc_tccrepositories.unidesc.Services;
//#region imports

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.unidesc_tccrepositories.unidesc.model.TccModel;
import br.com.unidesc_tccrepositories.unidesc.Repositories.TccRepository;
//#endregion

@Service
public class TccsService {
    @Autowired
    private TccRepository tccRepository;
    public List<TccModel> getAll(){
        return tccRepository.getAll();
    }
    public Optional<TccModel> getByID(Integer id){
        return tccRepository.getById(id);
    }
    public TccModel adicionarTcc(TccModel tcc){
        return tccRepository.adicionarTcc(tcc);
    }
    public void deleteTcc(Integer id ){
        tccRepository.deleteTcc(id);
    }
    public TccModel atualizarTcc(Integer id ,TccModel tcc){
        tcc.setId(id);
        return tccRepository.adicionarTcc(tcc);
    }


    
}
