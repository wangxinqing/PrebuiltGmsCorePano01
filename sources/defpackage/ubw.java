package defpackage;

/* renamed from: ubw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ubw {
    public final String a;

    public ubw(String str) {
        this.a = str;
    }

    public static int a(auzz auzz) {
        if (auzz != null) {
            avbx avbx = avbx.NEARBY_TYPE_UNKNOWN;
            int b = avbj.b(auzz.b);
            if (b == 0) {
                b = 1;
            }
            int i = b - 1;
            if (i == 100) {
                return (int) aymq.a.a().Q();
            }
            if (i == 200) {
                return (int) aymq.a.a().V();
            }
            if (i == 300) {
                return (int) aymq.a.a().T();
            }
            if (i == 400) {
                return (int) aymq.a.a().U();
            }
            if (i == 500) {
                return (int) aymq.a.a().R();
            }
            if (i == 600) {
                return (int) aymq.a.a().S();
            }
        }
        return 100;
    }
}
