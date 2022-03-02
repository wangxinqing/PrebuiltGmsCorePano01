package defpackage;

import android.net.Uri;
import java.io.InputStream;

/* renamed from: afvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afvh implements aoqa {
    private final afvi a;
    private final Uri b;

    public afvh(afvi afvi, Uri uri) {
        this.a = afvi;
        this.b = uri;
    }

    public final aorr a() {
        afvi afvi = this.a;
        return aorl.a((Object) (InputStream) afvi.a.a(this.b, ahcj.a(), new agzk[0]));
    }
}
