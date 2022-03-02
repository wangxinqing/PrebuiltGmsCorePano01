package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: mlu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mlu extends mhh {
    private final apix b;
    private final mfp c;
    private final boolean d;
    private final String e;
    private final mfr f;

    public mlu(Context context, String str, mfp mfp, mfr mfr, apix apix, boolean z) {
        super(context);
        this.e = str;
        this.f = mfr;
        this.c = mfp;
        this.b = apix;
        this.d = z;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = apiz.e.o();
        apgv a = mgg.a(getContext(), this.f, this.c);
        if (o.c) {
            o.c();
            o.c = false;
        }
        apiz apiz = (apiz) o.b;
        a.getClass();
        apiz.b = a;
        int i = apiz.a | 1;
        apiz.a = i;
        boolean z = this.d;
        int i2 = i | 4;
        apiz.a = i2;
        apiz.d = z;
        apix apix = this.b;
        if (apix != null) {
            apiz.c = apix.g;
            apiz.a = i2 | 2;
        }
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.e);
            apiz apiz2 = (apiz) o.i();
            if (mhp.s == null) {
                mhp.s = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/GetFamilyInvitationFlowConfig", baoq.a(apiz.e), baoq.a(apja.g));
            }
            apja apja = (apja) a2.a.a(mhp.s, a3, apiz2, (long) mhp.b, TimeUnit.MILLISECONDS);
            mfr mfr = this.f;
            apgw apgw = apja.b;
            if (apgw == null) {
                apgw = apgw.c;
            }
            mgg.a(mfr, apgw);
            return new mhg(true, apja);
        } catch (babk | eif e2) {
            ith ith = mfv.a;
            return new mhg(false, (Object) null);
        }
    }
}
