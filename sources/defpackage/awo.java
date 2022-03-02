package defpackage;

import java.util.List;

/* renamed from: awo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awo extends awr {
    public awo(List list) {
        super(list);
    }

    public final /* bridge */ /* synthetic */ Object a(bbc bbc, float f) {
        return Float.valueOf(b(bbc, f));
    }

    /* access modifiers changed from: package-private */
    public final float b(bbc bbc, float f) {
        Object obj = bbc.b;
        if (obj == null || bbc.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        bbe bbe = this.d;
        if (bbe == null) {
            float f2 = bbc.g;
            if (f2 == -3987645.8f) {
                f2 = ((Float) obj).floatValue();
                bbc.g = f2;
            }
            float f3 = bbc.h;
            if (f3 == -3987645.8f) {
                f3 = ((Float) bbc.c).floatValue();
                bbc.h = f3;
            }
            return bba.a(f2, f3, f);
        }
        float f4 = bbc.e;
        bbc.f.floatValue();
        Object obj2 = bbc.b;
        Object obj3 = bbc.c;
        c();
        return ((Float) bbe.a).floatValue();
    }

    public final float g() {
        return b(b(), d());
    }
}
