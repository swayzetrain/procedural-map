# procedural-map

Deployment Notes:  
1. build app - mvn clean install  
2. Add procedural-map.yaml to procedural-map-api/target directory
3. Deploy to Google Cloud from procedural-map-api/target directory: ```gcloud app deploy procedural-map-api-0.0.1-SNAPSHOT.jar --appyaml=procedural-map.yaml```
