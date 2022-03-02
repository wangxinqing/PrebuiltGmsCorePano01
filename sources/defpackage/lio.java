package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: lio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lio implements lin {
    private final Collection a;
    private final boolean b;
    private final boolean c;

    public lio(boolean z, Collection collection, boolean z2) {
        this.c = z;
        this.a = collection;
        this.b = z2;
    }

    public final lin a() {
        return new lio(!this.c, this.a, !this.b);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List, java.util.Collection] */
    public final kqy b() {
        ArrayList arrayList = new ArrayList();
        ? r1 = this.a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            lin lin = (lin) r1.get(i);
            if (this.b) {
                lin = lin.a();
            }
            arrayList.add(lin.b());
        }
        return !this.c ? kqz.b((List) arrayList) : kqz.a((List) arrayList);
    }
}
