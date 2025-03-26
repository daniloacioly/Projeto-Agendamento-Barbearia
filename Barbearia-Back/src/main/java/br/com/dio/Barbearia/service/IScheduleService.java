package main.java.br.com.dio.Barbearia.service;

import br.com.dio.Barbearia.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}
