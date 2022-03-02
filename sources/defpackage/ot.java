package defpackage;

/* renamed from: ot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ot {
    public static void a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
