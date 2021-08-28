package src.codewars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecretFromRandomTripletsTest {

    SecretFromRandomTriplets secretFromRandomTriplets;

    @BeforeEach
    void setUp() {

        secretFromRandomTriplets = new SecretFromRandomTriplets();
    }

    @Test
    void secret1() {
        char[][] triplets = {
            {'t', 'u', 'p'},
            {'w', 'h', 'i'},
            {'t', 's', 'u'},
            {'a', 't', 's'},
            {'h', 'a', 'p'},
            {'t', 'i', 's'},
            {'w', 'h', 's'}
        };
        assertEquals("whatisup", secretFromRandomTriplets.recoverSecret(triplets));
    }
}

  /*Istnieje tajny ciąg znaków, którego nie znasz. Biorąc pod uwagę kolekcję losowych trójek z ciągu, odzyskaj oryginalny ciąg.
   Trójka jest tutaj zdefiniowana jako sekwencja trzech liter, tak że każda litera występuje gdzieś przed następną w danym ciągu.
    „whi” to trójka dla ciągu „whatisup”. Dla uproszczenia można założyć, że żadna litera nie występuje więcej niż raz w tajnym ciągu.
     Nie możesz zakładać niczego o otrzymanych trojaczkach poza tym, że są one prawidłowymi trojaczkami i zawierają wystarczającą ilość informacji do
     wydedukowania oryginalnego łańcucha.
   W szczególności oznacza to, że tajny ciąg nigdy nie będzie zawierał liter, które nie występują w jednej z otrzymanych trójek.*/
