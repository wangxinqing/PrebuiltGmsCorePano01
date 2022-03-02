package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.api.Status;

/* renamed from: ghz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ghz extends nis {
    private final ghq a;
    private final Account b;
    private final gjh c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ghz(ghq ghq, String str, String str2) {
        super(136, "FetchManagingAppInfo");
        gjh a2 = gjh.a();
        this.a = ghq;
        this.b = new Account(str, str2);
        this.c = a2;
    }

    public final void a(Context context) {
        int i = Build.VERSION.SDK_INT;
        gjd a2 = this.c.a(context, this.b);
        this.a.a(a2.a, a2.b);
    }

    public final void a(Status status) {
        this.a.a(status, (byte[]) null);
    }
}
