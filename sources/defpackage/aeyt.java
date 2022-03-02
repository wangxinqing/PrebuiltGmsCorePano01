package defpackage;

import java.util.List;

/* renamed from: aeyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeyt extends awem {
    private final bapu b;
    private final awef c;
    private final awef d;
    private final awef e;
    private final awef f;
    private final awef g;
    private final awef h;
    private final awef i;
    private final awef j;

    public aeyt(bapu bapu, bapu bapu2, bapu bapu3, awef awef, awef awef2, awef awef3, awef awef4, awef awef5, awef awef6, awef awef7, awef awef8) {
        super(bapu2, awey.a(aeyt.class), bapu);
        this.b = bapu3;
        this.c = aweu.a(awef);
        this.d = aweu.a(awef2);
        this.e = aweu.a(awef3);
        this.f = aweu.a(awef4);
        this.g = aweu.a(awef5);
        this.h = aweu.a(awef6);
        this.i = aweu.a(awef7);
        this.j = aweu.a(awef8);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.c.b(), this.d.b(), this.e.b(), this.f.b(), this.g.b(), this.h.b(), this.i.b(), this.j.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        Throwable th;
        aukv aukv;
        aukq aukq;
        aukq aukq2;
        aukw aukw;
        List list = (List) obj;
        awdn b2 = awds.b(this.b);
        aukh aukh = (aukh) list.get(0);
        int i2 = 1;
        aull aull = (aull) list.get(1);
        aeuy aeuy = (aeuy) list.get(2);
        Long l = (Long) list.get(3);
        Long l2 = (Long) list.get(4);
        Integer num = (Integer) list.get(5);
        amzy amzy = (amzy) list.get(6);
        afgr afgr = (afgr) list.get(7);
        int a = aulk.a(aull.c);
        if (a == 0 || a != 2) {
            throw new afer("Client doesn't support paging of server changes!");
        }
        aucx<aukc> aucx = aull.a;
        afdp b3 = aeuy.a().b();
        try {
            for (aukc aukc : aucx) {
                int a2 = aukb.a(aukc.d);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i3 = a2 - 1;
                if (i3 == 1) {
                    aeuy.i();
                    afgr.c();
                } else if (i3 == 2) {
                    if (aukc.b == 4) {
                        aukq = (aukq) aukc.c;
                    } else {
                        aukq = aukq.f;
                    }
                    aeym.a(aukq);
                    aukq.d.k();
                    aeuy.d();
                } else if (i3 == 3) {
                    if (aukc.b == 4) {
                        aukq2 = (aukq) aukc.c;
                    } else {
                        aukq2 = aukq.f;
                    }
                    aeym.a(aukq2);
                    aeuy.b();
                } else if (i3 != 5) {
                    int a3 = aukb.a(aukc.d);
                    if (a3 != 0) {
                        i2 = a3;
                    }
                    String valueOf = String.valueOf(aukb.b(i2));
                    String valueOf2 = String.valueOf(aukh);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
                    sb.append("Got unknown change type ");
                    sb.append(valueOf);
                    sb.append(" while syncing channel ");
                    sb.append(valueOf2);
                    throw new afer(sb.toString());
                } else {
                    if (aukc.b == 7) {
                        aukw = (aukw) aukc.c;
                    } else {
                        aukw = aukw.c;
                    }
                    if ((aukw.a & 1) != 0) {
                        auay.a(aukw.b).k();
                    }
                    aeuy.c();
                }
            }
            aumr aumr = aull.b;
            if (aumr == null) {
                aumr = aumr.c;
            }
            aeuy.a(b3, aumr);
            aeuy.a(b3, num.intValue());
            aeuy.b(b3, l2.longValue());
            aeuy.c(b3, aull.d);
            aucd o = aumv.c.o();
            aucd o2 = aumw.b.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aumw aumw = (aumw) o2.b;
            if (!aumw.a.a()) {
                aumw.a = aucj.a(aumw.a);
            }
            auab.a((Iterable) amzy, (List) aumw.a);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aumv aumv = (aumv) o.b;
            aumw aumw2 = (aumw) o2.i();
            aumw2.getClass();
            aumv.b = aumw2;
            aumv.a = 3;
            aeuy.a(b3, (aumv) o.i());
            aeuy.a(b3, l.longValue());
            b3.b();
            b3.close();
            if (aukh.a == 2) {
                aukv = (aukv) aukh.b;
            } else {
                aukv = aukv.e;
            }
            ((pia) b2.a()).a("Downloaded %d changes to the local %s/%s footprints storage.", Integer.valueOf(aucx.size()), Integer.valueOf(aukv.b), Integer.valueOf(aukv.c));
            afgr.b((long) aull.a.size());
            int i4 = aull.U;
            if (i4 == -1) {
                i4 = aueh.a.a((Object) aull).b(aull);
                aull.U = i4;
            }
            long j2 = (long) i4;
            afgr.a(j2, j2);
            return aorl.a((Object) null);
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
        throw th;
    }
}
