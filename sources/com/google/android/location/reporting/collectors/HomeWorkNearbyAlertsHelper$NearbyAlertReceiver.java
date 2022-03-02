package com.google.android.location.reporting.collectors;

import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class HomeWorkNearbyAlertsHelper$NearbyAlertReceiver extends nla {
    final /* synthetic */ ajhb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeWorkNearbyAlertsHelper$NearbyAlertReceiver(ajhb ajhb) {
        super("location");
        this.a = ajhb;
    }

    public final void a(Context context, Intent intent) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Received nearby alert: ");
        sb.append(valueOf);
        sb.toString();
        if (this.a.i != null) {
            rhn a2 = rhn.a(intent);
            if (a2 != null) {
                try {
                    if (a2.c.i == 0) {
                        HashSet hashSet = new HashSet();
                        Iterator it = a2.iterator();
                        while (it.hasNext()) {
                            hashSet.add(((rhm) it.next()).bb().a());
                        }
                        int i = a2.b;
                        if (!hashSet.isEmpty()) {
                            ajhb ajhb = this.a;
                            if (ajhb.i != null) {
                                if (i == 1) {
                                    if (hashSet.contains(ajhb.d)) {
                                        ajhb ajhb2 = this.a;
                                        ajhb2.a.i = true;
                                        ajhb2.i.a(3);
                                    } else if (hashSet.contains(this.a.e)) {
                                        ajhb ajhb3 = this.a;
                                        ajhb3.a.j = true;
                                        ajhb3.i.a(4);
                                    }
                                } else if (i != 2) {
                                    StringBuilder sb2 = new StringBuilder(48);
                                    sb2.append("Ignoring Nearby alert for transition:");
                                    sb2.append(i);
                                    sb2.toString();
                                } else if (hashSet.contains(ajhb.d)) {
                                    ajhb ajhb4 = this.a;
                                    ajhb4.a.i = false;
                                    ajhb4.i.a(5);
                                } else if (hashSet.contains(this.a.e)) {
                                    ajhb ajhb5 = this.a;
                                    ajhb5.a.j = false;
                                    ajhb5.i.a(6);
                                }
                            }
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
            String valueOf2 = String.valueOf(a2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
            sb3.append("Nearby alert returned an error:");
            sb3.append(valueOf2);
            sb3.toString();
            if (a2 == null) {
                return;
            }
            a2.c();
        }
    }
}
