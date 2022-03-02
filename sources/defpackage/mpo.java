package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: mpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mpo extends mhh {
    private final mfp b;
    private final String c;
    private final mfr d;
    private final String e;
    private final int f;

    public mpo(Context context, String str, mfp mfp, mfr mfr, int i, String str2) {
        super(context);
        this.c = str;
        this.d = mfr;
        this.b = mfp;
        this.f = i;
        this.e = str2;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = apjg.g.o();
        apgv a = mgg.a(getContext(), this.d, this.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        apjg apjg = (apjg) o.b;
        a.getClass();
        apjg.b = a;
        int i = apjg.a | 1;
        apjg.a = i;
        int i2 = this.f;
        if (i2 != 0) {
            apjg.c = i2 - 1;
            apjg.a = i | 2;
        }
        if (i2 == 11) {
            aucd o2 = apjf.c.o();
            String str = this.e;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            apjf apjf = (apjf) o2.b;
            str.getClass();
            apjf.a |= 1;
            apjf.b = str;
            if (o.c) {
                o.c();
                o.c = false;
            }
            apjg apjg2 = (apjg) o.b;
            apjf apjf2 = (apjf) o2.i();
            apjf2.getClass();
            apjg2.f = apjf2;
            apjg2.a |= 16;
        } else if (i2 == 10) {
            apjd apjd = apjd.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            apjg apjg3 = (apjg) o.b;
            apjd.getClass();
            apjg3.e = apjd;
            apjg3.a |= 8;
        } else if (i2 == 12) {
            apje apje = apje.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            apjg apjg4 = (apjg) o.b;
            apje.getClass();
            apjg4.d = apje;
            apjg4.a |= 4;
        }
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.c);
            apjg apjg5 = (apjg) o.i();
            if (mhp.t == null) {
                mhp.t = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/GetFamilyManagementPageContent", baoq.a(apjg.g), baoq.a(apjh.d));
            }
            apjh apjh = (apjh) a2.a.a(mhp.t, a3, apjg5, (long) mhp.b, TimeUnit.MILLISECONDS);
            mfr mfr = this.d;
            apgw apgw = apjh.b;
            if (apgw == null) {
                apgw = apgw.c;
            }
            mgg.a(mfr, apgw);
            return new mhg(true, apjh);
        } catch (babk | eif e2) {
            ith ith = mfv.a;
            return new mhg(false, (Object) null);
        }
    }
}
