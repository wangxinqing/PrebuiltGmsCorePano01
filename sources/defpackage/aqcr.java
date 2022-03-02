package defpackage;

/* renamed from: aqcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqcr {
    public final int a = 1;
    private final Object b;

    public aqcr(Object obj) {
        this.b = obj;
    }

    public static aqcr a(Object obj) {
        return new aqcr(obj);
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
