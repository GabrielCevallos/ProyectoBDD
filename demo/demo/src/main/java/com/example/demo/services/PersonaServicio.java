import com.example.demo.models.Persona;
import com.example.demo.repository.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
public class PersonaServicio {

    @Autowired
    private PersonaRepositorio personaRepositorio;

    public List<Persona> listarPersonas() {
        return personaRepositorio.findAll();
    }

    public Persona buscarPersona(Long id) {
        return personaRepositorio.findById(id).orElse(null);
    }

    public Persona guardarPersona(Persona persona) {
        return personaRepositorio.save(persona);
    }

    public void eliminarPersona(Long id) {
        personaRepositorio.deleteById(id);
    }
    
}