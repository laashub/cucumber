module github.com/cucumber/cucumber-demo-formatter-go

require (
	github.com/cucumber/cucumber-messages-go/v7 v7.0.0
	github.com/gogo/protobuf v1.3.1
	github.com/stretchr/testify v1.4.0
	gopkg.in/yaml.v2 v2.2.7 // indirect
)

replace github.com/cucumber/cucumber-messages-go/v6 => ../../cucumber-messages/go

go 1.13