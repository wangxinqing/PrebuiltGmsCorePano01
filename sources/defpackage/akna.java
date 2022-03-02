package defpackage;

import java.util.Calendar;
import java.util.List;

/* renamed from: akna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akna implements akmu {
    private final akmq a;

    public akna(akmq akmq) {
        this.a = akmq;
    }

    public final akmy a(akln akln, List list) {
        aklz.a();
        List a2 = akms.a(list.size());
        Calendar a3 = this.a.a();
        a3.setTimeInMillis(System.currentTimeMillis());
        int i = (((a3.get(7) + 5) % 7) * 86400) + (a3.get(11) * 3600) + (a3.get(12) * 60) + a3.get(13);
        float f = ((float) i) / 86400.0f;
        float f2 = ((float) ((72000 + i) % 86400)) / 3600.0f;
        for (int i2 = 0; i2 < list.size(); i2++) {
            aklu aklu = (aklu) a2.get(i2);
            aklu.a(35, Float.valueOf(0.0417f * f2));
            aklu.a(36, Float.valueOf(0.1429f * f));
            aucx aucx = ((akkk) list.get(i2)).a.h;
            if (!aucx.isEmpty()) {
                int size = aucx.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        aklu.a(12, Float.valueOf(-1.0f));
                        break;
                    }
                    asty asty = (asty) aucx.get(i3);
                    int i4 = asty.a;
                    if ((i4 & 1) != 0 && (i4 & 2) != 0 && asty.b <= i && i <= asty.c) {
                        break;
                    }
                    i3++;
                }
            }
            aklu.a(12, Float.valueOf(0.0f));
        }
        return new akmy(list, a2);
    }

    public final String a() {
        return "TimeBased";
    }
}
