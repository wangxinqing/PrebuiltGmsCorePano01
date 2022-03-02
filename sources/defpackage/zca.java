package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Formatter;

/* renamed from: zca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zca extends zax {
    private final ClientContext a;
    private final String b;
    private final ytk c;

    public zca(ClientContext clientContext, String str, ytk ytk) {
        this.a = clientContext;
        this.b = str;
        this.c = ytk;
    }

    public final void a(Context context, yrr yrr) {
        try {
            ClientContext clientContext = this.a;
            String str = this.b;
            zdl zdl = yrr.c.e;
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("moments/%1$s", new Object[]{iyv.a(str)});
            zdl.a.a(clientContext, 3, sb.toString(), (Object) null);
            this.c.a(0, (Bundle) null, this.b);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.a(), 0));
            this.c.a(4, bundle, this.b);
        } catch (eif e2) {
            this.c.a(4, yug.a(context, this.a), this.b);
        } catch (VolleyError e3) {
            this.c.a(7, (Bundle) null, this.b);
        }
    }
}
