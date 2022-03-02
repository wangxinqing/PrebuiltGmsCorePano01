package defpackage;

/* renamed from: cil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cil {
    public static int a(atjv atjv) {
        if (atjv == atjv.DETECTED_BEACON) {
            return 0;
        }
        if (atjv != atjv.USER_LOCATION) {
            return !bta.d(atjv.bA) ? 1 : 3;
        }
        return 2;
    }
}
