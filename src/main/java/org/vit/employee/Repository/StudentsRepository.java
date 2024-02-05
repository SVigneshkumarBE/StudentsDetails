package org.vit.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vit.employee.model.StudentsModel;

public interface StudentsRepository extends JpaRepository<StudentsModel,Integer>{

}
