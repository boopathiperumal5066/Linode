package com.linode.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.linode.dto.NodeStatusDTO;
import com.mongodb.lang.NonNull;

@Document(collection="linode")
public class LinodeModel {
	
	@Id
	private String id;
	
	@NonNull
	private Integer port;

	private String protocol;

	private String algorithm;

	private String stickiness;

	private String check;

	private Integer check_interval;

	private Integer check_timeout;

	private Integer check_attempts;

	private String check_body;

	private String check_path;

	private boolean check_passive;

	private Integer nodebalancer_id;

	private String ssl_commonname;

	private String ssl_fingerprint;

	private String ssl_cert;

	private String ssl_key;

	private NodeStatusDTO nodeStatus;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getStickiness() {
		return stickiness;
	}

	public void setStickiness(String stickiness) {
		this.stickiness = stickiness;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public Integer getCheck_interval() {
		return check_interval;
	}

	public void setCheck_interval(Integer check_interval) {
		this.check_interval = check_interval;
	}

	public Integer getCheck_timeout() {
		return check_timeout;
	}

	public void setCheck_timeout(Integer check_timeout) {
		this.check_timeout = check_timeout;
	}

	public Integer getCheck_attempts() {
		return check_attempts;
	}

	public void setCheck_attempts(Integer check_attempts) {
		this.check_attempts = check_attempts;
	}

	public String getCheck_body() {
		return check_body;
	}

	public void setCheck_body(String check_body) {
		this.check_body = check_body;
	}

	public String getCheck_path() {
		return check_path;
	}

	public void setCheck_path(String check_path) {
		this.check_path = check_path;
	}

	public boolean isCheck_passive() {
		return check_passive;
	}

	public void setCheck_passive(boolean check_passive) {
		this.check_passive = check_passive;
	}

	public Integer getNodebalancer_id() {
		return nodebalancer_id;
	}

	public void setNodebalancer_id(Integer nodebalancer_id) {
		this.nodebalancer_id = nodebalancer_id;
	}

	public String getSsl_commonname() {
		return ssl_commonname;
	}

	public void setSsl_commonname(String ssl_commonname) {
		this.ssl_commonname = ssl_commonname;
	}

	public String getSsl_fingerprint() {
		return ssl_fingerprint;
	}

	public void setSsl_fingerprint(String ssl_fingerprint) {
		this.ssl_fingerprint = ssl_fingerprint;
	}

	public String getSsl_cert() {
		return ssl_cert;
	}

	public void setSsl_cert(String ssl_cert) {
		this.ssl_cert = ssl_cert;
	}

	public String getSsl_key() {
		return ssl_key;
	}

	public void setSsl_key(String ssl_key) {
		this.ssl_key = ssl_key;
	}

	public NodeStatusDTO getNodeStatus() {
		return nodeStatus;
	}

	public void setNodeStatus(NodeStatusDTO nodeStatus) {
		this.nodeStatus = nodeStatus;
	}
	
}
