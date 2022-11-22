package Administracion.usuarios.seguridad.Repositorios;

import Administracion.usuarios.seguridad.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
}
