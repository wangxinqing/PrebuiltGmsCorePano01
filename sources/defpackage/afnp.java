package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: afnp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afnp implements amqy {
    private final List a;

    public afnp(List list) {
        this.a = list;
    }

    public final Object a(Object obj) {
        List list = this.a;
        Uri uri = (Uri) obj;
        if (uri == null) {
            return null;
        }
        list.add(uri);
        return null;
    }
}
