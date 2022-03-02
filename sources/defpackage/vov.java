package defpackage;

import android.accounts.Account;
import android.view.MenuItem;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: vov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vov implements acvv {
    private final ReceiveSurfaceChimeraActivity a;
    private final MenuItem b;

    public vov(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity, MenuItem menuItem) {
        this.a = receiveSurfaceChimeraActivity;
        this.b = menuItem;
    }

    public final void a(Object obj) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.a;
        MenuItem menuItem = this.b;
        Account account = (Account) obj;
        if (account != null) {
            who.c(receiveSurfaceChimeraActivity, account).a((acvv) new von(receiveSurfaceChimeraActivity, menuItem));
        } else {
            receiveSurfaceChimeraActivity.a(false);
        }
    }
}
