package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: ahei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahei {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Executor c;
    private final agzs d;
    private final ahdg e;
    private final aoqb f;
    private final Map g;

    public ahei(Executor executor, agzs agzs, ahdg ahdg, Map map, ahgm ahgm) {
        amrl.a((Object) executor);
        this.c = executor;
        amrl.a((Object) agzs);
        this.d = agzs;
        amrl.a((Object) ahdg);
        this.e = ahdg;
        amrl.a((Object) map);
        this.g = map;
        amrl.a(!map.isEmpty());
        this.f = ahgm != null ? new aheg(new ahfl(ahgm, anln.a())) : aheh.a;
    }

    public final synchronized ahfv a(ahef ahef) {
        ahfv ahfv;
        Uri uri = ((ahcy) ahef).a;
        ahfv = (ahfv) this.a.get(uri);
        if (ahfv != null) {
            amrl.a(ahef.equals((ahef) this.b.get(uri)), "Arguments must match previous call for Uri: %s", (Object) uri);
        } else {
            Uri uri2 = ((ahcy) ahef).a;
            amrl.a(uri2.isHierarchical(), "Uri must be hierarchical: %s", (Object) uri2);
            String b2 = amrk.b(uri2.getLastPathSegment());
            int lastIndexOf = b2.lastIndexOf(46);
            boolean z = true;
            amrl.a((lastIndexOf != -1 ? b2.substring(lastIndexOf + 1) : "").equals("pb"), "Uri extension must be .pb: %s", (Object) uri2);
            amrl.a(((ahcy) ahef).b != null, (Object) "Proto schema cannot be null");
            amrl.a(((ahcy) ahef).f != null, (Object) "Handler cannot be null");
            String b3 = ((ahcy) ahef).d.b();
            ahfx ahfx = (ahfx) this.g.get(b3);
            if (ahfx == null) {
                z = false;
            }
            amrl.a(z, "No XDataStoreVariantFactory registered for ID %s", (Object) b3);
            String b4 = amrk.b(((ahcy) ahef).a.getLastPathSegment());
            int lastIndexOf2 = b4.lastIndexOf(46);
            ahfv ahfv2 = new ahfv(ahfx.a(ahef, lastIndexOf2 != -1 ? b4.substring(0, lastIndexOf2) : b4, this.c, this.d, ahdf.a), this.e, aopr.a(aorl.a((Object) ((ahcy) ahef).a), this.f, (Executor) aoqm.a));
            amzy amzy = ((ahcy) ahef).c;
            if (!amzy.isEmpty()) {
                ahfv2.a(new ahed(amzy, this.c));
            }
            this.a.put(uri, ahfv2);
            this.b.put(uri, ahef);
            ahfv = ahfv2;
        }
        return ahfv;
    }
}
