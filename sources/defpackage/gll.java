package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: gll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gll {
    static final fzk a = fzk.a("account");
    static final fzk b = fzk.a("is_new_account");
    static final fzk c = fzk.a("is_setup_wizard");
    private static final iwd d = ehv.a("AddAccount", "AppPickerHelper");

    public static Intent a(Context context, Account account, boolean z, boolean z2, boolean z3, ijn ijn) {
        Bundle bundle;
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.restore.APP_PICKER_ADD_ACCOUNT");
        Intent a2 = glz.a(context, intent);
        if (a2 != null) {
            Intent putExtra = a2.putExtra("account", account);
            fzl fzl = new fzl();
            fzl.b(a, account);
            fzl.b(b, Boolean.valueOf(z));
            fzl.b(c, Boolean.valueOf(z2));
            fzl.b(gmz.j, Boolean.valueOf(z3));
            fzk fzk = gmz.i;
            if (ijn != null) {
                bundle = ijn.a();
            } else {
                bundle = null;
            }
            fzl.b(fzk, bundle);
            putExtra.putExtras(fzl.a);
        } else {
            d.c("App picker activity couldn't be resolved.", new Object[0]);
        }
        return a2;
    }

    public static boolean a(boolean z, String str, boolean z2) {
        boolean z3;
        if (!ent.az()) {
            z3 = false;
        } else {
            z3 = z ? false : !z2 && !ijk.a(str);
        }
        d.c("Showing app picker = %b", Boolean.valueOf(z3));
        return z3;
    }
}
