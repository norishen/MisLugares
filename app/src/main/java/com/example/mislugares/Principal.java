package com.example.mislugares;

import java.lang.String;import java.lang.System; /**
 * Created by jcc314 on 11/11/15.
 */
class Principal {
    public static void main(String[] main) {
        Lugar lugar = new Lugar("Escuela Politécnica Superior de Gandía",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38.995656,
                962849300, "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 3);

        System.out.println("Lugar " + lugar.toString());
    }
}
