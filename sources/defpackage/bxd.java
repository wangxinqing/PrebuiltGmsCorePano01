package defpackage;

import android.content.Context;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: bxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxd extends bwp {
    public final ContextManagerClientInfo c;
    private final jxf d;
    private final bvu e;
    private final boolean f = awuz.a.a().U();

    public bxd(jxf jxf, ContextManagerClientInfo contextManagerClientInfo, bvu bvu) {
        super("RegisterContextListenerOperation");
        this.d = jxf;
        this.c = contextManagerClientInfo;
        this.e = bvu;
    }

    private final void a(int i) {
        int i2;
        bwf.a(this.d, i);
        btx G = cbi.G();
        ContextManagerClientInfo contextManagerClientInfo = this.c;
        bvu bvu = this.e;
        ContextDataFilterImpl contextDataFilterImpl = bvu.b;
        if (bvu.a == null) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        aucd a = btx.a(contextManagerClientInfo, 6, i);
        atnl a2 = btx.a(contextDataFilterImpl);
        aucd o = atny.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atny atny = (atny) o.b;
        atny.c = i2 - 1;
        int i3 = atny.a | 2;
        atny.a = i3;
        if (a2 != null) {
            a2.getClass();
            atny.b = a2;
            atny.a = i3 | 1;
        }
        if (a.c) {
            a.c();
            a.c = false;
        }
        atnj atnj = (atnj) a.b;
        atny atny2 = (atny) o.i();
        atnj atnj2 = atnj.o;
        atny2.getClass();
        atnj.i = atny2;
        atnj.a |= 128;
        G.a((atnj) a.i());
    }

    /* JADX WARNING: type inference failed for: r1v21, types: [aucj] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r24) {
        /*
            r23 = this;
            r0 = r23
            boolean r1 = defpackage.ibt.c(r24)
            if (r1 != 0) goto L_0x000c
            r23.a(r24)
            return
        L_0x000c:
            cap r1 = defpackage.cbi.r()
            bvu r2 = r0.e
            com.google.android.gms.contextmanager.internal.ContextDataFilterImpl r3 = r2.b
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r4 = r0.c
            java.util.HashSet r5 = r3.d()
            if (r5 == 0) goto L_0x0067
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x0067
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = r5.size()
            r7.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L_0x002f:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0066
            java.lang.Object r8 = r5.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            caq r9 = new caq
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r10 = r10.toString()
            atjv r8 = defpackage.jtj.b(r8)
            cbb r11 = defpackage.cbb.a()
            r9.<init>(r10, r8, r11, r4)
            cai r8 = defpackage.cai.a()
            r9.a((defpackage.cai) r8)
            r9.a(r2, r3)
            cas r8 = r9.a()
            r7.add(r8)
            goto L_0x002f
        L_0x0066:
            goto L_0x0068
        L_0x0067:
            r7 = 0
        L_0x0068:
            if (r7 != 0) goto L_0x006c
            goto L_0x04f0
        L_0x006c:
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L_0x04f0
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r2 = r0.c
            bsz r2 = r2.a()
            bvu r3 = r0.e
            java.util.HashMap r4 = r1.a
            java.lang.Object r2 = r4.get(r2)
            cax r2 = (defpackage.cax) r2
            if (r2 == 0) goto L_0x0089
            java.util.Set r2 = r2.a((defpackage.bvt) r3)
            goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            if (r2 == 0) goto L_0x0098
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0098
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r2)
            goto L_0x0099
        L_0x0098:
            r3 = 0
        L_0x0099:
            r1.a((java.util.Collection) r7)
            r1.b((java.util.Collection) r3)
            r1 = 0
            r0.a(r1)
            bvu r2 = r0.e
            android.app.PendingIntent r2 = r2.a
            if (r2 == 0) goto L_0x04ef
            byd r2 = defpackage.cbi.E()
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r3 = r0.c
            bvu r4 = r0.e
            android.app.PendingIntent r5 = r4.a
            com.google.android.gms.contextmanager.internal.ContextDataFilterImpl r4 = r4.b
            if (r4 == 0) goto L_0x03df
            jtp r7 = defpackage.jtp.e
            aucd r7 = r7.o()
            boolean r8 = r4.b()
            if (r8 == 0) goto L_0x0330
            java.util.ArrayList r8 = r4.a
            int r9 = r8.size()
            r10 = 0
        L_0x00ca:
            if (r10 >= r9) goto L_0x0330
            java.lang.Object r11 = r8.get(r10)
            com.google.android.gms.contextmanager.internal.ContextDataFilterImpl$Inclusion r11 = (com.google.android.gms.contextmanager.internal.ContextDataFilterImpl.Inclusion) r11
            jto r12 = defpackage.jto.f
            aucd r12 = r12.o()
            int r13 = r11.a
            boolean r14 = r12.c
            if (r14 == 0) goto L_0x00e3
            r12.c()
            r12.c = r1
        L_0x00e3:
            aucj r14 = r12.b
            jto r14 = (defpackage.jto) r14
            int r15 = r14.a
            r15 = r15 | 1
            r14.a = r15
            r14.b = r13
            int r13 = r11.b
            r15 = r15 | 2
            r14.a = r15
            r14.c = r13
            com.google.android.gms.contextmanager.internal.TimeFilterImpl r13 = r11.c
            if (r13 == 0) goto L_0x01d1
            jtu r14 = defpackage.jtu.c
            aucd r14 = r14.o()
            java.util.ArrayList r15 = r13.a
            if (r15 != 0) goto L_0x010f
            r17 = r2
            r20 = r3
            r19 = r8
            r21 = r9
            goto L_0x019a
        L_0x010f:
            int r16 = r15.size()
            if (r16 <= 0) goto L_0x0192
            int r6 = r15.size()
        L_0x0119:
            if (r1 >= r6) goto L_0x0192
            java.lang.Object r17 = r15.get(r1)
            r18 = r6
            r6 = r17
            com.google.android.gms.contextmanager.internal.TimeFilterImpl$Interval r6 = (com.google.android.gms.contextmanager.internal.TimeFilterImpl.Interval) r6
            jtt r17 = defpackage.jtt.d
            r19 = r8
            aucd r8 = r17.o()
            r17 = r2
            r20 = r3
            long r2 = r6.a
            r21 = r9
            boolean r9 = r8.c
            if (r9 != 0) goto L_0x013a
            goto L_0x0140
        L_0x013a:
            r8.c()
            r9 = 0
            r8.c = r9
        L_0x0140:
            aucj r9 = r8.b
            jtt r9 = (defpackage.jtt) r9
            r22 = r15
            int r15 = r9.a
            r15 = r15 | 1
            r9.a = r15
            r9.b = r2
            long r2 = r6.b
            r6 = r15 | 2
            r9.a = r6
            r9.c = r2
            boolean r2 = r14.c
            if (r2 != 0) goto L_0x015b
            goto L_0x0161
        L_0x015b:
            r14.c()
            r2 = 0
            r14.c = r2
        L_0x0161:
            aucj r2 = r14.b
            jtu r2 = (defpackage.jtu) r2
            aucj r3 = r8.i()
            jtt r3 = (defpackage.jtt) r3
            r3.getClass()
            aucx r6 = r2.a
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x017e
            aucx r6 = r2.a
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)
            r2.a = r6
        L_0x017e:
            aucx r2 = r2.a
            r2.add(r3)
            int r1 = r1 + 1
            r2 = r17
            r6 = r18
            r8 = r19
            r3 = r20
            r9 = r21
            r15 = r22
            goto L_0x0119
        L_0x0192:
            r17 = r2
            r20 = r3
            r19 = r8
            r21 = r9
        L_0x019a:
            int[] r1 = r13.b
            if (r1 != 0) goto L_0x019f
            goto L_0x01ca
        L_0x019f:
            int r2 = r1.length
            if (r2 <= 0) goto L_0x01ca
            java.util.List r1 = defpackage.aoog.b((int[]) r1)
            boolean r2 = r14.c
            if (r2 != 0) goto L_0x01ab
            goto L_0x01b1
        L_0x01ab:
            r14.c()
            r2 = 0
            r14.c = r2
        L_0x01b1:
            aucj r2 = r14.b
            jtu r2 = (defpackage.jtu) r2
            aucs r3 = r2.b
            boolean r3 = r3.a()
            if (r3 != 0) goto L_0x01c5
            aucs r3 = r2.b
            aucs r3 = defpackage.aucj.a((defpackage.aucs) r3)
            r2.b = r3
        L_0x01c5:
            aucs r2 = r2.b
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r2)
        L_0x01ca:
            aucj r1 = r14.i()
            jtu r1 = (defpackage.jtu) r1
            goto L_0x01da
        L_0x01d1:
            r17 = r2
            r20 = r3
            r19 = r8
            r21 = r9
            r1 = 0
        L_0x01da:
            if (r1 != 0) goto L_0x01dd
            goto L_0x01f7
        L_0x01dd:
            boolean r2 = r12.c
            if (r2 != 0) goto L_0x01e2
            goto L_0x01e8
        L_0x01e2:
            r12.c()
            r2 = 0
            r12.c = r2
        L_0x01e8:
            aucj r2 = r12.b
            jto r2 = (defpackage.jto) r2
            r1.getClass()
            r2.d = r1
            int r1 = r2.a
            r1 = r1 | 4
            r2.a = r1
        L_0x01f7:
            com.google.android.gms.contextmanager.internal.KeyFilterImpl r1 = r11.d
            if (r1 == 0) goto L_0x02d9
            java.util.ArrayList r1 = r1.a
            jtr r2 = defpackage.jtr.b
            aucd r2 = r2.o()
            if (r1 == 0) goto L_0x02d2
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x02d2
            int r3 = r1.size()
            r6 = 0
        L_0x0210:
            if (r6 >= r3) goto L_0x02d2
            java.lang.Object r8 = r1.get(r6)
            com.google.android.gms.contextmanager.internal.KeyFilterImpl$Inclusion r8 = (com.google.android.gms.contextmanager.internal.KeyFilterImpl.Inclusion) r8
            jtq r9 = defpackage.jtq.d
            aucd r9 = r9.o()
            java.lang.String[] r11 = r8.a
            if (r11 == 0) goto L_0x0249
            java.util.List r11 = java.util.Arrays.asList(r11)
            boolean r13 = r9.c
            if (r13 == 0) goto L_0x0230
            r9.c()
            r13 = 0
            r9.c = r13
        L_0x0230:
            aucj r13 = r9.b
            jtq r13 = (defpackage.jtq) r13
            aucx r14 = r13.a
            boolean r14 = r14.a()
            if (r14 != 0) goto L_0x0244
            aucx r14 = r13.a
            aucx r14 = defpackage.aucj.a((defpackage.aucx) r14)
            r13.a = r14
        L_0x0244:
            aucx r13 = r13.a
            defpackage.auab.a((java.lang.Iterable) r11, (java.util.List) r13)
        L_0x0249:
            java.lang.String[] r11 = r8.b
            if (r11 == 0) goto L_0x0275
            java.util.List r11 = java.util.Arrays.asList(r11)
            boolean r13 = r9.c
            if (r13 != 0) goto L_0x0256
            goto L_0x025c
        L_0x0256:
            r9.c()
            r13 = 0
            r9.c = r13
        L_0x025c:
            aucj r13 = r9.b
            jtq r13 = (defpackage.jtq) r13
            aucx r14 = r13.b
            boolean r14 = r14.a()
            if (r14 != 0) goto L_0x0270
            aucx r14 = r13.b
            aucx r14 = defpackage.aucj.a((defpackage.aucx) r14)
            r13.b = r14
        L_0x0270:
            aucx r13 = r13.b
            defpackage.auab.a((java.lang.Iterable) r11, (java.util.List) r13)
        L_0x0275:
            java.lang.String[] r8 = r8.c
            if (r8 == 0) goto L_0x02a1
            java.util.List r8 = java.util.Arrays.asList(r8)
            boolean r11 = r9.c
            if (r11 != 0) goto L_0x0282
            goto L_0x0288
        L_0x0282:
            r9.c()
            r11 = 0
            r9.c = r11
        L_0x0288:
            aucj r11 = r9.b
            jtq r11 = (defpackage.jtq) r11
            aucx r13 = r11.c
            boolean r13 = r13.a()
            if (r13 != 0) goto L_0x029c
            aucx r13 = r11.c
            aucx r13 = defpackage.aucj.a((defpackage.aucx) r13)
            r11.c = r13
        L_0x029c:
            aucx r11 = r11.c
            defpackage.auab.a((java.lang.Iterable) r8, (java.util.List) r11)
        L_0x02a1:
            boolean r8 = r2.c
            if (r8 != 0) goto L_0x02a6
            goto L_0x02ac
        L_0x02a6:
            r2.c()
            r8 = 0
            r2.c = r8
        L_0x02ac:
            aucj r8 = r2.b
            jtr r8 = (defpackage.jtr) r8
            aucj r9 = r9.i()
            jtq r9 = (defpackage.jtq) r9
            r9.getClass()
            aucx r11 = r8.a
            boolean r11 = r11.a()
            if (r11 != 0) goto L_0x02c9
            aucx r11 = r8.a
            aucx r11 = defpackage.aucj.a((defpackage.aucx) r11)
            r8.a = r11
        L_0x02c9:
            aucx r8 = r8.a
            r8.add(r9)
            int r6 = r6 + 1
            goto L_0x0210
        L_0x02d2:
            aucj r1 = r2.i()
            jtr r1 = (defpackage.jtr) r1
            goto L_0x02da
        L_0x02d9:
            r1 = 0
        L_0x02da:
            if (r1 == 0) goto L_0x02f6
            boolean r2 = r12.c
            if (r2 != 0) goto L_0x02e1
            goto L_0x02e7
        L_0x02e1:
            r12.c()
            r2 = 0
            r12.c = r2
        L_0x02e7:
            aucj r2 = r12.b
            jto r2 = (defpackage.jto) r2
            r1.getClass()
            r2.e = r1
            int r1 = r2.a
            r1 = r1 | 8
            r2.a = r1
        L_0x02f6:
            boolean r1 = r7.c
            if (r1 != 0) goto L_0x02fb
            goto L_0x0301
        L_0x02fb:
            r7.c()
            r1 = 0
            r7.c = r1
        L_0x0301:
            aucj r1 = r7.b
            jtp r1 = (defpackage.jtp) r1
            aucj r2 = r12.i()
            jto r2 = (defpackage.jto) r2
            r2.getClass()
            aucx r3 = r1.b
            boolean r3 = r3.a()
            if (r3 != 0) goto L_0x031e
            aucx r3 = r1.b
            aucx r3 = defpackage.aucj.a((defpackage.aucx) r3)
            r1.b = r3
        L_0x031e:
            aucx r1 = r1.b
            r1.add(r2)
            int r10 = r10 + 1
            r2 = r17
            r8 = r19
            r3 = r20
            r9 = r21
            r1 = 0
            goto L_0x00ca
        L_0x0330:
            r17 = r2
            r20 = r3
            boolean r1 = r4.c()
            if (r1 == 0) goto L_0x0360
            java.util.ArrayList r1 = r4.b
            boolean r2 = r7.c
            if (r2 != 0) goto L_0x0341
            goto L_0x0347
        L_0x0341:
            r7.c()
            r2 = 0
            r7.c = r2
        L_0x0347:
            aucj r2 = r7.b
            jtp r2 = (defpackage.jtp) r2
            aucx r3 = r2.c
            boolean r3 = r3.a()
            if (r3 != 0) goto L_0x035b
            aucx r3 = r2.c
            aucx r3 = defpackage.aucj.a((defpackage.aucx) r3)
            r2.c = r3
        L_0x035b:
            aucx r2 = r2.c
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r2)
        L_0x0360:
            com.google.android.gms.contextmanager.internal.QueryFilterParameters r1 = r4.c
            if (r1 == 0) goto L_0x03d7
            jts r2 = defpackage.jts.e
            aucd r2 = r2.o()
            int r3 = r1.a
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x0371
            goto L_0x0377
        L_0x0371:
            r2.c()
            r4 = 0
            r2.c = r4
        L_0x0377:
            aucj r4 = r2.b
            jts r4 = (defpackage.jts) r4
            int r6 = r4.a
            r6 = r6 | 1
            r4.a = r6
            r4.b = r3
            int r3 = r1.b
            r6 = r6 | 2
            r4.a = r6
            r4.c = r3
            int[] r1 = r1.c
            if (r1 == 0) goto L_0x03b7
            java.util.List r1 = defpackage.aoog.b((int[]) r1)
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x0398
            goto L_0x039e
        L_0x0398:
            r2.c()
            r3 = 0
            r2.c = r3
        L_0x039e:
            aucj r3 = r2.b
            jts r3 = (defpackage.jts) r3
            aucs r4 = r3.d
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x03b2
            aucs r4 = r3.d
            aucs r4 = defpackage.aucj.a((defpackage.aucs) r4)
            r3.d = r4
        L_0x03b2:
            aucs r3 = r3.d
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r3)
        L_0x03b7:
            aucj r1 = r2.i()
            jts r1 = (defpackage.jts) r1
            boolean r2 = r7.c
            if (r2 != 0) goto L_0x03c2
            goto L_0x03c8
        L_0x03c2:
            r7.c()
            r2 = 0
            r7.c = r2
        L_0x03c8:
            aucj r2 = r7.b
            jtp r2 = (defpackage.jtp) r2
            r1.getClass()
            r2.d = r1
            int r1 = r2.a
            r1 = r1 | 1
            r2.a = r1
        L_0x03d7:
            aucj r1 = r7.i()
            r6 = r1
            jtp r6 = (defpackage.jtp) r6
            goto L_0x03e4
        L_0x03df:
            r17 = r2
            r20 = r3
            r6 = 0
        L_0x03e4:
            r17.e()
            r1 = r17
            byg r1 = r1.b
            byp r1 = r1.d
            ikh r2 = r1.f
            if (r2 == 0) goto L_0x04cc
            java.lang.String r2 = r1.b((android.app.PendingIntent) r5)
            if (r2 != 0) goto L_0x040b
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            ikh r3 = r1.f
            com.google.android.contextmanager.fence.FencePendingIntentCache$FencePendingIntentItem r4 = new com.google.android.contextmanager.fence.FencePendingIntentCache$FencePendingIntentItem
            r4.<init>(r2, r5)
            r3.a((android.os.Parcelable) r4)
            jjg r3 = defpackage.bxk.a
        L_0x040b:
            java.util.HashMap r3 = r1.c
            java.lang.Object r3 = r3.get(r5)
            byl r3 = (defpackage.byl) r3
            if (r3 != 0) goto L_0x0425
            byl r3 = new byl
            r3.<init>(r5, r2)
            java.util.HashMap r4 = r1.c
            r4.put(r5, r3)
            java.util.HashMap r1 = r1.d
            r1.put(r2, r3)
            goto L_0x0426
        L_0x0425:
        L_0x0426:
            jyh r1 = defpackage.jyh.h
            aucd r1 = r1.o()
            if (r2 == 0) goto L_0x0448
            boolean r4 = r1.c
            if (r4 != 0) goto L_0x0433
            goto L_0x0439
        L_0x0433:
            r1.c()
            r4 = 0
            r1.c = r4
        L_0x0439:
            aucj r4 = r1.b
            jyh r4 = (defpackage.jyh) r4
            r2.getClass()
            int r5 = r4.a
            r5 = r5 | 1
            r4.a = r5
            r4.b = r2
        L_0x0448:
            r2 = r20
            java.lang.String r4 = r2.b
            if (r4 == 0) goto L_0x0468
            boolean r5 = r1.c
            if (r5 != 0) goto L_0x0453
            goto L_0x0459
        L_0x0453:
            r1.c()
            r5 = 0
            r1.c = r5
        L_0x0459:
            aucj r5 = r1.b
            jyh r5 = (defpackage.jyh) r5
            r4.getClass()
            int r7 = r5.a
            r7 = r7 | 2
            r5.a = r7
            r5.c = r4
        L_0x0468:
            java.lang.String r4 = r2.a
            if (r4 == 0) goto L_0x0486
            boolean r5 = r1.c
            if (r5 != 0) goto L_0x0471
            goto L_0x0477
        L_0x0471:
            r1.c()
            r5 = 0
            r1.c = r5
        L_0x0477:
            aucj r5 = r1.b
            jyh r5 = (defpackage.jyh) r5
            r4.getClass()
            int r7 = r5.a
            r7 = r7 | 4
            r5.a = r7
            r5.d = r4
        L_0x0486:
            java.lang.String r2 = r2.d
            if (r2 == 0) goto L_0x04a4
            boolean r4 = r1.c
            if (r4 != 0) goto L_0x048f
            goto L_0x0495
        L_0x048f:
            r1.c()
            r4 = 0
            r1.c = r4
        L_0x0495:
            aucj r4 = r1.b
            jyh r4 = (defpackage.jyh) r4
            r2.getClass()
            int r5 = r4.a
            r5 = r5 | 8
            r4.a = r5
            r4.e = r2
        L_0x04a4:
            if (r6 != 0) goto L_0x04a7
            goto L_0x04c1
        L_0x04a7:
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x04ac
            goto L_0x04b2
        L_0x04ac:
            r1.c()
            r2 = 0
            r1.c = r2
        L_0x04b2:
            aucj r2 = r1.b
            jyh r2 = (defpackage.jyh) r2
            r6.getClass()
            r2.f = r6
            int r4 = r2.a
            r4 = r4 | 16
            r2.a = r4
        L_0x04c1:
            aucj r1 = r1.i()
            jyh r1 = (defpackage.jyh) r1
            r3.d = r1
            jjg r1 = defpackage.bxk.a
            goto L_0x04e7
        L_0x04cc:
            jjg r1 = defpackage.bxk.a
            anie r1 = r1.b()
            anih r1 = (defpackage.anih) r1
            r2 = 199(0xc7, float:2.79E-43)
            java.lang.String r3 = "byp"
            java.lang.String r4 = "a"
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r1 = r1.a((java.lang.String) r3, (java.lang.String) r4, (int) r2, (java.lang.String) r5)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "[FencePendingIntentCache]Could not add data filter=%s. Cache is null."
            r1.a((java.lang.String) r2, (java.lang.Object) r6)
        L_0x04e7:
            byd r1 = defpackage.cbi.E()
            r1.d()
            return
        L_0x04ef:
            return
        L_0x04f0:
            r1 = 7501(0x1d4d, float:1.0511E-41)
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxd.b(int):void");
    }

    /* access modifiers changed from: protected */
    public final void a() {
        acwa acwa;
        bte x = cbi.x();
        ccg t = cbi.t();
        if (this.c.b()) {
            ContextDataFilterImpl contextDataFilterImpl = this.e.b;
            if (contextDataFilterImpl == null || contextDataFilterImpl.d() == null) {
                cbi.r().a(this.c.a(), (bvt) this.e);
                a(0);
                return;
            }
            Iterator it = contextDataFilterImpl.d().iterator();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                boolean z3 = true;
                if (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    int a = t.a(intValue);
                    if (a != 0) {
                        a(cci.a(a));
                        return;
                    }
                    z2 |= intValue == 18;
                    if (intValue != 74) {
                        z3 = false;
                    }
                    z |= z3;
                } else {
                    boolean z4 = this.f & z;
                    if (!x.a((Collection) contextDataFilterImpl.d(), this.c)) {
                        a(7503);
                        return;
                    }
                    acwa a2 = acws.a((Object) true);
                    if (z4 && !this.c.a().b()) {
                        ContextManagerClientInfo contextManagerClientInfo = this.c;
                        ccq H = cbi.H();
                        new Object[1][0] = contextManagerClientInfo.a();
                        if (contextManagerClientInfo.a().b()) {
                            ((anih) ((anih) bxk.a.b()).a("ccq", "a", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[StandardPlaceAliasManager] Cannot use Places Alias Fences with anonymous accounts.");
                            acwa = acws.a((Object) Collections.emptyMap());
                        } else {
                            Context f2 = cbi.f();
                            riq riq = new riq();
                            riq.a = contextManagerClientInfo.b;
                            riq.b = contextManagerClientInfo.d;
                            riq.d = contextManagerClientInfo.a;
                            acwa = rij.b(f2, riq.a()).a().b(cbi.k().a(bvq.a("StandardPlaceAliasManager_getStandardAliases")), new cco());
                        }
                        a2 = acwa.b(new ccn()).b(new ccm(H, contextManagerClientInfo));
                        a2.a((acvp) new bxa(this, "[RegisterContextListenerOperation] fetchAliases for %s", this.c));
                    }
                    if (z2 && !this.c.a().b()) {
                        a2 = a2.b(cbi.k().a(bvq.a("RegisterContextListenerOperation_checkPPAccess")), new bxc(this));
                        a2.a((acvp) new bxb(this, "[RegisterContextListenerOperation] checkPersonalizedPlacesAccess for %s", this.c));
                    }
                    a(a2);
                    return;
                }
            }
        } else {
            a(7504);
        }
    }
}
