

public interface JCSCompute {
	
	void setEndpoint(String endpoint);
	
	CreateVolumeResult createVolume(CreateVolumeRequest createVolumeRequest) throws Exception;
	
	DeleteVolumeResult deleteVolume(DeleteVolumeRequest deleteVolumeRequest) throws Exception;

	DescribeVolumesResult describeVolumes(
			DescribeVolumesRequest describeVolumesRequest) throws Exception;
	
	CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest) throws Exception;
	
	DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) throws Exception;
	
	DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest) throws Exception;
}
