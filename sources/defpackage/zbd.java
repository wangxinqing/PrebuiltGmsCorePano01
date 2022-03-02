package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.internal.model.acls.AclsRequest;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import java.util.ArrayList;

/* renamed from: zbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbd extends zax {
    private final ClientContext a;
    private final AclsRequest b;
    private final ytk c;

    public zbd(ClientContext clientContext, AclsRequest aclsRequest, ytk ytk) {
        this.a = clientContext;
        this.b = aclsRequest;
        this.c = ytk;
    }

    public final void a(Context context, yrr yrr) {
        Context context2 = context;
        try {
            ClientContext clientContext = this.a;
            AclsRequest aclsRequest = this.b;
            ysd ysd = yrr.c;
            ysd.i.d();
            String a2 = yxg.a(context);
            jhi a3 = jhi.a();
            String str = aclsRequest.c;
            jhi b2 = a3.b();
            jhi jhi = b2;
            String str2 = str;
            ysd.a.b(clientContext, str, "shared", a2, b2, jhi);
            jhi b3 = a3.b();
            jhi jhi2 = b3;
            ysd.a.b(clientContext, str2, "visible", a2, b3, b3);
            try {
                ysd.i.e();
            } catch (InterruptedException e) {
            }
            a3.c();
            if (!jhi.d() || !jhi2.d()) {
                throw new VolleyError("Interrupted.");
            }
            AclEntity aclEntity = (AclEntity) jhi.a(0);
            Audience b4 = yxf.b(aclEntity);
            AclEntity aclEntity2 = (AclEntity) jhi2.a(0);
            boolean z = true;
            if (!aclEntity2.e() || aclEntity2.g.size() != 1 || !"allCircles".equals(((zhy) aclEntity2.g.get(0)).d())) {
                z = false;
            }
            ArrayList arrayList = z ? new ArrayList() : yxf.a((zej) aclEntity2);
            ywo ywo = new ywo();
            ywo.b = b4;
            ywo.c = arrayList;
            ywo.d = z;
            ywo.a = aclEntity.d;
            AppAclsEntity a4 = ywo.a();
            ywm ywm = new ywm();
            ywm.b = a4;
            ywm.a = str2;
            this.c.a(0, (Bundle) null, ywm.a());
        } catch (UserRecoverableAuthException e2) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context2, 0, e2.a(), 0));
            ytk ytk = this.c;
            ywm ywm2 = new ywm();
            ywm2.a = this.b.c;
            ytk.a(4, bundle, ywm2.a());
        } catch (eif e3) {
            Bundle a5 = yug.a(context2, this.a);
            ytk ytk2 = this.c;
            ywm ywm3 = new ywm();
            ywm3.a = this.b.c;
            ytk2.a(4, a5, ywm3.a());
        } catch (VolleyError e4) {
            ytk ytk3 = this.c;
            ywm ywm4 = new ywm();
            ywm4.a = this.b.c;
            ytk3.a(7, (Bundle) null, ywm4.a());
        }
    }
}
