package defpackage;

import android.content.Context;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: ioj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ioj extends gwf {
    public ioj(gwr gwr) {
        super(gwr);
    }

    public final String a(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(23);
        sb.append("id-");
        sb.append(currentTimeMillis);
        return sb.toString();
    }

    public final HttpURLConnection a(String str) {
        return new avzg(new avze()).a(new URL(str));
    }
}
