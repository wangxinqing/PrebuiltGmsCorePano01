package defpackage;

/* renamed from: hpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hpp {
    static int a(int i) {
        return i + b(i);
    }

    static int b(int i) {
        return (4 - (i % 4)) % 4;
    }
}
