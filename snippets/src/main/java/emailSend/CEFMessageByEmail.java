package emailSend;

import org.codehaus.jackson.annotate.JsonProperty;

public class CEFMessageByEmail {

	@JsonProperty("alertId")
	private String alertId;
	
	@JsonProperty("cefHost")
	private String cefHost;
	
	@JsonProperty("cefVersion")
	private String cefVersion;
	
	@JsonProperty("cefDVendor")
	private String cefDVendor;
	
	@JsonProperty("cefDProduct")
	private String cefDProduct;
	
	@JsonProperty("cefDVersion")
	private String cefDVersion;
	
	@JsonProperty("cefName")
	private String cefName;
	
	@JsonProperty("cefSeverity")
	private String cefSeverity;
	
	@JsonProperty("cefExtension")
	private String cefExtension;

	public CEFMessageByEmail() {
		super();
	}

	public CEFMessageByEmail(String alertId, String cefHost, String cefVersion, String cefDVendor, String cefDProduct,
			String cefDVersion, String cefName, String cefSeverity, String cefExtension) {
		super();
		this.alertId = alertId;
		this.cefHost = cefHost;
		this.cefVersion = cefVersion;
		this.cefDVendor = cefDVendor;
		this.cefDProduct = cefDProduct;
		this.cefDVersion = cefDVersion;
		this.cefName = cefName;
		this.cefSeverity = cefSeverity;
		this.cefExtension = cefExtension;
	}

	public String getAlertId() {
		return alertId;
	}

	public void setAlertId(String alertId) {
		this.alertId = alertId;
	}

	public String getCefHost() {
		return cefHost;
	}

	public void setCefHost(String cefHost) {
		this.cefHost = cefHost;
	}

	public String getCefVersion() {
		return cefVersion;
	}

	public void setCefVersion(String cefVersion) {
		this.cefVersion = cefVersion;
	}

	public String getCefDVendor() {
		return cefDVendor;
	}

	public void setCefDVendor(String cefDVendor) {
		this.cefDVendor = cefDVendor;
	}

	public String getCefDProduct() {
		return cefDProduct;
	}

	public void setCefDProduct(String cefDProduct) {
		this.cefDProduct = cefDProduct;
	}

	public String getCefDVersion() {
		return cefDVersion;
	}

	public void setCefDVersion(String cefDVersion) {
		this.cefDVersion = cefDVersion;
	}

	public String getCefName() {
		return cefName;
	}

	public void setCefName(String cefName) {
		this.cefName = cefName;
	}

	public String getCefSeverity() {
		return cefSeverity;
	}

	public void setCefSeverity(String cefSeverity) {
		this.cefSeverity = cefSeverity;
	}

	public String getCefExtension() {
		return cefExtension;
	}

	public void setCefExtension(String cefExtension) {
		this.cefExtension = cefExtension;
	}
}
