package defpackage;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: vjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vjr implements Runnable {
    private final NearbySharingChimeraService.AnonymousClass1 a;
    private final Intent b;

    public vjr(NearbySharingChimeraService.AnonymousClass1 r1, Intent intent) {
        this.a = r1;
        this.b = intent;
    }

    public final void run() {
        NearbySharingChimeraService.AnonymousClass1 r0 = this.a;
        Intent intent = this.b;
        if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction())) {
            if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
                List a2 = who.a(intent.getParcelableArrayExtra("accountsAdded"));
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                Charset charset = NearbySharingChimeraService.a;
                Account b2 = nearbySharingChimeraService.k.b();
                if (!a2.isEmpty() && b2 == null) {
                    nearbySharingChimeraService.e();
                }
            }
            if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
                List a3 = who.a(intent.getParcelableArrayExtra("accountsRemoved"));
                NearbySharingChimeraService nearbySharingChimeraService2 = NearbySharingChimeraService.this;
                Charset charset2 = NearbySharingChimeraService.a;
                Account b3 = nearbySharingChimeraService2.k.b();
                if (!a3.isEmpty() && b3 != null) {
                    int size = a3.size();
                    int i = 0;
                    while (i < size) {
                        i++;
                        if (b3.name.equals(((Account) a3.get(i)).name)) {
                            nearbySharingChimeraService2.e();
                            return;
                        }
                    }
                }
            }
        }
    }
}
