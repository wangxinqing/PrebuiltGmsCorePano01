package defpackage;

/* renamed from: dhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class dhz implements ax {
    private final dib a;

    public dhz(dib dib) {
        this.a = dib;
    }

    public final void a(Object obj) {
        dib dib = this.a;
        csh csh = (csh) obj;
        if (dib.d.b() != dia.FINISHING_WITH_ONBOARDING && dib.d.b() != dia.FINISHING_WITHOUT_ONBOARDING) {
            int i = csh.c;
            if (i == 4) {
                dib.d.b(dia.FINISHING_WITHOUT_ONBOARDING);
            } else if (i == 3) {
                dib.d.b(dia.FINISHING_WITH_ONBOARDING);
            }
        }
    }
}
