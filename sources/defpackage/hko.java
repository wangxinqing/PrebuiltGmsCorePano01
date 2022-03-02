package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: hko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hko extends hkf {
    public static final /* synthetic */ int b = 0;
    private static final iwd c = hir.a("ListOperation");
    private final hju d;
    private final int e;
    private final Bundle f;

    public hko(hju hju, Account account, int i, Bundle bundle) {
        super("List", account);
        iva.a((Object) hju);
        this.d = hju;
        this.e = i;
        this.f = bundle;
    }

    public final void a(Status status) {
        try {
            this.d.a(new hkc(status, amzy.h()).b());
        } catch (IOException e2) {
            c.a((Throwable) e2);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r26.d.a(new defpackage.hkc(com.google.android.gms.common.api.Status.a, defpackage.amzy.a((java.util.Collection) defpackage.amym.a((java.lang.Iterable) r0).a(defpackage.hkn.a).b())).b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01fd, code lost:
        throw new defpackage.hjm(1025, "Internal error.", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r27) {
        /*
            r26 = this;
            r1 = r26
            fzi r0 = defpackage.hnj.b
            java.lang.Object r0 = r0.b()
            hnj r0 = (defpackage.hnj) r0
            pyv r2 = r1.a
            int r3 = r1.e
            boolean r2 = r0.a((defpackage.pyv) r2, (int) r3)
            if (r2 == 0) goto L_0x0205
            pyv r2 = r1.a
            int r5 = r1.e
            android.os.Bundle r6 = r1.f
            java.lang.String r7 = "where_string"
            java.lang.String r8 = ""
            java.lang.String r6 = r6.getString(r7, r8)
            defpackage.iva.a((java.lang.Object) r2)
            java.lang.Object r7 = r0.i
            monitor-enter(r7)
            java.lang.String r8 = " entries. [entry type: "
            java.lang.String r9 = ", number of invalid entries: "
            java.lang.String r10 = ", data initialization latency: "
            java.lang.String r11 = "ms, cryptographer retrival latency: "
            java.lang.String r12 = "ms, database query latency: "
            java.lang.String r13 = "ms, data conversion latency: "
            java.lang.String r14 = "ms]"
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0202 }
            r0.a(r2)     // Catch:{ all -> 0x0202 }
            hnh r4 = r0.f     // Catch:{ all -> 0x0202 }
            amri r4 = r4.c(r2)     // Catch:{ all -> 0x0202 }
            boolean r17 = r4.a()     // Catch:{ all -> 0x0202 }
            if (r17 == 0) goto L_0x01c9
            java.lang.Object r4 = r4.b()     // Catch:{ all -> 0x01fe }
            aqpc r4 = (defpackage.aqpc) r4     // Catch:{ all -> 0x01fe }
            hjg r4 = defpackage.hjh.a(r5)     // Catch:{ all -> 0x01fe }
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01fe }
            amri r3 = r0.a((defpackage.hjg) r4, (defpackage.pyv) r2)     // Catch:{ all -> 0x01fe }
            long r19 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01fe }
            hnl r0 = r0.g     // Catch:{ all -> 0x01fe }
            amri r21 = defpackage.hlj.a(r5)     // Catch:{ all -> 0x01fe }
            boolean r22 = r21.a()     // Catch:{ all -> 0x01fe }
            if (r22 == 0) goto L_0x0121
            java.lang.Object r22 = r21.b()     // Catch:{ all -> 0x01fe }
            r1 = r22
            hlj r1 = (defpackage.hlj) r1     // Catch:{ all -> 0x01fe }
            r0.a(r1, r2, r5)     // Catch:{ all -> 0x01fe }
            hlq r0 = r0.d     // Catch:{ all -> 0x01fe }
            java.lang.Object r1 = r21.b()     // Catch:{ all -> 0x01fe }
            hlj r1 = (defpackage.hlj) r1     // Catch:{ all -> 0x01fe }
            hle r0 = r0.b     // Catch:{ all -> 0x01fe }
            android.database.sqlite.SQLiteDatabase r0 = r0.a()     // Catch:{ all -> 0x01fe }
            r21 = r3
            java.lang.String r3 = "sync_entities"
            java.lang.String r1 = r1.a()     // Catch:{ all -> 0x01fe }
            java.lang.String r22 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x01fe }
            r23 = r4
            int r4 = r22.length()     // Catch:{ all -> 0x01fe }
            r22 = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            int r4 = r4 + 149
            r14.<init>(r4)     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = "SELECT E.* FROM "
            r14.append(r4)     // Catch:{ all -> 0x01fe }
            r14.append(r3)     // Catch:{ all -> 0x01fe }
            java.lang.String r3 = " AS E INNER JOIN "
            r14.append(r3)     // Catch:{ all -> 0x01fe }
            r14.append(r1)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = " AS E_IDX ON E.id=E_IDX.id AND E.account=E_IDX.account WHERE E_IDX.account=? AND E.is_deleted_locally=0"
            r14.append(r1)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x01fe }
            boolean r3 = defpackage.amrk.a((java.lang.String) r6)     // Catch:{ all -> 0x01fe }
            if (r3 != 0) goto L_0x00ea
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x01fe }
            int r3 = r3.length()     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x01fe }
            int r4 = r4.length()     // Catch:{ all -> 0x01fe }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            int r3 = r3 + 7
            int r3 = r3 + r4
            r14.<init>(r3)     // Catch:{ all -> 0x01fe }
            r14.append(r1)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = " AND ("
            r14.append(r1)     // Catch:{ all -> 0x01fe }
            r14.append(r6)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = ")"
            r14.append(r1)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x01fe }
        L_0x00ea:
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0118 }
            java.lang.String r2 = r2.d     // Catch:{ SQLiteException -> 0x0118 }
            r4 = 0
            r3[r4] = r2     // Catch:{ SQLiteException -> 0x0118 }
            android.database.Cursor r1 = r0.rawQuery(r1, r3)     // Catch:{ SQLiteException -> 0x0118 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0113 }
            r0.<init>()     // Catch:{ all -> 0x0113 }
            r1.moveToFirst()     // Catch:{ all -> 0x0113 }
        L_0x00fe:
            boolean r2 = r1.isAfterLast()     // Catch:{ all -> 0x0113 }
            if (r2 != 0) goto L_0x010f
            hln r2 = defpackage.hls.a(r1)     // Catch:{ all -> 0x0113 }
            r0.add(r2)     // Catch:{ all -> 0x0113 }
            r1.moveToNext()     // Catch:{ all -> 0x0113 }
            goto L_0x00fe
        L_0x010f:
            r1.close()     // Catch:{ all -> 0x01fe }
            goto L_0x012d
        L_0x0113:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x01fe }
            throw r0     // Catch:{ all -> 0x01fe }
        L_0x0118:
            r0 = move-exception
            hjm r1 = new hjm     // Catch:{ all -> 0x01fe }
            r2 = 769(0x301, float:1.078E-42)
            r1.<init>((int) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x01fe }
            throw r1     // Catch:{ all -> 0x01fe }
        L_0x0121:
            r21 = r3
            r23 = r4
            r22 = r14
            hls r0 = r0.c     // Catch:{ all -> 0x01fe }
            java.util.List r0 = r0.b(r2, r5)     // Catch:{ all -> 0x01fe }
        L_0x012d:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01fe }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x01fe }
            int r4 = r0.size()     // Catch:{ all -> 0x01fe }
            r3.<init>(r4)     // Catch:{ all -> 0x01fe }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x01fe }
            r6 = 0
        L_0x013f:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x019c
            long r23 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01fe }
            iwd r0 = defpackage.hnj.a     // Catch:{ all -> 0x01fe }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r4.<init>()     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = "Listed "
            r4.append(r14)     // Catch:{ all -> 0x01fe }
            int r14 = r3.size()     // Catch:{ all -> 0x01fe }
            r4.append(r14)     // Catch:{ all -> 0x01fe }
            r4.append(r8)     // Catch:{ all -> 0x01fe }
            r4.append(r5)     // Catch:{ all -> 0x01fe }
            r4.append(r9)     // Catch:{ all -> 0x01fe }
            r4.append(r6)     // Catch:{ all -> 0x01fe }
            r4.append(r10)     // Catch:{ all -> 0x01fe }
            long r5 = r17 - r15
            r4.append(r5)     // Catch:{ all -> 0x01fe }
            r4.append(r11)     // Catch:{ all -> 0x01fe }
            long r5 = r19 - r17
            r4.append(r5)     // Catch:{ all -> 0x01fe }
            r4.append(r12)     // Catch:{ all -> 0x01fe }
            long r5 = r1 - r19
            r4.append(r5)     // Catch:{ all -> 0x01fe }
            r4.append(r13)     // Catch:{ all -> 0x01fe }
            long r1 = r23 - r1
            r4.append(r1)     // Catch:{ all -> 0x01fe }
            r14 = r22
            r4.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x01fe }
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01fe }
            r0.b(r1, r2)     // Catch:{ all -> 0x01fe }
            amzy r0 = defpackage.amzy.a((java.util.Collection) r3)     // Catch:{ all -> 0x01fe }
            goto L_0x01cd
        L_0x019c:
            r14 = r22
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x01fe }
            hln r0 = (defpackage.hln) r0     // Catch:{ all -> 0x01fe }
            r24 = r1
            r2 = r21
            r1 = r23
            hjc r0 = r1.a((defpackage.hln) r0, (defpackage.amri) r2)     // Catch:{ hji -> 0x01bc, hjm -> 0x01ba }
            r3.add(r0)     // Catch:{ hji -> 0x01bc, hjm -> 0x01ba }
            r23 = r1
            r21 = r2
            r22 = r14
            r1 = r24
            goto L_0x013f
        L_0x01ba:
            r0 = move-exception
            goto L_0x01bd
        L_0x01bc:
            r0 = move-exception
        L_0x01bd:
            int r6 = r6 + 1
            r23 = r1
            r21 = r2
            r22 = r14
            r1 = r24
            goto L_0x013f
        L_0x01c9:
            amzy r0 = defpackage.amzy.h()     // Catch:{ all -> 0x01fe }
        L_0x01cd:
            monitor-exit(r7)     // Catch:{ all -> 0x01fe }
            amym r0 = defpackage.amym.a((java.lang.Iterable) r0)
            amqy r1 = defpackage.hkn.a
            amym r0 = r0.a((defpackage.amqy) r1)
            amzy r0 = r0.b()
            r1 = r26
            hju r2 = r1.d     // Catch:{ IOException -> 0x01f3 }
            hkc r3 = new hkc     // Catch:{ IOException -> 0x01f3 }
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.a     // Catch:{ IOException -> 0x01f3 }
            amzy r0 = defpackage.amzy.a((java.util.Collection) r0)     // Catch:{ IOException -> 0x01f3 }
            r3.<init>(r4, r0)     // Catch:{ IOException -> 0x01f3 }
            android.os.Bundle r0 = r3.b()     // Catch:{ IOException -> 0x01f3 }
            r2.a(r0)     // Catch:{ IOException -> 0x01f3 }
            return
        L_0x01f3:
            r0 = move-exception
            hjm r2 = new hjm
            r3 = 1025(0x401, float:1.436E-42)
            java.lang.String r4 = "Internal error."
            r2.<init>(r3, r4, r0)
            throw r2
        L_0x01fe:
            r0 = move-exception
            r1 = r26
            goto L_0x0203
        L_0x0202:
            r0 = move-exception
        L_0x0203:
            monitor-exit(r7)     // Catch:{ all -> 0x0202 }
            throw r0
        L_0x0205:
            hjm r0 = new hjm
            java.util.Locale r2 = java.util.Locale.US
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r1.e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            r4 = 1794(0x702, float:2.514E-42)
            java.lang.String r5 = "Data of type %d is not subscribed."
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)
            r0.<init>((int) r4, (java.lang.String) r2)
            goto L_0x0222
        L_0x0221:
            throw r0
        L_0x0222:
            goto L_0x0221
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hko.b(android.content.Context):void");
    }
}
