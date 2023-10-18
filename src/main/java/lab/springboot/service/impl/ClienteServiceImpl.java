package lab.springboot.service.impl;

import org.springframework.stereotype.Service;

import lab.springboot.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
    }

    @Override
    public void deletar(Long id) {
    }

}
