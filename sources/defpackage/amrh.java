package defpackage;

/* renamed from: amrh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amrh {
    public static amrg a(Class cls) {
        return new amrg(cls.getSimpleName());
    }

    public static amrg a(Object obj) {
        return new amrg(obj.getClass().getSimpleName());
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
