package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzs {
    public static String a(Context context, HelpConfig helpConfig, List list) {
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(nzq.a(context, helpConfig, "google_account_name_hash", "")));
            for (int i = 0; i < list.size(); i++) {
                String str = ((Account) list.get(i)).name;
                if (str.hashCode() == valueOf.intValue()) {
                    return str;
                }
            }
            return "";
        } catch (NumberFormatException e) {
            return "";
        }
    }

    public static List a(Context context) {
        try {
            return jgu.d(context, "com.google.android.gms");
        } catch (Exception e) {
            return new ArrayList();
        }
    }

    public static void a(Context context, HelpConfig helpConfig) {
        if (helpConfig != null && helpConfig.d == null) {
            List a = a(context);
            if (!a.isEmpty() && !a(context, helpConfig, a(context, helpConfig, a))) {
                a(context, helpConfig, ((Account) a.get(0)).name);
            }
        }
    }

    public static boolean a(Context context, HelpConfig helpConfig, String str) {
        String str2;
        if (helpConfig != null) {
            Account account = helpConfig.d;
            if (account != null) {
                str2 = account.name;
            } else {
                str2 = "";
            }
            if (!str.equals(str2)) {
                if (!TextUtils.isEmpty(str)) {
                    List a = a(context);
                    for (int i = 0; i < a.size(); i++) {
                        Account account2 = (Account) a.get(i);
                        if (account2.name.equals(str)) {
                            helpConfig.d = account2;
                            Account account3 = helpConfig.d;
                            if (account3 != null) {
                                String num = Integer.valueOf(account3.name.hashCode()).toString();
                                nzp a2 = new nzr(context, helpConfig).a();
                                a2.a("google_account_name_hash", num);
                                a2.a();
                            }
                            return true;
                        }
                    }
                    return false;
                }
                helpConfig.d = null;
                nzq.a(context, helpConfig, "google_account_name_hash");
                return true;
            }
        }
        return false;
    }
}
