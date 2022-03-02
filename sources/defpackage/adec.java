package defpackage;

import android.accounts.Account;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: adec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class adec implements Callable {
    private final aded a;
    private final Account b;

    public adec(aded aded, Account account) {
        this.a = aded;
        this.b = account;
    }

    public final Object call() {
        aded aded = this.a;
        Account account = this.b;
        ahei ahei = aded.b;
        Uri build = new Uri.Builder().scheme("android").authority(aded.a.getPackageName()).path(String.format("/%s/%s/%s/%s/%s", new Object[]{"files", aded.a(), eim.f(aded.a, account.name), 1, "acr.pb"})).build();
        ahee g = ahef.g();
        g.a(build);
        g.a((audx) acyb.d);
        g.a((ahfm) ahdp.a);
        return new adeb(ahei.a(g.a()));
    }
}
