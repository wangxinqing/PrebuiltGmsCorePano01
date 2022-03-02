package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ahbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahbb {
    public final String a;
    private final List b = new ArrayList();

    public ahbb(String str, List list) {
        this.a = str;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a((ahbd) list.get(i));
            }
        }
    }

    public final ahbc a() {
        return new ahbc(this.a, this.b);
    }

    public final void a(ahbd ahbd) {
        int i = 0;
        while (i < this.b.size()) {
            if (!((ahbd) this.b.get(i)).a.equals(ahbd.a)) {
                i++;
            } else {
                this.b.set(i, ahbd);
                return;
            }
        }
        this.b.add(ahbd);
    }

    public final void a(String str, String str2) {
        a(new ahbd(str, str2));
    }
}
