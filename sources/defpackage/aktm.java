package defpackage;

import android.util.Log;
import com.android.volley.VolleyError;
import java.util.Collections;
import java.util.Map;

/* renamed from: aktm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aktm implements aksb {
    public abstract void a(int i, Map map);

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a(0, ((aktt) obj).a);
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
        a(13, Collections.emptyMap());
    }
}
