## Android Research Tech
- Template repository for doing research on Android Technologies

## Generated APK Using Github Action
![image](/docs/image/apk-generated.png)

## Using Public GraphQL API
- [Countries API](https://studio.apollographql.com/public/countries/variant/current/home)

## Get Started Apollo Client for Android
- [Apollo Client](https://www.apollographql.com/docs/android/)

### Version Used
```md
$version = "4.1.1"
```

### Toml File (libs.versions.toml)
```toml
[versions]
apollo = $version

[libraries]
apollo-runtime = { module = "com.apollographql.apollo:apollo-runtime", version.ref = "apollo"}
apollo-api = { module = "com.apollographql.apollo:apollo-api", version.ref = "apollo"}
apollo-normalized-cache-sqlite = { module = "com.apollographql.apollo:apollo-normalized-cache-sqlite", version.ref = "apollo"}

[plugins]
apollo = { id = "com.apollographql.apollo", version.ref = "apollo" }
```

### Add Dependencies (build.gradle.kts) app module
```gradle
apollo {
  // Use "service" as a service name. 
  // A service has a single schema and represent a single schema.
  // You can have several services in a single app.
  service("service") {
    // The package name used for generated code.
    packageName.set("com.qomunal.opensource.androidresearch")
  }
}

android {
*
*
}

dependencies {
  implementation("com.apollographql.apollo:apollo-runtime:$version")

  // Optional: if you want to use the normalized cache
  implementation("com.apollographql.apollo:apollo-normalized-cache-sqlite:$version")
  // Optional: if you just want the generated models and parsers and write your own HTTP code/cache code, you can remove apollo-runtime
  // and use apollo-api instead
  
  implementation("com.apollographql.apollo:apollo-api:$version")
}

```

### Generate Apollo Schemes (select one json / graphqls)
#### Format
```shell
./gradlew downloadApolloSchema --endpoint='<link-graphql>' --schema='app/src/main/graphql/<package-name>/schema.json'
./gradlew downloadApolloSchema --endpoint='<link-graphql>' --schema='app/src/main/graphql/<package-name>/schema.graphqls'
````

#### Sample
```shell
./gradlew downloadApolloSchema --endpoint='https://countries.trevorblades.com/graphql' --schema='app/src/main/graphql/com/qomunal/opensource/androidresearch/schema.json'
./gradlew downloadApolloSchema --endpoint='https://countries.trevorblades.com/graphql' --schema='app/src/main/graphql/com/qomunal/opensource/androidresearch/schema.graphqls'
```


## Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account]  _ [Repository-Name]
- Example : Github_amirisback_android-research

Name Of Contribute
- Amir Qomunal
- Waiting List
- Waiting List

Waiting for your contribute

## Attention !!!
- Please enjoy and don't forget fork and give a star
- Don't Forget Follow teamqomunal Github Account

![Banner](https://teamqomunal.github.io/.github/docs/image/ic_poster.png)