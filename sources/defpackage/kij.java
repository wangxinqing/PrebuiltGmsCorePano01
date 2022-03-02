package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: kij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kij {
    public final Map a = new HashMap();
    final /* synthetic */ kim b;

    public kij(kim kim) {
        this.b = kim;
    }

    public final kis a(Object obj, kik kik) {
        kis kis;
        synchronized (this.a) {
            kit kit = (kit) this.a.get(obj);
            if (kit == null) {
                kit = kik.a(new kin(new kii(this, obj)));
                kim.a.a("ContentDownloadManager", "Queueing new download for: %s", kit);
                this.a.put(obj, kit);
                kim kim = this.b;
                ((jfz) kim.j).submit((Runnable) new kil(kim, kit));
            } else {
                kim.a.a("ContentDownloadManager", "Joining existing download task for: %s", kit);
            }
            kit.a.incrementAndGet();
            kis = new kis(kit);
        }
        return kis;
    }
}
