package defpackage;

/* renamed from: szb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class szb implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ sze c;

    public szb(sze sze, String str, long j) {
        this.c = sze;
        this.a = str;
        this.b = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00db A[LOOP:0: B:29:0x00cd->B:33:0x00db, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            sze r0 = r13.c
            java.lang.String r1 = r13.a
            long r6 = r13.b
            r0.r()
            r0.s()
            r0.y()
            spj r2 = r0.h()
            sou r2 = r2.b(r1)
            r8 = 0
            if (r2 == 0) goto L_0x00bb
            java.lang.String r2 = r2.i()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0026
            goto L_0x00bb
        L_0x0026:
            spj r2 = r0.h()
            defpackage.iva.c(r1)
            r2.j()
            r2.h()
            r2.q()
            android.database.sqlite.SQLiteDatabase r3 = r2.e()
            r3.beginTransaction()
            defpackage.iva.c(r1)     // Catch:{ SQLiteException -> 0x0085 }
            r2.j()     // Catch:{ SQLiteException -> 0x0085 }
            r2.h()     // Catch:{ SQLiteException -> 0x0085 }
            r2.q()     // Catch:{ SQLiteException -> 0x0085 }
            r4 = 1
            r9 = -1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0057 }
            r4[r8] = r1     // Catch:{ SQLiteException -> 0x0057 }
            java.lang.String r5 = "select previous_install_count from app2 where app_id=? limit 1;"
            long r4 = r2.a((java.lang.String) r5, (java.lang.String[]) r4, (long) r9)     // Catch:{ SQLiteException -> 0x0057 }
            goto L_0x0068
        L_0x0057:
            r4 = move-exception
            sut r5 = r2.E()     // Catch:{ SQLiteException -> 0x0085 }
            sur r5 = r5.c     // Catch:{ SQLiteException -> 0x0085 }
            java.lang.String r11 = "Error reading previous install count. appId, error"
            java.lang.Object r12 = defpackage.sut.a((java.lang.String) r1)     // Catch:{ SQLiteException -> 0x0085 }
            r5.a(r11, r12, r4)     // Catch:{ SQLiteException -> 0x0085 }
            r4 = r9
        L_0x0068:
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x007d
            r2.j()     // Catch:{ SQLiteException -> 0x0081 }
            defpackage.iva.c(r1)     // Catch:{ SQLiteException -> 0x0081 }
            r2.h()     // Catch:{ SQLiteException -> 0x0081 }
            r2.q()     // Catch:{ SQLiteException -> 0x0081 }
            java.lang.String r4 = "previous_install_count"
            r2.e(r1, r4)     // Catch:{ SQLiteException -> 0x0081 }
        L_0x007d:
            r3.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0081 }
            goto L_0x0095
        L_0x0081:
            r4 = move-exception
            goto L_0x0086
        L_0x0083:
            r0 = move-exception
            goto L_0x00b7
        L_0x0085:
            r4 = move-exception
        L_0x0086:
            sut r2 = r2.E()     // Catch:{ all -> 0x0083 }
            sur r2 = r2.c     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = "Error trying to ensure previous install count. appId"
            java.lang.Object r9 = defpackage.sut.a((java.lang.String) r1)     // Catch:{ all -> 0x0083 }
            r2.a(r5, r9, r4)     // Catch:{ all -> 0x0083 }
        L_0x0095:
            r3.endTransaction()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r3 = 1
            java.lang.String r5 = "_r"
            r2.putLong(r5, r3)
            com.google.android.gms.measurement.internal.EventParcel r9 = new com.google.android.gms.measurement.internal.EventParcel
            com.google.android.gms.measurement.internal.EventParams r4 = new com.google.android.gms.measurement.internal.EventParams
            r4.<init>(r2)
            java.lang.String r3 = "_ui"
            java.lang.String r5 = "auto"
            r2 = r9
            r2.<init>(r3, r4, r5, r6)
            r0.a((com.google.android.gms.measurement.internal.EventParcel) r9, (java.lang.String) r1)
            goto L_0x00c6
        L_0x00b7:
            r3.endTransaction()
            throw r0
        L_0x00bb:
            sut r2 = r0.E()
            sur r2 = r2.j
            java.lang.String r3 = "No app data available; not logging uninstall event"
            r2.a(r3, r1)
        L_0x00c6:
            r0.d()
            long r2 = defpackage.spg.m()
        L_0x00cd:
            long r4 = (long) r8
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x00d3
            goto L_0x00de
        L_0x00d3:
            r4 = 0
            boolean r4 = r0.b((java.lang.String) r1, (long) r4)
            if (r4 == 0) goto L_0x00de
            int r8 = r8 + 1
            goto L_0x00cd
        L_0x00de:
            spj r2 = r0.h()
            r2.c(r1)
            spg r2 = r0.d()
            suc r3 = defpackage.sud.al
            boolean r2 = r2.b(r1, r3)
            if (r2 == 0) goto L_0x0103
            sut r2 = r0.E()
            sur r2 = r2.j
            java.lang.String r3 = "Invalidating remote config cache"
            r2.a(r3, r1)
            svn r0 = r0.f()
            r0.c(r1)
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.szb.run():void");
    }
}
