package defpackage;

import java.util.ArrayList;

/* renamed from: airv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class airv {
    public airu a;
    public airu b;
    public boolean c = false;
    public boolean d = false;
    public final airo e;
    public final ahqj f;
    private final ajab g;
    private final ajph h;
    private final aizy i;

    public airv(ajab ajab, aizy aizy, ajph ajph, airo airo, ahqj ahqj) {
        this.g = ajab;
        this.b = null;
        this.a = null;
        this.h = ajph;
        this.i = aizy;
        this.e = airo;
        this.f = ahqj;
    }

    public final void a() {
        arqz arqz;
        airu airu = this.a;
        amrl.a((Object) airu);
        amrl.a((Object) airu.a);
        aiaq aiaq = airu.a;
        airo airo = this.e;
        airo.e.a();
        arsf arsf = airo.f.a.a;
        arsf.l = true;
        aqek aqek = new aqek(ajck.ch);
        aqek aqek2 = new aqek(ajck.bl);
        arsf.i.b(aqek2);
        aqek aqek3 = new aqek(ajck.bj);
        aqek3.b(1, (Object) aqek2);
        aqek.b(5, (Object) aqek3);
        aqek.g(4, (int) arsf.g.proksConfig());
        aqek e2 = aqek.e(5).e(1);
        if (e2.i(1)) {
            int i2 = arsf.k;
            arsf.k = Math.min(i2 + i2, arsf.j);
            arsf.n = arsf.c.c();
            arqy arqy = arsf.u;
            if (arqy.e) {
                arqz = new arrw();
                arqy.d.a(arqz);
            } else {
                arqz = arru.a;
            }
            arsf.v = arqz;
            arsf.v.a(arsf.c.b());
            arsf.v.a(e2);
            aqek aqek4 = new aqek(ajck.ah);
            aqek4.b(17, (Object) aqek);
            aiaq.a(aqek4, 4);
        } else {
            arsf.o = arsf.c.c();
        }
        if (airo.a()) {
            airm airm = airo.a;
            if (airm.a()) {
                amrl.a((Object) airm.b);
                aria aria = ((arhy) airm.b.a).b;
                aria.b = true;
                aria.i++;
                aqek aqek5 = new aqek(ajck.ch);
                aqek aqek6 = new aqek(ajck.I);
                arib arib = aria.e.a;
                String str = arib.f;
                if (str != null) {
                    aqek6.a(1, (Object) str);
                    String str2 = arib.f;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 39);
                    sb.append("Adding missing Cell ID Key: ");
                    sb.append(str2);
                    sb.append(" in request");
                    sb.toString();
                }
                aqek aqek7 = new aqek(ajck.A);
                aqek7.b(1, (Object) aqek6);
                aqek5.b(6, (Object) aqek7);
                if (aqek5.e(6).e(1).i(1)) {
                    int i3 = aria.h;
                    aria.h = Math.min(i3 + i3, 180000);
                    aria.c = aria.f.b();
                    aria.j++;
                    aria.e.d.f++;
                    aria.m = aria.f.b();
                    aqek aqek8 = new aqek(ajck.ah);
                    aqek8.b(17, (Object) aqek5);
                    aiaq.a(aqek8, 2);
                }
            }
        }
        aqek aqek9 = new aqek(ajck.al);
        ArrayList arrayList = aiaq.a;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            aqek aqek10 = (aqek) arrayList.get(i4);
            aqek10.g(10, 0);
            aqek9.a(4, (Object) aqek10);
        }
        aiaq.a();
        this.h.a(this.i, aqek9);
        this.g.a(aqek9, aiaq.c, airu.b, new airt(this, airu, aqek9));
    }

    public final void a(aiaq aiaq, aizx aizx, airs airs) {
        airu airu = new airu(aiaq, aizx, airs);
        if (this.a == null) {
            this.a = airu;
            a();
            return;
        }
        this.b = airu;
    }
}
