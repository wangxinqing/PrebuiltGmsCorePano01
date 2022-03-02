package defpackage;

/* renamed from: absm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class absm implements aora {
    final /* synthetic */ absq a;

    public absm(absq absq) {
        this.a = absq;
    }

    public final void a(Object obj) {
        this.a.h();
    }

    public final void a(Throwable th) {
        absq.h.a("Error sending MessagePayload", th, new Object[0]);
        this.a.a(10563, "Error sending MessagePayload");
    }
}
