package com.google.android.gms.plus.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DpadNavigableWebViewChimeraActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String uri = getIntent().getData().toString();
        setContentView((int) R.layout.common_dpad_navigable_web_view_activity);
        WebView webView = (WebView) findViewById(R.id.web_content);
        webView.setWebViewClient(new znb());
        webView.clearCache(true);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (!TextUtils.isEmpty(language)) {
            String variant = locale.getVariant();
            if (!TextUtils.isEmpty(variant)) {
                language = getString(R.string.web_view_accept_language_header, new Object[]{language, variant});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Accept-Language", language);
            webView.loadUrl(uri, hashMap);
            return;
        }
        webView.loadUrl(uri);
    }
}
