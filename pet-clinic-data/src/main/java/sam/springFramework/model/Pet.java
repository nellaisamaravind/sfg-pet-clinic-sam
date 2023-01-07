package sam.springFramework.model;

import java.time.LocalDate;

public class Pet extends BaseEntity { /* Base Pet class - 1 */
    private PetType petType;
    private Owner owner;
    private LocalDate date; /* Java Class Java LocalDate class is an immutable class that
    represents Date with a default format of yyyy-mm-dd. It inherits Object class and implements
    the LocalDate interface*/
}
