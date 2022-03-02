package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.google.android.contextmanager.fence.PlaceFenceHelper;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: byd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class byd implements byf, ckq {
    public final Context a;
    public final byg b;
    public final bww c = new bww();
    public boolean d = awuz.m();
    public final PlaceFenceHelper e;
    protected boolean f = false;
    private final PendingIntent g;

    public byd(Context context) {
        this.a = context;
        this.b = new byg(context, this, cbi.k());
        Intent intent = new Intent("com.google.android.awareness.geofence.receiver");
        intent.setPackage("com.google.android.gms");
        this.g = PendingIntent.getBroadcast(context, 1, intent, 0);
        cbi.A().a(this, cbi.k());
        this.e = new PlaceFenceHelper(context);
    }

    public static ContextManagerClientInfo a(bsz bsz) {
        return cbi.a(bsz, "SERVER_FENCE_MODULE_ID");
    }

    public final SparseArray b() {
        Set<bzk> b2 = this.b.b();
        SparseArray sparseArray = new SparseArray();
        for (bzk t : b2) {
            bxx.a(t.t(), sparseArray);
        }
        return sparseArray;
    }

    public final Set c() {
        return this.b.b();
    }

    public final void d() {
        e();
        this.b.c();
    }

    public final void e() {
        if (!this.f) {
            ren.a(cbi.f()).d(this.g).a((acvp) new bva("[FenceManager] remove all geofences.", new Object[0]));
            this.f = true;
        }
    }

    public final Collection f() {
        ArrayList arrayList = new ArrayList();
        for (bwc bwc : this.b.a()) {
            if (a(bwc.a.a)) {
                arrayList.addAll(bwc.d());
            }
        }
        return arrayList;
    }

    public static final Set a(clg clg) {
        HashSet hashSet = null;
        for (int i = 0; i < clg.size(); i++) {
            for (cas cas : (Set) clg.valueAt(i)) {
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                hashSet.add(Integer.valueOf(cas.b().bA));
            }
        }
        return hashSet;
    }

    public static boolean a(ContextManagerClientInfo contextManagerClientInfo) {
        return contextManagerClientInfo != null && "SERVER_FENCE_MODULE_ID".equals(contextManagerClientInfo.d);
    }

    public final Set a(int i) {
        return (Set) this.b.e.get(i);
    }

    public final void a() {
        boolean m = awuz.m();
        if (this.d != m) {
            new Object[1][0] = Boolean.valueOf(m);
            this.d = m;
            bww bww = this.c;
            byd E = cbi.E();
            if (E.d) {
                for (Integer intValue : bww.c) {
                    int intValue2 = intValue.intValue();
                    new Object[1][0] = Integer.valueOf(intValue2);
                    bww.a(E.a(intValue2));
                }
                bww.c.clear();
            } else {
                for (bzk bzk : E.c()) {
                    new Object[1][0] = bzk;
                    E.a(bzk);
                }
            }
            cbi.k().a((Runnable) bww);
            this.c.a(bvq.a("Fence scheduler operation."));
        }
    }

    public final void a(long j, bzm bzm) {
        cbi.k().a(new bxz(this, bzm), j, bvq.a("EvaluateFences"));
    }

    public final void a(Intent intent) {
        if (!intent.hasExtra("client_info_package_name") || !intent.hasExtra("client_info_account_name") || !intent.hasExtra("client_info_module_id") || !intent.hasExtra("context_fence_key")) {
            ((anih) ((anih) bxk.a.b()).a("byd", "a", 617, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceManager] Server fence state reporting intent is not valid.");
            return;
        }
        String a2 = bzm.a(intent.getStringExtra("client_info_package_name"), intent.getStringExtra("client_info_account_name"), intent.getStringExtra("client_info_module_id"), intent.getStringExtra("context_fence_key"));
        bwc a3 = this.b.a(a2);
        if (a3 != null) {
            bsz g2 = a3.g();
            if (g2 != null) {
                bzm b2 = this.b.b(a2);
                if (b2 != null) {
                    new ckk(g2, b2).a();
                } else {
                    new Object[1][0] = a2;
                }
            } else {
                new Object[1][0] = a2;
            }
        } else {
            new Object[1][0] = a2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r4.isEmpty() == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bwa r13) {
        /*
            r12 = this;
            r12.e()
            bsz r0 = r13.a()
            byg r1 = r12.b
            java.util.HashMap r2 = r1.c
            java.lang.Object r2 = r2.get(r13)
            bwc r2 = (defpackage.bwc) r2
            r3 = 0
            if (r2 == 0) goto L_0x0046
            java.util.Set r2 = r2.c()
            if (r2 == 0) goto L_0x0046
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x0046
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0029:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            amxb r6 = r1.g
            java.util.Set r5 = r6.c((java.lang.Object) r5)
            r4.addAll(r5)
            goto L_0x0029
        L_0x003f:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r4 = r3
        L_0x0047:
            byg r1 = r12.b
            java.util.HashMap r2 = r1.c
            java.lang.Object r2 = r2.remove(r13)
            bwc r2 = (defpackage.bwc) r2
            r5 = 2
            if (r2 == 0) goto L_0x00c2
            java.util.Set r6 = r2.c()
            java.util.Iterator r6 = r6.iterator()
        L_0x005c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0089
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            bzm r8 = r2.b((java.lang.String) r7)
            r1.b((defpackage.bzm) r8)
            r1.c((defpackage.bzm) r8)
            r1.e(r7)
            clj r7 = defpackage.cbi.C()
            jiq r9 = defpackage.cbi.i()
            long r9 = r9.a()
            java.lang.String r8 = r8.a
            r11 = 12
            r7.a((long) r9, (java.lang.String) r8, (int) r11)
            goto L_0x005c
        L_0x0089:
            int r6 = r13.b
            if (r6 != r5) goto L_0x00c2
            byp r1 = r1.d
            android.app.PendingIntent r13 = r13.d
            java.util.HashMap r6 = r1.c
            java.lang.Object r13 = r6.get(r13)
            byl r13 = (defpackage.byl) r13
            if (r13 == 0) goto L_0x00c2
            java.util.Set r6 = r13.b()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x00c2
            java.util.HashSet r6 = new java.util.HashSet
            java.util.Set r13 = r13.b()
            r6.<init>(r13)
            java.util.Iterator r13 = r6.iterator()
        L_0x00b2:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x00c2
            java.lang.Object r6 = r13.next()
            java.lang.String r6 = (java.lang.String) r6
            r1.a((java.lang.String) r6)
            goto L_0x00b2
        L_0x00c2:
            if (r2 == 0) goto L_0x0107
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r1 = 0
            r13[r1] = r0
            r1 = 1
            r13[r1] = r2
            cap r13 = defpackage.cbi.r()
            r13.a((defpackage.bsz) r0, (defpackage.bvt) r2)
            r12.a((java.util.Collection) r3, (java.util.Collection) r4)
            java.util.Set r13 = r2.c()
            java.util.Iterator r13 = r13.iterator()
        L_0x00de:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            bzm r0 = r2.b((java.lang.String) r0)
            clg r0 = r0.i
            if (r0 == 0) goto L_0x00de
            if (r3 != 0) goto L_0x00fa
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3 = r1
        L_0x00fa:
            java.util.Set r0 = a((defpackage.clg) r0)
            if (r0 == 0) goto L_0x00de
            r3.addAll(r0)
            goto L_0x00de
        L_0x0104:
            r12.a((java.util.Set) r3)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byd.a(bwa):void");
    }

    public final void a(bzk bzk) {
        bzm bzm = (bzm) this.b.f.get(bzk);
        if (bzm == null) {
            ((anih) ((anih) bxk.a.c()).a("byg", "a", 356, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceMapping] Did not find registration record for fence");
        } else {
            bzm.a((List) null);
        }
    }

    public final void a(bzm bzm) {
        iva.a((Object) bzm);
        for (Map.Entry entry : this.b.c.entrySet()) {
            if (((bwc) entry.getValue()).d().contains(bzm)) {
                ((bwc) entry.getValue()).a(((bwa) entry.getKey()).a(), (ContextData) null, bzm);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: jtp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v8, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v9, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v10, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v11, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v12, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v13, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: jtp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: jtp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: jtp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: com.google.android.gms.contextmanager.internal.ContextManagerClientInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v45, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0297 A[Catch:{ Exception -> 0x0343 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x029a A[Catch:{ Exception -> 0x0343 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02a7 A[Catch:{ Exception -> 0x0343 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0229 A[Catch:{ Exception -> 0x0343 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Collection r31) {
        /*
            r30 = this;
            r1 = r30
            java.lang.String r2 = "ckt"
            r30.e()
            if (r31 == 0) goto L_0x03f9
            boolean r0 = r31.isEmpty()
            if (r0 != 0) goto L_0x03f9
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r3 = r31.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r0[r4] = r3
            java.util.Iterator r3 = r31.iterator()
        L_0x0021:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03e9
            java.lang.Object r0 = r3.next()
            r5 = r0
            byl r5 = (defpackage.byl) r5
            java.lang.String r6 = "byd"
            java.util.Collection r0 = r5.a()
            java.lang.String r7 = "[FenceManager] Could not find package: %s"
            java.lang.String r8 = "a"
            java.lang.String r9 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r10 = -1
            if (r0 == 0) goto L_0x00ff
            java.util.Collection r0 = r5.a()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00ff
            java.util.Collection r0 = r5.a()
            java.util.Iterator r0 = r0.iterator()
        L_0x004f:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00fc
            java.lang.Object r11 = r0.next()
            jyg r11 = (defpackage.jyg) r11
            android.content.Context r12 = r1.a
            java.lang.String r13 = r11.c
            int r12 = defpackage.jhg.i(r12, r13)
            boolean r13 = r11.i
            if (r13 == 0) goto L_0x006e
            int r13 = android.os.Process.myPid()
            r21 = r13
            goto L_0x0070
        L_0x006e:
            r21 = -1
        L_0x0070:
            if (r12 != r10) goto L_0x008c
            jjg r12 = defpackage.bxk.a
            anie r12 = r12.c()
            anih r12 = (defpackage.anih) r12
            r13 = 491(0x1eb, float:6.88E-43)
            anie r12 = r12.a((java.lang.String) r6, (java.lang.String) r8, (int) r13, (java.lang.String) r9)
            anih r12 = (defpackage.anih) r12
            java.lang.String r11 = r11.c
            aqcr r11 = defpackage.aqcr.a(r11)
            r12.a((java.lang.String) r7, (java.lang.Object) r11)
            goto L_0x004f
        L_0x008c:
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r13 = new com.google.android.gms.contextmanager.internal.ContextManagerClientInfo
            java.lang.String r15 = r11.d
            java.lang.String r14 = r11.c
            java.lang.String r4 = r11.e
            r19 = 0
            r20 = -1
            r16 = r14
            r14 = r13
            r17 = r12
            r18 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            boolean r4 = a((com.google.android.gms.contextmanager.internal.ContextManagerClientInfo) r13)
            if (r4 == 0) goto L_0x00ab
            long r14 = r11.h
            goto L_0x00ad
        L_0x00ab:
            r14 = 0
        L_0x00ad:
            grd r4 = new grd
            r4.<init>()
            java.lang.String r12 = r11.f
            com.google.android.gms.contextmanager.fence.internal.ContextFenceStub r10 = new com.google.android.gms.contextmanager.fence.internal.ContextFenceStub
            r16 = r0
            atjt r0 = r11.g
            if (r0 != 0) goto L_0x00be
            atjt r0 = defpackage.atjt.z
        L_0x00be:
            r10.<init>((defpackage.atjt) r0)
            android.app.PendingIntent r0 = r5.a
            defpackage.iva.c(r12)
            defpackage.iva.a((java.lang.Object) r10)
            defpackage.iva.a((java.lang.Object) r0)
            r17 = r3
            java.util.ArrayList r3 = r4.a
            com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation r0 = com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation.a(r12, r14, r10, r0)
            r3.add(r0)
            com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl r0 = r4.a()
            bxh r3 = new bxh
            byc r4 = new byc
            java.lang.String r10 = r13.b
            r4.<init>(r10)
            r3.<init>(r4, r13, r0)
            android.content.Context r0 = r1.a
            java.lang.String r4 = r11.c
            java.lang.String r10 = "UpdateFenceRegistration"
            bvp r0 = defpackage.bvq.a(r10, r0, r4)
            r3.a((defpackage.bvp) r0)
            r0 = r16
            r3 = r17
            r4 = 0
            r10 = -1
            goto L_0x004f
        L_0x00fc:
            r17 = r3
            goto L_0x0101
        L_0x00ff:
            r17 = r3
        L_0x0101:
            jyh r3 = r5.d
            if (r3 == 0) goto L_0x03e2
            android.content.Context r0 = r1.a
            java.lang.String r4 = r3.c
            int r0 = defpackage.jhg.i(r0, r4)
            boolean r4 = r3.g
            if (r4 == 0) goto L_0x0118
            int r4 = android.os.Process.myPid()
            r29 = r4
            goto L_0x011a
        L_0x0118:
            r29 = -1
        L_0x011a:
            r4 = -1
            if (r0 != r4) goto L_0x0137
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r4 = 529(0x211, float:7.41E-43)
            anie r0 = r0.a((java.lang.String) r6, (java.lang.String) r8, (int) r4, (java.lang.String) r9)
            anih r0 = (defpackage.anih) r0
            java.lang.String r3 = r3.c
            r0.a((java.lang.String) r7, (java.lang.Object) r3)
            r3 = r17
            r4 = 0
            goto L_0x0021
        L_0x0137:
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r4 = new com.google.android.gms.contextmanager.internal.ContextManagerClientInfo
            java.lang.String r7 = r3.d
            java.lang.String r10 = r3.c
            java.lang.String r11 = r3.e
            r27 = 0
            r28 = -1
            r22 = r4
            r23 = r7
            r24 = r10
            r25 = r0
            r26 = r11
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            jtp r0 = r3.f
            if (r0 != 0) goto L_0x0158
            jtp r0 = defpackage.jtp.e
            r7 = r0
            goto L_0x0159
        L_0x0158:
            r7 = r0
        L_0x0159:
            if (r7 == 0) goto L_0x0366
            jtm r11 = new jtm     // Catch:{ Exception -> 0x0345 }
            r11.<init>()     // Catch:{ Exception -> 0x0345 }
            aucx r0 = r7.b     // Catch:{ Exception -> 0x0345 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ Exception -> 0x0345 }
        L_0x0166:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x0345 }
            if (r0 == 0) goto L_0x02da
            java.lang.Object r0 = r12.next()     // Catch:{ Exception -> 0x0345 }
            r13 = r0
            jto r13 = (defpackage.jto) r13     // Catch:{ Exception -> 0x0345 }
            int r14 = r13.c     // Catch:{ Exception -> 0x0345 }
            int r0 = r13.a     // Catch:{ Exception -> 0x0345 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x021a
            jtu r0 = r13.d     // Catch:{ Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0180
            goto L_0x0182
        L_0x0180:
            jtu r0 = defpackage.jtu.c     // Catch:{ Exception -> 0x0345 }
        L_0x0182:
            if (r0 == 0) goto L_0x0210
            juu r15 = new juu     // Catch:{ Exception -> 0x01ed }
            r15.<init>()     // Catch:{ Exception -> 0x01ed }
            aucx r10 = r0.a     // Catch:{ Exception -> 0x01ed }
            int r10 = r10.size()     // Catch:{ Exception -> 0x01ed }
            if (r10 != 0) goto L_0x019a
            r20 = r4
            r18 = r5
            r21 = r6
            r22 = r7
            goto L_0x01d4
        L_0x019a:
            aucx r10 = r0.a     // Catch:{ Exception -> 0x01ed }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x01ed }
        L_0x01a0:
            boolean r18 = r10.hasNext()     // Catch:{ Exception -> 0x01ed }
            if (r18 == 0) goto L_0x01cc
            java.lang.Object r18 = r10.next()     // Catch:{ Exception -> 0x01ed }
            r19 = r10
            r10 = r18
            jtt r10 = (defpackage.jtt) r10     // Catch:{ Exception -> 0x01ed }
            r20 = r4
            r18 = r5
            long r4 = r10.b     // Catch:{ Exception -> 0x01ca }
            r21 = r6
            r22 = r7
            long r6 = r10.c     // Catch:{ Exception -> 0x01eb }
            r15.a(r4, r6)     // Catch:{ Exception -> 0x01eb }
            r5 = r18
            r10 = r19
            r4 = r20
            r6 = r21
            r7 = r22
            goto L_0x01a0
        L_0x01ca:
            r0 = move-exception
            goto L_0x01f2
        L_0x01cc:
            r20 = r4
            r18 = r5
            r21 = r6
            r22 = r7
        L_0x01d4:
            aucs r4 = r0.b     // Catch:{ Exception -> 0x01eb }
            int r4 = r4.size()     // Catch:{ Exception -> 0x01eb }
            if (r4 == 0) goto L_0x01e5
            aucs r0 = r0.b     // Catch:{ Exception -> 0x01eb }
            int[] r0 = defpackage.aoog.a((java.util.Collection) r0)     // Catch:{ Exception -> 0x01eb }
            r15.a((int[]) r0)     // Catch:{ Exception -> 0x01eb }
        L_0x01e5:
            com.google.android.gms.contextmanager.internal.TimeFilterImpl r0 = r15.a()     // Catch:{ Exception -> 0x01eb }
            r4 = r0
            goto L_0x0223
        L_0x01eb:
            r0 = move-exception
            goto L_0x01f6
        L_0x01ed:
            r0 = move-exception
            r20 = r4
            r18 = r5
        L_0x01f2:
            r21 = r6
            r22 = r7
        L_0x01f6:
            jjg r4 = defpackage.bxk.a     // Catch:{ Exception -> 0x0343 }
            anie r4 = r4.b()     // Catch:{ Exception -> 0x0343 }
            anih r4 = (defpackage.anih) r4     // Catch:{ Exception -> 0x0343 }
            r4.a((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x0343 }
            r0 = 152(0x98, float:2.13E-43)
            anie r0 = r4.a((java.lang.String) r2, (java.lang.String) r8, (int) r0, (java.lang.String) r9)     // Catch:{ Exception -> 0x0343 }
            anih r0 = (defpackage.anih) r0     // Catch:{ Exception -> 0x0343 }
            java.lang.String r4 = "[ContextManagerUtil] Could not create TimeFilterImpl from proto."
            r0.a((java.lang.String) r4)     // Catch:{ Exception -> 0x0343 }
            r4 = 0
            goto L_0x0223
        L_0x0210:
            r20 = r4
            r18 = r5
            r21 = r6
            r22 = r7
            r4 = 0
            goto L_0x0223
        L_0x021a:
            r20 = r4
            r18 = r5
            r21 = r6
            r22 = r7
            r4 = 0
        L_0x0223:
            int r0 = r13.a     // Catch:{ Exception -> 0x0343 }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0297
            jtr r0 = r13.e     // Catch:{ Exception -> 0x0343 }
            if (r0 == 0) goto L_0x022e
            goto L_0x0230
        L_0x022e:
            jtr r0 = defpackage.jtr.b     // Catch:{ Exception -> 0x0343 }
        L_0x0230:
            if (r0 == 0) goto L_0x0295
            juo r5 = new juo     // Catch:{ Exception -> 0x027a }
            r5.<init>()     // Catch:{ Exception -> 0x027a }
            aucx r0 = r0.a     // Catch:{ Exception -> 0x027a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x027a }
        L_0x023d:
            boolean r6 = r0.hasNext()     // Catch:{ Exception -> 0x027a }
            if (r6 == 0) goto L_0x0275
            java.lang.Object r6 = r0.next()     // Catch:{ Exception -> 0x027a }
            jtq r6 = (defpackage.jtq) r6     // Catch:{ Exception -> 0x027a }
            aucx r7 = r6.a     // Catch:{ Exception -> 0x027a }
            r10 = 0
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ Exception -> 0x027a }
            java.lang.Object[] r7 = r7.toArray(r13)     // Catch:{ Exception -> 0x027a }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ Exception -> 0x027a }
            aucx r10 = r6.b     // Catch:{ Exception -> 0x027a }
            r13 = 0
            java.lang.String[] r15 = new java.lang.String[r13]     // Catch:{ Exception -> 0x027a }
            java.lang.Object[] r10 = r10.toArray(r15)     // Catch:{ Exception -> 0x027a }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ Exception -> 0x027a }
            aucx r6 = r6.c     // Catch:{ Exception -> 0x027a }
            r13 = 0
            java.lang.String[] r15 = new java.lang.String[r13]     // Catch:{ Exception -> 0x027a }
            java.lang.Object[] r6 = r6.toArray(r15)     // Catch:{ Exception -> 0x027a }
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ Exception -> 0x027a }
            java.util.ArrayList r15 = r5.a     // Catch:{ Exception -> 0x027a }
            com.google.android.gms.contextmanager.internal.KeyFilterImpl$Inclusion r13 = new com.google.android.gms.contextmanager.internal.KeyFilterImpl$Inclusion     // Catch:{ Exception -> 0x027a }
            r13.<init>(r7, r10, r6)     // Catch:{ Exception -> 0x027a }
            r15.add(r13)     // Catch:{ Exception -> 0x027a }
            goto L_0x023d
        L_0x0275:
            com.google.android.gms.contextmanager.internal.KeyFilterImpl r0 = r5.a()     // Catch:{ Exception -> 0x027a }
            goto L_0x0298
        L_0x027a:
            r0 = move-exception
            jjg r5 = defpackage.bxk.a     // Catch:{ Exception -> 0x0343 }
            anie r5 = r5.b()     // Catch:{ Exception -> 0x0343 }
            anih r5 = (defpackage.anih) r5     // Catch:{ Exception -> 0x0343 }
            r5.a((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x0343 }
            r0 = 180(0xb4, float:2.52E-43)
            anie r0 = r5.a((java.lang.String) r2, (java.lang.String) r8, (int) r0, (java.lang.String) r9)     // Catch:{ Exception -> 0x0343 }
            anih r0 = (defpackage.anih) r0     // Catch:{ Exception -> 0x0343 }
            java.lang.String r5 = "[ContextManagerUtil] Could not convert ContextDataFilterProto.KeyFilter proto."
            r0.a((java.lang.String) r5)     // Catch:{ Exception -> 0x0343 }
            r0 = 0
            goto L_0x0298
        L_0x0295:
            r0 = 0
            goto L_0x0298
        L_0x0297:
            r0 = 0
        L_0x0298:
            if (r4 != 0) goto L_0x02a7
            r11.a((int) r14)     // Catch:{ Exception -> 0x0343 }
            r5 = r18
            r4 = r20
            r6 = r21
            r7 = r22
            goto L_0x0166
        L_0x02a7:
            if (r0 == 0) goto L_0x02cc
            defpackage.iva.a((java.lang.Object) r0)     // Catch:{ Exception -> 0x0343 }
            java.util.HashSet r5 = r11.a     // Catch:{ Exception -> 0x0343 }
            if (r5 != 0) goto L_0x02b7
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ Exception -> 0x0343 }
            r5.<init>()     // Catch:{ Exception -> 0x0343 }
            r11.a = r5     // Catch:{ Exception -> 0x0343 }
        L_0x02b7:
            java.util.HashSet r5 = r11.a     // Catch:{ Exception -> 0x0343 }
            com.google.android.gms.contextmanager.internal.ContextDataFilterImpl$Inclusion r6 = new com.google.android.gms.contextmanager.internal.ContextDataFilterImpl$Inclusion     // Catch:{ Exception -> 0x0343 }
            r7 = -1
            r6.<init>(r7, r14, r4, r0)     // Catch:{ Exception -> 0x0343 }
            r5.add(r6)     // Catch:{ Exception -> 0x0343 }
            r5 = r18
            r4 = r20
            r6 = r21
            r7 = r22
            goto L_0x0166
        L_0x02cc:
            r7 = -1
            r11.a(r14, r4)     // Catch:{ Exception -> 0x0343 }
            r5 = r18
            r4 = r20
            r6 = r21
            r7 = r22
            goto L_0x0166
        L_0x02da:
            r20 = r4
            r18 = r5
            r21 = r6
            r22 = r7
            r4 = r22
            aucx r0 = r4.c     // Catch:{ Exception -> 0x0343 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0343 }
        L_0x02ea:
            boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x0343 }
            if (r5 == 0) goto L_0x0307
            java.lang.Object r5 = r0.next()     // Catch:{ Exception -> 0x0343 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0343 }
            java.util.HashSet r6 = r11.b     // Catch:{ Exception -> 0x0343 }
            if (r6 != 0) goto L_0x0301
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ Exception -> 0x0343 }
            r6.<init>()     // Catch:{ Exception -> 0x0343 }
            r11.b = r6     // Catch:{ Exception -> 0x0343 }
        L_0x0301:
            java.util.HashSet r6 = r11.b     // Catch:{ Exception -> 0x0343 }
            r6.add(r5)     // Catch:{ Exception -> 0x0343 }
            goto L_0x02ea
        L_0x0307:
            jts r0 = r4.d     // Catch:{ Exception -> 0x0343 }
            if (r0 == 0) goto L_0x030c
            goto L_0x030e
        L_0x030c:
            jts r0 = defpackage.jts.e     // Catch:{ Exception -> 0x0343 }
        L_0x030e:
            int r0 = r0.c     // Catch:{ Exception -> 0x0343 }
            if (r0 <= 0) goto L_0x031e
            jts r0 = r4.d     // Catch:{ Exception -> 0x0343 }
            if (r0 == 0) goto L_0x0317
            goto L_0x0319
        L_0x0317:
            jts r0 = defpackage.jts.e     // Catch:{ Exception -> 0x0343 }
        L_0x0319:
            int r0 = r0.c     // Catch:{ Exception -> 0x0343 }
            r11.b(r0)     // Catch:{ Exception -> 0x0343 }
        L_0x031e:
            jts r0 = r4.d     // Catch:{ Exception -> 0x0343 }
            if (r0 == 0) goto L_0x0323
            goto L_0x0325
        L_0x0323:
            jts r0 = defpackage.jts.e     // Catch:{ Exception -> 0x0343 }
        L_0x0325:
            aucs r0 = r0.d     // Catch:{ Exception -> 0x0343 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0343 }
            if (r0 == 0) goto L_0x033e
            jts r0 = r4.d     // Catch:{ Exception -> 0x0343 }
            if (r0 == 0) goto L_0x0332
        L_0x0331:
            goto L_0x0335
        L_0x0332:
            jts r0 = defpackage.jts.e     // Catch:{ Exception -> 0x0343 }
            goto L_0x0331
        L_0x0335:
            aucs r0 = r0.d     // Catch:{ Exception -> 0x0343 }
            int[] r0 = defpackage.aoog.a((java.util.Collection) r0)     // Catch:{ Exception -> 0x0343 }
            r11.a((int[]) r0)     // Catch:{ Exception -> 0x0343 }
        L_0x033e:
            jtn r0 = r11.a()     // Catch:{ Exception -> 0x0343 }
            goto L_0x036d
        L_0x0343:
            r0 = move-exception
            goto L_0x034c
        L_0x0345:
            r0 = move-exception
            r20 = r4
            r18 = r5
            r21 = r6
        L_0x034c:
            jjg r4 = defpackage.bxk.a
            anie r4 = r4.b()
            anih r4 = (defpackage.anih) r4
            r4.a((java.lang.Throwable) r0)
            r0 = 122(0x7a, float:1.71E-43)
            anie r0 = r4.a((java.lang.String) r2, (java.lang.String) r8, (int) r0, (java.lang.String) r9)
            anih r0 = (defpackage.anih) r0
            java.lang.String r4 = "[ContextManagerUtil] Could not create ContextDataFilterImpl from proto."
            r0.a((java.lang.String) r4)
            r0 = 0
            goto L_0x036d
        L_0x0366:
            r20 = r4
            r18 = r5
            r21 = r6
            r0 = 0
        L_0x036d:
            if (r0 == 0) goto L_0x03b3
            bxd r4 = new bxd
            byc r5 = new byc
            java.lang.String r6 = "RegisterContextListenerOperation"
            r5.<init>(r6)
            bvu r6 = new bvu
            java.lang.String r8 = r3.d
            r7 = r18
            android.app.PendingIntent r15 = r7.a
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r14 = new com.google.android.gms.contextmanager.internal.ContextManagerClientInfo
            r10 = 0
            r12 = 0
            r13 = -1
            r18 = 0
            java.lang.String r9 = "com.google.android.gms"
            java.lang.String r11 = "ContextListenerConsumer"
            r7 = r14
            r19 = r2
            r2 = r14
            r14 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            com.google.android.gms.contextmanager.internal.ContextDataFilterImpl r0 = (com.google.android.gms.contextmanager.internal.ContextDataFilterImpl) r0
            r7 = 0
            r6.<init>(r2, r7, r15, r0)
            r2 = r20
            r4.<init>(r5, r2, r6)
            android.content.Context r0 = r1.a
            java.lang.String r2 = r3.c
            java.lang.String r3 = "RegisterContextListener"
            bvp r0 = defpackage.bvq.a(r3, r0, r2)
            r4.a((defpackage.bvp) r0)
            r3 = r17
            r2 = r19
            r4 = 0
            goto L_0x0021
        L_0x03b3:
            r19 = r2
            r7 = 0
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r2 = 547(0x223, float:7.67E-43)
            r4 = r21
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r8, (int) r2, (java.lang.String) r9)
            anih r0 = (defpackage.anih) r0
            int r2 = r3.a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x03d5
            jtp r10 = r3.f
            if (r10 != 0) goto L_0x03d6
            jtp r10 = defpackage.jtp.e
            goto L_0x03d6
        L_0x03d5:
            r10 = r7
        L_0x03d6:
            java.lang.String r2 = "[FenceManager] Could not create ContextFilterImpl from proto: %s"
            r0.a((java.lang.String) r2, (java.lang.Object) r10)
            r3 = r17
            r2 = r19
            r4 = 0
            goto L_0x0021
        L_0x03e2:
            r19 = r2
            r3 = r17
            r4 = 0
            goto L_0x0021
        L_0x03e9:
            byg r0 = r1.b
            r0.c()
            bww r0 = r1.c
            java.lang.String r2 = "Fence scheduler operation."
            bvp r2 = defpackage.bvq.a(r2)
            r0.a((defpackage.bvp) r2)
        L_0x03f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byd.a(java.util.Collection):void");
    }

    public final void a(Collection collection, Collection collection2) {
        boolean z;
        String str;
        boolean z2 = true;
        if (collection == null || collection.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (collection2 == null || collection2.isEmpty()) {
            z2 = false;
        }
        if (z2 || z) {
            cah cah = new cah(collection, this.g, collection2);
            if (!z || !z2) {
                str = !z ? "RemoveGeofenceOperation" : "AddGeofenceOperation";
            } else {
                str = "UpdateGeofenceOperation";
            }
            cah.a(bvq.a(str));
        }
    }

    public final void a(Set set) {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                Iterator it2 = cbi.r().a.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((cax) it2.next()).a(intValue)) {
                            break;
                        }
                    } else {
                        this.c.c.remove(Integer.valueOf(intValue));
                        break;
                    }
                }
            }
        }
    }
}
