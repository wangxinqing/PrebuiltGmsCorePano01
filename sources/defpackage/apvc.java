package defpackage;

/* renamed from: apvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvc implements apth {
    public String a;

    public final auef a() {
        return (auef) almu.c.c(7);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        auhv auhv;
        if (audx instanceof almu) {
            almu almu = (almu) audx;
            if (almu.a != 1 || ((auhv) almu.b).a.isEmpty()) {
                throw new IllegalArgumentException("The passed proto must have valid session info.");
            }
            if (almu.a == 1) {
                auhv = (auhv) almu.b;
            } else {
                auhv = auhv.b;
            }
            this.a = auhv.a;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of StartMfaEnrollmentResponse.");
    }
}
