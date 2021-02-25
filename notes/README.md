# About

Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas viverra ligula non lacus vehicula, non viverra orci aliquet. 
Proin at vehicula mauris. Cras ornare nulla nec dolor fringilla, et ornare nibh fermentum. Orci varius natoque penatibus et 
magnis dis parturient montes, nascetur ridiculus mus. Quisque non metus ex. Maecenas vel pulvinar elit, eget egestas enim. 
Praesent commodo elit mauris, eu porttitor nisi imperdiet sit amet. Nam eget enim varius, dignissim lectus in, luctus neque. 
Cras a sem non lacus gravida finibus sed non eros. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque id 
varius nisl.

Fusce accumsan odio mauris. In commodo, tortor at commodo lacinia, erat ipsum scelerisque justo, ac ornare turpis nibh non 
augue. Quisque volutpat enim nec justo porttitor, sit amet dapibus sem volutpat. Donec in feugiat lacus. Quisque ac est 
gravida, commodo arcu vitae, tincidunt risus. Nullam tempor nunc vel lorem aliquet posuere. Nunc non ante sed lacus 
luctus commodo ut sit amet arcu. Donec at fermentum risus. Ut mi sem, dignissim eu gravida id, faucibus in augue. 
Maecenas purus nunc, mollis non dignissim a, auctor non nisl. Sed scelerisque sapien eget augue semper, at placerat 
quam aliquet. Duis ut nulla vitae enim egestas suscipit id at metus. Nam eleifend fermentum lectus, ac gravida enim 
aliquet non. Maecenas non eros tincidunt, viverra nulla vitae, tristique dolor. Praesent vel magna sit amet dui sagittis 
aliquam. Fusce posuere est et maximus ultrices.


## Setup (Provisional)

Trying to use docker. My reasoning:
  - Less setup hassle
  - Could share with everyone
  - Need to learn more docker

Installation:
  - https://docs.docker.com/engine/install/ubuntu/



Possible base images:
```
  docker pull openjdk
  docker tag openjdk bc/jdp:0.0

```

  - Writeup here: https://snyk.io/blog/docker-for-java-developers/
  - Cheatsheet: https://www.docker.com/sites/default/files/d8/2019-09/docker-cheat-sheet.pdf
  - Xyz: https://www.getconvey.com/blog/java-based-docker-services/


Dockerfile something like this:
```
FROM openjdk
RUN mkdir /labs
RUN groupadd -r jbloggs && useradd -r -s /bin/false -g jbloggs jbloggs
WORKDIR /labs
RUN chown -R jbloggs:jbloggs /labs
USER jbloggs
CMD tail -f /dev/null
```


Hopefully VSCode will work. 
  - Has docker and Java extensions
  - Extensions:
    - https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.vscode-remote-extensionpack




