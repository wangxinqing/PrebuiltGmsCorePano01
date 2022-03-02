package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: hkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hkq extends hkf {
    private static final anax b = anax.a((Object) 2, (Object) 1);
    private final ifu c;
    private final int d;
    private final Bundle e;

    public hkq(ifu ifu, Account account, int i, Bundle bundle) {
        super("Save", account);
        iva.a((Object) ifu);
        this.c = ifu;
        this.d = i;
        iva.a((Object) bundle);
        this.e = bundle;
    }

    public final void a(Status status) {
        this.c.a(status);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c5, code lost:
        if (((defpackage.hln) r4.b()).d.equals(r9.d) == false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r14) {
        /*
            r13 = this;
            anax r14 = b
            int r0 = r13.d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r14 = r14.contains(r0)
            r0 = 1793(0x701, float:2.513E-42)
            r1 = 1
            r2 = 0
            if (r14 == 0) goto L_0x015f
            fzi r14 = defpackage.hnj.b
            java.lang.Object r14 = r14.b()
            hnj r14 = (defpackage.hnj) r14
            pyv r3 = r13.a
            int r4 = r13.d
            boolean r3 = r14.a((defpackage.pyv) r3, (int) r4)
            if (r3 == 0) goto L_0x0145
            pyv r3 = r13.a     // Catch:{ hji -> 0x013e }
            int r4 = r13.d     // Catch:{ hji -> 0x013e }
            android.os.Bundle r5 = r13.e     // Catch:{ hji -> 0x013e }
            java.lang.String r6 = "entity"
            byte[] r5 = r5.getByteArray(r6)     // Catch:{ hji -> 0x013e }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ hji -> 0x013e }
            defpackage.iva.a((java.lang.Object) r5)     // Catch:{ hji -> 0x013e }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ hji -> 0x013e }
            java.lang.Object r8 = r14.i     // Catch:{ hji -> 0x013e }
            monitor-enter(r8)     // Catch:{ hji -> 0x013e }
            r14.a(r3)     // Catch:{ all -> 0x013b }
            hnh r9 = r14.f     // Catch:{ all -> 0x013b }
            amri r9 = r9.c(r3)     // Catch:{ all -> 0x013b }
            aqpc r10 = defpackage.aqpc.KEYSTORE_PASSPHRASE     // Catch:{ all -> 0x013b }
            java.lang.Object r9 = r9.a((java.lang.Object) r10)     // Catch:{ all -> 0x013b }
            aqpc r9 = (defpackage.aqpc) r9     // Catch:{ all -> 0x013b }
            hjg r9 = defpackage.hjh.a(r4)     // Catch:{ all -> 0x013b }
            amri r10 = r14.a((defpackage.hjg) r9, (defpackage.pyv) r3)     // Catch:{ all -> 0x013b }
            hjc r5 = r9.a((byte[]) r5)     // Catch:{ all -> 0x013b }
            hls r11 = r14.e     // Catch:{ all -> 0x013b }
            java.lang.String r12 = r5.b     // Catch:{ all -> 0x013b }
            amzy r12 = defpackage.amzy.a((java.lang.Object) r12)     // Catch:{ all -> 0x013b }
            java.util.List r4 = r11.a((defpackage.pyv) r3, (int) r4, (java.util.List) r12)     // Catch:{ all -> 0x013b }
            boolean r11 = r4.isEmpty()     // Catch:{ all -> 0x013b }
            if (r11 != 0) goto L_0x0077
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x013b }
            hln r4 = (defpackage.hln) r4     // Catch:{ all -> 0x013b }
            amri r4 = defpackage.amri.b(r4)     // Catch:{ all -> 0x013b }
            goto L_0x0079
        L_0x0077:
            ampu r4 = defpackage.ampu.a     // Catch:{ all -> 0x013b }
        L_0x0079:
            boolean r11 = r4.a()     // Catch:{ all -> 0x013b }
            if (r11 != 0) goto L_0x009e
            audx r11 = r5.c     // Catch:{ all -> 0x013b }
            audx r10 = r9.c(r11, r10)     // Catch:{ all -> 0x013b }
            hlm r11 = new hlm     // Catch:{ all -> 0x013b }
            r11.<init>()     // Catch:{ all -> 0x013b }
            audx r12 = r5.c     // Catch:{ all -> 0x013b }
            java.lang.String r12 = r9.a((defpackage.audx) r12)     // Catch:{ all -> 0x013b }
            r11.a = r12     // Catch:{ all -> 0x013b }
            int r9 = r9.b     // Catch:{ all -> 0x013b }
            r11.a(r9)     // Catch:{ all -> 0x013b }
            auay r9 = r10.au()     // Catch:{ all -> 0x013b }
            r11.b = r9     // Catch:{ all -> 0x013b }
            goto L_0x00a8
        L_0x009e:
            java.lang.Object r11 = r4.b()     // Catch:{ all -> 0x013b }
            hln r11 = (defpackage.hln) r11     // Catch:{ all -> 0x013b }
            hlm r11 = r9.a(r11, r5, r10)     // Catch:{ all -> 0x013b }
        L_0x00a8:
            r11.e = r2     // Catch:{ all -> 0x013b }
            r11.d = r1     // Catch:{ all -> 0x013b }
            hln r9 = r11.a()     // Catch:{ all -> 0x013b }
            boolean r10 = r4.a()     // Catch:{ all -> 0x013b }
            if (r10 != 0) goto L_0x00b7
            goto L_0x00c7
        L_0x00b7:
            java.lang.Object r4 = r4.b()     // Catch:{ all -> 0x013b }
            hln r4 = (defpackage.hln) r4     // Catch:{ all -> 0x013b }
            auay r4 = r4.d     // Catch:{ all -> 0x013b }
            auay r10 = r9.d     // Catch:{ all -> 0x013b }
            boolean r4 = r4.equals(r10)     // Catch:{ all -> 0x013b }
            if (r4 != 0) goto L_0x011e
        L_0x00c7:
            hls r4 = r14.e     // Catch:{ all -> 0x013b }
            hln[] r10 = new defpackage.hln[r1]     // Catch:{ all -> 0x013b }
            r10[r2] = r9     // Catch:{ all -> 0x013b }
            r4.a((defpackage.pyv) r3, (defpackage.hln[]) r10)     // Catch:{ all -> 0x013b }
            hnl r4 = r14.g     // Catch:{ all -> 0x013b }
            int r9 = r5.a     // Catch:{ all -> 0x013b }
            amri r9 = defpackage.hlj.a(r9)     // Catch:{ all -> 0x013b }
            boolean r10 = r9.a()     // Catch:{ all -> 0x013b }
            if (r10 != 0) goto L_0x00df
            goto L_0x0106
        L_0x00df:
            java.lang.Object r10 = r4.f     // Catch:{ all -> 0x013b }
            monitor-enter(r10)     // Catch:{ all -> 0x013b }
            hnh r11 = r4.e     // Catch:{ all -> 0x011b }
            amri r11 = r11.c(r3)     // Catch:{ all -> 0x011b }
            aqpc r12 = defpackage.aqpc.KEYSTORE_PASSPHRASE     // Catch:{ all -> 0x011b }
            java.lang.Object r11 = r11.a((java.lang.Object) r12)     // Catch:{ all -> 0x011b }
            aqpc r11 = (defpackage.aqpc) r11     // Catch:{ all -> 0x011b }
            int r11 = r5.a     // Catch:{ all -> 0x011b }
            hjg r11 = defpackage.hjh.a(r11)     // Catch:{ all -> 0x011b }
            hlq r4 = r4.d     // Catch:{ all -> 0x011b }
            java.lang.Object r9 = r9.b()     // Catch:{ all -> 0x011b }
            hlj r9 = (defpackage.hlj) r9     // Catch:{ all -> 0x011b }
            amzy r5 = defpackage.hnl.a((defpackage.hjg) r11, (defpackage.hjc) r5)     // Catch:{ all -> 0x011b }
            r4.a(r9, r3, r5)     // Catch:{ all -> 0x011b }
            monitor-exit(r10)     // Catch:{ all -> 0x011b }
        L_0x0106:
            hnu r14 = r14.h     // Catch:{ all -> 0x013b }
            hnv r4 = new hnv     // Catch:{ all -> 0x013b }
            r4.<init>()     // Catch:{ all -> 0x013b }
            r4.a = r3     // Catch:{ all -> 0x013b }
            r3 = 401(0x191, float:5.62E-43)
            r4.b = r3     // Catch:{ all -> 0x013b }
            hnw r3 = r4.a()     // Catch:{ all -> 0x013b }
            r14.a(r3)     // Catch:{ all -> 0x013b }
            goto L_0x011e
        L_0x011b:
            r14 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x011b }
            throw r14     // Catch:{ all -> 0x013b }
        L_0x011e:
            monitor-exit(r8)     // Catch:{ all -> 0x013b }
            iwd r14 = defpackage.hnj.a     // Catch:{ hji -> 0x013e }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ hji -> 0x013e }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ hji -> 0x013e }
            long r3 = r3 - r6
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ hji -> 0x013e }
            r1[r2] = r3     // Catch:{ hji -> 0x013e }
            java.lang.String r2 = "save() [Latency: %dms]"
            r14.b(r2, r1)     // Catch:{ hji -> 0x013e }
            ifu r14 = r13.c
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
            r14.a(r0)
            return
        L_0x013b:
            r14 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x013b }
            throw r14     // Catch:{ hji -> 0x013e }
        L_0x013e:
            r14 = move-exception
            hjm r1 = new hjm
            r1.<init>((int) r0, (java.lang.Throwable) r14)
            throw r1
        L_0x0145:
            hjm r14 = new hjm
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r3 = r13.d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1794(0x702, float:2.514E-42)
            java.lang.String r3 = "Data of type %d is not subscribed."
            java.lang.String r0 = java.lang.String.format(r0, r3, r1)
            r14.<init>((int) r2, (java.lang.String) r0)
            throw r14
        L_0x015f:
            hjm r14 = new hjm
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r4 = r13.d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r2 = "Not allowed to save data of type %d."
            java.lang.String r1 = java.lang.String.format(r3, r2, r1)
            r14.<init>((int) r0, (java.lang.String) r1)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkq.b(android.content.Context):void");
    }
}
