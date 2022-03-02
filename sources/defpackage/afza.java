package defpackage;

import android.net.Uri;

/* renamed from: afza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class afza {
    public static afyz a(aucp aucp) {
        afyz afyz = new afyz();
        afyz.b = aucp;
        afyz.c = new aekp();
        afyz.d = anil.a("mdi.sync.stats");
        return afyz;
    }

    private static Uri b(Uri uri) {
        return uri.buildUpon().appendPath("sync_metadata.pb").build();
    }

    private final afzb c(Uri uri) {
        ahei c = c();
        ahee g = ahef.g();
        g.a((audx) afys.f);
        g.a(uri);
        g.a((ahfm) ahdp.a);
        return new afzb(c.a(g.a()));
    }

    public abstract Class a();

    public abstract aucp b();

    public abstract ahei c();

    public abstract aekn d();

    public abstract anij e();

    @Deprecated
    public static afyz a(Class cls) {
        afyz afyz = new afyz();
        afyz.a = cls;
        afyz.c = new aekp();
        afyz.d = anil.a("mdi.sync.stats");
        return afyz;
    }

    public final afym a(Uri uri) {
        if (a() != null) {
            Class a = a();
            amrl.a((Object) a);
            return new afym(a, c(b(uri)), d());
        } else if (b() != null) {
            aucp b = b();
            amrl.a((Object) b);
            return new afym((afyc) new afyd(b), c(b(uri)), d());
        } else {
            throw new AssertionError("eventType OR enumMap should be non-null");
        }
    }
}
