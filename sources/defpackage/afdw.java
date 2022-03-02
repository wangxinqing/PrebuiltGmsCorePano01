package defpackage;

import android.accounts.Account;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: afdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afdw implements Callable {
    public final aukh a;
    private final aesl b;
    private final afeb c;
    private final String d;
    private final Account e;
    private final aukf f;

    public afdw(aesl aesl, afeb afeb, String str, Account account, aukh aukh, aukf aukf) {
        this.b = aesl;
        this.c = afeb;
        this.d = str;
        this.e = account;
        this.a = aukh;
        this.f = aukf;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return null;
    }

    public final void a() {
        try {
            this.c.a(this.d, this.e, this.a, afgu.a(this.b), this.f);
        } catch (afdy e2) {
            throw new aepg(3, String.format(Locale.ENGLISH, "Failed to set/update subscription for app=%s on %s", new Object[]{this.d, this.a}), e2);
        }
    }
}
