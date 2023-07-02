package org.jortiz.springcloud.msvc.cursos.repository;

import org.jortiz.springcloud.msvc.cursos.models.entity.Curso;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface CursoRepository extends CrudRepository<Curso, Long> {

    @Modifying
    @Query("delete from CursoUsuario cu where cu.usuarioId =?1")
    void eliminarCursoUsuarioPorID(Long id);
}
