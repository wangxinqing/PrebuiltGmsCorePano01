package defpackage;

/* renamed from: aopb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aopb {
    static final aopb a;
    static final aopb b;
    final boolean c;
    final Throwable d;

    static {
        if (!aopn.j) {
            b = new aopb(false, (Throwable) null);
            a = new aopb(true, (Throwable) null);
            return;
        }
        b = null;
        a = null;
    }

    public aopb(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
