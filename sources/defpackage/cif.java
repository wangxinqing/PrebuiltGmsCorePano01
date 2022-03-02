package defpackage;

import android.accounts.Account;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: cif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cif extends bwp {
    public final ContextManagerClientInfo c;
    public final SnapshotRequest d;
    public final grb e;
    public jtv f;
    public Runnable g;
    public String h;
    public atjv i = atjv.UNKNOWN_CONTEXT_NAME;
    private final jxf j;
    private boolean k = false;

    public cif(jxf jxf, ContextManagerClientInfo contextManagerClientInfo, SnapshotRequest snapshotRequest) {
        super("SnapshotOperation");
        Account account;
        this.j = jxf;
        this.c = contextManagerClientInfo;
        this.d = snapshotRequest;
        String str = contextManagerClientInfo.b;
        String str2 = contextManagerClientInfo.d;
        int i2 = contextManagerClientInfo.c;
        if (contextManagerClientInfo.a() == null || contextManagerClientInfo.a().b()) {
            account = null;
        } else {
            account = contextManagerClientInfo.a().a();
        }
        iva.c("SnapshotOperation");
        this.e = new grb("SnapshotOperation", 0, str, str2, i2, account);
    }

    public final void a() {
        atjv atjv;
        ArrayList arrayList;
        if (this.c.b()) {
            SnapshotRequest snapshotRequest = this.d;
            int i2 = snapshotRequest.c;
            if (i2 == 0) {
                atjv = jtj.b(bvr.a(snapshotRequest.a));
            } else {
                atjv = jtj.b(i2);
            }
            this.i = atjv;
            if (!clh.a(atjv.bA)) {
                a(7512, (Snapshot) null);
            } else if (!bvd.a(this.i.bA)) {
                a(7503, (Snapshot) null);
            } else {
                bte x = cbi.x();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.i.bA));
                if (x.a((Collection) arrayList2, this.c)) {
                    if (awuz.a.a().aP()) {
                        new Object[1][0] = Integer.toString(this.i.bA);
                        cjd p = cbi.p();
                        jtm jtm = new jtm();
                        jtm.a(this.i.bA);
                        cjb a = p.a((ContextDataFilterImpl) jtm.a(), this.c, bxo.a(this.i));
                        new Object[1][0] = Integer.toString(a.a);
                        if (ibt.c(a.a) && (arrayList = a.b) != null && !arrayList.isEmpty()) {
                            new Object[1][0] = Integer.valueOf(a.b.size());
                            ArrayList arrayList3 = a.b;
                            int size = arrayList3.size();
                            int i3 = 0;
                            while (i3 < size) {
                                int i4 = i3 + 1;
                                if (!a((ContextData) arrayList3.get(i3))) {
                                    i3 = i4;
                                } else {
                                    new Object[1][0] = Integer.toString(this.i.bA);
                                    return;
                                }
                            }
                        }
                        new Object[1][0] = Integer.toString(this.i.bA);
                    }
                    cbi.k().a(new chv(this), bvq.a("SnapshotOperation_connected"));
                    return;
                }
                a(7503, (Snapshot) null);
            }
        } else {
            a(7504, (Snapshot) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r10, com.google.android.gms.awareness.snapshot.internal.Snapshot r11) {
        /*
            r9 = this;
            bwn r0 = defpackage.cbi.k()
            r0.a()
            boolean r0 = r9.k
            if (r0 != 0) goto L_0x0110
            r0 = 1
            r9.k = r0
            jxf r1 = r9.j
            defpackage.bwf.a((defpackage.jxf) r1, (int) r10, (com.google.android.gms.awareness.snapshot.internal.Snapshot) r11)
            btx r1 = defpackage.cbi.G()
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r2 = r9.c
            com.google.android.gms.awareness.snapshot.internal.SnapshotRequest r3 = r9.d
            r4 = 0
            if (r11 == 0) goto L_0x002d
            com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl r5 = r11.b
            if (r5 == 0) goto L_0x002b
            java.util.ArrayList r5 = r5.a
            if (r5 == 0) goto L_0x002d
            int r5 = r5.size()
            goto L_0x002e
        L_0x002b:
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            r6 = 5
            aucd r10 = defpackage.btx.a(r2, r6, r10)
            r2 = 0
            if (r3 == 0) goto L_0x005b
            int r6 = r3.c
            if (r6 != 0) goto L_0x0045
            int r3 = r3.a
            int r3 = defpackage.bvr.a(r3)
            atjv r3 = defpackage.jtj.b(r3)
            goto L_0x0049
        L_0x0045:
            atjv r3 = defpackage.jtj.b(r6)
        L_0x0049:
            atnl r6 = defpackage.atnl.b
            aucd r6 = r6.o()
            atnk r6 = (defpackage.atnk) r6
            r6.a(r3)
            aucj r3 = r6.i()
            atnl r3 = (defpackage.atnl) r3
            goto L_0x005c
        L_0x005b:
            r3 = r2
        L_0x005c:
            atnq r6 = defpackage.atnq.d
            aucd r6 = r6.o()
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x0067
            goto L_0x006c
        L_0x0067:
            r6.c()
            r6.c = r4
        L_0x006c:
            aucj r7 = r6.b
            atnq r7 = (defpackage.atnq) r7
            int r8 = r7.a
            r8 = r8 | 2
            r7.a = r8
            r7.c = r5
            if (r3 != 0) goto L_0x007b
            goto L_0x0084
        L_0x007b:
            r3.getClass()
            r7.b = r3
            r3 = r8 | 1
            r7.a = r3
        L_0x0084:
            boolean r3 = r10.c
            if (r3 != 0) goto L_0x0089
            goto L_0x008e
        L_0x0089:
            r10.c()
            r10.c = r4
        L_0x008e:
            aucj r3 = r10.b
            atnj r3 = (defpackage.atnj) r3
            aucj r5 = r6.i()
            atnq r5 = (defpackage.atnq) r5
            atnj r6 = defpackage.atnj.o
            r5.getClass()
            r3.h = r5
            int r5 = r3.a
            r5 = r5 | 64
            r3.a = r5
            aucj r10 = r10.i()
            atnj r10 = (defpackage.atnj) r10
            r1.a((defpackage.atnj) r10)
            if (r11 == 0) goto L_0x00b8
            com.google.android.gms.common.data.DataHolder r10 = r11.f
            if (r10 != 0) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            r10.close()
        L_0x00b8:
            java.lang.Runnable r10 = r9.g
            if (r10 == 0) goto L_0x00c7
            bwn r10 = defpackage.cbi.k()
            java.lang.Runnable r11 = r9.g
            r10.a((java.lang.Runnable) r11)
            r9.g = r2
        L_0x00c7:
            java.lang.String r10 = r9.h
            if (r10 == 0) goto L_0x00ed
            android.content.Context r10 = defpackage.cbi.f()
            grb r11 = r9.e
            iby r10 = defpackage.gra.e(r10, r11)
            java.lang.String r11 = r9.h
            acwa r10 = r10.e(r11)
            bva r11 = new bva
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r9.h
            r0[r4] = r1
            java.lang.String r1 = "[SnapshotOperation] remove interest, key=%s"
            r11.<init>(r1, r0)
            r10.a((defpackage.acvp) r11)
            r9.h = r2
        L_0x00ed:
            jtv r10 = r9.f
            if (r10 == 0) goto L_0x010f
            android.content.Context r10 = defpackage.cbi.f()
            grb r11 = r9.e
            iby r10 = defpackage.gra.c(r10, r11)
            jtv r11 = r9.f
            acwa r10 = r10.a((defpackage.jtv) r11)
            bva r11 = new bva
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "[SnapshotOperation] unregister context listener"
            r11.<init>(r1, r0)
            r10.a((defpackage.acvp) r11)
            r9.f = r2
        L_0x010f:
            return
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cif.b(int, com.google.android.gms.awareness.snapshot.internal.Snapshot):void");
    }

    public final void a(int i2, Snapshot snapshot) {
        if (!cbi.k().b()) {
            ((anih) ((anih) bxk.a.c()).a("cif", "a", 275, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[SnapshotOperation] deliverSnapshotResult is not running on the EventHandler thread.");
            cbi.k().a(new chy(this, i2, snapshot), bvq.a("SnapshotResultDelivery"));
            return;
        }
        b(i2, snapshot);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: android.location.Location} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.google.android.gms.location.ActivityRecognitionResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: com.google.android.gms.awareness.snapshot.internal.HeadphoneStateImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: com.google.android.gms.awareness.snapshot.internal.WeatherImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: com.google.android.gms.awareness.snapshot.internal.TimeIntervalsImpl} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.android.gms.contextmanager.ContextData r13) {
        /*
            r12 = this;
            atjv r0 = r13.h()
            atjv r1 = r12.i
            r2 = 0
            if (r0 != r1) goto L_0x02d6
            com.google.android.gms.awareness.snapshot.internal.SnapshotRequest r0 = r12.d
            long r0 = r0.d
            r3 = 0
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x003e
            jiq r0 = defpackage.cbi.i()
            long r0 = r0.a()
            com.google.android.gms.awareness.snapshot.internal.SnapshotRequest r3 = r12.d
            long r3 = r3.d
            long r0 = r0 - r3
            jut r3 = r13.j()
            long r3 = r3.c()
            awuz r6 = defpackage.awuz.a
            awva r6 = r6.a()
            long r6 = r6.Z()
            long r3 = r3 + r6
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0039
            goto L_0x003e
        L_0x0039:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r2] = r13
            return r2
        L_0x003e:
            atjv r0 = r12.i
            gro r1 = new gro
            r1.<init>()
            r1.a((com.google.android.gms.contextmanager.ContextData) r13)
            atjv r3 = defpackage.atjv.UNKNOWN_CONTEXT_NAME
            int r3 = r0.ordinal()
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r6 = "chu"
            r7 = 0
            if (r3 == r5) goto L_0x024f
            r8 = 6
            if (r3 == r8) goto L_0x01d2
            r8 = 24
            if (r3 == r8) goto L_0x0185
            r8 = 31
            if (r3 == r8) goto L_0x00da
            r8 = 35
            if (r3 == r8) goto L_0x0074
            java.lang.Object[] r13 = new java.lang.Object[r5]
            int r0 = r0.bA
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13[r2] = r0
            com.google.android.gms.awareness.snapshot.internal.Snapshot r13 = r1.a()
            goto L_0x02d1
        L_0x0074:
            auci r0 = defpackage.atrn.d
            java.lang.Object r13 = r13.a((defpackage.aubq) r0)
            atrn r13 = (defpackage.atrn) r13
            if (r13 != 0) goto L_0x0096
            jjg r13 = defpackage.bxk.a
            anie r13 = r13.b()
            anih r13 = (defpackage.anih) r13
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r3 = "e"
            anie r13 = r13.a((java.lang.String) r6, (java.lang.String) r3, (int) r0, (java.lang.String) r4)
            anih r13 = (defpackage.anih) r13
            java.lang.String r0 = "[ContextDataParser] TimeIntervals proto is null"
            r13.a((java.lang.String) r0)
            goto L_0x00cb
        L_0x0096:
            aucs r0 = r13.a
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00c3
            aucs r0 = r13.a
            int r0 = r0.size()
            int[] r3 = new int[r0]
            r4 = 0
        L_0x00a7:
            if (r4 >= r0) goto L_0x00c2
            auct r6 = defpackage.atrn.b
            aucs r7 = r13.a
            int r7 = r7.c(r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r6 = r6.a(r7)
            atrm r6 = (defpackage.atrm) r6
            int r6 = r6.i
            r3[r4] = r6
            int r4 = r4 + 1
            goto L_0x00a7
        L_0x00c2:
            goto L_0x00c6
        L_0x00c3:
            int[] r3 = new int[r2]
        L_0x00c6:
            com.google.android.gms.awareness.snapshot.internal.TimeIntervalsImpl r7 = new com.google.android.gms.awareness.snapshot.internal.TimeIntervalsImpl
            r7.<init>(r3)
        L_0x00cb:
            boolean r13 = r1.a((java.lang.Object) r7)
            if (r13 == 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r1.g = r7
        L_0x00d4:
            com.google.android.gms.awareness.snapshot.internal.Snapshot r13 = r1.a()
            goto L_0x02d1
        L_0x00da:
            auci r0 = defpackage.atuv.d
            java.lang.Object r13 = r13.a((defpackage.aubq) r0)
            atuv r13 = (defpackage.atuv) r13
            java.lang.String r0 = "d"
            if (r13 != 0) goto L_0x00e8
            goto L_0x0161
        L_0x00e8:
            int r3 = r13.a
            r3 = r3 & r5
            if (r3 == 0) goto L_0x0161
            atuu r3 = r13.b
            if (r3 == 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            atuu r3 = defpackage.atuu.c
        L_0x00f4:
            atuz r3 = r3.b
            if (r3 == 0) goto L_0x00f9
            goto L_0x00fb
        L_0x00f9:
            atuz r3 = defpackage.atuz.f
        L_0x00fb:
            atuu r13 = r13.b
            if (r13 == 0) goto L_0x0100
            goto L_0x0102
        L_0x0100:
            atuu r13 = defpackage.atuu.c
        L_0x0102:
            int r13 = r13.a
            r13 = r13 & r5
            if (r13 != 0) goto L_0x011d
            jjg r13 = defpackage.bxk.a
            anie r13 = r13.b()
            anih r13 = (defpackage.anih) r13
            r3 = 231(0xe7, float:3.24E-43)
            anie r13 = r13.a((java.lang.String) r6, (java.lang.String) r0, (int) r3, (java.lang.String) r4)
            anih r13 = (defpackage.anih) r13
            java.lang.String r0 = "[ContextDataParser] current state is null"
            r13.a((java.lang.String) r0)
            goto L_0x0176
        L_0x011d:
            aucx r13 = r3.e
            int r13 = r13.size()
            if (r13 == 0) goto L_0x014b
            aucx r13 = r3.e
            int r13 = r13.size()
            int[] r0 = new int[r13]
            r4 = 0
        L_0x012e:
            if (r4 >= r13) goto L_0x0149
            aucx r6 = r3.e
            java.lang.Object r6 = r6.get(r4)
            atuy r6 = (defpackage.atuy) r6
            int r6 = r6.a
            int r6 = defpackage.atux.a(r6)
            if (r6 == 0) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r6 = 1
        L_0x0142:
            int r6 = r6 + -1
            r0[r4] = r6
            int r4 = r4 + 1
            goto L_0x012e
        L_0x0149:
            r11 = r0
            goto L_0x0151
        L_0x014b:
            int[] r0 = new int[r5]
            r0[r2] = r2
            r11 = r0
        L_0x0151:
            com.google.android.gms.awareness.snapshot.internal.WeatherImpl r13 = new com.google.android.gms.awareness.snapshot.internal.WeatherImpl
            float r7 = r3.a
            float r8 = r3.b
            float r9 = r3.c
            int r10 = r3.d
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r7 = r13
            goto L_0x0176
        L_0x0161:
            jjg r13 = defpackage.bxk.a
            anie r13 = r13.b()
            anih r13 = (defpackage.anih) r13
            r3 = 226(0xe2, float:3.17E-43)
            anie r13 = r13.a((java.lang.String) r6, (java.lang.String) r0, (int) r3, (java.lang.String) r4)
            anih r13 = (defpackage.anih) r13
            java.lang.String r0 = "[ContextDataParser] Weather proto or current conditions is null"
            r13.a((java.lang.String) r0)
        L_0x0176:
            boolean r13 = r1.a((java.lang.Object) r7)
            if (r13 == 0) goto L_0x017d
            goto L_0x017f
        L_0x017d:
            r1.f = r7
        L_0x017f:
            com.google.android.gms.awareness.snapshot.internal.Snapshot r13 = r1.a()
            goto L_0x02d1
        L_0x0185:
            auci r0 = defpackage.atna.i
            java.lang.Object r13 = r13.a((defpackage.aubq) r0)
            atna r13 = (defpackage.atna) r13
            if (r13 == 0) goto L_0x01ac
            int r0 = r13.b
            int r0 = defpackage.atmt.a(r0)
            if (r0 != 0) goto L_0x0198
            goto L_0x01ac
        L_0x0198:
            if (r0 == r5) goto L_0x01ac
            com.google.android.gms.awareness.snapshot.internal.HeadphoneStateImpl r7 = new com.google.android.gms.awareness.snapshot.internal.HeadphoneStateImpl
            int r13 = r13.b
            int r13 = defpackage.atmt.a(r13)
            if (r13 == 0) goto L_0x01a5
            goto L_0x01a6
        L_0x01a5:
            r13 = 1
        L_0x01a6:
            int r13 = r13 + -1
            r7.<init>(r13)
            goto L_0x01c3
        L_0x01ac:
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r3 = 206(0xce, float:2.89E-43)
            java.lang.String r8 = "b"
            anie r0 = r0.a((java.lang.String) r6, (java.lang.String) r8, (int) r3, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            java.lang.String r3 = "[ContextDataParser] Audio Proto: %s"
            r0.a((java.lang.String) r3, (java.lang.Object) r13)
        L_0x01c3:
            boolean r13 = r1.a((java.lang.Object) r7)
            if (r13 == 0) goto L_0x01ca
            goto L_0x01cc
        L_0x01ca:
            r1.d = r7
        L_0x01cc:
            com.google.android.gms.awareness.snapshot.internal.Snapshot r13 = r1.a()
            goto L_0x02d1
        L_0x01d2:
            auci r0 = defpackage.atrs.c
            java.lang.Object r13 = r13.a((defpackage.aubq) r0)
            atrs r13 = (defpackage.atrs) r13
            if (r13 != 0) goto L_0x01f4
            jjg r13 = defpackage.bxk.a
            anie r13 = r13.b()
            anih r13 = (defpackage.anih) r13
            r0 = 186(0xba, float:2.6E-43)
            java.lang.String r3 = "a"
            anie r13 = r13.a((java.lang.String) r6, (java.lang.String) r3, (int) r0, (java.lang.String) r4)
            anih r13 = (defpackage.anih) r13
            java.lang.String r0 = "[ContextDataParser] Unable to get DetectedActivity proto."
            r13.a((java.lang.String) r0)
            goto L_0x0240
        L_0x01f4:
            aucx r0 = r13.a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x023f
            jiq r0 = defpackage.cbi.i()
            com.google.android.gms.location.ActivityRecognitionResult r3 = new com.google.android.gms.location.ActivityRecognitionResult
            aucx r13 = r13.a
            atrq[] r4 = new defpackage.atrq[r2]
            java.lang.Object[] r13 = r13.toArray(r4)
            atrq[] r13 = (defpackage.atrq[]) r13
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r4 = r13.length
            r6 = 0
        L_0x0213:
            if (r6 >= r4) goto L_0x0231
            r8 = r13[r6]
            com.google.android.gms.location.DetectedActivity r9 = new com.google.android.gms.location.DetectedActivity
            int r10 = r8.b
            atrp r10 = defpackage.atrp.a(r10)
            if (r10 == 0) goto L_0x0222
            goto L_0x0224
        L_0x0222:
            atrp r10 = defpackage.atrp.IN_VEHICLE
        L_0x0224:
            int r10 = r10.x
            int r8 = r8.c
            r9.<init>(r10, r8)
            r7.add(r9)
            int r6 = r6 + 1
            goto L_0x0213
        L_0x0231:
            long r8 = r0.a()
            long r10 = r0.b()
            r6 = r3
            r6.<init>(r7, r8, r10)
            r7 = r3
            goto L_0x0240
        L_0x023f:
        L_0x0240:
            boolean r13 = r1.a((java.lang.Object) r7)
            if (r13 == 0) goto L_0x0247
            goto L_0x0249
        L_0x0247:
            r1.a = r7
        L_0x0249:
            com.google.android.gms.awareness.snapshot.internal.Snapshot r13 = r1.a()
            goto L_0x02d1
        L_0x024f:
            auci r0 = defpackage.atus.j
            java.lang.Object r0 = r13.a((defpackage.aubq) r0)
            atus r0 = (defpackage.atus) r0
            if (r0 != 0) goto L_0x0271
            jjg r13 = defpackage.bxk.a
            anie r13 = r13.b()
            anih r13 = (defpackage.anih) r13
            r0 = 216(0xd8, float:3.03E-43)
            java.lang.String r3 = "c"
            anie r13 = r13.a((java.lang.String) r6, (java.lang.String) r3, (int) r0, (java.lang.String) r4)
            anih r13 = (defpackage.anih) r13
            java.lang.String r0 = "[ContextDataParser] Unable to get UserLocation proto."
            r13.a((java.lang.String) r0)
            goto L_0x02c4
        L_0x0271:
            jut r13 = r13.j()
            android.location.Location r7 = new android.location.Location
            java.lang.String r3 = "Snapshot"
            r7.<init>(r3)
            float r3 = r0.g
            r7.setAccuracy(r3)
            double r3 = r0.f
            r7.setAltitude(r3)
            int r3 = r0.b
            double r3 = defpackage.aell.b((int) r3)
            r7.setLatitude(r3)
            int r3 = r0.c
            double r3 = defpackage.aell.b((int) r3)
            r7.setLongitude(r3)
            float r0 = r0.d
            r7.setSpeed(r0)
            if (r13 == 0) goto L_0x02c3
            long r3 = r13.c()
            r7.setTime(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            jiq r0 = defpackage.cbi.i()
            long r3 = r13.c()
            long r8 = r0.a()
            long r10 = r0.b()
            long r3 = r3 - r8
            long r10 = r10 + r3
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r10 * r3
            r7.setElapsedRealtimeNanos(r10)
            goto L_0x02c4
        L_0x02c3:
        L_0x02c4:
            boolean r13 = r1.a((java.lang.Object) r7)
            if (r13 == 0) goto L_0x02cb
            goto L_0x02cd
        L_0x02cb:
            r1.e = r7
        L_0x02cd:
            com.google.android.gms.awareness.snapshot.internal.Snapshot r13 = r1.a()
        L_0x02d1:
            r12.a(r2, r13)
            return r5
        L_0x02d6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cif.a(com.google.android.gms.contextmanager.ContextData):boolean");
    }
}
