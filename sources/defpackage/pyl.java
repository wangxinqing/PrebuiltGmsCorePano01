package defpackage;

import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.service.AccountDataApiService;

/* renamed from: pyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pyl extends pyp implements niz {
    private final AccountDataApiService a;
    private final nix b;

    public pyl(AccountDataApiService accountDataApiService, nix nix) {
        this.a = accountDataApiService;
        this.b = nix;
    }

    public final void a(pyo pyo, AccountData accountData) {
        this.b.a(this.a, new pyn(pyo, accountData));
    }

    public final void a(pyo pyo, byte[] bArr) {
        this.b.a(this.a, new pym(pyo, bArr));
    }
}
