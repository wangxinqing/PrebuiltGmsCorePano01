package defpackage;

import com.google.android.gms.appdatasearch.CorpusStatus;

/* renamed from: ovz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ovz {
    public static void a(osf osf, ozc ozc, oxe oxe) {
        String str = oxe.b;
        String b = oxe.b();
        CorpusStatus b2 = osf.b(ozc, b, str);
        if (!b2.a || Integer.parseInt(b2.f) != oxe.a.e) {
            oso.a("Couldn't find corpus '%s'.", (Object) b);
            osf.c.d(new ovy(osf.b, osf, oyc.a(oxe), ozc, b));
        }
    }
}
