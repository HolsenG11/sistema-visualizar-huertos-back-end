package pe.edu.upc.examenfinal.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.examenfinal.repositories.IHuertoRepository;
import pe.edu.upc.examenfinal.servicesinterfaces.IHuertoService;

import java.util.List;

@Service
public class HuertoServiceImplements implements IHuertoService {

    @Autowired
    private IHuertoRepository hR;

    @Override
    public List<String[]> CantHuertosPorUsuario() {
        return hR.CantHuertosPorUsuario();
    }

    @Override
    public List<String[]> TotalHectareaXuser() {
        return hR.TotalHectareaXuser();
    }
}
