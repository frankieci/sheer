version=$1

if test -z $version
then version="latest"
fi

echo $version

docker build -t docker-registry.fankieci-yun.com/flume-agent:$version .

docker push docker-registry.fankieci-yun.com/flume-agent:$version
