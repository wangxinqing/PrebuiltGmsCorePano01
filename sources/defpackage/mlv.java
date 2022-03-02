package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: mlv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mlv extends mhh {
    private final mfp b;
    private final String c;
    private final mfr d;
    private final String e;
    private final byte[] f;

    public mlv(Context context, String str, mfp mfp, mfr mfr, String str2, byte[] bArr) {
        super(context);
        this.c = str;
        this.d = mfr;
        this.b = mfp;
        this.e = str2;
        this.f = bArr;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = apji.e.o();
        apgv a = mgg.a(getContext(), this.d, this.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        apji apji = (apji) o.b;
        a.getClass();
        apji.b = a;
        apji.a |= 1;
        aucd o2 = aphb.c.o();
        aucd o3 = apha.c.o();
        String b2 = jhy.b(this.f);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        apha apha = (apha) o3.b;
        b2.getClass();
        apha.a = 2;
        apha.b = b2;
        apha apha2 = (apha) o3.i();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aphb aphb = (aphb) o2.b;
        apha2.getClass();
        aphb.b = apha2;
        aphb.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        apji apji2 = (apji) o.b;
        aphb aphb2 = (aphb) o2.i();
        aphb2.getClass();
        apji2.d = aphb2;
        apji2.a |= 4;
        String str = this.e;
        if (str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            apji apji3 = (apji) o.b;
            str.getClass();
            apji3.a |= 2;
            apji3.c = str;
        }
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.c);
            apji apji4 = (apji) o.i();
            if (mhp.r == null) {
                mhp.r = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/GetFamilyOnboardFlowConfig", baoq.a(apji.e), baoq.a(apjl.i));
            }
            apjl apjl = (apjl) a2.a.a(mhp.r, a3, apji4, (long) mhp.b, TimeUnit.MILLISECONDS);
            mfr mfr = this.d;
            apgw apgw = apjl.b;
            if (apgw == null) {
                apgw = apgw.c;
            }
            mgg.a(mfr, apgw);
            return new mhg(true, apjl);
        } catch (babk | eif e2) {
            ith ith = mfv.a;
            return new mhg(false, (Object) null);
        }
    }
}
