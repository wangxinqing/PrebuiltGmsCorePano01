package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: mmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mmt extends mhh {
    private final String b;
    private final adxa c;
    private final WalletCustomTheme d;
    private final mfr e;
    private final mfp f;
    private final apix g;

    public mmt(Context context, String str, mfp mfp, adxa adxa, WalletCustomTheme walletCustomTheme, mfr mfr, apix apix) {
        super(context);
        this.b = str;
        this.c = adxa;
        this.d = walletCustomTheme;
        this.e = mfr;
        this.f = mfp;
        this.g = apix;
    }

    /* renamed from: a */
    public final mhg loadInBackground() {
        try {
            byte[] bArr = (byte[]) acws.a(this.c.a(new GetClientTokenRequest(this.d)), 2, TimeUnit.SECONDS);
            aucd o = aphc.e.o();
            apgv a = mgg.a(getContext(), this.e, this.f);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aphc aphc = (aphc) o.b;
            a.getClass();
            aphc.b = a;
            aphc.a |= 1;
            auay a2 = auay.a(bArr);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aphc aphc2 = (aphc) o.b;
            a2.getClass();
            int i = aphc2.a | 4;
            aphc2.a = i;
            aphc2.d = a2;
            apix apix = this.g;
            if (apix != null) {
                aphc2.c = apix.g;
                aphc2.a = i | 2;
            }
            try {
                mhp a3 = mgk.a();
                ClientContext a4 = mgk.a(this.b);
                aphc aphc3 = (aphc) o.i();
                if (mhp.h == null) {
                    mhp.h = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/CanAddMember", baoq.a(aphc.e), baoq.a(aphe.e));
                }
                return new mhg(true, (aphe) a3.a.a(mhp.h, a4, aphc3, (long) mhp.b, TimeUnit.MILLISECONDS));
            } catch (babk | eif e2) {
                ith ith = mfv.a;
                return new mhg(false, (Object) null);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            ith ith2 = mfv.a;
            return new mhg(false, (Object) null);
        }
    }
}
