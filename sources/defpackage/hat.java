package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.List;

/* renamed from: hat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hat {
    private static final iwd a = gzk.a("AccountModule");

    public static List a(Context context, amzy amzy) {
        amzt j = amzy.j();
        anhk i = amzy.listIterator();
        while (i.hasNext()) {
            Account account = (Account) i.next();
            String str = null;
            try {
                str = eig.b(context, account, "AndroidCheckInServer");
            } catch (eiu e) {
                a.d("awaiting user notification for token", new Object[0]);
            } catch (eif e2) {
                a.e("Unrecoverable authentication exception: %s.", e2, e2.getMessage());
            } catch (IOException e3) {
                a.d("error reading account token", e3, new Object[0]);
            }
            String str2 = account.name;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2);
            sb.append("[");
            sb.append(str2);
            sb.append("]");
            j.c(sb.toString());
            if (str != null && !str.isEmpty()) {
                j.c(str);
            }
        }
        if (amzy.isEmpty()) {
            j.c("");
        }
        return j.a();
    }
}
