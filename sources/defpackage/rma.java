package defpackage;

/* renamed from: rma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rma {
    public static boolean a(int i) {
        return i > 0;
    }

    public static int b(int i) {
        return (i == -2 || i == -1 || i == 0 || i == 1) ? i : a(i) ? 99 : -3;
    }
}
