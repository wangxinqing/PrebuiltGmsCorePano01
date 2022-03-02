package defpackage;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInChimeraActivity;
import java.util.HashSet;
import java.util.concurrent.TimeoutException;

/* renamed from: uyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyf {
    public final ClientAppIdentifier a;
    public final Context b;
    public int c;
    private final uwl d;
    private final vgm e;

    public uyf(ClientAppIdentifier clientAppIdentifier, Context context, uwl uwl, vgm vgm) {
        this.a = clientAppIdentifier;
        this.b = context;
        this.d = uwl;
        this.e = vgm;
    }

    public static boolean a(int i) {
        return i < 9000000;
    }

    private final boolean b() {
        return (this.c & 1) != 0;
    }

    private final boolean c() {
        return a(jim.a(this.b, this.a.d));
    }

    public final boolean d(SubscribeRequest subscribeRequest) {
        return a(subscribeRequest.d, subscribeRequest.c);
    }

    public static boolean a(int i, vci vci) {
        if (i >= 0 && i < 4) {
            return true;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("Invalid calling context ");
        sb.append(i);
        uxy.a(new Status(8, sb.toString()), vci);
        return false;
    }

    public final boolean b(SubscribeRequest subscribeRequest) {
        boolean a2 = subscribeRequest.e.a();
        if (!a2 || subscribeRequest.c.a()) {
            return a(subscribeRequest.c, a2, subscribeRequest.d);
        }
        uxy.a(new Status(10, "Discovery mode must be SCAN or DEFAULT for a raw audio subscribe."), subscribeRequest.d);
        return false;
    }

    public final boolean d(vci vci) {
        try {
            this.d.a();
            return true;
        } catch (InterruptedException | TimeoutException e2) {
            uxy.a(new Status(8), vci);
            return false;
        }
    }

    private final boolean a(String str) {
        return arze.a(this.b, this.a.d, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r9.a.a(3) == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(com.google.android.gms.nearby.messages.internal.SubscribeRequest r10) {
        /*
            r9 = this;
            boolean r0 = r10.o
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000a
            int r0 = r10.p
            if (r0 == 0) goto L_0x0012
        L_0x000a:
            com.google.android.gms.nearby.messages.ClientAppIdentifier r0 = r9.a
            boolean r0 = r0.a((int) r2)
            if (r0 == 0) goto L_0x0053
        L_0x0012:
            com.google.android.gms.nearby.messages.Strategy r0 = r10.c
            int r0 = r0.j
            if (r0 == r2) goto L_0x0048
            com.google.android.gms.nearby.messages.MessageFilter r0 = r10.e
            java.util.List r0 = r0.c
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r5 = "__eddystone_url"
            r4[r1] = r5
            java.lang.String r5 = "__ble_record"
            r4[r2] = r5
            java.util.Iterator r0 = r0.iterator()
        L_0x002b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0052
            java.lang.Object r5 = r0.next()
            com.google.android.gms.nearby.messages.internal.MessageType r5 = (com.google.android.gms.nearby.messages.internal.MessageType) r5
            r6 = 0
        L_0x0038:
            if (r6 >= r3) goto L_0x002b
            r7 = r4[r6]
            java.lang.String r8 = r5.c
            boolean r7 = defpackage.ius.a(r8, r7)
            if (r7 == 0) goto L_0x0045
            goto L_0x0048
        L_0x0045:
            int r6 = r6 + 1
            goto L_0x0038
        L_0x0048:
            com.google.android.gms.nearby.messages.ClientAppIdentifier r0 = r9.a
            r3 = 3
            boolean r0 = r0.a((int) r3)
            if (r0 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            return r2
        L_0x0053:
            jjg r0 = defpackage.tgc.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r2 = 281(0x119, float:3.94E-43)
            java.lang.String r3 = "uyf"
            java.lang.String r4 = "c"
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r4, (int) r2, (java.lang.String) r5)
            anih r0 = (defpackage.anih) r0
            com.google.android.gms.nearby.messages.ClientAppIdentifier r2 = r9.a
            java.lang.String r3 = "This client has made an illegal request: %s"
            r0.a((java.lang.String) r3, (java.lang.Object) r2)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r2 = 2806(0xaf6, float:3.932E-42)
            r0.<init>(r2)
            vci r10 = r10.d
            defpackage.uxy.a((com.google.android.gms.common.api.Status) r0, (defpackage.vci) r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uyf.c(com.google.android.gms.nearby.messages.internal.SubscribeRequest):boolean");
    }

    public final boolean a() {
        int i;
        if (this.e.b(this.a.c()) || this.a.d() || (i = this.c) == 0) {
            return true;
        }
        if ((i & 2) != 0) {
            if (!a("android.permission.ACCESS_FINE_LOCATION")) {
                return false;
            }
            if (aync.a.a().F() && jkr.h() && !a("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                return false;
            }
            i ^= 2;
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    public final boolean b(vci vci) {
        if (a()) {
            return true;
        }
        String c2 = this.a.c();
        if (!c() || !this.e.a(c2)) {
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Nearby.Messages is not enabled for this app: ");
            sb.append(valueOf);
            uxy.a(new Status(2802, sb.toString()), vci);
            return false;
        }
        jjg jjg = tgc.a;
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
        sb2.append("Nearby.Messages is not enabled for this app: ");
        sb2.append(valueOf2);
        uxy.a(new Status(2802, sb2.toString(), NearbyMessagesAppOptInChimeraActivity.a(this.b, c2)), vci);
        return false;
    }

    public final boolean c(vci vci) {
        if (!uxv.a(this.b, this.a.d, aync.a.a().h())) {
            return true;
        }
        uxy.a(new Status(2804, String.valueOf(this.a.d).concat(" reached its quota limit.")), vci);
        ((anih) ((anih) tgc.a.c()).a("uyf", "c", 569, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s reached its quota limit.", (Object) this.a.d);
        return false;
    }

    public final boolean a(Strategy strategy, boolean z, vci vci) {
        if (z && !strategy.e()) {
            uxy.a(new Status(10, "Discovery medium must be either DEFAULT or ULTRASOUND for raw audio messages."), vci);
            return false;
        }
        ased ased = (ased) thl.b(this.b, ased.class);
        if (strategy.h == 2 && ased != null) {
            boolean a2 = uxu.a(this.b, ased, avch.BLE_ADVERTISING_PACKET);
            boolean a3 = uxu.a(this.b, ased, avch.BLE_ADVERTISING_PACKET, strategy.j);
            int i = strategy.i;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        StringBuilder sb = new StringBuilder(35);
                        sb.append("Invalid discovery mode: ");
                        sb.append(i);
                        uxy.a(new Status(13, sb.toString()), vci);
                        return false;
                    } else if (!a2 && !a3) {
                        uxy.a(new Status(2822), vci);
                        return false;
                    }
                } else if (!a3) {
                    uxy.a(new Status(2822), vci);
                    return false;
                }
            } else if (!a2) {
                uxy.a(new Status(2821), vci);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(SubscribeRequest subscribeRequest) {
        try {
            if (subscribeRequest.b != null) {
                int a2 = ClientAppContext.a(subscribeRequest.q, this.a.c);
                return a(a2, subscribeRequest.d) && c(subscribeRequest) && a(subscribeRequest.d) && d(subscribeRequest) && a("subscribe", subscribeRequest.d, a2) && b(subscribeRequest);
            } else if (subscribeRequest.f != null) {
                if (c(subscribeRequest) && a(subscribeRequest.d) && d(subscribeRequest)) {
                    PendingIntent pendingIntent = subscribeRequest.f;
                    vci vci = subscribeRequest.d;
                    if (!vcr.a(pendingIntent).equals(this.a.d)) {
                        String str = this.a.d;
                        String a3 = vcr.a(pendingIntent);
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 85 + String.valueOf(a3).length());
                        sb.append("The PendingIntent creator must be the package making the API call. Expected ");
                        sb.append(str);
                        sb.append(" but was ");
                        sb.append(a3);
                        uxy.a(new Status(10, sb.toString()), vci);
                    } else if (d(subscribeRequest.d)) {
                        PendingIntent pendingIntent2 = subscribeRequest.f;
                        vci vci2 = subscribeRequest.d;
                        uyt uyt = (uyt) thl.a(this.b, uyt.class);
                        ClientAppIdentifier clientAppIdentifier = this.a;
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
                        } else if (b(subscribeRequest)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                throw new IllegalArgumentException("SubscribeRequest missing both messageListener and pendingIntent");
            }
        } catch (Exception e2) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uyf", "a", 138, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbyPreconditions: Exception trying to check %s", (Object) subscribeRequest);
            uxy.a(new Status(8), subscribeRequest.d);
            return false;
        }
    }

    public final boolean a(String str, vci vci, int i) {
        boolean z;
        auyw auyw = ((vav) thl.a(this.b, vav.class)).f.o;
        if (auyw == null) {
            auyw = auyw.c;
        }
        if (!auyw.b) {
            return true;
        }
        if (ClientAppIdentifier.b(this.a.d)) {
            jjg jjg = tgc.a;
            return true;
        }
        Context context = this.b;
        String str2 = this.a.d;
        if (aynf.f()) {
            z = uxv.a(context, str2);
        } else {
            z = uxv.a(context, str2, aync.a.a().v());
        }
        if (z) {
            jjg jjg2 = tgc.a;
            return true;
        } else if (i == 0) {
            jjg jjg3 = tgc.a;
            return true;
        } else if (i == 1) {
            jjg jjg4 = tgc.a;
            return true;
        } else {
            if (i == 3) {
                String str3 = this.a.d;
                for (ActivityManager.RunningServiceInfo next : ((ActivityManager) this.b.getSystemService("activity")).getRunningServices((int) aync.a.a().s())) {
                    if (str3 != null && next.service != null && str3.equals(next.service.getPackageName()) && next.foreground) {
                        jjg jjg5 = tgc.a;
                        return true;
                    }
                }
            }
            uxy.a(new Status(2803, "Attempting to perform a high-power operation from a non-Activity Context"), vci);
            ((anih) ((anih) tgc.a.c()).a("uyf", "a", 390, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Disallowing high-power mode %s for %s", (Object) str, (Object) this.a);
            return false;
        }
    }

    public final boolean a(vci vci) {
        return b(vci) && c(vci);
    }

    public final boolean a(vci vci, Strategy strategy) {
        if (c()) {
            jjg jjg = tgc.a;
            return true;
        }
        boolean a2 = strategy.a();
        if (strategy.e() && !b() && a2) {
            uxy.a(new Status(2807, "Missing microphone permission"), vci);
            return false;
        } else if (strategy.f == 1 && (!a2 || b())) {
            return true;
        } else {
            if (strategy.c() && (this.c & 2) == 0) {
                uxy.a(new Status(2807, "Missing Bluetooth Low Energy permission"), vci);
                return false;
            } else if (!strategy.d() || (this.c & 6) != 0) {
                return true;
            } else {
                uxy.a(new Status(2807, "Missing Bluetooth permission"), vci);
                return false;
            }
        }
    }
}
