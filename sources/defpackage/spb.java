package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: spb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class spb extends syx {
    private String a;
    private Set b;
    private Map c;
    private Long d;

    public spb(sze sze) {
        super(sze);
    }

    private final sow a(int i) {
        Map map = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (sow) this.c.get(valueOf);
        }
        sow sow = new sow(this, this.a);
        this.c.put(valueOf, sow);
        return sow;
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return false;
    }

    private final boolean a(int i, int i2) {
        Map map = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (map.get(valueOf) != null) {
            return ((sow) this.c.get(valueOf)).a.get(i2);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0694, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0695, code lost:
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0697, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0698, code lost:
        r25 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x069d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x069e, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x06a0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x06a1, code lost:
        r28 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x06b5, code lost:
        r1.close();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x06ba, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06ca, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x087e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x087f, code lost:
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0881, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0882, code lost:
        r72 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0146, code lost:
        if (r4 != null) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x09fe, code lost:
        if ((r11.a & 1) == 0) goto L_0x0a07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0a00, code lost:
        r10 = java.lang.Integer.valueOf(r11.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0a07, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0a08, code lost:
        r0.a("Invalid property filter ID. appId, id", r5, java.lang.String.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0aef, code lost:
        if (r1 != null) goto L_0x0af5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0af3, code lost:
        if (r1 != null) goto L_0x0af5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ec, code lost:
        if (r5 != null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f7, code lost:
        if (r5 != null) goto L_0x01ee;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0694 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:221:0x0619] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x069d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:216:0x05f4] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x06b5  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x06bd  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x06ca  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x06e4  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0798  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x07ab  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x087e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:308:0x080e] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x089b  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x08a0  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x08a3  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x08a9  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x08b2  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x08c6  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0a55  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0b14  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0b19  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0b1e  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0b53  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0bf1  */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x0a3c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x022b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(java.lang.String r71, java.util.List r72, java.util.List r73, java.lang.Long r74) {
        /*
            r70 = this;
            r9 = r70
            java.lang.String r10 = "current_results"
            java.lang.String r11 = "audience_id"
            defpackage.iva.c(r71)
            defpackage.iva.a((java.lang.Object) r72)
            defpackage.iva.a((java.lang.Object) r73)
            r0 = r71
            r9.a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r9.b = r0
            nz r0 = new nz
            r0.<init>()
            r9.c = r0
            r0 = r74
            r9.d = r0
            spg r0 = r70.v()
            java.lang.String r1 = r9.a
            suc r2 = defpackage.sud.ad
            boolean r0 = r0.b(r1, r2)
            r12 = 1
            r13 = 0
            if (r0 != 0) goto L_0x0046
            spg r0 = r70.v()
            java.lang.String r1 = r9.a
            suc r2 = defpackage.sud.ae
            boolean r0 = r0.b(r1, r2)
            if (r0 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r1 = 0
            goto L_0x0061
        L_0x0046:
            java.util.Iterator r0 = r72.iterator()
        L_0x004a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r0.next()
            szz r1 = (defpackage.szz) r1
            java.lang.String r1 = r1.c
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x004a
            r1 = 1
        L_0x0061:
            spg r0 = r70.v()
            java.lang.String r2 = r9.a
            suc r3 = defpackage.sud.ad
            boolean r14 = r0.b(r2, r3)
            spg r0 = r70.v()
            java.lang.String r2 = r9.a
            suc r3 = defpackage.sud.ae
            boolean r0 = r0.b(r2, r3)
            defpackage.ayiv.c()
            defpackage.ayiv.c()
            if (r1 != 0) goto L_0x0082
            goto L_0x00c1
        L_0x0082:
            if (r0 == 0) goto L_0x00c1
            spj r2 = r70.n()
            java.lang.String r3 = r9.a
            r2.q()
            r2.h()
            defpackage.iva.c(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.e()     // Catch:{ SQLiteException -> 0x00b1 }
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x00b1 }
            r5[r13] = r3     // Catch:{ SQLiteException -> 0x00b1 }
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch:{ SQLiteException -> 0x00b1 }
            goto L_0x00c1
        L_0x00b1:
            r0 = move-exception
            sut r2 = r2.E()
            sur r2 = r2.c
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.a(r4, r3, r0)
        L_0x00c1:
            java.util.Collections.emptyMap()
            spj r2 = r70.n()
            java.lang.String r3 = r9.a
            r2.q()
            r2.h()
            defpackage.iva.c(r3)
            android.database.sqlite.SQLiteDatabase r15 = r2.e()
            r8 = 2
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0153, all -> 0x014f }
            r0[r13] = r11     // Catch:{ SQLiteException -> 0x0153, all -> 0x014f }
            r0[r12] = r10     // Catch:{ SQLiteException -> 0x0153, all -> 0x014f }
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0153, all -> 0x014f }
            r4[r13] = r3     // Catch:{ SQLiteException -> 0x0153, all -> 0x014f }
            java.lang.String r16 = "audience_filter_values"
            java.lang.String r18 = "app_id=?"
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r0
            r19 = r4
            android.database.Cursor r4 = r15.query(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x0153, all -> 0x014f }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x014d, all -> 0x0149 }
            if (r0 == 0) goto L_0x0146
            nz r5 = new nz     // Catch:{ SQLiteException -> 0x014d, all -> 0x0149 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x014d, all -> 0x0149 }
        L_0x00ff:
            int r6 = r4.getInt(r13)     // Catch:{ SQLiteException -> 0x014d, all -> 0x0149 }
            byte[] r0 = r4.getBlob(r12)     // Catch:{ SQLiteException -> 0x014d, all -> 0x0149 }
            taf r15 = defpackage.taf.e     // Catch:{ IOException -> 0x0122 }
            aucd r15 = r15.o()     // Catch:{ IOException -> 0x0122 }
            audw r0 = defpackage.szg.a((defpackage.audw) r15, (byte[]) r0)     // Catch:{ IOException -> 0x0122 }
            aucd r0 = (defpackage.aucd) r0     // Catch:{ IOException -> 0x0122 }
            aucj r0 = r0.i()     // Catch:{ IOException -> 0x0122 }
            taf r0 = (defpackage.taf) r0     // Catch:{ IOException -> 0x0122 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x014d, all -> 0x0149 }
            r5.put(r6, r0)     // Catch:{ SQLiteException -> 0x014d, all -> 0x0149 }
            goto L_0x0136
        L_0x0122:
            r0 = move-exception
            sut r15 = r2.E()     // Catch:{ SQLiteException -> 0x014d, all -> 0x0149 }
            sur r15 = r15.c     // Catch:{ SQLiteException -> 0x014d, all -> 0x0149 }
            java.lang.String r7 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r12 = defpackage.sut.a((java.lang.String) r3)     // Catch:{ SQLiteException -> 0x014d, all -> 0x0149 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x014d, all -> 0x0149 }
            r15.a(r7, r12, r6, r0)     // Catch:{ SQLiteException -> 0x014d, all -> 0x0149 }
        L_0x0136:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x014d, all -> 0x0149 }
            if (r0 != 0) goto L_0x0144
            if (r4 != 0) goto L_0x013f
            goto L_0x0142
        L_0x013f:
            r4.close()
        L_0x0142:
            r12 = r5
            goto L_0x016c
        L_0x0144:
            r12 = 1
            goto L_0x00ff
        L_0x0146:
            if (r4 == 0) goto L_0x0169
            goto L_0x0166
        L_0x0149:
            r0 = move-exception
            r7 = r4
            goto L_0x0bef
        L_0x014d:
            r0 = move-exception
            goto L_0x0155
        L_0x014f:
            r0 = move-exception
            r7 = 0
            goto L_0x0bef
        L_0x0153:
            r0 = move-exception
            r4 = 0
        L_0x0155:
            sut r2 = r2.E()     // Catch:{ all -> 0x0bed }
            sur r2 = r2.c     // Catch:{ all -> 0x0bed }
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r3)     // Catch:{ all -> 0x0bed }
            r2.a(r5, r3, r0)     // Catch:{ all -> 0x0bed }
            if (r4 == 0) goto L_0x016b
        L_0x0166:
            r4.close()
        L_0x0169:
            r12 = 0
            goto L_0x016c
        L_0x016b:
            r12 = 0
        L_0x016c:
            r15 = 5
            if (r12 == 0) goto L_0x04b6
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x04b4
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r12.keySet()
            r2.<init>(r0)
            if (r14 != 0) goto L_0x0182
            goto L_0x033f
        L_0x0182:
            if (r1 == 0) goto L_0x033e
            java.lang.String r1 = r9.a
            defpackage.iva.c(r1)
            defpackage.iva.a((java.lang.Object) r12)
            nz r3 = new nz
            r3.<init>()
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x033b
            spj r4 = r70.n()
            r4.q()
            r4.h()
            defpackage.iva.c(r1)
            nz r0 = new nz
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r4.e()
            java.lang.String[] r6 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0204, all -> 0x0200 }
            r6[r13] = r1     // Catch:{ SQLiteException -> 0x0204, all -> 0x0200 }
            r7 = 1
            r6[r7] = r1     // Catch:{ SQLiteException -> 0x0204, all -> 0x0200 }
            java.lang.String r7 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r5 = r5.rawQuery(r7, r6)     // Catch:{ SQLiteException -> 0x0204, all -> 0x0200 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x01fe, all -> 0x01fa }
            if (r6 == 0) goto L_0x01f3
        L_0x01c0:
            int r6 = r5.getInt(r13)     // Catch:{ SQLiteException -> 0x01fe, all -> 0x01fa }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x01fe, all -> 0x01fa }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ SQLiteException -> 0x01fe, all -> 0x01fa }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SQLiteException -> 0x01fe, all -> 0x01fa }
            if (r7 != 0) goto L_0x01d9
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x01fe, all -> 0x01fa }
            r7.<init>()     // Catch:{ SQLiteException -> 0x01fe, all -> 0x01fa }
            r0.put(r6, r7)     // Catch:{ SQLiteException -> 0x01fe, all -> 0x01fa }
        L_0x01d9:
            r6 = 1
            int r16 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x01fe, all -> 0x01fa }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x01fe, all -> 0x01fa }
            r7.add(r6)     // Catch:{ SQLiteException -> 0x01fe, all -> 0x01fa }
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x01fe, all -> 0x01fa }
            if (r6 != 0) goto L_0x01c0
            if (r5 == 0) goto L_0x01f2
        L_0x01ee:
            r5.close()
            goto L_0x021d
        L_0x01f2:
            goto L_0x021d
        L_0x01f3:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x01fe, all -> 0x01fa }
            if (r5 == 0) goto L_0x021d
            goto L_0x01ee
        L_0x01fa:
            r0 = move-exception
            r7 = r5
            goto L_0x0335
        L_0x01fe:
            r0 = move-exception
            goto L_0x0206
        L_0x0200:
            r0 = move-exception
            r7 = 0
            goto L_0x0335
        L_0x0204:
            r0 = move-exception
            r5 = 0
        L_0x0206:
            sut r4 = r4.E()     // Catch:{ all -> 0x0333 }
            sur r4 = r4.c     // Catch:{ all -> 0x0333 }
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r1 = defpackage.sut.a((java.lang.String) r1)     // Catch:{ all -> 0x0333 }
            r4.a(r6, r1, r0)     // Catch:{ all -> 0x0333 }
            if (r5 == 0) goto L_0x021c
            r5.close()
            r0 = 0
            goto L_0x021d
        L_0x021c:
            r0 = 0
        L_0x021d:
            java.util.Set r1 = r12.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0225:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0332
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r12.get(r5)
            taf r6 = (defpackage.taf) r6
            java.lang.Object r7 = r0.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x032a
            boolean r16 = r7.isEmpty()
            if (r16 == 0) goto L_0x024f
            goto L_0x032a
        L_0x024f:
            szg r5 = r70.o()
            aucv r8 = r6.b
            java.util.List r5 = r5.a((java.util.List) r8, (java.util.List) r7)
            boolean r8 = r5.isEmpty()
            if (r8 != 0) goto L_0x0325
            java.lang.Object r8 = r6.c(r15)
            aucd r8 = (defpackage.aucd) r8
            r8.a((defpackage.aucj) r6)
            boolean r15 = r8.c
            if (r15 != 0) goto L_0x026d
            goto L_0x0272
        L_0x026d:
            r8.c()
            r8.c = r13
        L_0x0272:
            aucj r15 = r8.b
            taf r15 = (defpackage.taf) r15
            taf r18 = defpackage.taf.e
            aucv r13 = defpackage.aucj.r()
            r15.b = r13
            r8.W(r5)
            szg r5 = r70.o()
            aucv r13 = r6.a
            java.util.List r5 = r5.a((java.util.List) r13, (java.util.List) r7)
            boolean r13 = r8.c
            if (r13 != 0) goto L_0x0290
            goto L_0x0296
        L_0x0290:
            r8.c()
            r13 = 0
            r8.c = r13
        L_0x0296:
            aucj r13 = r8.b
            taf r13 = (defpackage.taf) r13
            aucv r15 = defpackage.aucj.r()
            r13.a = r15
            r8.X(r5)
            r5 = 0
        L_0x02a4:
            aucx r13 = r6.c
            int r13 = r13.size()
            if (r5 >= r13) goto L_0x02db
            aucx r13 = r6.c
            java.lang.Object r13 = r13.get(r5)
            szy r13 = (defpackage.szy) r13
            int r13 = r13.b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            boolean r13 = r7.contains(r13)
            if (r13 != 0) goto L_0x02c1
            goto L_0x02d8
        L_0x02c1:
            boolean r13 = r8.c
            if (r13 != 0) goto L_0x02c6
            goto L_0x02cc
        L_0x02c6:
            r8.c()
            r13 = 0
            r8.c = r13
        L_0x02cc:
            aucj r13 = r8.b
            taf r13 = (defpackage.taf) r13
            r13.a()
            aucx r13 = r13.c
            r13.remove(r5)
        L_0x02d8:
            int r5 = r5 + 1
            goto L_0x02a4
        L_0x02db:
            r5 = 0
        L_0x02dc:
            aucx r13 = r6.d
            int r13 = r13.size()
            if (r5 >= r13) goto L_0x0313
            aucx r13 = r6.d
            java.lang.Object r13 = r13.get(r5)
            tag r13 = (defpackage.tag) r13
            int r13 = r13.b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            boolean r13 = r7.contains(r13)
            if (r13 != 0) goto L_0x02f9
            goto L_0x0310
        L_0x02f9:
            boolean r13 = r8.c
            if (r13 != 0) goto L_0x02fe
            goto L_0x0304
        L_0x02fe:
            r8.c()
            r13 = 0
            r8.c = r13
        L_0x0304:
            aucj r13 = r8.b
            taf r13 = (defpackage.taf) r13
            r13.b()
            aucx r13 = r13.d
            r13.remove(r5)
        L_0x0310:
            int r5 = r5 + 1
            goto L_0x02dc
        L_0x0313:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            aucj r5 = r8.i()
            taf r5 = (defpackage.taf) r5
            r3.put(r4, r5)
            r8 = 2
            r13 = 0
            r15 = 5
            goto L_0x0225
        L_0x0325:
            r8 = 2
            r13 = 0
            r15 = 5
            goto L_0x0225
        L_0x032a:
            r3.put(r5, r6)
            r8 = 2
            r13 = 0
            r15 = 5
            goto L_0x0225
        L_0x0332:
            goto L_0x033c
        L_0x0333:
            r0 = move-exception
            r7 = r5
        L_0x0335:
            if (r7 == 0) goto L_0x033a
            r7.close()
        L_0x033a:
            throw r0
        L_0x033b:
        L_0x033c:
            r0 = r3
            goto L_0x0340
        L_0x033e:
        L_0x033f:
            r0 = r12
        L_0x0340:
            java.util.Iterator r13 = r2.iterator()
        L_0x0344:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x04b2
            java.lang.Object r1 = r13.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r15 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            java.lang.Object r1 = r0.get(r1)
            taf r1 = (defpackage.taf) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            nz r7 = new nz
            r7.<init>()
            if (r1 == 0) goto L_0x03c4
            aucx r2 = r1.c
            int r2 = r2.size()
            if (r2 == 0) goto L_0x03bf
            aucx r2 = r1.c
            int r3 = r2.size()
            r4 = 0
        L_0x037e:
            if (r4 >= r3) goto L_0x03bf
            java.lang.Object r8 = r2.get(r4)
            szy r8 = (defpackage.szy) r8
            r19 = r0
            int r0 = r8.a
            r20 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x03b0
            int r0 = r8.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r20 = r2
            int r2 = r8.a
            r16 = 2
            r2 = r2 & 2
            if (r2 == 0) goto L_0x03a9
            r21 = r3
            long r2 = r8.c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x03ac
        L_0x03a9:
            r21 = r3
            r2 = 0
        L_0x03ac:
            r7.put(r0, r2)
            goto L_0x03b6
        L_0x03b0:
            r20 = r2
            r21 = r3
            r16 = 2
        L_0x03b6:
            int r4 = r4 + 1
            r0 = r19
            r2 = r20
            r3 = r21
            goto L_0x037e
        L_0x03bf:
            r19 = r0
            r16 = 2
            goto L_0x03c8
        L_0x03c4:
            r19 = r0
            r16 = 2
        L_0x03c8:
            boolean r0 = defpackage.aylg.b()
            if (r0 == 0) goto L_0x043a
            spg r0 = r70.v()
            java.lang.String r2 = r9.a
            suc r3 = defpackage.sud.ak
            boolean r0 = r0.b(r2, r3)
            if (r0 == 0) goto L_0x043a
            nz r0 = new nz
            r0.<init>()
            if (r1 == 0) goto L_0x0437
            aucx r2 = r1.d
            int r2 = r2.size()
            if (r2 == 0) goto L_0x0437
            aucx r2 = r1.d
            int r3 = r2.size()
            r4 = 0
        L_0x03f2:
            if (r4 >= r3) goto L_0x0436
            java.lang.Object r8 = r2.get(r4)
            tag r8 = (defpackage.tag) r8
            r20 = r2
            int r2 = r8.a
            r21 = 1
            r2 = r2 & 1
            if (r2 != 0) goto L_0x0407
            r21 = r3
            goto L_0x042f
        L_0x0407:
            aucv r2 = r8.c
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x042d
            int r2 = r8.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r21 = r3
            aucv r3 = r8.c
            int r3 = r3.size()
            aucv r8 = r8.c
            int r3 = r3 + -1
            long r22 = r8.a((int) r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r22)
            r0.put(r2, r3)
            goto L_0x042f
        L_0x042d:
            r21 = r3
        L_0x042f:
            int r4 = r4 + 1
            r2 = r20
            r3 = r21
            goto L_0x03f2
        L_0x0436:
            goto L_0x0438
        L_0x0437:
        L_0x0438:
            r8 = r0
            goto L_0x043b
        L_0x043a:
            r8 = 0
        L_0x043b:
            if (r1 == 0) goto L_0x0486
            r0 = 0
        L_0x043e:
            aucv r2 = r1.a
            int r2 = r2.size()
            int r2 = r2 * 64
            if (r0 >= r2) goto L_0x0483
            aucv r2 = r1.a
            boolean r2 = defpackage.szg.a((java.util.List) r2, (int) r0)
            if (r2 == 0) goto L_0x0475
            sut r2 = r70.E()
            sur r2 = r2.k
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r20 = r13
            java.lang.String r13 = "Filter already evaluated. audience ID, filter ID"
            r2.a(r13, r3, r4)
            r6.set(r0)
            aucv r2 = r1.b
            boolean r2 = defpackage.szg.a((java.util.List) r2, (int) r0)
            if (r2 != 0) goto L_0x0471
            goto L_0x0477
        L_0x0471:
            r5.set(r0)
            goto L_0x047e
        L_0x0475:
            r20 = r13
        L_0x0477:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.remove(r2)
        L_0x047e:
            int r0 = r0 + 1
            r13 = r20
            goto L_0x043e
        L_0x0483:
            r20 = r13
            goto L_0x0488
        L_0x0486:
            r20 = r13
        L_0x0488:
            if (r14 == 0) goto L_0x0496
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            java.lang.Object r0 = r12.get(r0)
            taf r0 = (defpackage.taf) r0
            r4 = r0
            goto L_0x0497
        L_0x0496:
            r4 = r1
        L_0x0497:
            sow r0 = new sow
            java.lang.String r3 = r9.a
            r1 = r0
            r2 = r70
            r13 = 0
            r13 = 2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.Map r1 = r9.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r1.put(r2, r0)
            r0 = r19
            r13 = r20
            goto L_0x0344
        L_0x04b2:
            r13 = 2
            goto L_0x04b7
        L_0x04b4:
            r13 = 2
            goto L_0x04b7
        L_0x04b6:
            r13 = 2
        L_0x04b7:
            boolean r0 = r72.isEmpty()
            java.lang.String r1 = "data"
            java.lang.String r2 = "Skipping failed audience ID"
            java.lang.String r3 = "Database error querying filters. appId"
            if (r0 != 0) goto L_0x0798
            sox r4 = new sox
            r4.<init>(r9)
            nz r5 = new nz
            r5.<init>()
            java.util.Iterator r6 = r72.iterator()
        L_0x04d1:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0791
            java.lang.Object r0 = r6.next()
            szz r0 = (defpackage.szz) r0
            java.lang.String r7 = r9.a
            szz r7 = r4.a(r7, r0)
            if (r7 == 0) goto L_0x0784
            spj r8 = r70.n()
            java.lang.String r12 = r9.a
            java.lang.String r14 = r7.c
            spg r15 = r8.v()
            suc r13 = defpackage.sud.ae
            boolean r13 = r15.b(r12, r13)
            java.lang.String r15 = r0.c
            spp r15 = r8.a((java.lang.String) r12, (java.lang.String) r15)
            if (r15 != 0) goto L_0x0554
            sut r15 = r8.E()
            sur r15 = r15.f
            r36 = r4
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r12)
            suk r8 = r8.y()
            java.lang.String r8 = r8.a((java.lang.String) r14)
            java.lang.String r14 = "Event aggregate wasn't created during raw event logging. appId, event"
            r15.a(r14, r4, r8)
            if (r13 == 0) goto L_0x053d
            spp r4 = new spp
            r19 = r4
            java.lang.String r8 = r0.c
            r21 = r8
            r22 = 1
            r24 = 1
            r26 = 1
            long r13 = r0.d
            r28 = r13
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r20 = r12
            r19.<init>(r20, r21, r22, r24, r26, r28, r30, r32, r33, r34, r35)
            goto L_0x05c1
        L_0x053d:
            spp r4 = new spp
            java.lang.String r8 = r0.c
            r22 = 1
            r24 = 1
            long r13 = r0.d
            r19 = r4
            r20 = r12
            r21 = r8
            r26 = r13
            r19.<init>(r20, r21, r22, r24, r26)
            goto L_0x05c1
        L_0x0554:
            r36 = r4
            r19 = 1
            if (r13 == 0) goto L_0x058e
            spp r4 = new spp
            r37 = r4
            java.lang.String r0 = r15.a
            r38 = r0
            java.lang.String r0 = r15.b
            r39 = r0
            long r12 = r15.c
            long r40 = r12 + r19
            long r12 = r15.d
            long r42 = r12 + r19
            long r12 = r15.e
            long r44 = r12 + r19
            long r12 = r15.f
            r46 = r12
            long r12 = r15.g
            r48 = r12
            java.lang.Long r0 = r15.h
            r50 = r0
            java.lang.Long r0 = r15.i
            r51 = r0
            java.lang.Long r0 = r15.j
            r52 = r0
            java.lang.Boolean r0 = r15.k
            r53 = r0
            r37.<init>(r38, r39, r40, r42, r44, r46, r48, r50, r51, r52, r53)
            goto L_0x05c1
        L_0x058e:
            spp r4 = new spp
            r53 = r4
            java.lang.String r0 = r15.a
            r54 = r0
            java.lang.String r0 = r15.b
            r55 = r0
            long r12 = r15.c
            long r56 = r12 + r19
            long r12 = r15.d
            long r58 = r12 + r19
            long r12 = r15.e
            r60 = r12
            long r12 = r15.f
            r62 = r12
            long r12 = r15.g
            r64 = r12
            java.lang.Long r0 = r15.h
            r66 = r0
            java.lang.Long r0 = r15.i
            r67 = r0
            java.lang.Long r0 = r15.j
            r68 = r0
            java.lang.Boolean r0 = r15.k
            r69 = r0
            r53.<init>(r54, r55, r56, r58, r60, r62, r64, r66, r67, r68, r69)
        L_0x05c1:
            spj r0 = r70.n()
            r0.a((defpackage.spp) r4)
            long r12 = r4.c
            java.lang.String r8 = r7.c
            java.lang.Object r0 = r5.get(r8)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x06ce
            spj r14 = r70.n()
            java.lang.String r15 = r9.a
            r14.q()
            r14.h()
            defpackage.iva.c(r15)
            defpackage.iva.c(r8)
            r72 = r6
            nz r6 = new nz
            r6.<init>()
            android.database.sqlite.SQLiteDatabase r19 = r14.e()
            r27 = r10
            r10 = 2
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x06a0, all -> 0x069d }
            r10 = 0
            r0[r10] = r11     // Catch:{ SQLiteException -> 0x06a0, all -> 0x069d }
            r10 = 1
            r0[r10] = r1     // Catch:{ SQLiteException -> 0x06a0, all -> 0x069d }
            r28 = r1
            r10 = 2
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x069b, all -> 0x069d }
            r10 = 0
            r1[r10] = r15     // Catch:{ SQLiteException -> 0x069b, all -> 0x069d }
            r10 = 1
            r1[r10] = r8     // Catch:{ SQLiteException -> 0x069b, all -> 0x069d }
            java.lang.String r20 = "event_filters"
            java.lang.String r22 = "app_id=? AND event_name=?"
            r24 = 0
            r25 = 0
            r26 = 0
            r21 = r0
            r23 = r1
            android.database.Cursor r1 = r19.query(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ SQLiteException -> 0x069b, all -> 0x069d }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0697, all -> 0x0694 }
            if (r0 == 0) goto L_0x0686
        L_0x061f:
            r10 = 1
            byte[] r0 = r1.getBlob(r10)     // Catch:{ SQLiteException -> 0x0697, all -> 0x0694 }
            szl r10 = defpackage.szl.i     // Catch:{ IOException -> 0x065d }
            aucd r10 = r10.o()     // Catch:{ IOException -> 0x065d }
            audw r0 = defpackage.szg.a((defpackage.audw) r10, (byte[]) r0)     // Catch:{ IOException -> 0x065d }
            aucd r0 = (defpackage.aucd) r0     // Catch:{ IOException -> 0x065d }
            aucj r0 = r0.i()     // Catch:{ IOException -> 0x065d }
            szl r0 = (defpackage.szl) r0     // Catch:{ IOException -> 0x065d }
            r10 = 0
            int r19 = r1.getInt(r10)     // Catch:{ SQLiteException -> 0x0697, all -> 0x0694 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r19)     // Catch:{ SQLiteException -> 0x0697, all -> 0x0694 }
            java.lang.Object r19 = r6.get(r10)     // Catch:{ SQLiteException -> 0x0697, all -> 0x0694 }
            java.util.List r19 = (java.util.List) r19     // Catch:{ SQLiteException -> 0x0697, all -> 0x0694 }
            if (r19 != 0) goto L_0x0653
            r25 = r11
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0692, all -> 0x0694 }
            r11.<init>()     // Catch:{ SQLiteException -> 0x0692, all -> 0x0694 }
            r6.put(r10, r11)     // Catch:{ SQLiteException -> 0x0692, all -> 0x0694 }
            goto L_0x0657
        L_0x0653:
            r25 = r11
            r11 = r19
        L_0x0657:
            r11.add(r0)     // Catch:{ SQLiteException -> 0x0692, all -> 0x0694 }
            r19 = r6
            goto L_0x0671
        L_0x065d:
            r0 = move-exception
            r25 = r11
            sut r10 = r14.E()     // Catch:{ SQLiteException -> 0x0692, all -> 0x0694 }
            sur r10 = r10.c     // Catch:{ SQLiteException -> 0x0692, all -> 0x0694 }
            java.lang.String r11 = "Failed to merge filter. appId"
            r19 = r6
            java.lang.Object r6 = defpackage.sut.a((java.lang.String) r15)     // Catch:{ SQLiteException -> 0x0692, all -> 0x0694 }
            r10.a(r11, r6, r0)     // Catch:{ SQLiteException -> 0x0692, all -> 0x0694 }
        L_0x0671:
            boolean r0 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0692, all -> 0x0694 }
            if (r0 != 0) goto L_0x0681
            if (r1 == 0) goto L_0x067d
            r1.close()
            goto L_0x067e
        L_0x067d:
        L_0x067e:
            r0 = r19
            goto L_0x06bb
        L_0x0681:
            r6 = r19
            r11 = r25
            goto L_0x061f
        L_0x0686:
            r25 = r11
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0692, all -> 0x0694 }
            if (r1 == 0) goto L_0x06bb
            r1.close()
            goto L_0x06bb
        L_0x0692:
            r0 = move-exception
            goto L_0x06a6
        L_0x0694:
            r0 = move-exception
            r7 = r1
            goto L_0x06c8
        L_0x0697:
            r0 = move-exception
            r25 = r11
            goto L_0x06a6
        L_0x069b:
            r0 = move-exception
            goto L_0x06a3
        L_0x069d:
            r0 = move-exception
            r7 = 0
            goto L_0x06c8
        L_0x06a0:
            r0 = move-exception
            r28 = r1
        L_0x06a3:
            r25 = r11
            r1 = 0
        L_0x06a6:
            sut r6 = r14.E()     // Catch:{ all -> 0x06c6 }
            sur r6 = r6.c     // Catch:{ all -> 0x06c6 }
            java.lang.Object r10 = defpackage.sut.a((java.lang.String) r15)     // Catch:{ all -> 0x06c6 }
            r6.a(r3, r10, r0)     // Catch:{ all -> 0x06c6 }
            if (r1 == 0) goto L_0x06ba
            r1.close()
            r0 = 0
            goto L_0x06bb
        L_0x06ba:
            r0 = 0
        L_0x06bb:
            if (r0 != 0) goto L_0x06c2
            nz r0 = new nz
            r0.<init>()
        L_0x06c2:
            r5.put(r8, r0)
            goto L_0x06d6
        L_0x06c6:
            r0 = move-exception
            r7 = r1
        L_0x06c8:
            if (r7 == 0) goto L_0x06cd
            r7.close()
        L_0x06cd:
            throw r0
        L_0x06ce:
            r28 = r1
            r72 = r6
            r27 = r10
            r25 = r11
        L_0x06d6:
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x06de:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0777
            java.lang.Object r6 = r1.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.Set r8 = r9.b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r8 = r8.contains(r10)
            if (r8 == 0) goto L_0x0704
            sut r6 = r70.E()
            sur r6 = r6.k
            r6.a(r2, r10)
            goto L_0x06de
        L_0x0704:
            java.lang.Object r8 = r0.get(r10)
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r10 = 1
        L_0x070f:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x0762
            java.lang.Object r10 = r8.next()
            szl r10 = (defpackage.szl) r10
            soy r11 = new soy
            java.lang.String r14 = r9.a
            r11.<init>(r9, r14, r6, r10)
            int r10 = r10.b
            boolean r24 = r9.a(r6, r10)
            r19 = r11
            r20 = r7
            r21 = r12
            r23 = r4
            boolean r10 = r19.a(r20, r21, r23, r24)
            spg r14 = r70.v()
            java.lang.String r15 = r9.a
            r19 = r0
            suc r0 = defpackage.sud.am
            boolean r0 = r14.b(r15, r0)
            if (r0 != 0) goto L_0x074c
            sow r0 = r9.a(r6)
            r0.a(r11)
            goto L_0x075f
        L_0x074c:
            if (r10 != 0) goto L_0x0758
            java.util.Set r0 = r9.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r0.add(r8)
            goto L_0x0764
        L_0x0758:
            sow r0 = r9.a(r6)
            r0.a(r11)
        L_0x075f:
            r0 = r19
            goto L_0x070f
        L_0x0762:
            r19 = r0
        L_0x0764:
            if (r10 != 0) goto L_0x0773
            java.util.Set r0 = r9.b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.add(r6)
            r0 = r19
            goto L_0x06de
        L_0x0773:
            r0 = r19
            goto L_0x06de
        L_0x0777:
            r6 = r72
            r11 = r25
            r10 = r27
            r1 = r28
            r4 = r36
            r13 = 2
            goto L_0x04d1
        L_0x0784:
            r28 = r1
            r36 = r4
            r72 = r6
            r27 = r10
            r25 = r11
            r13 = 2
            goto L_0x04d1
        L_0x0791:
            r28 = r1
            r27 = r10
            r25 = r11
            goto L_0x079e
        L_0x0798:
            r28 = r1
            r27 = r10
            r25 = r11
        L_0x079e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r0 = r73.isEmpty()
            java.lang.String r4 = "filter_id"
            if (r0 != 0) goto L_0x0a42
            nz r5 = new nz
            r5.<init>()
            java.util.Iterator r6 = r73.iterator()
        L_0x07b4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0a42
            java.lang.Object r0 = r6.next()
            r7 = r0
            tah r7 = (defpackage.tah) r7
            java.lang.String r0 = r7.c
            r1.add(r0)
            java.lang.String r8 = r7.c
            java.lang.Object r0 = r5.get(r8)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x08b6
            spj r10 = r70.n()
            java.lang.String r11 = r9.a
            r10.q()
            r10.h()
            defpackage.iva.c(r11)
            defpackage.iva.c(r8)
            nz r12 = new nz
            r12.<init>()
            android.database.sqlite.SQLiteDatabase r29 = r10.e()
            r13 = 2
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0888, all -> 0x0885 }
            r13 = 0
            r0[r13] = r25     // Catch:{ SQLiteException -> 0x0888, all -> 0x0885 }
            r13 = 1
            r0[r13] = r28     // Catch:{ SQLiteException -> 0x0888, all -> 0x0885 }
            r14 = 2
            java.lang.String[] r15 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x0888, all -> 0x0885 }
            r14 = 0
            r15[r14] = r11     // Catch:{ SQLiteException -> 0x0888, all -> 0x0885 }
            r15[r13] = r8     // Catch:{ SQLiteException -> 0x0888, all -> 0x0885 }
            java.lang.String r30 = "property_filters"
            java.lang.String r32 = "app_id=? AND property_name=?"
            r34 = 0
            r35 = 0
            r36 = 0
            r31 = r0
            r33 = r15
            android.database.Cursor r13 = r29.query(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ SQLiteException -> 0x0888, all -> 0x0885 }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0881, all -> 0x087e }
            if (r0 == 0) goto L_0x086f
        L_0x0814:
            r14 = 1
            byte[] r0 = r13.getBlob(r14)     // Catch:{ SQLiteException -> 0x0881, all -> 0x087e }
            szq r14 = defpackage.szq.h     // Catch:{ IOException -> 0x084d }
            aucd r14 = r14.o()     // Catch:{ IOException -> 0x084d }
            audw r0 = defpackage.szg.a((defpackage.audw) r14, (byte[]) r0)     // Catch:{ IOException -> 0x084d }
            aucd r0 = (defpackage.aucd) r0     // Catch:{ IOException -> 0x084d }
            aucj r0 = r0.i()     // Catch:{ IOException -> 0x084d }
            szq r0 = (defpackage.szq) r0     // Catch:{ IOException -> 0x084d }
            r14 = 0
            int r15 = r13.getInt(r14)     // Catch:{ SQLiteException -> 0x0881, all -> 0x087e }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x0881, all -> 0x087e }
            java.lang.Object r15 = r12.get(r14)     // Catch:{ SQLiteException -> 0x0881, all -> 0x087e }
            java.util.List r15 = (java.util.List) r15     // Catch:{ SQLiteException -> 0x0881, all -> 0x087e }
            if (r15 != 0) goto L_0x0846
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0881, all -> 0x087e }
            r15.<init>()     // Catch:{ SQLiteException -> 0x0881, all -> 0x087e }
            r12.put(r14, r15)     // Catch:{ SQLiteException -> 0x0881, all -> 0x087e }
            goto L_0x0847
        L_0x0846:
        L_0x0847:
            r15.add(r0)     // Catch:{ SQLiteException -> 0x0881, all -> 0x087e }
            r72 = r6
            goto L_0x085f
        L_0x084d:
            r0 = move-exception
            sut r14 = r10.E()     // Catch:{ SQLiteException -> 0x0881, all -> 0x087e }
            sur r14 = r14.c     // Catch:{ SQLiteException -> 0x0881, all -> 0x087e }
            java.lang.String r15 = "Failed to merge filter"
            r72 = r6
            java.lang.Object r6 = defpackage.sut.a((java.lang.String) r11)     // Catch:{ SQLiteException -> 0x087c, all -> 0x087e }
            r14.a(r15, r6, r0)     // Catch:{ SQLiteException -> 0x087c, all -> 0x087e }
        L_0x085f:
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x087c, all -> 0x087e }
            if (r0 != 0) goto L_0x086c
            if (r13 == 0) goto L_0x086b
            r13.close()
            goto L_0x08a1
        L_0x086b:
            goto L_0x08a1
        L_0x086c:
            r6 = r72
            goto L_0x0814
        L_0x086f:
            r72 = r6
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x087c, all -> 0x087e }
            if (r13 == 0) goto L_0x087a
            r13.close()
        L_0x087a:
            r12 = r0
            goto L_0x08a1
        L_0x087c:
            r0 = move-exception
            goto L_0x088c
        L_0x087e:
            r0 = move-exception
            r7 = r13
            goto L_0x08b0
        L_0x0881:
            r0 = move-exception
            r72 = r6
            goto L_0x088c
        L_0x0885:
            r0 = move-exception
            r7 = 0
            goto L_0x08b0
        L_0x0888:
            r0 = move-exception
            r72 = r6
            r13 = 0
        L_0x088c:
            sut r6 = r10.E()     // Catch:{ all -> 0x08ae }
            sur r6 = r6.c     // Catch:{ all -> 0x08ae }
            java.lang.Object r10 = defpackage.sut.a((java.lang.String) r11)     // Catch:{ all -> 0x08ae }
            r6.a(r3, r10, r0)     // Catch:{ all -> 0x08ae }
            if (r13 == 0) goto L_0x08a0
            r13.close()
            r12 = 0
            goto L_0x08a1
        L_0x08a0:
            r12 = 0
        L_0x08a1:
            if (r12 != 0) goto L_0x08a9
            nz r0 = new nz
            r0.<init>()
            goto L_0x08aa
        L_0x08a9:
            r0 = r12
        L_0x08aa:
            r5.put(r8, r0)
            goto L_0x08b8
        L_0x08ae:
            r0 = move-exception
            r7 = r13
        L_0x08b0:
            if (r7 == 0) goto L_0x08b5
            r7.close()
        L_0x08b5:
            throw r0
        L_0x08b6:
            r72 = r6
        L_0x08b8:
            java.util.Set r6 = r0.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x08c0:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0a3c
            java.lang.Object r8 = r6.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.util.Set r10 = r9.b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            boolean r10 = r10.contains(r11)
            if (r10 != 0) goto L_0x0a2d
            java.lang.Object r10 = r0.get(r11)
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
            r11 = 1
        L_0x08e7:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0a12
            java.lang.Object r11 = r10.next()
            szq r11 = (defpackage.szq) r11
            sut r12 = r70.E()
            r13 = 2
            boolean r12 = r12.a((int) r13)
            if (r12 == 0) goto L_0x099c
            sut r12 = r70.E()
            sur r12 = r12.k
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            int r14 = r11.a
            r15 = 1
            r14 = r14 & r15
            if (r14 == 0) goto L_0x0915
            int r14 = r11.b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x0916
        L_0x0915:
            r14 = 0
        L_0x0916:
            suk r15 = r70.y()
            r73 = r0
            java.lang.String r0 = r11.c
            java.lang.String r0 = r15.c(r0)
            java.lang.String r15 = "Evaluating filter. audience, filter, property"
            r12.a(r15, r13, r14, r0)
            sut r0 = r70.E()
            sur r0 = r0.k
            szg r12 = r70.o()
            if (r11 == 0) goto L_0x0991
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "\nproperty_filter {\n"
            r13.append(r14)
            int r14 = r11.a
            r15 = 1
            r14 = r14 & r15
            if (r14 == 0) goto L_0x094f
            int r14 = r11.b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15 = 0
            defpackage.szg.a((java.lang.StringBuilder) r13, (int) r15, (java.lang.String) r4, (java.lang.Object) r14)
            goto L_0x0950
        L_0x094f:
            r15 = 0
        L_0x0950:
            suk r14 = r12.y()
            java.lang.String r15 = r11.c
            java.lang.String r14 = r14.c(r15)
            java.lang.String r15 = "property_name"
            r19 = r5
            r5 = 0
            defpackage.szg.a((java.lang.StringBuilder) r13, (int) r5, (java.lang.String) r15, (java.lang.Object) r14)
            boolean r5 = r11.e
            boolean r14 = r11.f
            boolean r15 = r11.g
            java.lang.String r5 = defpackage.szg.a((boolean) r5, (boolean) r14, (boolean) r15)
            boolean r14 = r5.isEmpty()
            if (r14 == 0) goto L_0x0974
            goto L_0x097b
        L_0x0974:
            java.lang.String r14 = "filter_type"
            r15 = 0
            defpackage.szg.a((java.lang.StringBuilder) r13, (int) r15, (java.lang.String) r14, (java.lang.Object) r5)
        L_0x097b:
            szm r5 = r11.d
            if (r5 == 0) goto L_0x0980
            goto L_0x0982
        L_0x0980:
            szm r5 = defpackage.szm.f
        L_0x0982:
            r14 = 1
            r12.a((java.lang.StringBuilder) r13, (int) r14, (defpackage.szm) r5)
            java.lang.String r5 = "}\n"
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            goto L_0x0995
        L_0x0991:
            r19 = r5
            java.lang.String r5 = "null"
        L_0x0995:
            java.lang.String r12 = "Filter definition"
            r0.a(r12, r5)
            goto L_0x09a0
        L_0x099c:
            r73 = r0
            r19 = r5
        L_0x09a0:
            int r0 = r11.a
            r5 = 1
            r0 = r0 & r5
            if (r0 == 0) goto L_0x09ee
            int r0 = r11.b
            r5 = 256(0x100, float:3.59E-43)
            if (r0 > r5) goto L_0x09ee
            spa r0 = new spa
            java.lang.String r5 = r9.a
            r0.<init>(r9, r5, r8, r11)
            java.lang.Long r5 = r9.d
            int r11 = r11.b
            boolean r11 = r9.a(r8, r11)
            boolean r11 = r0.a(r5, r7, r11)
            spg r5 = r70.v()
            java.lang.String r12 = r9.a
            suc r13 = defpackage.sud.am
            boolean r5 = r5.b(r12, r13)
            if (r5 != 0) goto L_0x09d5
            sow r5 = r9.a(r8)
            r5.a(r0)
            goto L_0x09e8
        L_0x09d5:
            if (r11 != 0) goto L_0x09e1
            java.util.Set r0 = r9.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r0.add(r5)
            goto L_0x0a16
        L_0x09e1:
            sow r5 = r9.a(r8)
            r5.a(r0)
        L_0x09e8:
            r0 = r73
            r5 = r19
            goto L_0x08e7
        L_0x09ee:
            sut r0 = r70.E()
            sur r0 = r0.f
            java.lang.String r5 = r9.a
            java.lang.Object r5 = defpackage.sut.a((java.lang.String) r5)
            int r10 = r11.a
            r12 = 1
            r10 = r10 & r12
            if (r10 == 0) goto L_0x0a07
            int r10 = r11.b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x0a08
        L_0x0a07:
            r10 = 0
        L_0x0a08:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = "Invalid property filter ID. appId, id"
            r0.a(r11, r5, r10)
            goto L_0x0a18
        L_0x0a12:
            r73 = r0
            r19 = r5
        L_0x0a16:
            if (r11 != 0) goto L_0x0a27
        L_0x0a18:
            java.util.Set r0 = r9.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r0.add(r5)
            r0 = r73
            r5 = r19
            goto L_0x08c0
        L_0x0a27:
            r0 = r73
            r5 = r19
            goto L_0x08c0
        L_0x0a2d:
            r19 = r5
            sut r0 = r70.E()
            sur r0 = r0.k
            r0.a(r2, r11)
            r6 = r72
            goto L_0x07b4
        L_0x0a3c:
            r19 = r5
            r6 = r72
            goto L_0x07b4
        L_0x0a42:
            spg r0 = r70.v()
            java.lang.String r2 = r9.a
            suc r5 = defpackage.sud.aj
            boolean r0 = r0.b(r2, r5)
            nz r7 = new nz
            r7.<init>()
            if (r0 == 0) goto L_0x0b38
            spj r2 = r70.n()
            java.lang.String r5 = r9.a
            r2.q()
            r2.h()
            defpackage.iva.c(r5)
            defpackage.iva.a((java.lang.Object) r1)
            nz r7 = new nz
            r7.<init>()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0b38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "app_id=? AND property_name in ("
            r0.append(r6)
            r13 = 0
        L_0x0a7d:
            int r6 = r1.size()
            if (r13 < r6) goto L_0x0b22
            java.lang.String r6 = ")"
            r0.append(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r1)
            r1 = 0
            r6.add(r1, r5)
            android.database.sqlite.SQLiteDatabase r28 = r2.e()
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0b03, all -> 0x0b00 }
            r8[r1] = r25     // Catch:{ SQLiteException -> 0x0b03, all -> 0x0b00 }
            r1 = 1
            r8[r1] = r4     // Catch:{ SQLiteException -> 0x0b03, all -> 0x0b00 }
            java.lang.String r29 = "property_filters"
            java.lang.String r31 = r0.toString()     // Catch:{ SQLiteException -> 0x0b03, all -> 0x0b00 }
            r1 = 0
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x0b03, all -> 0x0b00 }
            java.lang.Object[] r0 = r6.toArray(r0)     // Catch:{ SQLiteException -> 0x0b03, all -> 0x0b00 }
            r32 = r0
            java.lang.String[] r32 = (java.lang.String[]) r32     // Catch:{ SQLiteException -> 0x0b03, all -> 0x0b00 }
            r33 = 0
            r34 = 0
            r35 = 0
            r30 = r8
            android.database.Cursor r1 = r28.query(r29, r30, r31, r32, r33, r34, r35)     // Catch:{ SQLiteException -> 0x0b03, all -> 0x0b00 }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0afd, all -> 0x0afa }
            if (r0 == 0) goto L_0x0af3
        L_0x0ac0:
            r6 = 0
            int r0 = r1.getInt(r6)     // Catch:{ SQLiteException -> 0x0afd, all -> 0x0afa }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteException -> 0x0afd, all -> 0x0afa }
            java.lang.Object r4 = r7.get(r0)     // Catch:{ SQLiteException -> 0x0afd, all -> 0x0afa }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x0afd, all -> 0x0afa }
            if (r4 != 0) goto L_0x0adb
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0afd, all -> 0x0afa }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0afd, all -> 0x0afa }
            r7.put(r0, r4)     // Catch:{ SQLiteException -> 0x0afd, all -> 0x0afa }
            goto L_0x0adc
        L_0x0adb:
        L_0x0adc:
            r10 = 1
            int r0 = r1.getInt(r10)     // Catch:{ SQLiteException -> 0x0afd, all -> 0x0afa }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteException -> 0x0afd, all -> 0x0afa }
            r4.add(r0)     // Catch:{ SQLiteException -> 0x0afd, all -> 0x0afa }
            boolean r0 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0afd, all -> 0x0afa }
            if (r0 != 0) goto L_0x0ac0
            if (r1 == 0) goto L_0x0af2
            goto L_0x0af5
        L_0x0af2:
            goto L_0x0b39
        L_0x0af3:
            if (r1 == 0) goto L_0x0af9
        L_0x0af5:
            r1.close()
            goto L_0x0b39
        L_0x0af9:
            goto L_0x0b39
        L_0x0afa:
            r0 = move-exception
            r7 = r1
            goto L_0x0b1c
        L_0x0afd:
            r0 = move-exception
            r7 = r1
            goto L_0x0b05
        L_0x0b00:
            r0 = move-exception
            r7 = 0
            goto L_0x0b1c
        L_0x0b03:
            r0 = move-exception
            r7 = 0
        L_0x0b05:
            sut r1 = r2.E()     // Catch:{ all -> 0x0b1b }
            sur r1 = r1.c     // Catch:{ all -> 0x0b1b }
            java.lang.Object r2 = defpackage.sut.a((java.lang.String) r5)     // Catch:{ all -> 0x0b1b }
            r1.a(r3, r2, r0)     // Catch:{ all -> 0x0b1b }
            if (r7 == 0) goto L_0x0b19
            r7.close()
            r7 = 0
            goto L_0x0b39
        L_0x0b19:
            r7 = 0
            goto L_0x0b39
        L_0x0b1b:
            r0 = move-exception
        L_0x0b1c:
            if (r7 == 0) goto L_0x0b21
            r7.close()
        L_0x0b21:
            throw r0
        L_0x0b22:
            r6 = 0
            r8 = 2
            r10 = 1
            if (r13 > 0) goto L_0x0b28
            goto L_0x0b2e
        L_0x0b28:
            java.lang.String r11 = ","
            r0.append(r11)
        L_0x0b2e:
            java.lang.String r11 = "?"
            r0.append(r11)
            int r13 = r13 + 1
            goto L_0x0a7d
        L_0x0b38:
        L_0x0b39:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r0 = r9.c
            java.util.Set r0 = r0.keySet()
            java.util.Set r2 = r9.b
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0b4d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0bec
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map r3 = r9.c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            sow r3 = (defpackage.sow) r3
            java.lang.Object r5 = r7.get(r4)
            java.util.List r5 = (java.util.List) r5
            szx r0 = r3.a(r0, r5)
            r1.add(r0)
            spj r3 = r70.n()
            java.lang.String r5 = r9.a
            taf r0 = r0.c
            if (r0 != 0) goto L_0x0b82
            taf r0 = defpackage.taf.e
        L_0x0b82:
            r3.q()
            r3.h()
            defpackage.iva.c(r5)
            defpackage.iva.a((java.lang.Object) r0)
            byte[] r0 = r0.k()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r8 = "app_id"
            r6.put(r8, r5)
            r8 = r25
            r6.put(r8, r4)
            r4 = r27
            r6.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.e()     // Catch:{ SQLiteException -> 0x0bd4 }
            java.lang.String r10 = "audience_filter_values"
            r11 = 5
            r12 = 0
            long r13 = r0.insertWithOnConflict(r10, r12, r6, r11)     // Catch:{ SQLiteException -> 0x0bd2 }
            r15 = -1
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0bcc
            sut r0 = r3.E()     // Catch:{ SQLiteException -> 0x0bd2 }
            sur r0 = r0.c     // Catch:{ SQLiteException -> 0x0bd2 }
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r10 = defpackage.sut.a((java.lang.String) r5)     // Catch:{ SQLiteException -> 0x0bd2 }
            r0.a(r6, r10)     // Catch:{ SQLiteException -> 0x0bd2 }
            r27 = r4
            r25 = r8
            goto L_0x0b4d
        L_0x0bcc:
            r27 = r4
            r25 = r8
            goto L_0x0b4d
        L_0x0bd2:
            r0 = move-exception
            goto L_0x0bd7
        L_0x0bd4:
            r0 = move-exception
            r11 = 5
            r12 = 0
        L_0x0bd7:
            sut r3 = r3.E()
            sur r3 = r3.c
            java.lang.Object r5 = defpackage.sut.a((java.lang.String) r5)
            java.lang.String r6 = "Error storing filter results. appId"
            r3.a(r6, r5, r0)
            r27 = r4
            r25 = r8
            goto L_0x0b4d
        L_0x0bec:
            return r1
        L_0x0bed:
            r0 = move-exception
            r7 = r4
        L_0x0bef:
            if (r7 == 0) goto L_0x0bf4
            r7.close()
        L_0x0bf4:
            goto L_0x0bf6
        L_0x0bf5:
            throw r0
        L_0x0bf6:
            goto L_0x0bf5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spb.a(java.lang.String, java.util.List, java.util.List, java.lang.Long):java.util.List");
    }
}
