package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: mmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mmv extends mhh {
    private final String b;
    private final mfr c;
    private final mfp d;

    public mmv(Context context, String str, mfp mfp, mfr mfr) {
        super(context);
        this.b = str;
        this.c = mfr;
        this.d = mfp;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = apjm.f.o();
        apgv a = mgg.a(getContext(), this.c, this.d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        apjm apjm = (apjm) o.b;
        a.getClass();
        apjm.b = a;
        int i = apjm.a | 1;
        apjm.a = i;
        apjm.a = i | 2;
        apjm.c = true;
        if (axga.a.a().d()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            apjm apjm2 = (apjm) o.b;
            apjm2.a |= 8;
            apjm2.d = true;
        }
        if (axga.a.a().e()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            apjm apjm3 = (apjm) o.b;
            apjm3.a |= 16;
            apjm3.e = true;
        }
        apjm apjm4 = (apjm) o.i();
        String valueOf = String.valueOf(apjm4);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("GetFamily request: ");
        sb.append(valueOf);
        sb.toString();
        ith ith = mfv.a;
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.b);
            if (mhp.i == null) {
                mhp.i = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/GetFamily", baoq.a(apjm.f), baoq.a(apjn.j));
            }
            apjn apjn = (apjn) a2.a.a(mhp.i, a3, apjm4, (long) mhp.b, TimeUnit.MILLISECONDS);
            String valueOf2 = String.valueOf(apjn);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
            sb2.append("GetFamily response: ");
            sb2.append(valueOf2);
            sb2.toString();
            return new mhg(true, apjn);
        } catch (babk | eif e) {
            mfv.c("FamilyDataLoader", "GetFamily request failed", e);
            return new mhg(false, (Object) null);
        }
    }
}
