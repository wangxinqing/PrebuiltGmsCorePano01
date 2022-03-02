package defpackage;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;

/* renamed from: bfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bfg extends FilterInputStream {
    private final HttpURLConnection a;

    public final void close() {
        super.close();
        this.a.disconnect();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bfg(java.net.HttpURLConnection r2) {
        /*
            r1 = this;
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ IOException -> 0x0005 }
            goto L_0x000a
        L_0x0005:
            r0 = move-exception
            java.io.InputStream r0 = r2.getErrorStream()
        L_0x000a:
            r1.<init>(r0)
            r1.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfg.<init>(java.net.HttpURLConnection):void");
    }
}
