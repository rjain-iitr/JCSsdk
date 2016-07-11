

import java.io.Serializable;

public class DeleteSnapshotResult extends JCSResult implements Serializable, Cloneable {

    @Override
    public String toString() {
    	return this.getXml();
    }

    @Override
    public DeleteSnapshotResult clone() {
        try {
            return (DeleteSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}