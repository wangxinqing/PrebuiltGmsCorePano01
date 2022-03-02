package defpackage;

/* renamed from: acat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acat {
    private final aucd a;

    public acat(aucd aucd) {
        amrl.a((Object) aucd);
        this.a = aucd;
    }

    public final void a(long j) {
        aucd aucd = this.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anwg anwg = (anwg) aucd.b;
        anwg anwg2 = anwg.c;
        anwg.a |= 1;
        anwg.b = j;
    }
}
