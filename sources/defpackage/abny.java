package defpackage;

import android.accounts.Account;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abny {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public final Map f = new HashMap();
    public abpi g;

    public final void a(Account[] accountArr) {
        iva.a((Object) accountArr, (Object) "accounts cannot be null.");
        for (Account account : accountArr) {
            this.e.add(new BootstrapAccount(account.name, account.type));
        }
    }
}
