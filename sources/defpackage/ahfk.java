package defpackage;

import android.net.Uri;

/* renamed from: ahfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahfk implements amqy {
    private final ahfl a;
    private final Uri b;

    public ahfk(ahfl ahfl, Uri uri) {
        this.a = ahfl;
        this.b = uri;
    }

    public final Object a(Object obj) {
        ahfl ahfl = this.a;
        Uri uri = this.b;
        String str = (String) obj;
        anli anli = ahfl.a;
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(str);
        return anli.a(sb.toString(), amqn.c).toString();
    }
}
