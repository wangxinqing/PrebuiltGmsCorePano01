package defpackage;

import java.io.IOException;

/* renamed from: akml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akml {
    final /* synthetic */ akmn a;
    private final int b;

    public akml(akmn akmn, int i) {
        this.a = akmn;
        this.b = i;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        akmd akmd;
        this.a.e.a(2, 3, 1, 0);
        if (i != 1) {
            aklz.a();
        } else {
            aklz.a();
        }
        aklz.a();
        akmn akmn = this.a;
        try {
            byte[] b2 = jjt.b(akmn.i.a.a.getResources().getAssets().open("default_inference_model"));
            aucd o = assj.e.o();
            o.b(b2);
            akmd = akme.a((assj) o.i());
            aklz.a();
        } catch (IOException e) {
            akmd = null;
        }
        akmn.d = akmd;
        akmn akmn2 = this.a;
        akmd akmd2 = akmn2.d;
        if (akmd2 != null) {
            int i2 = akmd2.f;
            int i3 = i2 - 1;
            if (i2 != 0) {
                akmn akmn3 = this.a;
                akmn3.e.a(4, 2, aobp.a(i3), akmn3.d.e);
                if (azbh.b() && this.b != 1) {
                    asve asve = this.a.d.b;
                    asve[] asveArr = {asve};
                    if ((asve.a & 1) != 0 && asve.c.size() > 0) {
                        this.a.a((auac[]) asveArr);
                        akmn akmn4 = this.a;
                        akmn4.a(new akml(akmn4, 1));
                    }
                }
            } else {
                throw null;
            }
        } else {
            akmn2.e.a(4, 3, 1, 0);
        }
        if (this.b != 0) {
            this.a.e();
        }
    }

    public final void a(akmd akmd) {
        this.a.a(akmd);
        int i = akmd.f;
        int i2 = i - 1;
        if (i != 0) {
            this.a.e.a(2, 2, aobp.a(i2), akmd.e);
            this.a.b = 0;
            return;
        }
        throw null;
    }
}
