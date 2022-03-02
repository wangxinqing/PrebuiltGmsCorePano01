package defpackage;

import android.content.Context;
import com.android.volley.Request;

/* renamed from: pqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pqd extends iyn {
    public final String j = ((String) ozx.p.c());

    public pqd(Context context) {
        super(context, (String) ozx.p.c(), (String) ozx.q.c(), false, ((Boolean) ozx.s.c()).booleanValue(), (String) null, (String) ozx.r.c());
        this.g = 12800;
    }

    /* access modifiers changed from: protected */
    public final void a(Request request, String str) {
        request.setRetryPolicy(new iym(this.i, str, ((Integer) ozx.t.c()).intValue(), ((Integer) ozx.v.c()).intValue(), ((Double) ozx.w.c()).floatValue()));
    }
}
