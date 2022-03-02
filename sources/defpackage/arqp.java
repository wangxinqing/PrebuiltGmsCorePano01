package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: arqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arqp {
    final int a;
    final ArrayList b;
    int c = 0;

    public arqp(int i) {
        this.a = i;
        this.b = new ArrayList(i);
    }

    public final List a() {
        ArrayList arrayList = new ArrayList(this.a);
        ArrayList arrayList2 = this.b;
        arrayList.addAll(arrayList2.subList(this.c, arrayList2.size()));
        arrayList.addAll(this.b.subList(0, this.c));
        return arrayList;
    }

    public final void a(Object obj) {
        if (this.b.size() < this.a) {
            this.b.add(obj);
        } else {
            this.b.set(this.c, obj);
        }
        this.c = (this.c + 1) % this.a;
    }
}
