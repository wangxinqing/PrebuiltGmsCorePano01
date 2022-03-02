package defpackage;

import android.accounts.Account;
import android.view.MenuItem;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: vra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vra implements acvv {
    private final ShareSheetChimeraActivity a;
    private final MenuItem b;

    public vra(ShareSheetChimeraActivity shareSheetChimeraActivity, MenuItem menuItem) {
        this.a = shareSheetChimeraActivity;
        this.b = menuItem;
    }

    public final void a(Object obj) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.a;
        MenuItem menuItem = this.b;
        Account account = (Account) obj;
        if (account != null) {
            who.c(shareSheetChimeraActivity, account).a((acvv) new vru(shareSheetChimeraActivity, menuItem));
        } else {
            shareSheetChimeraActivity.a(false);
        }
    }
}
