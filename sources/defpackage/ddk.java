package defpackage;

/* renamed from: ddk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ddk extends aud {
    final /* synthetic */ ddp a;

    public ddk(ddp ddp) {
        this.a = ddp;
    }

    public final void a(int i) {
        int i2;
        ddp ddp = this.a;
        if (i == ddp.d.c()) {
            i2 = 2;
        } else {
            i2 = 6;
        }
        if (!ddp.g && i >= 0 && i < ddp.f.size()) {
            aqsr c = ((dhp) ddp.f.get(i)).c();
            dhr dhr = ddp.a;
            dhr.b.a(ddp.c, c, i2);
        }
    }

    public final void a(int i, float f) {
        int i2;
        ddp ddp = this.a;
        if (!ddp.g && i >= 0 && i < ddp.f.size()) {
            aqsr c = ((dhp) ddp.f.get(i)).c();
            if (!ius.a(c, ddp.c)) {
                ddp.a.a(c);
            }
            if (f != 0.0f && (i2 = i + 1) < ddp.f.size()) {
                aqsr c2 = ((dhp) ddp.f.get(i2)).c();
                if (!ius.a(c2, ddp.c)) {
                    ddp.a.a(c2);
                }
            }
        }
    }
}
