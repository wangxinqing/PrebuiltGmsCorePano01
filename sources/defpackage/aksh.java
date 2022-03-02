package defpackage;

import android.util.Log;
import com.android.volley.VolleyError;
import java.util.Collections;
import java.util.Map;

/* renamed from: aksh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aksh implements aksb {
    public abstract void a(int i, Map map);

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a(0, ((aksq) obj).a);
    }

    public final void a(Throwable th) {
        int i;
        if (th instanceof VolleyError) {
            VolleyError volleyError = (VolleyError) th;
            jad.a(volleyError, "Places");
            i = aksc.a(volleyError);
        } else {
            i = 13;
        }
        if (Log.isLoggable("Places", 5)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("onFailure StatusCode: ");
            sb.append(i);
            sb.append(", Cause: ");
            sb.append(valueOf);
            alfy.c("Places", sb.toString());
        }
        a(i, Collections.emptyMap());
    }
}
