package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: whj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class whj implements acvv {
    private final Account a;
    private final Activity b;

    public whj(Account account, Activity activity) {
        this.a = account;
        this.b = activity;
    }

    public final void a(Object obj) {
        int i;
        Account account = this.a;
        Activity activity = this.b;
        ArrayList arrayList = (ArrayList) obj;
        String[] strArr = {"com.google"};
        if (jkr.h()) {
            i = (activity.getResources().getConfiguration().uiMode & 48) != 32 ? 1 : 0;
        } else {
            i = 1;
        }
        Intent a2 = hwy.a(account, arrayList, strArr, true, (String) null, false, i, 2, (String) null, true);
        a2.addFlags(536870912);
        Bundle bundle = new Bundle();
        bundle.putString("title", activity.getString(R.string.common_choose_account_label));
        a2.putExtra("first_party_options_bundle", bundle);
        activity.startActivityForResult(a2, 1001);
    }
}
