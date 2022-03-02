package defpackage;

/* renamed from: aeic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeic {
    public final Object a;

    private aeic(Object obj) {
        this.a = obj;
    }

    public static aeic a(Object obj) {
        return new aeic(obj);
    }

    public final aeib a(String str, Class... clsArr) {
        try {
            return new aeib(this, this.a.getClass().getMethod(str, clsArr));
        } catch (NoSuchMethodException e) {
            throw new aeid(e);
        }
    }
}
