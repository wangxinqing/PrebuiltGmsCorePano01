package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbi extends zax {
    private final ClientContext a;
    private final yth b;

    public zbi(ClientContext clientContext, yth yth) {
        this.a = clientContext;
        this.b = yth;
    }

    private final void a(int i, Bundle bundle, Bundle bundle2) {
        yth yth = this.b;
        if (yth != null) {
            yth.a(i, bundle, bundle2);
        }
    }

    public final void a(Context context, yrr yrr) {
        try {
            ysy a2 = yrr.a(context, this.a, 1);
            if (a2 != null) {
                a(0, (Bundle) null, a2.a);
                return;
            }
            Log.e("GetSignUpStateOperation", "Unable to load the user's sign-up state");
            a(8, (Bundle) null, (Bundle) null);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.a(), 0));
            a(4, bundle, (Bundle) null);
        } catch (eif e2) {
            a(4, yug.a(context, this.a), (Bundle) null);
        } catch (VolleyError e3) {
            a(7, (Bundle) null, (Bundle) null);
        }
    }
}
