package defpackage;

import android.util.Log;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* renamed from: bavy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavy implements Runnable {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ CronetException b;
    final /* synthetic */ bavz c;

    public bavy(bavz bavz, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.c = bavz;
        this.a = urlResponseInfo;
        this.b = cronetException;
    }

    public final void run() {
        try {
            bavz bavz = this.c;
            bavz.a.onFailed(bavz.d, this.a, this.b);
        } catch (Exception e) {
            Log.e(bawc.a, "Exception in onFailed method", e);
        }
    }
}
