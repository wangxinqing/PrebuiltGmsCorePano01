package defpackage;

import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;
import com.google.location.nearby.direct.service.NearbyDirectChimeraService;

/* renamed from: asjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asjw extends asgy {
    public askc a;
    final /* synthetic */ NearbyDirectChimeraService b;

    public asjw(NearbyDirectChimeraService nearbyDirectChimeraService) {
        this.b = nearbyDirectChimeraService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r0.f.await(5000, java.util.concurrent.TimeUnit.MILLISECONDS) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void a() {
        /*
            r7 = this;
            monitor-enter(r7)
            askc r0 = r7.a     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.h     // Catch:{ all -> 0x004d }
            boolean r0 = r0.get()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            monitor-exit(r7)
            return
        L_0x0010:
            askc r0 = r7.a     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0015
            goto L_0x003e
        L_0x0015:
            r1 = 5000(0x1388, double:2.4703E-320)
            java.util.concurrent.CountDownLatch r0 = r0.f     // Catch:{ InterruptedException -> 0x0022 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0022 }
            boolean r0 = r0.await(r1, r3)     // Catch:{ InterruptedException -> 0x0022 }
            if (r0 != 0) goto L_0x003e
            goto L_0x0023
        L_0x0022:
            r0 = move-exception
        L_0x0023:
            jjg r0 = defpackage.asil.a     // Catch:{ all -> 0x004d }
            anie r0 = r0.b()     // Catch:{ all -> 0x004d }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x004d }
            java.lang.String r3 = "asjw"
            java.lang.String r4 = "a"
            r5 = 221(0xdd, float:3.1E-43)
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r4, (int) r5, (java.lang.String) r6)     // Catch:{ all -> 0x004d }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x004d }
            java.lang.String r3 = "NearbyDirect failed to shut down after %sms"
            r0.a((java.lang.String) r3, (long) r1)     // Catch:{ all -> 0x004d }
        L_0x003e:
            jjg r0 = defpackage.asil.a     // Catch:{ all -> 0x004d }
            askc r0 = new askc     // Catch:{ all -> 0x004d }
            com.google.location.nearby.direct.service.NearbyDirectChimeraService r1 = r7.b     // Catch:{ all -> 0x004d }
            android.os.Handler r2 = r1.a     // Catch:{ all -> 0x004d }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x004d }
            r7.a = r0     // Catch:{ all -> 0x004d }
            monitor-exit(r7)
            return
        L_0x004d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asjw.a():void");
    }

    public final OperationResponse b(OperationRequest operationRequest) {
        askd.a(this.b);
        a();
        return this.a.b(operationRequest);
    }

    public final boolean c(OperationRequest operationRequest) {
        askd.a(this.b);
        a();
        return this.a.c(operationRequest);
    }

    public final boolean d(OperationRequest operationRequest) {
        askd.a(this.b);
        a();
        return this.a.d(operationRequest);
    }

    public final OperationResponse a(OperationRequest operationRequest) {
        askd.a(this.b);
        a();
        return this.a.a(operationRequest);
    }

    public final OperationResponse a(String str) {
        askd.a(this.b);
        a();
        return this.a.a(str);
    }
}
