package defpackage;

/* renamed from: agc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agc implements ah, afu {
    final /* synthetic */ age a;
    private final ae b;
    private final agb c;
    private afu d;

    public agc(age age, ae aeVar, agb agb) {
        this.a = age;
        this.b = aeVar;
        this.c = agb;
        aeVar.a(this);
    }

    public final void a() {
        this.b.b(this);
        this.c.b(this);
        afu afu = this.d;
        if (afu != null) {
            afu.a();
            this.d = null;
        }
    }

    public final void a(aj ajVar, ac acVar) {
        if (acVar == ac.ON_START) {
            age age = this.a;
            agb agb = this.c;
            age.a.add(agb);
            agd agd = new agd(age, agb);
            agb.a(agd);
            this.d = agd;
        } else if (acVar == ac.ON_STOP) {
            afu afu = this.d;
            if (afu != null) {
                afu.a();
            }
        } else if (acVar == ac.ON_DESTROY) {
            a();
        }
    }
}
