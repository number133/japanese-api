Simple java web application with a Japanese morphological analyzer API.
Doesn't require web/application server. Runs from command line.
Uses Kuromoji https://github.com/atilika/kuromoji

1. Build:
    mvn clean package

2. Run:
    java -jar japanese-api-1.0-SNAPSHOT-jar-with-dependencies.jar

3. Use. Call from browser or REST-client:
    http://localhost:4567/japanese-api?text=私わ馬鹿です&lang=ipadic
    text - text to analyze,
    lang - dictionary name, can be ipadic, jumandic, naist-jdic, unidic, unidic-kanaaccent.

   Return JSON result:
        {
          "success" : true,
          "message" : "",
          "data" : [ {
            "surface" : "私",
            "position" : 0,
            "partOfSpeechLevel1" : "名詞",
            "partOfSpeechLevel2" : "代名詞",
            "partOfSpeechLevel3" : "一般",
            "partOfSpeechLevel4" : "*",
            "conjugationType" : "*",
            "conjugationForm" : "*",
            "baseForm" : "私",
            "reading" : "ワタシ",
            "pronunciation" : "ワタシ",
            "known" : true,
            "user" : false,
            "allFeaturesArray" : [ "名詞", "代名詞", "一般", "*", "*", "*", "私", "ワタシ", "ワタシ" ],
            "allFeatures" : "名詞,代名詞,一般,*,*,*,私,ワタシ,ワタシ"
          }, {
            "surface" : "わ",
            "position" : 1,
            "partOfSpeechLevel1" : "助詞",
            "partOfSpeechLevel2" : "終助詞",
            "partOfSpeechLevel3" : "*",
            "partOfSpeechLevel4" : "*",
            "conjugationType" : "*",
            "conjugationForm" : "*",
            "baseForm" : "わ",
            "reading" : "ワ",
            "pronunciation" : "ワ",
            "known" : true,
            "user" : false,
            "allFeaturesArray" : [ "助詞", "終助詞", "*", "*", "*", "*", "わ", "ワ", "ワ" ],
            "allFeatures" : "助詞,終助詞,*,*,*,*,わ,ワ,ワ"
          }, {
            "surface" : "馬鹿",
            "position" : 2,
            "partOfSpeechLevel1" : "名詞",
            "partOfSpeechLevel2" : "形容動詞語幹",
            "partOfSpeechLevel3" : "*",
            "partOfSpeechLevel4" : "*",
            "conjugationType" : "*",
            "conjugationForm" : "*",
            "baseForm" : "馬鹿",
            "reading" : "バカ",
            "pronunciation" : "バカ",
            "known" : true,
            "user" : false,
            "allFeaturesArray" : [ "名詞", "形容動詞語幹", "*", "*", "*", "*", "馬鹿", "バカ", "バカ" ],
            "allFeatures" : "名詞,形容動詞語幹,*,*,*,*,馬鹿,バカ,バカ"
          }, {
            "surface" : "です",
            "position" : 4,
            "partOfSpeechLevel1" : "助動詞",
            "partOfSpeechLevel2" : "*",
            "partOfSpeechLevel3" : "*",
            "partOfSpeechLevel4" : "*",
            "conjugationType" : "特殊・デス",
            "conjugationForm" : "基本形",
            "baseForm" : "です",
            "reading" : "デス",
            "pronunciation" : "デス",
            "known" : true,
            "user" : false,
            "allFeaturesArray" : [ "助動詞", "*", "*", "*", "特殊・デス", "基本形", "です", "デス", "デス" ],
            "allFeatures" : "助動詞,*,*,*,特殊・デス,基本形,です,デス,デス"
          } ]
        }