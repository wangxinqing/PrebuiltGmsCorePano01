package defpackage;

import android.view.MenuItem;
import java.util.Collections;
import java.util.List;

/* renamed from: czy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class czy implements ax {
    private final dac a;

    public czy(dac dac) {
        this.a = dac;
    }

    public final void a(Object obj) {
        List list;
        dac dac = this.a;
        aqso aqso = ((csl) obj).a;
        if (aqso.b != 7) {
            list = Collections.emptyList();
        } else {
            list = ((aqqe) aqso.c).a;
        }
        List list2 = dac.e;
        if (list2.size() == list.size()) {
            int size = list2.size();
            int i = 0;
            while (i < size) {
                if (amqx.a(((aqpz) list2.get(i)).d, ((aqpz) list.get(i)).d)) {
                    aqrl aqrl = ((aqpz) list2.get(i)).e;
                    if (aqrl == null) {
                        aqrl = aqrl.g;
                    }
                    aqrl aqrl2 = ((aqpz) list.get(i)).e;
                    if (aqrl2 == null) {
                        aqrl2 = aqrl.g;
                    }
                    if (aqrl.b == aqrl2.b && amqx.a(aqrl.c, aqrl2.c)) {
                        i++;
                    }
                }
            }
            return;
        }
        dac.e = list;
        if (!list.isEmpty()) {
            dac.f = true;
            dac.d.a.clear();
            for (int i2 = 0; i2 < list.size(); i2++) {
                aqpz aqpz = (aqpz) list.get(i2);
                MenuItem a2 = dac.d.a.a(0, dac.a(i2), 0, aqpz.d);
                if ((aqpz.a & 2) != 0) {
                    aqrl aqrl3 = aqpz.e;
                    if (aqrl3 == null) {
                        aqrl3 = aqrl.g;
                    }
                    aqrk a3 = aqrk.a(aqrl3.b);
                    if (a3 == null) {
                        a3 = aqrk.IMAGE_PLACEHOLDER_ICON;
                    }
                    if (awgy.d()) {
                        a2.setIcon(cxz.b(dac.getContext(), a3));
                    } else {
                        a2.setIcon(cxz.a(dac.getContext(), a3));
                    }
                    aqrl aqrl4 = aqpz.e;
                    if (aqrl4 == null) {
                        aqrl4 = aqrl.g;
                    }
                    if (!jlh.d(aqrl4.c)) {
                        djk djk = dac.c;
                        aqrl aqrl5 = aqpz.e;
                        if (aqrl5 == null) {
                            aqrl5 = aqrl.g;
                        }
                        djk.a(aqrl5.c, new dab(dac, a2));
                    }
                }
            }
            dac.f = false;
            dac.b();
            dac.d.setVisibility(0);
            return;
        }
        dac.d.setVisibility(8);
    }
}
