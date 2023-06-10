package br.com.sgd.schedule.repository;

import br.com.sgd.schedule.model.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<ScheduleEntity, String> {
}
