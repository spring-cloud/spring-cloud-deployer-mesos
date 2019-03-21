/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.mesos.chronos.client.model;

import java.util.List;

/**
 * Class defining a Docker container to be used with Chronos {@link DockerJob}.
 *
 * @author Thomas Risberg
 */
public class DockerContainer {

	private String type = "DOCKER";
	private String image;
	private String network;
	private List<DockerVolume> volumes;
	private Boolean forcePullImage;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public List<DockerVolume> getVolumes() {
		return volumes;
	}

	public void setVolumes(List<DockerVolume> volumes) {
		this.volumes = volumes;
	}

	public Boolean getForcePullImage() {
		return forcePullImage;
	}

	public void setForcePullImage(Boolean forcePullImage) {
		this.forcePullImage = forcePullImage;
	}

	public static class DockerVolume {

		private String containerPath;
		private String hostPath;
		private String mode;

		public String getContainerPath() {
			return containerPath;
		}

		public void setContainerPath(String containerPath) {
			this.containerPath = containerPath;
		}

		public String getHostPath() {
			return hostPath;
		}

		public void setHostPath(String hostPath) {
			this.hostPath = hostPath;
		}

		public String getMode() {
			return mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}
	}
}
