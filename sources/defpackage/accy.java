package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;
import java.util.List;

/* renamed from: accy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class accy implements Runnable {
    private final TargetChimeraActivity a;
    private final List b;
    private final Bundle c;

    public accy(TargetChimeraActivity targetChimeraActivity, List list, Bundle bundle) {
        this.a = targetChimeraActivity;
        this.b = list;
        this.c = bundle;
    }

    public final void run() {
        ManagedAuthOptions managedAuthOptions;
        int i;
        TargetChimeraActivity targetChimeraActivity = this.a;
        List<Account> list = this.b;
        Bundle bundle = this.c;
        Bundle bundle2 = new Bundle();
        bundle2.putString("theme", targetChimeraActivity.b);
        for (Account account : list) {
            if (targetChimeraActivity.h.a(account)) {
                abzt abzt = targetChimeraActivity.h;
                if (azkf.b()) {
                    int i2 = targetChimeraActivity.f;
                    BootstrapCompletionResult bootstrapCompletionResult = targetChimeraActivity.j;
                    if (bootstrapCompletionResult != null) {
                        i = bootstrapCompletionResult.f;
                    } else {
                        i = 0;
                    }
                    if (i == 3) {
                        i2 = 2;
                    } else if (i == 4) {
                        i2 = 1;
                    }
                    managedAuthOptions = new ManagedAuthOptions(i2, 3);
                } else {
                    managedAuthOptions = new ManagedAuthOptions();
                }
                Intent a2 = abzt.a(account, bundle2, managedAuthOptions);
                if (a2 != null) {
                    targetChimeraActivity.d.add(a2);
                }
            }
        }
        targetChimeraActivity.runOnUiThread(new accz(targetChimeraActivity, bundle));
        targetChimeraActivity.g = null;
    }
}
