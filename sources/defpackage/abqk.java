package defpackage;

/* renamed from: abqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abqk implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ abql b;

    public abqk(abql abql, int i) {
        this.b = abql;
        this.a = i;
    }

    public final void run() {
        iwd iwd = abqo.a;
        String valueOf = String.valueOf(tdg.g(this.a));
        iwd.e(valueOf.length() == 0 ? new String("Nearby.Bootstrap DataListener error: ") : "Nearby.Bootstrap DataListener error: ".concat(valueOf), new Object[0]);
        acau acau = this.b.a.e;
        if (acau != null) {
            acau.a(10557);
        }
    }
}
