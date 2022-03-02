package defpackage;

/* renamed from: ldm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ldm {
    final /* synthetic */ String a;
    final /* synthetic */ ldn b;

    public ldm(ldn ldn, String str) {
        this.b = ldn;
        this.a = str;
    }

    public final void a(boolean z) {
        boolean z2 = false;
        if (!z) {
            ldj a2 = this.b.a(this.a);
            synchronized (a2) {
                if (a2.a.remove(this)) {
                    z2 = a2.d();
                }
            }
            if (z2) {
                a2.b();
                return;
            }
            return;
        }
        ldj a3 = this.b.a(this.a);
        synchronized (a3) {
            if (a3.a.add(this)) {
                z2 = a3.d();
            }
        }
        if (z2) {
            a3.b();
        }
    }
}
