package defpackage;

import java.net.URI;

/* renamed from: bagb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bagb extends baat {
    public final String a() {
        return "dns";
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        return true;
    }

    public final int c() {
        return 5;
    }

    public final /* bridge */ /* synthetic */ baas a(URI uri, baal baal) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        amrl.a((Object) path, (Object) "targetPath");
        amrl.a(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", (Object) path, (Object) uri);
        String substring = path.substring(1);
        uri.getAuthority();
        return new baga(substring, baal, bagt.l, amsn.a(), babf.a(getClass().getClassLoader()));
    }
}
