package defpackage;

/* renamed from: abvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abvh implements aora {
    final /* synthetic */ abvi a;

    public abvh(abvi abvi) {
        this.a = abvi;
    }

    public final void a(Object obj) {
        this.a.c();
    }

    public final void a(Throwable th) {
        abvi.h.a("Error sending MessagePayload", th, new Object[0]);
        this.a.a(10563, "Error sending MessagePayload");
    }
}
