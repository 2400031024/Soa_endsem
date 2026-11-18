# MS1 Addition API

A Spring Boot Maven project containing:
- An OpenAPI contract in `src/main/resources/openapi.yaml`
- A working GET endpoint at `/ms1/add`
- Query parameters `a` and `b`
- A JSON response containing the sum

## Assumed response specification

The task did not include the exact response fields after “define response spec”, so this project uses:
```json
{
  "result": 15
}
```
for `GET /ms1/add?a=5&b=10`.

## Import into Spring Tool Suite (STS)

1. Extract this ZIP file.
2. Open Spring Tool Suite.
3. Select **File → Import → Maven → Existing Maven Projects**.
4. Browse to the extracted `ms1-add-api` folder.
5. Select the detected `pom.xml`, then click **Finish**.
6. Wait for Maven dependencies to download.
7. Open `Ms1AddApiApplication.java` and choose **Run As → Spring Boot App**.

## Test the endpoint

Open this URL in a browser or send a GET request using Postman:

`http://localhost:8080/ms1/add?a=5&b=10`

Expected response:
```json
{"result":15.0}
```

The query parameters are optional in the implementation; omitted values default to `a=5` and `b=10`.

## Contract file

Open `src/main/resources/openapi.yaml` to view or edit the YAML API contract.
