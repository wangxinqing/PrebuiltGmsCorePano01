package defpackage;

import android.net.http.SslError;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import com.google.android.gms.auth.login.CustomWebView;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: gmx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class gmx extends gnb {
    public static final iwd a = ehv.a("BrowserAuthFragment");
    gom b;
    public CustomWebView c;

    static String b(String str) {
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

    /* access modifiers changed from: protected */
    public void a(SslError sslError) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(CustomWebView customWebView);

    /* access modifiers changed from: protected */
    public void a(CustomWebView customWebView, String str) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(gol gol);

    /* access modifiers changed from: protected */
    public boolean a(WebResourceRequest webResourceRequest) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
    }

    /* access modifiers changed from: protected */
    public boolean d(String str) {
        return false;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.c);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        gom a2 = gom.a();
        this.b = a2;
        a2.b();
        CustomWebView customWebView = new CustomWebView(new gmu(getActivity()));
        this.c = customWebView;
        customWebView.setWebViewClient(new gmw(this));
        this.c.setWebChromeClient(new gmv(this));
        this.c.a();
        this.c.setFocusable(true);
        this.c.setFocusableInTouchMode(true);
        this.c.setMapTrackballToArrowKeys(false);
        WebSettings settings = this.c.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(false);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setNeedInitialFocus(false);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(false);
        if (jkr.c()) {
            settings.setDisabledActionModeMenuItems(7);
        }
        return this.c;
    }

    public final void onDestroyView() {
        this.c.destroy();
        this.c = null;
        this.b.b();
        super.onDestroyView();
    }

    public final void a(String str) {
        gom gom = this.b;
        String b2 = gom.b(str);
        gom.a(b2, "oauth_token");
        gom.a(b2, "user_id");
        gom.a(b2, "GASC");
        this.c.loadUrl(str);
    }
}
