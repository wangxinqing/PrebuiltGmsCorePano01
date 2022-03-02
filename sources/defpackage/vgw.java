package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: vgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vgw {
    public final Map a = new HashMap();
    public final Context b;
    public final arwg c;
    public vgv d;
    private long e;
    private final vav f;

    public vgw(Context context) {
        this.b = context;
        this.f = (vav) thl.a(context, vav.class);
        this.e = SystemClock.elapsedRealtime();
        this.c = (arwg) thl.a(context, arwg.class);
    }

    public static boolean b(tgh tgh) {
        return tgh != null && !TextUtils.isEmpty(tgh.a());
    }

    public final void a() {
        this.c.b();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        auyz auyz = this.f.f.i;
        if (auyz == null) {
            auyz = auyz.f;
        }
        if (elapsedRealtime - this.e >= auyz.b) {
            this.e = elapsedRealtime;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                if (elapsedRealtime > ((vgx) it.next()).a) {
                    it.remove();
                }
            }
            vgv vgv = this.d;
            if (vgv != null && elapsedRealtime > vgv.d) {
                b();
            }
        }
    }

    public final void b() {
        this.d = null;
    }

    public final void a(tgh tgh) {
        this.c.b();
        this.a.put(tgh, new vgx(tgh, ((vav) thl.a(this.b, vav.class)).f));
    }

    public final void a(tgh tgh, aval aval) {
        this.c.b();
        if (this.a.containsKey(tgh)) {
            vgx vgx = (vgx) this.a.get(tgh);
            if (aval != null && aval.c.size() != 0) {
                aucx aucx = aval.c;
                int size = aucx.size();
                for (int i = 0; i < size; i++) {
                    avam avam = (avam) aucx.get(i);
                    long currentTimeMillis = System.currentTimeMillis();
                    aucd aucd = (aucd) avam.c(5);
                    aucd.a((aucj) avam);
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    avam avam2 = (avam) aucd.b;
                    avam avam3 = avam.e;
                    avam2.a |= 4;
                    avam2.d = currentTimeMillis;
                    avam avam4 = (avam) aucd.i();
                    avch avch = avch.TOKEN_MEDIUM_UNKNOWN;
                    avch a2 = avch.a(avam4.b);
                    if (a2 == null) {
                        a2 = avch.TOKEN_MEDIUM_UNKNOWN;
                    }
                    int ordinal = a2.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            vgx.a(vgx.e);
                            vgx.e.add(avam4);
                        } else if (ordinal == 3 || ordinal == 6) {
                            vgx.a(vgx.d);
                            vgx.d.add(avam4);
                        } else if (ordinal != 8) {
                        }
                    }
                    vgx.a(vgx.c);
                    vgx.c.add(avam4);
                }
            }
        }
    }
}
