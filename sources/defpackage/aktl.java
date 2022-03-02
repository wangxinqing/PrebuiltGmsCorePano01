package defpackage;

import android.util.Log;
import com.android.volley.VolleyError;
import java.util.Collections;
import java.util.List;

/* renamed from: aktl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aktl implements aksb {
    final /* synthetic */ akps a;

    public aktl() {
    }

    public final void a(int i, List list) {
        this.a.a(i, list);
    }

    public aktl(akps akps) {
        this.a = akps;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a(0, (List) obj);
    }

    public final void a(Throwable th) {
        if (th instanceof VolleyError) {
            jad.a((VolleyError) th, "Places");
        }
        if (Log.isLoggable("Places", 5)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("onFailure StatusCode: 13, Cause: ");
            sb.append(valueOf);
            alfy.c("Places", sb.toString());
        }
        a(13, Collections.emptyList());
    }
}
