/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class FactoryManager {

    private static FactoryManager instance = null;

    private FactoryManager() {
    }

    public static FactoryManager getInstance() {
        if (instance == null) {
            instance = new FactoryManager();
        }
        return instance;
    }
    private static int numTracks = 5;

    public static void startTracks() {
        for (int i = 0; i < numTracks; ++i) {
            Thread t = new Thread();
            t.start();
            System.out.println("" + t.getName());
        }
    }

    public static void main(String[] args) {
        FactoryManager fm = FactoryManager.getInstance();
        fm.startTracks();
    }
}
