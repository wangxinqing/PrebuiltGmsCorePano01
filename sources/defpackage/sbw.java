package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sbw {
    public static final Map a = new HashMap();
    public final Context b;

    public sbw(Context context) {
        this.b = context;
    }

    public static String a(String str, String str2, Account account) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        String sb2 = sb.toString();
        if (account == null) {
            return sb2;
        }
        String valueOf = String.valueOf(sb2);
        String str3 = account.name;
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str3).length());
        sb3.append(valueOf);
        sb3.append("-");
        sb3.append(str3);
        return sb3.toString();
    }
}
