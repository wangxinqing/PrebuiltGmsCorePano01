package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: ffb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ffb implements ax {
    private final ffe a;

    public ffb(ffe ffe) {
        this.a = ffe;
    }

    public final void a(Object obj) {
        ffe ffe = this.a;
        pzd pzd = (pzd) obj;
        int i = pzd.a;
        if (i == -1) {
            Bundle extras = pzd.b.getExtras();
            if (extras == null) {
                return;
            }
            if (extras.containsKey("errorMessage")) {
                String string = extras.getString("errorMessage");
                ffe.a.d(string, new Object[0]);
                ffe.b.a(new fej(new Status(13, string), ampu.a));
            } else if (extras.getBoolean("pickedFromAccountChips", false)) {
                String string2 = extras.getString("authAccount");
                String string3 = extras.getString("accountType");
                fek fek = ffe.b;
                fek.e.c(new Account(string2, string3));
            }
        } else if (i == 0) {
            ffe.b.a(new fej(Status.e, ampu.a));
        } else if (i == 10) {
            ffe.a.d("No account was found and not allowed to add a new one", new Object[0]);
            ffe.b.a(new fej(new Status(16, "No account was found and not allowed to add a new one"), ampu.a));
        }
    }
}
