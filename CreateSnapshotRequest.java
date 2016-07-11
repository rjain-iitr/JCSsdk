import java.io.Serializable;


public class CreateSnapshotRequest extends JCSRequest implements Serializable, Cloneable{

  
    private String volumeId;
    
    public CreateSnapshotRequest() {
    }

    public CreateSnapshotRequest(String volumeId) {
        setVolumeId(volumeId);
    }
  
    public void setVolumeId(String VolumeId) {
        this.volumeId = VolumeId;
    }

    

    public String getVolumeId() {
        return this.volumeId;
    }

    
    public CreateSnapshotRequest withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVolumeId() != null)
            sb.append("SnapshotId: " + getVolumeId() + ",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotRequest == false)
            return false;
        CreateSnapshotRequest other = (CreateSnapshotRequest) obj;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null
                && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        return true;
    }

}   