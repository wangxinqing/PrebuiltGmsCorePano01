package defpackage;

import java.util.List;

/* renamed from: dfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class dfl {
    private static final boolean a(List list, int i, dhk dhk) {
        if (i >= list.size()) {
            return false;
        }
        boolean a = ius.a(((dhk) list.get(i)).a, dhk.a);
        list.subList(i, list.size()).clear();
        return a;
    }

    /* access modifiers changed from: protected */
    public abstract aqsr a(dhk dhk);

    /* access modifiers changed from: protected */
    public abstract aqsr b(dhk dhk);

    public final boolean a(List list, dhk dhk) {
        aqsr a = a(dhk);
        if (a != null) {
            int size = list.size() - 1;
            int i = -1;
            while (size >= 0 && ius.a(a, a((dhk) list.get(size)))) {
                i = size;
                size--;
            }
            if (i != -1) {
                if (ius.a(((dhk) list.get(i)).a, dhk.a)) {
                    return a(list, i, dhk);
                }
                aqsr b = b((dhk) list.get(i));
                if (b != null) {
                    if (ius.a(b, b(dhk))) {
                        return a(list, i + 1, dhk);
                    }
                    while (true) {
                        i++;
                        if (i < list.size()) {
                            if (!ius.a(b, b((dhk) list.get(i)))) {
                                break;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i != -1) {
                        return a(list, i, dhk);
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
