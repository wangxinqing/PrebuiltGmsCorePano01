package defpackage;

import android.webkit.JavascriptInterface;

/* renamed from: gnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gnt {
    private final gns a;

    public gnt(gns gns) {
        this.a = gns;
    }

    @JavascriptInterface
    public void setConsentResult(String str) {
        ((gnr) this.a).g.a(str);
    }
}
