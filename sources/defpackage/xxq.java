package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: xxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xxq extends xxl {
    protected xxq(yaz yaz, xyr xyr, xys xys, xyq xyq, xvp xvp, xvw xvw, xwt xwt, xyh xyh, xym xym, amri amri) {
        super(xnd.INSERT, xyr, xys, xyq, yaz, xvp, xvw, xwt, xyh, xym, amri);
    }

    /* access modifiers changed from: protected */
    public final List b(List list) {
        xwt xwt = this.h;
        avkz[] a = xwx.a(list);
        if (ycm.a((Object[]) a)) {
            return Collections.emptyList();
        }
        aucd o = aqus.d.o();
        List asList = Arrays.asList(a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqus aqus = (aqus) o.b;
        if (!aqus.a.a()) {
            aqus.a = aucj.a(aqus.a);
        }
        auab.a((Iterable) asList, (List) aqus.a);
        aqvx a2 = xwt.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqus aqus2 = (aqus) o.b;
        a2.getClass();
        aqus2.b = a2;
        aqwp aqwp = xwt.f;
        aqwp.getClass();
        aqus2.c = aqwp;
        aqus aqus3 = (aqus) o.i();
        xwt.d.a();
        xpp xpp = xwt.b;
        ClientContext clientContext = xwt.a;
        try {
            xpo xpo = xpp.b;
            long j = (long) xpp.a;
            if (xpo.g == null) {
                xpo.g = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/CreateContactGroups", baoq.a(aqus.d), baoq.a(aqut.b));
            }
            aqut aqut = (aqut) xpo.a.a(xpo.g, clientContext, aqus3, j, TimeUnit.MILLISECONDS);
            xwt.d.a("FSA_createContactGroups", aqus3.a.size(), xxa.a(aqut));
            if (aqut != null) {
                xwt.a((List) aqut.a, list.size());
                return aqut.a;
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
        if (TextUtils.isEmpty(xvu.l())) {
            aucd o = avlc.g.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avlc avlc = (avlc) o.b;
            avlc.f = 3;
            int i = avlc.a | 32;
            avlc.a = i;
            "Group type missing.".getClass();
            avlc.a = i | 4;
            avlc.c = "Group type missing.";
            return amri.b((avlc) o.i());
        } else if (!TextUtils.isEmpty(xvu.l().trim())) {
            return ampu.a;
        } else {
            aucd o2 = avlc.g.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avlc avlc2 = (avlc) o2.b;
            avlc2.f = 3;
            int i2 = avlc2.a | 32;
            avlc2.a = i2;
            "Name is missing.".getClass();
            avlc2.a = i2 | 4;
            avlc2.c = "Name is missing.";
            return amri.b((avlc) o2.i());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(xvu xvu, avlc avlc) {
        try {
            a(xwy.a(avlc), xvu);
        } catch (babk e) {
            babg babg = babg.OK;
            int ordinal = e.a.r.ordinal();
            if (ordinal == 3) {
                xip.a();
                if (((Boolean) xga.a.a()).booleanValue()) {
                    ((ybh) this.c).a.stats.numParseExceptions++;
                    a(e, (List) amzy.a((Object) xvu));
                    a(e, e.a.r.name(), 1);
                    b(xvu);
                }
            } else if (ordinal == 9 || ordinal == 12 || ordinal == 15 || ordinal == 5 || ordinal == 6) {
                ((ybh) this.c).a.stats.numParseExceptions++;
                a(e, (List) amzy.a((Object) xvu));
                a(e, e.a.r.name(), 1);
                b(xvu);
            }
            ((ybh) this.c).a.stats.numIoExceptions++;
            a(e, (List) amzy.a((Object) xvu));
            a(e, e.a.r.name(), 1);
            b(xvu);
        }
    }
}
