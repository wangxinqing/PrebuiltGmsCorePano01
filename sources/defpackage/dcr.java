package defpackage;

/* renamed from: dcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dcr implements czc {
    private final dcv a;
    private final aqsr b;
    private final aqsr c;

    public dcr(dcv dcv, aqsr aqsr, aqsr aqsr2) {
        this.a = dcv;
        this.b = aqsr;
        this.c = aqsr2;
    }

    public final void a(boolean z) {
        dcv dcv = this.a;
        aqsr aqsr = this.b;
        aqsr aqsr2 = this.c;
        if (z) {
            dcv.a.a(aqsr, aqsr2);
            dcv.b = true;
        }
    }
}
