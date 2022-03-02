package defpackage;

/* renamed from: atvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atvr implements auco {
    VALUE_ORIGIN_UNKNOWN(0),
    IN_MEMORY_CACHE(1),
    PERSISTENT_CACHE(2),
    CACHE_MISS(3);
    
    public final int e;

    private atvr(int i) {
        this.e = i;
    }

    public static atvr a(int i) {
        if (i == 0) {
            return VALUE_ORIGIN_UNKNOWN;
        }
        if (i == 1) {
            return IN_MEMORY_CACHE;
        }
        if (i == 2) {
            return PERSISTENT_CACHE;
        }
        if (i != 3) {
            return null;
        }
        return CACHE_MISS;
    }

    public static aucq b() {
        return atvq.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
