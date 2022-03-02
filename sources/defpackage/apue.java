package defpackage;

/* renamed from: apue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apue implements apth {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;

    public final auef a() {
        return (auef) alme.e.c(7);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        auhs auhs;
        auhs auhs2;
        auhs auhs3;
        if (audx instanceof alme) {
            alme alme = (alme) audx;
            this.a = jlh.b(alme.c);
            this.b = jlh.b(alme.d);
            if (alme.a == 3) {
                auhs = (auhs) alme.b;
            } else {
                auhs = auhs.d;
            }
            this.d = jlh.b(auhs.c);
            if (alme.a == 3) {
                auhs2 = (auhs) alme.b;
            } else {
                auhs2 = auhs.d;
            }
            this.c = jlh.b(auhs2.a);
            if (alme.a == 3) {
                auhs3 = (auhs) alme.b;
            } else {
                auhs3 = auhs.d;
            }
            aufc aufc = auhs3.b;
            if (aufc == null) {
                aufc = aufc.c;
            }
            this.e = aufc.a;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of FinalizeMfaSignInResponse.");
    }
}
