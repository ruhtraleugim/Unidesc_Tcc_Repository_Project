package br.com.unidesc_tccrepositories.unidesc.Repositories;
//#region imports
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import br.com.unidesc_tccrepositories.unidesc.model.TccModel;
//#endregion
@Repository
public class TccRepository {
    private List<TccModel> tccs = new ArrayList<TccModel>();
    private Integer lastId = 0;
    /**
     * 
     * @return lista tccs para a TccModel 
     */
    public List <TccModel> getAll(){
        return tccs;
    }
    public Optional<TccModel> getById(Integer id ){
        return tccs
            .stream()
            .filter(tcc -> tcc.getId() == id )
            .findFirst();
    }
    public TccModel adicionarTcc (TccModel tcc){
        lastId++;
        tcc.setId(lastId);
        tccs.add(tcc);
        return tcc ;
    }
    public void deleteTcc (Integer id){
        tccs.removeIf(tcc -> tcc.getId() == id);
    }
    public TccModel atualizarTcc(TccModel tcc){
        Optional<TccModel> TccFinded = getById(tcc.getId());
            if (TccFinded.isEmpty()){
                throw new InputMismatchException("404");
        }
            else{
                deleteTcc(tcc.getId());
                tccs.add(tcc);
        }
            return tcc;
        
    }
}
