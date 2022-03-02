package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: agqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agqh implements aoqa {
    public final agoy a;
    public final Executor b;
    public final atvl c = ((atvl) atvo.b.o());
    public Boolean d;
    final /* synthetic */ agqm e;
    private final agpb f;
    private final long g;
    private int h = 0;

    public agqh(agqm agqm, agpb agpb, agoy agoy, Executor executor) {
        this.e = agqm;
        this.f = agpb;
        this.a = agoy;
        this.b = executor;
        this.g = System.nanoTime();
    }

    public final aorr a() {
        return aopr.a(agok.a(((afym) this.e.e.a()).a(), "DeletionsDownloader"), (aoqb) new agpr(this), this.e.i);
    }

    /* access modifiers changed from: package-private */
    public final aorr b() {
        aorr aorr;
        try {
            agqq a2 = this.e.h.a(((agov) this.f).c);
            aucd o = atwj.g.o();
            aucd o2 = atwr.c.o();
            String d2 = this.e.a.d();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atwr atwr = (atwr) o2.b;
            d2.getClass();
            atwr.a |= 2;
            atwr.b = d2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwj atwj = (atwj) o.b;
            atwr atwr2 = (atwr) o2.i();
            atwr2.getClass();
            atwj.b = atwr2;
            atwj.a |= 1;
            aucd o3 = atwi.e.o();
            int i = this.e.b;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            atwi atwi = (atwi) o3.b;
            int i2 = atwi.a | 1;
            atwi.a = i2;
            atwi.b = i;
            int i3 = this.e.c;
            atwi.a = i2 | 2;
            atwi.c = i3;
            aucd o4 = aubn.c.o();
            long j = (long) this.e.d;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            ((aubn) o4.b).a = j;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            atwi atwi2 = (atwi) o3.b;
            aubn aubn = (aubn) o4.i();
            aubn.getClass();
            atwi2.d = aubn;
            atwi2.a |= 4;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwj atwj2 = (atwj) o.b;
            atwi atwi3 = (atwi) o3.i();
            atwi3.getClass();
            if (!atwj2.e.a()) {
                atwj2.e = aucj.a(atwj2.e);
            }
            atwj2.e.add(atwi3);
            amri amri = a2.a;
            if (amri.a()) {
                auay auay = (auay) amri.b();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atwj atwj3 = (atwj) o.b;
                auay.getClass();
                atwj3.a |= 2;
                atwj3.c = auay;
            }
            amzy amzy = a2.b;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwj atwj4 = (atwj) o.b;
            if (!atwj4.d.a()) {
                atwj4.d = aucj.a(atwj4.d);
            }
            auab.a((Iterable) amzy, (List) atwj4.d);
            atxf a3 = agqm.a(((agov) this.f).b);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwj atwj5 = (atwj) o.b;
            atwj5.f = a3.l;
            atwj5.a |= 4;
            atwj atwj6 = (atwj) o.i();
            if (this.h >= 10) {
                aorr = aorl.a((Throwable) new agqk());
            } else if (TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.g) >= ((agov) this.f).a) {
                aorr = aorl.a((Throwable) new agql());
            } else {
                this.h++;
                aorr = aooz.a(this.e.g.a(atwj6), Exception.class, agqb.a, this.e.i);
            }
            return aopr.a(aorr, (aoqb) new agqa(this, a2), this.e.i);
        } catch (agsx e2) {
            return aorl.a((Throwable) new agog((Throwable) e2));
        }
    }

    /* access modifiers changed from: package-private */
    public final aorr a(aorr aorr, afyl afyl) {
        return aopr.a(aooz.a((aorr) aoqw.c(aorr), Exception.class, (aoqb) new agpy(this, afyl), this.e.i), (amqy) new agpz(this, afyl), this.e.i);
    }

    public final atwy a(agtf agtf, afyl afyl) {
        if (afyl != null) {
            agtf.a(afyl.d(), agqg.a);
        }
        Boolean bool = this.d;
        if (bool != null) {
            agtf.a(bool.booleanValue());
        }
        return agtf.a();
    }
}
