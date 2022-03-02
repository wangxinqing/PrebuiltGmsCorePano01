package defpackage;

/* renamed from: amtf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amtf {
    public static void a(Object obj) {
        a(obj, "expected a non-null reference", new Object[0]);
    }

    public static void a(Object obj, String str, Object... objArr) {
        a(obj != null, str, objArr);
    }

    public static void a(boolean z) {
        if (!z) {
            throw new amtg();
        }
    }

    public static void a(boolean z, String str, Object obj) {
        if (!z) {
            throw new amtg(amsu.a(str, obj));
        }
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new amtg(amsu.a(str, objArr));
        }
    }
}
