package sam.springFramework.model;

// This Java class is created as a common class for all models , which uses Spring JPA

import java.io.Serializable;

public class BaseEntity implements Serializable { // Base class - 0
    // private long id; primitve type is not used because the hibernate suggest to use BOX types - Long id
    // Box types can be null where that one cannot - Null Pointer Exception
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
