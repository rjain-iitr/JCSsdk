import java.io.Serializable;

/**
 * A simple result wrapper around the Volume object that was sent over the wire.
 */
public class CreateSnapshotResult extends JCSResult implements Serializable, Cloneable {

    /**
     * <p>
     * Describes a volume.
     * </p>
     */
    private Snapshot snapshot;

    /**
     * <p>
     * Describes a volume.
     * </p>
     * 
     * @param volume
     *        Describes a volume.
     */

    public void setSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    /**
     * <p>
     * Describes a volume.
     * </p>
     * 
     * @return Describes a volume.
     */

    public Snapshot getSnapshot() {
        return this.snapshot;
    }

    /**
     * <p>
     * Describes a volume.
     * </p>
     * 
     * @param volume
     *        Describes a volume.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateSnapshotResult withSnapshot(Snapshot snapshot) {
        setSnapshot(snapshot);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("{");
//        if (getVolume() != null)
//            sb.append("Volume: " + getVolume());
//        sb.append("}");
//        return sb.toString();
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