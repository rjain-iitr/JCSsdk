

public interface JCSCompute {
	
	void setEndpoint(String endpoint);
	
	CreateVolumeResult createVolume(CreateVolumeRequest createVolumeRequest) throws Exception;
	
	
}
