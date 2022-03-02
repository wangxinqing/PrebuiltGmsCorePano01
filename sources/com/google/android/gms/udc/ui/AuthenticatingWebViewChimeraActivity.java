package com.google.android.gms.udc.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthenticatingWebViewChimeraActivity extends bjs implements adha {
    public static final jjg a = jjg.a();
    public String b;
    public boolean c;
    public ProgressBar d;
    public String e;
    private Pattern f;
    private WebView g;
    private FrameLayout h;

    public static Pattern f() {
        String m = azrh.a.a().m();
        if (m == null) {
            m = "";
        }
        try {
            return Pattern.compile(m);
        } catch (PatternSyntaxException e2) {
            anih anih = (anih) a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("com.google.android.gms.udc.ui.AuthenticatingWebViewChimeraActivity", "f", 290, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("failed to compile whitelist pattern");
            return null;
        }
    }

    private final void h() {
        setContentView((int) R.layout.common_auth_webcontent);
        this.h = (FrameLayout) findViewById(R.id.common_auth_web_container);
        this.d = (ProgressBar) findViewById(R.id.common_auth_web_progress_bar);
        if (this.g == null) {
            CookieSyncManager.createInstance(this);
            CookieManager.getInstance().removeAllCookie();
            WebView webView = new WebView(this);
            this.g = webView;
            webView.setFocusable(true);
            this.g.setFocusableInTouchMode(true);
            this.g.clearCache(true);
            WebSettings settings = this.g.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportMultipleWindows(false);
            settings.setSaveFormData(false);
            settings.setAllowFileAccess(false);
            settings.setDatabaseEnabled(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setLoadsImagesAutomatically(true);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setCacheMode(1);
            settings.setUseWideViewPort(true);
            settings.setAppCacheEnabled(false);
            adex adex = new adex(this, new agyo(amzy.a((Object) this.f)));
            amrl.a((Object) agyn.a);
            adex.b = true;
            this.g.setWebViewClient(adex);
            this.g.setWebChromeClient(new adey(this));
            if (TextUtils.isEmpty(this.b)) {
                this.g.loadUrl(this.e);
            } else {
                String str = this.b;
                String str2 = this.e;
                iva.a(str2, (Object) "Url must be set");
                new adgy(this, str, str2, this).execute(new Void[0]);
            }
        }
        this.h.addView(this.g);
    }

    public final void a(String str) {
        this.g.loadUrl(str);
    }

    public final void e() {
        finish();
    }

    public final void onBackPressed() {
        if (this.g.canGoBack()) {
            this.g.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        if (this.g != null) {
            this.h.removeAllViews();
        }
        super.onConfigurationChanged(configuration);
        h();
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (!"com.google.android.gms".equals(jhg.a((Activity) this))) {
            setResult(0);
            finish();
            return;
        }
        Intent intent = getIntent();
        iva.a((Object) intent.getData());
        this.e = intent.getData().toString();
        this.b = intent.getStringExtra("AuthWebviewAccountName");
        this.c = intent.getBooleanExtra("AuthWebviewShowProgressBar", false);
        this.f = f();
        CharSequence charSequenceExtra = intent.getCharSequenceExtra("AuthWebviewTitle");
        boolean booleanExtra = intent.getBooleanExtra("AuthWebviewHomeAsUpEnabled", false);
        if (!TextUtils.isEmpty(charSequenceExtra)) {
            z = true;
        } else {
            z = booleanExtra;
        }
        sg aE = aE();
        if (z) {
            aE.b(booleanExtra);
            if (TextUtils.isEmpty(charSequenceExtra)) {
                aE.c(false);
            } else {
                aE.c(true);
                aE.a(charSequenceExtra);
            }
            aE.d();
        } else {
            aE.e();
        }
        h();
        setResult(-1);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.g.restoreState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.g.saveState(bundle);
    }
}
