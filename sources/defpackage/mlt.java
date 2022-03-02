package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.family.v2.model.SetupParams;
import java.util.concurrent.TimeUnit;

/* renamed from: mlt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mlt extends mhh {
    private final mfp b;
    private final String c;
    private final mfr d;
    private final SetupParams e;
    private final byte[] f;

    public mlt(Context context, String str, mfp mfp, mfr mfr, SetupParams setupParams, byte[] bArr) {
        super(context);
        this.c = str;
        this.d = mfr;
        this.b = mfp;
        this.e = setupParams;
        this.f = bArr;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        String str;
        aucd o = apht.e.o();
        apgv a = mgg.a(getContext(), this.d, this.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        apht apht = (apht) o.b;
        a.getClass();
        apht.b = a;
        apht.a |= 1;
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
        apht apht2 = (apht) o.b;
        aphb aphb2 = (aphb) o2.i();
        aphb2.getClass();
        apht2.d = aphb2;
        apht2.a |= 4;
        aucd o4 = apio.c.o();
        SetupParams setupParams = this.e;
        if (!(setupParams == null || (str = setupParams.b) == null)) {
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            apio apio = (apio) o4.b;
            str.getClass();
            apio.a |= 1;
            apio.b = str;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        apht apht3 = (apht) o.b;
        apio apio2 = (apio) o4.i();
        apio2.getClass();
        apht3.c = apio2;
        apht3.a |= 2;
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.c);
            apht apht4 = (apht) o.i();
            if (mhp.e == null) {
                mhp.e = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/CreateFamily", baoq.a(apht.e), baoq.a(aphu.b));
            }
            aphu aphu = (aphu) a2.a.a(mhp.e, a3, apht4, (long) mhp.b, TimeUnit.MILLISECONDS);
            mfr mfr = this.d;
            apgw apgw = aphu.a;
            if (apgw == null) {
                apgw = apgw.c;
            }
            mgg.a(mfr, apgw);
            return new mhg(true, aphu);
        } catch (babk | eif e2) {
            ith ith = mfv.a;
            return new mhg(false, (Object) null);
        }
    }
}
