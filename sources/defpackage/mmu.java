package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: mmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mmu extends mhh {
    private final mfp b;
    private final String c;
    private final adxa d;
    private final WalletCustomTheme e;
    private final mfr f;
    private final String g;
    private final int h;

    public mmu(Context context, String str, mfp mfp, adxa adxa, WalletCustomTheme walletCustomTheme, mfr mfr, String str2, int i) {
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
            aucd o = aphk.f.o();
            apgv a = mgg.a(getContext(), this.f, this.b);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aphk aphk = (aphk) o.b;
            a.getClass();
            aphk.b = a;
            aphk.a |= 1;
            auay a2 = auay.a(bArr);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aphk aphk2 = (aphk) o.b;
            a2.getClass();
            int i = aphk2.a | 8;
            aphk2.a = i;
            aphk2.e = a2;
            String str = this.g;
            if (str != null) {
                str.getClass();
                i |= 4;
                aphk2.a = i;
                aphk2.d = str;
            }
            int i2 = this.h;
            if (i2 != 0) {
                aphk2.c = i2 - 1;
                aphk2.a = i | 2;
            }
            try {
                mhp a3 = mgk.a();
                ClientContext a4 = mgk.a(this.c);
                aphk aphk3 = (aphk) o.i();
                if (mhp.f == null) {
                    mhp.f = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/CanUpgradeFamily", baoq.a(aphk.f), baoq.a(aphm.g));
                }
                aphm aphm = (aphm) a3.a.a(mhp.f, a4, aphk3, (long) mhp.b, TimeUnit.MILLISECONDS);
                mfr mfr = this.f;
                apgw apgw = aphm.a;
                if (apgw == null) {
                    apgw = apgw.c;
                }
                mgg.a(mfr, apgw);
                return new mhg(true, aphm);
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
