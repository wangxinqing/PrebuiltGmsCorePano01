package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.io.Closeable;
import java.util.Collection;
import java.util.Map;

/* renamed from: vbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vbu implements Closeable, uxc {
    public final oi a;
    public final uyt b;
    public final Context c;
    public final ClientAppIdentifier d;
    public val e;
    public String f;
    public final vbm g;
    private final vak h;

    public vbu(Context context, ClientAppIdentifier clientAppIdentifier, vbm vbm) {
        vak vak = (vak) thl.a(context, vak.class);
        this.c = context;
        this.d = clientAppIdentifier;
        this.g = vbm;
        this.h = vak;
        this.b = (uyt) thl.a(context, uyt.class);
        auyy auyy = ((vav) thl.a(context, vav.class)).f.d;
        this.a = new vbr(this, (auyy == null ? auyy.v : auyy).s);
        vak.a((vaj) new vbs(this));
    }

    public final Collection a() {
        return b().values();
    }

    /* access modifiers changed from: package-private */
    public final Map b() {
        return this.a.b();
    }

    public final void close() {
        val val = this.e;
        if (val != null) {
            val.b();
            this.e = null;
        }
    }

    public final void a(int i) {
        if (i >= 80) {
            jjg jjg = tgc.a;
            this.a.a();
        }
    }

    public final boolean a(avae avae) {
        if (avae.d.size() > 0 || avae.e.size() > 0) {
            vak vak = this.h;
            aucx aucx = avae.d;
            aucx aucx2 = avae.e;
            vak.l.b();
            int size = aucx.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    i++;
                    if (vak.h.containsKey((auzf) aucx.get(i))) {
                        break;
                    }
                } else {
                    loop1:
                    for (vai vai : vak.g.values()) {
                        int size2 = aucx2.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size2) {
                                i2++;
                                if (vai.d.containsKey((String) aucx2.get(i2))) {
                                    break loop1;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
