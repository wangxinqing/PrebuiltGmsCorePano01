package defpackage;

/* renamed from: ashm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ashm implements asiz {
    final /* synthetic */ ashp a;

    public ashm(ashp ashp) {
        this.a = ashp;
    }

    public final void a() {
        jjg jjg = asil.a;
        ashp ashp = this.a;
        int i = ashp.i;
        String str = ashp.b;
        asit asit = ashp.c;
        if (asit.a == asgb.OPERATION_STATUS_PENDING || asit.a == asgb.OPERATION_STATUS_STARTING || asit.a == asgb.OPERATION_STATUS_ACTIVE) {
            this.a.c.b();
        } else {
            ashp ashp2 = this.a;
            ((anih) ((anih) asil.a.c()).a("ashm", "a", 52, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s cannot be active, in state: %s", (Object) ashp2.b, (Object) ashp2.c.a);
        }
        this.a.d.set(2);
    }

    public final void b() {
        ashp ashp = this.a;
        int i = ashp.i;
        ((anih) ((anih) asil.a.b()).a("ashm", "b", 59, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s ERROR starting operation!", (Object) ashp.b);
        this.a.c.e();
        this.a.d.set(2);
    }
}
