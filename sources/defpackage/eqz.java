package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: eqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqz extends nis {
    private static final long a = TimeUnit.MINUTES.toMillis(5);
    private final ifu b;
    private final Account c;
    private final boolean d;

    public eqz(ifu ifu, Account account, boolean z) {
        super(153, "UpdateHideDmNotifications");
        this.b = ifu;
        this.c = account;
        this.d = z;
    }

    public final void a(Context context) {
        if (jhg.b()) {
            if (this.d) {
                ((eny) eny.a.b()).b(this.c, eqb.o, Long.valueOf(System.currentTimeMillis() + a));
            } else {
                ((eny) eny.a.b()).b(this.c, eqb.o, (Object) null);
            }
            this.b.a(Status.a);
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(40);
        sb.append("Caller is not zeroparty. UID=");
        sb.append(callingUid);
        throw new SecurityException(sb.toString());
    }

    public final void a(Status status) {
        this.b.a(status);
    }
}
