package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: cdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cdu extends ccy {
    public static final ccj b = new cdo(new cdn(), "DetectedBeaconProducer", new int[]{26});
    public final HashMap k = new HashMap();
    public final HashMap l = new HashMap();
    private final uxh m = new cds(this);
    private final bwp n = new cdp(this, "DetectedBeaconProducer");

    public cdu(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
    }

    private final void b(long j) {
        if (!ibt.c(cbi.p().a(26, j, cbi.a(this.e, "DetectedBeaconProducer")))) {
            ((anih) ((anih) bxk.a.b()).a("cdu", "b", 261, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedBeaconProducer] Failed to close ongoing contexts.");
        }
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.contextmanager.module.DetectedBeaconProducer");
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (!ibt.c(cbi.p().a(26, cbi.i().a(), cbi.a(this.e, "DetectedBeaconProducer")))) {
            ((anih) ((anih) bxk.a.b()).a("cdu", "b", 261, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedBeaconProducer] Failed to close ongoing contexts.");
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (!this.l.isEmpty()) {
            WriteBatchImpl b2 = juc.b();
            long a = cbi.i().a();
            for (ContextData jti : this.l.values()) {
                jti jti2 = new jti(jti);
                jti2.a(a);
                b2.a(jti2.a());
            }
            a(b2);
            this.l.clear();
        }
        for (cdt cdt : this.k.values()) {
            PendingIntent pendingIntent = cdt.e;
            if (pendingIntent != null) {
                cdt.b.e(pendingIntent).a((acvp) new bva("[DetectedBeaconProducer] unsubscribe, package=%s", cdt.a));
            }
        }
    }

    public final void a(Context context, Intent intent) {
        int i = tcn.a;
        vce.a(intent, this.m);
    }

    public final void a(cas cas) {
        new Object[1][0] = cas;
        cdt cdt = (cdt) this.k.get(cas.b.a());
        if (cdt != null) {
            cdt.a(cas);
            cbi.k().a((Runnable) this.n);
            this.n.a(bvq.a("ResubscribeIfNecessary"));
        }
    }

    public final void a(cas cas, cas cas2) {
        Object[] objArr = {cas, cas2};
        if (cas2 != null) {
            cdt cdt = (cdt) this.k.get(cas2.b.a());
            if (cdt != null) {
                cdt.a(cas2);
            }
        }
        if (cas.f()) {
            String a = cas.b.a();
            cdt cdt2 = (cdt) this.k.get(a);
            if (cdt2 == null) {
                cdt2 = new cdt(this, this.d, a);
                this.k.put(a, cdt2);
            }
            new Object[1][0] = cas;
            cdt2.c.add(cas);
            cdt2.g.a(cas, (cas) null);
        }
        cbi.k().a((Runnable) this.n);
        this.n.a(bvq.a("ResubscribeIfNecessary"));
    }

    public final boolean a(String str, String str2, byte[] bArr) {
        for (cdt cdt : this.k.values()) {
            Iterator it = cdt.d.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((BeaconStateImpl.TypeFilterImpl) it.next()).a(str, str2, bArr)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
