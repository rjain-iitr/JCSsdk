
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DescribeVolumesRequest extends JCSRequest implements
        Serializable, Cloneable{

    private List<String> volumeIds;
 
    private String nextToken;
 
    private Integer maxResults;

    public DescribeVolumesRequest() {
    }

    public DescribeVolumesRequest(List<String> volumeIds) {
        setVolumeIds(volumeIds);
    }

    public List<String> getVolumeIds() {
        if (volumeIds == null) {
            volumeIds = new ArrayList<String>();
        }
        return volumeIds;
    }

    public void setVolumeIds(Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
            return;
        }

        this.volumeIds = new ArrayList<String>(
                volumeIds);
    }

  public DescribeVolumesRequest withVolumeIds(String... volumeIds) {
        if (this.volumeIds == null) {
            setVolumeIds(new ArrayList<String>(
                    volumeIds.length));
        }
        for (String ele : volumeIds) {
            this.volumeIds.add(ele);
        }
        return this;
    }

    public DescribeVolumesRequest withVolumeIds(Collection<String> volumeIds) {
        setVolumeIds(volumeIds);
        return this;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVolumesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }
    
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }
    
    public DescribeVolumesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVolumeIds() != null)
            sb.append("VolumeIds: " + getVolumeIds() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVolumesRequest == false)
            return false;
        DescribeVolumesRequest other = (DescribeVolumesRequest) obj;
        if (other.getVolumeIds() == null ^ this.getVolumeIds() == null)
            return false;
        if (other.getVolumeIds() != null
                && other.getVolumeIds().equals(this.getVolumeIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolumeIds() == null) ? 0 : getVolumeIds().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVolumesRequest clone() throws CloneNotSupportedException {
        return (DescribeVolumesRequest) super.clone();
    }
}