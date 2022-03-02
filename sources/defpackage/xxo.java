package defpackage;

import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: xxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xxo extends xxl {
    public xxo(yaz yaz, xyr xyr, xys xys, xyq xyq, xvp xvp, xvw xvw, xwt xwt, xyh xyh, xym xym, amri amri) {
        super(xnd.REMOVE, xyr, xys, xyq, yaz, xvp, xvw, xwt, xyh, xym, amri);
    }

    /* access modifiers changed from: protected */
    public final List b(List list) {
        xwt xwt = this.h;
        if (ycm.a((Collection) list)) {
            return Collections.emptyList();
        }
        aucd o = aquw.d.o();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            xvu xvu = (xvu) list.get(i);
            if (!(xvu == null || xvu.j() == null)) {
                String j = xvu.j();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aquw aquw = (aquw) o.b;
                j.getClass();
                if (!aquw.a.a()) {
                    aquw.a = aucj.a(aquw.a);
                }
                aquw.a.add(j);
            }
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aquw aquw2 = (aquw) o.b;
        aquw2.b = false;
        aqwp aqwp = xwt.f;
        aqwp.getClass();
        aquw2.c = aqwp;
        aquw aquw3 = (aquw) o.i();
        xwt.d.a();
        xpp xpp = xwt.b;
        ClientContext clientContext = xwt.a;
        try {
            xpo xpo = xpp.b;
            long j2 = (long) xpp.a;
            if (xpo.i == null) {
                xpo.i = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/DeleteContactGroups", baoq.a(aquw.d), baoq.a(aqux.b));
            }
            aqux aqux = (aqux) xpo.a.a(xpo.i, clientContext, aquw3, j2, TimeUnit.MILLISECONDS);
            xwt.d.a("FSA_deleteContactGroups", list.size(), xxa.a(aqux));
            if (aqux != null) {
                xwt.a((List) aqux.a, list.size());
                return aqux.a;
            }
            throw new xxz(1);
        } catch (babk | eif e) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public final void c(List list) {
        d(list);
    }

    /* access modifiers changed from: protected */
    public final amri a(xvu xvu) {
        if (xvu.j() == null) {
            throw new babk(babj.a(babg.INVALID_ARGUMENT).a("Request contains an invalid argument."));
        } else if (xvu.j().isEmpty()) {
            throw new babk(babj.a(babg.INVALID_ARGUMENT).a("Entry #1: Group ID is missing."));
        } else if (xvu.j().trim().isEmpty()) {
            throw new babk(babj.a(babg.INVALID_ARGUMENT).a("Entry #1: Invalid group ID."));
        } else if (yan.b(xvu.j())) {
            throw new babk(babj.a(babg.INVALID_ARGUMENT).a("Entry #1: Group ID cannot belong to a system group."));
        } else if (yan.a(xvu.j())) {
            return ampu.a;
        } else {
            throw new babk(babj.a(babg.INVALID_ARGUMENT).a("Entry #1: Invalid group ID."));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r0 != 6) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.xvu r7, defpackage.avlc r8) {
        /*
            r6 = this;
            defpackage.xwy.b(r8)     // Catch:{ babk -> 0x000d }
            xys r8 = r6.a     // Catch:{ babk -> 0x000d }
            java.lang.Long r0 = r7.g()     // Catch:{ babk -> 0x000d }
            r8.b(r0)     // Catch:{ babk -> 0x000d }
            return
        L_0x000d:
            r8 = move-exception
            babg r0 = defpackage.babg.OK
            babj r0 = r8.a
            babg r0 = r0.r
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 1
            if (r0 == r1) goto L_0x0054
            r1 = 9
            if (r0 == r1) goto L_0x0046
            r1 = 12
            if (r0 == r1) goto L_0x0046
            r1 = 15
            if (r0 == r1) goto L_0x0046
            r1 = 5
            if (r0 == r1) goto L_0x0030
            r1 = 6
            if (r0 == r1) goto L_0x0046
            goto L_0x0073
        L_0x0030:
            xys r8 = r6.a
            java.lang.Long r7 = r7.g()
            r8.b(r7)
            yaz r0 = r6.c
            xnd r1 = r6.g
            xjo r2 = defpackage.xjo.GROUP
            r3 = 0
            r4 = 3
            r5 = 1
            r0.a(r1, r2, r3, r4, r5)
            return
        L_0x0046:
            yaz r0 = r6.c
            ybh r0 = (defpackage.ybh) r0
            android.content.SyncResult r0 = r0.a
            android.content.SyncStats r0 = r0.stats
            long r4 = r0.numParseExceptions
            long r4 = r4 + r2
            r0.numParseExceptions = r4
            goto L_0x0080
        L_0x0054:
            defpackage.xip.a()
            xfs r0 = defpackage.xga.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0073
            yaz r0 = r6.c
            ybh r0 = (defpackage.ybh) r0
            android.content.SyncResult r0 = r0.a
            android.content.SyncStats r0 = r0.stats
            long r4 = r0.numParseExceptions
            long r4 = r4 + r2
            r0.numParseExceptions = r4
            goto L_0x0080
        L_0x0073:
            yaz r0 = r6.c
            ybh r0 = (defpackage.ybh) r0
            android.content.SyncResult r0 = r0.a
            android.content.SyncStats r0 = r0.stats
            long r4 = r0.numIoExceptions
            long r4 = r4 + r2
            r0.numIoExceptions = r4
        L_0x0080:
            amzy r0 = defpackage.amzy.a((java.lang.Object) r7)
            a((defpackage.babk) r8, (java.util.List) r0)
            babj r0 = r8.a
            babg r0 = r0.r
            java.lang.String r0 = r0.name()
            r1 = 1
            r6.a(r8, r0, r1)
            r6.b((defpackage.xvu) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxo.a(xvu, avlc):void");
    }
}
