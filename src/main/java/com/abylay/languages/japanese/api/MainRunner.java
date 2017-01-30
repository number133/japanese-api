package com.abylay.languages.japanese.api;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

import static spark.Spark.get;

/**
 * Created by Abylay.Sabirgaliyev
 * Created: 30.01.2017 12:23
 */
public class MainRunner {

    public static void main(String[] args) throws Exception {

        get("/japanese-api", (req, res) -> {
            ObjectMapper mapper = new ObjectMapper();
            String text = req.queryParams("text");
            String lang = req.queryParams("lang");

            res.type("application/json");
            if(text == null || text.isEmpty()) {
                return mapper.writerWithDefaultPrettyPrinter()
                        .writeValueAsString(new Result(false, "Parameter text is required!", null));
            }
            if(lang == null) {
                lang = "";
            }
            List tokens = ComboTokenizer.tokenize(text, lang);
            return mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(new Result(true, "", tokens));
        });
    }
}
