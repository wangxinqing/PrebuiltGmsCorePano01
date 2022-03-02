package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: gmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gmn {
    public static Intent a(Context context, Account account, boolean z, boolean z2, boolean z3, boolean z4, ijn ijn) {
        Bundle bundle;
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.auth.addaccount.POST_ADD_ACCOUNT");
        Intent a = glz.a(context, intent);
        if (a != null) {
            Intent putExtra = a.putExtra("account", account).putExtra("is_new_account", z).putExtra("is_setup_wizard", z2).putExtra("use_immersive_mode", z3).putExtra("suppress_backup_opt_in", z4);
            if (ijn != null) {
                bundle = ijn.a();
            } else {
                bundle = null;
            }
            putExtra.putExtra("ui_parameters", bundle);
        }
        return a;
    }

    public static boolean a(boolean z, boolean z2, boolean z3) {
        return !z && !z2 && (!z3 || jkr.b());
    }
}
