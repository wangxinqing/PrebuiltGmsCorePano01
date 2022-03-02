package com.google.android.gms.auth.login;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import com.google.android.gms.R;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BrowserChimeraActivity extends ggc implements View.OnFocusChangeListener, ggv {
    private ArrayList A = null;
    private fzq B;
    private AsyncTask C;
    public String a;
    public String m;
    public String n;
    public String o;
    public Map p;
    public CustomWebView q;
    public CookieManager r;
    public String s = null;
    public String t = null;
    private String u;
    private boolean v;
    private String w;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;

    public static Intent a(String str, String str2, String str3, boolean z2, ArrayList arrayList, String str4, String str5) {
        Intent className = new Intent().setClassName(ihs.b(), "com.google.android.gms.auth.login.BrowserActivity");
        className.putExtra("account_name", str);
        className.putExtra("url", str2);
        className.putExtra("access_token", str3);
        className.putExtra("creating_account", z2);
        className.putStringArrayListExtra("allowed_domains", arrayList);
        if (!TextUtils.isEmpty(str4)) {
            className.putExtra("purchaser_email", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            className.putExtra("purchaser_name", str5);
        }
        return className;
    }

    public static String b(String str) {
        if (str == null) {
            return "null";
        }
        try {
            URI uri = new URI(str);
            String host = uri.getHost();
            String path = uri.getPath();
            StringBuilder sb = new StringBuilder(String.valueOf(host).length() + 13 + String.valueOf(path).length());
            sb.append("Host: ");
            sb.append(host);
            sb.append(" Path: ");
            sb.append(path);
            return sb.toString();
        } catch (URISyntaxException e) {
            return str;
        }
    }

    public final void c(String str) {
        gol a2 = gom.a().a(str);
        String str2 = a2.a;
        if (str2 != null) {
            this.x = true;
        }
        if (this.x && !this.y) {
            this.y = true;
            this.u = str2;
            this.q.setVisibility(8);
            ggd ggd = new ggd(new Bundle());
            ggd.a.putString("authorization_code", a2.a);
            ggd.a.putString("obfuscated_gaia_id", a2.b);
            setResult(-1, new Intent().putExtras(ggd.a));
            finish();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        CustomWebView customWebView;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0 || keyEvent.getRepeatCount() != 0 || (customWebView = this.q) == null || !customWebView.canGoBack()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this.q.goBack();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 1) {
            setResult(1);
        } else {
            setResult(0);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Locale locale = Locale.getDefault();
        this.n = locale.getLanguage();
        this.o = locale.getCountry();
        String language = locale.getLanguage();
        this.w = language;
        if (!language.isEmpty()) {
            if (!this.o.isEmpty()) {
                String valueOf = String.valueOf(this.w);
                String str = this.o;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
                sb.append(valueOf);
                sb.append("-");
                sb.append(str);
                this.w = sb.toString();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(3);
            linkedHashMap.put("Accept-Language", this.w);
            this.p = Collections.unmodifiableMap(linkedHashMap);
        } else {
            this.p = null;
        }
        this.B = fzq.a(ent.aH());
        setContentView((int) R.layout.auth_browser_add_account_activity);
        if (bundle != null) {
            this.x = bundle.getBoolean("interactivity_completed", false);
            this.z = bundle.getBoolean("waiting_for_network", false);
            this.y = bundle.getBoolean("background_task_started", false);
            a(bundle);
        } else {
            a(getIntent().getExtras());
        }
        CustomWebView customWebView = (CustomWebView) findViewById(R.id.activity_root).findViewById(R.id.webview);
        this.q = customWebView;
        customWebView.clearCache(true);
        this.q.a();
        CookieSyncManager.createInstance(this);
        this.r = CookieManager.getInstance();
        this.q.setWebViewClient(new ggw(this, this.B));
        this.q.setWebChromeClient(new ggf(this));
        WebSettings settings = this.q.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(false);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setLightTouchEnabled(false);
        settings.setNeedInitialFocus(false);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(false);
        this.q.setMapTrackballToArrowKeys(false);
        this.q.setFocusable(true);
        this.q.setFocusableInTouchMode(true);
        this.q.getSettings().setUseWideViewPort(false);
        gge gge = new gge(this);
        this.C = gge;
        gge.execute(new Void[0]);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.C;
        if (asyncTask != null) {
            asyncTask.cancel(false);
            this.C = null;
        }
    }

    public final void onFocusChange(View view, boolean z2) {
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 0) {
            setResult(0);
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("access_token", this.u);
        bundle.putString("account_name", this.a);
        bundle.putBoolean("creating_account", this.v);
        bundle.putStringArrayList("allowed_domains", this.A);
        bundle.putString("purchaser_email", this.s);
        bundle.putString("purchaser_name", this.t);
        bundle.putString("url", this.m);
        bundle.putBoolean("interactivity_completed", this.x);
        bundle.putBoolean("waiting_for_network", this.z);
        bundle.putBoolean("background_task_started", this.y);
    }

    public final void b() {
        h();
    }

    public static boolean a(String str, fzq fzq) {
        if (str != null) {
            try {
                String path = new URI(str).getPath();
                if (path == null || !fzq.b(str) || !path.startsWith("/EmbeddedSetup")) {
                    return false;
                }
                return true;
            } catch (URISyntaxException e) {
            }
        }
        return false;
    }

    public final void a() {
        g();
    }

    public final void a(Bundle bundle) {
        this.a = bundle.getString("account_name");
        this.m = bundle.getString("url");
        this.u = bundle.getString("access_token");
        this.v = bundle.getBoolean("creating_account");
        this.A = bundle.getStringArrayList("allowed_domains");
        this.s = bundle.getString("purchaser_email");
        this.t = bundle.getString("purchaser_name");
    }

    public final void a(gei gei) {
        boolean z2;
        String str = this.a;
        boolean z3 = this.v;
        if (this.A == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        startActivityForResult(ShowErrorChimeraActivity.a(str, (String) null, gei, z3, true, z2), 1009);
    }
}
