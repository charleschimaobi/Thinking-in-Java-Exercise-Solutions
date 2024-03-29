// Exercise 24: (4) Add Null Objects to RegisteredFactories.java.

package Chapter14;
import typeinfo.factory.Factory;
import java.util.*;

class Part {
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Factory<? extends Part>> partFactories =
            new ArrayList<>();
    static {
        // Collections.addAll() gives an "unchecked generic
        // array creation ... for varargs parameter" warning.
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
        partFactories.add(new NullPart.Factory());
    }
    private static final Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}
class Filter extends Part {}

interface Null {}

class NullPart extends Part implements Null {
    private NullPart() { super(); }
    public static final Part NULL = new NullPart();
    public static class Factory implements typeinfo.factory.Factory<NullPart> {
        public NullPart create() {
            return (NullPart)NULL;
        }
    }
    public String toString() {
        return "NULL";
    }
}

class FuelFilter extends Filter {
    // Create a Class Factory for each specific type:
    public static class Factory
            implements typeinfo.factory.Factory<FuelFilter> {
        public FuelFilter create() { return new FuelFilter(); }
    }
}

class AirFilter extends Filter {
    public static class Factory
            implements typeinfo.factory.Factory<AirFilter> {
        public AirFilter create() { return new AirFilter(); }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory
            implements typeinfo.factory.Factory<CabinAirFilter> {
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter {
    public static class Factory
            implements typeinfo.factory.Factory<OilFilter> {
        public OilFilter create() { return new OilFilter(); }
    }
}

class Belt extends Part {}

class FanBelt extends Belt {
    public static class Factory
            implements typeinfo.factory.Factory<FanBelt> {
        public FanBelt create() { return new FanBelt(); }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory
            implements typeinfo.factory.Factory<GeneratorBelt> {
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory
            implements typeinfo.factory.Factory<PowerSteeringBelt> {
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
public class Ex24 {
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++)
            System.out.println(Part.createRandom());
    }
}
/* Output:
PowerSteeringBelt
OilFilter
FanBelt
FuelFilter
AirFilter
FanBelt
AirFilter
OilFilter
FanBelt
PowerSteeringBelt
CabinAirFilter
NULL
CabinAirFilter
FuelFilter
FuelFilter
FanBelt
GeneratorBelt
AirFilter
GeneratorBelt
FanBelt

Process finished with exit code 0

 */
