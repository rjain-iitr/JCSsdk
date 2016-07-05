

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeVolumes.
 * </p>
 */
public class DescribeSnapshotsResult extends JCSResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the volumes.
     * </p>
     */
    private List<Snapshot> snapshots;
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

    public List<Snapshot> getSnapshots() {
        if (snapshots == null) {
        	snapshots = new ArrayList<Snapshot>();
        }
        return snapshots;
    }

    /**
     * <p>
     * Information about the volumes.
     * </p>
     * 
     * @param volumes
     *        Information about the volumes.
     */

    public void setSnapshots(Collection<Snapshot> snapshots) {
        if (snapshots == null) {
            this.snapshots = null;
            return;
        }

        this.snapshots = new ArrayList<Snapshot>(
        		snapshots);
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

    public DescribeSnapshotsResult withSnapshots(Snapshot... snapshots) {
        if (this.snapshots == null) {
            setSnapshots(new ArrayList<Snapshot>(
                    snapshots.length));
        }
        for (Snapshot ele : snapshots) {
            this.snapshots.add(ele);
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

    public DescribeSnapshotsResult withSnapshots(
            Collection<Snapshot> snapshots) {
        setSnapshots(snapshots);
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

    public DescribeSnapshotsResult withNextToken(String nextToken) {
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

        if (obj instanceof DescribeSnapshotsResult == false)
            return false;
        DescribeSnapshotsResult other = (DescribeSnapshotsResult) obj;
        if (other.getSnapshots() == null ^ this.getSnapshots() == null)
            return false;
        if (other.getSnapshots() != null
                && other.getSnapshots().equals(this.getSnapshots()) == false)
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
                + ((getSnapshots() == null) ? 0 : getSnapshots().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotsResult clone() {
        try {
            return (DescribeSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}