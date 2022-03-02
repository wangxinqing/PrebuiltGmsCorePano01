package defpackage;

import android.app.PendingIntent;
import android.os.Parcelable;
import com.google.android.contextmanager.fence.FencePendingIntentCache$FencePendingIntentItem;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: bxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxe extends bwp {
    private final jxf c;
    private final ContextManagerClientInfo d;
    private final bvu e;

    public bxe(jxf jxf, ContextManagerClientInfo contextManagerClientInfo, bvu bvu) {
        super("UnregisterListenerOperation");
        this.c = jxf;
        this.d = contextManagerClientInfo;
        this.e = bvu;
    }

    private final void a(int i) {
        int i2;
        bwf.a(this.c, i);
        btx G = cbi.G();
        ContextManagerClientInfo contextManagerClientInfo = this.d;
        if (this.e.a == null) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        aucd a = btx.a(contextManagerClientInfo, 7, i);
        aucd o = atnz.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atnz atnz = (atnz) o.b;
        atnz.b = i2 - 1;
        atnz.a |= 1;
        if (a.c) {
            a.c();
            a.c = false;
        }
        atnj atnj = (atnj) a.b;
        atnz atnz2 = (atnz) o.i();
        atnj atnj2 = atnj.o;
        atnz2.getClass();
        atnj.j = atnz2;
        atnj.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        G.a((atnj) a.i());
    }

    /* access modifiers changed from: protected */
    public final void a() {
        cap r = cbi.r();
        if (!this.d.b()) {
            a(7504);
            return;
        }
        r.a(this.d.a(), (bvt) this.e);
        if (this.e.a != null) {
            byd E = cbi.E();
            PendingIntent pendingIntent = this.e.a;
            E.e();
            byp byp = E.b.d;
            if (byp.f != null) {
                byl byl = (byl) byp.c.get(pendingIntent);
                if (!(byl == null || byl.d == null)) {
                    byl.d = null;
                    if (byl.c()) {
                        byp.c.remove(byl.a);
                        byp.d.remove(byl.b);
                        byp.f.b((Parcelable) new FencePendingIntentCache$FencePendingIntentItem(byl.b, byl.a));
                        jjg jjg = bxk.a;
                    }
                }
            } else {
                ((anih) ((anih) bxk.a.b()).a("byp", "a", 289, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]Could not removeListener pendingIntent=%s. Cache is null.", (Object) pendingIntent);
            }
            cbi.E().d();
        }
        a(0);
    }
}
