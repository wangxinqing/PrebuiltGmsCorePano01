package defpackage;

import android.accounts.Account;
import android.util.SparseArray;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: cjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cjd extends cbe implements cao, grc {
    public final cjr a;
    public final ciq b;
    private final cla c;
    private final HashMap d;
    private final cjc e;

    public cjd() {
        cjc cjc;
        cjr cjr = new cjr();
        if (awvc.a.a().a()) {
            cjc = new cjc();
        } else {
            cjc = null;
        }
        this.e = cjc;
        this.c = new cla();
        this.a = cjr;
        this.b = new ciq();
        this.d = new HashMap();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0142, code lost:
        if (r3 < defpackage.awuz.a.C().al()) goto L_0x0158;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0278 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0259  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(java.util.List r29, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r30, defpackage.cjs r31, boolean r32) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r5 = "a"
            java.lang.String r7 = "cjd"
            if (r1 != 0) goto L_0x0014
            r10 = r4
            r3 = r7
            goto L_0x032d
        L_0x0014:
            boolean r8 = r29.isEmpty()
            if (r8 != 0) goto L_0x032b
            bte r8 = defpackage.cbi.x()
            r9 = 7503(0x1d4f, float:1.0514E-41)
            r10 = 1
            if (r32 == 0) goto L_0x0049
            defpackage.iva.a((java.lang.Object) r29)
            bsz r11 = r30.a()
            btd r11 = r8.a(r11)
            java.util.Iterator r12 = r29.iterator()
        L_0x0032:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0049
            java.lang.Object r13 = r12.next()
            com.google.android.gms.contextmanager.ContextData r13 = (com.google.android.gms.contextmanager.ContextData) r13
            int r13 = r13.g()
            int r13 = r11.a(r10, r13, r2)
            if (r13 == r10) goto L_0x0032
            return r9
        L_0x0049:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            clj r13 = defpackage.cbi.C()
            java.util.Iterator r14 = r29.iterator()
            r15 = 0
            r16 = 0
        L_0x005e:
            boolean r17 = r14.hasNext()
            r18 = 13
            if (r17 == 0) goto L_0x01a5
            java.lang.Object r17 = r14.next()
            r9 = r17
            com.google.android.gms.contextmanager.ContextData r9 = (com.google.android.gms.contextmanager.ContextData) r9
            if (r32 == 0) goto L_0x009e
            int r10 = r9.g()
            bsz r6 = r30.a()
            btd r6 = r8.a(r6)
            r19 = r14
            r14 = 2
            int r6 = r6.a(r14, r10, r2)
            r10 = 1
            if (r6 == r10) goto L_0x00a0
            int r6 = r9.g()
            bsz r14 = r30.a()
            btd r14 = r8.a(r14)
            int r6 = r14.a(r10, r6, r2)
            if (r6 != r10) goto L_0x009b
            r6 = -7500(0xffffffffffffe2b4, float:NaN)
            goto L_0x00a1
        L_0x009b:
            r6 = 7503(0x1d4f, float:1.0514E-41)
            goto L_0x00a1
        L_0x009e:
            r19 = r14
        L_0x00a0:
            r6 = 0
        L_0x00a1:
            atjv r10 = r9.h()
            r14 = -7500(0xffffffffffffe2b4, float:NaN)
            if (r6 == r14) goto L_0x0180
            if (r6 == 0) goto L_0x00ba
            r14 = 7503(0x1d4f, float:1.0514E-41)
            if (r6 == r14) goto L_0x00b4
            r1 = 3
            r13.a((com.google.android.gms.contextmanager.internal.ContextManagerClientInfo) r2, (defpackage.atjv) r10, (int) r1)
            return r18
        L_0x00b4:
            r1 = 2
            r13.a((com.google.android.gms.contextmanager.internal.ContextManagerClientInfo) r2, (defpackage.atjv) r10, (int) r1)
            return r14
        L_0x00ba:
            r14 = 7503(0x1d4f, float:1.0514E-41)
            cjc r6 = r0.e
            if (r6 != 0) goto L_0x00c9
            r25 = r4
            r20 = r7
            r17 = r8
            r4 = 0
            goto L_0x0173
        L_0x00c9:
            bsz r14 = r30.a()
            r17 = r8
            int r8 = r9.g()
            r20 = r7
            r7 = 1
            if (r8 != r7) goto L_0x0170
            auci r7 = defpackage.atus.j
            java.lang.Object r7 = r9.a((defpackage.aubq) r7)
            atus r7 = (defpackage.atus) r7
            if (r7 == 0) goto L_0x0156
            java.util.Map r8 = r6.a
            java.lang.Object r8 = r8.get(r14)
            android.util.Pair r8 = (android.util.Pair) r8
            jut r18 = r9.j()
            long r21 = r18.c()
            if (r8 == 0) goto L_0x0145
            java.lang.Object r1 = r8.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r23 = r1.longValue()
            long r23 = r21 - r23
            java.lang.Object r1 = r8.second
            atus r1 = (defpackage.atus) r1
            int r1 = r1.b
            java.lang.Object r8 = r8.second
            atus r8 = (defpackage.atus) r8
            int r8 = r8.c
            int r3 = r7.b
            r25 = r4
            int r4 = r7.c
            double r3 = defpackage.aell.a((int) r1, (int) r8, (int) r3, (int) r4)
            long r3 = (long) r3
            r1 = 2
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.Long r1 = java.lang.Long.valueOf(r23)
            r18 = 0
            r8[r18] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r18 = 1
            r8[r18] = r1
            awuz r1 = defpackage.awuz.a
            awva r1 = r1.a()
            long r26 = r1.am()
            int r1 = (r23 > r26 ? 1 : (r23 == r26 ? 0 : -1))
            if (r1 >= 0) goto L_0x0147
            awuz r1 = defpackage.awuz.a
            awva r1 = r1.a()
            long r23 = r1.al()
            int r1 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r1 >= 0) goto L_0x0147
            goto L_0x0158
        L_0x0145:
            r25 = r4
        L_0x0147:
            java.util.Map r1 = r6.a
            java.lang.Long r3 = java.lang.Long.valueOf(r21)
            android.util.Pair r3 = android.util.Pair.create(r3, r7)
            r1.put(r14, r3)
            r4 = 0
            goto L_0x0173
        L_0x0156:
            r25 = r4
        L_0x0158:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r3 = r9.g()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r1[r4] = r3
            bsz r3 = r30.a()
            java.lang.String r3 = r3.b
            r6 = 1
            r1[r6] = r3
            goto L_0x0186
        L_0x0170:
            r25 = r4
            r4 = 0
        L_0x0173:
            cij r1 = new cij
            r1.<init>(r9, r4)
            r11.add(r1)
            r13.a((com.google.android.gms.contextmanager.internal.ContextManagerClientInfo) r2, (defpackage.atjv) r10, (int) r4)
            r15 = 1
            goto L_0x0194
        L_0x0180:
            r25 = r4
            r20 = r7
            r17 = r8
        L_0x0186:
            cij r1 = new cij
            r3 = 1
            r1.<init>(r9, r3)
            r12.add(r1)
            r13.a((com.google.android.gms.contextmanager.internal.ContextManagerClientInfo) r2, (defpackage.atjv) r10, (int) r3)
            r16 = 1
        L_0x0194:
            r1 = r29
            r3 = r31
            r8 = r17
            r14 = r19
            r7 = r20
            r4 = r25
            r9 = 7503(0x1d4f, float:1.0514E-41)
            r10 = 1
            goto L_0x005e
        L_0x01a5:
            r25 = r4
            r20 = r7
            r14 = -7500(0xffffffffffffe2b4, float:NaN)
            if (r15 == 0) goto L_0x01b4
            if (r16 == 0) goto L_0x01b4
            r1 = -7501(0xffffffffffffe2b3, float:NaN)
            r6 = -7501(0xffffffffffffe2b3, float:NaN)
            goto L_0x01bc
        L_0x01b4:
            if (r15 == 0) goto L_0x01b8
            r6 = 0
            goto L_0x01bc
        L_0x01b8:
            if (r16 == 0) goto L_0x0311
            r6 = -7500(0xffffffffffffe2b4, float:NaN)
        L_0x01bc:
            int r1 = r11.size()
            r3 = 0
        L_0x01c1:
            if (r3 >= r1) goto L_0x027b
            java.lang.Object r4 = r11.get(r3)
            cij r4 = (defpackage.cij) r4
            cjr r7 = r0.a
            com.google.android.gms.contextmanager.ContextData r8 = r4.a
            bsz r9 = r30.a()
            r10 = 1
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r10 = 0
            r13[r10] = r8
            java.util.HashMap r10 = r7.a
            java.util.List r10 = defpackage.cjr.a((defpackage.bsz) r9, (java.util.HashMap) r10)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r10.add(r8)
            java.util.HashMap r8 = r7.a
            java.lang.Object r8 = r8.get(r9)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x0211
            java.util.Iterator r8 = r8.iterator()
        L_0x01f0:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0211
            java.lang.Object r10 = r8.next()
            com.google.android.gms.contextmanager.ContextData r10 = (com.google.android.gms.contextmanager.ContextData) r10
            java.util.Set r15 = defpackage.cjr.b
            int r10 = r10.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r10 = r15.contains(r10)
            if (r10 == 0) goto L_0x01f0
            boolean r7 = r7.a(r9)
            goto L_0x022c
        L_0x0211:
            java.util.HashMap r8 = r7.a
            java.util.List r8 = defpackage.cjr.a((defpackage.bsz) r9, (java.util.HashMap) r8)
            int r8 = r8.size()
            awuz r10 = defpackage.awuz.a
            awva r10 = r10.a()
            long r13 = r10.r()
            int r10 = (int) r13
            if (r8 < r10) goto L_0x024f
            boolean r7 = r7.a(r9)
        L_0x022c:
            if (r7 != 0) goto L_0x024a
            jjg r7 = defpackage.bxk.a
            anie r7 = r7.b()
            anih r7 = (defpackage.anih) r7
            r8 = 83
            java.lang.String r9 = "cjr"
            r10 = r25
            anie r7 = r7.a((java.lang.String) r9, (java.lang.String) r5, (int) r8, (java.lang.String) r10)
            anih r7 = (defpackage.anih) r7
            java.lang.String r8 = "[StoreReadWrite] Cache flush failed when writing to database in insert."
            r7.a((java.lang.String) r8)
            r7 = -1
            goto L_0x0253
        L_0x024a:
            r10 = r25
            r7 = 1
            goto L_0x0253
        L_0x024f:
            r10 = r25
            r7 = 1
        L_0x0253:
            r13 = 1
            int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x0278
            com.google.android.gms.contextmanager.ContextData r4 = r4.a
            java.lang.String r4 = r4.d()
            r7 = r31
            java.util.ArrayList r8 = r7.a
            if (r8 == 0) goto L_0x0266
            goto L_0x026d
        L_0x0266:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.a = r8
        L_0x026d:
            java.util.ArrayList r8 = r7.a
            r8.add(r4)
            int r3 = r3 + 1
            r25 = r10
            goto L_0x01c1
        L_0x0278:
            r1 = 7505(0x1d51, float:1.0517E-41)
            return r1
        L_0x027b:
            r11.addAll(r12)
            ciq r1 = r0.b
            bsz r3 = r30.a()
            r1.a((defpackage.bsz) r3, (java.util.List) r11)
            bsz r1 = r30.a()
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x0298
            ciq r1 = r0.b
            bsz r3 = defpackage.bsz.a
            r1.a((defpackage.bsz) r3, (java.util.List) r11)
        L_0x0298:
            boolean r1 = defpackage.awvp.b()
            if (r1 == 0) goto L_0x0304
            bsz r1 = r30.a()
            int r3 = r11.size()
            r4 = 0
        L_0x02a7:
            if (r4 >= r3) goto L_0x0304
            java.lang.Object r5 = r11.get(r4)
            cij r5 = (defpackage.cij) r5
            com.google.android.gms.contextmanager.ContextData r5 = r5.a
            int r7 = r5.g()
            boolean r7 = defpackage.bta.d(r7)
            if (r7 == 0) goto L_0x0300
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            int r7 = r5.g()
            java.lang.String r7 = java.lang.Integer.toString(r7)
            r9 = 0
            r8[r9] = r7
            java.lang.String r7 = r5.d()
            java.lang.String r8 = "ContextManagerStore"
            com.google.android.gms.awareness.fence.AwarenessFence r7 = defpackage.cfd.a((java.lang.String) r7, (java.lang.String) r8, (defpackage.bsz) r1)
            if (r7 != 0) goto L_0x02df
            r8 = 1
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r5 = r5.d()
            r7[r9] = r5
            goto L_0x0301
        L_0x02df:
            r8 = 1
            int r9 = r5.g()
            r0.a((defpackage.bsz) r1, (com.google.android.gms.awareness.fence.AwarenessFence) r7, (int) r9)
            boolean r9 = r1.b()
            if (r9 != 0) goto L_0x0301
            java.lang.String r9 = r5.d()
            bsz r10 = defpackage.bsz.a
            defpackage.cfd.a((com.google.android.gms.awareness.fence.AwarenessFence) r7, (java.lang.String) r9, (defpackage.bsz) r10)
            bsz r9 = defpackage.bsz.a
            int r5 = r5.g()
            r0.a((defpackage.bsz) r9, (com.google.android.gms.awareness.fence.AwarenessFence) r7, (int) r5)
            goto L_0x0301
        L_0x0300:
            r8 = 1
        L_0x0301:
            int r4 = r4 + 1
            goto L_0x02a7
        L_0x0304:
            cla r1 = r0.c
            ciz r3 = new ciz
            r4 = r29
            r3.<init>(r4, r2)
            r1.a((defpackage.cky) r3)
            return r6
        L_0x0311:
            r10 = r25
            jjg r1 = defpackage.bxk.a
            anie r1 = r1.b()
            anih r1 = (defpackage.anih) r1
            r2 = 464(0x1d0, float:6.5E-43)
            r3 = r20
            anie r1 = r1.a((java.lang.String) r3, (java.lang.String) r5, (int) r2, (java.lang.String) r10)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "[ContextManagerStore] This should never happen in insertBatchContextData"
            r1.a((java.lang.String) r2)
            return r18
        L_0x032b:
            r10 = r4
            r3 = r7
        L_0x032d:
            jjg r1 = defpackage.bxk.a
            anie r1 = r1.c()
            anih r1 = (defpackage.anih) r1
            r2 = 384(0x180, float:5.38E-43)
            anie r1 = r1.a((java.lang.String) r3, (java.lang.String) r5, (int) r2, (java.lang.String) r10)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "[ContextManagerStore] Called insertBatch without any data to write."
            r1.a((java.lang.String) r2)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjd.a(java.util.List, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo, cjs, boolean):int");
    }

    public final void a(bsz bsz, cas cas) {
    }

    public final void a(bsz bsz, cas cas, cas cas2) {
    }

    public final int b(ContextDataFilterImpl contextDataFilterImpl, ContextManagerClientInfo contextManagerClientInfo) {
        this.b.a(contextManagerClientInfo.a(), contextDataFilterImpl, false);
        return this.a.a(contextDataFilterImpl, contextManagerClientInfo.a());
    }

    public final void b(bsz bsz, atjv atjv) {
        this.b.a(bsz, atjv).a(false);
    }

    private final void a(bsz bsz, AwarenessFence awarenessFence, int i) {
        String str = bsz.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append("CM_Store_");
        sb.append(str);
        sb.append("_");
        sb.append(i);
        String sb2 = sb.toString();
        this.d.put(sb2, new ciy(bsz, i));
        grd grd = new grd();
        grd.a(sb2, awarenessFence, this);
        gra.a(cbi.f(), grb.b("ContextManagerStore", (Account) null)).a(grd.a()).a((acvp) new cix("[ContextManagerStore] add fence", new Object[0]));
    }

    public final int a(int i, long j, ContextManagerClientInfo contextManagerClientInfo) {
        juu juu = new juu();
        juu.a(2);
        juu.a(j);
        TimeFilterImpl a2 = juu.a();
        jtm jtm = new jtm();
        jtm.a(i, a2);
        ArrayList b2 = this.a.b((ContextDataFilterImpl) jtm.a(), contextManagerClientInfo.a());
        if (!b2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ContextData contextData = (ContextData) b2.get(i2);
                jti jti = new jti(contextData);
                jti.a(jut.a(contextData.j().c()));
                arrayList.add(jti.a());
            }
            cjs cjs = new cjs();
            if (!arrayList.isEmpty()) {
                return a((List) arrayList, contextManagerClientInfo, cjs, false);
            }
        }
        return 0;
    }

    public final int a(WriteBatchImpl writeBatchImpl, ContextManagerClientInfo contextManagerClientInfo) {
        cjs cjs = new cjs();
        ArrayList arrayList = writeBatchImpl.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        int a2 = a((List) arrayList, contextManagerClientInfo, cjs, true);
        if (ibt.c(a2)) {
            return a2;
        }
        ArrayList arrayList2 = cjs.a;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = cjs.a;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                this.a.a((String) arrayList3.get(i), contextManagerClientInfo.a());
            }
        }
        return a2;
    }

    public final cjb a(ContextDataFilterImpl contextDataFilterImpl, ContextManagerClientInfo contextManagerClientInfo) {
        if (!cbi.x().a(3, contextDataFilterImpl.d(), contextManagerClientInfo, false)) {
            return new cjb(7503, (ArrayList) null);
        }
        ArrayList b2 = this.a.b(contextDataFilterImpl, contextManagerClientInfo.a());
        this.b.a(b2, contextManagerClientInfo.a(), contextDataFilterImpl, true, Long.MAX_VALUE);
        return new cjb(0, b2);
    }

    public final cjb a(ContextDataFilterImpl contextDataFilterImpl, ContextManagerClientInfo contextManagerClientInfo, long j) {
        if (!cbi.x().a((Collection) contextDataFilterImpl.d(), contextManagerClientInfo)) {
            return new cjb(7503, (ArrayList) null);
        }
        ciq ciq = this.b;
        bsz a2 = contextManagerClientInfo.a();
        ArrayList arrayList = new ArrayList();
        ciq.a(arrayList, a2, contextDataFilterImpl, false, j);
        HashSet<Integer> hashSet = new HashSet<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(Integer.valueOf(((ContextData) arrayList.get(i)).g()));
        }
        HashSet<Integer> d2 = contextDataFilterImpl.d();
        d2.removeAll(hashSet);
        for (Integer intValue : hashSet) {
            cbi.F().a(jtj.b(intValue.intValue()), 10);
        }
        for (Integer intValue2 : d2) {
            cbi.F().a(jtj.b(intValue2.intValue()), 9);
        }
        return new cjb(0, arrayList);
    }

    public final void a(bsz bsz, atjv atjv) {
        this.b.a(bsz, atjv).a(true);
    }

    public final void a(cja cja, but but) {
        this.c.a(cja, but);
    }

    public final void a(FenceState fenceState) {
        boolean z;
        boolean z2;
        cih cih;
        if (this.d.containsKey(fenceState.b())) {
            ciy ciy = (ciy) this.d.get(fenceState.b());
            Object[] objArr = {ciy.a, Integer.toString(ciy.b)};
            if (fenceState.a() != 2) {
                z = true;
            } else {
                z = false;
            }
            ciq ciq = this.b;
            bsz bsz = ciy.a;
            int i = ciy.b;
            SparseArray sparseArray = (SparseArray) ciq.a.get(bsz);
            if (sparseArray == null || (cih = (cih) sparseArray.get(i)) == null) {
                z2 = false;
            } else {
                z2 = cih.b(z);
            }
            Object[] objArr2 = {Boolean.valueOf(z2), Boolean.valueOf(z)};
            if (!z2 || !z) {
                this.d.remove(fenceState.b());
            } else {
                return;
            }
        }
        ((anih) ((anih) bxk.a.b()).a("cjd", "a", 147, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextManagerStore] Callback for unexpected key %s, or context is stale", (Object) fenceState.b());
        grd grd = new grd();
        grd.a(fenceState.b());
        gra.a(cbi.f(), grb.b("ContextManagerStore", (Account) null)).a(grd.a()).a((acvp) new bva("[ContextManagerStore] remove unexpected fence", new Object[0]));
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Collection r9, int r10, long r11, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r13) {
        /*
            r8 = this;
            cjr r0 = r8.a
            bsz r7 = r13.a()
            boolean r13 = r9.isEmpty()
            if (r13 == 0) goto L_0x002c
            jjg r9 = defpackage.bxk.a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            r11 = 275(0x113, float:3.85E-43)
            java.lang.String r12 = "cjr"
            java.lang.String r13 = "a"
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r9 = r9.a((java.lang.String) r12, (java.lang.String) r13, (int) r11, (java.lang.String) r0)
            anih r9 = (defpackage.anih) r9
            java.lang.String r10 = java.lang.Integer.toString(r10)
            java.lang.String r11 = "[StoreReadWrite] Empty context data batch to update syncState to %s"
            r9.a((java.lang.String) r11, (java.lang.Object) r10)
            return
        L_0x002c:
            int r13 = r9.size()
            java.lang.String[] r3 = new java.lang.String[r13]
            int r13 = r9.size()
            r1 = 0
            r2 = 0
        L_0x0038:
            if (r1 >= r13) goto L_0x004c
            int r4 = r2 + 1
            java.lang.Object r5 = r9.get(r1)
            com.google.android.gms.contextmanager.ContextData r5 = (com.google.android.gms.contextmanager.ContextData) r5
            java.lang.String r5 = r5.d()
            r3[r2] = r5
            int r1 = r1 + 1
            r2 = r4
            goto L_0x0038
        L_0x004c:
            java.lang.String r1 = "context"
            java.lang.String r2 = "context_id"
            r4 = r10
            r5 = r11
            r0.a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String[]) r3, (int) r4, (long) r5, (defpackage.bsz) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjd.a(java.util.Collection, int, long, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo):void");
    }
}
