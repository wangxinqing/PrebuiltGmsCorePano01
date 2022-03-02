package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: fho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fho extends ftn implements niz {
    public static final iwd a = ehv.b("IdentityGisInternalServiceImpl");
    private final Context b;
    private final fcy c = ((fcy) fcy.a.a());
    private final fsi d;

    public fho(Context context, fsi fsi) {
        this.b = context;
        this.d = fsi;
    }

    private final void a(fcu fcu, ifu ifu, String str) {
        aorl.a(this.c.a(fcu, str), new fhn(ifu), aoqm.a);
    }

    public final void b(ifu ifu, String str, String str2) {
        a((fcu) new fin(str2), ifu, str);
    }

    public final void b(ifu ifu, String str, String str2, Account account) {
        a((fcu) new fir(this.b, str2, account), ifu, str);
    }

    public final void a(ftc ftc, String str, BeginSignInRequest beginSignInRequest, InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        aorl.a(this.c.a(new fhh(this.b, str, beginSignInRequest, internalSignInCredentialWrapper), (String) amrh.a(beginSignInRequest.c, this.d.a)), new fhk(ftc), aoqm.a);
    }

    public final void a(fth fth, String str, String str2) {
        try {
            fth.a(Status.a, (SaveAccountLinkingTokenRequest) ((fhd) fhd.a.a()).b.get(new fhc(str, str2)));
        } catch (RemoteException e) {
            a.e("Unable to return the success result to the caller", e, new Object[0]);
        }
    }

    public final void a(ftk ftk, String str, String str2) {
        aorl.a(this.c.a(new fhi(this.b, str2), str), new fhm(ftk), aoqm.a);
    }

    public final void a(ftr ftr, String str, BeginSignInRequest beginSignInRequest) {
        aorl.a(this.c.a(new fib(this.b, str, beginSignInRequest), (String) amrh.a(beginSignInRequest.c, this.d.a)), new fhj(ftr), aoqm.a);
    }

    public final void a(ftu ftu, SavePasswordRequest savePasswordRequest, String str) {
        aorl.a(this.c.a(new fik(this.b, str, savePasswordRequest), (String) amrh.a(savePasswordRequest.b, this.d.a)), new fhl(ftu), aoqm.a);
    }

    public final void a(ifu ifu, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str, Account account, String str2) {
        a((fcu) new fhg(this.b, str2, account, saveAccountLinkingTokenRequest, str), ifu, saveAccountLinkingTokenRequest.e);
    }

    public final void a(ifu ifu, SavePasswordRequest savePasswordRequest, List list, String str) {
        a((fcu) new fiq(this.b, list, savePasswordRequest, str), ifu, (String) amrh.a(savePasswordRequest.b, this.d.a));
    }

    public final void a(ifu ifu, String str, String str2) {
        a((fcu) new fil(str2), ifu, str);
    }

    public final void a(ifu ifu, String str, String str2, Account account) {
        a((fcu) new fim(this.b, str2, account), ifu, str);
    }
}
