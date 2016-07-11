import java.io.Serializable;
import java.util.Date;

public class Volume implements Serializable, Cloneable {
	
    private String volumeId;

    private Integer size;

    private String snapshotId;

    private Date createTime;
    
    private String status;
    
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }


    public String getVolumeId() {
        return this.volumeId;
    }


    public Volume withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public Integer getSize() {
        return this.size;
    }

    

    public Volume withSize(Integer size) {
        setSize(size);
        return this;
    }

    

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    

    public String getSnapshotId() {
        return this.snapshotId;
    }

    

    public Volume withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    
    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    

    public Volume withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }
    
    public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	public Volume withStatus(String status) {
        setStatus(status);
        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
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

        if (obj instanceof Volume == false)
            return false;
        Volume other = (Volume) obj;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null
                && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode
                + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        
        return hashCode;
    }

    @Override
    public Volume clone() {
        try {
            return (Volume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

}