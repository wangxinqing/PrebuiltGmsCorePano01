package defpackage;

import java.util.List;

/* renamed from: akmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akmr implements akmu {
    public final akmy a(akln akln, List list) {
        akln akln2 = akln;
        List list2 = list;
        aklr aklr = akln2.a;
        aklz.a();
        List a = akms.a(list.size());
        aklr aklr2 = akln2.a;
        for (int i = 0; i < list.size(); i++) {
            akkk akkk = (akkk) list2.get(i);
            aklu aklu = (aklu) a.get(i);
            aklu.a(14, Float.valueOf((float) aklr2.e));
            int i2 = aklr2.c;
            if (i2 >= 0) {
                aklu.a(27, Float.valueOf(akmt.a(((float) i2) / 1000.0f, 0.1f, 0.0f)));
            }
            double a2 = aell.a(aklr2.a, aklr2.b, akkk.b(), akkk.c());
            aklu.a(28, Float.valueOf(akmt.a((float) (a2 / 1000.0d), 0.1f, 0.5f)));
            double d = a2 / 250.0d;
            float min = (float) Math.min(d, 1.0d);
            aklu.a(15, Float.valueOf(min));
            aklu.a(16, Float.valueOf(min * min));
            if (a2 > 250.0d) {
                aklu.a(13, Float.valueOf(1.0f));
            }
            aklu.a(17, Float.valueOf((float) Math.max(0.0d, 1.0d - d)));
        }
        return new akmy(list2, a);
    }

    public final String a() {
        return "Distance";
    }
}
