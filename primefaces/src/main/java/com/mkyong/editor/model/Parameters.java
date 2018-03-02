package com.mkyong.editor.model;

public class Parameters implements java.io.Serializable {

	private static final long serialVersionUID = -3239123096300758987L;
	private short id;
	private short engineDelay;
	private short engineDuration;
	private boolean mailSmtpAuth;
	private boolean mailSmtpStarttls;
	private String mailSmtpHost;
	private short mailSmtpPort;
	private String mailUsername;
	private String mailPassword;
	private String mailSubject;
	private String mailBody;
	private short levels;
	private Boolean engineStart;
	
	private String  connectionURL;
	private String  connectionUsername;
	private String  connectionPassword;
	
	private boolean connectionActivated; 
	private String connectionActivatedToken;

	private String cefEmailName;
	private String cefEmailPwd;
	
	public Parameters() {
	}

	public Parameters(short id, short engineDelay, short engineDuration, boolean mailSmtpAuth, boolean mailSmtpStarttls,
			String mailSmtpHost, short mailSmtpPort, String mailUsername, String mailPassword, String mailSubject,
			String mailBody, String connectionURL, String connectionUsername, String connectionPassword, boolean connectionActivated,
			String  connectionActivatedToken, String cefEmailName, String cefEmailPwd) {
		this.id = id;
		this.engineDelay = engineDelay;
		this.engineDuration = engineDuration;
		this.mailSmtpAuth = mailSmtpAuth;
		this.mailSmtpStarttls = mailSmtpStarttls;
		this.mailSmtpHost = mailSmtpHost;
		this.mailSmtpPort = mailSmtpPort;
		this.mailUsername = mailUsername;
		this.mailPassword = mailPassword;
		this.mailSubject = mailSubject;
		this.mailBody = mailBody;
		this.connectionURL = connectionURL;
		this.connectionUsername = connectionUsername;
		this.connectionPassword = connectionPassword;
		this.connectionActivated = connectionActivated;
		this.connectionActivatedToken = connectionActivatedToken;
		this.cefEmailName = cefEmailName;
		this.cefEmailPwd = cefEmailPwd;
	}


	public short getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Parameters [id=" + id + ", engineDelay=" + engineDelay + ", engineDuration=" + engineDuration
				+ ", mailSmtpAuth=" + mailSmtpAuth + ", mailSmtpStarttls=" + mailSmtpStarttls + ", mailSmtpHost="
				+ mailSmtpHost + ", mailSmtpPort=" + mailSmtpPort + ", mailUsername=" + mailUsername + ", mailPassword="
				+ mailPassword + ", mailSubject=" + mailSubject + ", mailBody=" + mailBody + ", levels=" + levels
				+ ", engineStart=" + engineStart + ", connectionURL=" + connectionURL + ", connectionUsername="
				+ connectionUsername + ", connectionPassword=" + connectionPassword + ", connectionActivated="
				+ connectionActivated + ", connectionActivateToken=" + connectionActivatedToken 
				+ ", cefEmailName=" + cefEmailName + ", cefEmailPwd=" + cefEmailPwd
				+ "]";
	}

	public void setId(short id) {
		this.id = id;
	}

	public short getEngineDelay() {
		return this.engineDelay;
	}

	public void setEngineDelay(short engineDelay) {
		this.engineDelay = engineDelay;
	}

	public short getEngineDuration() {
		return this.engineDuration;
	}

	public void setEngineDuration(short engineDuration) {
		this.engineDuration = engineDuration;
	}

	public boolean isMailSmtpAuth() {
		return this.mailSmtpAuth;
	}

	public void setMailSmtpAuth(boolean mailSmtpAuth) {
		this.mailSmtpAuth = mailSmtpAuth;
	}

	public boolean isMailSmtpStarttls() {
		return this.mailSmtpStarttls;
	}

	public void setMailSmtpStarttls(boolean mailSmtpStarttls) {
		this.mailSmtpStarttls = mailSmtpStarttls;
	}

	public String getMailSmtpHost() {
		return this.mailSmtpHost;
	}

	public void setMailSmtpHost(String mailSmtpHost) {
		this.mailSmtpHost = mailSmtpHost;
	}

	public short getMailSmtpPort() {
		return this.mailSmtpPort;
	}

	public void setMailSmtpPort(short mailSmtpPort) {
		this.mailSmtpPort = mailSmtpPort;
	}

	public String getMailUsername() {
		return this.mailUsername;
	}

	public void setMailUsername(String mailUsername) {
		this.mailUsername = mailUsername;
	}

	public String getMailPassword() {
		return this.mailPassword;
	}

	public void setMailPassword(String mailPassword) {
		this.mailPassword = mailPassword;
	}

	public String getMailSubject() {
		return this.mailSubject;
	}

	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}

	public String getMailBody() {
		return this.mailBody;
	}

	public void setMailBody(String mailBody) {
		this.mailBody = mailBody;
	}

	public short getLevels() {
		return levels;
	}

	public void setLevels(short levels) {
		this.levels = levels;
	}

	public Boolean getEngineStart() {
		return engineStart;
	}

	public void setEngineStart(Boolean engineStart) {
		this.engineStart = engineStart;
	}
	
	public String getConnectionURL() {
		return this.connectionURL;
	}

	public void setConnectionURL(String connectionURL) {
		this.connectionURL = connectionURL;
	}
	
	public String getConnectionUsername() {
		return this.connectionUsername;
	}

	public void setConnectionUsername(String connectionUsername) {
		this.connectionUsername = connectionUsername;
	}

	public String getConnectionPassword() {
		return this.connectionPassword;
	}

	public void setConnectionPassword(String connectionPassword) {
		this.connectionPassword = connectionPassword;
	}
	
	public boolean getConnectionActivated() {
		return connectionActivated;
	}
	
	public void setConnectionActivated(boolean connectionActivated) {
		this.connectionActivated = connectionActivated;
	}	
	
	public String getConnectionActivatedToken() {
		return connectionActivatedToken;
	}

	public void setConnectionActivatedToken(String connectionActivatedToken) {
		this.connectionActivatedToken = connectionActivatedToken;
	}

	public String getCefEmailName() {
		return cefEmailName;
	}

	public void setCefEmailName(String cefEmailName) {
		this.cefEmailName = cefEmailName;
	}

	public String getCefEmailPwd() {
		return cefEmailPwd;
	}

	public void setCefEmailPwd(String cefEmailPwd) {
		this.cefEmailPwd = cefEmailPwd;
	}
}
