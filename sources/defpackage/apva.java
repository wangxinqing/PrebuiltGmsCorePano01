package defpackage;

/* renamed from: apva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apva implements apth {
    public String a;
    public String b;
    public long c;

    public final auef a() {
        return (auef) alms.f.c(7);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        if (audx instanceof alms) {
            alms alms = (alms) audx;
            this.a = jlh.b(alms.a);
            jlh.b(alms.b);
            jlh.b(alms.c);
            this.b = jlh.b(alms.d);
            this.c = alms.e;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of SignUpNewUserResponse.");
    }
}
