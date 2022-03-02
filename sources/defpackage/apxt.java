package defpackage;

/* renamed from: apxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum apxt implements auco {
    DEFAULT_CACHE_OK_IF_VALID(0),
    CACHE_OK_IF_AVAILABLE(1),
    SKIP_CACHE(2),
    CACHE_ONLY(3),
    VALID_CACHE_ONLY(4);
    
    private final int f;

    private apxt(int i) {
        this.f = i;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
