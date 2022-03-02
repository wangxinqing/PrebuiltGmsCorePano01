package defpackage;

import android.content.Context;
import android.util.LruCache;

/* renamed from: njs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class njs extends LruCache {
    public njs(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String nameForUid;
        Integer num = (Integer) obj;
        ihs b = ihs.b();
        if (b == null || (nameForUid = b.getPackageManager().getNameForUid(num.intValue())) == null) {
            return null;
        }
        aucd o = nig.g.o();
        if (hya.a((Context) b).a(num.intValue())) {
            String a = njt.a(nameForUid);
            if (o.c) {
                o.c();
                o.c = false;
            }
            nig nig = (nig) o.b;
            a.getClass();
            int i = nig.a | 1;
            nig.a = i;
            nig.b = a;
            nig.f = 2;
            nig.a = i | 16;
            return (nig) o.i();
        } else if (num.intValue() == jhg.a) {
            return njt.c;
        } else {
            return njt.b;
        }
    }
}
