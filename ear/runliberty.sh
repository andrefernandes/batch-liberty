cp ./src/test/resources/server.xml ./target/liberty/wlp/usr/servers/defaultServer/
cp ./src/test/resources/bootstrap.properties ./target/liberty/wlp/usr/servers/defaultServer/
cp ./src/test/resources/jvm.options ./target/liberty/wlp/usr/servers/defaultServer/
./target/liberty/wlp/bin/server run defaultServer

