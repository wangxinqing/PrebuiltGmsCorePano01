package com.google.android.contextmanager.fence;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlaceFenceHelper extends nla {
    public final Context a;
    public final HashMap b;
    public final rir c;
    public final boolean d;
    public int e = 1000001;
    public long f = cbi.i().a();
    private final int g;

    public PlaceFenceHelper(Context context) {
        super("contextmanager");
        this.a = context;
        this.b = new HashMap();
        riq riq = new riq();
        riq.b = "com.google.android.contextmanager.producer.module.PlacesProducer";
        this.c = riq.a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.gms.contextmanager.NEARBY_ALERTS");
        intentFilter.addAction("android.gms.contextmanager.GEOFENCE");
        context.registerReceiver(this, intentFilter);
        ren.a(cbi.f()).d(PendingIntent.getBroadcast(this.a, 0, new Intent("android.gms.contextmanager.GEOFENCE"), 134217728)).a((acvp) new bva("[PlaceFenceHelper] resetGeofences", new Object[0]));
        this.d = awvy.a.a().a();
        this.g = (int) awuz.a.a().ab();
    }

    private final int a(Intent intent) {
        int i;
        String action = intent.getAction();
        if (action.equals("android.gms.contextmanager.NEARBY_ALERTS")) {
            rhn a2 = rhn.a(intent);
            if (a2 == null) {
                ((anih) ((anih) bxk.a.b()).a("com.google.android.contextmanager.fence.PlaceFenceHelper", "a", 149, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlaceFenceHelper] NearbyBuffer is null!");
                return -1;
            }
            i = a2.b;
            a2.c();
        } else if (action.equals("android.gms.contextmanager.GEOFENCE")) {
            rdu a3 = rdu.a(intent);
            if (a3.a()) {
                ((anih) ((anih) bxk.a.b()).a("com.google.android.contextmanager.fence.PlaceFenceHelper", "a", 162, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlaceFenceHelper] Geofence intent error %d", a3.a);
                return -1;
            }
            i = a3.b;
        } else {
            new Object[1][0] = action;
            i = -1;
        }
        if (i == 1 || i == 2) {
            return i;
        }
        return -1;
    }

    public final void b(bzv bzv) {
        List a2 = byy.a(bzv);
        if (a2.isEmpty()) {
            ((anih) ((anih) bxk.a.c()).a("com.google.android.contextmanager.fence.PlaceFenceHelper", "b", 509, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlaceFenceHelper] NearbyAlert record not found for %s", (Object) bzv);
            return;
        }
        int size = a2.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            byz byz = (byz) this.b.get((byy) a2.get(i));
            if (byz != null) {
                byz.a.remove(bzv);
                z |= !byz.a();
            }
        }
        if (z) {
            a();
        }
    }

    private static String a(byy byy) {
        String valueOf = String.valueOf(UUID.nameUUIDFromBytes(((String) byy.b).getBytes()));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("ctxmgr:");
        sb.append(valueOf);
        return sb.toString();
    }

    public static boolean a(bzv bzv) {
        return (bzv == null || bzv.b == 4 || (TextUtils.isEmpty(bzv.n()) && bzv.a().isEmpty() && bzv.j().isEmpty())) ? false : true;
    }

    public final float a(rhq rhq) {
        float f2;
        new Object[1][0] = rhq.a();
        float f3 = (float) this.g;
        if (f3 > 0.0f) {
            new Object[1][0] = Float.valueOf(f3);
            return f3;
        }
        LatLngBounds f4 = rhq.f();
        if (f4 != null) {
            LatLng latLng = f4.a;
            double d2 = latLng.a;
            double d3 = latLng.b;
            LatLng latLng2 = f4.b;
            f2 = ((float) aell.b(d2, d3, latLng2.a, latLng2.b)) * 0.4f;
            new Object[1][0] = Float.valueOf(f2);
        } else {
            Object[] objArr = {rhq.a(), Float.valueOf(150.0f)};
            f2 = 150.0f;
        }
        float max = Math.max(150.0f, Math.min(f2, 250.0f));
        new Object[1][0] = Float.valueOf(max);
        return max;
    }

    public final void a() {
        Iterator it = this.b.keySet().iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            byy byy = (byy) it.next();
            byz byz = (byz) this.b.get(byy);
            if (!byz.a()) {
                if (byz.c != 0) {
                    arrayList.add(a(byy));
                } else {
                    rij.a(cbi.f(), this.c).e(byz.b).a((acvp) new bva("[PlaceFenceHelper] removePlaceFence", new Object[0]));
                }
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            ren.a(cbi.f()).a((List) arrayList).a((acvp) new bva("[PlaceFenceHelper] removeGeofences", new Object[0]));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            java.lang.String r10 = r11.getAction()
            java.lang.String r0 = "android.gms.contextmanager.NEARBY_ALERTS"
            boolean r0 = r10.equals(r0)
            java.lang.String r1 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r2 = "a"
            java.lang.String r3 = "com.google.android.contextmanager.fence.PlaceFenceHelper"
            r4 = 0
            r5 = 1
            r6 = -1
            if (r0 == 0) goto L_0x0038
            rhn r10 = defpackage.rhn.a((android.content.Intent) r11)
            if (r10 != 0) goto L_0x0032
            jjg r10 = defpackage.bxk.a
            anie r10 = r10.b()
            anih r10 = (defpackage.anih) r10
            r0 = 149(0x95, float:2.09E-43)
            anie r10 = r10.a((java.lang.String) r3, (java.lang.String) r2, (int) r0, (java.lang.String) r1)
            anih r10 = (defpackage.anih) r10
            java.lang.String r0 = "[PlaceFenceHelper] NearbyBuffer is null!"
            r10.a((java.lang.String) r0)
            r0 = -1
            goto L_0x0072
        L_0x0032:
            int r0 = r10.b
            r10.c()
            goto L_0x006c
        L_0x0038:
            java.lang.String r0 = "android.gms.contextmanager.GEOFENCE"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0067
            rdu r10 = defpackage.rdu.a(r11)
            boolean r0 = r10.a()
            if (r0 == 0) goto L_0x0064
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r7 = 162(0xa2, float:2.27E-43)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r7, (java.lang.String) r1)
            anih r0 = (defpackage.anih) r0
            int r10 = r10.a
            java.lang.String r7 = "[PlaceFenceHelper] Geofence intent error %d"
            r0.a((java.lang.String) r7, (int) r10)
            r0 = -1
            goto L_0x0072
        L_0x0064:
            int r0 = r10.b
            goto L_0x006c
        L_0x0067:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r10
            r0 = -1
        L_0x006c:
            if (r0 == r5) goto L_0x0072
            r10 = 2
            if (r0 == r10) goto L_0x0072
            r0 = -1
        L_0x0072:
            if (r0 == r6) goto L_0x00e1
            java.lang.String r10 = "extraPlaceChain"
            java.lang.String r10 = r11.getStringExtra(r10)
            boolean r7 = android.text.TextUtils.isEmpty(r10)
            if (r7 != 0) goto L_0x0089
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r4] = r10
            byy r10 = defpackage.byy.a((java.lang.String) r10)
            goto L_0x008a
        L_0x0089:
            r10 = 0
        L_0x008a:
            if (r10 != 0) goto L_0x00a0
            java.lang.String r7 = "extraPlaceId"
            java.lang.String r7 = r11.getStringExtra(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x00a0
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r7
            byy r10 = defpackage.byy.b(r7)
        L_0x00a0:
            if (r10 != 0) goto L_0x00b6
            java.lang.String r7 = "extraPlaceType"
            int r6 = r11.getIntExtra(r7, r6)
            if (r6 < 0) goto L_0x00b6
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r10[r4] = r5
            byy r10 = defpackage.byy.a((int) r6)
        L_0x00b6:
            if (r10 != 0) goto L_0x00ce
            jjg r10 = defpackage.bxk.a
            anie r10 = r10.b()
            anih r10 = (defpackage.anih) r10
            r0 = 127(0x7f, float:1.78E-43)
            anie r10 = r10.a((java.lang.String) r3, (java.lang.String) r2, (int) r0, (java.lang.String) r1)
            anih r10 = (defpackage.anih) r10
            java.lang.String r0 = "[PlaceFenceHelper] Cannot extract key from %s"
            r10.a((java.lang.String) r0, (java.lang.Object) r11)
            return
        L_0x00ce:
            bwn r11 = defpackage.cbi.k()
            byu r1 = new byu
            r1.<init>(r9, r10, r0)
            java.lang.String r10 = "PlaceFenceHelper_onReceive"
            bvp r10 = defpackage.bvq.a(r10)
            r11.a(r1, r10)
            return
        L_0x00e1:
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r10[r4] = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.contextmanager.fence.PlaceFenceHelper.a(android.content.Context, android.content.Intent):void");
    }

    public final void a(byy byy, int i) {
        byz byz = (byz) this.b.get(byy);
        if (byz == null) {
            ((anih) ((anih) bxk.a.b()).a("com.google.android.contextmanager.fence.PlaceFenceHelper", "a", 208, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlaceFenceHelper] No record for NearbyAlertKey");
            return;
        }
        long a2 = cbi.i().a();
        for (bzv bzv : byz.a.keySet()) {
            int i2 = 0;
            new Object[1][0] = Integer.valueOf(i);
            cbi.G().a();
            int i3 = bzv.f;
            if (i != 2) {
                i2 = i == 1 ? 1 : i3;
            }
            if (i2 != i3) {
                bzv.g = i3;
                bzv.f = i2;
                bzv.h = a2;
                if (i2 != 1 || bzv.m() <= 0) {
                    cbi.E().a(bzv.d);
                } else {
                    cbi.E().a(bzv.m(), bzv.d);
                }
            }
        }
        if (a2 - this.f < 86400000 || this.b.isEmpty()) {
            this.f = a2;
            return;
        }
        this.f = a2;
        a();
    }

    public final void a(String str, double d2, double d3, float f2, bzv bzv, byy byy) {
        String str2 = str;
        byy byy2 = byy;
        Double valueOf = Double.valueOf(d2);
        Double valueOf2 = Double.valueOf(d3);
        Float valueOf3 = Float.valueOf(f2);
        Object[] objArr = {str2, valueOf, valueOf2, valueOf3};
        rdo rdo = new rdo();
        rdo.b = 3;
        rdo.a = a(byy);
        rdo.b();
        rdo.e = 0;
        rdo.a(d2, d3, f2);
        ParcelableGeofence a2 = rdo.a();
        rdv rdv = new rdv();
        rdv.b(3);
        rdv.a(a2);
        GeofencingRequest a3 = rdv.a();
        Intent intent = new Intent("android.gms.contextmanager.GEOFENCE");
        intent.putExtra("extraPlaceId", str2);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.a, 0, intent, 134217728);
        byz byz = new byz(broadcast, 1);
        byz.a(bzv);
        this.b.put(byy2, byz);
        ren.a(cbi.f()).a(a3, broadcast).a((acvp) new byx(this, "[PlaceFenceHelper] adding Geofence (%f, %f, %f)", new Object[]{valueOf, valueOf2, valueOf3}, byy2));
    }
}
