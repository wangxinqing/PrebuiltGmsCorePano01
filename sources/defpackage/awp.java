package defpackage;

import java.util.List;

/* renamed from: awp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awp extends awr {
    private final ayd e;

    public awp(List list) {
        super(list);
        int i = 0;
        ayd ayd = (ayd) ((bbc) list.get(0)).b;
        i = ayd != null ? ayd.a() : i;
        this.e = new ayd(new float[i], new int[i]);
    }

    public final /* bridge */ /* synthetic */ Object a(bbc bbc, float f) {
        ayd ayd = this.e;
        ayd ayd2 = (ayd) bbc.b;
        ayd ayd3 = (ayd) bbc.c;
        if (ayd2.b.length == ayd3.b.length) {
            for (int i = 0; i < ayd2.b.length; i++) {
                ayd.a[i] = bba.a(ayd2.a[i], ayd3.a[i], f);
                ayd.b[i] = baw.a(f, ayd2.b[i], ayd3.b[i]);
            }
            return this.e;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + ayd2.b.length + " vs " + ayd3.b.length + ")");
    }
}
