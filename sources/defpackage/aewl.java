package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aewl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aewl extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    public aewl(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(aewl.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        aula aula;
        List list = (List) obj;
        afcd afcd = (afcd) list.get(0);
        aukd aukd = (aukd) list.get(1);
        ArrayList arrayList = new ArrayList();
        if (((aeri) list.get(2)).H()) {
            amxc p = amxc.p();
            amzy amzy = afcd.a;
            int size = amzy.size();
            for (int i = 0; i < size; i++) {
                aukz aukz = (aukz) amzy.get(i);
                aucd o = aukq.f.o();
                auay auay = aukz.c;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aukq aukq = (aukq) o.b;
                auay.getClass();
                int i2 = aukq.a | 4;
                aukq.a = i2;
                aukq.d = auay;
                if ((aukz.a & 4) != 0) {
                    auay auay2 = aukz.d;
                    auay2.getClass();
                    aukq.a = i2 | 2;
                    aukq.c = auay2;
                }
                List a = p.c((Object) aukz.d);
                aucd o2 = aukc.e.o();
                auky a2 = auky.a(aukz.b);
                if (a2 == null) {
                    a2 = auky.UNKNOWN;
                }
                aewh.a(a2);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aukc aukc = (aukc) o2.b;
                aukc.d = 4;
                aukc.a |= 1;
                aukq aukq2 = (aukq) o.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aukc aukc2 = (aukc) o2.b;
                aukq2.getClass();
                aukc2.c = aukq2;
                aukc2.b = 4;
                a.add((aukc) o2.i());
            }
            if (aukd.a == 4) {
                aula = (aula) aukd.b;
            } else {
                aula = aula.c;
            }
            int i3 = aula.b;
            for (auay a3 : p.m()) {
                List a4 = p.c((Object) a3);
                for (int max = Math.max(0, a4.size() - i3); max < a4.size(); max++) {
                    arrayList.add((aukc) a4.get(max));
                }
            }
        } else {
            amzy amzy2 = afcd.a;
            int size2 = amzy2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                aukz aukz2 = (aukz) amzy2.get(i4);
                aucd o3 = aukq.f.o();
                auay auay3 = aukz2.c;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aukq aukq3 = (aukq) o3.b;
                auay3.getClass();
                int i5 = aukq3.a | 4;
                aukq3.a = i5;
                aukq3.d = auay3;
                if ((aukz2.a & 4) != 0) {
                    auay auay4 = aukz2.d;
                    auay4.getClass();
                    aukq3.a = i5 | 2;
                    aukq3.c = auay4;
                }
                aucd o4 = aukc.e.o();
                auky a5 = auky.a(aukz2.b);
                if (a5 == null) {
                    a5 = auky.UNKNOWN;
                }
                aewh.a(a5);
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                aukc aukc3 = (aukc) o4.b;
                aukc3.d = 4;
                aukc3.a |= 1;
                aukq aukq4 = (aukq) o3.i();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                aukc aukc4 = (aukc) o4.b;
                aukq4.getClass();
                aukc4.c = aukq4;
                aukc4.b = 4;
                arrayList.add((aukc) o4.i());
            }
        }
        return aorl.a((Object) arrayList);
    }
}
