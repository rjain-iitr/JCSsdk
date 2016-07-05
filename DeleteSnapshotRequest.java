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


/**
 * <p>
 * Contains the parameters for DeleteVolume.
 * </p>
 */
public class DeleteSnapshotRequest extends JCSRequest implements
        Serializable, Cloneable{

    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String snapshotId;

    /**
     * Default constructor for DeleteVolumeRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize the object
     * after creating it.
     */
    public DeleteSnapshotRequest() {
    }

    /**
     * Constructs a new DeleteVolumeRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param volumeId
     *        The ID of the volume.
     */
    public DeleteSnapshotRequest(String snapshotId) {
        setSnapshotId(snapshotId);
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @return The ID of the volume.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteSnapshotRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSnapshotRequest == false)
            return false;
        DeleteSnapshotRequest other = (DeleteSnapshotRequest) obj;
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
                + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }
}