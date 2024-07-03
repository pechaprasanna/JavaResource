*Problem*: While multiple threads try to getInstance and if by chance create two instances?
To resolve this
- Make getInstance method as synchronized but performance issue. So use it when performance is not a problem 
- Eagerly create instance rather than a lazily created one
    ```java
    public class Singleton {
        private static Singleton uniqueInstance 
            = new Singleton();
        private Singleton() {}
        public static Singleton getInstance() {
            return uniqueInstance;
        } 
    }
    ```
- double-checked-locking: First check instance is created, then synchronize
    ```java
    public class Singleton {
        private volatile static Singleton uniqueInstance;
        public static ChocolateBoiler getInstance() {
            if(uniqueInstance == null) {
                synchronized (Singleton.class) {
                    if(uniqueInstance == null) {
                        uniqueInstance = new ChocolateBoiler();
                    }
                }
            }
            return uniqueInstance;
        }
    }   
    ```
