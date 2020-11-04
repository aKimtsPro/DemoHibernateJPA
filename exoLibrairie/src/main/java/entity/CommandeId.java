package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CommandeId implements Serializable {

    private static final long serialVerionUID = 1L;

    @Column(name = "edition_id")
    private int editionid;

    @Column(name = "librairie_id")
    private int librairieid;

    public CommandeId() {
    }

    public int getEditionid() {
        return editionid;
    }

    public void setEditionid(int editionid) {
        this.editionid = editionid;
    }

    public int getLibrairieid() {
        return librairieid;
    }

    public void setLibrairieid(int librairieid) {
        this.librairieid = librairieid;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
