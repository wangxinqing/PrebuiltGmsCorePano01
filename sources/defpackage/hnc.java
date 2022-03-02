package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: hnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hnc {
    public static final iwd a = hir.b("AffiliationManager");
    public static final fzi b = new hnb();
    public final hlb c = ((hlb) hlb.a.b());
    public final hlh d = ((hlh) hlh.a.b());
    public final hmq e;
    public final Object f;
    private final Context g;
    private final hkx h = ((hkx) hkx.i.b());
    private final PackageManager i;
    private final Random j;

    public hnc(Context context) {
        this.g = context;
        this.e = new hmq(context);
        this.i = context.getPackageManager();
        this.f = new Object();
        this.j = new SecureRandom();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f0 A[Catch:{ all -> 0x019b, all -> 0x0196, RuntimeException -> 0x00de }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a0 A[Catch:{ all -> 0x019b, all -> 0x0196, RuntimeException -> 0x00de }, DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f
            monitor-enter(r0)
            java.lang.Object r1 = r12.f     // Catch:{ all -> 0x01a7 }
            monitor-enter(r1)     // Catch:{ all -> 0x01a7 }
            agvx r2 = defpackage.his.q     // Catch:{ all -> 0x01a4 }
            java.lang.Object r2 = r2.c()     // Catch:{ all -> 0x01a4 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x01a4 }
            hkx r3 = r12.h     // Catch:{ all -> 0x01a4 }
            pyv r4 = defpackage.pyv.a     // Catch:{ all -> 0x01a4 }
            hlv r5 = defpackage.hkx.e     // Catch:{ all -> 0x01a4 }
            java.lang.Object r3 = r3.a((defpackage.pyv) r4, (defpackage.hlv) r5)     // Catch:{ all -> 0x01a4 }
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x01a4 }
            if (r3 != 0) goto L_0x002a
            r12.b()     // Catch:{ all -> 0x01a4 }
            hkx r3 = r12.h     // Catch:{ all -> 0x01a4 }
            pyv r4 = defpackage.pyv.a     // Catch:{ all -> 0x01a4 }
            hlv r5 = defpackage.hkx.e     // Catch:{ all -> 0x01a4 }
            r3.a(r4, r5, r2)     // Catch:{ all -> 0x01a4 }
        L_0x002a:
            monitor-exit(r1)     // Catch:{ all -> 0x01a4 }
            hkx r1 = r12.h     // Catch:{ all -> 0x01a7 }
            pyv r2 = defpackage.pyv.a     // Catch:{ all -> 0x01a7 }
            hlv r3 = defpackage.hkx.d     // Catch:{ all -> 0x01a7 }
            java.lang.Object r1 = r1.a((defpackage.pyv) r2, (defpackage.hlv) r3)     // Catch:{ all -> 0x01a7 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x01a7 }
            long r1 = r1.longValue()     // Catch:{ all -> 0x01a7 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01a7 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x01a2
            r1 = 0
            android.content.pm.PackageManager r2 = r12.i     // Catch:{ RuntimeException -> 0x00de }
            java.util.List r2 = r2.getInstalledPackages(r1)     // Catch:{ RuntimeException -> 0x00de }
            boolean r3 = defpackage.awsf.b()     // Catch:{ all -> 0x01a7 }
            if (r3 == 0) goto L_0x0063
            android.content.Context r3 = r12.g     // Catch:{ all -> 0x01a7 }
            java.lang.String r4 = "com.google.android.gms"
            java.util.List r3 = defpackage.jgu.d(r3, r4)     // Catch:{ all -> 0x01a7 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x01a7 }
            if (r3 != 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            ampu r2 = defpackage.ampu.a     // Catch:{ all -> 0x01a7 }
            goto L_0x00ea
        L_0x0063:
            amzt r3 = defpackage.amzy.j()     // Catch:{ all -> 0x01a7 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x01a7 }
        L_0x006b:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x01a7 }
            if (r4 == 0) goto L_0x00c5
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x01a7 }
            android.content.pm.PackageInfo r4 = (android.content.pm.PackageInfo) r4     // Catch:{ all -> 0x01a7 }
            boolean r5 = defpackage.awsf.b()     // Catch:{ all -> 0x01a7 }
            if (r5 == 0) goto L_0x008d
            java.lang.String r5 = "com.android.vending"
            android.content.pm.PackageManager r6 = r12.i     // Catch:{ all -> 0x01a7 }
            java.lang.String r7 = r4.packageName     // Catch:{ all -> 0x01a7 }
            java.lang.String r6 = r6.getInstallerPackageName(r7)     // Catch:{ all -> 0x01a7 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x01a7 }
            if (r5 == 0) goto L_0x006b
        L_0x008d:
            android.content.Context r5 = r12.g     // Catch:{ all -> 0x01a7 }
            java.lang.String r6 = r4.packageName     // Catch:{ all -> 0x01a7 }
            amri r5 = defpackage.hiq.a(r5, r6)     // Catch:{ all -> 0x01a7 }
            boolean r6 = r5.a()     // Catch:{ all -> 0x01a7 }
            if (r6 != 0) goto L_0x00bb
            iwd r5 = a     // Catch:{ all -> 0x01a7 }
            java.lang.String r6 = "Failed to get password domain for package: "
            java.lang.String r4 = r4.packageName     // Catch:{ all -> 0x01a7 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x01a7 }
            int r7 = r4.length()     // Catch:{ all -> 0x01a7 }
            if (r7 != 0) goto L_0x00b1
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x01a7 }
            r4.<init>(r6)     // Catch:{ all -> 0x01a7 }
            goto L_0x00b5
        L_0x00b1:
            java.lang.String r4 = r6.concat(r4)     // Catch:{ all -> 0x01a7 }
        L_0x00b5:
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x01a7 }
            r5.c(r4, r6)     // Catch:{ all -> 0x01a7 }
            goto L_0x006b
        L_0x00bb:
            java.lang.Object r4 = r5.b()     // Catch:{ all -> 0x01a7 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x01a7 }
            r3.c(r4)     // Catch:{ all -> 0x01a7 }
            goto L_0x006b
        L_0x00c5:
            boolean r2 = defpackage.awsf.b()     // Catch:{ all -> 0x01a7 }
            if (r2 == 0) goto L_0x00d5
            amzy r2 = r3.a()     // Catch:{ all -> 0x01a7 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x01a7 }
            if (r2 != 0) goto L_0x005f
        L_0x00d5:
            amzy r2 = r3.a()     // Catch:{ all -> 0x01a7 }
            amri r2 = defpackage.amri.b(r2)     // Catch:{ all -> 0x01a7 }
            goto L_0x00ea
        L_0x00de:
            r2 = move-exception
            iwd r2 = a     // Catch:{ all -> 0x01a7 }
            java.lang.String r3 = "Installed-packages fetch failed because Binder transaction buffer is full"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x01a7 }
            r2.e(r3, r4)     // Catch:{ all -> 0x01a7 }
            ampu r2 = defpackage.ampu.a     // Catch:{ all -> 0x01a7 }
        L_0x00ea:
            boolean r3 = r2.a()     // Catch:{ all -> 0x01a7 }
            if (r3 == 0) goto L_0x01a0
            iwd r3 = a     // Catch:{ all -> 0x01a7 }
            java.lang.String r4 = "Fetching affiliations from the server."
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x01a7 }
            r3.c(r4, r5)     // Catch:{ all -> 0x01a7 }
            hmq r3 = r12.e     // Catch:{ all -> 0x01a7 }
            java.lang.Object r2 = r2.b()     // Catch:{ all -> 0x01a7 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x01a7 }
            auur r2 = r3.a(r2)     // Catch:{ all -> 0x01a7 }
            hlb r3 = r12.c     // Catch:{ all -> 0x01a7 }
            hle r3 = r3.b     // Catch:{ all -> 0x01a7 }
            android.database.sqlite.SQLiteDatabase r3 = r3.a()     // Catch:{ all -> 0x01a7 }
            r3.beginTransaction()     // Catch:{ all -> 0x01a7 }
            java.lang.String r4 = "affiliation_data"
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ all -> 0x019b }
            r6 = 0
            r3.delete(r4, r6, r5)     // Catch:{ all -> 0x019b }
            java.lang.String r4 = "affiliation_index"
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ all -> 0x019b }
            r3.delete(r4, r6, r5)     // Catch:{ all -> 0x019b }
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x019b }
            r3.endTransaction()     // Catch:{ all -> 0x01a7 }
            hlb r3 = r12.c     // Catch:{ all -> 0x01a7 }
            aucx r4 = r2.a     // Catch:{ all -> 0x01a7 }
            amzy r4 = defpackage.amzy.a((java.util.Collection) r4)     // Catch:{ all -> 0x01a7 }
            r3.a((java.util.List) r4)     // Catch:{ all -> 0x01a7 }
            hlh r3 = r12.d     // Catch:{ all -> 0x01a7 }
            hle r3 = r3.b     // Catch:{ all -> 0x01a7 }
            android.database.sqlite.SQLiteDatabase r3 = r3.a()     // Catch:{ all -> 0x01a7 }
            r3.beginTransaction()     // Catch:{ all -> 0x01a7 }
            java.lang.String r4 = "facet_group_data"
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ all -> 0x0196 }
            r3.delete(r4, r6, r5)     // Catch:{ all -> 0x0196 }
            java.lang.String r4 = "facet_group_index"
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0196 }
            r3.delete(r4, r6, r1)     // Catch:{ all -> 0x0196 }
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x0196 }
            r3.endTransaction()     // Catch:{ all -> 0x01a7 }
            hlh r1 = r12.d     // Catch:{ all -> 0x01a7 }
            aucx r2 = r2.b     // Catch:{ all -> 0x01a7 }
            r1.a(r2)     // Catch:{ all -> 0x01a7 }
            hkx r1 = r12.h     // Catch:{ all -> 0x01a7 }
            pyv r2 = defpackage.pyv.a     // Catch:{ all -> 0x01a7 }
            hlv r3 = defpackage.hkx.d     // Catch:{ all -> 0x01a7 }
            awrw r4 = defpackage.awrw.a     // Catch:{ all -> 0x01a7 }
            awrx r4 = r4.a()     // Catch:{ all -> 0x01a7 }
            long r4 = r4.a()     // Catch:{ all -> 0x01a7 }
            awrw r6 = defpackage.awrw.a     // Catch:{ all -> 0x01a7 }
            awrx r6 = r6.a()     // Catch:{ all -> 0x01a7 }
            long r6 = r6.b()     // Catch:{ all -> 0x01a7 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01a7 }
            long r10 = r4 - r6
            long r4 = r4 + r6
            r6 = 1
            long r4 = r4 + r6
            java.util.Random r6 = r12.j     // Catch:{ all -> 0x01a7 }
            double r6 = r6.nextDouble()     // Catch:{ all -> 0x01a7 }
            long r4 = r4 - r10
            double r4 = (double) r4
            java.lang.Double.isNaN(r4)
            double r6 = r6 * r4
            long r4 = java.lang.Math.round(r6)     // Catch:{ all -> 0x01a7 }
            long r10 = r10 + r4
            long r8 = r8 + r10
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x01a7 }
            r1.a(r2, r3, r4)     // Catch:{ all -> 0x01a7 }
            monitor-exit(r0)     // Catch:{ all -> 0x01a7 }
            return
        L_0x0196:
            r1 = move-exception
            r3.endTransaction()     // Catch:{ all -> 0x01a7 }
            throw r1     // Catch:{ all -> 0x01a7 }
        L_0x019b:
            r1 = move-exception
            r3.endTransaction()     // Catch:{ all -> 0x01a7 }
            throw r1     // Catch:{ all -> 0x01a7 }
        L_0x01a0:
            monitor-exit(r0)     // Catch:{ all -> 0x01a7 }
            return
        L_0x01a2:
            monitor-exit(r0)     // Catch:{ all -> 0x01a7 }
            return
        L_0x01a4:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01a4 }
            throw r2     // Catch:{ all -> 0x01a7 }
        L_0x01a7:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01a7 }
            goto L_0x01ab
        L_0x01aa:
            throw r1
        L_0x01ab:
            goto L_0x01aa
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnc.a():void");
    }

    public final void b() {
        this.h.a(pyv.a, hkx.d, 0L);
    }
}
