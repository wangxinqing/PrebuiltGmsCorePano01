package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;

/* renamed from: hys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hys implements amrm {
    private final AccountPickerChimeraActivity a;

    public hys(AccountPickerChimeraActivity accountPickerChimeraActivity) {
        this.a = accountPickerChimeraActivity;
    }

    public final boolean a(Object obj) {
        String str;
        AccountPickerChimeraActivity accountPickerChimeraActivity = this.a;
        pzh pzh = (pzh) obj;
        if (pzh == null || (str = pzh.c) == null) {
            return false;
        }
        Account account = accountPickerChimeraActivity.e;
        return str.equals(account != null ? account.name : "");
    }
}
