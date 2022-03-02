package defpackage;

import com.google.android.gms.auth.login.CustomWebView;

/* renamed from: gpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gpl implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ CustomWebView b;

    public gpl(String str, CustomWebView customWebView) {
        this.a = str;
        this.b = customWebView;
    }

    public final void run() {
        gqa.d.b("runJavascript: %s", this.a);
        CustomWebView customWebView = this.b;
        String valueOf = String.valueOf(this.a);
        customWebView.loadUrl(valueOf.length() == 0 ? new String("javascript:") : "javascript:".concat(valueOf));
    }
}
