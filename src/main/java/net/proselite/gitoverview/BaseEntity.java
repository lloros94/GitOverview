package net.proselite.gitoverview;

public class BaseEntity {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public boolean isNew() {
        return (this.id == null);
    }
}
