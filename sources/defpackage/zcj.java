package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.io.IOException;

/* renamed from: zcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zcj extends zax {
    private final ClientContext a;
    private final String b;
    private final UpgradeAccountEntity c;
    private final ytk d;

    public zcj(ClientContext clientContext, String str, UpgradeAccountEntity upgradeAccountEntity, ytk ytk) {
        this.a = clientContext;
        this.b = str;
        this.c = upgradeAccountEntity;
        this.d = ytk;
    }

    public final void a(Context context, yrr yrr) {
        try {
            ClientContext clientContext = this.a;
            String str = this.b;
            UpgradeAccountEntity upgradeAccountEntity = this.c;
            ysd ysd = yrr.c;
            String a2 = yxg.a(context);
            zdn zdn = ysd.g;
            StringBuilder sb = new StringBuilder("rpc/upgradeAccount");
            iyv.a(sb, "client", iyv.a("androidGms"));
            if (str != null) {
                iyv.a(sb, "gpsrc", iyv.a(str));
            }
            if (a2 != null) {
                iyv.a(sb, "language", iyv.a(a2));
            }
            iyv.a(sb, "userId", iyv.a("me"));
            UpgradeAccountEntity upgradeAccountEntity2 = (UpgradeAccountEntity) zdn.a.a(clientContext, 1, sb.toString(), (Object) upgradeAccountEntity, UpgradeAccountEntity.class);
            if (yze.a((zii) upgradeAccountEntity2)) {
                String b2 = clientContext.b();
                try {
                    eig.a(context, eig.a(context, b2, "cp"));
                    eig.a(context, b2, "cp");
                } catch (IOException e) {
                    String valueOf = String.valueOf(b2);
                    Log.e("UpgradeAccount", valueOf.length() == 0 ? new String("Exception updating service bits for ") : "Exception updating service bits for ".concat(valueOf), e);
                }
            }
            this.d.a(0, (Bundle) null, upgradeAccountEntity2);
        } catch (UserRecoverableAuthException e2) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e2.a(), 0));
            this.d.a(4, bundle, (UpgradeAccountEntity) null);
        } catch (eif e3) {
            this.d.a(4, yug.a(context, this.a), (UpgradeAccountEntity) null);
        } catch (VolleyError e4) {
            this.d.a(7, (Bundle) null, (UpgradeAccountEntity) null);
        }
    }
}
