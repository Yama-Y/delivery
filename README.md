# 中文
免费并且无限制的快递查询接口。只需输入快递单号即可。尽情的玩耍吧^_^
## 帮助文档
`mvn clean`<br/>
`mvn install`<br/>
```java
Delivery.getData("71264884113680");
```
<br/>
```javascript
{
	"message": "ok",
	"nu": "71264884113680",
	"ischeck": "0",
	"condition": "00",
	"com": "huitongkuaidi",
	"status": "200",
	"state": "0",
	"data": [{
		"time": "2018-03-07 20:26:14",
		"ftime": "2018-03-07 20:26:14",
		"context": "哈尔滨市|到哈尔滨市【哈尔滨转运中心】",
		"location": ""
	}, {
		"time": "2018-03-06 05:30:57",
		"ftime": "2018-03-06 05:30:57",
		"context": "金华市|金华市【金华转运中心】，正发往【哈尔滨转运中心】",
		"location": ""
	}, {
		"time": "2018-03-06 03:12:40",
		"ftime": "2018-03-06 03:12:40",
		"context": "金华市|到金华市【金华转运中心】",
		"location": ""
	}, {
		"time": "2018-03-05 20:34:33",
		"ftime": "2018-03-05 20:34:33",
		"context": "金华市|到金华市【金华义乌上溪大件集货点】",
		"location": ""
	}, {
		"time": "2018-03-05 20:00:02",
		"ftime": "2018-03-05 20:00:02",
		"context": "金华市|金华市【义乌上溪镇东分部】，【方岩西溪/057985195808】已揽收",
		"location": ""
	}]
}
```
<br/>
# English
Free and unlimited delivery query interface.Only need to enter the delivery single number.Have fun^_^
## API
`mvn clean`<br/>
`mvn install`<br/>
```java
Delivery.getData("71264884113680");
```
<br/>
```javascript
{
	"message": "ok",
	"nu": "71264884113680",
	"ischeck": "0",
	"condition": "00",
	"com": "huitongkuaidi",
	"status": "200",
	"state": "0",
	"data": [{
		"time": "2018-03-07 20:26:14",
		"ftime": "2018-03-07 20:26:14",
		"context": "哈尔滨市|到哈尔滨市【哈尔滨转运中心】",
		"location": ""
	}, {
		"time": "2018-03-06 05:30:57",
		"ftime": "2018-03-06 05:30:57",
		"context": "金华市|金华市【金华转运中心】，正发往【哈尔滨转运中心】",
		"location": ""
	}, {
		"time": "2018-03-06 03:12:40",
		"ftime": "2018-03-06 03:12:40",
		"context": "金华市|到金华市【金华转运中心】",
		"location": ""
	}, {
		"time": "2018-03-05 20:34:33",
		"ftime": "2018-03-05 20:34:33",
		"context": "金华市|到金华市【金华义乌上溪大件集货点】",
		"location": ""
	}, {
		"time": "2018-03-05 20:00:02",
		"ftime": "2018-03-05 20:00:02",
		"context": "金华市|金华市【义乌上溪镇东分部】，【方岩西溪/057985195808】已揽收",
		"location": ""
	}]
}
```
<br/>
