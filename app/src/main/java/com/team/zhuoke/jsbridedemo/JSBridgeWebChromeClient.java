package com.team.zhuoke.jsbridedemo;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * Created by WangQing on 2016/11/10.
 */

public class JSBridgeWebChromeClient extends WebChromeClient {

    @Override
    public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
//        return super.onJsPrompt(view, url, message, defaultValue, result);
        result.confirm(JSBridge.callJava(view, message));
        return true;
    }
}
