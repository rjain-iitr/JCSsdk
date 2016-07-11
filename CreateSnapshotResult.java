import java.io.Serializable;


public class CreateSnapshotResult extends JCSResult implements Serializable, Cloneable {

    
    private Snapshot snapshot;

    public CreateSnapshotResult(){
    	
    }
    

    public void setSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    

    public Snapshot getSnapshot() {
        return this.snapshot;
    }

    

    public CreateSnapshotResult withSnapshot(Snapshot snapshot) {
        setSnapshot(snapshot);
        return this;
    }

    
    @Override
    public String toString() {
    	return this.getXml();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotResult == false)
            return false;
        CreateSnapshotResult other = (CreateSnapshotResult) obj;
        if (other.getSnapshot() == null ^ this.getSnapshot() == null)
            return false;
        if (other.getSnapshot() != null
                && other.getSnapshot().equals(this.getSnapshot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSnapshot() == null) ? 0 : getSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public CreateSnapshotResult clone() {
        try {
            return (CreateSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}