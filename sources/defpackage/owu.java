package defpackage;

/* renamed from: owu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class owu extends ppr {
    final /* synthetic */ oww a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public owu(oww oww, aonk aonk, int i, String str) {
        super(aonk, 1, i, str, (psc) null);
        this.a = oww;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        boolean z;
        oww oww;
        int i;
        ows ows;
        owv owv = new owv(this.a);
        this.a.a.a(owv);
        int i2 = owv.b;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 != 0) {
            if (i3 == 1) {
                oww oww2 = this.a;
                owx owx = oww2.d;
                synchronized (owx) {
                    if (owx.d == oww2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iva.a(z);
                    if (owx.c.size() > 1) {
                        if (((Boolean) pba.c.c()).booleanValue()) {
                            if (owx.e) {
                                oww oww3 = (oww) owx.c.remove();
                                boolean a2 = oww3.a();
                                int i4 = oww3.c;
                                owm owm = (owm) oww3.a;
                                if (apms.a(owm)) {
                                    ows = new owk(owm);
                                    i = i4;
                                } else {
                                    ows = new own(owm);
                                    i = i4;
                                }
                                while (true) {
                                    oww oww4 = (oww) owx.c.peek();
                                    if (oww4 == null || oww4.a() != a2 || !ows.a(oww4.a)) {
                                        oww = new oww(aonk.BATCH_TASK, ows.a(), a2, i, owx);
                                    } else {
                                        i += oww4.c;
                                        owx.c.remove();
                                    }
                                }
                                oww = new oww(aonk.BATCH_TASK, ows.a(), a2, i, owx);
                                owx.d = oww;
                            }
                        }
                    }
                    oww = (oww) owx.c.poll();
                    owx.d = oww;
                }
                if (oww != null) {
                    owx.b.d(oww.b());
                }
                this.a.d = null;
            } else if (i3 == 2) {
                oww oww5 = this.a;
                owx owx2 = oww5.d;
                owy owy = oww5.b;
                int i5 = owy.a;
                owy.a = i5 + 1;
                double min = Math.min(Math.pow(1.5d, (double) i5) * 250.0d, 4000.0d);
                double random = Math.random();
                owx2.a(oww5, (long) (min * ((((random + random) - 4.0d) * 0.25d) + 1.0d)));
            }
            return null;
        } else {
            throw new IllegalStateException();
        }
    }
}
