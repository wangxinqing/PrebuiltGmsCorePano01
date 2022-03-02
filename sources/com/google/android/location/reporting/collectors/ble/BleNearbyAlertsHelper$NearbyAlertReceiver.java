package com.google.android.location.reporting.collectors.ble;

import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BleNearbyAlertsHelper$NearbyAlertReceiver extends nla {
    final /* synthetic */ ajhu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BleNearbyAlertsHelper$NearbyAlertReceiver(ajhu ajhu) {
        super("location");
        this.a = ajhu;
    }

    public final void a(Context context, Intent intent) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("BLE Received nearby alert: ");
        sb.append(valueOf);
        sb.toString();
        rhn a2 = rhn.a(intent);
        if (a2 != null) {
            try {
                if (a2.c.i == 0) {
                    HashSet<String> hashSet = new HashSet<>();
                    Iterator it = a2.iterator();
                    while (it.hasNext()) {
                        hashSet.add(((rhm) it.next()).bb().a());
                    }
                    int i = a2.b;
                    ajhq ajhq = this.a.d;
                    if (ajhq == null || i != 1) {
                        if (ajhq != null) {
                            if (i == 2) {
                                for (String remove : hashSet) {
                                    ajhq.a.e.remove(remove);
                                }
                                String valueOf2 = String.valueOf(hashSet);
                                String valueOf3 = String.valueOf(ajhq.a.e);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34 + String.valueOf(valueOf3).length());
                                sb2.append("BLE Nearby exited:");
                                sb2.append(valueOf2);
                                sb2.append(" Current places:");
                                sb2.append(valueOf3);
                                ajix.a("GCoreUlr", sb2.toString());
                                if (ajhq.a.e.isEmpty()) {
                                    ajhq.a.b(true);
                                }
                                a2.c();
                            }
                        }
                        StringBuilder sb3 = new StringBuilder(48);
                        sb3.append("Ignoring Nearby alert for transition:");
                        sb3.append(i);
                        ajix.a("GCoreUlr", sb3.toString());
                        a2.c();
                    }
                    boolean z = false;
                    for (String add : hashSet) {
                        z |= ajhq.a.e.add(add);
                    }
                    String valueOf4 = String.valueOf(hashSet);
                    String valueOf5 = String.valueOf(ajhq.a.e);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 35 + String.valueOf(valueOf5).length());
                    sb4.append("BLE Nearby entered:");
                    sb4.append(valueOf4);
                    sb4.append(" Current places:");
                    sb4.append(valueOf5);
                    ajix.a("GCoreUlr", sb4.toString());
                    if (z) {
                        ajhq.a.a(true);
                    }
                    a2.c();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.c();
                }
                throw th;
            }
        }
        String valueOf6 = String.valueOf(a2);
        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf6).length() + 31);
        sb5.append("Nearby alert returned an error:");
        sb5.append(valueOf6);
        ajix.c("GCoreUlr", sb5.toString());
        if (a2 == null) {
            return;
        }
        a2.c();
    }
}
