FROM tutum/tomcat:7.0
MAINTAINER Paul Anderson <panderson@picsauditing.com>

RUN rm -Rf $CATALINA_HOME/webapps/ROOT

COPY target/spring-mvc.war $CATALINA_HOME/webapps/ROOT.war
