package defpackage;

/* renamed from: kp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kp implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ kq b;

    public kp(kq kqVar, Object obj) {
        this.b = kqVar;
        this.a = obj;
    }

    public final void run() {
        kq kqVar = this.b;
        Object obj = this.a;
        if (kqVar.b()) {
            kqVar.b(obj);
        } else {
            kqVar.a(obj);
        }
        kqVar.f = 3;
    }
}
