package defpackage;

/* renamed from: azxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azxd extends azxb {
    final /* synthetic */ azxb a;

    public azxd() {
    }

    /* JADX INFO: finally extract failed */
    public final void a(baaf baaf) {
        azxb azxb = this.a;
        bajx bajx = (bajx) azxb;
        amrl.b(!bajx.h, (Object) "apply() or fail() already called");
        amrl.a((Object) baaf, (Object) "headers");
        bajx.c.a(baaf);
        azyd b = bajx.e.b();
        try {
            baef a2 = ((bajx) azxb).a.a(((bajx) azxb).b, ((bajx) azxb).c, ((bajx) azxb).d);
            bajx.e.a(b);
            bajx.a(a2);
        } catch (Throwable th) {
            bajx.e.a(b);
            throw th;
        }
    }

    public azxd(azxb azxb) {
        this.a = azxb;
    }

    public final void a(babj babj) {
        this.a.a(babj);
    }
}
