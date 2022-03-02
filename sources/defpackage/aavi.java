package defpackage;

/* renamed from: aavi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aavi implements auco {
    COMPRESSION_TYPE_UNSPECIFIED(0),
    RAW(1),
    RICE(2);
    
    public final int d;

    private aavi(int i) {
        this.d = i;
    }

    public static aavi a(int i) {
        if (i == 0) {
            return COMPRESSION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return RAW;
        }
        if (i != 2) {
            return null;
        }
        return RICE;
    }

    public static aucq b() {
        return aavh.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
