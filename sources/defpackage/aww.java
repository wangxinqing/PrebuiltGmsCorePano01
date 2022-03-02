package defpackage;

import java.util.List;

/* renamed from: aww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aww extends awr {
    private final bbf e = new bbf();

    public aww(List list) {
        super(list);
    }

    public final /* bridge */ /* synthetic */ Object a(bbc bbc, float f) {
        Object obj;
        Object obj2 = bbc.b;
        if (obj2 == null || (obj = bbc.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        bbf bbf = (bbf) obj2;
        bbf bbf2 = (bbf) obj;
        bbe bbe = this.d;
        if (bbe != null) {
            float f2 = bbc.e;
            bbc.f.floatValue();
            c();
            return (bbf) bbe.a;
        }
        bbf bbf3 = this.e;
        float a = bba.a(bbf.a, bbf2.a, f);
        float f3 = bbf.b;
        float f4 = bbf2.b;
        bbf3.a = a;
        bbf3.b = bba.a(f3, f4, f);
        return this.e;
    }
}
