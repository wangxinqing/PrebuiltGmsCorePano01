package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;

/* renamed from: iyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class iyo {
    public final Context i;

    public iyo(Context context) {
        this.i = context;
    }

    /* access modifiers changed from: protected */
    public izw a(ClientContext clientContext) {
        return new izw(clientContext);
    }

    public String b(ClientContext clientContext) {
        if (clientContext.b() != null) {
            return a(clientContext).a(this.i);
        }
        return null;
    }

    public final String c(ClientContext clientContext) {
        try {
            return new fxu(this.i).a(clientContext.f);
        } catch (IOException e) {
            Log.w("AbstractServer", "IOException while getting app cert is being ignored.", e);
            return null;
        } catch (eif e2) {
            Log.w("AbstractServer", "GoogleAuthException while getting app cert is being ignored.", e2);
            return null;
        }
    }

    public String d(ClientContext clientContext) {
        String b = clientContext.b("auth_token");
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        if (clientContext.b() == null) {
            return null;
        }
        try {
            return a(clientContext).b(this.i);
        } catch (IOException e) {
            throw new VolleyError((Throwable) e);
        }
    }
}
