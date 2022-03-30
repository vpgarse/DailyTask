package readingxml;

public class HEADER {
	String AckRef;
	String AckRequest;
	String Created;
	String CreatedBy;
	String Format;
	String GMTOffset;
	String SourceApp;
	String SourceID;
	String SourceVer;
	String UserName;
	String Version;
	String CorrelationIdentifier;
	
	public HEADER() {}
	public HEADER(String ackRef, String ackRequest, String created, String createdBy, String format, String gMTOffset,
			String sourceApp, String sourceID, String sourceVer, String userName, String version,
			String correlationIdentifier) {
		super();
		AckRef = ackRef;
		AckRequest = ackRequest;
		Created = created;
		CreatedBy = createdBy;
		Format = format;
		GMTOffset = gMTOffset;
		SourceApp = sourceApp;
		SourceID = sourceID;
		SourceVer = sourceVer;
		UserName = userName;
		Version = version;
		CorrelationIdentifier = correlationIdentifier;
	}
	public String getAckRef() {
		return AckRef;
	}
	public void setAckRef(String ackRef) {
		this.AckRef = ackRef;
	}
	public String getAckRequest() {
		return AckRequest;
	}
	public void setAckRequest(String ackRequest) {
		this.AckRequest = ackRequest;
	}
	public String getCreated() {
		return Created;
	}
	public void setCreated(String created) {
		this.Created = created;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		this.CreatedBy = createdBy;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		this.Format = format;
	}
	public String getGMTOffset() {
		return GMTOffset;
	}
	public void setGMTOffset(String gMTOffset) {
		this.GMTOffset = gMTOffset;
	}
	public String getSourceApp() {
		return SourceApp;
	}
	public void setSourceApp(String sourceApp) {
		this.SourceApp = sourceApp;
	}
	public String getSourceID() {
		return SourceID;
	}
	public void setSourceID(String sourceID) {
		this.SourceID = sourceID;
	}
	public String getSourceVer() {
		return SourceVer;
	}
	public void setSourceVer(String sourceVer) {
		this.SourceVer = sourceVer;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = userName;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		this.Version = version;
	}
	public String getCorrelationIdentifier() {
		return CorrelationIdentifier;
	}
	public void setCorrelationIdentifier(String correlationIdentifier) {
		this.CorrelationIdentifier = correlationIdentifier;
	}

}
