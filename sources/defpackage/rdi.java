package defpackage;

/* renamed from: rdi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rdi extends rdn {
    final /* synthetic */ ige a;

    public rdi(ige ige) {
        this.a = ige;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        rgu rgu = (rgu) obj;
        if (this.b) {
            acwd acwd = (acwd) obj2;
            try {
                rgu.a(this.a.b, iby.a(acwd));
            } catch (RuntimeException e) {
                acwd.b((Exception) e);
            }
        }
    }
}
