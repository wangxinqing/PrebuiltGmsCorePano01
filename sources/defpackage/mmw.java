package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: mmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mmw extends mhh {
    private final mfp b;
    private final String c;
    private final mfr d;
    private final boolean e = true;
    private final boolean f;

    public mmw(Context context, String str, mfp mfp, mfr mfr, boolean z) {
        super(context);
        this.c = str;
        this.d = mfr;
        this.b = mfp;
        this.f = z;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = apjb.f.o();
        apgv a = mgg.a(getContext(), this.d, this.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        apjb apjb = (apjb) o.b;
        a.getClass();
        apjb.b = a;
        int i = apjb.a | 1;
        apjb.a = i;
        if (this.e) {
            i |= 2;
            apjb.a = i;
            apjb.c = true;
        }
        int i2 = i | 4;
        apjb.a = i2;
        apjb.d = true;
        boolean z = this.f;
        apjb.a = i2 | 8;
        apjb.e = z;
        apjb apjb2 = (apjb) o.i();
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.c);
            if (mhp.q == null) {
                mhp.q = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/GetFamilyManagementConfig", baoq.a(apjb.f), baoq.a(apjc.d));
            }
            apjc apjc = (apjc) a2.a.a(mhp.q, a3, apjb2, (long) mhp.b, TimeUnit.MILLISECONDS);
            mfr mfr = this.d;
            apgw apgw = apjc.b;
            if (apgw == null) {
                apgw = apgw.c;
            }
            mgg.a(mfr, apgw);
            if (apjc != null && (apjc.a & 2) != 0) {
                return new mhg(true, apjc);
            }
            String valueOf = String.valueOf(apjc);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Unexpected null AppConfig ");
            sb.append(valueOf);
            sb.toString();
            ith ith = mfv.a;
            return new mhg(false, (Object) null);
        } catch (babk | eif e2) {
            ith ith2 = mfv.a;
            return new mhg(false, (Object) null);
        }
    }
}
