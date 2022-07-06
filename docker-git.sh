git clone https://gitlab.com/ravinder.leonlabs/eventProcessor.git
cd eventProcessor
mvn install dockerfile:build
docker run -p 3000:3000 -t ravindersengar84/eventProcessor
