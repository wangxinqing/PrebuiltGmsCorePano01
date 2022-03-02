package defpackage;

import android.content.pm.ApplicationInfo;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;
import java.util.Iterator;

/* renamed from: ykv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ykv extends ykt {
    final /* synthetic */ AccountSignUpChimeraActivity b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ykv(AccountSignUpChimeraActivity accountSignUpChimeraActivity) {
        super(accountSignUpChimeraActivity);
        this.b = accountSignUpChimeraActivity;
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.b;
        return accountSignUpChimeraActivity.e == null || accountSignUpChimeraActivity.f != null;
    }

    public final void d() {
        int i;
        boolean z;
        Iterator<ApplicationInfo> it = this.b.getPackageManager().getInstalledApplications(128).iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            ApplicationInfo next = it.next();
            if (next.packageName.equals(this.b.h)) {
                i = next.uid;
                break;
            }
        }
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.b;
        yli yli = accountSignUpChimeraActivity.i;
        try {
            ((ytn) yli.x()).a((ytk) new ylh(yli, this), accountSignUpChimeraActivity.a, accountSignUpChimeraActivity.h, i, accountSignUpChimeraActivity.e);
        } catch (RemoteException e) {
            Log.e("AccountSignUpClient", e.getMessage(), e);
        }
    }
}
