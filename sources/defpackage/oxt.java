package defpackage;

/* renamed from: oxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxt {
    public static int a(Object[] objArr) {
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    public static void a(osf osf, String str) {
        if (axsm.c() != -1) {
            int a = osf.i.a(osf.n.g());
            if (((long) aolr.a(a)) > axsm.c()) {
                oso.e("Device in low storage mode (%s); not accept %s request.", ovk.a(a), str);
                osf.r.b(14006);
                throw new apli("Indexable rejected in device low storage condition.");
            }
        }
    }
}
