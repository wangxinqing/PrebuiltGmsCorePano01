package com.google.android.gms.common.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebViewClient;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WhitelistWebViewChimeraActivity extends iah {
    /* access modifiers changed from: protected */
    public final WebViewClient a() {
        return new iaj();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            Uri data = intent.getData();
            str = data != null ? data.toString() : "";
        } else {
            str = null;
        }
        if (str != null && !iai.a(str)) {
            setResult(0);
            finish();
        }
    }
}
