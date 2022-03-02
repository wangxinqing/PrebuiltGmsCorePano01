package defpackage;

/* renamed from: ahgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahgx {
    public final String a;
    public final Class b;

    public ahgx(String str, Class cls) {
        amrl.a((Object) str);
        this.a = str;
        amrl.a((Object) cls);
        this.b = cls;
    }

    public static ahgx a(String str) {
        return new ahgx(str, String.class);
    }

    public static ahgx b(String str) {
        return new ahgx(str, Integer.class);
    }

    public static ahgx c(String str) {
        return new ahgx(str, Boolean.class);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahgx) {
            ahgx ahgx = (ahgx) obj;
            return this.b == ahgx.b && this.a.equals(ahgx.a);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", new Object[]{this.a, this.b});
    }
}
