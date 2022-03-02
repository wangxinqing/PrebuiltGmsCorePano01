package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: afto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afto {
    private final Context a;
    private final aftr b;

    public afto(Context context, aftr aftr) {
        this.a = context;
        this.b = aftr;
    }

    public final aftn a() {
        Context context = this.a;
        avrp avrp = avrp.MDI_SYNC_COMPONENTS_VERBOSE;
        return new aftn(new hol(context, avrp.name(), (String) null), this.b);
    }

    public final aftn a(Account account) {
        Context context = this.a;
        avrp avrp = avrp.MDI_SYNC_COMPONENTS_GAIA;
        return new aftn(new hol(context, avrp.name(), account.name), this.b);
    }
}
