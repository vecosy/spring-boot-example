# Vecosy Spring Client Example

## 1. Start the vecosy server
```shell script
$> docker run --rm  -p 8080:8080 -p 8081:8081 vecosy/vecosy:demo
```

## 2. Start the spring application
```shell script
$> mvn spring-boot:run
```

## 3. Open endpoint
http://localhost:9090

you should see the `db.user` variable retrieved from [spring-app1-dev.yml](https://github.com/vecosy/config-sample/blob/spring-app1/1.0.0/spring-app1-dev.yml)
