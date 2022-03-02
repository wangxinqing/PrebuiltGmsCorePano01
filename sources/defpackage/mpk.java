package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: mpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mpk extends mhh {
    private final String b;
    private final mfr c;
    private final mfp d;
    private final String e;
    private final apix f;

    public mpk(Context context, String str, mfp mfp, mfr mfr, String str2, apix apix) {
        super(context);
        this.b = str;
        this.d = mfp;
        this.c = mfr;
        this.e = str2;
        this.f = apix;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = aphi.f.o();
        apgv a = mgg.a(getContext(), this.c, this.d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aphi aphi = (aphi) o.b;
        a.getClass();
        aphi.b = a;
        int i = aphi.a | 1;
        aphi.a = i;
        int i2 = i | 8;
        aphi.a = i2;
        aphi.e = true;
        apix apix = this.f;
        if (apix != null) {
            aphi.d = apix.g;
            i2 |= 4;
            aphi.a = i2;
        }
        String str = this.e;
        if (str != null) {
            str.getClass();
            aphi.a = i2 | 2;
            aphi.c = str;
        }
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.b);
            aphi aphi2 = (aphi) o.i();
            if (mhp.l == null) {
                mhp.l = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/CanUpdateMemberRole", baoq.a(aphi.f), baoq.a(aphj.d));
            }
            return new mhg(true, (aphj) a2.a.a(mhp.l, a3, aphi2, (long) mhp.b, TimeUnit.MILLISECONDS));
        } catch (babk | eif e2) {
            ith ith = mfv.a;
            return new mhg(false, (Object) null);
        }
    }
}
