package defpackage;

import android.content.Context;

/* renamed from: aamd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aamd extends ppr {
    private final Context a;
    private final prp b;
    private final ozs c;
    private final ozb d;
    private final pas e;
    private final pqf f;

    public aamd(Context context, prp prp, ozs ozs, ozb ozb, pas pas, pqf pqf) {
        super(aonk.UPDATE_APP_PARAMS, psd.b(context));
        this.a = context;
        this.b = prp;
        this.c = ozs;
        this.d = ozb;
        this.e = pas;
        this.f = pqf;
    }

    public static qxg a(boolean z) {
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.icing.service.IcingGcmTaskService";
        qxf.k = "update-app-params";
        qxf.b(z);
        qxf.a(((Boolean) ozx.d.c()).booleanValue());
        qxf.a(((Long) ozx.L.c()).longValue(), ((Long) ozx.M.c()).longValue());
        return qxf.b();
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [aucj] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r0 = "UpdateAppParamsTask started"
            defpackage.oso.a(r0)
            pas r0 = r1.e
            java.lang.String r0 = r0.a()
            ozb r2 = r1.d
            oza r2 = r2.a
            boolean r2 = r2.a()
            pas r3 = r1.e
            boolean r3 = r3.a(r0)
            r8 = 0
            if (r2 == 0) goto L_0x001f
            goto L_0x002f
        L_0x001f:
            if (r3 != 0) goto L_0x002f
            prp r0 = r1.b
            pqr r2 = defpackage.pqr.c
            r0.a((defpackage.pqr) r2)
            java.lang.String r0 = "UpdateAppParamsTask is disabled"
            defpackage.oso.a(r0)
            goto L_0x0405
        L_0x002f:
            ozs r2 = r1.c
            java.lang.Object r2 = r2.a()
            monitor-enter(r2)
            ozs r3 = r1.c     // Catch:{ all -> 0x0407 }
            r9 = 1
            java.util.List r3 = r3.a(r8, r8, r9)     // Catch:{ all -> 0x0407 }
            monitor-exit(r2)     // Catch:{ all -> 0x0407 }
            java.util.HashMap r2 = new java.util.HashMap
            int r4 = r3.size()
            r2.<init>(r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x004b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0079
            java.lang.Object r4 = r3.next()
            osz r4 = (defpackage.osz) r4
            java.lang.String r5 = r4.e
            boolean r5 = r2.containsKey(r5)
            if (r5 != 0) goto L_0x004b
            boolean r5 = defpackage.ozq.f((defpackage.osz) r4)
            if (r5 == 0) goto L_0x0066
        L_0x0065:
            goto L_0x006d
        L_0x0066:
            boolean r5 = defpackage.ozq.e((defpackage.osz) r4)
            if (r5 == 0) goto L_0x004b
            goto L_0x0065
        L_0x006d:
            java.lang.String r4 = r4.e
            prp r5 = r1.b
            oq r5 = r5.n(r4)
            r2.put(r4, r5)
            goto L_0x004b
        L_0x0079:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x008a:
            boolean r4 = r2.hasNext()
            r10 = 2
            r11 = 0
            if (r4 == 0) goto L_0x010f
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            pqt r5 = defpackage.pqt.e
            aucd r5 = r5.o()
            java.lang.Object r6 = r4.getKey()
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r5.c
            if (r7 == 0) goto L_0x00ad
            r5.c()
            r5.c = r11
        L_0x00ad:
            aucj r7 = r5.b
            pqt r7 = (defpackage.pqt) r7
            r6.getClass()
            int r12 = r7.a
            r12 = r12 | r9
            r7.a = r12
            r7.b = r6
            java.lang.Object r6 = r4.getValue()
            oq r6 = (defpackage.oq) r6
            java.lang.Object r6 = r6.a
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            boolean r7 = r5.c
            if (r7 != 0) goto L_0x00ce
            goto L_0x00d3
        L_0x00ce:
            r5.c()
            r5.c = r11
        L_0x00d3:
            aucj r7 = r5.b
            pqt r7 = (defpackage.pqt) r7
            int r12 = r7.a
            r10 = r10 | r12
            r7.a = r10
            r7.c = r6
            java.lang.Object r4 = r4.getValue()
            oq r4 = (defpackage.oq) r4
            java.lang.Object r4 = r4.b
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x00eb
            goto L_0x0104
        L_0x00eb:
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x00f0
            goto L_0x00f5
        L_0x00f0:
            r5.c()
            r5.c = r11
        L_0x00f5:
            aucj r6 = r5.b
            pqt r6 = (defpackage.pqt) r6
            r4.getClass()
            int r7 = r6.a
            r7 = r7 | 4
            r6.a = r7
            r6.d = r4
        L_0x0104:
            aucj r4 = r5.i()
            pqt r4 = (defpackage.pqt) r4
            r3.add(r4)
            goto L_0x008a
        L_0x010f:
            pqf r2 = r1.f
            if (r0 == 0) goto L_0x0205
            pqv r4 = defpackage.pqv.c
            aucd r4 = r4.o()
            pqu r5 = defpackage.pqu.f
            aucd r5 = r5.o()
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x0124
            goto L_0x0129
        L_0x0124:
            r5.c()
            r5.c = r11
        L_0x0129:
            aucj r6 = r5.b
            pqu r6 = (defpackage.pqu) r6
            int r7 = r6.a
            r7 = r7 | r9
            r6.a = r7
            r6.b = r9
            aucx r7 = r6.c
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x0144
            aucx r7 = r6.c
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)
            r6.c = r7
        L_0x0144:
            aucx r6 = r6.c
            defpackage.auab.a((java.lang.Iterable) r3, (java.util.List) r6)
            axrg r3 = defpackage.axrg.a
            axrh r3 = r3.a()
            long r6 = r3.b()
            int r3 = (int) r6
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x0159
            goto L_0x015e
        L_0x0159:
            r5.c()
            r5.c = r11
        L_0x015e:
            aucj r6 = r5.b
            pqu r6 = (defpackage.pqu) r6
            int r7 = r6.a
            r7 = r7 | r10
            r6.a = r7
            r6.d = r3
            boolean r3 = defpackage.axrg.b()
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x0172
            goto L_0x0177
        L_0x0172:
            r5.c()
            r5.c = r11
        L_0x0177:
            aucj r6 = r5.b
            pqu r6 = (defpackage.pqu) r6
            int r7 = r6.a
            r7 = r7 | 4
            r6.a = r7
            r6.e = r3
            boolean r3 = r4.c
            if (r3 != 0) goto L_0x0188
            goto L_0x018d
        L_0x0188:
            r4.c()
            r4.c = r11
        L_0x018d:
            aucj r3 = r4.b
            pqv r3 = (defpackage.pqv) r3
            aucj r5 = r5.i()
            pqu r5 = (defpackage.pqu) r5
            r5.getClass()
            r3.b = r5
            int r5 = r3.a
            r5 = r5 | r10
            r3.a = r5
            aucj r3 = r4.i()
            pqv r3 = (defpackage.pqv) r3
            pqs r4 = defpackage.pqs.c
            aucd r4 = r4.o()
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x01b2
            goto L_0x01b7
        L_0x01b2:
            r4.c()
            r4.c = r11
        L_0x01b7:
            aucj r5 = r4.b
            pqs r5 = (defpackage.pqs) r5
            r3.getClass()
            r5.b = r3
            int r3 = r5.a
            r3 = r3 | r10
            r5.a = r3
            aucj r3 = r4.i()
            r12 = r3
            pqs r12 = (defpackage.pqs) r12
            pqe r2 = (defpackage.pqe) r2
            android.content.Context r13 = r2.a
            com.google.android.gms.common.internal.ClientContext r14 = new com.google.android.gms.common.internal.ClientContext
            int r3 = android.os.Process.myUid()
            java.lang.String r7 = r13.getPackageName()
            r2 = r14
            r4 = r0
            r5 = r0
            r6 = r7
            r2.<init>((int) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7)
            agvx r2 = defpackage.ozx.x
            java.lang.Object r2 = r2.c()
            java.lang.String r2 = (java.lang.String) r2
            r14.d(r2)
            pqd r2 = new pqd
            r2.<init>(r13)
            pqc r3 = new pqc
            r3.<init>(r14, r2)
            pqw r2 = r3.a(r12)
            if (r2 == 0) goto L_0x0203
            pqr r2 = r2.a
            if (r2 != 0) goto L_0x0206
            pqr r2 = defpackage.pqr.c
            goto L_0x0206
        L_0x0203:
            r2 = r8
            goto L_0x0206
        L_0x0205:
            r2 = r8
        L_0x0206:
            if (r2 != 0) goto L_0x021c
            java.lang.String r0 = "Getting app params failed"
            defpackage.oso.e(r0)
            android.content.Context r0 = r1.a
            qwq r0 = defpackage.qwq.a((android.content.Context) r0)
            qxg r2 = a(r9)
            r0.a((defpackage.qxx) r2)
            goto L_0x03ff
        L_0x021c:
            boolean r3 = defpackage.axrg.b()
            if (r3 == 0) goto L_0x03fa
            r3 = 5
            java.lang.Object r4 = r2.c(r3)
            aucd r4 = (defpackage.aucd) r4
            r4.a((defpackage.aucj) r2)
            r2 = 0
        L_0x022d:
            aucj r5 = r4.b
            pqr r5 = (defpackage.pqr) r5
            aucx r5 = r5.a
            int r5 = r5.size()
            if (r2 >= r5) goto L_0x03f3
            pqq r5 = r4.u((int) r2)
            aucx r5 = r5.f
            int r5 = r5.size()
            if (r5 == 0) goto L_0x03ed
            android.content.Context r5 = r1.a
            java.lang.String r5 = r5.getPackageName()
            pqq r6 = r4.u((int) r2)
            java.lang.String r6 = r6.a
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0264
            pqq r5 = r4.u((int) r2)
            java.lang.String r5 = r5.a
            java.lang.String r6 = "Invalid app name %s. Documents must be under gmscore package."
            defpackage.oso.e((java.lang.String) r6, (java.lang.Object) r5)
            goto L_0x03ed
        L_0x0264:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            pqq r7 = r4.u((int) r2)
            java.lang.Object r12 = r7.c(r3)
            aucd r12 = (defpackage.aucd) r12
            r12.a((defpackage.aucj) r7)
            r7 = 0
        L_0x027c:
            aucj r13 = r12.b
            pqq r13 = (defpackage.pqq) r13
            aucx r13 = r13.f
            int r13 = r13.size()
            if (r7 >= r13) goto L_0x0389
            aucj r13 = r12.b
            pqq r13 = (defpackage.pqq) r13
            aucx r13 = r13.f
            java.lang.Object r13 = r13.get(r7)
            pqp r13 = (defpackage.pqp) r13
            java.lang.Object r14 = r13.c(r3)
            aucd r14 = (defpackage.aucd) r14
            r14.a((defpackage.aucj) r13)
            aucj r13 = r14.b
            pqp r13 = (defpackage.pqp) r13
            avqi r13 = r13.b
            if (r13 != 0) goto L_0x02a7
            avqi r13 = defpackage.avqi.f
        L_0x02a7:
            java.lang.Object r15 = r13.c(r3)
            aucd r15 = (defpackage.aucd) r15
            r15.a((defpackage.aucj) r13)
            avqh r15 = (defpackage.avqh) r15
            aucj r13 = r15.b
            avqi r13 = (defpackage.avqi) r13
            avqe r13 = r13.e
            if (r13 != 0) goto L_0x02bd
            avqe r13 = defpackage.avqe.f
        L_0x02bd:
            java.lang.Object r16 = r13.c(r3)
            r3 = r16
            aucd r3 = (defpackage.aucd) r3
            r3.a((defpackage.aucj) r13)
            boolean r13 = r3.c
            if (r13 == 0) goto L_0x02d2
            r3.c()
            r3.c = r11
        L_0x02d2:
            aucj r13 = r3.b
            avqe r13 = (defpackage.avqe) r13
            r0.getClass()
            int r8 = r13.a
            r8 = r8 | 4
            r13.a = r8
            r13.d = r0
            boolean r8 = r15.c
            if (r8 != 0) goto L_0x02e6
            goto L_0x02eb
        L_0x02e6:
            r15.c()
            r15.c = r11
        L_0x02eb:
            aucj r8 = r15.b
            avqi r8 = (defpackage.avqi) r8
            aucj r3 = r3.i()
            avqe r3 = (defpackage.avqe) r3
            r3.getClass()
            r8.e = r3
            int r3 = r8.a
            r3 = r3 | 4
            r8.a = r3
            boolean r3 = r14.c
            if (r3 != 0) goto L_0x0305
            goto L_0x030a
        L_0x0305:
            r14.c()
            r14.c = r11
        L_0x030a:
            aucj r3 = r14.b
            pqp r3 = (defpackage.pqp) r3
            aucj r8 = r15.i()
            avqi r8 = (defpackage.avqi) r8
            pqp r13 = defpackage.pqp.d
            r8.getClass()
            r3.b = r8
            int r8 = r3.a
            r8 = r8 | r9
            r3.a = r8
            aucj r3 = r14.b
            pqp r3 = (defpackage.pqp) r3
            int r3 = r3.c
            int r3 = defpackage.pqo.a(r3)
            if (r3 != 0) goto L_0x032d
            goto L_0x033d
        L_0x032d:
            if (r3 != r10) goto L_0x033d
            aucj r3 = r15.i()
            avqi r3 = (defpackage.avqi) r3
            com.google.firebase.appindexing.internal.Thing r3 = defpackage.oyl.a((defpackage.avqi) r3)
            r5.add(r3)
            goto L_0x0355
        L_0x033d:
            aucj r3 = r14.b
            pqp r3 = (defpackage.pqp) r3
            int r3 = r3.c
            int r3 = defpackage.pqo.a(r3)
            if (r3 == 0) goto L_0x0355
            r8 = 3
            if (r3 != r8) goto L_0x0355
            aucj r3 = r15.b
            avqi r3 = (defpackage.avqi) r3
            java.lang.String r3 = r3.c
            r6.add(r3)
        L_0x0355:
            boolean r3 = r12.c
            if (r3 != 0) goto L_0x035a
            goto L_0x035f
        L_0x035a:
            r12.c()
            r12.c = r11
        L_0x035f:
            aucj r3 = r12.b
            pqq r3 = (defpackage.pqq) r3
            aucj r8 = r14.i()
            pqp r8 = (defpackage.pqp) r8
            pqq r13 = defpackage.pqq.g
            r8.getClass()
            aucx r13 = r3.f
            boolean r13 = r13.a()
            if (r13 != 0) goto L_0x037e
            aucx r13 = r3.f
            aucx r13 = defpackage.aucj.a((defpackage.aucx) r13)
            r3.f = r13
        L_0x037e:
            aucx r3 = r3.f
            r3.set(r7, r8)
            int r7 = r7 + 1
            r3 = 5
            r8 = 0
            goto L_0x027c
        L_0x0389:
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L_0x03a4
            android.content.Context r3 = r1.a
            aplf r3 = defpackage.aplf.a((android.content.Context) r3)
            int r7 = r5.size()
            aplu[] r7 = new defpackage.aplu[r7]
            java.lang.Object[] r5 = r5.toArray(r7)
            aplu[] r5 = (defpackage.aplu[]) r5
            r3.a((defpackage.aplu[]) r5)
        L_0x03a4:
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L_0x03bf
            android.content.Context r3 = r1.a
            aplf r3 = defpackage.aplf.a((android.content.Context) r3)
            int r5 = r6.size()
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r5 = r6.toArray(r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r3.a((java.lang.String[]) r5)
        L_0x03bf:
            boolean r3 = r4.c
            if (r3 != 0) goto L_0x03c4
            goto L_0x03c9
        L_0x03c4:
            r4.c()
            r4.c = r11
        L_0x03c9:
            aucj r3 = r4.b
            pqr r3 = (defpackage.pqr) r3
            aucj r5 = r12.i()
            pqq r5 = (defpackage.pqq) r5
            pqr r6 = defpackage.pqr.c
            r5.getClass()
            aucx r6 = r3.a
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x03e8
            aucx r6 = r3.a
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)
            r3.a = r6
        L_0x03e8:
            aucx r3 = r3.a
            r3.set(r2, r5)
        L_0x03ed:
            int r2 = r2 + 1
            r3 = 5
            r8 = 0
            goto L_0x022d
        L_0x03f3:
            aucj r0 = r4.i()
            r2 = r0
            pqr r2 = (defpackage.pqr) r2
        L_0x03fa:
            prp r0 = r1.b
            r0.a((defpackage.pqr) r2)
        L_0x03ff:
            java.lang.String r0 = "UpdateAppParamsTask finished"
            defpackage.oso.a(r0)
        L_0x0405:
            r0 = 0
            return r0
        L_0x0407:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0407 }
            goto L_0x040b
        L_0x040a:
            throw r0
        L_0x040b:
            goto L_0x040a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aamd.a():java.lang.Object");
    }
}
