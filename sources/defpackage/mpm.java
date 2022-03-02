package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: mpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mpm extends mhh {
    private final mfp b;
    private final String c;
    private final mfr d;
    private final String e;

    public mpm(Context context, String str, mfp mfp, mfr mfr, String str2) {
        super(context);
        this.c = str;
        this.d = mfr;
        this.e = str2;
        this.b = mfp;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = aphz.d.o();
        apgv a = mgg.a(getContext(), this.d, this.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aphz aphz = (aphz) o.b;
        a.getClass();
        aphz.b = a;
        int i = aphz.a | 1;
        aphz.a = i;
        String str = this.e;
        if (str != null) {
            str.getClass();
            aphz.a = i | 2;
            aphz.c = str;
        }
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.c);
            aphz aphz2 = (aphz) o.i();
            if (mhp.o == null) {
                mhp.o = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/DeleteInvitation", baoq.a(aphz.d), baoq.a(apia.b));
            }
            apia apia = (apia) a2.a.a(mhp.o, a3, aphz2, (long) mhp.b, TimeUnit.MILLISECONDS);
            mfr mfr = this.d;
            apgw apgw = apia.a;
            if (apgw == null) {
                apgw = apgw.c;
            }
            mgg.a(mfr, apgw);
            return true;
        } catch (babk | eif e2) {
            ith ith = mfv.a;
            return false;
        }
    }
}
