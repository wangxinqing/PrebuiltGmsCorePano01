package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: mlw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mlw extends mhh {
    private final mfp b;
    private final String c;
    private final mfr d;
    private final String e;
    private final int f;

    public mlw(Context context, String str, mfp mfp, mfr mfr, String str2, int i) {
        super(context);
        this.c = str;
        this.d = mfr;
        this.b = mfp;
        this.e = str2;
        this.f = i;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = apjo.e.o();
        apgv a = mgg.a(getContext(), this.d, this.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        apjo apjo = (apjo) o.b;
        a.getClass();
        apjo.b = a;
        int i = apjo.a | 1;
        apjo.a = i;
        String str = this.e;
        if (str != null) {
            str.getClass();
            i |= 4;
            apjo.a = i;
            apjo.d = str;
        }
        int i2 = this.f;
        if (i2 != 0) {
            apjo.c = i2 - 1;
            apjo.a = i | 2;
        }
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.c);
            apjo apjo2 = (apjo) o.i();
            if (mhp.d == null) {
                mhp.d = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/GetFamilySetupParams", baoq.a(apjo.e), baoq.a(apjp.e));
            }
            apjp apjp = (apjp) a2.a.a(mhp.d, a3, apjo2, (long) mhp.b, TimeUnit.MILLISECONDS);
            mfr mfr = this.d;
            apgw apgw = apjp.a;
            if (apgw == null) {
                apgw = apgw.c;
            }
            mgg.a(mfr, apgw);
            return new mhg(true, apjp);
        } catch (babk | eif e2) {
            ith ith = mfv.a;
            return new mhg(false, (Object) null);
        }
    }
}
