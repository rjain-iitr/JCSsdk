import java.io.Serializable;


public class CreateVolumeRequest extends JCSRequest implements Serializable, Cloneable{

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * <p>
     * Constraints: 1-16384 for <code>gp2</code>, 4-16384 for <code>io1</code>,
     * 500-16384 for <code>st1</code>, 500-16384 for <code>sc1</code>, and
     * 1-1024 for <code>standard</code>. If you specify a snapshot, the volume
     * size must be equal to or larger than the snapshot size.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The snapshot from which to create the volume.
     * </p>
     */
    private String snapshotId;
    
    public CreateVolumeRequest() {
    }

    
    public CreateVolumeRequest(Integer size) {
        setSize(size);
    }

    /**
     * Constructs a new CreateVolumeRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param snapshotId
     *        The snapshot from which to create the volume.
     * @param availabilityZone
     *        The Availability Zone in which to create the volume. Use
     *        <a>DescribeAvailabilityZones</a> to list the Availability Zones
     *        that are currently available to you.
     */
    public CreateVolumeRequest(String snapshotId) {
        setSnapshotId(snapshotId);
        //setAvailabilityZone(availabilityZone);
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