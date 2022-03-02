package com.google.android.gms.udc.gcm;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.chimera.BroadcastReceiver;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public static final anij b = addh.b();
    public final amqy c;
    public final amqy d;
    public final amqy e;
    public final amqy f;
    public final aekn g;
    private final Executor h;

    public GcmChimeraBroadcastReceiver() {
        this.c = adau.a;
        this.d = adav.a;
        this.e = adaw.a;
        this.f = adax.a;
        this.h = jfm.a(10);
        this.g = new aekp();
    }

    private final Map a(Context context) {
        List<Account> d2 = jgu.d(context, "com.google.android.gms");
        HashMap hashMap = new HashMap();
        adhf adhf = (adhf) this.d.a(context);
        for (Account account : d2) {
            try {
                hashMap.put(adhf.a(account), account);
            } catch (eif | IOException e2) {
                if (azrk.a.a().j()) {
                    anie c2 = addh.a().c();
                    c2.a((int) azrk.k());
                    c2.a(e2);
                    c2.a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 214, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to retrieve obfuscated Gaia id!");
                }
            }
        }
        return hashMap;
    }

    private final void b(Context context, Intent intent) {
        if (azrk.r()) {
            atvh c2 = c(context, intent);
            if (c2 == null) {
                b.c().a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "b", 148, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Corrupted push notification payload, pinging all accounts...");
                ((afyy) this.c.a(context)).c().a((Enum) acyn.PUSH_MESSAGE);
                return;
            }
            Map a = a(context);
            aucx aucx = c2.a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                String str = ((atvg) aucx.get(i)).a;
                if (a.containsKey(str)) {
                    ((afyy) this.c.a(context)).a((Account) a.get(str)).a((Enum) acyn.PUSH_MESSAGE);
                    adde adde = (adde) this.e.a(context);
                    aucd o = atwu.d.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    atwu atwu = (atwu) o.b;
                    atwu.b = 1;
                    atwu.a = 1 | atwu.a;
                    int size2 = c2.a.size();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    atwu atwu2 = (atwu) o.b;
                    atwu2.a |= 2;
                    atwu2.c = size2;
                    adde.a((atwu) o.i());
                } else {
                    adde adde2 = (adde) this.e.a(context);
                    aucd o2 = atwu.d.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    atwu atwu3 = (atwu) o2.b;
                    atwu3.b = 3;
                    atwu3.a = 1 | atwu3.a;
                    int size3 = c2.a.size();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    atwu atwu4 = (atwu) o2.b;
                    atwu4.a |= 2;
                    atwu4.c = size3;
                    adde2.a((atwu) o2.i());
                }
            }
        }
    }

    private final atvh c(Context context, Intent intent) {
        try {
            return (atvh) aucj.a((aucj) atvh.b, Base64.decode(intent.getStringExtra("fsc_v1"), 0));
        } catch (auda e2) {
            adde adde = (adde) this.e.a(context);
            aucd o = atwu.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwu atwu = (atwu) o.b;
            atwu.b = 2;
            atwu.a |= 1;
            adde.a((atwu) o.i());
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        b.d().a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "onReceive", 86, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Received GCM push notification.");
        if (intent == null || !intent.hasExtra("fsc_v1")) {
            b.d().a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "onReceive", 89, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Message not relevant for UDC, skipping push notification handling...");
            return;
        }
        this.h.execute(new adbc(this, context, intent, goAsync()));
    }

    GcmChimeraBroadcastReceiver(afyy afyy, adhf adhf, adde adde, aful aful, Executor executor, aekn aekn) {
        this.c = new aday(afyy);
        this.d = new adaz(adhf);
        this.e = new adba(adde);
        this.f = new adbb(aful);
        this.h = executor;
        this.g = aekn;
    }

    private final void a(Context context, Intent intent) {
        Map map;
        aucx aucx;
        Context context2 = context;
        adde adde = (adde) this.e.a(context2);
        long longValue = ((Long) adde.c.a()).longValue();
        if (adde.d.a(longValue)) {
            hol hol = (hol) adde.b.a();
            aucd o = atwz.h.o();
            int i = (int) longValue;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz = (atwz) o.b;
            atwz.a |= 64;
            atwz.d = i;
            atvy atvy = atvy.c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz2 = (atwz) o.b;
            atvy.getClass();
            atwz2.c = atvy;
            atwz2.b = 3;
            aucd o2 = atws.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atws atws = (atws) o2.b;
            "com.google.android.gms#udc-facs".getClass();
            atws.a |= 1;
            atws.b = "com.google.android.gms#udc-facs";
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz3 = (atwz) o.b;
            atws atws2 = (atws) o2.i();
            atws2.getClass();
            atwz3.e = atws2;
            atwz3.a |= 128;
            hoi a = hol.a((audx) o.i());
            a.b(1002);
            a.b();
        }
        long b2 = this.g.b();
        if (azrk.r()) {
            atvh c2 = c(context, intent);
            if (c2 == null) {
                b.c().a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "b", 148, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Corrupted push notification payload, pinging all accounts...");
                ((afyy) this.c.a(context2)).c().a((Enum) acyn.PUSH_MESSAGE);
            } else {
                Map a2 = a(context);
                aucx aucx2 = c2.a;
                int size = aucx2.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = ((atvg) aucx2.get(i2)).a;
                    if (a2.containsKey(str)) {
                        ((afyy) this.c.a(context2)).a((Account) a2.get(str)).a((Enum) acyn.PUSH_MESSAGE);
                        adde adde2 = (adde) this.e.a(context2);
                        aucd o3 = atwu.d.o();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        atwu atwu = (atwu) o3.b;
                        map = a2;
                        atwu.b = 1;
                        aucx = aucx2;
                        atwu.a |= 1;
                        int size2 = c2.a.size();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        atwu atwu2 = (atwu) o3.b;
                        atwu2.a |= 2;
                        atwu2.c = size2;
                        adde2.a((atwu) o3.i());
                    } else {
                        map = a2;
                        aucx = aucx2;
                        adde adde3 = (adde) this.e.a(context2);
                        aucd o4 = atwu.d.o();
                        if (o4.c) {
                            o4.c();
                            o4.c = false;
                        }
                        atwu atwu3 = (atwu) o4.b;
                        atwu3.b = 3;
                        atwu3.a |= 1;
                        int size3 = c2.a.size();
                        if (o4.c) {
                            o4.c();
                            o4.c = false;
                        }
                        atwu atwu4 = (atwu) o4.b;
                        atwu4.a |= 2;
                        atwu4.c = size3;
                        adde3.a((atwu) o4.i());
                    }
                    i2++;
                    a2 = map;
                    aucx2 = aucx;
                }
            }
        }
        try {
            b.d().a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 111, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Scheduling sync in reaction to push notification...");
            if (!((Boolean) ((aful) this.f.a(context2)).e(aczd.SYNC_ID_CUSTOM_CACHE).get()).booleanValue()) {
                b.d().a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 121, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Sync is disabled!");
            } else {
                b.d().a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 119, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Sync scheduled successfully.");
            }
            long b3 = this.g.b();
            adde adde4 = (adde) this.e.a(context2);
            long j = b3 - b2;
            long longValue2 = ((Long) adde4.c.a()).longValue();
            if (adde4.d.a(longValue2)) {
                hol hol2 = (hol) adde4.b.a();
                aucd o5 = atwz.h.o();
                int i3 = (int) longValue2;
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                atwz atwz4 = (atwz) o5.b;
                atwz4.a |= 64;
                atwz4.d = i3;
                aucd o6 = atvy.c.o();
                aucd o7 = atvw.c.o();
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                atvw atvw = (atvw) o7.b;
                atvw.a |= 1;
                atvw.b = j;
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                atvy atvy2 = (atvy) o6.b;
                atvw atvw2 = (atvw) o7.i();
                atvw2.getClass();
                atvy2.b = atvw2;
                atvy2.a = 1;
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                atwz atwz5 = (atwz) o5.b;
                atvy atvy3 = (atvy) o6.i();
                atvy3.getClass();
                atwz5.c = atvy3;
                atwz5.b = 3;
                aucd o8 = atws.d.o();
                if (o8.c) {
                    o8.c();
                    o8.c = false;
                }
                atws atws3 = (atws) o8.b;
                "com.google.android.gms#udc-facs".getClass();
                atws3.a |= 1;
                atws3.b = "com.google.android.gms#udc-facs";
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                atwz atwz6 = (atwz) o5.b;
                atws atws4 = (atws) o8.i();
                atws4.getClass();
                atwz6.e = atws4;
                atwz6.a |= 128;
                hoi a3 = hol2.a((audx) o5.i());
                a3.b(1003);
                a3.b();
            }
        } catch (InterruptedException | ExecutionException e2) {
            b.c().a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 124, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to handle GCM push notification!");
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        Map map;
        aucx aucx;
        Context applicationContext = context.getApplicationContext();
        adde adde = (adde) this.e.a(applicationContext);
        long longValue = ((Long) adde.c.a()).longValue();
        if (adde.d.a(longValue)) {
            hol hol = (hol) adde.b.a();
            aucd o = atwz.h.o();
            int i = (int) longValue;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz = (atwz) o.b;
            atwz.a |= 64;
            atwz.d = i;
            atvy atvy = atvy.c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz2 = (atwz) o.b;
            atvy.getClass();
            atwz2.c = atvy;
            atwz2.b = 3;
            aucd o2 = atws.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atws atws = (atws) o2.b;
            "com.google.android.gms#udc-facs".getClass();
            atws.a |= 1;
            atws.b = "com.google.android.gms#udc-facs";
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz3 = (atwz) o.b;
            atws atws2 = (atws) o2.i();
            atws2.getClass();
            atwz3.e = atws2;
            atwz3.a |= 128;
            hoi a = hol.a((audx) o.i());
            a.b(1002);
            a.b();
        }
        long b2 = this.g.b();
        if (azrk.r()) {
            atvh c2 = c(applicationContext, intent);
            if (c2 == null) {
                b.c().a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "b", 148, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Corrupted push notification payload, pinging all accounts...");
                ((afyy) this.c.a(applicationContext)).c().a((Enum) acyn.PUSH_MESSAGE);
            } else {
                Map a2 = a(applicationContext);
                aucx aucx2 = c2.a;
                int size = aucx2.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = ((atvg) aucx2.get(i2)).a;
                    if (a2.containsKey(str)) {
                        ((afyy) this.c.a(applicationContext)).a((Account) a2.get(str)).a((Enum) acyn.PUSH_MESSAGE);
                        adde adde2 = (adde) this.e.a(applicationContext);
                        aucd o3 = atwu.d.o();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        atwu atwu = (atwu) o3.b;
                        map = a2;
                        atwu.b = 1;
                        aucx = aucx2;
                        atwu.a |= 1;
                        int size2 = c2.a.size();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        atwu atwu2 = (atwu) o3.b;
                        atwu2.a |= 2;
                        atwu2.c = size2;
                        adde2.a((atwu) o3.i());
                    } else {
                        map = a2;
                        aucx = aucx2;
                        adde adde3 = (adde) this.e.a(applicationContext);
                        aucd o4 = atwu.d.o();
                        if (o4.c) {
                            o4.c();
                            o4.c = false;
                        }
                        atwu atwu3 = (atwu) o4.b;
                        atwu3.b = 3;
                        atwu3.a |= 1;
                        int size3 = c2.a.size();
                        if (o4.c) {
                            o4.c();
                            o4.c = false;
                        }
                        atwu atwu4 = (atwu) o4.b;
                        atwu4.a |= 2;
                        atwu4.c = size3;
                        adde3.a((atwu) o4.i());
                    }
                    i2++;
                    a2 = map;
                    aucx2 = aucx;
                }
            }
        }
        try {
            b.d().a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 111, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Scheduling sync in reaction to push notification...");
            if (!((Boolean) ((aful) this.f.a(applicationContext)).e(aczd.SYNC_ID_CUSTOM_CACHE).get()).booleanValue()) {
                b.d().a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 121, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Sync is disabled!");
            } else {
                b.d().a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 119, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Sync scheduled successfully.");
            }
            long b3 = this.g.b();
            adde adde4 = (adde) this.e.a(applicationContext);
            long j = b3 - b2;
            long longValue2 = ((Long) adde4.c.a()).longValue();
            if (adde4.d.a(longValue2)) {
                hol hol2 = (hol) adde4.b.a();
                aucd o5 = atwz.h.o();
                int i3 = (int) longValue2;
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                atwz atwz4 = (atwz) o5.b;
                atwz4.a |= 64;
                atwz4.d = i3;
                aucd o6 = atvy.c.o();
                aucd o7 = atvw.c.o();
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                atvw atvw = (atvw) o7.b;
                atvw.a |= 1;
                atvw.b = j;
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                atvy atvy2 = (atvy) o6.b;
                atvw atvw2 = (atvw) o7.i();
                atvw2.getClass();
                atvy2.b = atvw2;
                atvy2.a = 1;
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                atwz atwz5 = (atwz) o5.b;
                atvy atvy3 = (atvy) o6.i();
                atvy3.getClass();
                atwz5.c = atvy3;
                atwz5.b = 3;
                aucd o8 = atws.d.o();
                if (o8.c) {
                    o8.c();
                    o8.c = false;
                }
                atws atws3 = (atws) o8.b;
                "com.google.android.gms#udc-facs".getClass();
                atws3.a |= 1;
                atws3.b = "com.google.android.gms#udc-facs";
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                atwz atwz6 = (atwz) o5.b;
                atws atws4 = (atws) o8.i();
                atws4.getClass();
                atwz6.e = atws4;
                atwz6.a |= 128;
                hoi a3 = hol2.a((audx) o5.i());
                a3.b(1003);
                a3.b();
            }
            pendingResult.finish();
            b.d().a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 99, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("GCM push notification handled successfully.");
        } catch (InterruptedException | ExecutionException e2) {
            b.c().a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 124, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to handle GCM push notification!");
            throw new RuntimeException(e2);
        }
    }
}
