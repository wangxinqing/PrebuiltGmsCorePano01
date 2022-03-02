package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;
import java.util.List;

/* renamed from: hyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class hyp implements ax {
    private final AccountPickerChimeraActivity a;

    public hyp(AccountPickerChimeraActivity accountPickerChimeraActivity) {
        this.a = accountPickerChimeraActivity;
    }

    public final void a(Object obj) {
        Bundle extras;
        String string;
        AccountPickerChimeraActivity accountPickerChimeraActivity = this.a;
        pzo pzo = (pzo) obj;
        if (pzo != null) {
            Intent intent = pzo.b;
            int i = pzo.a;
            if (i == 10) {
                Toast.makeText(accountPickerChimeraActivity, R.string.common_account_restricted_no_accounts, 0).show();
                accountPickerChimeraActivity.a(2);
                i = 0;
            } else {
                int i2 = -1;
                if (!(i != -1 || intent == null || intent.getExtras() == null || (extras = intent.getExtras()) == null || (string = extras.getString("authAccount")) == null)) {
                    List list = (List) accountPickerChimeraActivity.j.g.b();
                    if (list != null) {
                        i2 = anbs.e(list, new hyr(string));
                    }
                    accountPickerChimeraActivity.k = i2;
                    accountPickerChimeraActivity.a(3);
                    if (accountPickerChimeraActivity.i.c) {
                        itg.a((Context) accountPickerChimeraActivity, string, accountPickerChimeraActivity.d);
                    }
                }
            }
            if (intent != null) {
                accountPickerChimeraActivity.setResult(i, intent);
            } else {
                accountPickerChimeraActivity.setResult(i);
            }
            accountPickerChimeraActivity.l = false;
            accountPickerChimeraActivity.finish();
        }
    }
}
