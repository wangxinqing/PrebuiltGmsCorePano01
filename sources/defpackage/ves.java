package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ves  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ves {
    public final Context a;
    public final vef b;
    public final arwg c;
    public final ved d;
    public final vgw e;
    public final uwv f;
    public final uyz g;
    public final vav h;
    public final uyt i;
    public final uyj j;
    public final vbp k;
    private final Map l = new nz();

    public ves(Context context) {
        this.h = (vav) thl.a(context, vav.class);
        iva.a((Object) context);
        this.a = context;
        this.b = (vef) thl.a(context, vef.class);
        this.c = (arwg) thl.a(context, arwg.class);
        this.d = (ved) thl.a(context, ved.class);
        this.e = (vgw) thl.a(context, vgw.class);
        this.f = ((uwu) thl.a(context, uwu.class)).b;
        this.g = (uyz) thl.a(context, uyz.class);
        this.i = (uyt) thl.a(context, uyt.class);
        this.j = (uyj) thl.a(context, uyj.class);
        this.k = (vbp) thl.a(context, vbp.class);
    }

    public static Set a(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((auzx) it.next()).b);
        }
        return hashSet;
    }

    public static Set b(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((avaf) it.next()).b);
        }
        return hashSet;
    }

    public final List a() {
        vgw vgw = this.e;
        vgw.c.b();
        vgw.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : vgw.a.entrySet()) {
            int i2 = ((vgx) entry.getValue()).f;
            if (i2 == 1 || i2 == 3) {
                vgx vgx = (vgx) entry.getValue();
                avak avak = (avak) aval.d.o();
                String a2 = vgx.b.a();
                if (avak.c) {
                    avak.c();
                    avak.c = false;
                }
                aval aval = (aval) avak.b;
                a2.getClass();
                aval.a = 1 | aval.a;
                aval.b = a2;
                avak.a((Iterable) vgx.c);
                avak.a((Iterable) vgx.d);
                avak.a((Iterable) vgx.e);
                arrayList.add((aval) avak.i());
            }
        }
        return arrayList;
    }

    public final vah a(ClientAppIdentifier clientAppIdentifier) {
        vah vah = (vah) this.l.get(clientAppIdentifier);
        if (vah != null) {
            return vah;
        }
        vah vah2 = new vah(this.a, clientAppIdentifier);
        this.l.put(clientAppIdentifier, vah2);
        return vah2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0221 A[EDGE_INSN: B:230:0x0221->B:91:0x0221 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0234  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.nearby.messages.ClientAppIdentifier r27, java.util.List r28, java.util.List r29, java.util.List r30, java.util.List r31, defpackage.vej r32) {
        /*
            r26 = this;
            r15 = r26
            r11 = r27
            jjg r0 = defpackage.tgc.a
            uwv r0 = r15.f
            java.lang.String r0 = r0.a()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0023
            boolean r1 = r28.isEmpty()
            if (r1 == 0) goto L_0x0023
            boolean r1 = r30.isEmpty()
            if (r1 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            r32.a()
            return
        L_0x0023:
            java.util.List r12 = r26.a()
            android.content.Context r1 = r15.a
            java.lang.Class<vak> r2 = defpackage.vak.class
            java.lang.Object r1 = defpackage.thl.a((android.content.Context) r1, (java.lang.Class) r2)
            vak r1 = (defpackage.vak) r1
            arwg r2 = r1.l
            r2.b()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Map r3 = r1.h
            int r3 = r3.size()
            r2.<init>(r3)
            java.util.Map r3 = r1.h
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x004b:
            boolean r4 = r3.hasNext()
            r5 = 2
            r6 = 1
            r13 = 0
            if (r4 == 0) goto L_0x00b1
            java.lang.Object r4 = r3.next()
            auzf r4 = (defpackage.auzf) r4
            auzg r7 = defpackage.auzg.d
            aucd r7 = r7.o()
            boolean r8 = r7.c
            if (r8 != 0) goto L_0x0065
            goto L_0x006a
        L_0x0065:
            r7.c()
            r7.c = r13
        L_0x006a:
            aucj r8 = r7.b
            auzg r8 = (defpackage.auzg) r8
            r4.getClass()
            r8.b = r4
            int r9 = r8.a
            r6 = r6 | r9
            r8.a = r6
            vai r6 = r1.a((defpackage.auzf) r4)
            if (r6 == 0) goto L_0x00a7
            auzf r8 = r6.h
            boolean r4 = defpackage.ius.a(r8, r4)
            if (r4 != 0) goto L_0x004b
            byte[] r4 = r6.i
            if (r4 != 0) goto L_0x008b
            goto L_0x00a7
        L_0x008b:
            auay r4 = defpackage.auay.a((byte[]) r4)
            boolean r6 = r7.c
            if (r6 != 0) goto L_0x0094
            goto L_0x0099
        L_0x0094:
            r7.c()
            r7.c = r13
        L_0x0099:
            aucj r6 = r7.b
            auzg r6 = (defpackage.auzg) r6
            r4.getClass()
            int r8 = r6.a
            r5 = r5 | r8
            r6.a = r5
            r6.c = r4
        L_0x00a7:
            aucj r4 = r7.i()
            auzg r4 = (defpackage.auzg) r4
            r2.add(r4)
            goto L_0x004b
        L_0x00b1:
            amzt r1 = new amzt
            r1.<init>()
            int r3 = r2.size()
            r4 = 0
        L_0x00bb:
            java.lang.String r7 = "0p:discoverer"
            if (r4 < r3) goto L_0x04bb
            amzy r14 = r1.a()
            r2.size()
            r14.size()
            r14.size()
            android.content.Context r1 = r15.a
            java.lang.Class<vak> r2 = defpackage.vak.class
            java.lang.Object r1 = defpackage.thl.a((android.content.Context) r1, (java.lang.Class) r2)
            vak r1 = (defpackage.vak) r1
            arwg r2 = r1.l
            r2.b()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Collection r1 = r1.a()
            java.util.Iterator r1 = r1.iterator()
        L_0x00e8:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0156
            java.lang.Object r3 = r1.next()
            vai r3 = (defpackage.vai) r3
            java.util.Set r4 = r3.c()
            java.util.Iterator r4 = r4.iterator()
        L_0x00fc:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0154
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            avao r9 = defpackage.avao.d
            aucd r9 = r9.o()
            boolean r10 = r9.c
            if (r10 != 0) goto L_0x0113
            goto L_0x0118
        L_0x0113:
            r9.c()
            r9.c = r13
        L_0x0118:
            aucj r10 = r9.b
            avao r10 = (defpackage.avao) r10
            r8.getClass()
            int r5 = r10.a
            r5 = r5 | r6
            r10.a = r5
            r10.b = r8
            byte[] r5 = r3.i
            if (r5 == 0) goto L_0x0149
            auay r5 = defpackage.auay.a((byte[]) r5)
            boolean r8 = r9.c
            if (r8 != 0) goto L_0x0133
            goto L_0x0138
        L_0x0133:
            r9.c()
            r9.c = r13
        L_0x0138:
            aucj r8 = r9.b
            avao r8 = (defpackage.avao) r8
            r5.getClass()
            int r10 = r8.a
            r16 = 2
            r10 = r10 | 2
            r8.a = r10
            r8.c = r5
        L_0x0149:
            aucj r5 = r9.i()
            avao r5 = (defpackage.avao) r5
            r2.add(r5)
            r5 = 2
            goto L_0x00fc
        L_0x0154:
            r5 = 2
            goto L_0x00e8
        L_0x0156:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r2)
            ob r9 = new ob
            r9.<init>()
            int r1 = r14.size()
            r2 = 0
        L_0x0165:
            if (r2 >= r1) goto L_0x017e
            java.lang.Object r3 = r14.get(r2)
            auzg r3 = (defpackage.auzg) r3
            vag r4 = new vag
            auzf r3 = r3.b
            if (r3 != 0) goto L_0x0175
            auzf r3 = defpackage.auzf.d
        L_0x0175:
            r4.<init>((defpackage.auzf) r3)
            r9.add(r4)
            int r2 = r2 + 1
            goto L_0x0165
        L_0x017e:
            ob r1 = new ob
            r1.<init>()
            int r2 = r10.size()
            r3 = 0
        L_0x0188:
            if (r3 >= r2) goto L_0x019d
            java.lang.Object r4 = r10.get(r3)
            avao r4 = (defpackage.avao) r4
            vag r5 = new vag
            java.lang.String r4 = r4.b
            r5.<init>((java.lang.String) r4)
            r1.add(r5)
            int r3 = r3 + 1
            goto L_0x0188
        L_0x019d:
            r9.addAll(r1)
            vah r1 = r26.a((com.google.android.gms.nearby.messages.ClientAppIdentifier) r27)
            boolean r2 = defpackage.aync.f()
            if (r2 != 0) goto L_0x01ad
            anfv r2 = defpackage.anfv.a
            goto L_0x01db
        L_0x01ad:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x01d6
            anav r2 = defpackage.anax.j()
            java.util.Iterator r3 = r9.iterator()
        L_0x01bb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01d1
            java.lang.Object r4 = r3.next()
            vag r4 = (defpackage.vag) r4
            java.util.Set r5 = r1.b(r4)
            if (r5 == 0) goto L_0x01bb
            r2.b(r4)
            goto L_0x01bb
        L_0x01d1:
            anax r2 = r2.a()
            goto L_0x01d8
        L_0x01d6:
            anfv r2 = defpackage.anfv.a
        L_0x01d8:
            r9.removeAll(r2)
        L_0x01db:
            boolean r3 = defpackage.aync.f()
            if (r3 == 0) goto L_0x01f1
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x01ef
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x01f1
            r3 = 1
            goto L_0x01f2
        L_0x01ef:
            r3 = 1
            goto L_0x01f2
        L_0x01f1:
            r3 = 0
        L_0x01f2:
            boolean r4 = defpackage.aync.f()
            if (r4 != 0) goto L_0x0221
            boolean r4 = r1.c()
            if (r4 != 0) goto L_0x0208
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x0206
            r4 = 1
            goto L_0x0222
        L_0x0206:
            r4 = 0
            goto L_0x0222
        L_0x0208:
            java.util.Iterator r4 = r9.iterator()
        L_0x020c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x021f
            java.lang.Object r5 = r4.next()
            vag r5 = (defpackage.vag) r5
            java.util.Set r5 = r1.b(r5)
            if (r5 != 0) goto L_0x020c
            goto L_0x0221
        L_0x021f:
            r4 = 1
            goto L_0x0222
        L_0x0221:
            r4 = 0
        L_0x0222:
            java.lang.String r8 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r5 = "a"
            java.lang.String r6 = "ves"
            boolean r18 = r28.isEmpty()
            java.lang.String r13 = "ReportRpcManager: "
            r19 = 0
            r21 = r14
            if (r18 == 0) goto L_0x0302
            java.util.Iterator r18 = r30.iterator()
        L_0x0238:
            boolean r22 = r18.hasNext()
            if (r22 == 0) goto L_0x0264
            java.lang.Object r22 = r18.next()
            r14 = r22
            avaf r14 = (defpackage.avaf) r14
            r23 = r9
            r22 = r10
            long r9 = r14.c
            int r24 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r24 != 0) goto L_0x0306
            int r9 = r14.h
            int r9 = defpackage.avcf.a(r9)
            if (r9 != 0) goto L_0x025a
            goto L_0x0306
        L_0x025a:
            r10 = 2
            if (r9 == r10) goto L_0x025f
            goto L_0x0306
        L_0x025f:
            r10 = r22
            r9 = r23
            goto L_0x0238
        L_0x0264:
            r23 = r9
            r22 = r10
            boolean r9 = r29.isEmpty()
            if (r9 == 0) goto L_0x0306
            boolean r9 = r31.isEmpty()
            if (r9 == 0) goto L_0x0306
            boolean r9 = r12.isEmpty()
            if (r9 == 0) goto L_0x0280
            if (r3 == 0) goto L_0x027d
            goto L_0x0282
        L_0x027d:
            if (r4 == 0) goto L_0x0306
            goto L_0x0282
        L_0x0280:
            if (r3 == 0) goto L_0x0306
        L_0x0282:
            jjg r3 = defpackage.tgc.a
            anie r3 = r3.d()
            anih r3 = (defpackage.anih) r3
            r4 = 235(0xeb, float:3.3E-43)
            anie r3 = r3.a((java.lang.String) r6, (java.lang.String) r5, (int) r4, (java.lang.String) r8)
            anih r3 = (defpackage.anih) r3
            boolean r4 = defpackage.aync.f()
            if (r4 != 0) goto L_0x029b
            r4 = r23
            goto L_0x029c
        L_0x029b:
            r4 = r2
        L_0x029c:
            java.lang.String r9 = "%s Skipping some call, returning cached messages for beacon IDs and URLs: %s"
            r3.a((java.lang.String) r9, (java.lang.Object) r13, (java.lang.Object) r4)
            android.content.Context r3 = r15.a
            java.lang.Class<vbp> r4 = defpackage.vbp.class
            java.lang.Object r3 = defpackage.thl.a((android.content.Context) r3, (java.lang.Class) r4)
            vbp r3 = (defpackage.vbp) r3
            boolean r4 = defpackage.aync.f()
            if (r4 == 0) goto L_0x02b3
            goto L_0x02b5
        L_0x02b3:
            r2 = r23
        L_0x02b5:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x02e4
            ob r4 = new ob
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x02c4:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x02da
            java.lang.Object r9 = r2.next()
            vag r9 = (defpackage.vag) r9
            java.util.Set r9 = r1.b(r9)
            if (r9 == 0) goto L_0x02c4
            r4.addAll(r9)
            goto L_0x02c4
        L_0x02da:
            r1 = 0
            avae[] r2 = new defpackage.avae[r1]
            java.lang.Object[] r2 = r4.toArray(r2)
            avae[] r2 = (defpackage.avae[]) r2
            goto L_0x02e7
        L_0x02e4:
            r1 = 0
            avae[] r2 = new defpackage.avae[r1]
        L_0x02e7:
            r1 = 0
            r3.a((com.google.android.gms.nearby.messages.ClientAppIdentifier) r11, (defpackage.avae[]) r2, (java.lang.String) r1)
            r32.a()
            boolean r1 = defpackage.aync.f()
            if (r1 == 0) goto L_0x02fb
            boolean r1 = r23.isEmpty()
            if (r1 != 0) goto L_0x0301
        L_0x02fb:
            boolean r1 = defpackage.aync.f()
            if (r1 != 0) goto L_0x0306
        L_0x0301:
            return
        L_0x0302:
            r23 = r9
            r22 = r10
        L_0x0306:
            ved r1 = r15.d
            boolean r2 = r11.c(r7)
            if (r2 != 0) goto L_0x0396
            arwg r2 = r1.b
            r2.b()
            arwg r2 = r1.b
            r2.b()
            java.util.Set r2 = r1.a()
            java.util.Iterator r2 = r2.iterator()
        L_0x0320:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0340
            java.lang.Object r3 = r2.next()
            avch r3 = (defpackage.avch) r3
            int r3 = r3.k
            avaa[] r3 = r1.b(r3)
            if (r3 == 0) goto L_0x0320
            int r4 = r3.length
            if (r4 <= 0) goto L_0x0320
            int r4 = r4 + -1
            r2 = r3[r4]
            long r2 = r2.d
            r19 = r2
            goto L_0x0341
        L_0x0340:
        L_0x0341:
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0396
            java.util.Set r1 = r1.a()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0396
            avco r2 = defpackage.avco.b
            aucd r2 = r2.o()
            aucf r2 = (defpackage.aucf) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x035f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x038e
            java.lang.Object r3 = r1.next()
            avch r3 = (defpackage.avch) r3
            avab r4 = defpackage.avab.c
            aucd r4 = r4.o()
            boolean r9 = r4.c
            if (r9 != 0) goto L_0x0376
            goto L_0x037c
        L_0x0376:
            r4.c()
            r9 = 0
            r4.c = r9
        L_0x037c:
            aucj r9 = r4.b
            avab r9 = (defpackage.avab) r9
            int r3 = r3.k
            r9.b = r3
            int r3 = r9.a
            r10 = 1
            r3 = r3 | r10
            r9.a = r3
            r2.b((defpackage.aucd) r4)
            goto L_0x035f
        L_0x038e:
            aucj r1 = r2.i()
            avco r1 = (defpackage.avco) r1
            r14 = r1
            goto L_0x0397
        L_0x0396:
            r14 = 0
        L_0x0397:
            java.util.Iterator r1 = r30.iterator()
            r2 = 0
        L_0x039c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0401
            java.lang.Object r3 = r1.next()
            avaf r3 = (defpackage.avaf) r3
            long r9 = r3.c
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r4 != 0) goto L_0x03f8
            int r4 = r2 + 1
            r9 = 5
            java.lang.Object r9 = r3.c(r9)
            aucd r9 = (defpackage.aucd) r9
            r9.a((defpackage.aucj) r3)
            aucf r9 = (defpackage.aucf) r9
            vav r3 = r15.h
            r10 = r4
            long r3 = r3.e()
            r17 = r1
            boolean r1 = r9.c
            if (r1 != 0) goto L_0x03cf
            goto L_0x03d5
        L_0x03cf:
            r9.c()
            r1 = 0
            r9.c = r1
        L_0x03d5:
            aucj r1 = r9.b
            avaf r1 = (defpackage.avaf) r1
            avaf r18 = defpackage.avaf.i
            r19 = r5
            int r5 = r1.a
            r16 = 2
            r5 = r5 | 2
            r1.a = r5
            r1.c = r3
            aucj r1 = r9.i()
            avaf r1 = (defpackage.avaf) r1
            r9 = r30
            r9.set(r2, r1)
            r2 = r10
            r1 = r17
            r5 = r19
            goto L_0x039c
        L_0x03f8:
            r9 = r30
            r17 = r1
            r19 = r5
            r16 = 2
            goto L_0x039c
        L_0x0401:
            r9 = r30
            r19 = r5
            ver r1 = new ver
            r1.<init>()
            boolean r2 = defpackage.aync.f()
            if (r2 == 0) goto L_0x041a
            boolean r2 = r11.c(r7)
            if (r2 == 0) goto L_0x041a
            ver r1 = defpackage.ver.a(r30)
        L_0x041a:
            r4 = r1
            veq r10 = new veq
            r1 = r10
            r2 = r26
            r3 = r27
            r7 = r19
            r5 = r30
            r17 = r14
            r14 = r6
            r6 = r31
            r18 = r12
            r12 = r7
            r7 = r28
            r19 = r13
            r13 = r8
            r8 = r29
            r9 = r23
            r25 = r10
            r16 = r22
            r10 = r32
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r1 = r28.isEmpty()
            if (r1 == 0) goto L_0x045c
            boolean r1 = r29.isEmpty()
            if (r1 == 0) goto L_0x045c
            boolean r1 = r30.isEmpty()
            if (r1 == 0) goto L_0x045c
            boolean r1 = r31.isEmpty()
            if (r1 != 0) goto L_0x0459
            goto L_0x045c
        L_0x0459:
            r14 = r25
            goto L_0x0496
        L_0x045c:
            boolean r1 = r27.b()
            if (r1 != 0) goto L_0x0494
            android.content.Context r1 = r15.a     // Catch:{ NameNotFoundException -> 0x0473 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0473 }
            com.google.android.gms.nearby.messages.internal.ClientAppContext r2 = r11.c     // Catch:{ NameNotFoundException -> 0x0473 }
            java.lang.String r2 = r2.b     // Catch:{ NameNotFoundException -> 0x0473 }
            r5 = 0
            r1.getPackageInfo(r2, r5)     // Catch:{ NameNotFoundException -> 0x0473 }
            r14 = r25
            goto L_0x0496
        L_0x0473:
            r0 = move-exception
            jjg r0 = defpackage.tgc.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r1 = 313(0x139, float:4.39E-43)
            anie r0 = r0.a((java.lang.String) r14, (java.lang.String) r12, (int) r1, (java.lang.String) r13)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "%s Failed to find package for %s"
            r2 = r19
            r0.a((java.lang.String) r1, (java.lang.Object) r2, (java.lang.Object) r11)
            r0 = 13
            r14 = r25
            r1 = 0
            r14.a(r1, r0)
            return
        L_0x0494:
            r14 = r25
        L_0x0496:
            arwg r13 = r15.c
            vep r12 = new vep
            java.lang.String r3 = "ReportRpcManager.report"
            r1 = r12
            r2 = r26
            r4 = r18
            r5 = r21
            r6 = r16
            r7 = r27
            r8 = r0
            r9 = r30
            r10 = r31
            r11 = r28
            r0 = r12
            r12 = r29
            r15 = r13
            r13 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.c(r0)
            return
        L_0x04bb:
            r18 = r12
            r5 = 0
            r10 = 1
            r16 = 2
            java.lang.Object r6 = r2.get(r4)
            auzg r6 = (defpackage.auzg) r6
            aync r8 = defpackage.aync.a
            aynd r8 = r8.a()
            boolean r8 = r8.N()
            if (r8 == 0) goto L_0x04f3
            auzf r8 = r6.b
            if (r8 == 0) goto L_0x04d8
            goto L_0x04da
        L_0x04d8:
            auzf r8 = defpackage.auzf.d
        L_0x04da:
            int r8 = r8.b
            int r8 = defpackage.avaw.a(r8)
            if (r8 != 0) goto L_0x04e3
            goto L_0x04e7
        L_0x04e3:
            r9 = 107(0x6b, float:1.5E-43)
            if (r8 == r9) goto L_0x04ef
        L_0x04e7:
            boolean r7 = r11.c(r7)
            if (r7 == 0) goto L_0x04ef
            goto L_0x04f6
        L_0x04ef:
            r1.c(r6)
            goto L_0x04f6
        L_0x04f3:
            r1.c(r6)
        L_0x04f6:
            int r4 = r4 + 1
            r15 = r26
            r12 = r18
            r5 = 2
            r6 = 1
            r13 = 0
            goto L_0x00bb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ves.a(com.google.android.gms.nearby.messages.ClientAppIdentifier, java.util.List, java.util.List, java.util.List, java.util.List, vej):void");
    }
}
