import com.example.demo.models.Telefono;
import com.example.demo.repository.TelefonoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
public class TelefonoServicio {

    @Autowired
    private TelefonoRepositorio telefonoRepositorio;

    public List<Telefono> listarTelefonos() {
        return telefonoRepositorio.findAll();
    }

    public Telefono buscarTelefono(Long id) {
        return telefonoRepositorio.findById(id).orElse(null);
    }

    public Telefono guardarTelefono(Telefono telefono) {
        return telefonoRepositorio.save(telefono);
    }

    public void eliminarTelefono(Long id) {
        telefonoRepositorio.deleteById(id);
    }
    
}