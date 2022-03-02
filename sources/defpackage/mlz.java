package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: mlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mlz extends mhh {
    private final mfp b;
    private final String c;
    private final mfr d;
    private final Calendar e;

    public mlz(Context context, String str, mfp mfp, mfr mfr, Calendar calendar) {
        super(context);
        this.c = str;
        this.d = mfr;
        this.e = calendar;
        this.b = mfp;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = apkq.f.o();
        apgv a = mgg.a(getContext(), this.d, this.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        apkq apkq = (apkq) o.b;
        a.getClass();
        apkq.b = a;
        apkq.a |= 1;
        int i = this.e.get(2);
        if (o.c) {
            o.c();
            o.c = false;
        }
        apkq apkq2 = (apkq) o.b;
        apkq2.a |= 4;
        apkq2.d = i;
        int i2 = this.e.get(5);
        if (o.c) {
            o.c();
            o.c = false;
        }
        apkq apkq3 = (apkq) o.b;
        apkq3.a = 2 | apkq3.a;
        apkq3.c = i2;
        int i3 = this.e.get(1);
        if (o.c) {
            o.c();
            o.c = false;
        }
        apkq apkq4 = (apkq) o.b;
        apkq4.a |= 8;
        apkq4.e = i3;
        apkq apkq5 = (apkq) o.i();
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.c);
            if (mhp.u == null) {
                mhp.u = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/SetBirthday", baoq.a(apkq.f), baoq.a(apkr.g));
            }
            apkr apkr = (apkr) a2.a.a(mhp.u, a3, apkq5, (long) mhp.b, TimeUnit.MILLISECONDS);
            mfr mfr = this.d;
            apgw apgw = apkr.b;
            if (apgw == null) {
                apgw = apgw.c;
            }
            mgg.a(mfr, apgw);
            return new mhg(true, apkr);
        } catch (babk | eif e2) {
            ith ith = mfv.a;
            return new mhg(false, (Object) null);
        }
    }
}
