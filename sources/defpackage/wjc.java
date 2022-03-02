package defpackage;

import android.webkit.WebView;
import com.google.android.gms.notifications.GunsBrowserChimeraActivity;

/* renamed from: wjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class wjc implements Runnable {
    private final GunsBrowserChimeraActivity a;
    private final String b;

    public wjc(GunsBrowserChimeraActivity gunsBrowserChimeraActivity, String str) {
        this.a = gunsBrowserChimeraActivity;
        this.b = str;
    }

    public final void run() {
        GunsBrowserChimeraActivity gunsBrowserChimeraActivity = this.a;
        String str = this.b;
        WebView webView = gunsBrowserChimeraActivity.c;
        String valueOf = String.valueOf(str);
        webView.loadUrl(valueOf.length() == 0 ? new String("javascript:") : "javascript:".concat(valueOf));
    }
}
