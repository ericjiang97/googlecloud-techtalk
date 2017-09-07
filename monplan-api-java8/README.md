monPlan API Java 1.8
<img src="https://cloud.google.com/_static/a9ec26dfeb/images/cloud/gcp-logo.svg" height="32px" align="right" style="margin-left: 5px"/>
<img src="https://avatars2.githubusercontent.com/u/22784829?v=4&s=200" height="32px" align="right" style="margin-left: 5px"/>
<img src="http://mudassirshahzad.com/wp-content/uploads/2017/02/spring-boot.png"  height="32px" align="right" style="margin-left: 5px"/>
---
This is the base for the API which is built on AppEngine Standard with Java 8 using SpringBoot.

You can also read more about developing on this [here](DOCS.md)

## Contributors
Thanks to 3wks for the gae-tool and spring-boot-gae modules

### Built by the monPlan DevOps and Backend Team:

| ![lorderikir](https://avatars3.githubusercontent.com/u/5687681?v=4&s=460)  | ![darvid7](https://avatars0.githubusercontent.com/u/11433468?v=4&s=460) | ![calytan](https://avatars1.githubusercontent.com/u/18413765?v=4&s=460)|
| --------------| ----|---|
| [@lorderikir](github.com/lorderikir) | [@darvid7](github.com/darvid7) | [@callistusystan](github.com/callistusystan) |

## Available Tools:
- Custom Exceptions built on top of Springboot
- GAE Tools by [3wks](https://github.com/3wks)
- Swagger


## Running

Currently just running locally through terminal only

```
mvn appengine:devserver
```

You should also clean the package after fixing errors
```
mvn clean package
```

## Deploying to Google App Engine
You will need to change the configuration at `/src/main/webapp/WEB-INF/appengine-web.xml`

## Documentation
We have included **springfox-swagger2** and **springfox-swagger-ui** as Repos, allowing you to document code automatically.

To access the documentation locally visit: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

### Units

CRUD For Units and Courses Controller

## Documentation
We have included **springfox-swagger2** and **springfox-swagger-ui** as Repos, allowing you to document code automatically.

To access the documentation locally visit: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
