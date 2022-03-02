package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.Arrays;

/* renamed from: aegb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aegb {
    public static byte[] a(Context context) {
        String str;
        Account[] accountsByType = AccountManager.get(context).getAccountsByType("com.google");
        if (accountsByType.length > 0) {
            str = accountsByType[0].name;
        } else {
            str = null;
        }
        if (str != null) {
            byte[] b = anln.d().a(ampw.a(str).getBytes()).b();
            ((anih) ((anih) aehd.a.d()).a("aegb", "a", 61, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairPrototype: generate account hash %s [%s]", (Object) str, (Object) anml.g.a(b, 12));
            return Arrays.copyOf(b, 12);
        }
        ((anih) ((anih) aehd.a.d()).a("aegb", "a", 55, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairPrototype: no account");
        return Arrays.copyOf(aeev.a(), 12);
    }

    public static byte[] a(byte[] bArr, String str) {
        return aooa.a(new byte[]{4}, anml.g.b((CharSequence) ampw.b(str)), bArr);
    }
}
