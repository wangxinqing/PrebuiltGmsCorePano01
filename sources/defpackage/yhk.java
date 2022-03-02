package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Flag;

/* renamed from: yhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhk extends ygu {
    private final ygj a;
    private final yhl b;

    public yhk(ygj ygj, String str, String str2, int i, String str3) {
        super("GetFlagOperationCall", avtj.GET_FLAG);
        iva.a((Object) ygj);
        this.a = ygj;
        this.b = new yhl(str, str2, i, str3);
    }

    public final avst a() {
        yhl yhl = this.b;
        avss avss = (avss) avst.m.o();
        String str = yhl.a;
        if (str != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst = (avst) avss.b;
            str.getClass();
            avst.a |= 1;
            avst.b = str;
        }
        return (avst) avss.i();
    }

    public final void b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r3 != null) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r17, defpackage.yfw r18) {
        /*
            r16 = this;
            r1 = r16
            yhl r0 = r1.b
            java.lang.String r2 = r0.a
            r3 = 29500(0x733c, float:4.1338E-41)
            if (r2 == 0) goto L_0x00d5
            java.lang.String r2 = r0.b
            if (r2 == 0) goto L_0x00cd
            android.database.sqlite.SQLiteDatabase r2 = r18.getWritableDatabase()
            defpackage.yfw.a((android.database.sqlite.SQLiteDatabase) r2)
            java.lang.String r3 = r0.a     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = r0.d     // Catch:{ all -> 0x00c8 }
            java.lang.String r3 = defpackage.ygb.a(r3, r4)     // Catch:{ all -> 0x00c8 }
            r0.a = r3     // Catch:{ all -> 0x00c8 }
            java.lang.String r3 = r0.a     // Catch:{ all -> 0x00c8 }
            boolean r3 = defpackage.yhb.a(r2, r3)     // Catch:{ all -> 0x00c8 }
            if (r3 == 0) goto L_0x00c0
            java.lang.String[] r6 = defpackage.yfq.b     // Catch:{ all -> 0x00c8 }
            r3 = 3
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = r0.a     // Catch:{ all -> 0x00c8 }
            r12 = 0
            r8[r12] = r4     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = r0.b     // Catch:{ all -> 0x00c8 }
            r13 = 1
            r8[r13] = r4     // Catch:{ all -> 0x00c8 }
            int r4 = r0.c     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00c8 }
            r14 = 2
            r8[r14] = r4     // Catch:{ all -> 0x00c8 }
            java.lang.String r5 = "FlagOverrides"
            java.lang.String r7 = "packageName = ? AND name = ? AND flagType = ? AND committed = 1"
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r2
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00c8 }
            boolean r5 = r4.moveToFirst()     // Catch:{ all -> 0x00b2 }
            r15 = 0
            if (r5 == 0) goto L_0x005c
            com.google.android.gms.phenotype.Flag r15 = defpackage.yhe.a((android.database.Cursor) r4)     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x0096
            r4.close()     // Catch:{ all -> 0x00c8 }
            goto L_0x0096
        L_0x005c:
            if (r4 != 0) goto L_0x005f
            goto L_0x0062
        L_0x005f:
            r4.close()     // Catch:{ all -> 0x00c8 }
        L_0x0062:
            java.lang.String[] r6 = defpackage.yfq.b     // Catch:{ all -> 0x00c8 }
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x00c8 }
            java.lang.String r3 = r0.a     // Catch:{ all -> 0x00c8 }
            r8[r12] = r3     // Catch:{ all -> 0x00c8 }
            java.lang.String r3 = r0.b     // Catch:{ all -> 0x00c8 }
            r8[r13] = r3     // Catch:{ all -> 0x00c8 }
            int r0 = r0.c     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x00c8 }
            r8[r14] = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r5 = "Flags"
            java.lang.String r7 = "packageName = ? AND name = ? AND flagType = ? AND committed = 1"
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r2
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00c8 }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0092
            com.google.android.gms.phenotype.Flag r15 = defpackage.yhe.a((android.database.Cursor) r3)     // Catch:{ all -> 0x00a4 }
            if (r3 == 0) goto L_0x0095
        L_0x008e:
            r3.close()     // Catch:{ all -> 0x00c8 }
            goto L_0x0095
        L_0x0092:
            if (r3 == 0) goto L_0x0095
            goto L_0x008e
        L_0x0095:
        L_0x0096:
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x00c8 }
            r2.endTransaction()
            ygj r0 = r1.a
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.a
            r0.a((com.google.android.gms.common.api.Status) r2, (com.google.android.gms.phenotype.Flag) r15)
            return
        L_0x00a4:
            r0 = move-exception
            r4 = r0
            if (r3 == 0) goto L_0x00b1
            r3.close()     // Catch:{ all -> 0x00ac }
            goto L_0x00b1
        L_0x00ac:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r4, (java.lang.Throwable) r3)     // Catch:{ all -> 0x00c8 }
        L_0x00b1:
            throw r4     // Catch:{ all -> 0x00c8 }
        L_0x00b2:
            r0 = move-exception
            r3 = r0
            if (r4 == 0) goto L_0x00bf
            r4.close()     // Catch:{ all -> 0x00ba }
            goto L_0x00bf
        L_0x00ba:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r4)     // Catch:{ all -> 0x00c8 }
        L_0x00bf:
            throw r3     // Catch:{ all -> 0x00c8 }
        L_0x00c0:
            yfy r0 = new yfy     // Catch:{ all -> 0x00c8 }
            r3 = 29503(0x733f, float:4.1343E-41)
            r0.<init>(r3)     // Catch:{ all -> 0x00c8 }
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            r2.endTransaction()
            throw r0
        L_0x00cd:
            yfy r0 = new yfy
            java.lang.String r2 = "No flag name"
            r0.<init>(r3, r2)
            throw r0
        L_0x00d5:
            yfy r0 = new yfy
            java.lang.String r2 = "No package name"
            r0.<init>(r3, r2)
            goto L_0x00de
        L_0x00dd:
            throw r0
        L_0x00de:
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhk.b(android.content.Context, yfw):void");
    }

    public final void a(Status status) {
        this.a.a(status, (Flag) null);
    }
}
