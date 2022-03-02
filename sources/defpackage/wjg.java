package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.notifications.GunsBrowserChimeraActivity;

/* renamed from: wjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wjg extends WebViewClient {
    final /* synthetic */ GunsBrowserChimeraActivity a;

    public wjg(GunsBrowserChimeraActivity gunsBrowserChimeraActivity) {
        this.a = gunsBrowserChimeraActivity;
    }

    public final void onPageFinished(WebView webView, String str) {
        GunsBrowserChimeraActivity gunsBrowserChimeraActivity = this.a;
        jjg jjg = GunsBrowserChimeraActivity.a;
        gunsBrowserChimeraActivity.e.setVisibility(8);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        GunsBrowserChimeraActivity gunsBrowserChimeraActivity = this.a;
        jjg jjg = GunsBrowserChimeraActivity.a;
        gunsBrowserChimeraActivity.e.setVisibility(0);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        GunsBrowserChimeraActivity gunsBrowserChimeraActivity = this.a;
        jjg jjg = GunsBrowserChimeraActivity.a;
        gunsBrowserChimeraActivity.e.setVisibility(8);
        this.a.d = true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (!parse.isHierarchical()) {
                GunsBrowserChimeraActivity gunsBrowserChimeraActivity = this.a;
                jjg jjg = GunsBrowserChimeraActivity.a;
                gunsBrowserChimeraActivity.a(str);
                return true;
            }
            String queryParameter = parse.getQueryParameter("gnotswvaction");
            if (!TextUtils.isEmpty(queryParameter)) {
                if ("close".equals(queryParameter)) {
                    GunsBrowserChimeraActivity gunsBrowserChimeraActivity2 = this.a;
                    jjg jjg2 = GunsBrowserChimeraActivity.a;
                    gunsBrowserChimeraActivity2.a(false);
                    this.a.finish();
                    return true;
                } else if ("browser".equals(queryParameter)) {
                    GunsBrowserChimeraActivity gunsBrowserChimeraActivity3 = this.a;
                    jjg jjg3 = GunsBrowserChimeraActivity.a;
                    gunsBrowserChimeraActivity3.a(str);
                    return true;
                }
            }
            if (!TextUtils.isEmpty(aynt.c())) {
                String path = parse.getPath();
                if (!TextUtils.isEmpty(path) && path.matches(aynt.c())) {
                    GunsBrowserChimeraActivity gunsBrowserChimeraActivity4 = this.a;
                    jjg jjg4 = GunsBrowserChimeraActivity.a;
                    gunsBrowserChimeraActivity4.a(str);
                    return true;
                }
            }
            GunsBrowserChimeraActivity gunsBrowserChimeraActivity5 = this.a;
            jjg jjg5 = GunsBrowserChimeraActivity.a;
            if (gunsBrowserChimeraActivity5.b(str)) {
                this.a.b.contains(parse.getHost());
                GunsBrowserChimeraActivity gunsBrowserChimeraActivity6 = this.a;
                gunsBrowserChimeraActivity6.a(gunsBrowserChimeraActivity6.b.contains(parse.getHost()));
                return false;
            }
            this.a.a(str);
        }
        return true;
    }
}
