package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: mpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mpl extends mhh {
    private final mfp b;
    private final String c;
    private final mfr d;

    public mpl(Context context, String str, mfp mfp, mfr mfr) {
        super(context);
        this.c = str;
        this.d = mfr;
        this.b = mfp;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = aphx.c.o();
        apgv a = mgg.a(getContext(), this.d, this.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aphx aphx = (aphx) o.b;
        a.getClass();
        aphx.b = a;
        aphx.a |= 1;
        aphx aphx2 = (aphx) o.i();
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.c);
            if (mhp.j == null) {
                mhp.j = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/DeleteFamily", baoq.a(aphx.c), baoq.a(aphy.d));
            }
            aphy aphy = (aphy) a2.a.a(mhp.j, a3, aphx2, (long) mhp.b, TimeUnit.MILLISECONDS);
            mfr mfr = this.d;
            apgw apgw = aphy.b;
            if (apgw == null) {
                apgw = apgw.c;
            }
            mgg.a(mfr, apgw);
            return new mhg(true, aphy);
        } catch (babk | eif e) {
            ith ith = mfv.a;
            return new mhg(false, (Object) null);
        }
    }
}
