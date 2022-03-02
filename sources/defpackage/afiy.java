package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.Executor;

/* renamed from: afiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afiy extends BroadcastReceiver {
    public final aepf a;
    public final IntentFilter b;
    private final afit c;
    private final afiu d;
    private final afiw e;
    private final Executor f;

    public afiy(afit afit, aepf aepf, afiu afiu, afiw afiw, Executor executor) {
        this.c = afit;
        this.a = aepf;
        this.b = new IntentFilter(((afir) afiu).a);
        this.d = afiu;
        this.e = afiw;
        this.f = executor;
    }

    public final void onReceive(Context context, Intent intent) {
        aorr aorr;
        if (intent.getAction().equals(((afir) this.d).a)) {
            afit afit = this.c;
            afiu afiu = this.d;
            afiw afiw = this.e;
            synchronized (((afic) afit).b) {
                if (!((afic) afit).b.contains(afiu)) {
                    aorr = aorl.a((Object) false);
                } else {
                    aorr = aopr.a(((afic) afit).a(afiu, afiw), afib.a, (Executor) aoqm.a);
                }
            }
            aorl.a(aorr, new afix(this), this.f);
        }
    }
}
