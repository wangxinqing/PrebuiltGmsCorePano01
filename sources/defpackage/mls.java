package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: mls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mls extends mhh {
    private final mfp b;
    private final String c;
    private final mfr d;

    public mls(Context context, String str, mfp mfp, mfr mfr) {
        super(context);
        this.c = str;
        this.d = mfr;
        this.b = mfp;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = aphq.d.o();
        apgv a = mgg.a(getContext(), this.d, this.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aphq aphq = (aphq) o.b;
        a.getClass();
        aphq.b = a;
        int i = aphq.a | 1;
        aphq.a = i;
        String str = this.b.a;
        str.getClass();
        aphq.a = i | 2;
        aphq.c = str;
        aphq aphq2 = (aphq) o.i();
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.c);
            if (mhp.w == null) {
                mhp.w = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/CloneFamilyProductCorrelationIdState", baoq.a(aphq.d), baoq.a(aphr.b));
            }
            aphr aphr = (aphr) a2.a.a(mhp.w, a3, aphq2, (long) mhp.b, TimeUnit.MILLISECONDS);
            String valueOf = String.valueOf(aphr);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Clone family product correlation id: ");
            sb.append(valueOf);
            sb.toString();
            ith ith = mfv.a;
            mfr mfr = this.d;
            apgw apgw = aphr.a;
            if (apgw == null) {
                apgw = apgw.c;
            }
            mgg.a(mfr, apgw);
            return new mhg(true, aphr);
        } catch (babk | eif e) {
            ith ith2 = mfv.a;
            return new mhg(false, (Object) null);
        }
    }
}
