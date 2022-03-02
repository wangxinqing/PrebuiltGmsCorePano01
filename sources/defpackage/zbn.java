package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import java.util.Formatter;

/* renamed from: zbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbn extends zax {
    private final ClientContext a;
    private final ytk b;
    private final int c;
    private final String d;
    private final Uri e;
    private final String f;
    private final String g;
    private final String h;

    public zbn(ClientContext clientContext, int i, String str, Uri uri, String str2, String str3, String str4, ytk ytk) {
        this.a = clientContext;
        this.c = i;
        this.d = str;
        this.e = uri;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.b = ytk;
    }

    public final void a(Context context, yrr yrr) {
        String str;
        Context context2 = context;
        try {
            ClientContext clientContext = this.a;
            int i = this.c;
            String str2 = this.d;
            Uri uri = this.e;
            String str3 = this.f;
            String str4 = this.g;
            String str5 = this.h;
            ysd ysd = yrr.c;
            if (uri != null) {
                str = uri.toString();
            } else {
                str = null;
            }
            String a2 = yxg.a(context);
            zdl zdl = ysd.e;
            Integer valueOf = Integer.valueOf(i);
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("people/%1$s/moments/%2$s", new Object[]{iyv.a(str4), iyv.a(str5)});
            if (a2 != null) {
                iyv.a(sb, "language", iyv.a(a2));
            }
            iyv.a(sb, "maxResults", String.valueOf(valueOf));
            if (str2 != null) {
                iyv.a(sb, "pageToken", iyv.a(str2));
            }
            if (str != null) {
                iyv.a(sb, "targetUrl", iyv.a(str));
            }
            if (str3 != null) {
                iyv.a(sb, "type", iyv.a(str3));
            }
            this.b.a(0, (Bundle) null, (MomentsFeed) zdl.a.a(clientContext, 0, sb.toString(), (Object) null, MomentsFeed.class));
        } catch (UserRecoverableAuthException e2) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context2, 0, e2.a(), 0));
            this.b.a(4, bundle, (MomentsFeed) null);
        } catch (eif e3) {
            this.b.a(4, yug.a(context2, this.a), (MomentsFeed) null);
        } catch (VolleyError e4) {
            this.b.a(7, (Bundle) null, (MomentsFeed) null);
        }
    }
}
