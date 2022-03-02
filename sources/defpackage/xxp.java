package defpackage;

import android.provider.ContactsContract;

/* renamed from: xxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xxp extends xxu {
    private final xyu a;
    private final xyr b;
    private final xwn c;
    private final jiq d;
    private final xvw e;
    private final xww f;
    private final xys g;
    private final xyq m;
    private final xxq n;
    private final xxx o;
    private final xxo p;
    private final amri q;
    private final amri r;

    static {
        String valueOf = String.valueOf(xxp.class.getSimpleName());
        if (valueOf.length() == 0) {
            new String("FSA2_");
        } else {
            "FSA2_".concat(valueOf);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xxp(defpackage.xww r19, defpackage.xwt r20, defpackage.xwn r21, android.content.ContentResolver r22, defpackage.xyu r23, android.accounts.Account r24, defpackage.yaz r25, defpackage.xvp r26, defpackage.jiq r27, defpackage.yav r28, defpackage.amri r29, defpackage.amri r30) {
        /*
            r18 = this;
            r6 = r18
            r7 = r22
            r8 = r24
            r15 = r25
            r0 = r18
            r1 = r22
            r2 = r24
            r3 = r25
            r4 = r28
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            r9 = r21
            r6.c = r9
            r0 = r23
            r6.a = r0
            xyr r10 = new xyr
            r0 = r10
            r3 = r26
            r4 = r25
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r6.b = r10
            r0 = r27
            r6.d = r0
            xvw r0 = new xvw
            r0.<init>(r8, r7, r15)
            r6.e = r0
            r0 = r19
            r6.f = r0
            xys r0 = new xys
            xvw r1 = r6.e
            r0.<init>(r15, r1)
            r6.g = r0
            xyq r10 = new xyq
            xvw r1 = r6.e
            xyr r2 = r6.b
            r0 = r10
            r3 = r24
            r4 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.m = r10
            xyh r0 = new xyh
            r0.<init>()
            xym r1 = new xym
            r1.<init>(r8, r7)
            xxq r2 = new xxq
            xyr r9 = r6.b
            xys r10 = r6.g
            xyq r11 = r6.m
            xvw r13 = r6.e
            r7 = r2
            r8 = r25
            r12 = r26
            r14 = r20
            r15 = r0
            r16 = r1
            r17 = r30
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r6.n = r2
            xxx r2 = new xxx
            xyr r9 = r6.b
            xys r10 = r6.g
            xyq r11 = r6.m
            xvw r13 = r6.e
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r6.o = r2
            xxo r2 = new xxo
            xyr r9 = r6.b
            xys r10 = r6.g
            xyq r11 = r6.m
            xvw r13 = r6.e
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r6.p = r2
            r0 = r29
            r6.q = r0
            r0 = r30
            r6.r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxp.<init>(xww, xwt, xwn, android.content.ContentResolver, xyu, android.accounts.Account, yaz, xvp, jiq, yav, amri, amri):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0190 A[Catch:{ all -> 0x010a, RemoteException -> 0x0103, all -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x019b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r12 = this;
            java.lang.String r0 = "FSA_groupSyncDown"
            yav r1 = r12.l
            r1.a()
            defpackage.xip.a()
            amri r1 = r12.q
            boolean r1 = r1.a()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0024
            xfs r1 = defpackage.xgi.a
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            yag r11 = new yag     // Catch:{ all -> 0x01a2 }
            xww r5 = r12.f     // Catch:{ all -> 0x01a2 }
            xwn r6 = r12.c     // Catch:{ all -> 0x01a2 }
            xyu r7 = r12.a     // Catch:{ all -> 0x01a2 }
            xvp r8 = r12.k     // Catch:{ all -> 0x01a2 }
            android.net.Uri r9 = android.provider.ContactsContract.Groups.CONTENT_URI     // Catch:{ all -> 0x01a2 }
            yaz r10 = r12.j     // Catch:{ all -> 0x01a2 }
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01a2 }
            xfs r4 = defpackage.xfx.a     // Catch:{ all -> 0x01a2 }
            java.lang.Object r4 = r4.a()     // Catch:{ all -> 0x01a2 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x01a2 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x01a2 }
            yaq r5 = new yaq     // Catch:{ all -> 0x01a2 }
            r5.<init>(r4)     // Catch:{ all -> 0x01a2 }
            yak r6 = new yak     // Catch:{ all -> 0x01a2 }
            xvp r7 = r12.k     // Catch:{ all -> 0x01a2 }
            r6.<init>(r11, r7, r5)     // Catch:{ all -> 0x01a2 }
            r6.a()     // Catch:{ all -> 0x01a2 }
            yaq r6 = new yaq     // Catch:{ all -> 0x01a2 }
            r6.<init>(r4)     // Catch:{ all -> 0x01a2 }
            xyr r4 = r12.b     // Catch:{ all -> 0x01a2 }
            r4.a((defpackage.yaq) r5, (defpackage.yaq) r6)     // Catch:{ all -> 0x01a2 }
            r4 = 0
        L_0x005d:
            xvp r5 = r12.k     // Catch:{ all -> 0x019f }
            r5.a()     // Catch:{ all -> 0x019f }
            ayrz r5 = defpackage.ayrz.a     // Catch:{ all -> 0x019f }
            aysa r5 = r5.a()     // Catch:{ all -> 0x019f }
            boolean r5 = r5.g()     // Catch:{ all -> 0x019f }
            if (r5 == 0) goto L_0x0081
        L_0x006e:
            long r7 = defpackage.ayrz.c()     // Catch:{ all -> 0x019f }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x019f }
            yao r5 = r6.a((long) r7, (java.util.concurrent.TimeUnit) r5)     // Catch:{ all -> 0x019f }
            if (r5 == 0) goto L_0x007b
            goto L_0x0085
        L_0x007b:
            xvp r5 = r12.k     // Catch:{ all -> 0x019f }
            r5.a()     // Catch:{ all -> 0x019f }
            goto L_0x006e
        L_0x0081:
            yao r5 = r6.a()     // Catch:{ all -> 0x019f }
        L_0x0085:
            r6.b()     // Catch:{ all -> 0x019f }
            amzy r7 = r5.a()     // Catch:{ all -> 0x019f }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x019f }
        L_0x0090:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x019f }
            if (r8 != 0) goto L_0x0157
            xvw r7 = r12.e     // Catch:{ all -> 0x019f }
            r7.b()     // Catch:{ all -> 0x019f }
            java.lang.String r7 = r5.b()     // Catch:{ all -> 0x019f }
            boolean r5 = r5.c()     // Catch:{ all -> 0x019f }
            if (r5 == 0) goto L_0x011c
            xwn r5 = r12.c     // Catch:{ all -> 0x019f }
            r5.b(r7)     // Catch:{ all -> 0x019f }
            xyu r5 = r12.a     // Catch:{ all -> 0x019f }
            android.net.Uri r6 = android.provider.ContactsContract.Groups.CONTENT_URI     // Catch:{ all -> 0x019f }
            r5.a(r6)     // Catch:{ all -> 0x019f }
            xyr r5 = r12.b     // Catch:{ all -> 0x019f }
            android.content.ContentResolver r6 = r5.a     // Catch:{ all -> 0x019f }
            android.net.Uri r7 = r5.f     // Catch:{ all -> 0x019f }
            java.lang.String[] r8 = defpackage.xyr.e     // Catch:{ all -> 0x019f }
            java.lang.String[] r9 = defpackage.xvw.a     // Catch:{ all -> 0x019f }
            java.lang.String r9 = "title = 'Starred in Android'"
            r10 = 0
            r11 = 0
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x019f }
            if (r6 == 0) goto L_0x010f
        L_0x00c5:
            boolean r7 = r6.moveToNext()     // Catch:{ all -> 0x010a }
            if (r7 == 0) goto L_0x00d2
            boolean r7 = r6.isNull(r3)     // Catch:{ all -> 0x010a }
            if (r7 != 0) goto L_0x00c5
            goto L_0x00d3
        L_0x00d2:
            r2 = 0
        L_0x00d3:
            r6.close()     // Catch:{ all -> 0x019f }
            if (r2 == 0) goto L_0x00d9
            goto L_0x00de
        L_0x00d9:
            java.lang.String r2 = "No synced Starred in Android groups."
            r5.a(r2)     // Catch:{ all -> 0x019f }
        L_0x00de:
            android.content.ContentResolver r2 = r5.a     // Catch:{ all -> 0x019f }
            android.net.Uri r3 = r5.f     // Catch:{ all -> 0x019f }
            java.lang.String r6 = "system_id = 'Contacts' AND sourceid IS NOT NULL"
            r7 = 0
            int r2 = defpackage.xvw.a(r2, r3, r6, r7)     // Catch:{ RemoteException -> 0x0103 }
            if (r2 > 0) goto L_0x00f0
            java.lang.String r2 = "No synced My Contacts groups."
            r5.a(r2)     // Catch:{ all -> 0x019f }
        L_0x00f0:
            if (r1 == 0) goto L_0x00fd
            amri r1 = r12.q
            java.lang.Object r1 = r1.b()
            xxg r1 = (defpackage.xxg) r1
            r1.g()
        L_0x00fd:
            yav r1 = r12.l
            r1.a(r0, r4)
            return
        L_0x0103:
            r2 = move-exception
            xye r3 = new xye     // Catch:{ all -> 0x019f }
            r3.<init>(r2)     // Catch:{ all -> 0x019f }
            throw r3     // Catch:{ all -> 0x019f }
        L_0x010a:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x019f }
            throw r2     // Catch:{ all -> 0x019f }
        L_0x010f:
            xye r2 = new xye     // Catch:{ all -> 0x019f }
            android.os.RemoteException r3 = new android.os.RemoteException     // Catch:{ all -> 0x019f }
            java.lang.String r5 = "Unable to query local Starred in Android Groups."
            r3.<init>(r5)     // Catch:{ all -> 0x019f }
            r2.<init>(r3)     // Catch:{ all -> 0x019f }
            throw r2     // Catch:{ all -> 0x019f }
        L_0x011c:
            xwn r5 = r12.c     // Catch:{ all -> 0x019f }
            defpackage.iva.a((java.lang.Object) r7)     // Catch:{ all -> 0x019f }
            xwo r8 = r5.a     // Catch:{ all -> 0x019f }
            xvk r8 = r8.a()     // Catch:{ all -> 0x019f }
            r9 = 5
            java.lang.Object r9 = r8.c(r9)     // Catch:{ all -> 0x019f }
            aucd r9 = (defpackage.aucd) r9     // Catch:{ all -> 0x019f }
            r9.a((defpackage.aucj) r8)     // Catch:{ all -> 0x019f }
            boolean r8 = r9.c     // Catch:{ all -> 0x019f }
            if (r8 != 0) goto L_0x0136
            goto L_0x013b
        L_0x0136:
            r9.c()     // Catch:{ all -> 0x019f }
            r9.c = r3     // Catch:{ all -> 0x019f }
        L_0x013b:
            aucj r8 = r9.b     // Catch:{ all -> 0x019f }
            xvk r8 = (defpackage.xvk) r8     // Catch:{ all -> 0x019f }
            xvk r10 = defpackage.xvk.g     // Catch:{ all -> 0x019f }
            r7.getClass()     // Catch:{ all -> 0x019f }
            int r10 = r8.a     // Catch:{ all -> 0x019f }
            r10 = r10 | 8
            r8.a = r10     // Catch:{ all -> 0x019f }
            r8.e = r7     // Catch:{ all -> 0x019f }
            aucj r7 = r9.i()     // Catch:{ all -> 0x019f }
            xvk r7 = (defpackage.xvk) r7     // Catch:{ all -> 0x019f }
            r5.a((defpackage.xvk) r7)     // Catch:{ all -> 0x019f }
            goto L_0x005d
        L_0x0157:
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x019f }
            yad r8 = (defpackage.yad) r8     // Catch:{ all -> 0x019f }
            java.lang.Object r9 = r8.a     // Catch:{ all -> 0x019f }
            xvu r9 = (defpackage.xvu) r9     // Catch:{ all -> 0x019f }
            java.lang.Object r10 = r8.b     // Catch:{ all -> 0x019f }
            xvu r10 = (defpackage.xvu) r10     // Catch:{ all -> 0x019f }
            if (r10 == 0) goto L_0x0177
            java.lang.String r10 = r10.m()     // Catch:{ all -> 0x019f }
            java.lang.String r11 = r9.m()     // Catch:{ all -> 0x019f }
            boolean r10 = android.text.TextUtils.equals(r10, r11)     // Catch:{ all -> 0x019f }
            if (r10 == 0) goto L_0x0177
            r10 = 1
            goto L_0x0178
        L_0x0177:
            r10 = 0
        L_0x0178:
            r9.k()     // Catch:{ all -> 0x019f }
            java.lang.String r9 = r9.k()     // Catch:{ all -> 0x019f }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x019f }
            if (r9 != 0) goto L_0x0186
            goto L_0x0189
        L_0x0186:
            if (r10 == 0) goto L_0x0189
            goto L_0x018e
        L_0x0189:
            xys r9 = r12.g     // Catch:{ all -> 0x019f }
            r9.a(r8, r2)     // Catch:{ all -> 0x019f }
        L_0x018e:
            if (r1 == 0) goto L_0x019b
            amri r8 = r12.q     // Catch:{ all -> 0x019f }
            java.lang.Object r8 = r8.b()     // Catch:{ all -> 0x019f }
            xxg r8 = (defpackage.xxg) r8     // Catch:{ all -> 0x019f }
            r8.e(r2)     // Catch:{ all -> 0x019f }
        L_0x019b:
            int r4 = r4 + 1
            goto L_0x0090
        L_0x019f:
            r2 = move-exception
            r3 = r4
            goto L_0x01a3
        L_0x01a2:
            r2 = move-exception
        L_0x01a3:
            if (r1 == 0) goto L_0x01b0
            amri r1 = r12.q
            java.lang.Object r1 = r1.b()
            xxg r1 = (defpackage.xxg) r1
            r1.g()
        L_0x01b0:
            yav r1 = r12.l
            r1.a(r0, r3)
            goto L_0x01b7
        L_0x01b6:
            throw r2
        L_0x01b7:
            goto L_0x01b6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxp.a():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r10 = this;
            java.lang.String r0 = "FSA_groupSyncUp"
            yav r1 = r10.l
            r1.a()
            defpackage.xip.a()
            amri r1 = r10.r
            boolean r1 = r1.a()
            r2 = 0
            if (r1 == 0) goto L_0x0023
            xfs r1 = defpackage.xgl.a
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0023
            r1 = 1
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            xyr r3 = r10.b     // Catch:{ all -> 0x0149 }
            android.content.ContentResolver r4 = r3.a     // Catch:{ all -> 0x0149 }
            android.net.Uri r5 = r3.f     // Catch:{ all -> 0x0149 }
            java.lang.String[] r6 = defpackage.xvw.a     // Catch:{ all -> 0x0149 }
            java.lang.String r7 = "data_set IS NULL AND (sourceid IS NULL OR dirty != 0 OR deleted != 0)"
            r6 = 0
            r8 = 0
            r9 = 0
            xwb r4 = defpackage.xwb.a(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0149 }
            java.util.EnumMap r5 = new java.util.EnumMap     // Catch:{ all -> 0x0144 }
            java.lang.Class<xyk> r6 = defpackage.xyk.class
            r5.<init>(r6)     // Catch:{ all -> 0x0144 }
            xyk r6 = defpackage.xyk.INSERTED     // Catch:{ all -> 0x0144 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0144 }
            r7.<init>()     // Catch:{ all -> 0x0144 }
            r5.put(r6, r7)     // Catch:{ all -> 0x0144 }
            xyk r6 = defpackage.xyk.DELETED     // Catch:{ all -> 0x0144 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0144 }
            r7.<init>()     // Catch:{ all -> 0x0144 }
            r5.put(r6, r7)     // Catch:{ all -> 0x0144 }
            xyk r6 = defpackage.xyk.UPDATED     // Catch:{ all -> 0x0144 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0144 }
            r7.<init>()     // Catch:{ all -> 0x0144 }
            r5.put(r6, r7)     // Catch:{ all -> 0x0144 }
            defpackage.xip.a()     // Catch:{ all -> 0x0144 }
            xfs r6 = defpackage.xif.a     // Catch:{ all -> 0x0144 }
            java.lang.Object r6 = r6.a()     // Catch:{ all -> 0x0144 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0144 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0144 }
            r7 = 0
        L_0x006a:
            xvu r8 = r4.b()     // Catch:{ all -> 0x0144 }
            if (r8 != 0) goto L_0x0071
            goto L_0x00ba
        L_0x0071:
            if (r7 >= r6) goto L_0x00ba
            xvp r9 = r3.c     // Catch:{ all -> 0x0144 }
            r9.a()     // Catch:{ all -> 0x0144 }
            boolean r9 = r8.f()     // Catch:{ all -> 0x0144 }
            if (r9 == 0) goto L_0x0092
            java.lang.String r9 = r8.j()     // Catch:{ all -> 0x0144 }
            if (r9 == 0) goto L_0x006a
            xyk r9 = defpackage.xyk.DELETED     // Catch:{ all -> 0x0144 }
            java.lang.Object r9 = r5.get(r9)     // Catch:{ all -> 0x0144 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x0144 }
            r9.add(r8)     // Catch:{ all -> 0x0144 }
            int r7 = r7 + 1
            goto L_0x006a
        L_0x0092:
            java.lang.String r9 = r8.j()     // Catch:{ all -> 0x0144 }
            if (r9 != 0) goto L_0x00a6
            xyk r9 = defpackage.xyk.INSERTED     // Catch:{ all -> 0x0144 }
            java.lang.Object r9 = r5.get(r9)     // Catch:{ all -> 0x0144 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x0144 }
            r9.add(r8)     // Catch:{ all -> 0x0144 }
            int r7 = r7 + 1
            goto L_0x006a
        L_0x00a6:
            boolean r9 = r8.e()     // Catch:{ all -> 0x0144 }
            if (r9 == 0) goto L_0x006a
            xyk r9 = defpackage.xyk.UPDATED     // Catch:{ all -> 0x0144 }
            java.lang.Object r9 = r5.get(r9)     // Catch:{ all -> 0x0144 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x0144 }
            r9.add(r8)     // Catch:{ all -> 0x0144 }
            int r7 = r7 + 1
            goto L_0x006a
        L_0x00ba:
            android.net.Uri r6 = r3.f     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = "data_set IS NULL"
            r3.a((android.net.Uri) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0144 }
            xyk r3 = defpackage.xyk.DELETED     // Catch:{ all -> 0x0144 }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0144 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0144 }
            r3.size()     // Catch:{ all -> 0x0144 }
            r4.f()     // Catch:{ all -> 0x0149 }
            xyk r3 = defpackage.xyk.INSERTED     // Catch:{ all -> 0x0149 }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0149 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0149 }
            xyk r4 = defpackage.xyk.DELETED     // Catch:{ all -> 0x0149 }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x0149 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0149 }
            xyk r6 = defpackage.xyk.UPDATED     // Catch:{ all -> 0x0149 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0149 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0149 }
            int r6 = r3.size()     // Catch:{ all -> 0x0149 }
            int r7 = r4.size()     // Catch:{ all -> 0x0149 }
            int r6 = r6 + r7
            int r2 = r5.size()     // Catch:{ all -> 0x0149 }
            int r2 = r2 + r6
            if (r1 != 0) goto L_0x00f8
            goto L_0x0120
        L_0x00f8:
            int r6 = r3.size()     // Catch:{ all -> 0x0142 }
            int r7 = r5.size()     // Catch:{ all -> 0x0142 }
            int r6 = r6 + r7
            xfs r7 = defpackage.xgo.a     // Catch:{ all -> 0x0142 }
            java.lang.Object r7 = r7.a()     // Catch:{ all -> 0x0142 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0142 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0142 }
            if (r7 != 0) goto L_0x0110
            goto L_0x0115
        L_0x0110:
            int r7 = r4.size()     // Catch:{ all -> 0x0142 }
            int r6 = r6 + r7
        L_0x0115:
            amri r7 = r10.r     // Catch:{ all -> 0x0142 }
            java.lang.Object r7 = r7.b()     // Catch:{ all -> 0x0142 }
            xxj r7 = (defpackage.xxj) r7     // Catch:{ all -> 0x0142 }
            r7.b(r6)     // Catch:{ all -> 0x0142 }
        L_0x0120:
            xxq r6 = r10.n     // Catch:{ all -> 0x0142 }
            r6.a((java.util.List) r3)     // Catch:{ all -> 0x0142 }
            xxx r3 = r10.o     // Catch:{ all -> 0x0142 }
            r3.a((java.util.List) r5)     // Catch:{ all -> 0x0142 }
            xxo r3 = r10.p     // Catch:{ all -> 0x0142 }
            r3.a((java.util.List) r4)     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x013c
            amri r1 = r10.r
            java.lang.Object r1 = r1.b()
            xxj r1 = (defpackage.xxj) r1
            r1.g()
        L_0x013c:
            yav r1 = r10.l
            r1.a(r0, r2)
            return
        L_0x0142:
            r3 = move-exception
            goto L_0x014a
        L_0x0144:
            r3 = move-exception
            r4.f()     // Catch:{ all -> 0x0149 }
            throw r3     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r3 = move-exception
        L_0x014a:
            if (r1 == 0) goto L_0x0157
            amri r1 = r10.r
            java.lang.Object r1 = r1.b()
            xxj r1 = (defpackage.xxj) r1
            r1.g()
        L_0x0157:
            yav r1 = r10.l
            r1.a(r0, r2)
            goto L_0x015e
        L_0x015d:
            throw r3
        L_0x015e:
            goto L_0x015d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxp.b():void");
    }

    public final void a(xkj xkj) {
        try {
            xyr xyr = this.b;
            this.j.a(xjo.GROUP, xkj, xjm.CP2, xyr.a(xvw.a(ContactsContract.Groups.CONTENT_URI, xyr.b), "data_set IS NULL AND deleted = 0"));
        } catch (xye e2) {
            this.j.a(xjo.GROUP, xkj, xjm.CP2, -1);
        }
    }
}
