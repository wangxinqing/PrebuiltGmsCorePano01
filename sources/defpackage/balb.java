package defpackage;

/* renamed from: balb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class balb extends bakz {
    public final boolean a(balc balc) {
        synchronized (balc) {
            if (balc.a != 0) {
                return false;
            }
            balc.a = -1;
            return true;
        }
    }

    public final void b(balc balc) {
        synchronized (balc) {
            balc.a = 0;
        }
    }
}
