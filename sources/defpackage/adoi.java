package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: adoi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adoi extends adog {
    public static final iwd f = adnt.g("ZeroRatedNetworkRequester");
    private static final anaf i;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);
    private final List j;
    private final boolean k;
    private final long l;
    private final long m;

    static {
        anab anab = new anab();
        anab.a("CAPTIVE_PORTAL", 17);
        anab.a("DUN", 2);
        anab.a("EIMS", 10);
        anab.a("FOTA", 3);
        anab.a("IA", 7);
        anab.a("IMS", 4);
        anab.a("INTERNET", 12);
        anab.a("MMS", 0);
        anab.a("NOT_METERED", 11);
        anab.a("NOT_RESTRICTED", 13);
        anab.a("NOT_VPN", 15);
        anab.a("RCS", 8);
        anab.a("SUPL", 1);
        anab.a("TRUSTED", 14);
        anab.a("VALIDATED", 16);
        anab.a("WIFI_P2P", 6);
        anab.a("XCAP", 9);
        i = anab.a();
    }

    private adoi(Context context, List list, boolean z, long j2, long j3) {
        super(context);
        this.j = list;
        this.k = z;
        this.l = j2;
        this.m = j3;
    }

    public static adoi a(Context context, List list, boolean z, long j2, long j3) {
        amrl.a(jkr.b());
        return new adoi(context, list, z, j2, j3);
    }

    public final void c() {
        if (this.b.getPackageManager().checkPermission("android.permission.CONNECTIVITY_USE_RESTRICTED_NETWORKS", this.b.getPackageName()) == 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.j) {
                Integer num = (Integer) i.get(str);
                if (num != null) {
                    arrayList.add(num);
                } else {
                    String valueOf = String.valueOf(str);
                    throw new IOException(valueOf.length() == 0 ? new String("Capabilities contains invalid value: ") : "Capabilities contains invalid value: ".concat(valueOf));
                }
            }
            try {
                b(this.l);
                this.g.set(true);
            } catch (IOException e) {
                f.e("Failed to acquire the non-metered network.", e, new Object[0]);
                try {
                    a(arrayList, this.m);
                    this.h.set(true);
                } catch (IOException e2) {
                    f.e("Failed to acquire the network.", e2, new Object[0]);
                    if (this.k) {
                        a(this.l);
                        return;
                    }
                    throw new IOException("Unable to acquire the network (fallback not attempted).");
                }
            }
        } else {
            throw new IOException("No permission to request for a network with capabilities.");
        }
    }
}
