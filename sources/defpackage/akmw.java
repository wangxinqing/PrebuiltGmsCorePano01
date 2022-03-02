package defpackage;

import java.util.List;

/* renamed from: akmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akmw implements akmu {
    public final akmy a(akln akln, List list) {
        aklz.a();
        List a = akms.a(list.size());
        for (int i = 0; i < list.size(); i++) {
            akkk akkk = (akkk) list.get(i);
            aklu aklu = (aklu) a.get(i);
            if (akkk.d()) {
                aklu.a(7, Float.valueOf(1.0f));
            }
            if (akkk.e()) {
                aklu.a(8, Float.valueOf(1.0f));
            }
            if (akkk.f()) {
                aklu.a(9, Float.valueOf(1.0f));
            }
            if (akkk.g()) {
                aklu.a(10, Float.valueOf(1.0f));
            }
            if (akkk.a(4, 3)) {
                aklu.a(6, Float.valueOf(1.0f));
            }
            if (aklu.a() != 0) {
                aklz.a();
            }
        }
        return new akmy(list, a);
    }

    public final String a() {
        return "HomeWork";
    }
}
