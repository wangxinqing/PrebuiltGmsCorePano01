package defpackage;

import org.chromium.net.UrlResponseInfo;

/* renamed from: bavt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavt implements bawd {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ String b;
    final /* synthetic */ bavz c;

    public bavt(bavz bavz, UrlResponseInfo urlResponseInfo, String str) {
        this.c = bavz;
        this.a = urlResponseInfo;
        this.b = str;
    }

    public final void a() {
        bavz bavz = this.c;
        bavz.a.onRedirectReceived(bavz.d, this.a, this.b);
    }
}
