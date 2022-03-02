package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.internal.model.acls.AclsRequest;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;

/* renamed from: zch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zch extends zax {
    private final ClientContext a;
    private final AclsRequest b;
    private final ytk c;

    public zch(ClientContext clientContext, AclsRequest aclsRequest, ytk ytk) {
        this.a = clientContext;
        this.b = aclsRequest;
        this.c = ytk;
    }

    public final void a(Context context, yrr yrr) {
        try {
            ClientContext clientContext = this.a;
            AclsRequest aclsRequest = this.b;
            yrr.c.a.a(clientContext, aclsRequest.c, "shared", (AclEntity) yxf.a(aclsRequest.d.c));
            this.c.a(0, (Bundle) null);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.a(), 0));
            this.c.a(4, bundle);
        } catch (eif e2) {
            this.c.a(4, yug.a(context, this.a));
        } catch (VolleyError e3) {
            this.c.a(7, (Bundle) null);
        }
    }
}
