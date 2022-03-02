package defpackage;

/* renamed from: agsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agsf {
    private final amsv a;
    private final atws b;
    private final afts c;

    public agsf(amsv amsv, afts afts, atws atws) {
        this.a = amta.a(amsv);
        this.c = afts;
        this.b = atws;
    }

    public final void a(int i, long j, int i2) {
        a(i, false, j, i2, (atvr) null, (Boolean) null, (Boolean) null);
    }

    public final void a(int i, boolean z, long j, int i2, atvr atvr, Boolean bool, Boolean bool2) {
        if (azre.a.a().c()) {
            long d = azre.a.a().d();
            if (this.c.a(d)) {
                aucd o = atvs.h.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atvs atvs = (atvs) o.b;
                int i3 = atvs.a | 1;
                atvs.a = i3;
                atvs.b = z;
                int i4 = i3 | 4;
                atvs.a = i4;
                atvs.d = j;
                if (i2 != 0) {
                    atvs.c = i2 - 1;
                    i4 |= 2;
                    atvs.a = i4;
                }
                if (atvr != null) {
                    atvs.e = atvr.e;
                    atvs.a = i4 | 8;
                }
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    atvs atvs2 = (atvs) o.b;
                    atvs2.a |= 16;
                    atvs2.f = booleanValue;
                }
                if (bool2 != null) {
                    boolean booleanValue2 = bool2.booleanValue();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    atvs atvs3 = (atvs) o.b;
                    atvs3.a |= 32;
                    atvs3.g = booleanValue2;
                }
                agoo agoo = (agoo) this.a.a();
                aucd o2 = atwz.h.o();
                int i5 = (int) d;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                atwz atwz = (atwz) o2.b;
                int i6 = atwz.a | 64;
                atwz.a = i6;
                atwz.d = i5;
                atws atws = this.b;
                atws.getClass();
                atwz.e = atws;
                atwz.a = i6 | 128;
                atvs atvs4 = (atvs) o.i();
                atvs4.getClass();
                atwz.c = atvs4;
                atwz.b = 8;
                agoo.a(i, (atwz) o2.i());
            }
        }
    }
}
