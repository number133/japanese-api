package com.abylay.languages.japanese.api;

import com.atilika.kuromoji.TokenBase;
import com.atilika.kuromoji.TokenizerBase;
import com.atilika.kuromoji.ipadic.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abylay.Sabirgaliyev
 * Created: 30.01.2017 15:19
 * Copyright © LLP JazzSoft
 */
public class ComboTokenizer {

    public static List<? extends TokenBase> tokenize(String text, String dictionary) {
        List<? extends TokenBase> result = new ArrayList();
        TokenizerBase tokenizer = null;
        switch (dictionary) {
            case "ipadic":
                tokenizer = new com.atilika.kuromoji.ipadic.Tokenizer() ;
                result = tokenizer.tokenize(text);
                break;
            case "jumandic":
                tokenizer = new com.atilika.kuromoji.jumandic.Tokenizer() ;
                result = tokenizer.tokenize(text);
                break;
            case "naist-jdic":
                tokenizer = new com.atilika.kuromoji.naist.jdic.Tokenizer() ;
                result = tokenizer.tokenize(text);
                break;
            case "unidic":
                tokenizer = new com.atilika.kuromoji.unidic.Tokenizer() ;
                result = tokenizer.tokenize(text);
                break;
            case "unidic-kanaaccent":
                tokenizer = new com.atilika.kuromoji.unidic.kanaaccent.Tokenizer() ;
                result = tokenizer.tokenize(text);
                break;
            default:
                tokenizer = new com.atilika.kuromoji.ipadic.Tokenizer() ;
                result = tokenizer.tokenize(text);
                break;
        }
        return result;
    }
}
