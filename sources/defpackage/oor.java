package defpackage;

import android.webkit.WebView;

/* renamed from: oor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oor implements Runnable {
    final /* synthetic */ WebView a;
    final /* synthetic */ oos b;

    public oor(oos oos, WebView webView) {
        this.b = oos;
        this.a = webView;
    }

    public final void run() {
        int contentHeight = this.a.getContentHeight();
        if (contentHeight != 0) {
            this.a.scrollTo(0, (int) (((float) contentHeight) * this.b.b.d));
            this.b.b.d = 0.0f;
            return;
        }
        this.a.postDelayed(this, 10);
    }
}
