package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.ulr.ApiClientInfo;
import java.util.logging.Level;

/* renamed from: ajkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajkr extends ajki {
    public static final /* synthetic */ int o = 0;
    public final Context i;
    public final int j;
    public final int k;
    public final int l;
    public final String m;
    public final Boolean n;

    public ajkr(Context context, int i2, int i3, int i4, String str, Boolean bool) {
        this.i = context;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = str;
        this.n = bool;
    }

    public static ClientContext a(Context context, Account account) {
        int myUid = Process.myUid();
        String str = account.name;
        String str2 = account.name;
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str2, packageName, packageName);
        clientContext.d("https://www.googleapis.com/auth/userlocation.reporting");
        return clientContext;
    }

    public static void a(VolleyError volleyError) {
        String str;
        NetworkResponse networkResponse = volleyError.networkResponse;
        String valueOf = String.valueOf(volleyError);
        if (networkResponse != null) {
            str = "non-null";
        } else {
            str = "null";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27 + str.length());
        sb.append("VolleyError: ");
        sb.append(valueOf);
        sb.append(", response is ");
        sb.append(str);
        ajix.a("GCoreUlr", sb.toString());
        if (networkResponse != null) {
            int i2 = networkResponse.statusCode;
            StringBuilder sb2 = new StringBuilder(45);
            sb2.append(" networkResponse: status code is :");
            sb2.append(i2);
            ajix.b("GCoreUlr", sb2.toString());
            jac a = jad.a(volleyError, "GCoreUlr");
            if (a != null) {
                ajix.a(Level.WARNING, "GCoreUlr", a.toString());
            }
        }
    }

    public final ApiClientInfo a() {
        return new ApiClientInfo(!jix.a(this.i.getResources()) ? "phone" : "tablet");
    }
}
