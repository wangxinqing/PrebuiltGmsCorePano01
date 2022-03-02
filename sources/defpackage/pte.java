package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: pte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pte {
    public static avqi a(bazc bazc) {
        HashMap hashMap = new HashMap();
        aucx aucx = bazc.c;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            baza baza = (baza) aucx.get(i);
            List list = (List) hashMap.get(baza.b);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(baza.b, list);
            }
            list.add(baza);
        }
        avqh avqh = (avqh) avqi.f.o();
        for (Map.Entry entry : hashMap.entrySet()) {
            List<baza> list2 = (List) entry.getValue();
            avqf avqf = (avqf) avqg.i.o();
            String str = (String) entry.getKey();
            if (avqf.c) {
                avqf.c();
                avqf.c = false;
            }
            avqg avqg = (avqg) avqf.b;
            str.getClass();
            avqg.a |= 1;
            avqg.b = str;
            bazd bazd = ((baza) list2.get(0)).c;
            if (bazd == null) {
                bazd = bazd.g;
            }
            int i2 = bazd.a;
            if ((i2 & 1) != 0) {
                for (baza baza2 : list2) {
                    bazd bazd2 = baza2.c;
                    if (bazd2 == null) {
                        bazd2 = bazd.g;
                    }
                    boolean z = bazd2.b;
                    if (avqf.c) {
                        avqf.c();
                        avqf.c = false;
                    }
                    avqg avqg2 = (avqg) avqf.b;
                    avqg2.c();
                    avqg2.c.a(z);
                }
            } else if ((i2 & 2) != 0) {
                for (baza baza3 : list2) {
                    bazd bazd3 = baza3.c;
                    if (bazd3 == null) {
                        bazd3 = bazd.g;
                    }
                    avqf.a(bazd3.c);
                }
            } else if ((i2 & 4) != 0) {
                for (baza baza4 : list2) {
                    bazd bazd4 = baza4.c;
                    if (bazd4 == null) {
                        bazd4 = bazd.g;
                    }
                    avqf.c(bazd4.d);
                }
            } else if ((i2 & 8) != 0) {
                for (baza baza5 : list2) {
                    bazd bazd5 = baza5.c;
                    if (bazd5 == null) {
                        bazd5 = bazd.g;
                    }
                    double d = bazd5.e;
                    if (avqf.c) {
                        avqf.c();
                        avqf.c = false;
                    }
                    avqg avqg3 = (avqg) avqf.b;
                    avqg3.g();
                    avqg3.h.a(d);
                }
            } else if ((i2 & 16) != 0) {
                for (baza baza6 : list2) {
                    bazd bazd6 = baza6.c;
                    if (bazd6 == null) {
                        bazd6 = bazd.g;
                    }
                    bazc bazc2 = bazd6.f;
                    if (bazc2 == null) {
                        bazc2 = bazc.d;
                    }
                    avqf.a(a(bazc2));
                }
            }
            avqh.a(avqf);
        }
        return (avqi) avqh.i();
    }
}
