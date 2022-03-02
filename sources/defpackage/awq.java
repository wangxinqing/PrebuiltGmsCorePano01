package defpackage;

import java.util.List;

/* renamed from: awq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awq extends awr {
    public awq(List list) {
        super(list);
    }

    public final /* bridge */ /* synthetic */ Object a(bbc bbc, float f) {
        return Integer.valueOf(b(bbc, f));
    }

    public final int b(bbc bbc, float f) {
        Object obj = bbc.b;
        if (obj == null || bbc.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        bbe bbe = this.d;
        if (bbe == null) {
            int i = bbc.i;
            if (i == 784923401) {
                i = ((Integer) obj).intValue();
                bbc.i = i;
            }
            int i2 = bbc.j;
            if (i2 == 784923401) {
                i2 = ((Integer) bbc.c).intValue();
                bbc.j = i2;
            }
            return bba.a(i, i2, f);
        }
        float f2 = bbc.e;
        bbc.f.floatValue();
        Object obj2 = bbc.b;
        Object obj3 = bbc.c;
        c();
        return ((Integer) bbe.a).intValue();
    }
}
