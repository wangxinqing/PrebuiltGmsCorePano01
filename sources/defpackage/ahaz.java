package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ahaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahaz {
    public final String a;
    public final List b = new ArrayList();

    public ahaz(String str, List list) {
        this.a = str;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a((ahbb) list.get(i));
            }
        }
    }

    public final void a(ahbb ahbb) {
        int i = 0;
        while (i < this.b.size()) {
            if (!((ahbb) this.b.get(i)).a.equals(ahbb.a)) {
                i++;
            } else {
                this.b.set(i, ahbb);
                return;
            }
        }
        this.b.add(ahbb);
    }
}
