package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import java.util.concurrent.CountDownLatch;

/* renamed from: abvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abvr implements acvp {
    final /* synthetic */ Account a;
    final /* synthetic */ CountDownLatch b;

    public abvr(Account account, CountDownLatch countDownLatch) {
        this.a = account;
        this.b = countDownLatch;
    }

    public final void a(acwa acwa) {
        if (acwa.b()) {
            abvs.b.a("Registration for %s complete %s", this.a, ((KeyRegistrationResult) acwa.d()).b);
        } else {
            abvs.b.a("Registration for %s failed %s", this.a, acwa.e());
        }
        this.b.countDown();
    }
}
