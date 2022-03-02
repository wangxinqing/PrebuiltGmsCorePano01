package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ahay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahay {
    private final List a = new ArrayList();

    public ahay(List list) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a((ahaz) list.get(i));
            }
        }
    }

    public final ahbe a() {
        ahba ahba;
        ArrayList arrayList = new ArrayList();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ahaz ahaz = (ahaz) list.get(i);
            if (!ahaz.b.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                List list2 = ahaz.b;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(((ahbb) list2.get(i2)).a());
                }
                ahba = new ahba(ahaz.a, arrayList2);
            } else {
                ahba = null;
            }
            if (ahba != null) {
                arrayList.add(ahba);
            }
        }
        return new ahbe(arrayList);
    }

    public final void a(ahaz ahaz) {
        int i = 0;
        while (i < this.a.size()) {
            if (!((ahaz) this.a.get(i)).a.equals(ahaz.a)) {
                i++;
            } else {
                this.a.set(i, ahaz);
                return;
            }
        }
        this.a.add(ahaz);
    }
}
