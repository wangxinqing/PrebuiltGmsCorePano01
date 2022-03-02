package defpackage;

/* renamed from: aa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aa implements ah {
    private final z a;
    private final ah b;

    public aa(z zVar, ah ahVar) {
        this.a = zVar;
        this.b = ahVar;
    }

    public final void a(aj ajVar, ac acVar) {
        ac acVar2 = ac.ON_CREATE;
        switch (acVar.ordinal()) {
            case 0:
                this.a.a();
                break;
            case 1:
                this.a.d();
                break;
            case 2:
                this.a.c();
                break;
            case 3:
                this.a.b();
                break;
            case 4:
                this.a.e();
                break;
            case 5:
                this.a.a(ajVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        ah ahVar = this.b;
        if (ahVar != null) {
            ahVar.a(ajVar, acVar);
        }
    }
}
