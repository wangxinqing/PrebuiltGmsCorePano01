package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncPolicy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: afij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afij implements afhs {
    public final Executor a;
    public final Context b;
    public final afit c;
    public final aubq d;
    public final Map e = new HashMap();
    public final sac f;
    private final afiq g;
    private final Account h;
    private final int i;
    private final int j;
    private final WeakHashMap k = new WeakHashMap();

    public afij(Executor executor, Context context, afit afit, sac sac, aubq aubq, afiq afiq, Account account, int i2, int i3) {
        this.a = executor;
        this.b = context;
        this.c = afit;
        this.f = sac;
        this.d = aubq;
        this.g = afiq;
        this.h = account;
        this.i = i2;
        this.j = i3;
    }

    private final afil b(afht afht) {
        afil afil;
        synchronized (this.k) {
            WeakReference weakReference = (WeakReference) this.k.get(afht);
            if (weakReference != null) {
                afil = (afil) weakReference.get();
            } else {
                afil = null;
            }
            if (afil == null) {
                afil = new afil(afht, this.d);
                this.k.put(afht, new WeakReference(afil));
            }
        }
        return afil;
    }

    public final afiu a(String str) {
        String str2 = str.length() == 0 ? new String("com.google.android.gms.mdh.BROADCAST_") : "com.google.android.gms.mdh.BROADCAST_".concat(str);
        Account account = this.h;
        aucd o = aukh.c.o();
        aucd o2 = aukv.e.o();
        int i2 = this.i;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aukv aukv = (aukv) o2.b;
        int i3 = aukv.a | 1;
        aukv.a = i3;
        aukv.b = i2;
        int i4 = this.j;
        aukv.a = i3 | 2;
        aukv.c = i4;
        auku auku = auku.SYNC_LATEST_PER_SECONDARY_ID;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aukv aukv2 = (aukv) o2.b;
        aukv2.d = auku.e;
        aukv2.a |= 4;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aukh aukh = (aukh) o.b;
        aukv aukv3 = (aukv) o2.i();
        aukv3.getClass();
        aukh.b = aukv3;
        aukh.a = 2;
        return new afir(str2, account, ((aukh) o.i()).k());
    }

    public final aorr a(afhr afhr) {
        Executor executor = this.a;
        sac sac = this.f;
        LatestFootprintFilter a2 = afie.a(afhr);
        acwd acwd = new acwd();
        sac.a(new rzx(acwd, new rzc(sac, a2, acwd)));
        return afip.a(executor, acwd.a, new afig(this));
    }

    public final aorr a(afht afht) {
        acwa acwa;
        Executor executor = this.a;
        sac sac = this.f;
        afil b2 = b(afht);
        synchronized (sac.i) {
            rzw rzw = (rzw) sac.i.get(b2);
            if (rzw == null) {
                acwa = acws.a((Object) false);
            } else {
                rzw.a = false;
                sag sag = rzw.c;
                if (sag != null) {
                    sag.a = false;
                }
                igc igc = sac.d.a((Object) b2, "registerLatestFootprintListener").b;
                iva.a((Object) igc, (Object) "Key must not be null");
                acwa = sac.d.a(igc);
            }
        }
        return afin.a(executor, acwa);
    }

    public final aorr a(afht afht, afhr afhr) {
        rzw rzw;
        acwi acwi;
        Executor executor = this.a;
        sac sac = this.f;
        afil b2 = b(afht);
        LatestFootprintFilter a2 = afie.a(afhr);
        synchronized (sac.i) {
            rzw rzw2 = (rzw) sac.i.get(b2);
            if (rzw2 != null) {
                rzw = rzw2;
            } else {
                rzw rzw3 = new rzw(sac);
                sac.i.put(b2, rzw3);
                rzw = rzw3;
            }
            rzw.a = true;
            ige a3 = sac.d.a((Object) b2, "registerLatestFootprintListener");
            igc igc = a3.b;
            iva.a((Object) igc, (Object) "Key must not be null");
            acwd acwd = new acwd();
            sac.a(new rzx(acwd, new rzf(sac, a3, rzw, b2, a2, igc, acwd)));
            acwi = acwd.a;
        }
        return afin.a(executor, acwi);
    }

    public final aorr a(byte[] bArr, audx audx) {
        Executor executor = this.a;
        sac sac = this.f;
        afiq afiq = this.g;
        aucf aucf = (aucf) aujv.a.o();
        aucf.a(afiq.a, audx);
        byte[] k2 = ((aujv) aucf.i()).k();
        acwd acwd = new acwd();
        sac.a(new rzx(acwd, new rze(sac, bArr, k2, acwd)));
        return afin.a(executor, acwd.a);
    }

    public final void a(aepj aepj, afhr afhr) {
        SyncPolicy syncPolicy;
        acwi acwi;
        Executor executor = this.a;
        sac sac = this.f;
        if (aepj != null) {
            aepc aepc = (aepc) aepj;
            syncPolicy = new SyncPolicy(aepc.a, afia.a(aepc.b), afia.a(aepc.c), afia.a(aepc.d), afia.a(aepc.e), aepc.f, aepc.g, aepc.h);
        } else {
            syncPolicy = null;
        }
        LatestFootprintFilter a2 = afie.a(afhr);
        acwd acwd = new acwd();
        synchronized (sac.h) {
            rzz rzz = new rzz(sac, acwd, syncPolicy, a2);
            if (sac.h.isEmpty()) {
                rzz.a();
            }
            sac.h.add(rzz);
            acwi = acwd.a;
        }
        afin.a(executor, acwi);
    }
}
