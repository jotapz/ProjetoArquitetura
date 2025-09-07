package entidades;

import interfaces.IBancoCredenciais;

import java.util.*;

public class BancoCredenciaisMemoria implements IBancoCredenciais {

    private final Map<String, List<Credenciais>> credenciaisPorEmail = new HashMap<>();

    @Override
    public List<Credenciais> buscarEmail(String email) {
        return credenciaisPorEmail.getOrDefault(email, new ArrayList<>());
    }

    @Override
    public void salvar(Credenciais credencial) {
        credenciaisPorEmail
                .computeIfAbsent(credencial.getEmail(), k -> new ArrayList<>())
                .add(credencial);
    }

    @Override
    public boolean existeEmail(String email) {
        return credenciaisPorEmail.containsKey(email);
    }
}