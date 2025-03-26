package main.java.br.com.dio.Barbearia.service;

import br.com.dio.Barbearia.entity.ClientEntity;

public interface IClientService {

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);

}
