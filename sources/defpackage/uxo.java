package defpackage;

/* renamed from: uxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uxo implements asgs {
    final /* synthetic */ uxp a;
    private boolean b = false;

    public uxo(uxp uxp) {
        this.a = uxp;
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        asfz asfz = ((aseq) audx).b;
        if (asfz == null) {
            asfz = asfz.d;
        }
        asgb a2 = asgb.a(asfz.c);
        if (a2 == null) {
            a2 = asgb.OPERATION_STATUS_UNKNOWN;
        }
        if (a2 == asgb.OPERATION_STATUS_ACTIVE && !this.b) {
            uxp uxp = this.a;
            if (uxp.d != null) {
                uxp.e.e.c(new uxn(this, "AdvertiseSuccess"));
                this.b = true;
            }
        }
    }
}
