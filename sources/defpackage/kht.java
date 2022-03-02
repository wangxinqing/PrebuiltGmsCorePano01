package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.net.HttpURLConnection;

/* renamed from: kht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kht {
    public static final izw a(HttpURLConnection httpURLConnection, ClientContext clientContext, Context context) {
        izw izw = new izw(clientContext);
        String valueOf = String.valueOf(izw.b(context));
        httpURLConnection.setRequestProperty("Authorization", valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
        return izw;
    }
}
