package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;

/* renamed from: hzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hzo implements amrm {
    private final Account a;

    public hzo(Account account) {
        this.a = account;
    }

    public final boolean a(Object obj) {
        Account account = this.a;
        iwd iwd = SimpleDialogAccountPickerChimeraActivity.a;
        return account.name.equals(((pzh) obj).c);
    }
}
