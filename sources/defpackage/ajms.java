package defpackage;

import android.accounts.Account;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;

/* renamed from: ajms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajms {
    public final Account a;
    public Long b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Long g;
    public Integer h;
    public Boolean i;
    public String j;
    public Boolean k;
    public String l;
    public Conditions m;
    public Integer n;
    public String o;
    public Long p;
    public Long q;
    public Boolean r;
    public Integer s;

    public ajms(Account account) {
        iva.a((Object) account, (Object) "null account");
        this.a = account;
    }

    public final AccountConfig a() {
        return new AccountConfig(this);
    }

    public final void a(int i2) {
        this.n = Integer.valueOf(i2);
    }

    public final void a(boolean z) {
        this.f = Boolean.valueOf(z);
    }
}
