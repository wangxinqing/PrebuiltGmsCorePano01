package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import java.util.List;

/* renamed from: hna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hna extends hjw implements niz {
    private final nix a;
    private final Account b;
    private final String c;
    private final Context d;

    public hna(Context context, nix nix, Account account, String str) {
        iva.a((Object) nix);
        this.a = nix;
        iva.a((Object) account);
        this.b = account;
        iva.a((Object) str);
        this.c = str;
        iva.a((Object) context);
        this.d = context;
    }

    public final void a(hju hju, int i, Bundle bundle) {
        this.a.a(new hko(hju, this.b, i, bundle));
    }

    public final void b(ifu ifu, int i, Bundle bundle, Bundle bundle2) {
        this.a.a(new hkg(ifu, this.b, i, bundle));
    }

    public final void a(hju hju, Bundle bundle) {
        this.a.a(new hkk(this.d, hju, this.b));
    }

    public final void b(ifu ifu, int i, String str, Bundle bundle) {
        this.a.a(new hks(ifu, this.c, this.b, i, str));
    }

    public final void a(hju hju, String str) {
        this.a.a(new hkl(hju, this.b, amzy.a((Object) str)));
    }

    public final void a(hju hju, List list) {
        this.a.a(new hkm(hju, this.b, list));
    }

    public final void a(hju hju, List list, Bundle bundle) {
        this.a.a(new hkl(hju, this.b, list));
    }

    public final void a(ifu ifu) {
        this.a.a(new hki(this.d, ifu, this.b));
    }

    public final void a(ifu ifu, int i) {
        this.a.a(new hkp(ifu, this.b, i));
    }

    public final void a(ifu ifu, int i, Bundle bundle, Bundle bundle2) {
        this.a.a(new hkq(ifu, this.b, i, bundle));
    }

    public final void a(ifu ifu, int i, String str, Bundle bundle) {
        this.a.a(new hkr(ifu, this.c, this.b, i, str));
    }

    public final void a(ifu ifu, Bundle bundle) {
        this.a.a(new hkt(ifu, this.b, bundle));
    }

    public final void a(ifu ifu, String str, Bundle bundle) {
        this.a.a(new hku(ifu, this.b, str));
    }
}
