package defpackage;

import android.os.RemoteException;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.DriveEvent;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;

/* renamed from: kml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kml implements Runnable {
    final /* synthetic */ ChangeEvent a;
    final /* synthetic */ knc b;

    public kml(ChangeEvent changeEvent, knc knc) {
        this.a = changeEvent;
        this.b = knc;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List, java.util.Collection] */
    public final void run() {
        ksw ksw = lsm.a().v;
        ChangeEvent changeEvent = this.a;
        knc knc = this.b;
        kdx kdx = ksw.c;
        ? a2 = kdx.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            kec kec = ((kef) a2.get(i)).d;
            krr krr = kec.l;
            if (krr.a(changeEvent.a)) {
                try {
                    krr.a(changeEvent, kdx.b.a(kec.d, knc));
                } catch (kcs e) {
                }
            }
        }
        ktm ktm = ksw.b;
        iva.a((Object) knc, (Object) "Entry can't be null for change events");
        HashSet<kpk> hashSet = new HashSet<>();
        synchronized (ktm.d) {
            Set set = (Set) ktm.d.get(knc);
            if (set != null) {
                hashSet.addAll(set);
            }
        }
        if (!hashSet.isEmpty()) {
            HashSet<kpk> hashSet2 = new HashSet<>();
            for (kpk kpk : hashSet) {
                khq g = ktm.b.g(kpk.b);
                if (g != null) {
                    try {
                        kmp a3 = ktm.b.a(g, knc);
                        String str = g.c.b;
                        try {
                            ktm.c.a(str, (DriveEvent) changeEvent);
                            ktm.a.a("Raised change event to subscription: %s", changeEvent);
                            ktm.a(25, g, a3);
                        } catch (Exception e2) {
                            ktm.a.c("SubscriptionStore", String.format("Error raising changeEvent to one subscriber: %s", new Object[]{str}), e2);
                        }
                    } catch (kcs e3) {
                    }
                } else {
                    hashSet2.add(kpk);
                }
            }
            synchronized (ktm.d) {
                for (kpk kpk2 : hashSet2) {
                    ktm.a(kpk2.a, kpk2.b);
                }
            }
        }
        HashSet<krm> hashSet3 = new HashSet<>();
        synchronized (ktm.e) {
            hashSet3.addAll(ktm.e);
        }
        if (!hashSet3.isEmpty()) {
            HashSet<kpk> hashSet4 = new HashSet<>();
            for (krm krm : hashSet3) {
                kpk kpk3 = krm.b;
                khq g2 = ktm.b.g(kpk3.b);
                if (g2 != null) {
                    try {
                        try {
                            if (krm.a.a(ktm.b.a(g2, knc))) {
                                ktm.a.b("Raised changes available event to subscription");
                                ktm.a(47, g2, (kmp) null);
                                if (krm.c()) {
                                    kpk3.e = kti.a(krm.c, krm.d, krm.e, ktm.b.c(g2.a));
                                    kpk3.t();
                                } else {
                                    ktm.a.b("Removing inactive changes available subscription");
                                    kpk3.u();
                                    hashSet4.add(kpk3);
                                }
                            }
                        } catch (RemoteException e4) {
                            ktm.a.c("SubscriptionStore", "Error raising changes available event to one subscriber", e4);
                        }
                    } catch (kcs e5) {
                    } catch (JSONException e6) {
                        ktm.a.c("SubscriptionStore", "Error serializing subscription details. Removing subscription", e6);
                        kpk3.u();
                        hashSet4.add(kpk3);
                    }
                } else {
                    hashSet4.add(kpk3);
                }
            }
            synchronized (ktm.e) {
                for (kpk kpk4 : hashSet4) {
                    ktm.a(kpk4.b);
                }
            }
        }
    }
}
