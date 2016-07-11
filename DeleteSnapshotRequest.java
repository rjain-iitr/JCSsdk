import java.io.Serializable;


public class DeleteSnapshotRequest extends JCSRequest implements
        Serializable, Cloneable{

    private String snapshotId;

    
    public DeleteSnapshotRequest() {
    }

    
    public DeleteSnapshotRequest(String snapshotId) {
        setSnapshotId(snapshotId);
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }


    public String getSnapshotId() {
        return this.snapshotId;
    }

    

    public DeleteSnapshotRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSnapshotRequest == false)
            return false;
        DeleteSnapshotRequest other = (DeleteSnapshotRequest) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }
}