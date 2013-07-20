package com.redhat.reportengine.agent.rest.mapper;

/**
 * @author jkandasa@redhat.com (Jeeva Kandasamy)
 * May 14, 2013
 */
public class URIReferenceAgent {
	public static final String AGENT_ROOT_URI = "/agent";
	public static final String AGENT_JOB_ROOT_URI = "/jobs";
	
	//Resources
	public static final String CONF_CPU    = "/conf/cpu";
	public static final String CONF_MEMORY = "/conf/memory";
	public static final String CONF_AGENT  = "/conf/agent";
	public static final String CONF_SYSTEM = "/conf/system";
	public static final String CONF_OS = "/conf/os";
	
	public static final String LIST_PIDS   = "/list/pids";
	public static final String CONF_PID    = "/conf/pid";
	
	public static final String USAGE_CPU   = "/usage/cpu";
	public static final String USAGE_CPUS  = "/usage/cpus";
	public static final String USAGE_MEMORY= "/usage/memory";
	public static final String USAGE_SWAP  = "/usage/swap";	

	public static final String USAGE_CPU_MEMORY   = "/usage/cpumemory";
	
	public static final String LIST_NW_IFS = "/list/nwifs";
	public static final String CONF_NW_IF  = "/conf/nwif";
	public static final String CONF_NW     = "/conf/nw";	
	
	public static final String LIST_FS     = "/list/fs";
	public static final String USAGE_FS    = "/usage/fs";
	public static final String USAGE_DIR   = "/usage/dir";
	
	//Jobs
	public static final String ADD_JOB = "/add";
	public static final String DELETE_JOB = "/delete";
	
	
}
