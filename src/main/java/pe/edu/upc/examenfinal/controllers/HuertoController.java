package pe.edu.upc.examenfinal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.examenfinal.dtos.CantHuertosXUserDTO;
import pe.edu.upc.examenfinal.dtos.TotalHectareasXuserDTO;
import pe.edu.upc.examenfinal.servicesinterfaces.IHuertoService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/zarate/huertos")
public class HuertoController {

    @Autowired
    private IHuertoService hS;

    @GetMapping("/cantidadHuertosxUser")
    public List<CantHuertosXUserDTO> cantidadHuertosXuser() {
        List<String[]> lista = hS.CantHuertosPorUsuario();
        List<CantHuertosXUserDTO> listaDTO = new ArrayList<>();
        for (String[] data : lista) {
            CantHuertosXUserDTO dto = new CantHuertosXUserDTO();
            dto.setFhzgNameUser(data[0]);
            dto.setFhzgCantidadXuser(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/TotalHectareaXuser")
    public List<TotalHectareasXuserDTO> TotalHectareasXuser() {
        List<String[]> lista = hS.TotalHectareaXuser();
        List<TotalHectareasXuserDTO> listaDTO = new ArrayList<>();
        for (String[] data : lista) {
            TotalHectareasXuserDTO dto = new TotalHectareasXuserDTO();
            dto.setFhzgNameUser(data[0]);
            dto.setFhzgTotalHectareasXuser(Double.parseDouble(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
