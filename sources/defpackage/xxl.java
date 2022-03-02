package defpackage;

import android.content.ContentValues;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: xxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class xxl {
    protected final xys a;
    protected final xyq b;
    protected final yaz c;
    protected final xyh d;
    protected final xym e;
    protected final amri f;
    protected final xnd g;
    protected final xwt h;
    private final xyr i;
    private final xvp j;
    private final xvw k;

    protected xxl(xnd xnd, xyr xyr, xys xys, xyq xyq, yaz yaz, xvp xvp, xvw xvw, xwt xwt, xyh xyh, xym xym, amri amri) {
        this.g = xnd;
        this.i = xyr;
        this.a = xys;
        this.b = xyq;
        this.c = yaz;
        this.j = xvp;
        this.k = xvw;
        this.h = xwt;
        this.d = xyh;
        this.e = xym;
        this.f = amri;
    }

    private static wvo a(xnd xnd) {
        xnd xnd2 = xnd.UNSPECIFIED;
        int ordinal = xnd.ordinal();
        if (ordinal == 1) {
            return wvo.INSERT;
        }
        if (ordinal == 2) {
            return wvo.UPDATE;
        }
        if (ordinal != 3) {
            return wvo.UNKNOWN_OPERATION;
        }
        return wvo.REMOVE;
    }

    private final void b(List list, babk babk) {
        a(babk, list);
        a(babk, babk.a.r.name(), list.size());
        xip.a();
        if (!((Boolean) xga.a.a()).booleanValue() || babk.a.r != babg.INVALID_ARGUMENT) {
            a(list.size());
        } else {
            int size = list.size();
            xip.a();
            if (((Boolean) xgp.a.a()).booleanValue()) {
                ((ybh) this.c).a.stats.numParseExceptions += (long) size;
            } else {
                ((ybh) this.c).a.stats.numParseExceptions++;
            }
        }
        a((Exception) babk);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((xvu) it.next());
        }
    }

    private final void c(xvu xvu) {
        aucd aucd;
        if (xvu.q() == null) {
            aucd = wvq.d.o();
        } else {
            aucd = wvq.d.a((aucj) xvu.q());
        }
        long longValue = xvu.h().longValue();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        wvq wvq = (wvq) aucd.b;
        wvq.a |= 2;
        wvq.c = longValue;
        xys xys = this.a;
        Long g2 = xvu.g();
        xvx xvx = xys.a.c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync1", Base64.encodeToString(((wvq) aucd.i()).k(), 2));
        xip.a();
        xvx.a(xvx.a, g2, contentValues, ((Boolean) xfu.a.a()).booleanValue());
    }

    private final void e(List list) {
        if (!ycm.a((Collection) list)) {
            try {
                a(list, b(list));
            } catch (eif e2) {
                int size = list.size();
                a(e2, "GRPC_AUTH_EXCEPTION", size);
                xip.a();
                if (((Boolean) xgp.a.a()).booleanValue()) {
                    ((ybh) this.c).a.stats.numAuthExceptions += (long) size;
                } else {
                    ((ybh) this.c).a.stats.numAuthExceptions++;
                }
                a((Exception) e2);
            } catch (babk e3) {
                a(list, e3);
            } catch (xxz e4) {
                int size2 = list.size();
                a(e4, String.valueOf(e4), size2);
                a(size2);
                a((Exception) e4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract amri a(xvu xvu);

    /* access modifiers changed from: protected */
    public abstract void a(xvu xvu, avlc avlc);

    /* access modifiers changed from: protected */
    public abstract List b(List list);

    /* access modifiers changed from: protected */
    public abstract void c(List list);

    /* access modifiers changed from: protected */
    public final void d(List list) {
        if (!list.isEmpty()) {
            this.c.a(this.g, xjo.GROUP, false, 3, list.size());
        }
    }

    protected static final void a(babk babk, List list) {
        xip.a();
        if (Boolean.valueOf(ayrj.a.a().G()).booleanValue()) {
            new babk(babk.a.a(list.toString()));
        }
    }

    private final void a(Exception exc) {
        Log.e("FSA2_BaseGroupUpSyncer", String.format("Group Sync gRPC throws Exception, operation type = %s", new Object[]{Integer.valueOf(this.g.e)}), exc);
    }

    /* access modifiers changed from: protected */
    public final void b(xvu xvu) {
        aucd o = xnm.d.o();
        xnk a2 = yax.a(xvu);
        if (o.c) {
            o.c();
            o.c = false;
        }
        xnm xnm = (xnm) o.b;
        a2.getClass();
        xnm.b = a2;
        xnm.a |= 1;
        xip.a();
        if (((Boolean) xgg.a.a()).booleanValue()) {
            try {
                xnl a3 = this.e.a(xvu.g().longValue());
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                xnm xnm2 = (xnm) o.b;
                a3.getClass();
                xnm2.c = a3;
                xnm2.a |= 2;
            } catch (RemoteException e2) {
            }
        }
        this.c.a((xnm) o.i());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        if (java.lang.Boolean.valueOf(defpackage.ayrj.a.a().bD()).booleanValue() == false) goto L_0x016d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0290 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x028a A[Catch:{ RemoteException -> 0x0295 }, LOOP:1: B:75:0x0210->B:92:0x028a, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.List r28, java.util.List r29) {
        /*
            r27 = this;
            r1 = r27
            java.lang.String r2 = "FSA2_GroupSourceIdValidator"
            java.lang.String r3 = "LocalGroupsMerger"
            int r0 = r28.size()
            int r4 = r29.size()
            r5 = 1
            r6 = 0
            if (r0 != r4) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            defpackage.iva.b((boolean) r0)
            defpackage.xip.a()
            r4 = 0
        L_0x001c:
            int r0 = r29.size()
            if (r4 >= r0) goto L_0x031f
            r7 = r28
            java.lang.Object r0 = r7.get(r4)
            r8 = r0
            xvu r8 = (defpackage.xvu) r8
            r9 = r29
            java.lang.Object r0 = r9.get(r4)
            r10 = r0
            avlc r10 = (defpackage.avlc) r10
            if (r10 == 0) goto L_0x02f8
            xyh r0 = r1.d
            xnd r13 = r1.g
            wvo r13 = a((defpackage.xnd) r13)
            int r14 = r10.f
            int r14 = defpackage.avlb.a(r14)
            r15 = 2
            if (r14 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r14 = 2
        L_0x0049:
            r11 = -1
            int r14 = r14 + r11
            java.lang.String r12 = r10.c
            java.util.Map r0 = r0.b
            int r12 = defpackage.xyf.a(r13, r14, r12, r0)
            if (r12 != r15) goto L_0x006e
            xys r0 = r1.a
            java.lang.Long r8 = r8.g()
            r0.b(r8)
            yaz r10 = r1.c
            xnd r11 = r1.g
            xjo r12 = defpackage.xjo.GROUP
            r13 = 0
            r14 = 7
            r15 = 1
            r10.a(r11, r12, r13, r14, r15)
            r6 = 1
            r7 = 0
            goto L_0x0319
        L_0x006e:
            r0 = 4
            r13 = 7
            if (r12 != r0) goto L_0x0074
            goto L_0x018c
        L_0x0074:
            if (r12 == r13) goto L_0x018c
            r0 = 5
            if (r12 != r0) goto L_0x0170
            xnd r0 = r1.g
            xnd r11 = defpackage.xnd.INSERT
            if (r0 != r11) goto L_0x0081
            goto L_0x0170
        L_0x0081:
            yan r0 = new yan
            r0.<init>()
            java.lang.String r11 = r8.j()
            defpackage.xip.a()
            r12 = 16
            long r12 = java.lang.Long.parseLong(r11, r12)     // Catch:{ NumberFormatException -> 0x00bd }
            xfs r14 = defpackage.xgf.a     // Catch:{ NumberFormatException -> 0x00bd }
            java.lang.Object r14 = r14.a()     // Catch:{ NumberFormatException -> 0x00bd }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ NumberFormatException -> 0x00bd }
            boolean r14 = r14.booleanValue()     // Catch:{ NumberFormatException -> 0x00bd }
            if (r14 == 0) goto L_0x00ba
            java.util.Set r0 = r0.a     // Catch:{ NumberFormatException -> 0x00bd }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00bd }
            boolean r0 = r0.contains(r12)     // Catch:{ NumberFormatException -> 0x00bd }
            if (r0 == 0) goto L_0x00b7
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ NumberFormatException -> 0x00bd }
            r0[r6] = r11     // Catch:{ NumberFormatException -> 0x00bd }
            java.lang.String r12 = "Group source ID %s is treated as invalid."
            defpackage.xdt.a((java.lang.String) r2, (java.lang.String) r12, (java.lang.Object[]) r0)     // Catch:{ NumberFormatException -> 0x00bd }
            goto L_0x00db
        L_0x00b7:
            r7 = 0
            goto L_0x02f9
        L_0x00ba:
            r7 = 0
            goto L_0x02f9
        L_0x00bd:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r6] = r11
            java.lang.String r11 = "Unable to parse groupSourceId, treat as invalid: %s"
            defpackage.xdt.a((java.lang.String) r2, (java.lang.String) r11, (java.lang.Object[]) r0)
            ayrj r0 = defpackage.ayrj.a
            aytn r0 = r0.a()
            boolean r0 = r0.bD()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x016d
        L_0x00db:
            java.lang.String r0 = r8.j()
            java.lang.String r11 = "FSA2_BaseGroupUpSyncer"
            java.lang.String r12 = "Invalid group source ID is found: %s"
            defpackage.xdt.a((java.lang.String) r11, (java.lang.String) r12, (java.lang.Object) r0)
            ayrj r0 = defpackage.ayrj.a
            aytn r0 = r0.a()
            boolean r0 = r0.v()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0115
            xyr r0 = r1.i     // Catch:{ RemoteException -> 0x0113 }
            java.lang.Long r12 = r8.g()     // Catch:{ RemoteException -> 0x0113 }
            java.lang.String r13 = r8.l()     // Catch:{ RemoteException -> 0x0113 }
            java.util.List r0 = r0.a(r12, r13)     // Catch:{ RemoteException -> 0x0113 }
            boolean r0 = r0.isEmpty()     // Catch:{ RemoteException -> 0x0113 }
            if (r0 == 0) goto L_0x0110
            goto L_0x0115
        L_0x0110:
            r7 = 0
            goto L_0x02f9
        L_0x0113:
            r0 = move-exception
            goto L_0x016d
        L_0x0115:
            java.lang.String r0 = r8.j()
            java.lang.String r10 = "Start to nullify the invalid group source ID: %s"
            defpackage.xdt.a((java.lang.String) r11, (java.lang.String) r10, (java.lang.Object) r0)
            xys r0 = r1.a
            java.lang.Long r8 = r8.g()
            xvw r0 = r0.a
            xvx r0 = r0.c
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            java.lang.String r11 = "sourceid"
            r10.putNull(r11)
            defpackage.xip.a()
            xfs r11 = defpackage.xfu.a
            java.lang.Object r11 = r11.a()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            android.net.Uri r12 = r0.a
            r0.a((android.net.Uri) r12, (java.lang.Long) r8, (android.content.ContentValues) r10, (boolean) r11)
            yaz r0 = r1.c
            xnd r8 = r1.g
            xjo r18 = defpackage.xjo.GROUP
            r19 = 0
            r20 = 3
            r21 = 1
            r16 = r0
            r17 = r8
            r16.a(r17, r18, r19, r20, r21)
            yaz r0 = r1.c
            ybh r0 = (defpackage.ybh) r0
            android.content.SyncResult r0 = r0.a
            android.content.SyncStats r0 = r0.stats
            long r10 = r0.numIoExceptions
            r12 = 1
            long r10 = r10 + r12
            r0.numIoExceptions = r10
            r6 = 1
            r7 = 0
            goto L_0x0319
        L_0x016d:
            r7 = 0
            goto L_0x02f9
        L_0x0170:
            boolean r0 = defpackage.aytr.b()
            if (r0 == 0) goto L_0x0189
            r0 = 8
            if (r12 != r0) goto L_0x0189
            java.lang.Long r0 = r8.h()
            if (r0 == 0) goto L_0x0186
            r1.c((defpackage.xvu) r8)
            r7 = 0
            goto L_0x02f9
        L_0x0186:
            r7 = 0
            goto L_0x02f9
        L_0x0189:
            r7 = 0
            goto L_0x02f9
        L_0x018c:
            xyq r14 = r1.b
            java.lang.Long r15 = r8.g()
            java.lang.String r0 = r8.l()
            aysx r16 = defpackage.aysx.a
            aysy r16 = r16.a()
            boolean r16 = r16.b()
            if (r16 != 0) goto L_0x01a3
            goto L_0x01a7
        L_0x01a3:
            java.lang.String r0 = r0.trim()
        L_0x01a7:
            xyr r13 = r14.b     // Catch:{ RemoteException -> 0x02a2 }
            java.util.List r13 = r13.a(r15, r0)     // Catch:{ RemoteException -> 0x02a2 }
            boolean r0 = r13.isEmpty()     // Catch:{ RemoteException -> 0x02a2 }
            if (r0 == 0) goto L_0x01d9
            java.lang.String r0 = "No synced duplicate group found in CP2 while server claims there is a duplicate"
            android.util.Log.e(r3, r0)     // Catch:{ RemoteException -> 0x02a2 }
            aysi r0 = defpackage.aysi.a     // Catch:{ RemoteException -> 0x02a2 }
            aysj r0 = r0.a()     // Catch:{ RemoteException -> 0x02a2 }
            boolean r0 = r0.a()     // Catch:{ RemoteException -> 0x02a2 }
            if (r0 == 0) goto L_0x01d2
            xwn r0 = r14.d     // Catch:{ xye -> 0x01ca }
            r0.b()     // Catch:{ xye -> 0x01ca }
            goto L_0x01d2
        L_0x01ca:
            r0 = move-exception
            xkc r0 = defpackage.xkc.CLEAR_SYNC_TOKEN_FAILURE     // Catch:{ RemoteException -> 0x02a2 }
            r17 = r12
            r7 = 0
            goto L_0x02ad
        L_0x01d2:
            xkc r0 = defpackage.xkc.NO_SYNCED_GROUP_WITH_SAME_TITLE     // Catch:{ RemoteException -> 0x02a2 }
            r17 = r12
            r7 = 0
            goto L_0x02ad
        L_0x01d9:
            int r0 = r13.size()     // Catch:{ RemoteException -> 0x02a2 }
            if (r0 <= r5) goto L_0x01f7
            java.lang.String r0 = "More than 1 synced duplicate group found in CP2. Doesn't know which to merge with."
            android.util.Log.e(r3, r0)     // Catch:{ RemoteException -> 0x02a2 }
            aysi r0 = defpackage.aysi.a     // Catch:{ RemoteException -> 0x02a2 }
            aysj r0 = r0.a()     // Catch:{ RemoteException -> 0x02a2 }
            boolean r0 = r0.c()     // Catch:{ RemoteException -> 0x02a2 }
            if (r0 != 0) goto L_0x01f7
            xkc r0 = defpackage.xkc.MULTIPLE_SYNCED_GROUPS_WITH_SAME_TITLE     // Catch:{ RemoteException -> 0x02a2 }
            r17 = r12
            r7 = 0
            goto L_0x02ad
        L_0x01f7:
            defpackage.xip.a()     // Catch:{ RemoteException -> 0x02a2 }
            ayrj r0 = defpackage.ayrj.a     // Catch:{ RemoteException -> 0x02a2 }
            aytn r0 = r0.a()     // Catch:{ RemoteException -> 0x02a2 }
            r17 = r12
            long r11 = r0.aJ()     // Catch:{ RemoteException -> 0x02a0 }
            int r0 = (int) r11     // Catch:{ RemoteException -> 0x02a0 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ RemoteException -> 0x02a0 }
            int r0 = r0.intValue()     // Catch:{ RemoteException -> 0x02a0 }
            r11 = r0
        L_0x0210:
            xyn r0 = r14.c     // Catch:{ RemoteException -> 0x02a0 }
            long r20 = r15.longValue()     // Catch:{ RemoteException -> 0x02a0 }
            java.lang.Object r12 = r13.get(r6)     // Catch:{ RemoteException -> 0x02a0 }
            xvu r12 = (defpackage.xvu) r12     // Catch:{ RemoteException -> 0x02a0 }
            java.lang.Long r12 = r12.g()     // Catch:{ RemoteException -> 0x02a0 }
            long r22 = r12.longValue()     // Catch:{ RemoteException -> 0x02a0 }
            defpackage.xip.a()     // Catch:{ RemoteException -> 0x02a0 }
            ayrj r12 = defpackage.ayrj.a     // Catch:{ RemoteException -> 0x02a0 }
            aytn r12 = r12.a()     // Catch:{ RemoteException -> 0x02a0 }
            long r6 = r12.h()     // Catch:{ RemoteException -> 0x02a0 }
            int r7 = (int) r6     // Catch:{ RemoteException -> 0x02a0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ RemoteException -> 0x02a0 }
            int r6 = r6.intValue()     // Catch:{ RemoteException -> 0x02a0 }
            long r6 = (long) r6     // Catch:{ RemoteException -> 0x02a0 }
            r19 = r0
            r24 = r6
            int r6 = r19.a((long) r20, (long) r22, (long) r24)     // Catch:{ RemoteException -> 0x02a0 }
            if (r6 < 0) goto L_0x0285
            xvw r0 = r14.a     // Catch:{ xye -> 0x027d }
            xvx r0 = r0.e     // Catch:{ xye -> 0x027d }
            long r19 = r15.longValue()     // Catch:{ xye -> 0x027d }
            android.net.Uri r7 = r0.a     // Catch:{ xye -> 0x027d }
            android.content.ContentProviderOperation$Builder r7 = android.content.ContentProviderOperation.newAssertQuery(r7)     // Catch:{ xye -> 0x027d }
            java.lang.String[] r12 = new java.lang.String[r5]     // Catch:{ xye -> 0x027d }
            java.lang.String r19 = java.lang.String.valueOf(r19)     // Catch:{ xye -> 0x027d }
            r5 = 0
            r12[r5] = r19     // Catch:{ xye -> 0x027d }
            java.lang.String r5 = "mimetype='vnd.android.cursor.item/group_membership' AND data1=?"
            android.content.ContentProviderOperation$Builder r5 = r7.withSelection(r5, r12)     // Catch:{ xye -> 0x027d }
            r7 = 0
            android.content.ContentProviderOperation$Builder r5 = r5.withExpectedCount(r7)     // Catch:{ xye -> 0x027b }
            xwp r0 = r0.b     // Catch:{ xye -> 0x027b }
            r0.a(r5, r7)     // Catch:{ xye -> 0x027b }
            xvw r0 = r14.a     // Catch:{ xye -> 0x027b }
            xvx r0 = r0.c     // Catch:{ xye -> 0x027b }
            r0.a((java.lang.Long) r15, (boolean) r7)     // Catch:{ xye -> 0x027b }
            xvw r0 = r14.a     // Catch:{ xye -> 0x027b }
            r0.b()     // Catch:{ xye -> 0x027b }
            xkc r0 = defpackage.xkc.SUCCESS
            goto L_0x02ad
        L_0x027b:
            r0 = move-exception
            goto L_0x027f
        L_0x027d:
            r0 = move-exception
            r7 = 0
        L_0x027f:
            java.lang.String r5 = "Failed to delete group."
            android.util.Log.e(r3, r5, r0)     // Catch:{ RemoteException -> 0x0295 }
            goto L_0x0286
        L_0x0285:
            r7 = 0
        L_0x0286:
            int r0 = r11 + -1
            if (r11 <= 0) goto L_0x0290
            r7 = r28
            r11 = r0
            r5 = 1
            r6 = 0
            goto L_0x0210
        L_0x0290:
            if (r6 < 0) goto L_0x0297
            xkc r0 = defpackage.xkc.DELETE_GROUP_FAILURE     // Catch:{ RemoteException -> 0x0295 }
            goto L_0x02ad
        L_0x0295:
            r0 = move-exception
            goto L_0x02a6
        L_0x0297:
            r5 = -1
            if (r6 == r5) goto L_0x029d
            xkc r0 = defpackage.xkc.OTHER_MOVE_CONTACTS_FAILURE     // Catch:{ RemoteException -> 0x0295 }
            goto L_0x02ad
        L_0x029d:
            xkc r0 = defpackage.xkc.TOO_MANY_CONTACTS     // Catch:{ RemoteException -> 0x0295 }
            goto L_0x02ad
        L_0x02a0:
            r0 = move-exception
            goto L_0x02a5
        L_0x02a2:
            r0 = move-exception
            r17 = r12
        L_0x02a5:
            r7 = 0
        L_0x02a6:
            java.lang.String r0 = "Unable to merge the duplicate groups."
            android.util.Log.e(r3, r0)
            xkc r0 = defpackage.xkc.OTHER_REMOTE_EXCEPTION
        L_0x02ad:
            ayrj r5 = defpackage.ayrj.a
            aytn r5 = r5.a()
            boolean r5 = r5.az()
            if (r5 == 0) goto L_0x02c3
            yaz r5 = r1.c
            amri r6 = defpackage.amri.b(r0)
            ybh r5 = (defpackage.ybh) r5
            r5.y = r6
        L_0x02c3:
            xkc r5 = defpackage.xkc.SUCCESS
            if (r0 != r5) goto L_0x02dc
            yaz r0 = r1.c
            xnd r5 = r1.g
            xjo r23 = defpackage.xjo.GROUP
            r24 = 0
            r25 = 3
            r26 = 1
            r21 = r0
            r22 = r5
            r21.a(r22, r23, r24, r25, r26)
            r6 = 1
            goto L_0x0319
        L_0x02dc:
            r5 = r17
            r6 = 7
            if (r5 != r6) goto L_0x02f9
            xys r0 = r1.a
            java.lang.Long r5 = r8.g()
            r0.b(r5)
            yaz r10 = r1.c
            xnd r11 = r1.g
            xjo r12 = defpackage.xjo.GROUP
            r13 = 0
            r14 = 7
            r15 = 1
            r10.a(r11, r12, r13, r14, r15)
            r6 = 1
            goto L_0x0319
        L_0x02f8:
            r7 = 0
        L_0x02f9:
            r1.a((defpackage.xvu) r8, (defpackage.avlc) r10)     // Catch:{ xxy -> 0x02fe }
            r6 = 1
            goto L_0x0319
        L_0x02fe:
            r0 = move-exception
            r5 = r0
            int r0 = r5.a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6 = 1
            r1.a(r5, r0, r6)
            yaz r0 = r1.c
            ybh r0 = (defpackage.ybh) r0
            android.content.SyncResult r0 = r0.a
            android.content.SyncStats r0 = r0.stats
            long r10 = r0.numIoExceptions
            r12 = 1
            long r10 = r10 + r12
            r0.numIoExceptions = r10
        L_0x0319:
            int r4 = r4 + 1
            r5 = 1
            r6 = 0
            goto L_0x001c
        L_0x031f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxl.a(java.util.List, java.util.List):void");
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        xip.a();
        if (((Boolean) xgp.a.a()).booleanValue()) {
            ((ybh) this.c).a.stats.numIoExceptions += (long) i2;
            return;
        }
        ((ybh) this.c).a.stats.numIoExceptions++;
    }

    /* access modifiers changed from: protected */
    public final void a(Exception exc, String str, int i2) {
        this.c.a(xjo.GROUP, this.g, str, exc);
        this.c.a(this.g, xjo.GROUP, false, 2, i2);
    }

    public final void a(List list) {
        List<xvu> list2;
        List list3 = list;
        this.c.a(this.g, xjo.GROUP, false, 1, list.size());
        xip.a();
        int intValue = Integer.valueOf((int) ayrj.a.a().bA()).intValue();
        char c2 = 0;
        int i2 = 0;
        while (i2 < list.size()) {
            if (i2 == 0 && list.size() < intValue) {
                list2 = list3;
            } else {
                int i3 = i2 + intValue;
                if (list.size() > i3) {
                    list2 = list3.subList(i2, i3);
                } else {
                    list2 = list3.subList(i2, list.size());
                }
            }
            long a2 = this.c.a();
            this.j.a();
            if (!ycm.a((Collection) list2)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (xvu xvu : list2) {
                    if (!TextUtils.isEmpty(xvu.k()) || "Starred in Android".equals(xvu.l())) {
                        arrayList.add(xvu);
                    } else {
                        arrayList2.add(xvu);
                    }
                }
                c((List) arrayList);
                if (aytr.a.a().a()) {
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        xvu xvu2 = (xvu) arrayList2.get(i4);
                        if (!aytr.b() || xvu2.q() == null || xvu2.h() == null || xvu2.q().c != xvu2.h().longValue()) {
                            try {
                                amri a3 = a(xvu2);
                                if (a3.a()) {
                                    xvu[] xvuArr = new xvu[1];
                                    xvuArr[c2] = xvu2;
                                    a(Arrays.asList(xvuArr), Arrays.asList(new avlc[]{(avlc) a3.b()}));
                                } else {
                                    arrayList3.add(xvu2);
                                }
                            } catch (babk e2) {
                                a(Arrays.asList(new xvu[]{xvu2}), e2);
                            }
                        } else {
                            ((ybh) this.c).a.stats.numParseExceptions++;
                            this.c.a(this.g, xjo.GROUP, false, 8, 1);
                        }
                        i4++;
                        c2 = 0;
                    }
                    e(arrayList3);
                } else {
                    e(arrayList2);
                }
                this.k.b();
            }
            int size2 = list2.size() - ((int) (this.c.a() - a2));
            xip.a();
            if (this.f.a() && ((Boolean) xgl.a.a()).booleanValue() && (this.g != xnd.REMOVE || ((Boolean) xgo.a.a()).booleanValue())) {
                ((xxj) this.f.b()).e(size2);
            }
            i2 += intValue;
            c2 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(List list, babk babk) {
        if (list.size() != 1) {
            b(list, babk);
            return;
        }
        xyh xyh = this.d;
        wvo a2 = a(this.g);
        babj babj = babk.a;
        int a3 = xyh.a(a2, babj.r.r, babj.s);
        int i2 = a3 - 1;
        xnd xnd = xnd.UNSPECIFIED;
        if (a3 == 0) {
            throw null;
        } else if (i2 == 1) {
            this.a.b(((xvu) list.get(0)).g());
            this.c.a(this.g, xjo.GROUP, false, 3, 1);
        } else if (i2 != 7) {
            b(list, babk);
        } else {
            if (aytr.b()) {
                c((xvu) list.get(0));
            }
            b(list, babk);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(xvu xvu, xvu xvu2) {
        if (xvu != null) {
            this.a.a(new yad(xvu, xvu2), false);
            this.a.a(xvu2.g());
        }
    }
}
