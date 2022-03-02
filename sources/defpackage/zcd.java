package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zcd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zcd extends zax {
    private final yth a;
    private final ClientContext b;

    public zcd(ClientContext clientContext, yth yth) {
        this.b = clientContext;
        this.a = yth;
    }

    public final void a(Context context, yrr yrr) {
        try {
            ClientContext clientContext = this.b;
            String a2 = new izw(clientContext, (byte[]) null).a(context);
            String valueOf = String.valueOf(a2);
            yrr.a.a(clientContext, 0, valueOf.length() == 0 ? new String("/revoke?token=") : "/revoke?token=".concat(valueOf), (Object) null);
            eig.a(context, a2);
            this.a.a(0, (Bundle) null);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.a(), 0));
            this.a.a(4, bundle);
        } catch (eif e2) {
            this.a.a(4, yug.a(context, this.b));
        } catch (VolleyError e3) {
            this.a.a(7, (Bundle) null);
        }
    }
}
