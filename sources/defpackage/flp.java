package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.HintRequest;
import java.util.concurrent.Executor;

/* renamed from: flp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class flp implements fit {
    private final Context a;

    public flp(Context context) {
        this.a = context;
    }

    public final aorr a(pyv pyv, HintRequest hintRequest) {
        boolean contains = angm.a((Object[]) hintRequest.e).contains("https://accounts.google.com");
        if (!hintRequest.c && !contains) {
            return aorl.a((Object) amzy.h());
        }
        wlr wlr = new wlr();
        wlr.a = 80;
        iby d = wlt.d(this.a, wlr.a());
        wkz wkz = new wkz();
        wkz.b = false;
        return aopr.a(qbc.a(d.a(wkz)), (amqy) new flo(contains), (Executor) aoqm.a);
    }
}
