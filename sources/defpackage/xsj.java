package defpackage;

import android.accounts.Account;
import android.util.Log;
import java.util.concurrent.CancellationException;

/* renamed from: xsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xsj extends as implements aora {
    public final xuo a;
    public String h;
    public final xsk i;
    private final aoru j;
    private aorr k;

    public xsj(xuo xuo, aoru aoru, xsk xsk) {
        this.a = xuo;
        this.j = aoru;
        this.i = xsk;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        e();
    }

    public final void e() {
        aorr aorr = this.k;
        if (aorr != null) {
            aorr.cancel(true);
        }
        aorr b = this.j.b(new xsi(this));
        this.k = b;
        aorl.a(b, this, aoqm.a);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        c((Account) obj);
    }

    public final void a(Throwable th) {
        if (!(th instanceof CancellationException)) {
            Log.e("AccountLiveData", "Error with account future. ", th);
        }
    }
}
