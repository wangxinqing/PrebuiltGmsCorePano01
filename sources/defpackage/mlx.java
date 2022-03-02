package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: mlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mlx extends mhh {
    private final mfp b;
    private final String c;
    private final adxa d;
    private final WalletCustomTheme e;
    private final mfr f;
    private final String g;
    private final int h;

    public mlx(Context context, String str, mfp mfp, adxa adxa, WalletCustomTheme walletCustomTheme, mfr mfr, String str2, int i) {
        super(context);
        this.c = str;
        this.d = adxa;
        this.e = walletCustomTheme;
        this.f = mfr;
        this.b = mfp;
        this.g = str2;
        this.h = i;
    }

    /* renamed from: a */
    public final mhg loadInBackground() {
        try {
            byte[] bArr = (byte[]) acws.a(this.d.a(new GetClientTokenRequest(this.e)), 2, TimeUnit.SECONDS);
            aucd o = apjq.f.o();
            apgv a = mgg.a(getContext(), this.f, this.b);
            if (o.c) {
                o.c();
                o.c = false;
            }
            apjq apjq = (apjq) o.b;
            a.getClass();
            apjq.b = a;
            apjq.a |= 1;
            String encodeToString = Base64.encodeToString(bArr, 11);
            if (o.c) {
                o.c();
                o.c = false;
            }
            apjq apjq2 = (apjq) o.b;
            encodeToString.getClass();
            int i = apjq2.a | 8;
            apjq2.a = i;
            apjq2.e = encodeToString;
            String str = this.g;
            if (str != null) {
                str.getClass();
                i |= 4;
                apjq2.a = i;
                apjq2.d = str;
            }
            int i2 = this.h;
            if (i2 != 0) {
                apjq2.c = i2 - 1;
                apjq2.a = i | 2;
            }
            try {
                mhp a2 = mgk.a();
                ClientContext a3 = mgk.a(this.c);
                apjq apjq3 = (apjq) o.i();
                if (mhp.g == null) {
                    mhp.g = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/GetFamilyUpgradeParams", baoq.a(apjq.f), baoq.a(apjr.d));
                }
                apjr apjr = (apjr) a2.a.a(mhp.g, a3, apjq3, (long) mhp.b, TimeUnit.MILLISECONDS);
                mfr mfr = this.f;
                apgw apgw = apjr.a;
                if (apgw == null) {
                    apgw = apgw.c;
                }
                mgg.a(mfr, apgw);
                return new mhg(true, apjr);
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
