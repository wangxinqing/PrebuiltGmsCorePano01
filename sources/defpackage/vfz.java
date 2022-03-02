package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;
import java.util.HashSet;

/* renamed from: vfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vfz extends arwm {
    final /* synthetic */ SubscribeRequest a;
    final /* synthetic */ vgh b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfz(vgh vgh, String str, SubscribeRequest subscribeRequest) {
        super(str);
        this.b = vgh;
        this.a = subscribeRequest;
    }

    public final void run() {
        long j;
        uxy a2 = this.b.a(this.a.n);
        SubscribeRequest subscribeRequest = this.a;
        uyf uyf = a2.e;
        try {
            if (subscribeRequest.b != null) {
                int a3 = ClientAppContext.a(subscribeRequest.q, uyf.a.c);
                if (!uyf.a(a3, subscribeRequest.d) || !uyf.c(subscribeRequest) || !uyf.a(subscribeRequest.d) || !uyf.d(subscribeRequest) || !uyf.a("subscribe", subscribeRequest.d, a3) || !uyf.b(subscribeRequest)) {
                    return;
                }
            } else if (subscribeRequest.f == null) {
                throw new IllegalArgumentException("SubscribeRequest missing both messageListener and pendingIntent");
            } else if (uyf.c(subscribeRequest) && uyf.a(subscribeRequest.d) && uyf.d(subscribeRequest)) {
                PendingIntent pendingIntent = subscribeRequest.f;
                vci vci = subscribeRequest.d;
                if (!vcr.a(pendingIntent).equals(uyf.a.d)) {
                    String str = uyf.a.d;
                    String a4 = vcr.a(pendingIntent);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 85 + String.valueOf(a4).length());
                    sb.append("The PendingIntent creator must be the package making the API call. Expected ");
                    sb.append(str);
                    sb.append(" but was ");
                    sb.append(a4);
                    uxy.a(new Status(10, sb.toString()), vci);
                    return;
                } else if (uyf.d(subscribeRequest.d)) {
                    PendingIntent pendingIntent2 = subscribeRequest.f;
                    vci vci2 = subscribeRequest.d;
                    uyt uyt = (uyt) thl.a(uyf.b, uyt.class);
                    ClientAppIdentifier clientAppIdentifier = uyf.a;
                    uyt.g.b();
                    uyt.g.b();
                    iva.a((Object) clientAppIdentifier);
                    HashSet hashSet = new HashSet();
                    if (uyt.d.d(clientAppIdentifier)) {
                        for (uyq uyq : ((amxb) uyt.d).c((Object) clientAppIdentifier)) {
                            PendingIntent pendingIntent3 = uyq.b.b;
                            if (pendingIntent3 != null) {
                                hashSet.add(pendingIntent3);
                            }
                        }
                    }
                    hashSet.add(pendingIntent2);
                    if (hashSet.size() > 5) {
                        uxy.a(new Status(2801, "Will exceed MAX_PENDING_INTENTS_PER_APP=5"), vci2);
                        return;
                    } else if (!uyf.b(subscribeRequest)) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            if (subscribeRequest.b == null) {
                PendingIntent pendingIntent4 = subscribeRequest.f;
                iva.a((Object) pendingIntent4);
                Strategy strategy = subscribeRequest.c;
                MessageFilter messageFilter = subscribeRequest.e;
                vci vci3 = subscribeRequest.d;
                jjg jjg = tgc.a;
                int i = strategy.e;
                int i2 = strategy.f;
                int i3 = strategy.i;
                uyb uyb = new uyb(a2.b, 4);
                a2.d.a(uyb, messageFilter, strategy, true);
                uyq uyq2 = new uyq(new uyp(pendingIntent4), messageFilter, uxy.a(strategy, false, true));
                uyp uyp = uyq2.b;
                int i4 = subscribeRequest.p;
                if (i4 != 0) {
                    uyp.c = i4;
                }
                a2.f.a(vdo.a(uyq2, a2.a(vci3, uyb)), a2.b(vci3), a2.b);
                uyq a5 = a2.i.a(pendingIntent4);
                if (a5 != null) {
                    a2.h.a(new vaq(pendingIntent4), strategy.e, subscribeRequest.l);
                    uwl uwl = a2.c;
                    ClientAppIdentifier clientAppIdentifier2 = a2.b;
                    String str2 = a5.a;
                    iva.a((Object) subscribeRequest.f);
                    ikh ikh = uwl.a;
                    long j2 = (long) subscribeRequest.c.e;
                    if (j2 != 2147483647L) {
                        j = SystemClock.elapsedRealtime() + (j2 * 1000);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("t", j);
                    bundle.putParcelable("s", subscribeRequest);
                    bundle.putByteArray("i", ivy.a(clientAppIdentifier2));
                    bundle.putString("d", str2);
                    ikh.a((Parcelable) bundle);
                } else {
                    a2.h.a(pendingIntent4);
                    a2.c.a(pendingIntent4);
                }
            } else {
                if (subscribeRequest.g != 0) {
                    if (a2.j == null) {
                        a2.j = new SparseArray();
                    }
                    vcf vcf = (vcf) a2.j.get(subscribeRequest.g);
                    if (vcf != null) {
                        a2.a(new UnsubscribeRequest(vcf.asBinder(), (IBinder) null, (PendingIntent) null));
                    }
                    a2.j.put(subscribeRequest.g, subscribeRequest.b);
                }
                vcf vcf2 = subscribeRequest.b;
                Strategy strategy2 = subscribeRequest.c;
                MessageFilter messageFilter2 = subscribeRequest.e;
                vci vci4 = subscribeRequest.d;
                vcq vcq = subscribeRequest.l;
                jjg jjg2 = tgc.a;
                int i5 = strategy2.e;
                int i6 = strategy2.f;
                int i7 = strategy2.i;
                uyb uyb2 = new uyb(a2.b, 4);
                a2.d.a(uyb2, messageFilter2, strategy2, false);
                a2.f.a(vdo.a(new uyq(new uyp(vcf2), messageFilter2, uxy.a(strategy2, messageFilter2.a(), true)), a2.a(vci4, uyb2)), a2.b(vci4), a2.b);
                a2.h.a(new vaq(vcf2), strategy2.e, vcq);
            }
            uyd.a(a2.a);
        } catch (Exception e) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("uyf", "a", 138, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbyPreconditions: Exception trying to check %s", (Object) subscribeRequest);
            uxy.a(new Status(8), subscribeRequest.d);
        }
    }
}
