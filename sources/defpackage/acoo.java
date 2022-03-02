package defpackage;

import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;
import java.util.concurrent.Semaphore;

/* renamed from: acoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acoo implements Runnable {
    final /* synthetic */ AccountChallengeWebView a;

    public acoo(AccountChallengeWebView accountChallengeWebView) {
        this.a = accountChallengeWebView;
    }

    public final void run() {
        AccountChallengeWebView accountChallengeWebView = this.a;
        accountChallengeWebView.h = new Semaphore(accountChallengeWebView.g - accountChallengeWebView.i);
        this.a.f();
    }
}
