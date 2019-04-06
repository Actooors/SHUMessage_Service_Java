package tools

import "github.com/Actooors/SHUMessage_Service_Go/go/config"

var secret, amapKey, tencentMapKey string

func init() {
	app := config.App()
	secret = app.Secret
	amapKey = app.AmapKey
	tencentMapKey = app.TencentMapKey
}
