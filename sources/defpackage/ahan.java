package defpackage;

import android.accounts.Account;
import android.net.Uri;
import java.io.FileNotFoundException;

/* renamed from: ahan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahan implements agzt {
    private final agzs a;
    private final Uri b;

    public ahan(agzs agzs, Uri uri) {
        this.a = agzs;
        this.b = uri;
    }

    public final aorr a(Account account) {
        try {
            Integer a2 = agzu.a((auik) this.a.a(this.b, new ahci((auef) auik.d.c(7)), new agzk[0]), account);
            if (a2 != null) {
                return aorl.a((Object) a2);
            }
            throw new ahbf("Account not found");
        } catch (FileNotFoundException e) {
            throw new ahbf("Account not found", e);
        } catch (Exception e2) {
            return aorl.a((Throwable) e2);
        }
    }
}
