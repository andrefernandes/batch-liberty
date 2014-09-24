#!/bin/sh
#
# Normally "mvn liberty:start-server" would be enough,
# but this script suits better in a run configuration for
# IntelliJ (we need it to stay in foreground).
# The copy operations reproduce the mvn task behaviour.
#
WLPDIR=./target/liberty/wlp/usr/servers/defaultServer
if [ ! -d "$WLPDIR" ]; then
 mvn liberty:create-server
fi
cp ./src/test/resources/server.xml ./target/liberty/wlp/usr/servers/defaultServer/
cp ./src/test/resources/bootstrap.properties ./target/liberty/wlp/usr/servers/defaultServer/
cp ./src/test/resources/jvm.options ./target/liberty/wlp/usr/servers/defaultServer/
./target/liberty/wlp/bin/server run defaultServer

