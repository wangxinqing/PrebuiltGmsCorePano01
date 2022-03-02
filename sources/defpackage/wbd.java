package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Map;

/* renamed from: wbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wbd {
    private static wbd a;
    private final Map b = new nz();

    private wbd() {
    }

    public static synchronized wbd a() {
        wbd wbd;
        synchronized (wbd.class) {
            if (a == null) {
                a = new wbd();
            }
            wbd = a;
        }
        return wbd;
    }

    public final synchronized void b() {
        for (ShareTarget shareTarget : this.b.keySet()) {
            ((ige) this.b.get(shareTarget)).a(new wbc(shareTarget));
        }
        this.b.clear();
    }

    public final synchronized void a(ShareTarget shareTarget) {
        this.b.remove(shareTarget);
    }

    public final synchronized void a(ShareTarget shareTarget, ige ige) {
        this.b.put(shareTarget, ige);
    }

    public final synchronized void a(ige ige) {
        this.b.values().remove(ige);
    }
}
