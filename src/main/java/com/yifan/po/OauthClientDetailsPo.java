package com.yifan.po;

import java.io.Serializable;

/**
 * oauth_client_details
 * 
 * @since 2018年11月2日
 * @version 1.0
 */
public class OauthClientDetailsPo implements Serializable {

	private static final long serialVersionUID = 1L;

	//column start
	/**
	 * clientId: client_id
	 */
	private String clientId;

	/**
	 * resourceIds: resource_ids
	 */
	private String resourceIds;

	/**
	 * clientSecret: client_secret
	 */
	private String clientSecret;

	/**
	 * scope: scope
	 */
	private String scope;

	/**
	 * authorizedGrantTypes: authorized_grant_types
	 */
	private String authorizedGrantTypes;

	/**
	 * webServerRedirectUri: web_server_redirect_uri
	 */
	private String webServerRedirectUri;

	/**
	 * authorities: authorities
	 */
	private String authorities;

	/**
	 * accessTokenValidity: access_token_validity
	 */
	private Integer accessTokenValidity;

	/**
	 * refreshTokenValidity: refresh_token_validity
	 */
	private Integer refreshTokenValidity;

	/**
	 * additionalInformation: additional_information
	 */
	private String additionalInformation;

	/**
	 * autoapprove: autoapprove
	 */
	private String autoapprove;

	// column end


	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String value) {
		this.clientId = value;
	}

	public String getResourceIds() {
		return this.resourceIds;
	}

	public void setResourceIds(String value) {
		this.resourceIds = value;
	}

	public String getClientSecret() {
		return this.clientSecret;
	}

	public void setClientSecret(String value) {
		this.clientSecret = value;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String value) {
		this.scope = value;
	}

	public String getAuthorizedGrantTypes() {
		return this.authorizedGrantTypes;
	}

	public void setAuthorizedGrantTypes(String value) {
		this.authorizedGrantTypes = value;
	}

	public String getWebServerRedirectUri() {
		return this.webServerRedirectUri;
	}

	public void setWebServerRedirectUri(String value) {
		this.webServerRedirectUri = value;
	}

	public String getAuthorities() {
		return this.authorities;
	}

	public void setAuthorities(String value) {
		this.authorities = value;
	}

	public Integer getAccessTokenValidity() {
		return this.accessTokenValidity;
	}

	public void setAccessTokenValidity(Integer value) {
		this.accessTokenValidity = value;
	}

	public Integer getRefreshTokenValidity() {
		return this.refreshTokenValidity;
	}

	public void setRefreshTokenValidity(Integer value) {
		this.refreshTokenValidity = value;
	}

	public String getAdditionalInformation() {
		return this.additionalInformation;
	}

	public void setAdditionalInformation(String value) {
		this.additionalInformation = value;
	}

	public String getAutoapprove() {
		return this.autoapprove;
	}

	public void setAutoapprove(String value) {
		this.autoapprove = value;
	}
	
}

