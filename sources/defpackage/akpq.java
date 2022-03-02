package defpackage;

import android.util.Log;
import com.android.volley.VolleyError;
import java.util.Collections;
import java.util.List;

/* renamed from: akpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akpq implements aksb {
    final /* synthetic */ akps a;

    public akpq(akps akps) {
        this.a = akps;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.a(0, (List) obj);
    }

    public final void a(Throwable th) {
        int i;
        if (Log.isLoggable("Places", 5)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
            sb.append("onFailure: ");
            sb.append(valueOf);
            alfy.c("Places", sb.toString());
        }
        if (th instanceof VolleyError) {
            VolleyError volleyError = (VolleyError) th;
            jad.a(volleyError, "Places");
            i = aksc.a(volleyError);
        } else {
            i = 13;
        }
        this.a.a(i, Collections.emptyList());
    }
}
