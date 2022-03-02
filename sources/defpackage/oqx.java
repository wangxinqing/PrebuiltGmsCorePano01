package defpackage;

/* renamed from: oqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum oqx implements auco {
    VARIANT_NICKNAME(0),
    DEPRECATED_VARIANT_TRANSLIT(1),
    VARIANT_ANNOTATION(2);
    
    public final int d;

    private oqx(int i) {
        this.d = i;
    }

    public static oqx a(int i) {
        if (i == 0) {
            return VARIANT_NICKNAME;
        }
        if (i == 1) {
            return DEPRECATED_VARIANT_TRANSLIT;
        }
        if (i != 2) {
            return null;
        }
        return VARIANT_ANNOTATION;
    }

    public static aucq b() {
        return oqw.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
