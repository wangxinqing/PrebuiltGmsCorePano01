package com.google.android.gms.googlehelp.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebViewClient;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleHelpWebViewChimeraActivity extends iah implements nzu {
    private HelpConfig a;
    private okc b;

    /* access modifiers changed from: protected */
    public final WebViewClient a() {
        return opa.a((nzu) this);
    }

    public final HelpConfig f() {
        return this.a;
    }

    public final okc h() {
        return this.b;
    }

    public final ofn i() {
        throw null;
    }

    public final oar j() {
        throw null;
    }

    public final Context k() {
        return this;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        Uri uri;
        this.a = HelpConfig.a(this, bundle, getIntent());
        this.b = new okc(this);
        Intent intent = getIntent();
        oow oow = new oow(this);
        if (bundle != null) {
            intent = new Intent();
            String string = bundle.getString("saved_instance_state_key_url");
            if (!TextUtils.isEmpty(string)) {
                intent.setData(Uri.parse(string));
            }
            Log.w("gH_WebViewActivity", "URL not whitelisted or Intent not processable.");
            getIntent().setData((Uri) null);
            super.onCreate((Bundle) null);
            setResult(0);
            finish();
            return;
        }
        if (intent != null) {
            uri = intent.getData();
            str = uri != null ? uri.toString() : "";
        } else {
            uri = null;
            str = null;
        }
        if (!oow.b(uri) || !oow.a(uri.toString(), true)) {
            if (!TextUtils.isEmpty(str)) {
                oow.a(this, uri, oow.a);
            }
            Log.w("gH_WebViewActivity", "URL not whitelisted or Intent not processable.");
            getIntent().setData((Uri) null);
            super.onCreate((Bundle) null);
            setResult(0);
            finish();
            return;
        }
        super.onCreate(bundle);
    }

    public final void onDestroy() {
        okc okc = this.b;
        if (okc != null) {
            okc.close();
        }
        super.onDestroy();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        if (!(getIntent() == null || getIntent().getData() == null)) {
            bundle.putParcelable("EXTRA_HELP_CONFIG", this.a);
            bundle.putString("saved_instance_state_key_url", getIntent().getData().toString());
        }
        super.onSaveInstanceState(bundle);
    }
}
