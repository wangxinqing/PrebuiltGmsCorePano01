package com.google.android.gms.family.webview;

import android.accounts.Account;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FamilyWebViewChimeraActivity extends Activity {
    public String a;
    public WebView b;
    private Account c;
    private mqv d;
    private View e;

    public final void a() {
        setResult(0);
        finish();
    }

    public final void onBackPressed() {
        if (this.b.canGoBack()) {
            this.b.goBack();
            return;
        }
        setResult(-1);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        NetworkInfo activeNetworkInfo;
        int i;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            mfv.d("FamilyWebViewChimeraActivity", "FamilyWebViewChimeraActivity called with no intent", new Object[0]);
            a();
            return;
        }
        setContentView((int) R.layout.fm_webview);
        this.b = (WebView) findViewById(R.id.webview);
        this.e = findViewById(R.id.no_connection);
        this.d = mqv.a();
        this.c = new Account(intent.getStringExtra("accountName"), "com.google");
        String stringExtra = intent.getStringExtra("webviewUrl");
        this.a = stringExtra;
        if (stringExtra == null) {
            a();
            return;
        }
        this.b.clearCache(true);
        this.b.setWebViewClient(new mqs(getContainerActivity()));
        WebSettings settings = this.b.getSettings();
        String userAgentString = settings.getUserAgentString();
        ModuleManager moduleManager = ModuleManager.get(this);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject put = jSONObject.put("os", "Android").put("osVersion", String.valueOf(Build.VERSION.SDK_INT)).put("app", "com.google.android.gms");
            try {
                i = moduleManager.getCurrentModule().moduleVersion;
            } catch (Exception e2) {
                Object[] objArr = new Object[0];
                if (mfv.a.a(6)) {
                    mfv.a.c("Family", mfv.a("UserAgentHelper", "Unable to determine module version.", objArr), e2);
                }
                i = 0;
            }
            put.put("appVersion", String.valueOf(i));
        } catch (JSONException e3) {
        }
        String replaceAll = jSONObject.toString().replaceAll("\\(|\\)", "_");
        String format = String.format(Locale.US, "FmIdWebView (%s)", new Object[]{replaceAll});
        StringBuilder sb = new StringBuilder(String.valueOf(userAgentString).length() + 1 + String.valueOf(format).length());
        sb.append(userAgentString);
        sb.append(" ");
        sb.append(format);
        settings.setUserAgentString(sb.toString());
        settings.setJavaScriptEnabled(true);
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            this.b.setVisibility(8);
            findViewById(R.id.fm_webview_loading_screen).setVisibility(8);
            this.e.setVisibility(0);
            return;
        }
        this.e.setVisibility(8);
        Account account = this.c;
        String str = this.a;
        mqv mqv = this.d;
        acwa a2 = acws.a((Executor) mqv.b, (Callable) new mqt(mqv, account, str));
        a2.a(mqr.a);
        android.app.Activity containerActivity = getContainerActivity();
        acvu acvu = new acvu(acwl.a(acwg.a), new mqp(this));
        acwi acwi = (acwi) a2;
        acwi.b.a((acwb) acvu);
        acwh.b(containerActivity).a((acwb) acvu);
        acwi.f();
        android.app.Activity containerActivity2 = getContainerActivity();
        acvr acvr = new acvr(acwl.a(acwg.a), new mqq(this));
        acwi.b.a((acwb) acvr);
        acwh.b(containerActivity2).a((acwb) acvr);
        acwi.f();
    }
}
