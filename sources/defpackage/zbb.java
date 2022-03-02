package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.lso.RevokeToken;
import java.util.Formatter;

/* renamed from: zbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbb extends zax {
    private final ClientContext a;
    private final String b;
    private final String c;
    private final boolean d;
    private final ytk e;

    public zbb(ClientContext clientContext, String str, String str2, boolean z, ytk ytk) {
        this.a = clientContext;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = ytk;
    }

    public final void a(Context context, yrr yrr) {
        try {
            ClientContext clientContext = this.a;
            String str = this.b;
            String str2 = this.c;
            boolean z = this.d;
            if (str == null) {
                ysd ysd = yrr.c;
                if (z) {
                    ysd.e.a(clientContext, str2);
                }
                zdh zdh = ysd.c;
                StringBuilder sb = new StringBuilder();
                new Formatter(sb).format("applications/%1$s/disconnect", new Object[]{iyv.a(str2)});
                zdh.a.a(clientContext, 1, sb.toString(), (Object) null);
            } else {
                yru yru = yrr.f;
                if (z) {
                    yru.a.a(clientContext, str2);
                }
                iwj iwj = yru.c;
                StringBuilder sb2 = new StringBuilder("RevokeToken");
                iyv.a(sb2, "revocation_handle", iyv.a(str));
                RevokeToken revokeToken = (RevokeToken) iwj.a.a(clientContext, 1, sb2.toString(), (Object) null, RevokeToken.class);
            }
            this.e.b(0, (Bundle) null);
        } catch (UserRecoverableAuthException e2) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e2.a(), 0));
            this.e.b(4, bundle);
        } catch (eif e3) {
            this.e.b(4, yug.a(context, this.a));
        } catch (VolleyError e4) {
            this.e.b(7, (Bundle) null);
        }
    }
}
