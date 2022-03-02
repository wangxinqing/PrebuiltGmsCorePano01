package defpackage;

import android.os.AsyncTask;
import com.google.android.chimera.Activity;
import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: acoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acoq extends AsyncTask {
    final /* synthetic */ AccountChallengeWebView a;

    public acoq(AccountChallengeWebView accountChallengeWebView) {
        this.a = accountChallengeWebView;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            AccountChallengeWebView accountChallengeWebView = this.a;
            iwd iwd = AccountChallengeWebView.a;
            accountChallengeWebView.h.tryAcquire(accountChallengeWebView.g, 30, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            AccountChallengeWebView.a.d("Interrupted. Finishing this activity.", e, new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        AccountChallengeWebView.a.a("Returning results.", new Object[0]);
        AccountChallengeWebView accountChallengeWebView = this.a;
        ackd ackd = accountChallengeWebView.n;
        if (ackd != null) {
            ArrayList arrayList = accountChallengeWebView.f;
            Activity activity = ackd.a.getActivity();
            if (activity != null) {
                ((ackg) activity).a(arrayList);
            }
        }
    }
}
