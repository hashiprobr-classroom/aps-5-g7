package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AgendaTest {
    private Agenda agenda;

    @BeforeEach
    void setUp(){
        agenda = new Agenda();
    }

    private Evento eventoFalso(boolean valido) {
        Evento evento = mock(Evento.class);
        when(evento.valido()).thenReturn(valido);
        return evento;
    }

    @Test
    void constroi(){
        assertTrue(agenda.getEventos().isEmpty());
    }

    @Test
    void adicionaValido(){
        agenda.adiciona(eventoFalso(true));
        assertEquals(1, agenda.getEventos().size());
    }

    @Test
    void adicionaInvalido() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            agenda.adiciona(eventoFalso(false));
        });

        assertEquals("Evento inválido!", exception.getMessage());
    }
}
