package defpackage;

import android.widget.SectionIndexer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lqr implements ici {
    public final SectionIndexer a;
    private final List b;
    private final jzt c;

    public lqr(List list, List list2, jzt jzt) {
        this.b = a(list);
        iva.a((Object) jzt);
        this.c = jzt;
        this.a = new lqo(this.b, a(list2));
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lqp lqp = (lqp) list.get(i);
            if (lqp.b != 0) {
                arrayList.add(lqp);
            }
        }
        return arrayList;
    }

    public final void c() {
        this.c.c();
    }

    public final int a() {
        return this.b.size() + this.c.a();
    }

    public final lqq a(int i) {
        List list = this.b;
        int size = list.size();
        int i2 = i;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            lqp lqp = (lqp) list.get(i4);
            if (i2 == 0) {
                return new lqq(lqp, (jzr) null);
            }
            int i5 = lqp.b + 1;
            if (i2 < i5) {
                return new lqq((lqp) null, this.c.a((i - i3) - 1));
            }
            i2 -= i5;
            i3++;
        }
        throw new IndexOutOfBoundsException();
    }
}
