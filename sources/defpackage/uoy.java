package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.mdns.MdnsOptions;
import com.google.android.gms.mdns.MdnsSearchOptions;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* renamed from: uoy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uoy extends urq {
    private final Context a;
    private final ConnectivityManager b;
    private final uow c;
    private final String d;
    private sny e;

    public uoy(Context context, ConnectivityManager connectivityManager, uow uow, String str) {
        super(42);
        this.a = context;
        this.b = connectivityManager;
        this.c = uow;
        this.d = str;
    }

    public final void a() {
        sny sny = this.e;
        if (sny != null) {
            igc igc = sny.a((Object) this.c, sny.a).b;
            iva.a((Object) igc, (Object) "key must not be null");
            sny.a(igc);
            this.e = null;
            return;
        }
        jjg jjg = ulh.a;
    }

    public final int b() {
        if (!uoz.a(this.b)) {
            ((anih) ((anih) ulh.a.d()).a("uoy", "b", 1018, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't discover over the local area network because we're not connected over Wifi.");
            return 4;
        } else if (!jkr.g() || !uoz.c()) {
            ((anih) ((anih) ulh.a.d()).a("uoy", "b", 1024, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't discover over the local area network because mDNS isn't available.");
            return 4;
        } else {
            String h = uoz.h(this.d);
            Context context = this.a;
            snr snr = new snr(h, "NearbyConnections");
            sny sny = new sny(context, new MdnsOptions(snr.a, snr.b));
            uow uow = this.c;
            snt snt = new snt();
            snt.b = false;
            MdnsSearchOptions mdnsSearchOptions = new MdnsSearchOptions(new ArrayList(snt.a), snt.b);
            ige a2 = sny.a((Object) uow, sny.a);
            igc igc = a2.b;
            iva.a((Object) igc, (Object) "Key must not be null");
            try {
                acws.a(sny.a((igi) new snw(a2, a2, mdnsSearchOptions), (ihg) new snx(igc, a2)));
                this.e = sny;
                ((anih) ((anih) ulh.a.d()).a("uoy", "b", 1041, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully started Wifi LAN discovery for serviceID %s.", (Object) this.d);
                return 2;
            } catch (InterruptedException | ExecutionException e2) {
                anih anih = (anih) ulh.a.c();
                anih.a(e2);
                ((anih) anih.a("uoy", "b", 1044, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start Wifi LAN discovery");
                return 4;
            }
        }
    }
}
