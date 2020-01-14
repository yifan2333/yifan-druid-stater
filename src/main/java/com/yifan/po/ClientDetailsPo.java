package com.yifan.po;

import java.io.Serializable;

/**
 * client_details
 * 
 * @since 2018年11月2日
 * @version 1.0
 */
public class ClientDetailsPo implements Serializable {

	private static final long serialVersionUID = 1L;

	//column start
	/**
	 * appId: appId
	 */
	private String appId;

	/**
	 * resourceIds: resourceIds
	 */
	private String resourceIds;

	/**
	 * appSecret: appSecret
	 */
	private String appSecret;

	/**
	 * scope: scope
	 */
	private String scope;

	/**
	 * grantTypes: grantTypes
	 */
	private String grantTypes;

	/**
	 * redirectUrl: redirectUrl
	 */
	private String redirectUrl;

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
	 * additionalInformation: additionalInformation
	 */
	private String additionalInformation;

	/**
	 * autoApproveScopes: autoApproveScopes
	 */
	private String autoApproveScopes;

	// column end


	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String value) {
		this.appId = value;
	}

	public String getResourceIds() {
		return this.resourceIds;
	}

	public void setResourceIds(String value) {
		this.resourceIds = value;
	}

	public String getAppSecret() {
		return this.appSecret;
	}

	public void setAppSecret(String value) {
		this.appSecret = value;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String value) {
		this.scope = value;
	}

	public String getGrantTypes() {
		return this.grantTypes;
	}

	public void setGrantTypes(String value) {
		this.grantTypes = value;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}

	public void setRedirectUrl(String value) {
		this.redirectUrl = value;
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

	public String getAutoApproveScopes() {
		return this.autoApproveScopes;
	}

	public void setAutoApproveScopes(String value) {
		this.autoApproveScopes = value;
	}
	
}

