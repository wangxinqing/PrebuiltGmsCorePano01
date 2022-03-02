package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aqis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqis {
    final List a = new ArrayList();
    public aqff b;
    public final boolean c = true;

    public static aqjb a(aqjb aqjb, aqff aqff, aqff aqff2) {
        aqjb aqjb2 = aqjb;
        aqff aqff3 = aqff;
        aqff aqff4 = aqff2;
        if (aqjb2 == null) {
            return null;
        }
        return new aqjb(aqjb2.c, aqjb2.d, aqff4.b(aqff3.b(aqjb2.a(0))), aqff4.a(aqff3.a(aqjb2.a(1))), aqjb2.a(2));
    }

    public final boolean a() {
        return this.b != null;
    }

    public final aqjb a(int i, double d, int i2, int i3, double d2) {
        int i4 = i2;
        int i5 = i3;
        if (!a()) {
            a(i4, i5);
        }
        return new aqjb(i, d, this.b.b(i5), this.b.a(i4), d2);
    }

    public final void a(int i, int i2) {
        aqff aqff = new aqff(i, i2);
        aqff aqff2 = this.b;
        this.b = aqff;
        List list = this.a;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((aqir) list.get(i3)).a(aqff2, aqff);
        }
    }

    public final void a(aqir aqir) {
        this.a.add(aqir);
        aqff aqff = this.b;
        if (aqff != null) {
            aqir.a((aqff) null, aqff);
        }
    }
}
