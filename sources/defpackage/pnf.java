package defpackage;

import android.database.Cursor;

/* renamed from: pnf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pnf extends pmu implements pmt {
    private final Cursor a;
    private final pmm b;
    private final pnd c = new pnd();
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private long k;
    private long l;
    private boolean m;

    public pnf(Cursor cursor, pmm pmm) {
        iva.a((Object) cursor);
        this.a = cursor;
        this.b = pmm;
        pmm.c = cursor;
        pmm.d = cursor.getColumnIndex("mimetype");
        this.d = cursor.getColumnIndex("contact_id");
        this.j = cursor.getColumnIndex("lookup");
        this.e = cursor.getColumnIndex("photo_thumb_uri");
        this.f = cursor.getColumnIndex("display_name");
        this.g = cursor.getColumnIndex("phonetic_name");
        this.h = cursor.getColumnIndex("times_contacted");
        this.i = cursor.getColumnIndex("last_time_contacted");
        this.k = -1;
        this.m = true;
    }

    public final void a() {
        this.a.close();
    }

    public final long b() {
        return this.l;
    }

    public final boolean c() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object d() {
        /*
            r10 = this;
            r0 = 0
        L_0x0001:
            r1 = -1
            if (r0 != 0) goto L_0x00ce
            r3 = 0
            android.database.Cursor r4 = r10.a     // Catch:{ IllegalStateException -> 0x00c4 }
            boolean r4 = r4.moveToNext()     // Catch:{ IllegalStateException -> 0x00c4 }
            if (r4 == 0) goto L_0x00ce
            long r4 = r10.l     // Catch:{ IllegalStateException -> 0x00c4 }
            android.database.Cursor r6 = r10.a     // Catch:{ IllegalStateException -> 0x00c4 }
            long r6 = defpackage.poz.a((android.database.Cursor) r6)     // Catch:{ IllegalStateException -> 0x00c4 }
            long r4 = r4 + r6
            r10.l = r4     // Catch:{ IllegalStateException -> 0x00c4 }
            android.database.Cursor r4 = r10.a     // Catch:{ IllegalStateException -> 0x00c4 }
            int r5 = r10.d     // Catch:{ IllegalStateException -> 0x00c4 }
            long r4 = r4.getLong(r5)     // Catch:{ IllegalStateException -> 0x00c4 }
            long r6 = r10.k     // Catch:{ IllegalStateException -> 0x00c4 }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0028
            goto L_0x0099
        L_0x0028:
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x002d
            goto L_0x0038
        L_0x002d:
            pnd r6 = r10.c     // Catch:{ IllegalStateException -> 0x00c4 }
            pms r0 = r6.b()     // Catch:{ IllegalStateException -> 0x00c4 }
            pnd r6 = r10.c     // Catch:{ IllegalStateException -> 0x00c2 }
            r6.a()     // Catch:{ IllegalStateException -> 0x00c2 }
        L_0x0038:
            r10.k = r4     // Catch:{ IllegalStateException -> 0x00c2 }
            pnd r6 = r10.c     // Catch:{ IllegalStateException -> 0x00c2 }
            r6.f = r4     // Catch:{ IllegalStateException -> 0x00c2 }
            pmy r7 = r6.a     // Catch:{ IllegalStateException -> 0x00c2 }
            r7.h = r4     // Catch:{ IllegalStateException -> 0x00c2 }
            android.database.Cursor r4 = r10.a     // Catch:{ IllegalStateException -> 0x00c2 }
            int r5 = r10.j     // Catch:{ IllegalStateException -> 0x00c2 }
            java.lang.String r4 = r4.getString(r5)     // Catch:{ IllegalStateException -> 0x00c2 }
            pmy r5 = r6.a     // Catch:{ IllegalStateException -> 0x00c2 }
            r5.i = r4     // Catch:{ IllegalStateException -> 0x00c2 }
            pnd r4 = r10.c     // Catch:{ IllegalStateException -> 0x00c2 }
            android.database.Cursor r5 = r10.a     // Catch:{ IllegalStateException -> 0x00c2 }
            int r6 = r10.e     // Catch:{ IllegalStateException -> 0x00c2 }
            java.lang.String r5 = r5.getString(r6)     // Catch:{ IllegalStateException -> 0x00c2 }
            pmy r4 = r4.a     // Catch:{ IllegalStateException -> 0x00c2 }
            r4.j = r5     // Catch:{ IllegalStateException -> 0x00c2 }
            pnd r4 = r10.c     // Catch:{ IllegalStateException -> 0x00c2 }
            android.database.Cursor r5 = r10.a     // Catch:{ IllegalStateException -> 0x00c2 }
            int r6 = r10.f     // Catch:{ IllegalStateException -> 0x00c2 }
            java.lang.String r5 = r5.getString(r6)     // Catch:{ IllegalStateException -> 0x00c2 }
            pmy r4 = r4.a     // Catch:{ IllegalStateException -> 0x00c2 }
            r4.k = r5     // Catch:{ IllegalStateException -> 0x00c2 }
            pnd r4 = r10.c     // Catch:{ IllegalStateException -> 0x00c2 }
            android.database.Cursor r5 = r10.a     // Catch:{ IllegalStateException -> 0x00c2 }
            int r6 = r10.g     // Catch:{ IllegalStateException -> 0x00c2 }
            java.lang.String r5 = r5.getString(r6)     // Catch:{ IllegalStateException -> 0x00c2 }
            pmy r4 = r4.a     // Catch:{ IllegalStateException -> 0x00c2 }
            r4.l = r5     // Catch:{ IllegalStateException -> 0x00c2 }
            android.database.Cursor r4 = r10.a     // Catch:{ IllegalStateException -> 0x00c2 }
            int r5 = r10.h     // Catch:{ IllegalStateException -> 0x00c2 }
            long r4 = r4.getLong(r5)     // Catch:{ IllegalStateException -> 0x00c2 }
            r6 = 1
            long r6 = r6 + r4
            pnd r8 = r10.c     // Catch:{ IllegalStateException -> 0x00c2 }
            pmy r9 = r8.a     // Catch:{ IllegalStateException -> 0x00c2 }
            r9.m = r6     // Catch:{ IllegalStateException -> 0x00c2 }
            pna r6 = r8.b     // Catch:{ IllegalStateException -> 0x00c2 }
            r6.a = r4     // Catch:{ IllegalStateException -> 0x00c2 }
            android.database.Cursor r4 = r10.a     // Catch:{ IllegalStateException -> 0x00c2 }
            int r5 = r10.i     // Catch:{ IllegalStateException -> 0x00c2 }
            long r4 = r4.getLong(r5)     // Catch:{ IllegalStateException -> 0x00c2 }
            pna r6 = r8.b     // Catch:{ IllegalStateException -> 0x00c2 }
            r6.b = r4     // Catch:{ IllegalStateException -> 0x00c2 }
        L_0x0099:
            pmm r4 = r10.b     // Catch:{ IllegalStateException -> 0x00c2 }
            pnd r5 = r10.c     // Catch:{ IllegalStateException -> 0x00c2 }
            android.database.Cursor r6 = r4.c     // Catch:{ IllegalStateException -> 0x00c2 }
            if (r6 == 0) goto L_0x00a3
            r6 = 1
            goto L_0x00a4
        L_0x00a3:
            r6 = 0
        L_0x00a4:
            java.lang.String r7 = "Cursor must be set"
            defpackage.iva.a((boolean) r6, (java.lang.Object) r7)     // Catch:{ IllegalStateException -> 0x00c2 }
            android.database.Cursor r6 = r4.c     // Catch:{ IllegalStateException -> 0x00c2 }
            int r7 = r4.d     // Catch:{ IllegalStateException -> 0x00c2 }
            java.lang.String r6 = r6.getString(r7)     // Catch:{ IllegalStateException -> 0x00c2 }
            java.util.Map r7 = r4.a     // Catch:{ IllegalStateException -> 0x00c2 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ IllegalStateException -> 0x00c2 }
            pmd r6 = (defpackage.pmd) r6     // Catch:{ IllegalStateException -> 0x00c2 }
            if (r6 == 0) goto L_0x0001
            android.database.Cursor r4 = r4.c     // Catch:{ IllegalStateException -> 0x00c2 }
            r6.a((defpackage.pnd) r5, (android.database.Cursor) r4)     // Catch:{ IllegalStateException -> 0x00c2 }
            goto L_0x0001
        L_0x00c2:
            r4 = move-exception
            goto L_0x00c5
        L_0x00c4:
            r4 = move-exception
        L_0x00c5:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "moveToNext or getLong threw an exception"
            defpackage.pnz.a((java.lang.Throwable) r4, (java.lang.String) r6, (java.lang.Object[]) r5)
            r10.m = r3
        L_0x00ce:
            if (r0 != 0) goto L_0x00eb
            android.database.Cursor r3 = r10.a
            boolean r3 = r3.isAfterLast()
            if (r3 == 0) goto L_0x00eb
            long r3 = r10.k
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x00eb
            pnd r0 = r10.c
            pms r0 = r0.b()
            pnd r3 = r10.c
            r3.a()
            r10.k = r1
        L_0x00eb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pnf.d():java.lang.Object");
    }
}
