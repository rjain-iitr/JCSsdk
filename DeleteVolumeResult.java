
import java.io.Serializable;

public class DeleteVolumeResult extends JCSResult implements Serializable, Cloneable {

    @Override
    public String toString() {
    	return this.getXml();
    }

    @Override
    public DeleteVolumeResult clone() {
        try {
            return (DeleteVolumeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}