package defpackage;

/* renamed from: absv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class absv implements acek {
    private final absy a;

    public absv(absy absy) {
        this.a = absy;
    }

    public final void a() {
        absy absy = this.a;
        if (absy.f) {
            absy.a.d("AccountTransfer Imports timed out", new Object[0]);
            if (absy.b(absy.i)) {
                absy.b();
            } else {
                absy.d.a(15, "Timed out while waiting on AccountTransfer imports");
            }
        }
    }
}
