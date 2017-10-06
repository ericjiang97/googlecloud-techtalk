# googlecloud-techtalk
The Google Cloud Tech Talk

# Accessing API Deployed
To access API visit [http://gcp-techtalk-units.appspot.com/](http://gcp-techtalk-units.appspot.com/)

You can POST, DELETE, GET, PUT new units to `/api/units`
- GET `/api/units`
  - Query Params: `unitCode`, `unitName`
- POST `/api/units`
  - POST Units Model, for example:
  ```
  { "creditPoints": 0, "description": "CALLISTUS TAN WAS HERE", "scaBand": 0, "unitName": "Introduction to Callistus Tan" }
  ```
- DELETE `/api/units/{id}`
  - id must **match** the id of the unit entity
- PUT `/api/units/{id}`
  - id must **match** the id of the unit entity
  

You can also visit the Swagger UI Documentation at `swagger-ui.html`

# Instructions

## For Presenters
1. Use [Marp](https://yhatt.github.io/marp/) and edit [present.md](present.md) 
2. Export presentation
3. Open Presentation (`present.pdf`)

## For Audience
1. Clone Repository
2. Read Documentation about Developing on `springboot-base-gae-java8` [here](https://monashunitplanner.github.io/springboot-base-gae-java8/#/)
