import java.io.Serializable;


public class CreateVolumeRequest extends JCSRequest implements Serializable, Cloneable{

    
    private Integer size;
    
    private String snapshotId;
    
    public CreateVolumeRequest() {
    }

    
    public CreateVolumeRequest(Integer size) {
        setSize(size);
    }

    
    public CreateVolumeRequest(String snapshotId) {
        setSnapshotId(snapshotId);
    }


    public void setSize(Integer size) {
        this.size = size;
    }

    
    public Integer getSize() {
        return this.size;
    }

    

    public CreateVolumeRequest withSize(Integer size) {
        setSize(size);
        return this;
    }

    
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    

    public String getSnapshotId() {
        return this.snapshotId;
    }

    
    public CreateVolumeRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSize() != null)
            sb.append("Size: " + getSize() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVolumeRequest == false)
            return false;
        CreateVolumeRequest other = (CreateVolumeRequest) obj;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null
                && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }

}   