#!/bin/bash
set -e
export LWJGL_BUILD_TYPE=release/3.3.3 
export LWJGL_BUILD_ARCH=arm64

# Build LWJGL 3
ant -version
ant init
ant \
  -Dbinding.remotery=false \
  -Dbinding.openvr=true \
  -Dplatform.linux=true \
  -Dbuild.type=release/3.3.3 \
  -Dbuild.revision=5 -Dbuild.version=3.3.3 \
  -Djavadoc.skip=true \
  -Dnashorn.args="--no-deprecation-warning" \
  compile-templates generate compile compile-native

# release offline, since we want our library
export LWJGL_BUILD_OFFLINE=true
ant \
  -Dbinding.remotery=false \
  -Dbinding.openvr=true \
  -Dplatform.linux=true \
  -Dbuild.type=release/3.3.3 \
  -Dbuild.revision=5 -Dbuild.version=3.3.3 \
  -Djavadoc.skip=true \
  -Dnashorn.args="--no-deprecation-warning" \
  release
