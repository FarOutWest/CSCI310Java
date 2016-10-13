/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import static kiss.API.outClose;
import static kiss.API.outExpect;
import static kiss.API.println;

/**
 *
 * @author West
 */
public class Collections {
    void testrun() {
        outExpect("Hello World!");
        run();
        outClose();
    }

    void run() {
        println("Hello World!");
    }
}
