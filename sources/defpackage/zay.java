package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class zay extends zax {
    final ClientContext a;
    final yth b;

    public zay(ClientContext clientContext, yth yth) {
        this.a = clientContext;
        this.b = yth;
    }

    public final void a(Context context, yrr yrr) {
        Bundle bundle;
        try {
            Pair b2 = b(context, yrr);
            ConnectionResult connectionResult = (ConnectionResult) b2.first;
            if (connectionResult.a()) {
                bundle = new Bundle();
                bundle.putParcelable("pendingIntent", connectionResult.d);
            } else {
                bundle = null;
            }
            this.b.a(connectionResult.c, bundle, (Bundle) b2.second);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.a(), 0));
            this.b.a(4, bundle2, (Bundle) null);
        } catch (eif e2) {
            this.b.a(4, yug.a(context, this.a), (Bundle) null);
        } catch (VolleyError e3) {
            this.b.a(7, (Bundle) null, (Bundle) null);
        }
    }

    public abstract Pair b(Context context, yrr yrr);
}
