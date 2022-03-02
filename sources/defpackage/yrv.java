package defpackage;

import android.util.Pair;

/* renamed from: yrv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yrv {
    private static yrv d;
    public final oi a = new oi(20);
    public final oi b = new oi(20);
    public final oi c = new oi(20);

    public static final String a(String str) {
        return str == null ? "<<null account>>" : str;
    }

    public final void b(String str, String str2) {
        synchronized (this.a) {
            this.a.b(Pair.create(a(str), str2));
        }
    }

    public static yrv a() {
        yrv yrv;
        synchronized (yrv.class) {
            if (d == null) {
                d = new yrv();
            }
            yrv = d;
        }
        return yrv;
    }

    public final yrx a(String str, String str2) {
        yrx yrx;
        synchronized (this.a) {
            yrx = (yrx) this.a.a((Object) Pair.create(a(str), str2));
        }
        return yrx;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (defpackage.yrw.a(r1) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.zcr a(java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            oi r0 = r3.a
            monitor-enter(r0)
            java.lang.String r4 = a(r4)     // Catch:{ all -> 0x0043 }
            android.util.Pair r4 = android.util.Pair.create(r4, r5)     // Catch:{ all -> 0x0043 }
            oi r5 = r3.a     // Catch:{ all -> 0x0043 }
            java.lang.Object r5 = r5.a((java.lang.Object) r4)     // Catch:{ all -> 0x0043 }
            yrx r5 = (defpackage.yrx) r5     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x0040
            zcr r1 = r5.a     // Catch:{ all -> 0x0043 }
            if (r6 == 0) goto L_0x0020
            boolean r2 = defpackage.yrw.a((defpackage.zcr) r1)     // Catch:{ all -> 0x0043 }
            if (r2 != 0) goto L_0x0020
            goto L_0x0028
        L_0x0020:
            if (r6 != 0) goto L_0x003e
            boolean r2 = defpackage.yrw.a((defpackage.zcr) r1)     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x003e
        L_0x0028:
            r2 = r1
            com.google.android.gms.plus.service.pos.PlusonesEntity r2 = (com.google.android.gms.plus.service.pos.PlusonesEntity) r2     // Catch:{ all -> 0x0043 }
            defpackage.yrw.a((com.google.android.gms.plus.service.pos.PlusonesEntity) r2, (boolean) r6)     // Catch:{ all -> 0x0043 }
            if (r6 != 0) goto L_0x0032
            r6 = -1
            goto L_0x0033
        L_0x0032:
            r6 = 1
        L_0x0033:
            r2 = r1
            com.google.android.gms.plus.service.pos.PlusonesEntity r2 = (com.google.android.gms.plus.service.pos.PlusonesEntity) r2     // Catch:{ all -> 0x0043 }
            defpackage.yrw.a((com.google.android.gms.plus.service.pos.PlusonesEntity) r2, (int) r6)     // Catch:{ all -> 0x0043 }
            oi r6 = r3.a     // Catch:{ all -> 0x0043 }
            r6.a((java.lang.Object) r4, (java.lang.Object) r5)     // Catch:{ all -> 0x0043 }
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            return r1
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            r4 = 0
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrv.a(java.lang.String, java.lang.String, boolean):zcr");
    }
}
