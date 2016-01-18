/*
   Copyright 2015 Electric Cloud, Inc.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package test.java.ecplugins.puppet;

public class StringConstants {

	final static String COMMANDER_SERVER = "COMMANDER_SERVER";
	final static String PLUGIN_VERSION = System.getProperty("PLUGIN_VERSION");
	final static String COMMANDER_USER = "COMMANDER_USER";
	final static String COMMANDER_PASSWORD = "COMMANDER_PASSWORD";
	final static String PUPPET_AGENT_IP = "PUPPET_AGENT_IP";
	final static String PUPPET_MASTER_IP = "PUPPET_MASTER_IP";
	final static String EC_AGENT_PORT = "7800";
	final static String WORKSPACE_NAME = "UTWorkspace";
	final static String PUPPET_AGENT_RESOURCE_NAME = "puppetAgent";
	final static String PUPPET_MASTER_RESOURCE_NAME = "puppetMaster";
	final static long jobTimeoutMillis = 5 * 60 * 1000;
}
