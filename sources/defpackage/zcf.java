package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;

/* renamed from: zcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zcf extends zax {
    private final ClientContext a;
    private final String b;
    private final Audience c;
    private final ytk d;

    public zcf(ClientContext clientContext, String str, Audience audience, ytk ytk) {
        this.a = clientContext;
        this.b = str;
        this.c = audience;
        this.d = ytk;
    }

    public final void a(Context context, yrr yrr) {
        try {
            ClientContext clientContext = this.a;
            String str = this.b;
            Audience audience = this.c;
            ysd ysd = yrr.c;
            String a2 = yxg.a(context);
            ysd.a.a(clientContext, str, "shared", a2, (AclEntity) yxf.a(audience));
            this.d.a(0, (Bundle) null);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.a(), 0));
            this.d.a(4, bundle);
        } catch (eif e2) {
            this.d.a(4, yug.a(context, this.a));
        } catch (VolleyError e3) {
            this.d.a(7, (Bundle) null);
        }
    }
}
