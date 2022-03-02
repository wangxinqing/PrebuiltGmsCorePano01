package defpackage;

import android.content.Context;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: bxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxh extends bwp {
    private final jxf c;
    private final ContextManagerClientInfo d;
    private final FenceUpdateRequestImpl e;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0133 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bxh(defpackage.jxf r12, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r13, com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl r14) {
        /*
            r11 = this;
            java.lang.String r0 = "UpdateFenceRegistrationOperation"
            r11.<init>(r0)
            r11.c = r12
            r11.d = r13
            java.util.ArrayList r12 = r14.a
            int r13 = r12.size()
            r0 = 0
            r1 = 0
        L_0x0011:
            if (r1 >= r13) goto L_0x0137
            java.lang.Object r2 = r12.get(r1)
            com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation r2 = (com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation) r2
            int r3 = r2.a
            r4 = 1
            switch(r3) {
                case 1: goto L_0x0048;
                case 2: goto L_0x0048;
                case 3: goto L_0x003e;
                case 4: goto L_0x003e;
                case 5: goto L_0x003e;
                case 6: goto L_0x003e;
                case 7: goto L_0x003e;
                case 8: goto L_0x0048;
                default: goto L_0x001f;
            }
        L_0x001f:
            jjg r3 = defpackage.bxk.a
            anie r3 = r3.b()
            anih r3 = (defpackage.anih) r3
            r4 = 284(0x11c, float:3.98E-43)
            java.lang.String r5 = "bxh"
            java.lang.String r6 = "a"
            java.lang.String r7 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r3 = r3.a((java.lang.String) r5, (java.lang.String) r6, (int) r4, (java.lang.String) r7)
            anih r3 = (defpackage.anih) r3
            int r2 = r2.a
            java.lang.String r4 = "[UpdateFenceRegistrationOperation] Unrecognized UpdateFenceOperation Type %s"
            r3.a((java.lang.String) r4, (int) r2)
            goto L_0x0133
        L_0x003e:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r0] = r3
            goto L_0x0133
        L_0x0048:
            com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub r3 = r2.b
            com.google.android.gms.contextmanager.fence.internal.ContextFenceStub r3 = r3.b
            int r5 = r3.d()
            r6 = 6
            if (r5 != r6) goto L_0x012b
            jvs r5 = r3.f()
            atlj r5 = r5.a
            int r5 = r5.a
            int r5 = defpackage.atli.a(r5)
            if (r5 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r5 = 1
        L_0x0063:
            int r5 = r5 + -1
            r6 = 4
            if (r5 != r6) goto L_0x012b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r5.add(r3)
            jvw r7 = new jvw
            atlu r8 = defpackage.atlu.e
            aucd r8 = r8.o()
            boolean r9 = r8.c
            if (r9 != 0) goto L_0x007d
            goto L_0x0082
        L_0x007d:
            r8.c()
            r8.c = r0
        L_0x0082:
            aucj r9 = r8.b
            atlu r9 = (defpackage.atlu) r9
            r9.b = r4
            int r10 = r9.a
            r10 = r10 | r4
            r9.a = r10
            defpackage.atlu.a(r9)
            boolean r9 = r8.c
            if (r9 != 0) goto L_0x0095
            goto L_0x009a
        L_0x0095:
            r8.c()
            r8.c = r0
        L_0x009a:
            aucj r9 = r8.b
            atlu r9 = (defpackage.atlu) r9
            r10 = 2
            r9.d = r10
            int r10 = r9.a
            r6 = r6 | r10
            r9.a = r6
            aucj r6 = r8.i()
            atlu r6 = (defpackage.atlu) r6
            r7.<init>(r6)
            defpackage.iva.a((java.lang.Object) r7)
            atjt r6 = defpackage.atjt.z
            aucd r6 = r6.o()
            atjq r6 = (defpackage.atjq) r6
            atjs r8 = defpackage.atjs.SCREEN_FENCE
            boolean r9 = r6.c
            if (r9 != 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            r6.c()
            r6.c = r0
        L_0x00c6:
            aucj r9 = r6.b
            atjt r9 = (defpackage.atjt) r9
            int r8 = r8.z
            r9.b = r8
            int r8 = r9.a
            r8 = r8 | r4
            r9.a = r8
            atlu r7 = r7.a
            r7.getClass()
            r9.h = r7
            r7 = r8 | 32
            r9.a = r7
            aucj r6 = r6.i()
            atjt r6 = (defpackage.atjt) r6
            com.google.android.gms.contextmanager.fence.internal.ContextFenceStub r7 = new com.google.android.gms.contextmanager.fence.internal.ContextFenceStub
            r7.<init>((defpackage.atjt) r6)
            r5.add(r7)
            defpackage.iva.a((java.lang.Object) r5)
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r4
            defpackage.iva.b((boolean) r6)
            atjt r6 = defpackage.atjt.z
            aucd r6 = r6.o()
            atjq r6 = (defpackage.atjq) r6
            atjs r7 = defpackage.atjs.AND
            boolean r8 = r6.c
            if (r8 != 0) goto L_0x0106
            goto L_0x010b
        L_0x0106:
            r6.c()
            r6.c = r0
        L_0x010b:
            aucj r8 = r6.b
            atjt r8 = (defpackage.atjt) r8
            int r7 = r7.z
            r8.b = r7
            int r7 = r8.a
            r4 = r4 | r7
            r8.a = r4
            java.util.List r4 = com.google.android.gms.contextmanager.fence.internal.ContextFenceStub.a((java.util.Collection) r5)
            r6.a((java.lang.Iterable) r4)
            aucj r4 = r6.i()
            atjt r4 = (defpackage.atjt) r4
            com.google.android.gms.contextmanager.fence.internal.ContextFenceStub r5 = new com.google.android.gms.contextmanager.fence.internal.ContextFenceStub
            r5.<init>((defpackage.atjt) r4)
            goto L_0x012d
        L_0x012b:
            r5 = r3
        L_0x012d:
            if (r5 == r3) goto L_0x0133
            com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub r2 = r2.b
            r2.b = r5
        L_0x0133:
            int r1 = r1 + 1
            goto L_0x0011
        L_0x0137:
            r11.e = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxh.<init>(jxf, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo, com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x012a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl a(com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl r13) {
        /*
            java.util.ArrayList r0 = r13.a
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L_0x0008:
            if (r3 >= r1) goto L_0x012e
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation r4 = (com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation) r4
            int r5 = r4.a
            r6 = 1
            switch(r5) {
                case 1: goto L_0x003f;
                case 2: goto L_0x003f;
                case 3: goto L_0x0035;
                case 4: goto L_0x0035;
                case 5: goto L_0x0035;
                case 6: goto L_0x0035;
                case 7: goto L_0x0035;
                case 8: goto L_0x003f;
                default: goto L_0x0016;
            }
        L_0x0016:
            jjg r5 = defpackage.bxk.a
            anie r5 = r5.b()
            anih r5 = (defpackage.anih) r5
            r6 = 284(0x11c, float:3.98E-43)
            java.lang.String r7 = "bxh"
            java.lang.String r8 = "a"
            java.lang.String r9 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r5 = r5.a((java.lang.String) r7, (java.lang.String) r8, (int) r6, (java.lang.String) r9)
            anih r5 = (defpackage.anih) r5
            int r4 = r4.a
            java.lang.String r6 = "[UpdateFenceRegistrationOperation] Unrecognized UpdateFenceOperation Type %s"
            r5.a((java.lang.String) r6, (int) r4)
            goto L_0x012a
        L_0x0035:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            goto L_0x012a
        L_0x003f:
            com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub r5 = r4.b
            com.google.android.gms.contextmanager.fence.internal.ContextFenceStub r5 = r5.b
            int r7 = r5.d()
            r8 = 6
            if (r7 != r8) goto L_0x0122
            jvs r7 = r5.f()
            atlj r7 = r7.a
            int r7 = r7.a
            int r7 = defpackage.atli.a(r7)
            if (r7 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r7 = 1
        L_0x005a:
            int r7 = r7 + -1
            r8 = 4
            if (r7 != r8) goto L_0x0122
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r5)
            jvw r9 = new jvw
            atlu r10 = defpackage.atlu.e
            aucd r10 = r10.o()
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r10.c()
            r10.c = r2
        L_0x0079:
            aucj r11 = r10.b
            atlu r11 = (defpackage.atlu) r11
            r11.b = r6
            int r12 = r11.a
            r12 = r12 | r6
            r11.a = r12
            defpackage.atlu.a(r11)
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x008c
            goto L_0x0091
        L_0x008c:
            r10.c()
            r10.c = r2
        L_0x0091:
            aucj r11 = r10.b
            atlu r11 = (defpackage.atlu) r11
            r12 = 2
            r11.d = r12
            int r12 = r11.a
            r8 = r8 | r12
            r11.a = r8
            aucj r8 = r10.i()
            atlu r8 = (defpackage.atlu) r8
            r9.<init>(r8)
            defpackage.iva.a((java.lang.Object) r9)
            atjt r8 = defpackage.atjt.z
            aucd r8 = r8.o()
            atjq r8 = (defpackage.atjq) r8
            atjs r10 = defpackage.atjs.SCREEN_FENCE
            boolean r11 = r8.c
            if (r11 != 0) goto L_0x00b8
            goto L_0x00bd
        L_0x00b8:
            r8.c()
            r8.c = r2
        L_0x00bd:
            aucj r11 = r8.b
            atjt r11 = (defpackage.atjt) r11
            int r10 = r10.z
            r11.b = r10
            int r10 = r11.a
            r10 = r10 | r6
            r11.a = r10
            atlu r9 = r9.a
            r9.getClass()
            r11.h = r9
            r9 = r10 | 32
            r11.a = r9
            aucj r8 = r8.i()
            atjt r8 = (defpackage.atjt) r8
            com.google.android.gms.contextmanager.fence.internal.ContextFenceStub r9 = new com.google.android.gms.contextmanager.fence.internal.ContextFenceStub
            r9.<init>((defpackage.atjt) r8)
            r7.add(r9)
            defpackage.iva.a((java.lang.Object) r7)
            boolean r8 = r7.isEmpty()
            r8 = r8 ^ r6
            defpackage.iva.b((boolean) r8)
            atjt r8 = defpackage.atjt.z
            aucd r8 = r8.o()
            atjq r8 = (defpackage.atjq) r8
            atjs r9 = defpackage.atjs.AND
            boolean r10 = r8.c
            if (r10 != 0) goto L_0x00fd
            goto L_0x0102
        L_0x00fd:
            r8.c()
            r8.c = r2
        L_0x0102:
            aucj r10 = r8.b
            atjt r10 = (defpackage.atjt) r10
            int r9 = r9.z
            r10.b = r9
            int r9 = r10.a
            r6 = r6 | r9
            r10.a = r6
            java.util.List r6 = com.google.android.gms.contextmanager.fence.internal.ContextFenceStub.a((java.util.Collection) r7)
            r8.a((java.lang.Iterable) r6)
            aucj r6 = r8.i()
            atjt r6 = (defpackage.atjt) r6
            com.google.android.gms.contextmanager.fence.internal.ContextFenceStub r7 = new com.google.android.gms.contextmanager.fence.internal.ContextFenceStub
            r7.<init>((defpackage.atjt) r6)
            goto L_0x0124
        L_0x0122:
            r7 = r5
        L_0x0124:
            if (r7 == r5) goto L_0x012a
            com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub r4 = r4.b
            r4.b = r7
        L_0x012a:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x012e:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxh.a(com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl):com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl");
    }

    private final void b(Set set) {
        ArrayList arrayList = this.e.a;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList.get(i);
            int i2 = updateFenceOperation.a;
            if (i2 == 1 || i2 == 2) {
                bzk bzk = new bzk(updateFenceOperation.b.b.c());
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                if (bzk.u()) {
                    arrayList2.add(updateFenceOperation);
                }
            }
        }
        if (jir.a((Collection) arrayList2)) {
            set.remove(6);
            a(set);
        } else if (this.d.a().b()) {
            ((anih) ((anih) bxk.a.b()).a("bxh", "b", 207, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[UpdateFenceRegistrationOperation] Cannot use Places Alias Fences with anonymous accounts.");
            a(7504);
        } else {
            Context f = cbi.f();
            riq riq = new riq();
            ContextManagerClientInfo contextManagerClientInfo = this.d;
            riq.a = contextManagerClientInfo.b;
            riq.b = contextManagerClientInfo.d;
            riq.d = contextManagerClientInfo.a;
            rij.b(f, riq.a()).a().a(cbi.k().a(bvq.a("UpdateFenceRegistrationOperation_getStandardAliases")), (acvp) new bxg(this, "[UpdateFenceRegistrationOperation] get standard aliases", new Object[0], arrayList2, set));
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (!this.d.b()) {
            a(7504);
            return;
        }
        if (this.d.e()) {
            byd E = cbi.E();
            ContextManagerClientInfo contextManagerClientInfo = this.d;
            FenceUpdateRequestImpl fenceUpdateRequestImpl = this.e;
            int ap = (int) awuz.a.a().ap();
            bxt a = bxv.a(contextManagerClientInfo, fenceUpdateRequestImpl, E.b);
            List a2 = E.b.a(contextManagerClientInfo);
            if ((a2 != null ? a2.size() : 0) + (a.a.size() - a.b.size()) > ap) {
                a(7515);
                return;
            }
        }
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList arrayList = this.e.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList.get(i);
            int i2 = updateFenceOperation.a;
            if (i2 == 1 || i2 == 2 || i2 == 8) {
                ContextFenceStub contextFenceStub = updateFenceOperation.b.b;
                contextFenceStub.g();
                contextFenceStub.a((Set) hashSet);
            }
        }
        hashSet.remove(-1);
        if (hashSet.remove(-3)) {
            ((anih) ((anih) bxk.a.c()).a("bxh", "a", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[UpdateFenceRegistrationOperation] UpdateFenceRegistrationOperation: Predictive fence not supported.");
            a(7514);
            return;
        }
        ContextManagerClientInfo contextManagerClientInfo2 = this.d;
        if (!hashSet.isEmpty() && !contextManagerClientInfo2.c() && !contextManagerClientInfo2.d() && contextManagerClientInfo2.f != -1) {
            for (Integer intValue : hashSet) {
                if (!bvr.a.contains(Integer.valueOf(intValue.intValue()))) {
                    a(7514);
                    return;
                }
            }
        }
        if (!hashSet.isEmpty()) {
            ccg t = cbi.t();
            for (Integer intValue2 : hashSet) {
                int a3 = t.a(intValue2.intValue());
                if (a3 != 0) {
                    a(cci.a(a3));
                    return;
                }
            }
            if (!cbi.x().a(hashSet, this.d, true)) {
                a(7503);
                return;
            }
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList2 = this.e.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            UpdateFenceOperation updateFenceOperation2 = (UpdateFenceOperation) arrayList2.get(i3);
            int i4 = updateFenceOperation2.a;
            if (i4 == 1 || i4 == 2 || i4 == 8) {
                updateFenceOperation2.b.b.b(hashSet2);
            }
        }
        a((Set) hashSet2);
    }

    public final void a(int i) {
        bwf.a(this.c, i);
        btx G = cbi.G();
        ContextManagerClientInfo contextManagerClientInfo = this.d;
        FenceUpdateRequestImpl fenceUpdateRequestImpl = this.e;
        aucd a = btx.a(contextManagerClientInfo, 8, i);
        aucd o = atod.b.o();
        ArrayList arrayList = fenceUpdateRequestImpl.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList.get(i2);
            if (btx.a(updateFenceOperation) != null) {
                atoc a2 = btx.a(updateFenceOperation);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atod atod = (atod) o.b;
                a2.getClass();
                if (!atod.a.a()) {
                    atod.a = aucj.a(atod.a);
                }
                atod.a.add(a2);
            }
        }
        if (a.c) {
            a.c();
            a.c = false;
        }
        atnj atnj = (atnj) a.b;
        atod atod2 = (atod) o.i();
        atnj atnj2 = atnj.o;
        atod2.getClass();
        atnj.k = atod2;
        atnj.a |= 512;
        G.a((atnj) a.i());
    }

    /* JADX WARNING: Removed duplicated region for block: B:287:0x0a71  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Set r36) {
        /*
            r35 = this;
            r6 = r35
            r5 = r36
            java.util.Iterator r0 = r36.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "b"
            java.lang.String r3 = "a"
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r7 = 6
            r8 = 2
            r9 = 0
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x0154
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r12 = "bxh"
            if (r1 == 0) goto L_0x0139
            if (r1 == r7) goto L_0x0084
            r2 = 23
            if (r1 == r2) goto L_0x0040
            r2 = 24
            if (r1 == r2) goto L_0x0032
            goto L_0x0008
        L_0x0032:
            awww r1 = defpackage.awww.a
            awwx r1 = r1.a()
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0008
            goto L_0x0139
        L_0x0040:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x004f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            acwa r0 = defpackage.acws.a((java.lang.Object) r0)
            goto L_0x006d
        L_0x004f:
            chf r0 = defpackage.chf.a()
            acwa r0 = r0.b()
            bwn r1 = defpackage.cbi.k()
            java.lang.String r2 = "ShushGestureSensor_check_shush_availability"
            bvp r2 = defpackage.bvq.a(r2)
            java.util.concurrent.Executor r1 = r1.a((defpackage.bvp) r2)
            chb r2 = new chb
            r2.<init>()
            r0.a((java.util.concurrent.Executor) r1, (defpackage.acvp) r2)
        L_0x006d:
            bwn r1 = defpackage.cbi.k()
            java.lang.String r2 = "UpdateFenceRegistrationOperation_check_shush_availability"
            bvp r2 = defpackage.bvq.a(r2)
            java.util.concurrent.Executor r1 = r1.a((defpackage.bvp) r2)
            bxf r2 = new bxf
            r2.<init>(r6, r5)
            r0.a((java.util.concurrent.Executor) r1, (defpackage.acvp) r2)
            return
        L_0x0084:
            com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl r0 = r6.e
            java.util.ArrayList r0 = r0.a
            int r1 = r0.size()
            r3 = 0
        L_0x008d:
            if (r3 >= r1) goto L_0x00bd
            java.lang.Object r13 = r0.get(r3)
            com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation r13 = (com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation) r13
            int r14 = r13.a
            if (r14 != r10) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            if (r14 != r8) goto L_0x00ba
        L_0x009c:
            bzk r14 = new bzk
            com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub r15 = r13.b
            com.google.android.gms.contextmanager.fence.internal.ContextFenceStub r15 = r15.b
            atjt r15 = r15.c()
            r14.<init>(r15)
            if (r9 != 0) goto L_0x00b0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00b0:
            boolean r14 = r14.u()
            if (r14 != 0) goto L_0x00b7
            goto L_0x00ba
        L_0x00b7:
            r9.add(r13)
        L_0x00ba:
            int r3 = r3 + 1
            goto L_0x008d
        L_0x00bd:
            boolean r0 = defpackage.jir.a((java.util.Collection) r9)
            if (r0 == 0) goto L_0x00ce
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r5.remove(r0)
            r35.a((java.util.Set) r36)
            return
        L_0x00ce:
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r0 = r6.d
            bsz r0 = r0.a()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x00f5
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r1 = 207(0xcf, float:2.9E-43)
            anie r0 = r0.a((java.lang.String) r12, (java.lang.String) r2, (int) r1, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "[UpdateFenceRegistrationOperation] Cannot use Places Alias Fences with anonymous accounts."
            r0.a((java.lang.String) r1)
            r0 = 7504(0x1d50, float:1.0515E-41)
            r6.a((int) r0)
            return
        L_0x00f5:
            android.content.Context r0 = defpackage.cbi.f()
            riq r1 = new riq
            r1.<init>()
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r2 = r6.d
            java.lang.String r3 = r2.b
            r1.a = r3
            java.lang.String r3 = r2.d
            r1.b = r3
            java.lang.String r2 = r2.a
            r1.d = r2
            rir r1 = r1.a()
            rhh r0 = defpackage.rij.b(r0, r1)
            acwa r7 = r0.a()
            bwn r0 = defpackage.cbi.k()
            java.lang.String r1 = "UpdateFenceRegistrationOperation_getStandardAliases"
            bvp r1 = defpackage.bvq.a(r1)
            java.util.concurrent.Executor r8 = r0.a((defpackage.bvp) r1)
            bxg r10 = new bxg
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.String r2 = "[UpdateFenceRegistrationOperation] get standard aliases"
            r0 = r10
            r1 = r35
            r4 = r9
            r5 = r36
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a((java.util.concurrent.Executor) r8, (defpackage.acvp) r10)
            return
        L_0x0139:
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r1 = 145(0x91, float:2.03E-43)
            anie r0 = r0.a((java.lang.String) r12, (java.lang.String) r3, (int) r1, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "[UpdateFenceRegistrationOperation] Invalid fence type provided"
            r0.a((java.lang.String) r1)
            r0 = 7514(0x1d5a, float:1.053E-41)
            r6.a((int) r0)
            return
        L_0x0154:
            com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl r0 = r6.e
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayList r5 = r0.a
            int r5 = r5.size()
            r1.<init>(r5)
            java.util.ArrayList r0 = r0.a
            int r5 = r0.size()
            r12 = 0
        L_0x0168:
            r13 = 8
            if (r12 >= r5) goto L_0x017d
            java.lang.Object r14 = r0.get(r12)
            com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation r14 = (com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation) r14
            int r15 = r14.a
            if (r15 != r13) goto L_0x0177
            goto L_0x017a
        L_0x0177:
            r1.add(r14)
        L_0x017a:
            int r12 = r12 + 1
            goto L_0x0168
        L_0x017d:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0189
            com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl r0 = new com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl
            r0.<init>(r1)
            goto L_0x018a
        L_0x0189:
            r0 = r9
        L_0x018a:
            if (r0 == 0) goto L_0x0a81
            byd r1 = defpackage.cbi.E()
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r5 = r6.d
            r1.e()
            java.lang.Object[] r12 = new java.lang.Object[r8]
            r12[r11] = r5
            r12[r10] = r0
            byg r12 = r1.b
            bxt r12 = defpackage.bxv.a((com.google.android.gms.contextmanager.internal.ContextManagerClientInfo) r5, (com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl) r0, (defpackage.byg) r12)
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.util.List r15 = r12.b
            int r15 = r15.size()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r11] = r15
            java.util.List r15 = r12.a
            int r15 = r15.size()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r10] = r15
            java.util.List r14 = r12.b
            int r15 = r14.size()
            r7 = 0
            r16 = 0
        L_0x01c4:
            if (r7 >= r15) goto L_0x02ee
            java.lang.Object r17 = r14.get(r7)
            r13 = r17
            bxu r13 = (defpackage.bxu) r13
            java.lang.Object[] r8 = new java.lang.Object[r10]
            bzm r10 = r13.a
            java.lang.String r10 = r10.e
            r8[r11] = r10
            byg r8 = r1.b
            java.util.Set r8 = r8.c((java.lang.String) r10)
            byg r11 = r1.b
            bzm r10 = r11.d(r10)
            if (r10 == 0) goto L_0x02c3
            r10.a((java.util.List) r9)
            r1.a((java.util.Collection) r9, (java.util.Collection) r8)
            clg r8 = r10.i
            if (r8 != 0) goto L_0x01ef
            goto L_0x01f8
        L_0x01ef:
            java.util.Set r8 = defpackage.byd.a((defpackage.clg) r8)
            if (r8 == 0) goto L_0x01f8
            r1.a((java.util.Set) r8)
        L_0x01f8:
            com.google.android.contextmanager.fence.PlaceFenceHelper r8 = r1.e
            bzk r11 = r10.b
            java.util.List r11 = r11.n()
            java.util.Iterator r11 = r11.iterator()
        L_0x0204:
            boolean r20 = r11.hasNext()
            if (r20 == 0) goto L_0x02a8
            java.lang.Object r20 = r11.next()
            r9 = r20
            bzv r9 = (defpackage.bzv) r9
            boolean r20 = com.google.android.contextmanager.fence.PlaceFenceHelper.a((defpackage.bzv) r9)
            if (r20 == 0) goto L_0x029d
            r20 = r11
            java.util.List r11 = defpackage.byy.a((defpackage.bzv) r9)
            boolean r21 = r11.isEmpty()
            if (r21 == 0) goto L_0x0247
            jjg r11 = defpackage.bxk.a
            anie r11 = r11.c()
            anih r11 = (defpackage.anih) r11
            r21 = r14
            r14 = 509(0x1fd, float:7.13E-43)
            r22 = r15
            java.lang.String r15 = "com.google.android.contextmanager.fence.PlaceFenceHelper"
            anie r11 = r11.a((java.lang.String) r15, (java.lang.String) r2, (int) r14, (java.lang.String) r4)
            anih r11 = (defpackage.anih) r11
            java.lang.String r14 = "[PlaceFenceHelper] NearbyAlert record not found for %s"
            r11.a((java.lang.String) r14, (java.lang.Object) r9)
            r11 = r20
            r14 = r21
            r15 = r22
            r9 = 0
            goto L_0x0204
        L_0x0247:
            r21 = r14
            r22 = r15
            int r14 = r11.size()
            r15 = 0
            r23 = 0
        L_0x0252:
            if (r15 >= r14) goto L_0x0280
            java.lang.Object r24 = r11.get(r15)
            r25 = r2
            r2 = r24
            byy r2 = (defpackage.byy) r2
            r24 = r11
            java.util.HashMap r11 = r8.b
            java.lang.Object r2 = r11.get(r2)
            byz r2 = (defpackage.byz) r2
            if (r2 == 0) goto L_0x0279
            java.util.IdentityHashMap r11 = r2.a
            r11.remove(r9)
            boolean r2 = r2.a()
            r11 = 1
            r2 = r2 ^ r11
            r2 = r23 | r2
            r23 = r2
        L_0x0279:
            int r15 = r15 + 1
            r11 = r24
            r2 = r25
            goto L_0x0252
        L_0x0280:
            r25 = r2
            if (r23 == 0) goto L_0x0292
            r8.a()
            r11 = r20
            r14 = r21
            r15 = r22
            r2 = r25
            r9 = 0
            goto L_0x0204
        L_0x0292:
            r11 = r20
            r14 = r21
            r15 = r22
            r2 = r25
            r9 = 0
            goto L_0x0204
        L_0x029d:
            r25 = r2
            r20 = r11
            r21 = r14
            r22 = r15
            r9 = 0
            goto L_0x0204
        L_0x02a8:
            r25 = r2
            r21 = r14
            r22 = r15
            clj r2 = defpackage.cbi.C()
            jiq r8 = defpackage.cbi.i()
            long r8 = r8.a()
            java.lang.String r10 = r10.a
            r11 = 12
            r2.a((long) r8, (java.lang.String) r10, (int) r11)
            r2 = 1
            goto L_0x02ca
        L_0x02c3:
            r25 = r2
            r21 = r14
            r22 = r15
            r2 = 0
        L_0x02ca:
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r8 = 0
            r9[r8] = r2
            bwa r2 = r13.b
            int r2 = r2.b
            boolean r2 = defpackage.bwb.a(r2)
            r16 = r16 | r2
            int r7 = r7 + 1
            r14 = r21
            r15 = r22
            r2 = r25
            r8 = 2
            r9 = 0
            r10 = 1
            r11 = 0
            r13 = 8
            goto L_0x01c4
        L_0x02ee:
            java.util.List r2 = r12.a
            int r7 = r2.size()
            r8 = 0
            r9 = 0
        L_0x02f6:
            if (r8 >= r7) goto L_0x07ba
            java.lang.Object r10 = r2.get(r8)
            bxu r10 = (defpackage.bxu) r10
            clj r11 = defpackage.cbi.C()
            bzm r12 = r10.a
            long r13 = r12.p
            java.lang.String r12 = r12.a
            r15 = 11
            r11.a((long) r13, (java.lang.String) r12, (int) r15)
            bzm r11 = r10.a
            bwa r12 = r10.b
            bzk r13 = r11.b
            java.lang.String r14 = r11.e
            byg r15 = r1.b
            r20 = r2
            java.util.HashMap r2 = r15.c
            java.lang.Object r2 = r2.get(r12)
            bwc r2 = (defpackage.bwc) r2
            if (r2 != 0) goto L_0x0336
            bwc r2 = new bwc
            r2.<init>(r12)
            r21 = r7
            r7 = 1
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r7 = 0
            r6[r7] = r2
            java.util.HashMap r6 = r15.c
            r6.put(r12, r2)
            goto L_0x0338
        L_0x0336:
            r21 = r7
        L_0x0338:
            clg r6 = new clg
            r6.<init>()
            defpackage.bys.a(r13, r6, r2, r5)
            boolean r2 = r6.a()
            if (r2 != 0) goto L_0x037e
            jiq r2 = defpackage.cbi.i()
            r13 = r8
            long r7 = r2.a()
            r2 = 0
        L_0x0350:
            int r15 = r6.size()
            if (r2 >= r15) goto L_0x037b
            java.lang.Object r15 = r6.valueAt(r2)
            java.util.Set r15 = (java.util.Set) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x0360:
            boolean r22 = r15.hasNext()
            if (r22 == 0) goto L_0x0376
            java.lang.Object r22 = r15.next()
            r23 = r6
            r6 = r22
            cas r6 = (defpackage.cas) r6
            r6.a((long) r7)
            r6 = r23
            goto L_0x0360
        L_0x0376:
            r23 = r6
            int r2 = r2 + 1
            goto L_0x0350
        L_0x037b:
            r23 = r6
            goto L_0x0380
        L_0x037e:
            r13 = r8
            r6 = 0
        L_0x0380:
            if (r6 != 0) goto L_0x038c
            r32 = r0
            r23 = r5
            r33 = r9
            r34 = r10
            goto L_0x079a
        L_0x038c:
            boolean r2 = r6.a()
            if (r2 != 0) goto L_0x0792
            byg r2 = r1.b
            java.util.Set r2 = r2.c((java.lang.String) r14)
            byg r7 = r1.b
            bzm r7 = r7.d(r14)
            if (r7 != 0) goto L_0x03a1
            goto L_0x03a6
        L_0x03a1:
            r8 = 0
            r7.a((java.util.List) r8)
        L_0x03a6:
            r11.i = r6
            android.util.SparseBooleanArray r6 = new android.util.SparseBooleanArray
            clg r7 = r11.i
            int r7 = r7.size()
            r6.<init>(r7)
            r11.j = r6
            r6 = 0
        L_0x03b6:
            clg r7 = r11.i
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x03cd
            android.util.SparseBooleanArray r7 = r11.j
            clg r8 = r11.i
            int r8 = r8.keyAt(r6)
            r14 = 0
            r7.put(r8, r14)
            int r6 = r6 + 1
            goto L_0x03b6
        L_0x03cd:
            r14 = 0
            byg r6 = r1.b
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.util.HashMap r7 = r6.c
            java.util.Set r7 = r7.keySet()
            r8[r14] = r7
            java.util.HashMap r7 = r6.c
            java.lang.Object r7 = r7.get(r12)
            bwc r7 = (defpackage.bwc) r7
            if (r7 == 0) goto L_0x03e7
            r8 = 1
            goto L_0x03e8
        L_0x03e7:
            r8 = 0
        L_0x03e8:
            defpackage.iva.a((boolean) r8)
            r6.a((defpackage.bzm) r11)
            java.util.Map r8 = r6.f
            bzk r14 = r11.b
            r8.put(r14, r11)
            java.util.HashMap r8 = r6.a
            java.lang.String r14 = r11.e
            java.lang.Object r8 = r8.remove(r14)
            bwc r8 = (defpackage.bwc) r8
            r14 = 3
            if (r8 == 0) goto L_0x0417
            defpackage.bzm.a((defpackage.bzm) r11, (int) r14)
            java.lang.String r15 = r11.e
            r8.a((java.lang.String) r15)
            boolean r15 = r8.e()
            if (r15 == 0) goto L_0x0417
            java.util.HashMap r15 = r6.c
            bwa r8 = r8.a
            r15.remove(r8)
        L_0x0417:
            java.util.HashMap r8 = r7.b
            java.lang.String r15 = r11.e
            r8.put(r15, r11)
            r8 = 0
            r11.b(r8)
            r15 = 2
            java.lang.Object[] r14 = new java.lang.Object[r15]
            bwa r15 = r7.a
            r14[r8] = r15
            java.util.HashMap r8 = r7.b
            r15 = 1
            r14[r15] = r8
            java.util.HashMap r8 = r6.a
            java.lang.String r14 = r11.e
            r8.put(r14, r7)
            r7 = 2
            defpackage.bzm.a((defpackage.bzm) r11, (int) r7)
            bzk r7 = r11.b
            java.util.List r8 = r7.h
            if (r8 != 0) goto L_0x0447
            atjs r8 = defpackage.atjs.LOCATION_FENCE
            java.util.List r8 = r7.a((defpackage.atjs) r8)
            r7.h = r8
        L_0x0447:
            java.util.List r8 = r7.h
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0452
            java.util.List r8 = r7.h
            goto L_0x0453
        L_0x0452:
            r8 = 0
        L_0x0453:
            if (r8 == 0) goto L_0x04f5
            boolean r14 = r8.isEmpty()
            if (r14 != 0) goto L_0x04f5
            java.util.Set r7 = r7.m()
            boolean r7 = defpackage.jir.a((java.util.Collection) r7)
            if (r7 == 0) goto L_0x0470
            awuz r7 = defpackage.awuz.a
            awva r7 = r7.a()
            long r14 = r7.aa()
            goto L_0x047a
        L_0x0470:
            awuz r7 = defpackage.awuz.a
            awva r7 = r7.a()
            long r14 = r7.ac()
        L_0x047a:
            java.lang.Long r7 = java.lang.Long.valueOf(r14)
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            int r15 = r8.size()
            r23 = r5
            r5 = 0
        L_0x048a:
            if (r5 >= r15) goto L_0x04ed
            java.lang.Object r24 = r8.get(r5)
            r25 = r8
            r8 = r24
            bzq r8 = (defpackage.bzq) r8
            r24 = r15
            rdo r15 = new rdo
            r15.<init>()
            int r26 = r8.a()
            double r27 = defpackage.aell.b((int) r26)
            int r26 = r8.j()
            double r29 = defpackage.aell.b((int) r26)
            r32 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r33 = r9
            r34 = r10
            double r9 = r8.l()
            float r9 = (float) r9
            float r31 = java.lang.Math.max(r0, r9)
            r26 = r15
            r26.a(r27, r29, r31)
            r15.b()
            int r0 = r7.intValue()
            r15.d = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r15.a = r0
            r0 = 3
            r15.b = r0
            com.google.android.gms.location.internal.ParcelableGeofence r9 = r15.a()
            r14.put(r8, r9)
            int r5 = r5 + 1
            r15 = r24
            r8 = r25
            r0 = r32
            r9 = r33
            r10 = r34
            goto L_0x048a
        L_0x04ed:
            r32 = r0
            r33 = r9
            r34 = r10
            r8 = r14
            goto L_0x04fe
        L_0x04f5:
            r32 = r0
            r23 = r5
            r33 = r9
            r34 = r10
            r8 = 0
        L_0x04fe:
            if (r8 == 0) goto L_0x053b
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Collection r5 = r8.values()
            r0.addAll(r5)
            amxb r5 = r6.g
            java.lang.String r7 = r11.e
            r5.b(r7, r0)
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x051b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x053b
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getKey()
            bzq r7 = (defpackage.bzq) r7
            java.lang.Object r5 = r5.getValue()
            com.google.android.gms.location.internal.ParcelableGeofence r5 = (com.google.android.gms.location.internal.ParcelableGeofence) r5
            java.util.HashMap r8 = r6.b
            java.lang.String r5 = r5.a
            r8.put(r5, r7)
            goto L_0x051b
        L_0x053b:
            int r0 = r12.b
            r5 = 2
            if (r0 != r5) goto L_0x0623
            byp r0 = r6.d
            android.app.PendingIntent r5 = r12.d
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r6 = r12.a
            int r6 = r6.j
            int r7 = android.os.Process.myPid()
            if (r6 != r7) goto L_0x0550
            r6 = 1
            goto L_0x0551
        L_0x0550:
            r6 = 0
        L_0x0551:
            ikh r7 = r0.f
            if (r7 == 0) goto L_0x0609
            java.lang.String r7 = r0.b((android.app.PendingIntent) r5)
            if (r7 != 0) goto L_0x056f
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r7 = r7.toString()
            ikh r8 = r0.f
            com.google.android.contextmanager.fence.FencePendingIntentCache$FencePendingIntentItem r9 = new com.google.android.contextmanager.fence.FencePendingIntentCache$FencePendingIntentItem
            r9.<init>(r7, r5)
            r8.a((android.os.Parcelable) r9)
            jjg r8 = defpackage.bxk.a
        L_0x056f:
            java.util.HashMap r8 = r0.c
            java.lang.Object r8 = r8.get(r5)
            byl r8 = (defpackage.byl) r8
            if (r8 != 0) goto L_0x0589
            byl r8 = new byl
            r8.<init>(r5, r7)
            java.util.HashMap r9 = r0.c
            r9.put(r5, r8)
            java.util.HashMap r5 = r0.d
            r5.put(r7, r8)
            goto L_0x058a
        L_0x0589:
        L_0x058a:
            java.util.HashMap r0 = r0.e
            java.lang.String r5 = r11.e
            r0.put(r5, r8)
            jyg r0 = defpackage.jyg.j
            aucd r0 = r0.o()
            boolean r5 = r0.c
            if (r5 != 0) goto L_0x059c
            goto L_0x05a2
        L_0x059c:
            r0.c()
            r5 = 0
            r0.c = r5
        L_0x05a2:
            aucj r5 = r0.b
            jyg r5 = (defpackage.jyg) r5
            r7.getClass()
            int r9 = r5.a
            r10 = 1
            r9 = r9 | r10
            r5.a = r9
            r5.b = r7
            java.lang.String r7 = r11.f
            r7.getClass()
            r10 = 2
            r9 = r9 | r10
            r5.a = r9
            r5.c = r7
            java.lang.String r7 = r11.g
            r7.getClass()
            r9 = r9 | 4
            r5.a = r9
            r5.d = r7
            java.lang.String r7 = r11.h
            r7.getClass()
            r10 = 8
            r9 = r9 | r10
            r5.a = r9
            r5.e = r7
            java.lang.String r7 = r11.a
            r7.getClass()
            r9 = r9 | 16
            r5.a = r9
            r5.f = r7
            bzk r7 = r11.b
            audx r7 = r7.c
            atjt r7 = (defpackage.atjt) r7
            r7.getClass()
            r5.g = r7
            r7 = r9 | 32
            r5.a = r7
            long r14 = r11.c
            r7 = r7 | 64
            r5.a = r7
            r5.h = r14
            r7 = r7 | 128(0x80, float:1.794E-43)
            r5.a = r7
            r5.i = r6
            aucj r0 = r0.i()
            jyg r0 = (defpackage.jyg) r0
            java.lang.String r5 = r11.e
            r8.a(r5, r0)
            jjg r0 = defpackage.bxk.a
            goto L_0x0625
        L_0x0609:
            r10 = 8
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r5 = 152(0x98, float:2.13E-43)
            java.lang.String r6 = "byp"
            anie r0 = r0.a((java.lang.String) r6, (java.lang.String) r3, (int) r5, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            java.lang.String r5 = "[FencePendingIntentCache]Could not add registration=%s. Cache is null."
            r0.a((java.lang.String) r5, (java.lang.Object) r11)
            goto L_0x0625
        L_0x0623:
            r10 = 8
        L_0x0625:
            byg r0 = r1.b
            java.lang.String r5 = r11.e
            java.util.Set r0 = r0.c((java.lang.String) r5)
            r1.a((java.util.Collection) r0, (java.util.Collection) r2)
            com.google.android.contextmanager.fence.PlaceFenceHelper r0 = r1.e
            bzk r2 = r11.b
            java.util.List r2 = r2.n()
            java.util.Iterator r2 = r2.iterator()
        L_0x063c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x07a0
            java.lang.Object r5 = r2.next()
            bzv r5 = (defpackage.bzv) r5
            boolean r6 = com.google.android.contextmanager.fence.PlaceFenceHelper.a((defpackage.bzv) r5)
            if (r6 == 0) goto L_0x078c
            java.util.List r6 = defpackage.byy.a((defpackage.bzv) r5)
            int r7 = r6.size()
            r8 = 0
        L_0x0657:
            if (r8 >= r7) goto L_0x0786
            java.lang.Object r9 = r6.get(r8)
            byy r9 = (defpackage.byy) r9
            java.util.HashMap r11 = r0.b
            boolean r11 = r11.containsKey(r9)
            if (r11 == 0) goto L_0x0679
            java.util.HashMap r11 = r0.b
            java.lang.Object r9 = r11.get(r9)
            byz r9 = (defpackage.byz) r9
            r9.a(r5)
            r22 = r2
            r15 = 1
            r19 = 0
            goto L_0x0772
        L_0x0679:
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r12 = "android.gms.contextmanager.NEARBY_ALERTS"
            r11.<init>(r12)
            java.lang.String r12 = "com.google.android.gms"
            r11.setPackage(r12)
            int r12 = r9.a
            r14 = 1
            if (r12 == r14) goto L_0x070b
            r14 = 2
            if (r12 == r14) goto L_0x06ab
            java.lang.Object r12 = r9.b
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            java.lang.String r14 = "extraPlaceType"
            r11.putExtra(r14, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.util.List r12 = java.util.Collections.singletonList(r12)
            com.google.android.gms.location.places.NearbyAlertFilter r12 = com.google.android.gms.location.places.NearbyAlertFilter.c(r12)
            r22 = r2
            r10 = 0
            goto L_0x0723
        L_0x06ab:
            java.lang.Object r12 = r9.b
            java.lang.String r12 = (java.lang.String) r12
            boolean r14 = r0.d
            if (r14 != 0) goto L_0x06c4
            java.lang.String r14 = "extraPlaceId"
            r11.putExtra(r14, r12)
            java.util.List r12 = java.util.Collections.singletonList(r12)
            com.google.android.gms.location.places.NearbyAlertFilter r12 = com.google.android.gms.location.places.NearbyAlertFilter.b(r12)
            r22 = r2
            r10 = 0
            goto L_0x0723
        L_0x06c4:
            r11 = 1
            java.lang.Object[] r14 = new java.lang.Object[r11]
            r15 = 0
            r14[r15] = r12
            android.content.Context r14 = defpackage.cbi.f()
            rir r10 = r0.c
            rhh r10 = defpackage.rij.b(r14, r10)
            java.lang.String[] r14 = new java.lang.String[r11]
            r14[r15] = r12
            acwa r10 = r10.a(r14)
            bwn r14 = defpackage.cbi.k()
            java.lang.String r18 = "request_geofence"
            bvp r15 = defpackage.bvq.a(r18)
            java.util.concurrent.Executor r14 = r14.a((defpackage.bvp) r15)
            byw r15 = new byw
            r22 = r2
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r11 = 0
            r2[r11] = r12
            java.lang.String r26 = "[PlaceFenceHelper] get place by id %s"
            r24 = r15
            r25 = r0
            r27 = r2
            r28 = r12
            r29 = r5
            r30 = r9
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r10.a((java.util.concurrent.Executor) r14, (defpackage.acvp) r15)
            r15 = 1
            r19 = 0
            goto L_0x0772
        L_0x070b:
            r22 = r2
            java.lang.Object r2 = r9.b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r10 = "extraPlaceChain"
            r11.putExtra(r10, r2)
            boolean r10 = android.text.TextUtils.isEmpty(r2)
            if (r10 != 0) goto L_0x077e
            com.google.android.gms.location.places.NearbyAlertFilter r12 = new com.google.android.gms.location.places.NearbyAlertFilter
            r10 = 0
            r14 = 0
            r12.<init>(r10, r10, r2, r14)
        L_0x0723:
            android.content.Context r2 = r0.a
            int r14 = r0.e
            int r15 = r14 + 1
            r0.e = r15
            r15 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r2, r14, r11, r15)
            r11 = 110(0x6e, float:1.54E-43)
            r14 = 0
            com.google.android.gms.location.places.NearbyAlertRequest r11 = com.google.android.gms.location.places.NearbyAlertRequest.a(r12, r14, r11)
            byz r15 = new byz
            r15.<init>(r2, r14)
            r15.a(r5)
            java.util.HashMap r14 = r0.b
            r14.put(r9, r15)
            android.content.Context r14 = defpackage.cbi.f()
            rir r15 = r0.c
            rhv r14 = defpackage.rij.a(r14, r15)
            acwa r2 = r14.a((com.google.android.gms.location.places.NearbyAlertRequest) r11, (android.app.PendingIntent) r2)
            bwn r11 = defpackage.cbi.k()
            java.lang.String r14 = "PlaceFenceHelper_addPlaceFence"
            bvp r14 = defpackage.bvq.a(r14)
            java.util.concurrent.Executor r11 = r11.a((defpackage.bvp) r14)
            byv r14 = new byv
            r15 = 1
            java.lang.Object[] r10 = new java.lang.Object[r15]
            r19 = 0
            r10[r19] = r12
            java.lang.String r12 = "[PlaceFenceHelper] addPlaceFence for NearbyAlert %s"
            r14.<init>(r0, r12, r10, r9)
            r2.a((java.util.concurrent.Executor) r11, (defpackage.acvp) r14)
        L_0x0772:
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r2[r19] = r5
            int r8 = r8 + 1
            r2 = r22
            r10 = 8
            goto L_0x0657
        L_0x077e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "NearbyAlertFilters must contain a non empty chain name to match results with."
            r0.<init>(r1)
            throw r0
        L_0x0786:
            r22 = r2
            r10 = 8
            goto L_0x063c
        L_0x078c:
            r22 = r2
            r10 = 8
            goto L_0x063c
        L_0x0792:
            r32 = r0
            r23 = r5
            r33 = r9
            r34 = r10
        L_0x079a:
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            r2[r0] = r11
        L_0x07a0:
            r10 = r34
            bwa r0 = r10.b
            int r0 = r0.b
            boolean r0 = defpackage.bwb.a(r0)
            r9 = r33 | r0
            int r8 = r13 + 1
            r6 = r35
            r2 = r20
            r7 = r21
            r5 = r23
            r0 = r32
            goto L_0x02f6
        L_0x07ba:
            r32 = r0
            r23 = r5
            r33 = r9
            r0 = r16 | r33
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            if (r0 != 0) goto L_0x07c9
            r2 = 0
            goto L_0x07ca
        L_0x07c9:
            r2 = 1
        L_0x07ca:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4 = 0
            r3[r4] = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r9 = r32
            java.util.ArrayList r4 = r9.a
            int r5 = r4.size()
            r6 = 0
        L_0x07e5:
            if (r6 >= r5) goto L_0x081e
            java.lang.Object r7 = r4.get(r6)
            com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation r7 = (com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation) r7
            int r8 = r7.a
            r9 = 6
            if (r8 == r9) goto L_0x080e
            r9 = 7
            if (r8 == r9) goto L_0x0800
            r7 = 1
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r8 = 0
            r9[r8] = r7
            goto L_0x081b
        L_0x0800:
            bya r7 = defpackage.bya.a(r7)
            r2.remove(r7)
            r3.remove(r7)
            r3.add(r7)
            goto L_0x081b
        L_0x080e:
            bya r7 = defpackage.bya.a(r7)
            r3.remove(r7)
            r2.remove(r7)
            r2.add(r7)
        L_0x081b:
            int r6 = r6 + 1
            goto L_0x07e5
        L_0x081e:
            r4 = 2
            boolean r5 = defpackage.bxk.a(r4)
            if (r5 == 0) goto L_0x0854
            java.util.Iterator r4 = r2.iterator()
        L_0x082a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x083d
            java.lang.Object r5 = r4.next()
            bya r5 = (defpackage.bya) r5
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r6 = 0
            r7[r6] = r5
            goto L_0x082a
        L_0x083d:
            java.util.Iterator r4 = r3.iterator()
        L_0x0841:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0854
            java.lang.Object r5 = r4.next()
            bya r5 = (defpackage.bya) r5
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r6 = 0
            r7[r6] = r5
            goto L_0x0841
        L_0x0854:
            int r4 = r2.size()
            if (r4 > 0) goto L_0x0863
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x0861
            goto L_0x0863
        L_0x0861:
            r8 = 0
            goto L_0x0868
        L_0x0863:
            byb r8 = new byb
            r8.<init>(r2, r3)
        L_0x0868:
            if (r8 == 0) goto L_0x0a69
            java.util.Set r2 = r8.a
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x0871:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0a0e
            java.lang.Object r4 = r2.next()
            bya r4 = (defpackage.bya) r4
            java.lang.String r5 = r4.a
            r6 = r23
            java.lang.String r5 = defpackage.bzm.a((com.google.android.gms.contextmanager.internal.ContextManagerClientInfo) r6, (java.lang.String) r5)
            byg r7 = r1.b
            bzm r7 = r7.b((java.lang.String) r5)
            byg r9 = r1.b
            bwc r9 = r9.a((java.lang.String) r5)
            if (r7 != 0) goto L_0x08a3
            r20 = r0
            r36 = r2
            r23 = r3
            r22 = r5
            r16 = r8
            r0 = 1
            r3 = 0
            r4 = 6
            r7 = 2
            goto L_0x09fd
        L_0x08a3:
            if (r9 == 0) goto L_0x09ef
            bzk r9 = r7.b
            long r10 = r4.b
            long r12 = r4.c
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r9.a((java.util.Set) r4)
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            long r14 = defpackage.awuz.w()
            long r12 = java.lang.Math.min(r12, r14)
            jiq r14 = defpackage.cbi.i()
            long r14 = r14.a()
            java.util.Iterator r4 = r4.iterator()
        L_0x08cc:
            boolean r16 = r4.hasNext()
            if (r16 == 0) goto L_0x0979
            java.lang.Object r16 = r4.next()
            java.lang.Integer r16 = (java.lang.Integer) r16
            int r16 = r16.intValue()
            r36 = r2
            caq r2 = new caq
            java.util.UUID r20 = java.util.UUID.randomUUID()
            r21 = r4
            java.lang.String r4 = r20.toString()
            r20 = r0
            atjv r0 = defpackage.jtj.b(r16)
            r16 = r8
            cbb r8 = new cbb
            atkh r22 = defpackage.atkh.d
            r23 = r3
            aucd r3 = r22.o()
            r22 = r5
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x0903
            goto L_0x0909
        L_0x0903:
            r3.c()
            r5 = 0
            r3.c = r5
        L_0x0909:
            aucj r5 = r3.b
            atkh r5 = (defpackage.atkh) r5
            r24 = r1
            r1 = 1
            r5.b = r1
            r25 = r7
            int r7 = r5.a
            r7 = r7 | r1
            r5.a = r7
            r1 = 2
            r7 = r7 | r1
            r5.a = r7
            r5.c = r12
            aucj r1 = r3.i()
            atkh r1 = (defpackage.atkh) r1
            r8.<init>(r1)
            r2.<init>(r4, r0, r8, r6)
            cbc r0 = new cbc
            atkm r1 = defpackage.atkm.j
            aucd r1 = r1.o()
            boolean r3 = r1.c
            if (r3 != 0) goto L_0x0938
            goto L_0x093e
        L_0x0938:
            r1.c()
            r3 = 0
            r1.c = r3
        L_0x093e:
            aucj r3 = r1.b
            atkm r3 = (defpackage.atkm) r3
            r4 = 6
            r3.b = r4
            int r5 = r3.a
            r7 = 1
            r5 = r5 | r7
            r3.a = r5
            r5 = r5 | 64
            r3.a = r5
            r3.h = r10
            aucj r1 = r1.i()
            atkm r1 = (defpackage.atkm) r1
            r0.<init>(r1)
            r2.a((defpackage.cbc) r0)
            cas r0 = r2.a()
            r0.a((long) r14)
            r9.add(r0)
            r2 = r36
            r8 = r16
            r0 = r20
            r4 = r21
            r5 = r22
            r3 = r23
            r1 = r24
            r7 = r25
            goto L_0x08cc
        L_0x0979:
            r20 = r0
            r24 = r1
            r36 = r2
            r23 = r3
            r22 = r5
            r25 = r7
            r16 = r8
            r4 = 6
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0990
            r8 = r9
            goto L_0x0991
        L_0x0990:
            r8 = 0
        L_0x0991:
            if (r8 != 0) goto L_0x0997
            r1 = r24
            r7 = 2
            goto L_0x09e8
        L_0x0997:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x09e5
            java.util.Set r0 = r25.a()
            r1 = r24
            byg r2 = r1.b
            r2.a((java.util.Set) r0)
            java.util.Iterator r0 = r8.iterator()
        L_0x09ac:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x09db
            java.lang.Object r2 = r0.next()
            cas r2 = (defpackage.cas) r2
            r3 = r25
            clg r5 = r3.i
            atjv r7 = r2.b()
            int r7 = r7.bA
            int r5 = r5.a(r7, r2)
            r7 = 2
            if (r5 != r7) goto L_0x09d8
            android.util.SparseBooleanArray r5 = r3.j
            atjv r2 = r2.b()
            int r2 = r2.bA
            r8 = 0
            r5.put(r2, r8)
            r25 = r3
            goto L_0x09ac
        L_0x09d8:
            r25 = r3
            goto L_0x09ac
        L_0x09db:
            r3 = r25
            r7 = 2
            byg r0 = r1.b
            r0.a((defpackage.bzm) r3)
            r3 = 1
            goto L_0x0a02
        L_0x09e5:
            r1 = r24
            r7 = 2
        L_0x09e8:
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            r2[r3] = r22
            goto L_0x0a02
        L_0x09ef:
            r20 = r0
            r36 = r2
            r23 = r3
            r22 = r5
            r16 = r8
            r0 = 1
            r3 = 0
            r4 = 6
            r7 = 2
        L_0x09fd:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r3] = r22
            r3 = 0
        L_0x0a02:
            r3 = r23 | r3
            r2 = r36
            r23 = r6
            r8 = r16
            r0 = r20
            goto L_0x0871
        L_0x0a0e:
            r20 = r0
            r16 = r8
            r6 = r23
            r23 = r3
            java.util.Set r0 = r8.b
            java.util.Iterator r0 = r0.iterator()
        L_0x0a1c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0a64
            java.lang.Object r2 = r0.next()
            bya r2 = (defpackage.bya) r2
            java.lang.String r2 = r2.a
            java.lang.String r2 = defpackage.bzm.a((com.google.android.gms.contextmanager.internal.ContextManagerClientInfo) r6, (java.lang.String) r2)
            byg r4 = r1.b
            bzm r4 = r4.b((java.lang.String) r2)
            if (r4 != 0) goto L_0x0a3f
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r4 = 0
            r5[r4] = r2
            r4 = 1
            r11 = 0
            goto L_0x0a62
        L_0x0a3f:
            java.util.Set r4 = r4.a()
            if (r4 != 0) goto L_0x0a46
            goto L_0x0a5b
        L_0x0a46:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0a5b
            byg r2 = r1.b
            r2.a((java.util.Set) r4)
            cap r2 = defpackage.cbi.r()
            r2.b((java.util.Collection) r4)
            r4 = 1
            r11 = 1
            goto L_0x0a62
        L_0x0a5b:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r7 = 0
            r5[r7] = r2
            r11 = 0
        L_0x0a62:
            r3 = r3 | r11
            goto L_0x0a1c
        L_0x0a64:
            r4 = 1
            if (r3 == 0) goto L_0x0a6b
            r10 = 1
            goto L_0x0a6c
        L_0x0a69:
            r20 = r0
        L_0x0a6b:
            r10 = 0
        L_0x0a6c:
            r0 = r20 | r10
            if (r0 != 0) goto L_0x0a71
            goto L_0x0a76
        L_0x0a71:
            byg r0 = r1.b
            r0.c()
        L_0x0a76:
            bww r0 = r1.c
            java.lang.String r1 = "Fence scheduler operation."
            bvp r1 = defpackage.bvq.a(r1)
            r0.a((defpackage.bvp) r1)
        L_0x0a81:
            r1 = 0
            r0 = r35
            r0.a((int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxh.a(java.util.Set):void");
    }
}
