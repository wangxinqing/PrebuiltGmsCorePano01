package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: eoi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eoi extends epg implements niz {
    private final nix a;
    private final fze b;
    private final fze c;
    private final hya d;
    private final fys e;
    private final ese f;
    private final jnh g;
    private final fyi h;
    private final ekq i;

    public eoi(nix nix, fze fze, fze fze2, hya hya, fys fys, ese ese, jnh jnh, fyi fyi, ekq ekq) {
        this.a = nix;
        this.b = fze;
        this.c = fze2;
        this.d = hya;
        this.e = fys;
        this.f = ese;
        this.g = jnh;
        this.h = fyi;
        this.i = ekq;
    }

    public final void a(eom eom, Account account) {
        int callingUid = Binder.getCallingUid();
        if (this.e.b(callingUid) || this.d.a(callingUid)) {
            this.a.a(new eqx(eom, account));
        } else {
            eom.a(Status.e, (Bundle) null);
        }
    }

    public final void a(eom eom, String str) {
        int callingUid = Binder.getCallingUid();
        String[] a2 = this.g.a(callingUid);
        if (a2 != null) {
            int length = a2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (a2[i2].equals(str)) {
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        eom.a(new Status(10), esf.a());
        this.a.a(new eqy(eom, this.f, this.d.a(callingUid), str));
    }

    public final void a(eoq eoq, AccountChangeEventsRequest accountChangeEventsRequest) {
        this.a.a(new eqn(eoq, this.b, accountChangeEventsRequest));
    }

    public final void a(eov eov, GetAccountsRequest getAccountsRequest) {
        if (this.d.a(Binder.getCallingUid())) {
            this.a.a(new eqr(eov, getAccountsRequest));
        } else {
            eov.a(Status.e, (List) null);
        }
    }

    public final void a(epe epe, Account account, String str, Bundle bundle) {
        int callingUid = Binder.getCallingUid();
        epe epe2 = epe;
        Account account2 = account;
        String str2 = str;
        Bundle bundle2 = bundle;
        this.a.a(new eqw(epe2, this.b, account2, str2, bundle2, this.h, this.g, this.i, callingUid, this.d.a(callingUid)));
    }

    public final void a(ifu ifu, ClearTokenRequest clearTokenRequest) {
        this.a.a(new eql(ifu, clearTokenRequest));
    }
}
