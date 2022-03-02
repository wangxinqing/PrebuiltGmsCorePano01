package defpackage;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.auth.account.visibility.RequestAccountsAccessChimeraActivity;
import java.util.Map;

/* renamed from: ese  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ese {
    public static final iwd a = ehv.a("AccountVisibility");
    public static final fzh d = new esd();
    public final qub b;
    public final eny c;

    public ese(qub qub, eny eny) {
        this.b = qub;
        this.c = eny;
    }

    public static boolean a() {
        return ent.ak() && jkr.e();
    }

    public static boolean b() {
        return ent.al() && jkr.e();
    }

    public final Bundle a(String str, boolean z) {
        if (!b()) {
            return esf.a();
        }
        if (!z) {
            try {
                if (((esj) esj.a.b()).b(str)) {
                    return esf.b();
                }
            } catch (ekp e) {
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("userRecoveryIntent", RequestAccountsAccessChimeraActivity.a());
            bundle.putString("Error", gei.NEED_PERMISSION.ac);
            return bundle;
        } else if (a(str)) {
            return esf.b();
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putString("Error", gei.INTNERNAL_ERROR.ac);
            return bundle2;
        }
    }

    public final boolean b(String str) {
        return "android:accounts:key_legacy_visible".equals(str) || "android:accounts:key_legacy_not_visible".equals(str);
    }

    public final boolean a(String str) {
        amkr a2;
        try {
            esj esj = (esj) esj.a.b();
            if (esj.b(str)) {
                return true;
            }
            qub qub = this.b;
            a2 = amlv.a("AccountManager.getAccountsAndVisibilityForPackage");
            Map<Account, Integer> accountsAndVisibilityForPackage = qub.a.getAccountsAndVisibilityForPackage(str, "com.google");
            if (a2 != null) {
                a2.close();
            }
            for (Map.Entry next : accountsAndVisibilityForPackage.entrySet()) {
                Account account = (Account) next.getKey();
                Integer num = (Integer) next.getValue();
                if (!num.equals(4)) {
                    if (!num.equals(2)) {
                        continue;
                    }
                }
                iwd iwd = a;
                String valueOf = String.valueOf(account);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(valueOf).length());
                sb.append("Setting visibility to ");
                sb.append(str);
                sb.append(" ");
                sb.append(valueOf);
                iwd.b(sb.toString(), new Object[0]);
                if (!this.b.a(account, str, 2)) {
                    return false;
                }
            }
            try {
                long a3 = esj.a(str);
                if (a3 == 0) {
                    return false;
                }
                SharedPreferences.Editor edit = esj.b.edit();
                if (a3 == 0) {
                    edit.remove(str);
                } else {
                    edit.putLong(str, a3);
                }
                return edit.commit();
            } catch (ekp e) {
                return false;
            }
        } catch (ekp e2) {
            return false;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
