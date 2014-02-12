(defproject openas2 "2014.02.12"
  :description "lein-ized fork of OpenAS2 Server"
  :url "https://github.com/ea-cm/openas2"
  :license {:name "BSD License"
            :url ""}
  :dependencies [[javax.mail/mail "1.4.7"]
                 [commons-logging/commons-logging "1.1.1"]
                 [dom4j/dom4j "1.6.1"]
                 [org.bouncycastle/bcmail-jdk15on "1.49"]
                 [commons-lang/commons-lang "2.6"]]
  :java-source-paths ["src/java"]
  :javac-options ["-target" "1.7" "-source" "1.7"])
