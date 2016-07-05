/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 * Contains the parameters for DescribeVolumes.
 * </p>
 */
public class DescribeSnapshotsRequest extends JCSRequest implements
        Serializable, Cloneable{

    /**
     * <p>
     * One or more volume IDs.
     * </p>
     */
    private List<String> snapshotIds;
    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter is
     * used, <code>DescribeVolumes</code> only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results. You cannot specify this
     * parameter and the volume IDs parameter in the same request.
     * </p>
     */
    private Integer maxResults;

    /**
     * Default constructor for DescribeVolumesRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize the object
     * after creating it.
     */
    public DescribeSnapshotsRequest() {
    }

    /**
     * Constructs a new DescribeVolumesRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param volumeIds
     *        One or more volume IDs.
     */
    public DescribeSnapshotsRequest(List<String> snapshotsIds) {
        setSnapshotIds(snapshotIds);
    }

    /**
     * <p>
     * One or more volume IDs.
     * </p>
     * 
     * @return One or more volume IDs.
     */

    public List<String> getSnapshotIds() {
        if (snapshotIds == null) {
            snapshotIds = new ArrayList<String>();
        }
        return snapshotIds;
    }

    /**
     * <p>
     * One or more volume IDs.
     * </p>
     * 
     * @param volumeIds
     *        One or more volume IDs.
     */

    public void setSnapshotIds(Collection<String> snapshotIds) {
        if (snapshotIds == null) {
            this.snapshotIds = null;
            return;
        }

        this.snapshotIds = new ArrayList<String>(
        		snapshotIds);
    }

    /**
     * <p>
     * One or more volume IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVolumeIds(java.util.Collection)} or
     * {@link #withVolumeIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param volumeIds
     *        One or more volume IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSnapshotsRequest withSnapshotIds(String... snapshotIds) {
        if (this.snapshotIds == null) {
            setSnapshotIds(new ArrayList<String>(
            		snapshotIds.length));
        }
        for (String ele : snapshotIds) {
            this.snapshotIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more volume IDs.
     * </p>
     * 
     * @param volumeIds
     *        One or more volume IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSnapshotsRequest withSnapshotIds(Collection<String> snapshotIds) {
        setSnapshotIds(snapshotIds);
        return this;
    }
    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous
     *        paginated <code>DescribeVolumes</code> request where
     *        <code>MaxResults</code> was used and the results exceeded the
     *        value of that parameter. Pagination continues from the end of the
     *        previous results that returned the <code>NextToken</code> value.
     *        This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value returned from a previous
     *         paginated <code>DescribeVolumes</code> request where
     *         <code>MaxResults</code> was used and the results exceeded the
     *         value of that parameter. Pagination continues from the end of the
     *         previous results that returned the <code>NextToken</code> value.
     *         This value is <code>null</code> when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous
     *        paginated <code>DescribeVolumes</code> request where
     *        <code>MaxResults</code> was used and the results exceeded the
     *        value of that parameter. Pagination continues from the end of the
     *        previous results that returned the <code>NextToken</code> value.
     *        This value is <code>null</code> when there are no more results to
     *        return.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSnapshotsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter is
     * used, <code>DescribeVolumes</code> only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results. You cannot specify this
     * parameter and the volume IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of volume results returned by
     *        <code>DescribeVolumes</code> in paginated output. When this
     *        parameter is used, <code>DescribeVolumes</code> only returns
     *        <code>MaxResults</code> results in a single page along with a
     *        <code>NextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another
     *        <code>DescribeVolumes</code> request with the returned
     *        <code>NextToken</code> value. This value can be between 5 and
     *        1000; if <code>MaxResults</code> is given a value larger than
     *        1000, only 1000 results are returned. If this parameter is not
     *        used, then <code>DescribeVolumes</code> returns all results. You
     *        cannot specify this parameter and the volume IDs parameter in the
     *        same request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter is
     * used, <code>DescribeVolumes</code> only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results. You cannot specify this
     * parameter and the volume IDs parameter in the same request.
     * </p>
     * 
     * @return The maximum number of volume results returned by
     *         <code>DescribeVolumes</code> in paginated output. When this
     *         parameter is used, <code>DescribeVolumes</code> only returns
     *         <code>MaxResults</code> results in a single page along with a
     *         <code>NextToken</code> response element. The remaining results of
     *         the initial request can be seen by sending another
     *         <code>DescribeVolumes</code> request with the returned
     *         <code>NextToken</code> value. This value can be between 5 and
     *         1000; if <code>MaxResults</code> is given a value larger than
     *         1000, only 1000 results are returned. If this parameter is not
     *         used, then <code>DescribeVolumes</code> returns all results. You
     *         cannot specify this parameter and the volume IDs parameter in the
     *         same request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter is
     * used, <code>DescribeVolumes</code> only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results. You cannot specify this
     * parameter and the volume IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of volume results returned by
     *        <code>DescribeVolumes</code> in paginated output. When this
     *        parameter is used, <code>DescribeVolumes</code> only returns
     *        <code>MaxResults</code> results in a single page along with a
     *        <code>NextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another
     *        <code>DescribeVolumes</code> request with the returned
     *        <code>NextToken</code> value. This value can be between 5 and
     *        1000; if <code>MaxResults</code> is given a value larger than
     *        1000, only 1000 results are returned. If this parameter is not
     *        used, then <code>DescribeVolumes</code> returns all results. You
     *        cannot specify this parameter and the volume IDs parameter in the
     *        same request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSnapshotsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSnapshotIds() != null)
            sb.append("SnapshotIds: " + getSnapshotIds() + ",");
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

        if (obj instanceof DescribeSnapshotsRequest == false)
            return false;
        DescribeSnapshotsRequest other = (DescribeSnapshotsRequest) obj;
        if (other.getSnapshotIds() == null ^ this.getSnapshotIds() == null)
            return false;
        if (other.getSnapshotIds() != null
                && other.getSnapshotIds().equals(this.getSnapshotIds()) == false)
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
                + ((getSnapshotIds() == null) ? 0 : getSnapshotIds().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotsRequest clone() throws CloneNotSupportedException {
        return (DescribeSnapshotsRequest) super.clone();
    }
}