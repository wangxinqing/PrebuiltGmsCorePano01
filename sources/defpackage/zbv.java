package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import java.util.Formatter;
import java.util.List;

/* renamed from: zbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbv extends zax {
    private final ClientContext a;
    private final String b;
    private final ytk c;

    public zbv(ClientContext clientContext, String str, ytk ytk) {
        this.a = clientContext;
        this.b = str;
        this.c = ytk;
    }

    public final void a(Context context, yrr yrr) {
        try {
            ClientContext clientContext = this.a;
            String str = this.b;
            ysd ysd = yrr.c;
            String a2 = yxg.a(context);
            zdf zdf = ysd.a;
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("moments/%1$s/acl/%2$s", new Object[]{iyv.a(str), iyv.a("shared")});
            if (a2 != null) {
                iyv.a(sb, "language", iyv.a(a2));
            }
            this.c.a(0, (Bundle) null, (List) yxf.a((zej) (AclEntity) zdf.a.a(clientContext, 0, sb.toString(), (Object) null, AclEntity.class)));
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.a(), 0));
            this.c.a(4, bundle, (List) null);
        } catch (eif e2) {
            this.c.a(4, yug.a(context, this.a), (List) null);
        } catch (VolleyError e3) {
            this.c.a(7, (Bundle) null, (List) null);
        }
    }
}
