package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: ezw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ezw implements ax {
    private final ezz a;

    public ezw(ezz ezz) {
        this.a = ezz;
    }

    public final void a(Object obj) {
        ezz ezz = this.a;
        pzd pzd = (pzd) obj;
        int i = pzd.a;
        if (i == -1) {
            Bundle extras = pzd.b.getExtras();
            if (extras == null) {
                return;
            }
            if (extras.containsKey("errorMessage")) {
                String string = extras.getString("errorMessage");
                ezz.a.d(string, new Object[0]);
                ezz.b.a(new fbm(new Status(13, string), ampu.a));
            } else if (extras.getBoolean("pickedFromAccountChips", false)) {
                String string2 = extras.getString("authAccount");
                String string3 = extras.getString("accountType");
                fbn fbn = ezz.b;
                fbn.d.c(new Account(string2, string3));
            }
        } else if (i == 0) {
            ezz.b.a(new fbm(Status.e, ampu.a));
        } else if (i == 10) {
            ezz.a.d("No account was found and not allowed to add a new one", new Object[0]);
            ezz.b.a(new fbm(new Status(16, "No account was found and not allowed to add a new one"), ampu.a));
        }
    }
}
