package defpackage;

import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: xxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xxx extends xxl {
    public xxx(yaz yaz, xyr xyr, xys xys, xyq xyq, xvp xvp, xvw xvw, xwt xwt, xyh xyh, xym xym, amri amri) {
        super(xnd.UPDATE, xyr, xys, xyq, yaz, xvp, xvw, xwt, xyh, xym, amri);
    }

    private static avlc a(String str, String str2) {
        aucd o = avlc.g.o();
        aucd o2 = avkx.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avkx avkx = (avkx) o2.b;
        str.getClass();
        avkx.a |= 1;
        avkx.b = str;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avlc avlc = (avlc) o.b;
        avkx avkx2 = (avkx) o2.i();
        avkx2.getClass();
        avlc.b = avkx2;
        avlc.a |= 2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avlc avlc2 = (avlc) o.b;
        str2.getClass();
        int i = avlc2.a | 4;
        avlc2.a = i;
        avlc2.c = str2;
        avlc2.f = 3;
        avlc2.a = i | 32;
        return (avlc) o.i();
    }

    /* access modifiers changed from: protected */
    public final List b(List list) {
        xwt xwt = this.h;
        if (list.size() == 0) {
            return Collections.emptyList();
        }
        aucd o = aqxf.e.o();
        List asList = Arrays.asList(xwx.a(list));
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqxf aqxf = (aqxf) o.b;
        if (!aqxf.a.a()) {
            aqxf.a = aucj.a(aqxf.a);
        }
        auab.a((Iterable) asList, (List) aqxf.a);
        if (ycm.a((Object[]) (avkz[]) Collections.unmodifiableList(((aqxf) o.b).a).toArray(new avkz[0]))) {
            return Collections.emptyList();
        }
        aqvx a = xwt.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqxf aqxf2 = (aqxf) o.b;
        a.getClass();
        aqxf2.b = a;
        aqwp aqwp = xwt.f;
        aqwp.getClass();
        aqxf2.c = aqwp;
        xip.a();
        if (Boolean.valueOf(ayrj.a.a().K()).booleanValue()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((aqxf) o.b).d = 2;
        }
        xwt.d.a();
        xpp xpp = xwt.b;
        ClientContext clientContext = xwt.a;
        aqxf aqxf3 = (aqxf) o.i();
        try {
            xpo xpo = xpp.b;
            long j = (long) xpp.a;
            if (xpo.h == null) {
                xpo.h = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/UpdateContactGroups", baoq.a(aqxf.e), baoq.a(aqxg.b));
            }
            aqxg aqxg = (aqxg) xpo.a.a(xpo.h, clientContext, aqxf3, j, TimeUnit.MILLISECONDS);
            xwt.d.a("FSA_updateContactGroups", list.size(), xxa.a(aqxg));
            if (aqxg != null) {
                xwt.a((List) aqxg.a, list.size());
                return aqxg.a;
            }
            throw new xxz(1);
        } catch (babk | eif e) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public final void c(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.a.a(((xvu) list.get(i)).g());
        }
        d(list);
    }

    /* access modifiers changed from: protected */
    public final amri a(xvu xvu) {
        amri amri;
        String j = xvu.j();
        if (!amrk.a(j)) {
            if (yan.b(j)) {
                amri = amri.b(a(j, "Group ID cannot belong to a system group."));
            } else {
                amri = !yan.a(j) ? amri.b(a(j, "Invalid group ID.")) : ampu.a;
            }
            if (amri.a()) {
                return amri;
            }
            String l = xvu.l();
            if (amrk.a(l)) {
                throw new babk(babj.a(babg.INVALID_ARGUMENT).a("Request contains an invalid argument."));
            } else if (l.trim().isEmpty()) {
                return amri.b(a(xvu.j(), "Name is missing."));
            } else {
                return ((long) l.length()) >= aytr.a.a().b() ? amri.b(a(xvu.j(), "Name is too long.")) : ampu.a;
            }
        } else {
            throw new babk(babj.a(babg.INVALID_ARGUMENT).a("Request contains an invalid argument."));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0 != 6) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.xvu r7, defpackage.avlc r8) {
        /*
            r6 = this;
            xvu r8 = defpackage.xwy.a((defpackage.avlc) r8)     // Catch:{ babk -> 0x0008 }
            r6.a((defpackage.xvu) r8, (defpackage.xvu) r7)     // Catch:{ babk -> 0x0008 }
            return
        L_0x0008:
            r8 = move-exception
            babg r0 = defpackage.babg.OK
            babj r0 = r8.a
            babg r0 = r0.r
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 1
            if (r0 == r1) goto L_0x0043
            r1 = 9
            if (r0 == r1) goto L_0x0035
            r1 = 12
            if (r0 == r1) goto L_0x0035
            r1 = 15
            if (r0 == r1) goto L_0x0035
            r1 = 5
            if (r0 == r1) goto L_0x002b
            r1 = 6
            if (r0 == r1) goto L_0x0035
            goto L_0x0062
        L_0x002b:
            xys r8 = r6.a
            java.lang.Long r7 = r7.g()
            r8.b(r7)
            return
        L_0x0035:
            yaz r0 = r6.c
            ybh r0 = (defpackage.ybh) r0
            android.content.SyncResult r0 = r0.a
            android.content.SyncStats r0 = r0.stats
            long r4 = r0.numParseExceptions
            long r4 = r4 + r2
            r0.numParseExceptions = r4
            goto L_0x006f
        L_0x0043:
            defpackage.xip.a()
            xfs r0 = defpackage.xga.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0062
            yaz r0 = r6.c
            ybh r0 = (defpackage.ybh) r0
            android.content.SyncResult r0 = r0.a
            android.content.SyncStats r0 = r0.stats
            long r4 = r0.numParseExceptions
            long r4 = r4 + r2
            r0.numParseExceptions = r4
            goto L_0x006f
        L_0x0062:
            yaz r0 = r6.c
            ybh r0 = (defpackage.ybh) r0
            android.content.SyncResult r0 = r0.a
            android.content.SyncStats r0 = r0.stats
            long r4 = r0.numIoExceptions
            long r4 = r4 + r2
            r0.numIoExceptions = r4
        L_0x006f:
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxx.a(xvu, avlc):void");
    }
}
