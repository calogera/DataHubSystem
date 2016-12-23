---
layout: post
title:  "How to build"
date:   2007-05-01 15:40:56
categories: page
---

## How to build the DHuS Project
### Important Recommendation   
_Maven repository configuration_  
We suggest to copy the settings.xml file in your maven local repository:  
  
```sh
~/.m2
```
#### settings.xml file 
```xml
<settings
    xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
    http://maven.apache.org/xsd/settings-1.0.0.xsd">
		<mirrors>
			<mirror>
				<id>osf-public</id>
				<mirrorOf>*</mirrorOf>
				<url>https://copernicus.serco.eu/repository/nexus/content/groups/public/</url>
            </mirror>
            <mirror>
				<id>osf-releases</id>
                <mirrorOf>*</mirrorOf>
                <url>https://copernicus.serco.eu/repository/nexus/content/repositories/public-releases-repository/</url>
            </mirror>
		</mirrors>
</settings>
```

***
### Command line build

#### Build and deploy modules 
```
mvn -Psources,owc -Dmaven.test.skip=true clean package deploy
```
#### Build and deploy new distribution 
```
cd distribution/software
mvn clean -Powc package deploy
```

#### Build folder location
```sh
<source_code_path>/distribution/software/target
```

#### Automatic installator package
```sh
<source_code_path>/distribution/software/target/
```

#### Distribution zip package
```sh
<source_code_path>/distribution/software/target/
```
