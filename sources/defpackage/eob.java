package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;

/* renamed from: eob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eob extends eok implements niz {
    private final nix a;
    private final eqk b = new eqk();

    public eob(nix nix, fyq fyq) {
        iva.a((Object) nix);
        this.a = nix;
    }

    public final void a(eon eon, ClearTokenRequest clearTokenRequest) {
        this.a.a(new eqm(eon, this.b, clearTokenRequest));
    }

    public final void a(eoq eoq, AccountChangeEventsRequest accountChangeEventsRequest) {
        this.a.a(new eqo(eoq, this.b, accountChangeEventsRequest));
    }

    public final void a(eor eor, String str) {
        this.a.a(new eqp(eor, this.b, str));
    }

    public final void a(eos eos, Account account) {
        this.a.a(new eqq(eos, this.b, account));
    }

    public final void a(eoy eoy, Account account) {
        this.a.a(new eqs(eoy, this.b, account));
    }

    public final void a(eoz eoz, Account account) {
        this.a.a(new eqt(eoz, this.b, account));
    }

    public final void a(epa epa, TokenRequest tokenRequest) {
        this.a.a(new eqv(epa, this.b, tokenRequest));
    }

    public final void a(epb epb, String str) {
        this.a.a(new equ(epb, this.b, str));
    }

    public final void a(ifu ifu, Account account, boolean z) {
        this.a.a(new eqz(ifu, account, z));
    }
}
