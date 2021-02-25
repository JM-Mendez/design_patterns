# See here for image contents: https://github.com/microsoft/vscode-dev-containers/tree/v0.158.0/containers/java-8/.devcontainer/base.Dockerfile

FROM mcr.microsoft.com/vscode/devcontainers/java:0-8

# [Option] Install Maven
ARG INSTALL_MAVEN="true"
ARG MAVEN_VERSION=""
# [Option] Install Gradle
ARG INSTALL_GRADLE="false"
ARG GRADLE_VERSION=""
RUN if [ "${INSTALL_MAVEN}" = "true" ]; then su vscode -c "umask 0002 && . /usr/local/sdkman/bin/sdkman-init.sh && sdk install maven \"${MAVEN_VERSION}\""; fi \
    && if [ "${INSTALL_GRADLE}" = "true" ]; then su vscode -c "umask 0002 && . /usr/local/sdkman/bin/sdkman-init.sh && sdk install gradle \"${GRADLE_VERSION}\""; fi

# [Option] Install Node.js
ARG INSTALL_NODE="false"
ARG NODE_VERSION="lts/*"
RUN if [ "${INSTALL_NODE}" = "true" ]; then su vscode -c "umask 0002 && . /usr/local/share/nvm/nvm.sh && nvm install ${NODE_VERSION} 2>&1"; fi
RUN curl -s "https://get.sdkman.io" | bash 
RUN bash -c "source /usr/local/sdkman/bin/sdkman-init.sh && sdk install springboot"
