package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: mlr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mlr extends mhh {
    private final mfp b;
    private final String c;
    private final mfr d;

    public mlr(Context context, String str, mfp mfp, mfr mfr) {
        super(context);
        this.c = str;
        this.d = mfr;
        this.b = mfp;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = aphf.c.o();
        apgv a = mgg.a(getContext(), this.d, this.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aphf aphf = (aphf) o.b;
        a.getClass();
        aphf.b = a;
        aphf.a |= 1;
        aphf aphf2 = (aphf) o.i();
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.c);
            if (mhp.c == null) {
                mhp.c = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/CanCreateFamily", baoq.a(aphf.c), baoq.a(aphh.g));
            }
            aphh aphh = (aphh) a2.a.a(mhp.c, a3, aphf2, (long) mhp.b, TimeUnit.MILLISECONDS);
            String valueOf = String.valueOf(aphh);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Can Create Family response: ");
            sb.append(valueOf);
            sb.toString();
            ith ith = mfv.a;
            mfr mfr = this.d;
            apgw apgw = aphh.b;
            if (apgw == null) {
                apgw = apgw.c;
            }
            mgg.a(mfr, apgw);
            return new mhg(true, aphh);
        } catch (babk | eif e) {
            ith ith2 = mfv.a;
            return new mhg(false, (Object) null);
        }
    }
}
