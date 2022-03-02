package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.HintRequest;
import java.util.concurrent.ExecutorService;

/* renamed from: fku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fku implements fit {
    public final flq a;
    public final flm b = ((flm) flm.a.a());
    private final aoru c = aosd.a((ExecutorService) jfb.a(1, 9));

    public fku(Context context) {
        this.a = flq.a(context);
    }

    public final aorr a(pyv pyv, HintRequest hintRequest) {
        if (hintRequest.d) {
            return this.c.b(new fkq(this, pyv));
        }
        return aorl.a((Object) amzy.h());
    }
}
