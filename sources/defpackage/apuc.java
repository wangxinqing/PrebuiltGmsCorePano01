package defpackage;

/* renamed from: apuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apuc implements apth {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;

    public final auef a() {
        return (auef) almc.e.c(7);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        auhs auhs;
        auhs auhs2;
        auhs auhs3;
        if (audx instanceof almc) {
            almc almc = (almc) audx;
            this.a = jlh.b(almc.c);
            this.b = jlh.b(almc.d);
            if (almc.a == 3) {
                auhs = (auhs) almc.b;
            } else {
                auhs = auhs.d;
            }
            this.d = jlh.b(auhs.c);
            if (almc.a == 3) {
                auhs2 = (auhs) almc.b;
            } else {
                auhs2 = auhs.d;
            }
            this.c = jlh.b(auhs2.a);
            if (almc.a == 3) {
                auhs3 = (auhs) almc.b;
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
        throw new IllegalArgumentException("The passed proto must be an instance of FinalizeMfaEnrollmentResponse.");
    }
}
