package defpackage;

import android.content.Intent;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;
import com.google.android.gms.common.account.AccountTypePickerChimeraActivity;

/* renamed from: hyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class hyq implements ax {
    private final AccountPickerChimeraActivity a;

    public hyq(AccountPickerChimeraActivity accountPickerChimeraActivity) {
        this.a = accountPickerChimeraActivity;
    }

    public final void a(Object obj) {
        AccountPickerChimeraActivity accountPickerChimeraActivity = this.a;
        pzo pzo = (pzo) obj;
        if (pzo != null) {
            int i = pzo.a;
            Intent intent = null;
            if (i == 1) {
                intent = AccountTypePickerChimeraActivity.a(accountPickerChimeraActivity, accountPickerChimeraActivity.i);
            } else if (i == 2) {
                accountPickerChimeraActivity.a(4);
                intent = pzo.b;
            } else if (azge.b() && pzo.a == 3) {
                accountPickerChimeraActivity.a(1);
                intent = new Intent("android.settings.SYNC_SETTINGS");
                accountPickerChimeraActivity.onBackPressed();
            }
            if (intent != null) {
                accountPickerChimeraActivity.startActivityForResult(intent, pzo.a);
            }
        }
    }
}
