package defpackage;

/* renamed from: qqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qqv implements aora {
    private final qrg a;
    private final qrf b;

    public qqv(qrg qrg, qrf qrf) {
        this.a = qrg;
        this.b = qrf;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && !bool.booleanValue()) {
            this.a.a(this.b);
        }
    }

    public final void a(Throwable th) {
        this.a.a(this.b);
    }
}
