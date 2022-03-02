package defpackage;

import android.util.Log;
import org.chromium.net.UrlResponseInfo;

/* renamed from: bavw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavw implements Runnable {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ bavz b;

    public bavw(bavz bavz, UrlResponseInfo urlResponseInfo) {
        this.b = bavz;
        this.a = urlResponseInfo;
    }

    public final void run() {
        try {
            bavz bavz = this.b;
            bavz.a.onCanceled(bavz.d, this.a);
        } catch (Exception e) {
            Log.e(bawc.a, "Exception in onCanceled method", e);
        }
    }
}
