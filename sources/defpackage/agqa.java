package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: agqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agqa implements aoqb {
    private final agqh a;
    private final agqq b;

    public agqa(agqh agqh, agqq agqq) {
        this.a = agqh;
        this.b = agqq;
    }

    public final aorr a(Object obj) {
        amri amri;
        boolean z;
        amri amri2;
        aorr aorr;
        atwk atwk;
        amri amri3;
        atwk atwk2;
        agqh agqh = this.a;
        agqq agqq = this.b;
        atwm atwm = (atwm) obj;
        if (atwm.d.size() != 1) {
            return aorl.a((Throwable) new agqj());
        }
        atwl atwl = (atwl) anbs.b(atwm.d);
        if ((atwm.a & 1) != 0) {
            amri = amri.b(atwm.b);
        } else {
            amri = ampu.a;
        }
        int i = atwl.a;
        if (i == 1) {
            z = true;
        } else {
            if (i == 2) {
                atwk2 = (atwk) atwl.b;
            } else {
                atwk2 = atwk.b;
            }
            z = atwk2.a.size() > 0;
        }
        agqh.d = Boolean.valueOf(z);
        int i2 = atwl.a;
        if (i2 == 1) {
            atvl atvl = agqh.c;
            aucd o = atvn.c.o();
            aubo aubo = aubo.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atvn atvn = (atvn) o.b;
            aubo.getClass();
            atvn.b = aubo;
            atvn.a = 1;
            atvl.a(o);
            aorr = aorl.a((aoqa) new agqc(agqh), agqh.b);
            amri2 = amri;
        } else if (i2 == 2) {
            aucx aucx = ((atwk) atwl.b).a;
            amzt j = amzy.j();
            int size = aucx.size();
            int i3 = 0;
            while (i3 < size) {
                auay auay = (auay) aucx.get(i3);
                if (auay.a() != 16) {
                    Log.w("DeletionsDownloader", "Ignored UUID with invalid length");
                    amri3 = amri;
                } else {
                    ByteBuffer e = auay.e();
                    amri3 = amri;
                    j.c(new UUID(e.getLong(), e.getLong()));
                }
                i3++;
                amri = amri3;
            }
            amri2 = amri;
            amzy a2 = j.a();
            if (atwl.a == 2) {
                atwk = (atwk) atwl.b;
            } else {
                atwk = atwk.b;
            }
            int size2 = atwk.a.size();
            int size3 = a2.size();
            atvl atvl2 = agqh.c;
            aucd o2 = atvn.c.o();
            aucd o3 = atvm.d.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            atvm atvm = (atvm) o3.b;
            int i4 = atvm.a | 1;
            atvm.a = i4;
            atvm.b = size2;
            atvm.a = i4 | 2;
            atvm.c = size3;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atvn atvn2 = (atvn) o2.b;
            atvm atvm2 = (atvm) o3.i();
            atvm2.getClass();
            atvn2.b = atvm2;
            atvn2.a = 2;
            atvl2.a(o2);
            if (a2.isEmpty()) {
                aorr = aorl.a((Object) null);
            } else {
                aorr = aorl.a((aoqa) new agqd(agqh, a2), agqh.b);
            }
        } else {
            amri2 = amri;
            atvl atvl3 = agqh.c;
            atvn atvn3 = atvn.c;
            if (atvl3.c) {
                atvl3.c();
                atvl3.c = false;
            }
            atvo atvo = (atvo) atvl3.b;
            atvo atvo2 = atvo.b;
            atvn3.getClass();
            atvo.a();
            atvo.a.add(atvn3);
            aorr = aorl.a((Object) null);
        }
        return aopr.a(aooz.a(aorr, Exception.class, agqe.a, agqh.e.i), (aoqb) new agqf(agqh, agqq, amri2, atwm), agqh.e.i);
    }
}
