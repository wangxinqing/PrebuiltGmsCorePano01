package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.HashMap;

/* renamed from: xpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class xpr extends izb {
    private static final HashMap m = new HashMap();

    public xpr(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4) {
        super(context.getApplicationContext(), str, str2, z, z2, str3, str4);
        this.g = 5401;
    }

    public static void a(ClientContext clientContext, String str) {
        clientContext.a("sync_reason", str);
    }

    public static xpr b(Context context) {
        return new xpr(context, "https://www.googleapis.com", "/plus/v2whitelisted/", aywy.c(), aywy.q(), aywy.b(), "");
    }

    public HashMap a(Context context, ClientContext clientContext) {
        String str;
        String str2;
        HashMap a = super.a(context, clientContext);
        if (clientContext != null) {
            str = clientContext.b("sync_reason");
        } else {
            str = null;
        }
        synchronized (m) {
            str2 = (String) m.get(str);
            if (str2 == null) {
                StringBuilder sb = new StringBuilder(izu.a(context, "People/1.0"));
                if (!TextUtils.isEmpty(str)) {
                    sb.append("; sync-");
                    sb.append(str);
                } else {
                    sb.append("; ondemand");
                }
                str2 = sb.toString();
                m.put(str, str2);
            }
        }
        a.put("User-Agent", str2);
        String b = clientContext.b("social_client_app_id");
        if (TextUtils.isEmpty(b)) {
            Log.w("PeopleApiaryServer", "App ID not set in client context", new ycl());
        }
        yxh.a();
        yxh.a(a, b, jhg.f(context), jix.a(context.getResources()));
        return a;
    }

    public final String d(ClientContext clientContext) {
        clientContext.a();
        if (TextUtils.isEmpty((CharSequence) null)) {
            return super.d(clientContext);
        }
        return null;
    }

    public final String b(ClientContext clientContext) {
        clientContext.a();
        if (TextUtils.isEmpty((CharSequence) null)) {
            return super.b(clientContext);
        }
        return null;
    }
}
