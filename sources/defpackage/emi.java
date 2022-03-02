package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: emi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class emi {
    public static avpo a(Context context, Account account) {
        try {
            String packageName = context.getPackageName();
            String lowerCase = jhg.e(context, packageName).toLowerCase(Locale.US);
            String str = (String) ((eny) eny.a.b()).a(account, eqb.a);
            if (!TextUtils.isEmpty(str)) {
                aucd o = avpo.e.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avpo avpo = (avpo) o.b;
                str.getClass();
                int i = avpo.a | 1;
                avpo.a = i;
                avpo.b = str;
                packageName.getClass();
                int i2 = i | 2;
                avpo.a = i2;
                avpo.c = packageName;
                lowerCase.getClass();
                avpo.a = i2 | 4;
                avpo.d = lowerCase;
                return (avpo) o.i();
            }
            throw new emh("Account has no password.");
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException();
        }
    }
}
