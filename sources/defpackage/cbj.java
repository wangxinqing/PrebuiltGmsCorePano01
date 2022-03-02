package defpackage;

import android.content.Context;
import com.android.volley.Request;

/* renamed from: cbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cbj extends iyn {
    public cbj(Context context, String str) {
        super(context, awwe.a.a().c(), awwe.b(), false, awuz.a.a().aM(), awuz.a.a().aI(), "", str, (byte[]) null);
        this.g = 12544;
    }

    /* access modifiers changed from: protected */
    public final void a(Request request, String str) {
        request.setRetryPolicy(new iym(this.i, str, 10000, 3, 1.0f));
    }
}
