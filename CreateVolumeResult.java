import java.io.Serializable;

public class CreateVolumeResult extends JCSResult implements Serializable, Cloneable {

   
    private Volume volume;

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    
    public Volume getVolume() {
        return this.volume;
    }

    
    public CreateVolumeResult withVolume(Volume volume) {
        setVolume(volume);
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

        if (obj instanceof CreateVolumeResult == false)
            return false;
        CreateVolumeResult other = (CreateVolumeResult) obj;
        if (other.getVolume() == null ^ this.getVolume() == null)
            return false;
        if (other.getVolume() != null
                && other.getVolume().equals(this.getVolume()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolume() == null) ? 0 : getVolume().hashCode());
        return hashCode;
    }

    @Override
    public CreateVolumeResult clone() {
        try {
            return (CreateVolumeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}