package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import java.util.Formatter;

/* renamed from: zbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbm extends zax {
    private final ClientContext a;
    private final ytk b;
    private final String c;
    private final int d;
    private final String e;

    public zbm(ClientContext clientContext, String str, int i, String str2, ytk ytk) {
        this.a = clientContext;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.b = ytk;
    }

    public final void a(Context context, yrr yrr) {
        try {
            ClientContext clientContext = this.a;
            String str = this.c;
            int i = this.d;
            String str2 = this.e;
            ysd ysd = yrr.c;
            String a2 = yxg.a(context);
            zdl zdl = ysd.e;
            Integer valueOf = Integer.valueOf(i);
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("applications/%1$s/moments", new Object[]{iyv.a(str)});
            if (a2 != null) {
                iyv.a(sb, "language", iyv.a(a2));
            }
            iyv.a(sb, "maxResults", String.valueOf(valueOf));
            if (str2 != null) {
                iyv.a(sb, "pageToken", iyv.a(str2));
            }
            String sb2 = sb.toString();
            this.b.a(0, (Bundle) null, (MomentsFeed) zdl.a.a(clientContext, 0, sb2, (Object) null, MomentsFeed.class));
        } catch (UserRecoverableAuthException e2) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e2.a(), 0));
            this.b.a(4, bundle, (MomentsFeed) null);
        } catch (eif e3) {
            this.b.a(4, yug.a(context, this.a), (MomentsFeed) null);
        } catch (VolleyError e4) {
            this.b.a(7, (Bundle) null, (MomentsFeed) null);
        }
    }
}
