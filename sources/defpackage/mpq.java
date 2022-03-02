package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: mpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mpq extends mhh {
    private final String b;
    private final mfr c;
    private final mfp d;
    private final String e;
    private final apix f;

    public mpq(Context context, String str, mfp mfp, mfr mfr, String str2, apix apix) {
        super(context);
        this.b = str;
        this.d = mfp;
        this.c = mfr;
        this.e = str2;
        this.f = apix;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        aucd o = apkx.f.o();
        apgv a = mgg.a(getContext(), this.c, this.d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        apkx apkx = (apkx) o.b;
        a.getClass();
        apkx.b = a;
        int i = apkx.a | 1;
        apkx.a = i;
        int i2 = i | 8;
        apkx.a = i2;
        apkx.e = true;
        apix apix = this.f;
        if (apix != null) {
            apkx.d = apix.g;
            i2 |= 4;
            apkx.a = i2;
        }
        String str = this.e;
        if (str != null) {
            str.getClass();
            apkx.a = i2 | 2;
            apkx.c = str;
        }
        try {
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(this.b);
            apkx apkx2 = (apkx) o.i();
            if (mhp.m == null) {
                mhp.m = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/UpdateMemberRole", baoq.a(apkx.f), baoq.a(apky.b));
            }
            apky apky = (apky) a2.a.a(mhp.m, a3, apkx2, (long) mhp.b, TimeUnit.MILLISECONDS);
            mfr mfr = this.c;
            apgw apgw = apky.a;
            if (apgw == null) {
                apgw = apgw.c;
            }
            mgg.a(mfr, apgw);
            return new mhg(true, apky);
        } catch (babk | eif e2) {
            ith ith = mfv.a;
            return new mhg(false, (Object) null);
        }
    }
}
