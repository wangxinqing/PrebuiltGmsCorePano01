package defpackage;

/* renamed from: gog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gog implements aora {
    final /* synthetic */ goj a;

    public gog(goj goj) {
        this.a = goj;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        goj.a.c("Successfully written logs to disk", new Object[0]);
        this.a.c.a(true);
    }

    public final void a(Throwable th) {
        goj.a.d("Failed to write logs to disk ", th, new Object[0]);
        this.a.c.a(false);
    }
}
