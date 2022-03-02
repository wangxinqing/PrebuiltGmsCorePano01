package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: jwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jwl extends jxb {
    public static final clb a = new jwj();
    public jtv b;
    public Handler c;
    public final Object d = new Object();

    public jwl(jtv jtv, Looper looper) {
        iva.a((Object) jtv);
        this.b = jtv;
        iva.a((Object) looper);
        this.c = jwu.a(looper);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.contextmanager.ContextData r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            android.os.Handler r1 = r3.c     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0015
            jtv r2 = r3.b     // Catch:{ all -> 0x0017 }
            if (r2 == 0) goto L_0x0015
            jwk r2 = new jwk     // Catch:{ all -> 0x0017 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0017 }
            r1.post(r2)     // Catch:{ all -> 0x0017 }
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return
        L_0x0017:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwl.a(com.google.android.gms.contextmanager.ContextData):void");
    }
}
