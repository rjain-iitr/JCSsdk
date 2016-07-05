

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeVolumes.
 * </p>
 */
public class DescribeVolumesResult extends JCSResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the volumes.
     * </p>
     */
    private List<Volume> volumes;
    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeVolumes</code> request. When the results of a
     * <code>DescribeVolumes</code> request exceed <code>MaxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the volumes.
     * </p>
     * 
     * @return Information about the volumes.
     */

    public List<Volume> getVolumes() {
        if (volumes == null) {
            volumes = new ArrayList<Volume>();
        }
        return volumes;
    }

    /**
     * <p>
     * Information about the volumes.
     * </p>
     * 
     * @param volumes
     *        Information about the volumes.
     */

    public void setVolumes(Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new ArrayList<Volume>(
                volumes);
    }

    /**
     * <p>
     * Information about the volumes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVolumes(java.util.Collection)} or
     * {@link #withVolumes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param volumes
     *        Information about the volumes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVolumesResult withVolumes(Volume... volumes) {
        if (this.volumes == null) {
            setVolumes(new ArrayList<Volume>(
                    volumes.length));
        }
        for (Volume ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the volumes.
     * </p>
     * 
     * @param volumes
     *        Information about the volumes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVolumesResult withVolumes(
            Collection<Volume> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeVolumes</code> request. When the results of a
     * <code>DescribeVolumes</code> request exceed <code>MaxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value to include in a future
     *        <code>DescribeVolumes</code> request. When the results of a
     *        <code>DescribeVolumes</code> request exceed
     *        <code>MaxResults</code>, this value can be used to retrieve the
     *        next page of results. This value is <code>null</code> when there
     *        are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeVolumes</code> request. When the results of a
     * <code>DescribeVolumes</code> request exceed <code>MaxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value to include in a future
     *         <code>DescribeVolumes</code> request. When the results of a
     *         <code>DescribeVolumes</code> request exceed
     *         <code>MaxResults</code>, this value can be used to retrieve the
     *         next page of results. This value is <code>null</code> when there
     *         are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeVolumes</code> request. When the results of a
     * <code>DescribeVolumes</code> request exceed <code>MaxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value to include in a future
     *        <code>DescribeVolumes</code> request. When the results of a
     *        <code>DescribeVolumes</code> request exceed
     *        <code>MaxResults</code>, this value can be used to retrieve the
     *        next page of results. This value is <code>null</code> when there
     *        are no more results to return.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVolumesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
//        if (getVolumes() != null)
//            sb.append("Volumes: " + getVolumes() + ",");
//        if (getNextToken() != null)
//            sb.append("NextToken: " + getNextToken());
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

        if (obj instanceof DescribeVolumesResult == false)
            return false;
        DescribeVolumesResult other = (DescribeVolumesResult) obj;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null
                && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVolumesResult clone() {
        try {
            return (DescribeVolumesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}