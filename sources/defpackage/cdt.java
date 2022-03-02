package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: cdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cdt {
    public final String a;
    public final uxi b;
    public final HashSet c;
    public HashSet d;
    public PendingIntent e = null;
    public int f = -1;
    public final cer g;
    final /* synthetic */ cdu h;
    private final uxh i;
    private boolean j;

    public cdt(cdu cdu, Context context, String str) {
        this.h = cdu;
        iva.c(str);
        this.a = str;
        uxj uxj = new uxj();
        uxj.a("0p:com.google.android.contextmanager");
        uxj.b();
        uxj.c = str;
        this.b = tcn.a(context, uxj.a());
        this.c = new HashSet();
        this.d = new HashSet();
        this.i = new cds(cdu);
        this.g = new cer((agvx) null, (agvx) null, awvb.i);
        this.j = false;
    }

    private static final uxf a(HashSet hashSet) {
        uxf uxf = new uxf();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            BeaconStateImpl.TypeFilterImpl typeFilterImpl = (BeaconStateImpl.TypeFilterImpl) it.next();
            uxf.a(typeFilterImpl.a(), typeFilterImpl.b());
        }
        return uxf;
    }

    private final void b() {
        this.b.a(this.i).a((acvp) new bva("[DetectedBeaconProducer] unsubscribe foreground, package=%s", this.a));
        this.j = false;
    }

    private final HashSet c() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            cas cas = (cas) it.next();
            if (!cas.f()) {
                ((anih) ((anih) bxk.a.b()).a("cdt", "c", 671, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedBeaconProducer] No production policy found for interestRecord=%s for package=%s", (Object) cas, (Object) this.a);
            } else {
                cbc g2 = cas.g();
                if (g2.a() != 4) {
                    ((anih) ((anih) bxk.a.b()).a("cdt", "c", 681, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedBeaconProducer] production policy type is wrong (found to be %s), package=%s", g2.a(), (Object) this.a);
                } else {
                    atkm atkm = g2.a;
                    String str = atkm.e;
                    String str2 = atkm.f;
                    if (str == null || str2 == null) {
                        ((anih) ((anih) bxk.a.b()).a("cdt", "c", 692, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedBeaconProducer] Missing beacon namespace(%s) or type(%s), package=%s", (Object) str, (Object) str2, (Object) this.a);
                    }
                    hashSet.add(new BeaconStateImpl.TypeFilterImpl(str, str2));
                }
            }
        }
        return hashSet;
    }

    private final void a(HashSet hashSet, uxf uxf) {
        uyn uyn = new uyn();
        uyn.a = Strategy.b;
        uyn.b = uxf.a();
        this.b.a(this.i, uyn.a()).a((acvp) new bva("[DetectedBeaconProducer] subscribe ble=%s, package=%s, pendigngIntentId=%s", hashSet, this.a, this.i));
        this.j = true;
    }

    private final void a(boolean z) {
        long j2 = this.g.c;
        HashSet hashSet = this.d;
        if (hashSet.size() == 0 && this.j) {
            b();
        } else if (z) {
            if (j2 < this.g.b()) {
                a(hashSet, a(hashSet));
            } else if (this.j) {
                b();
            }
        } else if (this.j) {
            if (j2 >= this.g.b()) {
                b();
            }
        } else if (j2 < this.g.b()) {
            a(hashSet, a(hashSet));
        }
    }

    public final void a(cas cas) {
        new Object[1][0] = cas;
        this.c.remove(cas);
        this.g.a(cas);
    }

    public final boolean a() {
        HashSet hashSet;
        HashSet hashSet2 = new HashSet();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            cas cas = (cas) it.next();
            if (!cas.f()) {
                ((anih) ((anih) bxk.a.b()).a("cdt", "c", 671, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedBeaconProducer] No production policy found for interestRecord=%s for package=%s", (Object) cas, (Object) this.a);
            } else {
                cbc g2 = cas.g();
                if (g2.a() != 4) {
                    ((anih) ((anih) bxk.a.b()).a("cdt", "c", 681, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedBeaconProducer] production policy type is wrong (found to be %s), package=%s", g2.a(), (Object) this.a);
                } else {
                    atkm atkm = g2.a;
                    String str = atkm.e;
                    String str2 = atkm.f;
                    if (str == null || str2 == null) {
                        ((anih) ((anih) bxk.a.b()).a("cdt", "c", 692, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedBeaconProducer] Missing beacon namespace(%s) or type(%s), package=%s", (Object) str, (Object) str2, (Object) this.a);
                    }
                    hashSet2.add(new BeaconStateImpl.TypeFilterImpl(str, str2));
                }
            }
        }
        if (hashSet2.equals(this.d)) {
            a(false);
            return true;
        }
        uxf uxf = new uxf();
        Iterator it2 = hashSet2.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            BeaconStateImpl.TypeFilterImpl typeFilterImpl = (BeaconStateImpl.TypeFilterImpl) it2.next();
            uxf.a(typeFilterImpl.a(), typeFilterImpl.b());
            i2++;
        }
        if (i2 == 0) {
            PendingIntent pendingIntent = this.e;
            if (pendingIntent != null) {
                this.b.e(pendingIntent).a((acvp) new bva("[DetectedBeaconProducer] unsubscribe beacons, package=%s", this.a));
            }
        } else if (this.e != null) {
            uyn uyn = new uyn();
            uyn.a = Strategy.b;
            uyn.b = uxf.a();
            uyn.b();
            this.b.a(this.e, uyn.a()).a((acvp) new bva("[DetectedBeaconProducer] subscribe beacons=%s, package=%s", hashSet2, this.a));
        } else {
            cdu cdu = this.h;
            ccj ccj = cdu.b;
            int i3 = 5;
            if (cdu.k.size() > 5) {
                ((anih) ((anih) bxk.a.b()).a("cdt", "a", 627, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedBeaconProducer] Over the limit for subscribing to Nearby. package=%s", (Object) this.a);
            } else {
                HashSet hashSet3 = null;
                for (cdt cdt : this.h.k.values()) {
                    int i4 = cdt.f;
                    if (i4 != -1) {
                        if (hashSet3 == null) {
                            hashSet3 = new HashSet();
                        }
                        hashSet3.add(Integer.valueOf(i4));
                    }
                }
                MessageFilter a2 = uxf.a();
                int i5 = 0;
                while (true) {
                    if (i5 >= i3) {
                        break;
                    }
                    if (hashSet3 != null && hashSet3.contains(Integer.valueOf(i5))) {
                        hashSet = hashSet3;
                    } else {
                        Intent intent = new Intent("com.google.android.contextmanager.module.DetectedBeaconProducer");
                        intent.setPackage("com.google.android.gms");
                        PendingIntent broadcast = PendingIntent.getBroadcast(this.h.d, i5, intent, 134217728);
                        uyn uyn2 = new uyn();
                        uyn2.a = Strategy.b;
                        uyn2.b = a2;
                        uyn2.b();
                        try {
                            hashSet = hashSet3;
                            try {
                                acws.a(this.b.a(broadcast, uyn2.a()), 5000, TimeUnit.MILLISECONDS);
                                this.e = broadcast;
                                this.f = i5;
                                if (bxk.a(2)) {
                                    Object[] objArr = {hashSet2, this.a, Integer.valueOf(i5)};
                                }
                            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                                e = e2;
                                anih anih = (anih) bxk.a.b();
                                anih.a(e);
                                ((anih) anih.a("cdt", "a", 613, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedBeaconProducer] Failed subscribe first time: package=%s,pendingIntentId=%s", (Object) this.a, i5);
                                i5++;
                                hashSet3 = hashSet;
                                i3 = 5;
                            }
                        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                            e = e3;
                            hashSet = hashSet3;
                            anih anih2 = (anih) bxk.a.b();
                            anih2.a(e);
                            ((anih) anih2.a("cdt", "a", 613, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedBeaconProducer] Failed subscribe first time: package=%s,pendingIntentId=%s", (Object) this.a, i5);
                            i5++;
                            hashSet3 = hashSet;
                            i3 = 5;
                        }
                    }
                    i5++;
                    hashSet3 = hashSet;
                    i3 = 5;
                }
            }
        }
        this.d = hashSet2;
        a(true);
        return i2 > 0;
    }
}
