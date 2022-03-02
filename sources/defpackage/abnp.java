package defpackage;

/* renamed from: abnp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abnp implements aora {
    final /* synthetic */ abnu a;

    public abnp(abnu abnu) {
        this.a = abnu;
    }

    public final void a(Object obj) {
    }

    public final void a(Throwable th) {
        abnu.a.a("Error sending MessagePayload", th, new Object[0]);
        this.a.a(10563, "Error sending MessagePayload");
    }
}
