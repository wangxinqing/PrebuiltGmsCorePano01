package defpackage;

import android.content.Context;

/* renamed from: vel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vel {
    public int a = 0;
    public boolean b;
    private final ves c;
    private final uyt d;
    private final uyj e;
    private final arwg f;
    private final vav g;
    private final arwm h = new vek(this, "SendReportRpc");
    private final vej i = new vej(this);

    public vel(Context context) {
        this.f = (arwg) thl.a(context, arwg.class);
        this.c = (ves) thl.a(context, ves.class);
        this.d = (uyt) thl.a(context, uyt.class);
        this.e = (uyj) thl.a(context, uyj.class);
        this.g = (vav) thl.a(context, vav.class);
    }

    public final void a() {
        this.f.b();
        jjg jjg = tgc.a;
        if (this.a > 0) {
            this.b = true;
        } else if (!this.f.b(this.h)) {
            arwg arwg = this.f;
            arwm arwm = this.h;
            auyy auyy = this.g.f.d;
            if (auyy == null) {
                auyy = auyy.v;
            }
            arwg.a(arwm, (long) auyy.u);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018e, code lost:
        if (r7 != 107) goto L_0x0190;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0318 A[Catch:{ NameNotFoundException -> 0x05dc, all -> 0x0a3a }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x034e A[Catch:{ NameNotFoundException -> 0x05dc, all -> 0x0a3a }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0360 A[SYNTHETIC, Splitter:B:139:0x0360] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0466 A[Catch:{ NameNotFoundException -> 0x05dc, all -> 0x0a3a }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0505 A[Catch:{ NameNotFoundException -> 0x05dc, all -> 0x0a3a }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x057f A[Catch:{ NameNotFoundException -> 0x05dc, all -> 0x0a3a }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0580 A[Catch:{ NameNotFoundException -> 0x05dc, all -> 0x0a3a }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x05c6 A[Catch:{ NameNotFoundException -> 0x05dc, all -> 0x0a3a }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x05c7 A[Catch:{ NameNotFoundException -> 0x05dc, all -> 0x0a3a }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0628 A[ADDED_TO_REGION, Catch:{ NameNotFoundException -> 0x05dc, all -> 0x0a3a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r37 = this;
            r1 = r37
            java.lang.String r2 = "*"
            java.lang.String r3 = "0p:discoverer"
            arwg r4 = r1.f
            r4.b()
            jjg r4 = defpackage.tgc.a
            java.util.HashSet r4 = new java.util.HashSet
            uyt r5 = r1.d
            java.util.Set r5 = r5.c()
            r4.<init>(r5)
            uyj r5 = r1.e
            java.util.Set r5 = r5.a()
            r4.addAll(r5)
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0a3d }
            r5 = 1
            r7 = 0
        L_0x0027:
            boolean r8 = r4.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r8 == 0) goto L_0x0a37
            java.lang.Object r8 = r4.next()     // Catch:{ all -> 0x0a3a }
            com.google.android.gms.nearby.messages.ClientAppIdentifier r8 = (com.google.android.gms.nearby.messages.ClientAppIdentifier) r8     // Catch:{ all -> 0x0a3a }
            uyj r9 = r1.e     // Catch:{ all -> 0x0a3a }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x0a3a }
            r10.<init>()     // Catch:{ all -> 0x0a3a }
            java.util.Set r9 = r9.c     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x0040:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r11 != 0) goto L_0x09eb
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0a3a }
            r15.<init>()     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r9 = r10.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x004f:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0a3a }
            java.lang.String r14 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r13 = "a"
            if (r10 != 0) goto L_0x0883
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0a3a }
            uyj r9 = r1.e     // Catch:{ all -> 0x0a3a }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x0a3a }
            r12.<init>()     // Catch:{ all -> 0x0a3a }
            java.util.Map r9 = r9.b     // Catch:{ all -> 0x0a3a }
            java.util.Collection r9 = r9.values()     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x006c:
            boolean r17 = r9.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r17 == 0) goto L_0x008c
            java.lang.Object r17 = r9.next()     // Catch:{ all -> 0x0a3a }
            r11 = r17
            vdo r11 = (defpackage.vdo) r11     // Catch:{ all -> 0x0a3a }
            vdt r6 = r11.c     // Catch:{ all -> 0x0a3a }
            com.google.android.gms.nearby.messages.ClientAppIdentifier r6 = r6.b     // Catch:{ all -> 0x0a3a }
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0a3a }
            if (r6 == 0) goto L_0x006c
            vdt r6 = r11.c     // Catch:{ all -> 0x0a3a }
            java.lang.String r6 = r6.a     // Catch:{ all -> 0x0a3a }
            r12.add(r6)     // Catch:{ all -> 0x0a3a }
            goto L_0x006c
        L_0x008c:
            r10.<init>(r12)     // Catch:{ all -> 0x0a3a }
            uyt r6 = r1.d     // Catch:{ all -> 0x0a3a }
            if (r8 != 0) goto L_0x009a
            java.util.Map r6 = r6.f     // Catch:{ all -> 0x0a3a }
            java.util.Collection r6 = r6.values()     // Catch:{ all -> 0x0a3a }
            goto L_0x00a2
        L_0x009a:
            aneu r6 = r6.d     // Catch:{ all -> 0x0a3a }
            amxb r6 = (defpackage.amxb) r6     // Catch:{ all -> 0x0a3a }
            java.util.Set r6 = r6.c((java.lang.Object) r8)     // Catch:{ all -> 0x0a3a }
        L_0x00a2:
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x0a3a }
            r9.<init>()     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x00ab:
            boolean r11 = r6.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r11 != 0) goto L_0x082a
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0a3a }
            r6.<init>()     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x00ba:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0a3a }
            r17 = r13
            if (r11 != 0) goto L_0x06da
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0a3a }
            uyt r9 = r1.d     // Catch:{ all -> 0x0a3a }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x0a3a }
            aneu r9 = r9.c     // Catch:{ all -> 0x0a3a }
            amxb r9 = (defpackage.amxb) r9     // Catch:{ all -> 0x0a3a }
            java.util.Set r9 = r9.c((java.lang.Object) r8)     // Catch:{ all -> 0x0a3a }
            r12.<init>(r9)     // Catch:{ all -> 0x0a3a }
            r11.<init>(r12)     // Catch:{ all -> 0x0a3a }
            r15.size()     // Catch:{ all -> 0x0a3a }
            r10.size()     // Catch:{ all -> 0x0a3a }
            r6.size()     // Catch:{ all -> 0x0a3a }
            r11.size()     // Catch:{ all -> 0x0a3a }
            boolean r23 = r8.c(r3)     // Catch:{ all -> 0x0a3a }
            arwg r9 = r1.f     // Catch:{ all -> 0x0a3a }
            r9.b()     // Catch:{ all -> 0x0a3a }
            int r9 = r1.a     // Catch:{ all -> 0x0a3a }
            int r9 = r9 + r5
            r1.a = r9     // Catch:{ all -> 0x0a3a }
            r9 = 0
            r1.b = r9     // Catch:{ all -> 0x0a3a }
            ves r13 = r1.c     // Catch:{ all -> 0x0a3a }
            vej r12 = r1.i     // Catch:{ all -> 0x0a3a }
            java.lang.String r9 = "ves"
            uwv r5 = r13.f     // Catch:{ all -> 0x0a3a }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x0a3a }
            boolean r22 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0a3a }
            if (r22 != 0) goto L_0x0106
            goto L_0x011f
        L_0x0106:
            boolean r22 = r15.isEmpty()     // Catch:{ all -> 0x0a3a }
            if (r22 == 0) goto L_0x011f
            boolean r22 = r6.isEmpty()     // Catch:{ all -> 0x0a3a }
            if (r22 == 0) goto L_0x011f
            r12.a()     // Catch:{ all -> 0x0a3a }
            r26 = r2
            r34 = r3
            r25 = r4
            r27 = r7
            goto L_0x061a
        L_0x011f:
            java.util.List r22 = r13.a()     // Catch:{ all -> 0x0a3a }
            android.content.Context r1 = r13.a     // Catch:{ all -> 0x0a3a }
            r25 = r4
            java.lang.Class<vak> r4 = defpackage.vak.class
            java.lang.Object r1 = defpackage.thl.a((android.content.Context) r1, (java.lang.Class) r4)     // Catch:{ all -> 0x0a3a }
            vak r1 = (defpackage.vak) r1     // Catch:{ all -> 0x0a3a }
            arwg r4 = r1.l     // Catch:{ all -> 0x0a3a }
            r4.b()     // Catch:{ all -> 0x0a3a }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0a3a }
            r26 = r2
            java.util.Map r2 = r1.h     // Catch:{ all -> 0x0a3a }
            int r2 = r2.size()     // Catch:{ all -> 0x0a3a }
            r4.<init>(r2)     // Catch:{ all -> 0x0a3a }
            java.util.Map r2 = r1.h     // Catch:{ all -> 0x0a3a }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x014b:
            boolean r27 = r2.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r27 != 0) goto L_0x0636
            amzt r1 = new amzt     // Catch:{ all -> 0x0a3a }
            r1.<init>()     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x015a:
            boolean r27 = r2.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r27 == 0) goto L_0x01b7
            java.lang.Object r27 = r2.next()     // Catch:{ all -> 0x0a3a }
            r28 = r2
            r2 = r27
            auzg r2 = (defpackage.auzg) r2     // Catch:{ all -> 0x0a3a }
            aync r27 = defpackage.aync.a     // Catch:{ all -> 0x0a3a }
            aynd r27 = r27.a()     // Catch:{ all -> 0x0a3a }
            boolean r27 = r27.N()     // Catch:{ all -> 0x0a3a }
            if (r27 == 0) goto L_0x01a9
            r27 = r7
            auzf r7 = r2.b     // Catch:{ all -> 0x0a3a }
            if (r7 == 0) goto L_0x017d
            goto L_0x017f
        L_0x017d:
            auzf r7 = defpackage.auzf.d     // Catch:{ all -> 0x0a3a }
        L_0x017f:
            int r7 = r7.b     // Catch:{ all -> 0x0a3a }
            int r7 = defpackage.avaw.a(r7)     // Catch:{ all -> 0x0a3a }
            if (r7 != 0) goto L_0x018a
            r29 = r5
            goto L_0x0190
        L_0x018a:
            r29 = r5
            r5 = 107(0x6b, float:1.5E-43)
            if (r7 == r5) goto L_0x019f
        L_0x0190:
            boolean r5 = r8.c(r3)     // Catch:{ all -> 0x0a3a }
            if (r5 != 0) goto L_0x0198
            goto L_0x019f
        L_0x0198:
            r7 = r27
            r2 = r28
            r5 = r29
            goto L_0x015a
        L_0x019f:
            r1.c(r2)     // Catch:{ all -> 0x0a3a }
            r7 = r27
            r2 = r28
            r5 = r29
            goto L_0x015a
        L_0x01a9:
            r29 = r5
            r27 = r7
            r1.c(r2)     // Catch:{ all -> 0x0a3a }
            r7 = r27
            r2 = r28
            r5 = r29
            goto L_0x015a
        L_0x01b7:
            r29 = r5
            r27 = r7
            amzy r1 = r1.a()     // Catch:{ all -> 0x0a3a }
            r4.size()     // Catch:{ all -> 0x0a3a }
            r1.size()     // Catch:{ all -> 0x0a3a }
            r1.size()     // Catch:{ all -> 0x0a3a }
            android.content.Context r2 = r13.a     // Catch:{ all -> 0x0a3a }
            java.lang.Class<vak> r4 = defpackage.vak.class
            java.lang.Object r2 = defpackage.thl.a((android.content.Context) r2, (java.lang.Class) r4)     // Catch:{ all -> 0x0a3a }
            vak r2 = (defpackage.vak) r2     // Catch:{ all -> 0x0a3a }
            arwg r4 = r2.l     // Catch:{ all -> 0x0a3a }
            r4.b()     // Catch:{ all -> 0x0a3a }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x0a3a }
            r4.<init>()     // Catch:{ all -> 0x0a3a }
            java.util.Collection r2 = r2.a()     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x01e4:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r5 == 0) goto L_0x026f
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0a3a }
            vai r5 = (defpackage.vai) r5     // Catch:{ all -> 0x0a3a }
            java.util.Set r7 = r5.c()     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x01f8:
            boolean r28 = r7.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r28 == 0) goto L_0x0267
            java.lang.Object r28 = r7.next()     // Catch:{ all -> 0x0a3a }
            r30 = r2
            r2 = r28
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0a3a }
            avao r28 = defpackage.avao.d     // Catch:{ all -> 0x0a3a }
            r31 = r7
            aucd r7 = r28.o()     // Catch:{ all -> 0x0a3a }
            r28 = r3
            boolean r3 = r7.c     // Catch:{ all -> 0x0a3a }
            if (r3 != 0) goto L_0x0217
            goto L_0x021d
        L_0x0217:
            r7.c()     // Catch:{ all -> 0x0a3a }
            r3 = 0
            r7.c = r3     // Catch:{ all -> 0x0a3a }
        L_0x021d:
            aucj r3 = r7.b     // Catch:{ all -> 0x0a3a }
            avao r3 = (defpackage.avao) r3     // Catch:{ all -> 0x0a3a }
            r2.getClass()     // Catch:{ all -> 0x0a3a }
            r32 = r12
            int r12 = r3.a     // Catch:{ all -> 0x0a3a }
            r24 = 1
            r12 = r12 | 1
            r3.a = r12     // Catch:{ all -> 0x0a3a }
            r3.b = r2     // Catch:{ all -> 0x0a3a }
            byte[] r2 = r5.i     // Catch:{ all -> 0x0a3a }
            if (r2 != 0) goto L_0x0235
            goto L_0x0255
        L_0x0235:
            auay r2 = defpackage.auay.a((byte[]) r2)     // Catch:{ all -> 0x0a3a }
            boolean r3 = r7.c     // Catch:{ all -> 0x0a3a }
            if (r3 != 0) goto L_0x023e
            goto L_0x0244
        L_0x023e:
            r7.c()     // Catch:{ all -> 0x0a3a }
            r3 = 0
            r7.c = r3     // Catch:{ all -> 0x0a3a }
        L_0x0244:
            aucj r3 = r7.b     // Catch:{ all -> 0x0a3a }
            avao r3 = (defpackage.avao) r3     // Catch:{ all -> 0x0a3a }
            r2.getClass()     // Catch:{ all -> 0x0a3a }
            int r12 = r3.a     // Catch:{ all -> 0x0a3a }
            r18 = 2
            r12 = r12 | 2
            r3.a = r12     // Catch:{ all -> 0x0a3a }
            r3.c = r2     // Catch:{ all -> 0x0a3a }
        L_0x0255:
            aucj r2 = r7.i()     // Catch:{ all -> 0x0a3a }
            avao r2 = (defpackage.avao) r2     // Catch:{ all -> 0x0a3a }
            r4.add(r2)     // Catch:{ all -> 0x0a3a }
            r3 = r28
            r2 = r30
            r7 = r31
            r12 = r32
            goto L_0x01f8
        L_0x0267:
            r30 = r2
            r28 = r3
            r32 = r12
            goto L_0x01e4
        L_0x026f:
            r28 = r3
            r32 = r12
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0a3a }
            r2.<init>(r4)     // Catch:{ all -> 0x0a3a }
            ob r3 = new ob     // Catch:{ all -> 0x0a3a }
            r3.<init>()     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x0281:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r5 == 0) goto L_0x029d
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0a3a }
            auzg r5 = (defpackage.auzg) r5     // Catch:{ all -> 0x0a3a }
            vag r7 = new vag     // Catch:{ all -> 0x0a3a }
            auzf r5 = r5.b     // Catch:{ all -> 0x0a3a }
            if (r5 == 0) goto L_0x0294
            goto L_0x0296
        L_0x0294:
            auzf r5 = defpackage.auzf.d     // Catch:{ all -> 0x0a3a }
        L_0x0296:
            r7.<init>((defpackage.auzf) r5)     // Catch:{ all -> 0x0a3a }
            r3.add(r7)     // Catch:{ all -> 0x0a3a }
            goto L_0x0281
        L_0x029d:
            ob r4 = new ob     // Catch:{ all -> 0x0a3a }
            r4.<init>()     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x02a6:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r7 == 0) goto L_0x02bd
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x0a3a }
            avao r7 = (defpackage.avao) r7     // Catch:{ all -> 0x0a3a }
            vag r12 = new vag     // Catch:{ all -> 0x0a3a }
            java.lang.String r7 = r7.b     // Catch:{ all -> 0x0a3a }
            r12.<init>((java.lang.String) r7)     // Catch:{ all -> 0x0a3a }
            r4.add(r12)     // Catch:{ all -> 0x0a3a }
            goto L_0x02a6
        L_0x02bd:
            r3.addAll(r4)     // Catch:{ all -> 0x0a3a }
            vah r4 = r13.a((com.google.android.gms.nearby.messages.ClientAppIdentifier) r8)     // Catch:{ all -> 0x0a3a }
            boolean r5 = defpackage.aync.f()     // Catch:{ all -> 0x0a3a }
            if (r5 == 0) goto L_0x02f9
            boolean r5 = r4.c()     // Catch:{ all -> 0x0a3a }
            if (r5 == 0) goto L_0x02f3
            anav r5 = defpackage.anax.j()     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x02d8:
            boolean r12 = r7.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r12 == 0) goto L_0x02ee
            java.lang.Object r12 = r7.next()     // Catch:{ all -> 0x0a3a }
            vag r12 = (defpackage.vag) r12     // Catch:{ all -> 0x0a3a }
            java.util.Set r30 = r4.b(r12)     // Catch:{ all -> 0x0a3a }
            if (r30 == 0) goto L_0x02d8
            r5.b(r12)     // Catch:{ all -> 0x0a3a }
            goto L_0x02d8
        L_0x02ee:
            anax r5 = r5.a()     // Catch:{ all -> 0x0a3a }
            goto L_0x02f5
        L_0x02f3:
            anfv r5 = defpackage.anfv.a     // Catch:{ all -> 0x0a3a }
        L_0x02f5:
            r3.removeAll(r5)     // Catch:{ all -> 0x0a3a }
            goto L_0x02fb
        L_0x02f9:
            anfv r5 = defpackage.anfv.a     // Catch:{ all -> 0x0a3a }
        L_0x02fb:
            boolean r7 = defpackage.aync.f()     // Catch:{ all -> 0x0a3a }
            if (r7 == 0) goto L_0x0311
            boolean r7 = r5.isEmpty()     // Catch:{ all -> 0x0a3a }
            if (r7 == 0) goto L_0x030f
            boolean r7 = r3.isEmpty()     // Catch:{ all -> 0x0a3a }
            if (r7 == 0) goto L_0x0311
            r7 = 1
            goto L_0x0312
        L_0x030f:
            r7 = 1
            goto L_0x0312
        L_0x0311:
            r7 = 0
        L_0x0312:
            boolean r12 = defpackage.aync.f()     // Catch:{ all -> 0x0a3a }
            if (r12 != 0) goto L_0x034e
            boolean r12 = r4.c()     // Catch:{ all -> 0x0a3a }
            if (r12 != 0) goto L_0x032c
            boolean r12 = r3.isEmpty()     // Catch:{ all -> 0x0a3a }
            if (r12 != 0) goto L_0x0328
            r31 = r5
            r5 = 0
            goto L_0x0351
        L_0x0328:
            r31 = r5
            r5 = 1
            goto L_0x0351
        L_0x032c:
            java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x0330:
            boolean r30 = r12.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r30 == 0) goto L_0x034a
            java.lang.Object r30 = r12.next()     // Catch:{ all -> 0x0a3a }
            r31 = r5
            r5 = r30
            vag r5 = (defpackage.vag) r5     // Catch:{ all -> 0x0a3a }
            java.util.Set r5 = r4.b(r5)     // Catch:{ all -> 0x0a3a }
            if (r5 != 0) goto L_0x0347
            goto L_0x0350
        L_0x0347:
            r5 = r31
            goto L_0x0330
        L_0x034a:
            r31 = r5
            r5 = 1
            goto L_0x0351
        L_0x034e:
            r31 = r5
        L_0x0350:
            r5 = 0
        L_0x0351:
            boolean r12 = r15.isEmpty()     // Catch:{ all -> 0x0a3a }
            r30 = r2
            java.lang.String r2 = "ReportRpcManager: "
            if (r12 != 0) goto L_0x0360
            r33 = r3
            r5 = 0
            goto L_0x045c
        L_0x0360:
            java.util.Iterator r12 = r6.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x0364:
            boolean r33 = r12.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r33 == 0) goto L_0x0399
            java.lang.Object r33 = r12.next()     // Catch:{ all -> 0x0a3a }
            r34 = r12
            r12 = r33
            avaf r12 = (defpackage.avaf) r12     // Catch:{ all -> 0x0a3a }
            r33 = r3
            r35 = r4
            long r3 = r12.c     // Catch:{ all -> 0x0a3a }
            r20 = 0
            int r36 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r36 != 0) goto L_0x0396
            int r3 = r12.h     // Catch:{ all -> 0x0a3a }
            int r3 = defpackage.avcf.a(r3)     // Catch:{ all -> 0x0a3a }
            if (r3 == 0) goto L_0x0393
            r4 = 2
            if (r3 == r4) goto L_0x038c
            goto L_0x0393
        L_0x038c:
            r3 = r33
            r12 = r34
            r4 = r35
            goto L_0x0364
        L_0x0393:
            r5 = 0
            goto L_0x045c
        L_0x0396:
            r5 = 0
            goto L_0x045c
        L_0x0399:
            r33 = r3
            r35 = r4
            boolean r3 = r10.isEmpty()     // Catch:{ all -> 0x0a3a }
            if (r3 == 0) goto L_0x045b
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x0a3a }
            if (r3 == 0) goto L_0x0459
            boolean r3 = r22.isEmpty()     // Catch:{ all -> 0x0a3a }
            if (r3 == 0) goto L_0x03b8
            if (r7 == 0) goto L_0x03b2
            goto L_0x03ba
        L_0x03b2:
            if (r5 == 0) goto L_0x03b5
            goto L_0x03ba
        L_0x03b5:
            r5 = 0
            goto L_0x045c
        L_0x03b8:
            if (r7 == 0) goto L_0x0457
        L_0x03ba:
            jjg r3 = defpackage.tgc.a     // Catch:{ all -> 0x0a3a }
            anie r3 = r3.d()     // Catch:{ all -> 0x0a3a }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0a3a }
            r4 = 235(0xeb, float:3.3E-43)
            r5 = r17
            anie r3 = r3.a((java.lang.String) r9, (java.lang.String) r5, (int) r4, (java.lang.String) r14)     // Catch:{ all -> 0x0a3a }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0a3a }
            java.lang.String r4 = "%s Skipping some call, returning cached messages for beacon IDs and URLs: %s"
            boolean r7 = defpackage.aync.f()     // Catch:{ all -> 0x0a3a }
            if (r7 != 0) goto L_0x03d7
            r7 = r33
            goto L_0x03d9
        L_0x03d7:
            r7 = r31
        L_0x03d9:
            r3.a((java.lang.String) r4, (java.lang.Object) r2, (java.lang.Object) r7)     // Catch:{ all -> 0x0a3a }
            android.content.Context r3 = r13.a     // Catch:{ all -> 0x0a3a }
            java.lang.Class<vbp> r4 = defpackage.vbp.class
            java.lang.Object r3 = defpackage.thl.a((android.content.Context) r3, (java.lang.Class) r4)     // Catch:{ all -> 0x0a3a }
            vbp r3 = (defpackage.vbp) r3     // Catch:{ all -> 0x0a3a }
            boolean r4 = defpackage.aync.f()     // Catch:{ all -> 0x0a3a }
            if (r4 == 0) goto L_0x03ed
            goto L_0x03ef
        L_0x03ed:
            r31 = r33
        L_0x03ef:
            boolean r4 = r35.c()     // Catch:{ all -> 0x0a3a }
            if (r4 == 0) goto L_0x042d
            ob r4 = new ob     // Catch:{ all -> 0x0a3a }
            r4.<init>()     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r7 = r31.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x03fe:
            boolean r12 = r7.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r12 == 0) goto L_0x0421
            java.lang.Object r12 = r7.next()     // Catch:{ all -> 0x0a3a }
            vag r12 = (defpackage.vag) r12     // Catch:{ all -> 0x0a3a }
            r17 = r5
            r5 = r35
            java.util.Set r12 = r5.b(r12)     // Catch:{ all -> 0x0a3a }
            if (r12 == 0) goto L_0x041c
            r4.addAll(r12)     // Catch:{ all -> 0x0a3a }
            r35 = r5
            r5 = r17
            goto L_0x03fe
        L_0x041c:
            r35 = r5
            r5 = r17
            goto L_0x03fe
        L_0x0421:
            r17 = r5
            r5 = 0
            avae[] r7 = new defpackage.avae[r5]     // Catch:{ all -> 0x0a3a }
            java.lang.Object[] r4 = r4.toArray(r7)     // Catch:{ all -> 0x0a3a }
            avae[] r4 = (defpackage.avae[]) r4     // Catch:{ all -> 0x0a3a }
            goto L_0x0433
        L_0x042d:
            r17 = r5
            r4 = 0
            avae[] r5 = new defpackage.avae[r4]     // Catch:{ all -> 0x0a3a }
            r4 = r5
        L_0x0433:
            r5 = 0
            r3.a((com.google.android.gms.nearby.messages.ClientAppIdentifier) r8, (defpackage.avae[]) r4, (java.lang.String) r5)     // Catch:{ all -> 0x0a3a }
            r32.a()     // Catch:{ all -> 0x0a3a }
            boolean r3 = defpackage.aync.f()     // Catch:{ all -> 0x0a3a }
            if (r3 == 0) goto L_0x044c
            boolean r3 = r33.isEmpty()     // Catch:{ all -> 0x0a3a }
            if (r3 != 0) goto L_0x0448
            goto L_0x044c
        L_0x0448:
            r34 = r28
            goto L_0x061a
        L_0x044c:
            boolean r3 = defpackage.aync.f()     // Catch:{ all -> 0x0a3a }
            if (r3 == 0) goto L_0x0453
            goto L_0x045c
        L_0x0453:
            r34 = r28
            goto L_0x061a
        L_0x0457:
            r5 = 0
            goto L_0x045c
        L_0x0459:
            r5 = 0
            goto L_0x045c
        L_0x045b:
            r5 = 0
        L_0x045c:
            ved r3 = r13.d     // Catch:{ all -> 0x0a3a }
            r7 = r28
            boolean r4 = r8.c(r7)     // Catch:{ all -> 0x0a3a }
            if (r4 != 0) goto L_0x04f8
            arwg r4 = r3.b     // Catch:{ all -> 0x0a3a }
            r4.b()     // Catch:{ all -> 0x0a3a }
            arwg r4 = r3.b     // Catch:{ all -> 0x0a3a }
            r4.b()     // Catch:{ all -> 0x0a3a }
            java.util.Set r4 = r3.a()     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x0478:
            boolean r12 = r4.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r12 == 0) goto L_0x049a
            java.lang.Object r12 = r4.next()     // Catch:{ all -> 0x0a3a }
            avch r12 = (defpackage.avch) r12     // Catch:{ all -> 0x0a3a }
            int r12 = r12.k     // Catch:{ all -> 0x0a3a }
            avaa[] r12 = r3.b(r12)     // Catch:{ all -> 0x0a3a }
            if (r12 == 0) goto L_0x0498
            int r5 = r12.length     // Catch:{ all -> 0x0a3a }
            if (r5 <= 0) goto L_0x0498
            int r5 = r5 + -1
            r4 = r12[r5]     // Catch:{ all -> 0x0a3a }
            long r4 = r4.d     // Catch:{ all -> 0x0a3a }
            r20 = r4
            goto L_0x049c
        L_0x0498:
            r5 = 0
            goto L_0x0478
        L_0x049a:
            r20 = 0
        L_0x049c:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0a3a }
            int r12 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r12 > 0) goto L_0x04f8
            java.util.Set r3 = r3.a()     // Catch:{ all -> 0x0a3a }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0a3a }
            if (r4 != 0) goto L_0x04f8
            avco r4 = defpackage.avco.b     // Catch:{ all -> 0x0a3a }
            aucd r4 = r4.o()     // Catch:{ all -> 0x0a3a }
            aucf r4 = (defpackage.aucf) r4     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x04ba:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r5 == 0) goto L_0x04ef
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0a3a }
            avch r5 = (defpackage.avch) r5     // Catch:{ all -> 0x0a3a }
            avab r12 = defpackage.avab.c     // Catch:{ all -> 0x0a3a }
            aucd r12 = r12.o()     // Catch:{ all -> 0x0a3a }
            r20 = r3
            boolean r3 = r12.c     // Catch:{ all -> 0x0a3a }
            if (r3 != 0) goto L_0x04d3
            goto L_0x04d9
        L_0x04d3:
            r12.c()     // Catch:{ all -> 0x0a3a }
            r3 = 0
            r12.c = r3     // Catch:{ all -> 0x0a3a }
        L_0x04d9:
            aucj r3 = r12.b     // Catch:{ all -> 0x0a3a }
            avab r3 = (defpackage.avab) r3     // Catch:{ all -> 0x0a3a }
            int r5 = r5.k     // Catch:{ all -> 0x0a3a }
            r3.b = r5     // Catch:{ all -> 0x0a3a }
            int r5 = r3.a     // Catch:{ all -> 0x0a3a }
            r21 = 1
            r5 = r5 | 1
            r3.a = r5     // Catch:{ all -> 0x0a3a }
            r4.b((defpackage.aucd) r12)     // Catch:{ all -> 0x0a3a }
            r3 = r20
            goto L_0x04ba
        L_0x04ef:
            aucj r3 = r4.i()     // Catch:{ all -> 0x0a3a }
            avco r3 = (defpackage.avco) r3     // Catch:{ all -> 0x0a3a }
            r21 = r3
            goto L_0x04fa
        L_0x04f8:
            r21 = 0
        L_0x04fa:
            java.util.Iterator r3 = r6.iterator()     // Catch:{ all -> 0x0a3a }
            r4 = 0
        L_0x04ff:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r5 == 0) goto L_0x056e
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0a3a }
            avaf r5 = (defpackage.avaf) r5     // Catch:{ all -> 0x0a3a }
            r28 = r9
            r12 = r10
            long r9 = r5.c     // Catch:{ all -> 0x0a3a }
            r34 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r20 = (r9 > r34 ? 1 : (r9 == r34 ? 0 : -1))
            if (r20 != 0) goto L_0x0563
            int r9 = r4 + 1
            r10 = 5
            java.lang.Object r20 = r5.c(r10)     // Catch:{ all -> 0x0a3a }
            r10 = r20
            aucd r10 = (defpackage.aucd) r10     // Catch:{ all -> 0x0a3a }
            r10.a((defpackage.aucj) r5)     // Catch:{ all -> 0x0a3a }
            aucf r10 = (defpackage.aucf) r10     // Catch:{ all -> 0x0a3a }
            vav r5 = r13.h     // Catch:{ all -> 0x0a3a }
            r31 = r11
            r20 = r12
            long r11 = r5.e()     // Catch:{ all -> 0x0a3a }
            boolean r5 = r10.c     // Catch:{ all -> 0x0a3a }
            if (r5 != 0) goto L_0x0538
            goto L_0x053e
        L_0x0538:
            r10.c()     // Catch:{ all -> 0x0a3a }
            r5 = 0
            r10.c = r5     // Catch:{ all -> 0x0a3a }
        L_0x053e:
            aucj r5 = r10.b     // Catch:{ all -> 0x0a3a }
            avaf r5 = (defpackage.avaf) r5     // Catch:{ all -> 0x0a3a }
            avaf r34 = defpackage.avaf.i     // Catch:{ all -> 0x0a3a }
            r34 = r3
            int r3 = r5.a     // Catch:{ all -> 0x0a3a }
            r18 = 2
            r3 = r3 | 2
            r5.a = r3     // Catch:{ all -> 0x0a3a }
            r5.c = r11     // Catch:{ all -> 0x0a3a }
            aucj r3 = r10.i()     // Catch:{ all -> 0x0a3a }
            avaf r3 = (defpackage.avaf) r3     // Catch:{ all -> 0x0a3a }
            r6.set(r4, r3)     // Catch:{ all -> 0x0a3a }
            r4 = r9
            r10 = r20
            r9 = r28
            r11 = r31
            r3 = r34
            goto L_0x04ff
        L_0x0563:
            r34 = r3
            r31 = r11
            r20 = r12
            r10 = r20
            r9 = r28
            goto L_0x04ff
        L_0x056e:
            r28 = r9
            r20 = r10
            r31 = r11
            ver r3 = new ver     // Catch:{ all -> 0x0a3a }
            r3.<init>()     // Catch:{ all -> 0x0a3a }
            boolean r4 = defpackage.aync.f()     // Catch:{ all -> 0x0a3a }
            if (r4 != 0) goto L_0x0580
            goto L_0x058d
        L_0x0580:
            boolean r4 = r8.c(r7)     // Catch:{ all -> 0x0a3a }
            if (r4 == 0) goto L_0x058d
            ver r3 = defpackage.ver.a(r6)     // Catch:{ all -> 0x0a3a }
            r12 = r3
            goto L_0x058e
        L_0x058d:
            r12 = r3
        L_0x058e:
            veq r3 = new veq     // Catch:{ all -> 0x0a3a }
            r5 = r28
            r9 = r3
            r28 = r20
            r10 = r13
            r11 = r8
            r4 = 0
            r34 = r7
            r4 = r13
            r7 = r17
            r13 = r6
            r35 = r1
            r1 = r14
            r14 = r31
            r36 = r15
            r16 = r28
            r17 = r33
            r18 = r32
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0a3a }
            boolean r9 = r36.isEmpty()     // Catch:{ all -> 0x0a3a }
            if (r9 == 0) goto L_0x05c7
            boolean r9 = r28.isEmpty()     // Catch:{ all -> 0x0a3a }
            if (r9 == 0) goto L_0x05c7
            boolean r9 = r6.isEmpty()     // Catch:{ all -> 0x0a3a }
            if (r9 == 0) goto L_0x05c7
            boolean r9 = r31.isEmpty()     // Catch:{ all -> 0x0a3a }
            if (r9 == 0) goto L_0x05c7
            goto L_0x05f9
        L_0x05c7:
            boolean r9 = r8.b()     // Catch:{ all -> 0x0a3a }
            if (r9 != 0) goto L_0x05f9
            android.content.Context r9 = r4.a     // Catch:{ NameNotFoundException -> 0x05dc }
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x05dc }
            com.google.android.gms.nearby.messages.internal.ClientAppContext r10 = r8.c     // Catch:{ NameNotFoundException -> 0x05dc }
            java.lang.String r10 = r10.b     // Catch:{ NameNotFoundException -> 0x05dc }
            r11 = 0
            r9.getPackageInfo(r10, r11)     // Catch:{ NameNotFoundException -> 0x05dc }
            goto L_0x05f9
        L_0x05dc:
            r0 = move-exception
            jjg r4 = defpackage.tgc.a     // Catch:{ all -> 0x0a3a }
            anie r4 = r4.b()     // Catch:{ all -> 0x0a3a }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x0a3a }
            r6 = 313(0x139, float:4.39E-43)
            anie r1 = r4.a((java.lang.String) r5, (java.lang.String) r7, (int) r6, (java.lang.String) r1)     // Catch:{ all -> 0x0a3a }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0a3a }
            java.lang.String r4 = "%s Failed to find package for %s"
            r1.a((java.lang.String) r4, (java.lang.Object) r2, (java.lang.Object) r8)     // Catch:{ all -> 0x0a3a }
            r1 = 13
            r2 = 0
            r3.a(r2, r1)     // Catch:{ all -> 0x0a3a }
            goto L_0x061a
        L_0x05f9:
            arwg r1 = r4.c     // Catch:{ all -> 0x0a3a }
            vep r2 = new vep     // Catch:{ all -> 0x0a3a }
            java.lang.String r11 = "ReportRpcManager.report"
            r9 = r2
            r10 = r4
            r12 = r22
            r13 = r35
            r14 = r30
            r15 = r8
            r16 = r29
            r17 = r6
            r18 = r31
            r19 = r36
            r20 = r28
            r22 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0a3a }
            r1.c(r2)     // Catch:{ all -> 0x0a3a }
        L_0x061a:
            if (r23 != 0) goto L_0x0628
        L_0x061c:
            r1 = r37
            r4 = r25
            r2 = r26
            r3 = r34
            r5 = 1
            r7 = 1
            goto L_0x0027
        L_0x0628:
            if (r27 != 0) goto L_0x061c
            r1 = r37
            r4 = r25
            r2 = r26
            r3 = r34
            r5 = 1
            r7 = 0
            goto L_0x0027
        L_0x0636:
            r34 = r3
            r29 = r5
            r27 = r7
            r5 = r9
            r28 = r10
            r31 = r11
            r32 = r12
            r36 = r15
            r7 = r17
            r10 = 0
            r3 = r1
            r9 = r4
            r4 = r13
            r1 = r14
            java.lang.Object r11 = r2.next()     // Catch:{ all -> 0x0a3a }
            auzf r11 = (defpackage.auzf) r11     // Catch:{ all -> 0x0a3a }
            auzg r12 = defpackage.auzg.d     // Catch:{ all -> 0x0a3a }
            aucd r12 = r12.o()     // Catch:{ all -> 0x0a3a }
            boolean r13 = r12.c     // Catch:{ all -> 0x0a3a }
            if (r13 != 0) goto L_0x065d
            goto L_0x0663
        L_0x065d:
            r12.c()     // Catch:{ all -> 0x0a3a }
            r13 = 0
            r12.c = r13     // Catch:{ all -> 0x0a3a }
        L_0x0663:
            aucj r13 = r12.b     // Catch:{ all -> 0x0a3a }
            auzg r13 = (defpackage.auzg) r13     // Catch:{ all -> 0x0a3a }
            r11.getClass()     // Catch:{ all -> 0x0a3a }
            r13.b = r11     // Catch:{ all -> 0x0a3a }
            int r14 = r13.a     // Catch:{ all -> 0x0a3a }
            r15 = 1
            r14 = r14 | r15
            r13.a = r14     // Catch:{ all -> 0x0a3a }
            vai r13 = r3.a((defpackage.auzf) r11)     // Catch:{ all -> 0x0a3a }
            if (r13 != 0) goto L_0x0679
            goto L_0x06a3
        L_0x0679:
            auzf r14 = r13.h     // Catch:{ all -> 0x0a3a }
            boolean r11 = defpackage.ius.a(r14, r11)     // Catch:{ all -> 0x0a3a }
            if (r11 != 0) goto L_0x06c3
            byte[] r11 = r13.i     // Catch:{ all -> 0x0a3a }
            if (r11 == 0) goto L_0x06a3
            auay r11 = defpackage.auay.a((byte[]) r11)     // Catch:{ all -> 0x0a3a }
            boolean r13 = r12.c     // Catch:{ all -> 0x0a3a }
            if (r13 != 0) goto L_0x068e
            goto L_0x0694
        L_0x068e:
            r12.c()     // Catch:{ all -> 0x0a3a }
            r13 = 0
            r12.c = r13     // Catch:{ all -> 0x0a3a }
        L_0x0694:
            aucj r13 = r12.b     // Catch:{ all -> 0x0a3a }
            auzg r13 = (defpackage.auzg) r13     // Catch:{ all -> 0x0a3a }
            r11.getClass()     // Catch:{ all -> 0x0a3a }
            int r14 = r13.a     // Catch:{ all -> 0x0a3a }
            r15 = 2
            r14 = r14 | r15
            r13.a = r14     // Catch:{ all -> 0x0a3a }
            r13.c = r11     // Catch:{ all -> 0x0a3a }
        L_0x06a3:
            aucj r11 = r12.i()     // Catch:{ all -> 0x0a3a }
            auzg r11 = (defpackage.auzg) r11     // Catch:{ all -> 0x0a3a }
            r9.add(r11)     // Catch:{ all -> 0x0a3a }
            r14 = r1
            r1 = r3
            r13 = r4
            r17 = r7
            r4 = r9
            r7 = r27
            r10 = r28
            r11 = r31
            r12 = r32
            r3 = r34
            r15 = r36
            r9 = r5
            r5 = r29
            goto L_0x014b
        L_0x06c3:
            r14 = r1
            r1 = r3
            r13 = r4
            r17 = r7
            r4 = r9
            r7 = r27
            r10 = r28
            r11 = r31
            r12 = r32
            r3 = r34
            r15 = r36
            r9 = r5
            r5 = r29
            goto L_0x014b
        L_0x06da:
            r26 = r2
            r34 = r3
            r25 = r4
            r27 = r7
            r28 = r10
            r1 = r14
            r36 = r15
            r7 = r17
            r10 = 0
            java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x0a3a }
            uyq r2 = (defpackage.uyq) r2     // Catch:{ all -> 0x0a3a }
            if (r2 == 0) goto L_0x0812
            avaf r3 = defpackage.avaf.i     // Catch:{ all -> 0x0a3a }
            aucd r3 = r3.o()     // Catch:{ all -> 0x0a3a }
            aucf r3 = (defpackage.aucf) r3     // Catch:{ all -> 0x0a3a }
            boolean r4 = defpackage.aync.i()     // Catch:{ all -> 0x0a3a }
            if (r4 != 0) goto L_0x0703
            java.lang.String r4 = r2.a     // Catch:{ all -> 0x0a3a }
            goto L_0x0705
        L_0x0703:
            java.lang.String r4 = "0"
        L_0x0705:
            boolean r5 = r3.c     // Catch:{ all -> 0x0a3a }
            if (r5 != 0) goto L_0x070a
            goto L_0x0710
        L_0x070a:
            r3.c()     // Catch:{ all -> 0x0a3a }
            r5 = 0
            r3.c = r5     // Catch:{ all -> 0x0a3a }
        L_0x0710:
            aucj r5 = r3.b     // Catch:{ all -> 0x0a3a }
            avaf r5 = (defpackage.avaf) r5     // Catch:{ all -> 0x0a3a }
            r4.getClass()     // Catch:{ all -> 0x0a3a }
            int r11 = r5.a     // Catch:{ all -> 0x0a3a }
            r12 = 1
            r11 = r11 | r12
            r5.a = r11     // Catch:{ all -> 0x0a3a }
            r5.b = r4     // Catch:{ all -> 0x0a3a }
            com.google.android.gms.nearby.messages.MessageFilter r4 = r2.c     // Catch:{ all -> 0x0a3a }
            ob r5 = new ob     // Catch:{ all -> 0x0a3a }
            r5.<init>()     // Catch:{ all -> 0x0a3a }
            boolean r11 = r4.e     // Catch:{ all -> 0x0a3a }
            if (r11 == 0) goto L_0x0734
            r11 = r26
            auzu r12 = defpackage.vem.a((java.lang.String) r11, (java.lang.String) r11)     // Catch:{ all -> 0x0a3a }
            r5.add(r12)     // Catch:{ all -> 0x0a3a }
            goto L_0x0736
        L_0x0734:
            r11 = r26
        L_0x0736:
            java.util.List r4 = r4.c     // Catch:{ all -> 0x0a3a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0a3a }
        L_0x073c:
            boolean r12 = r4.hasNext()     // Catch:{ all -> 0x0a3a }
            if (r12 == 0) goto L_0x0758
            java.lang.Object r12 = r4.next()     // Catch:{ all -> 0x0a3a }
            com.google.android.gms.nearby.messages.internal.MessageType r12 = (com.google.android.gms.nearby.messages.internal.MessageType) r12     // Catch:{ all -> 0x0a3a }
            if (r12 == 0) goto L_0x0753
            java.lang.String r13 = r12.b     // Catch:{ all -> 0x0a3a }
            java.lang.String r12 = r12.c     // Catch:{ all -> 0x0a3a }
            auzu r12 = defpackage.vem.a((java.lang.String) r13, (java.lang.String) r12)     // Catch:{ all -> 0x0a3a }
            goto L_0x0754
        L_0x0753:
            r12 = r10
        L_0x0754:
            r5.add(r12)     // Catch:{ all -> 0x0a3a }
            goto L_0x073c
        L_0x0758:
            auzs r4 = defpackage.auzs.b     // Catch:{ all -> 0x0a3a }
            r12 = 5
            java.lang.Object r12 = r4.c(r12)     // Catch:{ all -> 0x0a3a }
            aucd r12 = (defpackage.aucd) r12     // Catch:{ all -> 0x0a3a }
            r12.a((defpackage.aucj) r4)     // Catch:{ all -> 0x0a3a }
            aucf r12 = (defpackage.aucf) r12     // Catch:{ all -> 0x0a3a }
            boolean r4 = r12.c     // Catch:{ all -> 0x0a3a }
            if (r4 != 0) goto L_0x076b
            goto L_0x0771
        L_0x076b:
            r12.c()     // Catch:{ all -> 0x0a3a }
            r4 = 0
            r12.c = r4     // Catch:{ all -> 0x0a3a }
        L_0x0771:
            aucj r4 = r12.b     // Catch:{ all -> 0x0a3a }
            auzs r4 = (defpackage.auzs) r4     // Catch:{ all -> 0x0a3a }
            r4.e()     // Catch:{ all -> 0x0a3a }
            aucx r4 = r4.a     // Catch:{ all -> 0x0a3a }
            defpackage.auab.a((java.lang.Iterable) r5, (java.util.List) r4)     // Catch:{ all -> 0x0a3a }
            aucj r4 = r12.i()     // Catch:{ all -> 0x0a3a }
            auzs r4 = (defpackage.auzs) r4     // Catch:{ all -> 0x0a3a }
            boolean r5 = r3.c     // Catch:{ all -> 0x0a3a }
            if (r5 != 0) goto L_0x0788
            goto L_0x078e
        L_0x0788:
            r3.c()     // Catch:{ all -> 0x0a3a }
            r5 = 0
            r3.c = r5     // Catch:{ all -> 0x0a3a }
        L_0x078e:
            aucj r5 = r3.b     // Catch:{ all -> 0x0a3a }
            avaf r5 = (defpackage.avaf) r5     // Catch:{ all -> 0x0a3a }
            r4.getClass()     // Catch:{ all -> 0x0a3a }
            r5.g = r4     // Catch:{ all -> 0x0a3a }
            int r4 = r5.a     // Catch:{ all -> 0x0a3a }
            r4 = r4 | 512(0x200, float:7.175E-43)
            r5.a = r4     // Catch:{ all -> 0x0a3a }
            com.google.android.gms.nearby.messages.Strategy r12 = r2.d     // Catch:{ all -> 0x0a3a }
            r4 = r4 | 2
            r5.a = r4     // Catch:{ all -> 0x0a3a }
            r13 = 0
            r5.c = r13     // Catch:{ all -> 0x0a3a }
            avaj r4 = defpackage.vem.a((com.google.android.gms.nearby.messages.Strategy) r12)     // Catch:{ all -> 0x0a3a }
            boolean r5 = r3.c     // Catch:{ all -> 0x0a3a }
            if (r5 != 0) goto L_0x07b0
            goto L_0x07b6
        L_0x07b0:
            r3.c()     // Catch:{ all -> 0x0a3a }
            r5 = 0
            r3.c = r5     // Catch:{ all -> 0x0a3a }
        L_0x07b6:
            aucj r5 = r3.b     // Catch:{ all -> 0x0a3a }
            avaf r5 = (defpackage.avaf) r5     // Catch:{ all -> 0x0a3a }
            r4.getClass()     // Catch:{ all -> 0x0a3a }
            r5.e = r4     // Catch:{ all -> 0x0a3a }
            int r4 = r5.a     // Catch:{ all -> 0x0a3a }
            r4 = r4 | 16
            r5.a = r4     // Catch:{ all -> 0x0a3a }
            boolean r2 = r2.a()     // Catch:{ all -> 0x0a3a }
            if (r2 != 0) goto L_0x07cd
            r2 = 3
            goto L_0x07ce
        L_0x07cd:
            r2 = 2
        L_0x07ce:
            boolean r4 = r3.c     // Catch:{ all -> 0x0a3a }
            if (r4 != 0) goto L_0x07d3
            goto L_0x07d9
        L_0x07d3:
            r3.c()     // Catch:{ all -> 0x0a3a }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x0a3a }
        L_0x07d9:
            aucj r4 = r3.b     // Catch:{ all -> 0x0a3a }
            avaf r4 = (defpackage.avaf) r4     // Catch:{ all -> 0x0a3a }
            int r2 = r2 + -1
            r4.h = r2     // Catch:{ all -> 0x0a3a }
            int r2 = r4.a     // Catch:{ all -> 0x0a3a }
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r4.a = r2     // Catch:{ all -> 0x0a3a }
            int r2 = r12.f     // Catch:{ all -> 0x0a3a }
            auzl r2 = defpackage.vem.a((int) r2)     // Catch:{ all -> 0x0a3a }
            if (r2 != 0) goto L_0x07f0
            goto L_0x080a
        L_0x07f0:
            boolean r4 = r3.c     // Catch:{ all -> 0x0a3a }
            if (r4 != 0) goto L_0x07f5
            goto L_0x07fb
        L_0x07f5:
            r3.c()     // Catch:{ all -> 0x0a3a }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x0a3a }
        L_0x07fb:
            aucj r4 = r3.b     // Catch:{ all -> 0x0a3a }
            avaf r4 = (defpackage.avaf) r4     // Catch:{ all -> 0x0a3a }
            r2.getClass()     // Catch:{ all -> 0x0a3a }
            r4.f = r2     // Catch:{ all -> 0x0a3a }
            int r2 = r4.a     // Catch:{ all -> 0x0a3a }
            r2 = r2 | 128(0x80, float:1.794E-43)
            r4.a = r2     // Catch:{ all -> 0x0a3a }
        L_0x080a:
            aucj r2 = r3.i()     // Catch:{ all -> 0x0a3a }
            r12 = r2
            avaf r12 = (defpackage.avaf) r12     // Catch:{ all -> 0x0a3a }
            goto L_0x0815
        L_0x0812:
            r11 = r26
            r12 = r10
        L_0x0815:
            r6.add(r12)     // Catch:{ all -> 0x0a3a }
            r14 = r1
            r13 = r7
            r2 = r11
            r4 = r25
            r7 = r27
            r10 = r28
            r3 = r34
            r15 = r36
            r5 = 1
            r1 = r37
            goto L_0x00ba
        L_0x082a:
            r11 = r2
            r34 = r3
            r25 = r4
            r27 = r7
            r28 = r10
            r7 = r13
            r1 = r14
            r36 = r15
            r10 = 0
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x0a3a }
            uyq r2 = (defpackage.uyq) r2     // Catch:{ all -> 0x0a3a }
            vdo r3 = r2.f     // Catch:{ all -> 0x0a3a }
            if (r3 == 0) goto L_0x0871
            int r3 = r3.f     // Catch:{ all -> 0x0a3a }
            boolean r3 = defpackage.vdo.a(r3)     // Catch:{ all -> 0x0a3a }
            if (r3 == 0) goto L_0x085f
            r9.add(r2)     // Catch:{ all -> 0x0a3a }
            r14 = r1
            r13 = r7
            r2 = r11
            r4 = r25
            r7 = r27
            r10 = r28
            r3 = r34
            r15 = r36
            r5 = 1
            r1 = r37
            goto L_0x00ab
        L_0x085f:
            r14 = r1
            r13 = r7
            r2 = r11
            r4 = r25
            r7 = r27
            r10 = r28
            r3 = r34
            r15 = r36
            r5 = 1
            r1 = r37
            goto L_0x00ab
        L_0x0871:
            r14 = r1
            r13 = r7
            r2 = r11
            r4 = r25
            r7 = r27
            r10 = r28
            r3 = r34
            r15 = r36
            r5 = 1
            r1 = r37
            goto L_0x00ab
        L_0x0883:
            r11 = r2
            r34 = r3
            r25 = r4
            r27 = r7
            r7 = r13
            r1 = r14
            r36 = r15
            r10 = 0
            java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x0a3a }
            uyg r2 = (defpackage.uyg) r2     // Catch:{ all -> 0x0a3a }
            if (r2 == 0) goto L_0x09d6
            com.google.android.gms.nearby.messages.Strategy r3 = r2.c     // Catch:{ all -> 0x0a3a }
            auzx r4 = defpackage.auzx.f     // Catch:{ all -> 0x0a3a }
            aucd r4 = r4.o()     // Catch:{ all -> 0x0a3a }
            aucf r4 = (defpackage.aucf) r4     // Catch:{ all -> 0x0a3a }
            java.lang.String r5 = r2.a     // Catch:{ all -> 0x0a3a }
            boolean r6 = r4.c     // Catch:{ all -> 0x0a3a }
            if (r6 != 0) goto L_0x08a8
            goto L_0x08ae
        L_0x08a8:
            r4.c()     // Catch:{ all -> 0x0a3a }
            r6 = 0
            r4.c = r6     // Catch:{ all -> 0x0a3a }
        L_0x08ae:
            aucj r6 = r4.b     // Catch:{ all -> 0x0a3a }
            auzx r6 = (defpackage.auzx) r6     // Catch:{ all -> 0x0a3a }
            r5.getClass()     // Catch:{ all -> 0x0a3a }
            int r10 = r6.a     // Catch:{ all -> 0x0a3a }
            r12 = 1
            r10 = r10 | r12
            r6.a = r10     // Catch:{ all -> 0x0a3a }
            r6.b = r5     // Catch:{ all -> 0x0a3a }
            com.google.android.gms.nearby.messages.Message r5 = r2.b     // Catch:{ all -> 0x0a3a }
            auzr r5 = defpackage.vem.a((com.google.android.gms.nearby.messages.Message) r5)     // Catch:{ all -> 0x0a3a }
            boolean r6 = r4.c     // Catch:{ all -> 0x0a3a }
            if (r6 != 0) goto L_0x08c8
            goto L_0x08ce
        L_0x08c8:
            r4.c()     // Catch:{ all -> 0x0a3a }
            r6 = 0
            r4.c = r6     // Catch:{ all -> 0x0a3a }
        L_0x08ce:
            aucj r6 = r4.b     // Catch:{ all -> 0x0a3a }
            auzx r6 = (defpackage.auzx) r6     // Catch:{ all -> 0x0a3a }
            r5.getClass()     // Catch:{ all -> 0x0a3a }
            r6.d = r5     // Catch:{ all -> 0x0a3a }
            int r5 = r6.a     // Catch:{ all -> 0x0a3a }
            r5 = r5 | 4
            r6.a = r5     // Catch:{ all -> 0x0a3a }
            java.lang.String r5 = "vem"
            auzc r6 = defpackage.auzc.e     // Catch:{ all -> 0x0a3a }
            aucd r6 = r6.o()     // Catch:{ all -> 0x0a3a }
            aucf r6 = (defpackage.aucf) r6     // Catch:{ all -> 0x0a3a }
            auzd r10 = defpackage.auzd.c     // Catch:{ all -> 0x0a3a }
            aucd r10 = r10.o()     // Catch:{ all -> 0x0a3a }
            aucf r10 = (defpackage.aucf) r10     // Catch:{ all -> 0x0a3a }
            boolean r12 = r10.c     // Catch:{ all -> 0x0a3a }
            if (r12 != 0) goto L_0x08f4
            goto L_0x08fa
        L_0x08f4:
            r10.c()     // Catch:{ all -> 0x0a3a }
            r12 = 0
            r10.c = r12     // Catch:{ all -> 0x0a3a }
        L_0x08fa:
            aucj r12 = r10.b     // Catch:{ all -> 0x0a3a }
            auzd r12 = (defpackage.auzd) r12     // Catch:{ all -> 0x0a3a }
            r13 = 1
            r12.b = r13     // Catch:{ all -> 0x0a3a }
            int r14 = r12.a     // Catch:{ all -> 0x0a3a }
            r14 = r14 | r13
            r12.a = r14     // Catch:{ all -> 0x0a3a }
            boolean r12 = r6.c     // Catch:{ all -> 0x0a3a }
            if (r12 != 0) goto L_0x090b
            goto L_0x0911
        L_0x090b:
            r6.c()     // Catch:{ all -> 0x0a3a }
            r12 = 0
            r6.c = r12     // Catch:{ all -> 0x0a3a }
        L_0x0911:
            aucj r12 = r6.b     // Catch:{ all -> 0x0a3a }
            auzc r12 = (defpackage.auzc) r12     // Catch:{ all -> 0x0a3a }
            aucj r10 = r10.i()     // Catch:{ all -> 0x0a3a }
            auzd r10 = (defpackage.auzd) r10     // Catch:{ all -> 0x0a3a }
            r10.getClass()     // Catch:{ all -> 0x0a3a }
            r12.c = r10     // Catch:{ all -> 0x0a3a }
            int r10 = r12.a     // Catch:{ all -> 0x0a3a }
            r13 = 2
            r10 = r10 | r13
            r12.a = r10     // Catch:{ all -> 0x0a3a }
            com.google.android.gms.nearby.messages.Strategy r10 = r2.c     // Catch:{ all -> 0x0a3a }
            int r10 = r10.e     // Catch:{ all -> 0x0a3a }
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 300(0x12c, float:4.2E-43)
            if (r10 != r12) goto L_0x0932
        L_0x0931:
            goto L_0x0938
        L_0x0932:
            r12 = 86400(0x15180, float:1.21072E-40)
            if (r10 > r12) goto L_0x0931
            goto L_0x094f
        L_0x0938:
            jjg r12 = defpackage.tgc.a     // Catch:{ all -> 0x0a3a }
            anie r12 = r12.b()     // Catch:{ all -> 0x0a3a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x0a3a }
            r14 = 57
            anie r1 = r12.a((java.lang.String) r5, (java.lang.String) r7, (int) r14, (java.lang.String) r1)     // Catch:{ all -> 0x0a3a }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0a3a }
            java.lang.String r5 = "ProtoConverter: Publish with unexpectedly long TTL(%d seconds). Using default TTL(%d seconds)."
            r1.a((java.lang.String) r5, (int) r10, (int) r13)     // Catch:{ all -> 0x0a3a }
            r10 = 300(0x12c, float:4.2E-43)
        L_0x094f:
            long r12 = defpackage.vds.b(r10)     // Catch:{ all -> 0x0a3a }
            boolean r1 = r6.c     // Catch:{ all -> 0x0a3a }
            if (r1 != 0) goto L_0x0958
            goto L_0x095e
        L_0x0958:
            r6.c()     // Catch:{ all -> 0x0a3a }
            r1 = 0
            r6.c = r1     // Catch:{ all -> 0x0a3a }
        L_0x095e:
            aucj r1 = r6.b     // Catch:{ all -> 0x0a3a }
            auzc r1 = (defpackage.auzc) r1     // Catch:{ all -> 0x0a3a }
            int r5 = r1.a     // Catch:{ all -> 0x0a3a }
            r7 = 1
            r5 = r5 | r7
            r1.a = r5     // Catch:{ all -> 0x0a3a }
            r1.b = r12     // Catch:{ all -> 0x0a3a }
            com.google.android.gms.nearby.messages.Strategy r1 = r2.c     // Catch:{ all -> 0x0a3a }
            int r1 = r1.f     // Catch:{ all -> 0x0a3a }
            auzl r1 = defpackage.vem.a((int) r1)     // Catch:{ all -> 0x0a3a }
            if (r1 != 0) goto L_0x0975
            goto L_0x098f
        L_0x0975:
            boolean r2 = r6.c     // Catch:{ all -> 0x0a3a }
            if (r2 != 0) goto L_0x097a
            goto L_0x0980
        L_0x097a:
            r6.c()     // Catch:{ all -> 0x0a3a }
            r2 = 0
            r6.c = r2     // Catch:{ all -> 0x0a3a }
        L_0x0980:
            aucj r2 = r6.b     // Catch:{ all -> 0x0a3a }
            auzc r2 = (defpackage.auzc) r2     // Catch:{ all -> 0x0a3a }
            r1.getClass()     // Catch:{ all -> 0x0a3a }
            r2.d = r1     // Catch:{ all -> 0x0a3a }
            int r1 = r2.a     // Catch:{ all -> 0x0a3a }
            r1 = r1 | 8
            r2.a = r1     // Catch:{ all -> 0x0a3a }
        L_0x098f:
            aucj r1 = r6.i()     // Catch:{ all -> 0x0a3a }
            auzc r1 = (defpackage.auzc) r1     // Catch:{ all -> 0x0a3a }
            boolean r2 = r4.c     // Catch:{ all -> 0x0a3a }
            if (r2 != 0) goto L_0x099a
            goto L_0x09a0
        L_0x099a:
            r4.c()     // Catch:{ all -> 0x0a3a }
            r2 = 0
            r4.c = r2     // Catch:{ all -> 0x0a3a }
        L_0x09a0:
            aucj r2 = r4.b     // Catch:{ all -> 0x0a3a }
            auzx r2 = (defpackage.auzx) r2     // Catch:{ all -> 0x0a3a }
            r1.getClass()     // Catch:{ all -> 0x0a3a }
            r2.c = r1     // Catch:{ all -> 0x0a3a }
            int r1 = r2.a     // Catch:{ all -> 0x0a3a }
            r5 = 2
            r1 = r1 | r5
            r2.a = r1     // Catch:{ all -> 0x0a3a }
            avaj r1 = defpackage.vem.a((com.google.android.gms.nearby.messages.Strategy) r3)     // Catch:{ all -> 0x0a3a }
            boolean r2 = r4.c     // Catch:{ all -> 0x0a3a }
            if (r2 != 0) goto L_0x09b9
            r2 = 0
            goto L_0x09bf
        L_0x09b9:
            r4.c()     // Catch:{ all -> 0x0a3a }
            r2 = 0
            r4.c = r2     // Catch:{ all -> 0x0a3a }
        L_0x09bf:
            aucj r3 = r4.b     // Catch:{ all -> 0x0a3a }
            auzx r3 = (defpackage.auzx) r3     // Catch:{ all -> 0x0a3a }
            r1.getClass()     // Catch:{ all -> 0x0a3a }
            r3.e = r1     // Catch:{ all -> 0x0a3a }
            int r1 = r3.a     // Catch:{ all -> 0x0a3a }
            r1 = r1 | 8
            r3.a = r1     // Catch:{ all -> 0x0a3a }
            aucj r1 = r4.i()     // Catch:{ all -> 0x0a3a }
            r12 = r1
            auzx r12 = (defpackage.auzx) r12     // Catch:{ all -> 0x0a3a }
            goto L_0x09d9
        L_0x09d6:
            r2 = 0
            r7 = 1
            r12 = r10
        L_0x09d9:
            r1 = r36
            r1.add(r12)     // Catch:{ all -> 0x0a3a }
            r15 = r1
            r2 = r11
            r4 = r25
            r7 = r27
            r3 = r34
            r5 = 1
            r1 = r37
            goto L_0x004f
        L_0x09eb:
            r11 = r2
            r34 = r3
            r25 = r4
            r27 = r7
            r2 = 0
            r7 = 1
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x0a3a }
            uyg r1 = (defpackage.uyg) r1     // Catch:{ all -> 0x0a3a }
            vdo r3 = r1.f     // Catch:{ all -> 0x0a3a }
            if (r8 == 0) goto L_0x0a06
            com.google.android.gms.nearby.messages.ClientAppIdentifier r4 = r1.e     // Catch:{ all -> 0x0a3a }
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x0a3a }
            if (r4 == 0) goto L_0x0a2b
        L_0x0a06:
            if (r3 == 0) goto L_0x0a2b
            int r3 = r3.f     // Catch:{ all -> 0x0a3a }
            boolean r3 = defpackage.vdo.a(r3)     // Catch:{ all -> 0x0a3a }
            if (r3 == 0) goto L_0x0a1f
            r10.add(r1)     // Catch:{ all -> 0x0a3a }
            r1 = r37
            r2 = r11
            r4 = r25
            r7 = r27
            r3 = r34
            r5 = 1
            goto L_0x0040
        L_0x0a1f:
            r1 = r37
            r2 = r11
            r4 = r25
            r7 = r27
            r3 = r34
            r5 = 1
            goto L_0x0040
        L_0x0a2b:
            r1 = r37
            r2 = r11
            r4 = r25
            r7 = r27
            r3 = r34
            r5 = 1
            goto L_0x0040
        L_0x0a37:
            r27 = r7
            return
        L_0x0a3a:
            r0 = move-exception
            r1 = r0
            goto L_0x0a3f
        L_0x0a3d:
            r0 = move-exception
            r1 = r0
        L_0x0a3f:
            goto L_0x0a41
        L_0x0a40:
            throw r1
        L_0x0a41:
            goto L_0x0a40
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vel.b():void");
    }
}
