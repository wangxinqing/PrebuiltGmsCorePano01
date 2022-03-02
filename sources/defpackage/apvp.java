package defpackage;

/* renamed from: apvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvp implements apth {
    public String a;
    public String b;

    public final auef a() {
        return (auef) alng.c.c(7);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        if (audx instanceof alng) {
            alng alng = (alng) audx;
            this.a = jlh.b(alng.a);
            this.b = jlh.b(alng.b);
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of withdrawMfaResponse.");
    }
}
