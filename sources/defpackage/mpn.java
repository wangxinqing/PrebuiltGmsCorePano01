package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: mpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mpn extends mhh {
    private final mfp b;
    private final String c;
    private final mfr d;
    private final String e;

    public mpn(Context context, String str, mfp mfp, mfr mfr, String str2) {
        super(context);
        this.c = str;
        this.d = mfr;
        this.e = str2;
        this.b = mfp;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = apib.d.o();
        apgv a = mgg.a(getContext(), this.d, this.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        apib apib = (apib) o.b;
        a.getClass();
        apib.b = a;
        int i = apib.a | 1;
        apib.a = i;
        String str = this.e;
        str.getClass();
        apib.a = i | 2;
        apib.c = str;
        apib apib2 = (apib) o.i();
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.c);
            if (mhp.p == null) {
                mhp.p = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/DeleteMember", baoq.a(apib.d), baoq.a(apic.b));
            }
            apic apic = (apic) a2.a.a(mhp.p, a3, apib2, (long) mhp.b, TimeUnit.MILLISECONDS);
            mfr mfr = this.d;
            apgw apgw = apic.a;
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
