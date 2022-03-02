package defpackage;

import android.database.Cursor;
import java.util.concurrent.TimeUnit;

/* renamed from: pos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pos extends poc {
    final /* synthetic */ pou d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pos(pou pou, long j, int i) {
        super(j, i);
        this.d = pou;
    }

    /* access modifiers changed from: protected */
    public final Cursor b() {
        pnz.d("Processing MMS messages newer than date: %d", Long.valueOf(this.a));
        String valueOf = String.valueOf(this.a);
        return this.d.k.a(poo.b, pou.e, pou.i, new String[]{valueOf, valueOf, String.valueOf(this.b), String.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() + pou.a))}, "date,_id LIMIT 1000");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0139, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        defpackage.pnz.e("No permission to read phone number: %s", r0);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01bb, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01bc, code lost:
        if (r6 != null) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c7, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:30:0x0120, B:34:0x0130] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object c() {
        /*
            r22 = this;
            r1 = r22
            android.database.Cursor r0 = r1.c     // Catch:{ SQLiteException -> 0x01d4 }
            r3 = 0
            java.lang.Integer r0 = defpackage.jit.a((android.database.Cursor) r0, (int) r3)     // Catch:{ SQLiteException -> 0x01d4 }
            if (r0 == 0) goto L_0x01d5
            android.database.Cursor r4 = r1.c     // Catch:{ SQLiteException -> 0x01d4 }
            r5 = 3
            java.lang.Long r4 = defpackage.jit.b(r4, r5)     // Catch:{ SQLiteException -> 0x01d4 }
            if (r4 == 0) goto L_0x01d5
            int r5 = r0.intValue()     // Catch:{ SQLiteException -> 0x01d4 }
            r1.b = r5     // Catch:{ SQLiteException -> 0x01d4 }
            long r4 = r4.longValue()     // Catch:{ SQLiteException -> 0x01d4 }
            r1.a = r4     // Catch:{ SQLiteException -> 0x01d4 }
            int r4 = r1.b     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01d4 }
            r6 = 25
            r5.<init>(r6)     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.String r6 = "content://mms/"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x01d4 }
            r5.append(r4)     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.String r4 = r5.toString()     // Catch:{ SQLiteException -> 0x01d4 }
            pou r5 = r1.d     // Catch:{ SQLiteException -> 0x01d4 }
            int r6 = r1.b     // Catch:{ SQLiteException -> 0x01d4 }
            pot r7 = new pot     // Catch:{ SQLiteException -> 0x01d4 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x01d4 }
            android.net.Uri r8 = defpackage.poo.b     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.String r9 = "part"
            android.net.Uri r8 = android.net.Uri.withAppendedPath(r8, r9)     // Catch:{ SQLiteException -> 0x01d4 }
            pni r10 = r5.k     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.String[] r12 = defpackage.pou.g     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01d4 }
            r9 = 15
            r5.<init>(r9)     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.String r9 = "mid="
            r5.append(r9)     // Catch:{ SQLiteException -> 0x01d4 }
            r5.append(r6)     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.String r13 = r5.toString()     // Catch:{ SQLiteException -> 0x01d4 }
            r14 = 0
            r15 = 0
            r11 = r8
            android.database.Cursor r5 = r10.a(r11, r12, r13, r14, r15)     // Catch:{ SQLiteException -> 0x01d4 }
            r9 = 2
            java.lang.String r10 = "Couldn't find MMS part for %d"
            java.lang.String r11 = ","
            r12 = 1
            if (r5 == 0) goto L_0x00c4
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00c0 }
            r6.<init>()     // Catch:{ all -> 0x00c0 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x00c0 }
            r13.<init>()     // Catch:{ all -> 0x00c0 }
        L_0x0076:
            boolean r14 = r5.moveToNext()     // Catch:{ all -> 0x00c0 }
            if (r14 == 0) goto L_0x00af
            java.lang.String r14 = defpackage.jit.c(r5, r3)     // Catch:{ all -> 0x00c0 }
            java.lang.String r15 = defpackage.jit.c(r5, r12)     // Catch:{ all -> 0x00c0 }
            anax r2 = defpackage.pou.c     // Catch:{ all -> 0x00c0 }
            boolean r2 = r2.contains(r15)     // Catch:{ all -> 0x00c0 }
            if (r2 == 0) goto L_0x0076
            java.lang.String r2 = "text/plain"
            boolean r2 = r2.equals(r15)     // Catch:{ all -> 0x00c0 }
            if (r2 != 0) goto L_0x009c
            android.net.Uri r2 = android.net.Uri.withAppendedPath(r8, r14)     // Catch:{ all -> 0x00c0 }
            r6.add(r2)     // Catch:{ all -> 0x00c0 }
            goto L_0x00a3
        L_0x009c:
            java.lang.String r2 = defpackage.jit.c(r5, r9)     // Catch:{ all -> 0x00c0 }
            r7.a = r2     // Catch:{ all -> 0x00c0 }
        L_0x00a3:
            r2 = 47
            r14 = 95
            java.lang.String r2 = r15.replace(r2, r14)     // Catch:{ all -> 0x00c0 }
            r13.add(r2)     // Catch:{ all -> 0x00c0 }
            goto L_0x0076
        L_0x00af:
            java.lang.String r2 = android.text.TextUtils.join(r11, r6)     // Catch:{ all -> 0x00c0 }
            r7.b = r2     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = android.text.TextUtils.join(r11, r13)     // Catch:{ all -> 0x00c0 }
            r7.c = r2     // Catch:{ all -> 0x00c0 }
            r5.close()     // Catch:{ SQLiteException -> 0x01d4 }
            goto L_0x00cc
        L_0x00c0:
            r0 = move-exception
            r2 = r0
            goto L_0x01c8
        L_0x00c4:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00c0 }
            defpackage.pnz.e(r10, r2)     // Catch:{ all -> 0x00c0 }
        L_0x00cc:
            poa r2 = defpackage.pob.n()     // Catch:{ SQLiteException -> 0x01d4 }
            int r5 = r1.b     // Catch:{ SQLiteException -> 0x01d4 }
            r2.a((int) r5)     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.String r5 = "mms"
            r2.a = r5     // Catch:{ SQLiteException -> 0x01d4 }
            r2.b((java.lang.String) r4)     // Catch:{ SQLiteException -> 0x01d4 }
            android.database.Cursor r4 = r1.c     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.Integer r4 = defpackage.jit.a((android.database.Cursor) r4, (int) r12)     // Catch:{ SQLiteException -> 0x01d4 }
            r2.b = r4     // Catch:{ SQLiteException -> 0x01d4 }
            android.database.Cursor r4 = r1.c     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.Integer r4 = defpackage.jit.a((android.database.Cursor) r4, (int) r9)     // Catch:{ SQLiteException -> 0x01d4 }
            r2.c = r4     // Catch:{ SQLiteException -> 0x01d4 }
            pou r4 = r1.d     // Catch:{ SQLiteException -> 0x01d4 }
            int r0 = r0.intValue()     // Catch:{ SQLiteException -> 0x01d4 }
            android.net.Uri r5 = defpackage.poo.b     // Catch:{ SQLiteException -> 0x01d4 }
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x01d4 }
            android.net.Uri$Builder r6 = r5.appendPath(r6)     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.String r8 = "addr"
            r6.appendPath(r8)     // Catch:{ SQLiteException -> 0x01d4 }
            android.net.Uri r17 = r5.build()     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01d4 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x01d4 }
            pni r6 = r4.k     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.String[] r18 = defpackage.pou.f     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.String r21 = "type ASC"
            r19 = 0
            r20 = 0
            r16 = r6
            android.database.Cursor r6 = r16.a(r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x01d4 }
            if (r6 != 0) goto L_0x0128
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01ba }
            defpackage.pnz.e(r10, r0)     // Catch:{ all -> 0x01ba }
            goto L_0x016b
        L_0x0128:
            android.content.Context r0 = r4.j     // Catch:{ all -> 0x01ba }
            android.telephony.TelephonyManager r8 = defpackage.pof.a(r0)     // Catch:{ all -> 0x01ba }
            if (r8 == 0) goto L_0x0141
            java.lang.String r8 = r8.getLine1Number()     // Catch:{ SecurityException -> 0x0139 }
            java.lang.String r0 = defpackage.pof.a(r0, r8)     // Catch:{ SecurityException -> 0x0139 }
            goto L_0x0142
        L_0x0139:
            r0 = move-exception
            java.lang.String r8 = "No permission to read phone number: %s"
            defpackage.pnz.e(r8, r0)     // Catch:{ all -> 0x01ba }
            r0 = 0
            goto L_0x0142
        L_0x0141:
            r0 = 0
        L_0x0142:
            boolean r8 = r6.moveToNext()     // Catch:{ all -> 0x01ba }
            if (r8 == 0) goto L_0x016b
            android.content.Context r8 = r4.j     // Catch:{ all -> 0x01ba }
            java.lang.String r9 = defpackage.jit.c(r6, r12)     // Catch:{ all -> 0x01ba }
            java.lang.String r8 = defpackage.pof.a(r8, r9)     // Catch:{ all -> 0x01ba }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01ba }
            if (r9 != 0) goto L_0x0142
            boolean r9 = r8.equals(r0)     // Catch:{ all -> 0x01ba }
            if (r9 != 0) goto L_0x0142
            int r9 = r5.length()     // Catch:{ all -> 0x01ba }
            if (r9 == 0) goto L_0x0167
            r5.append(r11)     // Catch:{ all -> 0x01ba }
        L_0x0167:
            r5.append(r8)     // Catch:{ all -> 0x01ba }
            goto L_0x0142
        L_0x016b:
            if (r6 != 0) goto L_0x016e
            goto L_0x0171
        L_0x016e:
            r6.close()     // Catch:{ SQLiteException -> 0x01d4 }
        L_0x0171:
            java.lang.String r0 = r5.toString()     // Catch:{ SQLiteException -> 0x01d4 }
            r2.d = r0     // Catch:{ SQLiteException -> 0x01d4 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ SQLiteException -> 0x01d4 }
            long r4 = r1.a     // Catch:{ SQLiteException -> 0x01d4 }
            long r4 = r0.toMillis(r4)     // Catch:{ SQLiteException -> 0x01d4 }
            r2.a((long) r4)     // Catch:{ SQLiteException -> 0x01d4 }
            android.database.Cursor r0 = r1.c     // Catch:{ SQLiteException -> 0x01d4 }
            r4 = 4
            java.lang.String r0 = defpackage.jit.c(r0, r4)     // Catch:{ SQLiteException -> 0x01d4 }
            r2.e = r0     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.String r0 = r7.a     // Catch:{ SQLiteException -> 0x01d4 }
            r2.f = r0     // Catch:{ SQLiteException -> 0x01d4 }
            long r4 = r1.a     // Catch:{ SQLiteException -> 0x01d4 }
            int r0 = (int) r4     // Catch:{ SQLiteException -> 0x01d4 }
            r2.b((int) r0)     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.String r0 = r7.c     // Catch:{ SQLiteException -> 0x01d4 }
            r2.a((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.String r0 = r7.b     // Catch:{ SQLiteException -> 0x01d4 }
            r2.g = r0     // Catch:{ SQLiteException -> 0x01d4 }
            android.database.Cursor r0 = r1.c     // Catch:{ SQLiteException -> 0x01d4 }
            r4 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x01d4 }
            java.lang.Integer r0 = defpackage.jit.a((android.database.Cursor) r0, (int) r4, (java.lang.Integer) r5)     // Catch:{ SQLiteException -> 0x01d4 }
            int r0 = r0.intValue()     // Catch:{ SQLiteException -> 0x01d4 }
            if (r0 == 0) goto L_0x01b1
            r3 = 1
            goto L_0x01b2
        L_0x01b1:
        L_0x01b2:
            r2.a((boolean) r3)     // Catch:{ SQLiteException -> 0x01d4 }
            pob r2 = r2.a()     // Catch:{ SQLiteException -> 0x01d4 }
            goto L_0x01d6
        L_0x01ba:
            r0 = move-exception
            r2 = r0
            if (r6 == 0) goto L_0x01c7
            r6.close()     // Catch:{ all -> 0x01c2 }
            goto L_0x01c7
        L_0x01c2:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r3)     // Catch:{ SQLiteException -> 0x01d4 }
        L_0x01c7:
            throw r2     // Catch:{ SQLiteException -> 0x01d4 }
        L_0x01c8:
            if (r5 == 0) goto L_0x01d3
            r5.close()     // Catch:{ all -> 0x01ce }
            goto L_0x01d3
        L_0x01ce:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r3)     // Catch:{ SQLiteException -> 0x01d4 }
        L_0x01d3:
            throw r2     // Catch:{ SQLiteException -> 0x01d4 }
        L_0x01d4:
            r0 = move-exception
        L_0x01d5:
            r2 = 0
        L_0x01d6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pos.c():java.lang.Object");
    }
}
