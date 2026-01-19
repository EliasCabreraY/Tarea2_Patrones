package ports;

import common.EventoFuncion;

public interface SujetoFuncion {
    void suscribir(ObservadorFuncion observador);
    void desuscribir(ObservadorFuncion observador);
    void avisar(EventoFuncion evento);
}