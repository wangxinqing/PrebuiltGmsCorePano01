package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.List;
import java.util.Set;

/* renamed from: veu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class veu extends vff {
    public final ClientAppIdentifier a;
    public final uyz b;
    public final arwg c;
    public final Set d;
    private final List o;
    private final List p;
    private final List q;
    private final List r;
    private final avda s;
    private final avco t;
    private final uwv u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public veu(Context context, arwg arwg, ClientAppIdentifier clientAppIdentifier, List list, List list2, List list3, List list4, avda avda, avco avco, uwv uwv, vew vew, Set set) {
        super(context, clientAppIdentifier, arwg, avcx.h, "Report", vew);
        this.t = avco;
        this.u = uwv;
        this.a = clientAppIdentifier;
        this.o = list;
        this.p = list2;
        this.q = list3;
        this.r = list4;
        this.s = avda;
        this.b = (uyz) thl.a(context, uyz.class);
        this.c = arwg;
        this.d = set;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx a() {
        boolean z;
        boolean z2;
        boolean z3;
        aucf aucf = (aucf) avcw.h.o();
        avcy b2 = b(this.a.c.b);
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avcw avcw = (avcw) aucf.b;
        b2.getClass();
        avcw.b = b2;
        boolean z4 = true;
        avcw.a |= 1;
        List list = this.o;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        List list2 = this.p;
        if (list2 == null || list2.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        List list3 = this.q;
        if (list3 == null || list3.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        List list4 = this.r;
        if (list4 == null || list4.isEmpty()) {
            z4 = false;
        }
        if (z || z2) {
            aucf aucf2 = (aucf) avcq.c.o();
            if (z) {
                List list5 = this.o;
                if (aucf2.c) {
                    aucf2.c();
                    aucf2.c = false;
                }
                avcq avcq = (avcq) aucf2.b;
                if (!avcq.a.a()) {
                    avcq.a = aucj.a(avcq.a);
                }
                auab.a((Iterable) list5, (List) avcq.a);
            }
            if (z2) {
                List list6 = this.p;
                if (aucf2.c) {
                    aucf2.c();
                    aucf2.c = false;
                }
                avcq avcq2 = (avcq) aucf2.b;
                if (!avcq2.b.a()) {
                    avcq2.b = aucj.a(avcq2.b);
                }
                auab.a((Iterable) list6, (List) avcq2.b);
            }
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avcw avcw2 = (avcw) aucf.b;
            avcq avcq3 = (avcq) aucf2.i();
            avcq3.getClass();
            avcw2.c = avcq3;
            avcw2.a |= 2;
        }
        if (z3 || z4) {
            aucd o2 = avcs.c.o();
            if (z3) {
                List list7 = this.q;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                avcs avcs = (avcs) o2.b;
                avcs.c();
                auab.a((Iterable) list7, (List) avcs.a);
            }
            if (z4) {
                List list8 = this.r;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                avcs avcs2 = (avcs) o2.b;
                if (!avcs2.b.a()) {
                    avcs2.b = aucj.a(avcs2.b);
                }
                auab.a((Iterable) list8, (List) avcs2.b);
            }
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avcw avcw3 = (avcw) aucf.b;
            avcs avcs3 = (avcs) o2.i();
            avcs3.getClass();
            avcw3.d = avcs3;
            avcw3.a |= 4;
        }
        avda avda = this.s;
        if (avda != null) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avcw avcw4 = (avcw) aucf.b;
            avda.getClass();
            avcw4.e = avda;
            avcw4.a |= 8;
        }
        avco avco = this.t;
        if (avco != null) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avcw avcw5 = (avcw) aucf.b;
            avco.getClass();
            avcw5.g = avco;
            avcw5.a |= 32;
        }
        uwv uwv = this.u;
        if (uwv != null) {
            avcu a2 = veo.a(uwv.b());
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avcw avcw6 = (avcw) aucf.b;
            a2.getClass();
            avcw6.f = a2;
            avcw6.a |= 16;
        }
        uyz uyz = this.b;
        ClientAppIdentifier clientAppIdentifier = this.a;
        avcw avcw7 = (avcw) aucf.i();
        uyz.e.b();
        jjg jjg = tgc.a;
        while (true) {
            int size = uyz.a.size();
            auyx auyx = uyz.d.f.j;
            if (auyx == null) {
                auyx = auyx.e;
            }
            if (size > auyx.d) {
                uyz.a(uyz.b(clientAppIdentifier, (audx) uyz.a.get(0), 400));
                uyz.a(0);
            } else {
                uyz.a.add(avcw7);
                uyz.b.add(clientAppIdentifier);
                uyz.c.add(Long.valueOf(SystemClock.elapsedRealtime()));
                return (avcw) aucf.i();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ avcz a(audx audx) {
        avcx avcx = (avcx) audx;
        if (avcx == null) {
            return null;
        }
        avcz avcz = avcx.b;
        return avcz == null ? avcz.d : avcz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(audx audx, audx audx2) {
        avcx avcx = (avcx) audx2;
        this.c.c(new vet(this, "ReportServerTask.createCallbackResponse", (avcw) audx, avcx));
        return avcx;
    }
}
