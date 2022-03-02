package defpackage;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import com.google.android.gms.location.reporting.Deletion;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cko implements Runnable {
    final /* synthetic */ Intent a;

    public cko(Intent intent) {
        this.a = intent;
    }

    public final void run() {
        ckr A = cbi.A();
        Intent intent = this.a;
        String action = intent.getAction();
        new Object[1][0] = action;
        if (!"com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(action)) {
            if ("com.google.android.gms.location.reporting.DELETE_OPERATION".equals(action)) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("deletions");
                bsx y = cbi.y();
                int size = parcelableArrayListExtra.size();
                for (int i = 0; i < size; i++) {
                    Deletion deletion = (Deletion) parcelableArrayListExtra.get(i);
                    Account account = deletion.a;
                    cbi.y();
                    bsz b = bsx.b(account.name);
                    y.c();
                    if (y.a.contains(b)) {
                        ((anih) ((anih) bxk.a.d()).a("ckr", "a", 136, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[SystemStateManager] Deleting location history data for account: %s", (Object) account);
                        cjd p = cbi.p();
                        jtm jtm = new jtm();
                        juu juu = new juu();
                        juu.a(deletion.b, deletion.c);
                        TimeFilterImpl a2 = juu.a();
                        for (int a3 : bta.a) {
                            jtm.a(a3, a2);
                        }
                        p.b((ContextDataFilterImpl) jtm.a(), cbi.a(b, "SystemStateManager"));
                    }
                }
            } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || "com.google.android.gms.phenotype.COMMITTED".equals(action) || ckr.a.equals(action)) {
                String action2 = intent.getAction();
                if ((!"com.google.android.gms.phenotype.COMMITTED".equals(action2) && !ckr.a.equals(action2)) || intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME").equals("com.google.android.gms.contextmanager")) {
                    A.b.a(A.c);
                }
            }
        } else if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            List<Account> b2 = erc.b(intent);
            if (bxk.a(2)) {
                new Object[1][0] = Integer.valueOf(cbi.y().a().size());
                for (Account account2 : b2) {
                    Object[] objArr = {account2};
                }
            }
            cbi.y();
            for (Account account3 : b2) {
                new bwq(bsx.b(account3.name)).a(bvq.a("SystemStateManager_delete_account"));
            }
        }
    }
}
