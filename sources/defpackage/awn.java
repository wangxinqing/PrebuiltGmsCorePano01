package defpackage;

import java.util.List;

/* renamed from: awn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awn extends awr {
    public awn(List list) {
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
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) bbc.c).intValue();
        bbe bbe = this.d;
        if (bbe == null) {
            return baw.a(bba.b(f, 0.0f, 1.0f), intValue, intValue2);
        }
        float f2 = bbc.e;
        bbc.f.floatValue();
        c();
        return ((Integer) bbe.a).intValue();
    }

    public final int g() {
        return b(b(), d());
    }
}
