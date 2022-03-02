package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;

/* renamed from: acuq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acuq {
    public final ContentProviderClient a;
    public final Context b;
    public final avww c;
    public final String d;
    public final avwu e;
    private final String f;

    public acuq(Context context, String str, ContentProviderClient contentProviderClient, String str2, avwu avwu) {
        this.b = context;
        this.d = str;
        this.e = avwu;
        this.a = contentProviderClient;
        this.f = str2;
        avww avww = new avww((byte[]) null);
        this.c = avww;
        avww.a("max-results", "300");
        this.c.a("routinginfo", str2);
    }

    public final avxe a(String str, String str2, String str3, long j) {
        avxe avxe = new avxe();
        avxd avxd = new avxd(str3, str, "fake_auth_token");
        if (str2 != null) {
            avxe.a = str2.length() == 0 ? new String("https://android.clients.google.com/gsync/sub/") : "https://android.clients.google.com/gsync/sub/".concat(str2);
            avxe.c = avxe.a;
        }
        avxe.o = this.f;
        avxe.n = avxd;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append(str);
        sb.append("_");
        sb.append(j);
        avxe.p = sb.toString();
        return avxe;
    }
}
