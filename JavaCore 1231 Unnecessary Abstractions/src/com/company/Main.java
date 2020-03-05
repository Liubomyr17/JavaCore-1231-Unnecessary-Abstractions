package com.company;

/*

1231 Unnecessary abstractions

Arrange the abstract keywords correctly for the program to compile.
Add where it is necessary and remove it is not necessary.
Requirements:
1. The Pegas class must implement the Fly interface.
2. The Pegas class must inherit from the Horse class.
3. The SwimPegas class must inherit from the Pegas class.
4. You can create a Horse class object.
5. You can create a Pegas class object.
6. The swim () method of the SwimPegas class should not be implemented.



 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Horse horse = new Pegas();
        horse.run();
    }

    public static interface Fly {
        public abstract void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegas extends Horse implements Fly {
        public void fly() {

        }
    }

    public static abstract class SwimPegas extends Pegas {
        public abstract void swim();
    }
}


