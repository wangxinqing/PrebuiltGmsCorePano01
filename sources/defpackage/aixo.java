package defpackage;

import android.net.wifi.RttManager;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: aixo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aixo implements RttManager.RttListener {
    public static final /* synthetic */ int c = 0;
    final /* synthetic */ aixp a;
    final /* synthetic */ aisi b;

    public aixo(aixp aixp, aisi aisi) {
        this.a = aixp;
        this.b = aisi;
    }

    private final void a(aibv[] aibvArr) {
        try {
            this.a.f.execute(new aixn(this.b, aibvArr));
        } catch (RejectedExecutionException e) {
        }
    }

    public final void onAborted() {
        a(new aibv[0]);
    }

    public final void onFailure(int i, String str) {
        a(new aibv[0]);
    }

    public final void onSuccess(RttManager.RttResult[] rttResultArr) {
        aibv a2;
        aiyk aiyk = aiyk.g;
        ArrayList arrayList = new ArrayList(r2);
        for (RttManager.RttResult rttResult : rttResultArr) {
            if (!(rttResult == null || rttResult.status != 0 || (a2 = aiyk.a(rttResult)) == null)) {
                arrayList.add(a2);
            }
        }
        a((aibv[]) arrayList.toArray(new aibv[arrayList.size()]));
    }
}
