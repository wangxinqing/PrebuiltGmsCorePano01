package defpackage;

import android.content.Context;
import android.net.wifi.RttManager;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: aixr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aixr implements aixt {
    public static final /* synthetic */ int c = 0;
    public final aixt a;
    public final aicn b;
    private final Context d;
    private final Executor e;

    static {
        aixt.class.getSimpleName();
    }

    public aixr(Context context, aixt aixt, aicn aicn, Executor executor) {
        this.d = context;
        this.a = aixt;
        this.b = aicn;
        this.e = executor;
    }

    public final void a(List list, aibv[] aibvArr) {
        if (!aiyk.g.a(this.d, list, (RttManager.RttListener) new aixq(this, list), this.b, this.e)) {
            this.a.a(list, aibvArr);
        }
    }
}
