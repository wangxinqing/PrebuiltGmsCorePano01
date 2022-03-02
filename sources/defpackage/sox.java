package defpackage;

/* renamed from: sox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sox {
    final /* synthetic */ spb a;
    private szz b;
    private Long c;
    private long d;

    public sox(spb spb) {
        this.a = spb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f0, code lost:
        if (r14 != null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010b, code lost:
        if (r14 != null) goto L_0x010d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.szz a(java.lang.String r19, defpackage.szz r20) {
        /*
            r18 = this;
            r1 = r18
            r8 = r19
            r9 = r20
            java.lang.String r0 = r9.c
            aucx r10 = r9.b
            spb r2 = r1.a
            szg r2 = r2.o()
            java.lang.String r3 = "_eid"
            java.lang.Object r2 = r2.a((defpackage.szz) r9, (java.lang.String) r3)
            r4 = r2
            java.lang.Long r4 = (java.lang.Long) r4
            r11 = 1
            r12 = 0
            if (r4 == 0) goto L_0x0287
            java.lang.String r2 = "_ep"
            boolean r2 = r0.equals(r2)
            r5 = 0
            if (r2 == 0) goto L_0x0223
            spb r0 = r1.a
            szg r0 = r0.o()
            java.lang.String r2 = "_en"
            java.lang.Object r0 = r0.a((defpackage.szz) r9, (java.lang.String) r2)
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r2 = 0
            if (r0 == 0) goto L_0x006c
            boolean r0 = defpackage.ayjn.b()
            java.lang.String r3 = "Extra parameter without an event name. eventId"
            if (r0 == 0) goto L_0x0060
            spb r0 = r1.a
            spg r0 = r0.v()
            suc r5 = defpackage.sud.aJ
            boolean r0 = r0.b(r8, r5)
            if (r0 != 0) goto L_0x0054
            goto L_0x0060
        L_0x0054:
            spb r0 = r1.a
            sut r0 = r0.E()
            sur r0 = r0.d
            r0.a(r3, r4)
            goto L_0x006b
        L_0x0060:
            spb r0 = r1.a
            sut r0 = r0.E()
            sur r0 = r0.c
            r0.a(r3, r4)
        L_0x006b:
            return r2
        L_0x006c:
            szz r0 = r1.b
            if (r0 != 0) goto L_0x0071
            goto L_0x0083
        L_0x0071:
            java.lang.Long r0 = r1.c
            if (r0 == 0) goto L_0x0083
            long r14 = r4.longValue()
            java.lang.Long r0 = r1.c
            long r16 = r0.longValue()
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x013b
        L_0x0083:
            spb r0 = r1.a
            spj r7 = r0.n()
            r7.h()
            r7.q()
            android.database.sqlite.SQLiteDatabase r0 = r7.e()     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r14[r12] = r8     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            java.lang.String r15 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r14[r11] = r15     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            if (r0 == 0) goto L_0x00e5
            byte[] r0 = r14.getBlob(r12)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            long r15 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            szz r16 = defpackage.szz.g     // Catch:{ IOException -> 0x00d2 }
            aucd r2 = r16.o()     // Catch:{ IOException -> 0x00d2 }
            audw r0 = defpackage.szg.a((defpackage.audw) r2, (byte[]) r0)     // Catch:{ IOException -> 0x00d2 }
            aucd r0 = (defpackage.aucd) r0     // Catch:{ IOException -> 0x00d2 }
            aucj r0 = r0.i()     // Catch:{ IOException -> 0x00d2 }
            szz r0 = (defpackage.szz) r0     // Catch:{ IOException -> 0x00d2 }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            if (r14 == 0) goto L_0x0113
            r14.close()
            goto L_0x0113
        L_0x00d2:
            r0 = move-exception
            sut r2 = r7.E()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            sur r2 = r2.c     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r12 = defpackage.sut.a((java.lang.String) r19)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            r2.a(r15, r12, r4, r0)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            if (r14 == 0) goto L_0x0112
            goto L_0x010d
        L_0x00e5:
            sut r0 = r7.E()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            sur r0 = r0.k     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            java.lang.String r2 = "Main event not found"
            r0.a(r2)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            if (r14 == 0) goto L_0x00f3
            goto L_0x010d
        L_0x00f3:
            goto L_0x0110
        L_0x00f4:
            r0 = move-exception
            r2 = r14
            goto L_0x021d
        L_0x00f8:
            r0 = move-exception
            goto L_0x0100
        L_0x00fa:
            r0 = move-exception
            r2 = 0
            goto L_0x021d
        L_0x00fe:
            r0 = move-exception
            r14 = 0
        L_0x0100:
            sut r2 = r7.E()     // Catch:{ all -> 0x021b }
            sur r2 = r2.c     // Catch:{ all -> 0x021b }
            java.lang.String r7 = "Error selecting main event"
            r2.a(r7, r0)     // Catch:{ all -> 0x021b }
            if (r14 == 0) goto L_0x0112
        L_0x010d:
            r14.close()
        L_0x0110:
            r0 = 0
            goto L_0x0113
        L_0x0112:
            r0 = 0
        L_0x0113:
            if (r0 == 0) goto L_0x01eb
            java.lang.Object r2 = r0.first
            if (r2 != 0) goto L_0x011b
            goto L_0x01eb
        L_0x011b:
            java.lang.Object r2 = r0.first
            szz r2 = (defpackage.szz) r2
            r1.b = r2
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r14 = r0.longValue()
            r1.d = r14
            spb r0 = r1.a
            szg r0 = r0.o()
            szz r2 = r1.b
            java.lang.Object r0 = r0.a((defpackage.szz) r2, (java.lang.String) r3)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.c = r0
        L_0x013b:
            long r2 = r1.d
            r14 = -1
            long r2 = r2 + r14
            r1.d = r2
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0176
            spb r0 = r1.a
            spj r2 = r0.n()
            r2.h()
            sut r0 = r2.E()
            sur r0 = r0.k
            java.lang.String r3 = "Clearing complex main event info. appId"
            r0.a(r3, r8)
            android.database.sqlite.SQLiteDatabase r0 = r2.e()     // Catch:{ SQLiteException -> 0x0169 }
            java.lang.String[] r3 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0169 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x0169 }
            java.lang.String r4 = "delete from main_event_params where app_id=?"
            r0.execSQL(r4, r3)     // Catch:{ SQLiteException -> 0x0169 }
            goto L_0x0185
        L_0x0169:
            r0 = move-exception
            sut r2 = r2.E()
            sur r2 = r2.c
            java.lang.String r3 = "Error clearing complex main event"
            r2.a(r3, r0)
            goto L_0x0185
        L_0x0176:
            spb r0 = r1.a
            spj r2 = r0.n()
            long r5 = r1.d
            szz r7 = r1.b
            r3 = r19
            r2.a((java.lang.String) r3, (java.lang.Long) r4, (long) r5, (defpackage.szz) r7)
        L_0x0185:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            szz r2 = r1.b
            aucx r2 = r2.b
            int r3 = r2.size()
            r4 = 0
        L_0x0193:
            if (r4 >= r3) goto L_0x01af
            java.lang.Object r5 = r2.get(r4)
            tab r5 = (defpackage.tab) r5
            spb r6 = r1.a
            r6.o()
            java.lang.String r6 = r5.b
            tab r6 = defpackage.szg.b((defpackage.szz) r9, (java.lang.String) r6)
            if (r6 == 0) goto L_0x01a9
            goto L_0x01ac
        L_0x01a9:
            r0.add(r5)
        L_0x01ac:
            int r4 = r4 + 1
            goto L_0x0193
        L_0x01af:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01ba
            r0.addAll(r10)
            r10 = r0
            goto L_0x01e8
        L_0x01ba:
            boolean r0 = defpackage.ayjn.b()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            if (r0 == 0) goto L_0x01dd
            spb r0 = r1.a
            spg r0 = r0.v()
            suc r3 = defpackage.sud.aJ
            boolean r0 = r0.b(r8, r3)
            if (r0 != 0) goto L_0x01d1
            goto L_0x01dd
        L_0x01d1:
            spb r0 = r1.a
            sut r0 = r0.E()
            sur r0 = r0.d
            r0.a(r2, r13)
            goto L_0x01e8
        L_0x01dd:
            spb r0 = r1.a
            sut r0 = r0.E()
            sur r0 = r0.f
            r0.a(r2, r13)
        L_0x01e8:
            r0 = r13
            goto L_0x0288
        L_0x01eb:
            boolean r0 = defpackage.ayjn.b()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            if (r0 == 0) goto L_0x020e
            spb r0 = r1.a
            spg r0 = r0.v()
            suc r3 = defpackage.sud.aJ
            boolean r0 = r0.b(r8, r3)
            if (r0 != 0) goto L_0x0202
            goto L_0x020e
        L_0x0202:
            spb r0 = r1.a
            sut r0 = r0.E()
            sur r0 = r0.d
            r0.a(r2, r13, r4)
            goto L_0x0219
        L_0x020e:
            spb r0 = r1.a
            sut r0 = r0.E()
            sur r0 = r0.c
            r0.a(r2, r13, r4)
        L_0x0219:
            r2 = 0
            return r2
        L_0x021b:
            r0 = move-exception
            r2 = r14
        L_0x021d:
            if (r2 == 0) goto L_0x0222
            r2.close()
        L_0x0222:
            throw r0
        L_0x0223:
            r1.c = r4
            r1.b = r9
            spb r2 = r1.a
            szg r2 = r2.o()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.String r7 = "_epc"
            java.lang.Object r2 = r2.a((defpackage.szz) r9, (java.lang.String) r7)
            if (r2 == 0) goto L_0x023b
            r3 = r2
            goto L_0x023c
        L_0x023b:
        L_0x023c:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.d = r2
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0277
            boolean r2 = defpackage.ayjn.b()
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            if (r2 == 0) goto L_0x026b
            spb r2 = r1.a
            spg r2 = r2.v()
            suc r4 = defpackage.sud.aJ
            boolean r2 = r2.b(r8, r4)
            if (r2 != 0) goto L_0x025f
            goto L_0x026b
        L_0x025f:
            spb r2 = r1.a
            sut r2 = r2.E()
            sur r2 = r2.d
            r2.a(r3, r0)
            goto L_0x0288
        L_0x026b:
            spb r2 = r1.a
            sut r2 = r2.E()
            sur r2 = r2.f
            r2.a(r3, r0)
            goto L_0x0288
        L_0x0277:
            spb r2 = r1.a
            spj r2 = r2.n()
            long r5 = r1.d
            r3 = r19
            r7 = r20
            r2.a((java.lang.String) r3, (java.lang.Long) r4, (long) r5, (defpackage.szz) r7)
            goto L_0x0288
        L_0x0287:
        L_0x0288:
            r2 = 5
            java.lang.Object r2 = r9.c(r2)
            aucd r2 = (defpackage.aucd) r2
            r2.a((defpackage.aucj) r9)
            boolean r3 = r2.c
            if (r3 == 0) goto L_0x029c
            r2.c()
            r3 = 0
            r2.c = r3
        L_0x029c:
            aucj r3 = r2.b
            szz r3 = (defpackage.szz) r3
            szz r4 = defpackage.szz.g
            r0.getClass()
            int r4 = r3.a
            r4 = r4 | r11
            r3.a = r4
            r3.c = r0
            aucx r0 = defpackage.aucj.s()
            r3.b = r0
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x02b7
            goto L_0x02bd
        L_0x02b7:
            r2.c()
            r3 = 0
            r2.c = r3
        L_0x02bd:
            aucj r0 = r2.b
            szz r0 = (defpackage.szz) r0
            r0.a()
            aucx r0 = r0.b
            defpackage.auab.a((java.lang.Iterable) r10, (java.util.List) r0)
            aucj r0 = r2.i()
            szz r0 = (defpackage.szz) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sox.a(java.lang.String, szz):szz");
    }
}
