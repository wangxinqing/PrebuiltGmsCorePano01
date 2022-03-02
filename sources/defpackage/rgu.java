package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* renamed from: rgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rgu extends rfl {
    public final rgr u;

    public rgu(Context context, Looper looper, ica ica, icb icb, String str, ise ise) {
        super(context, looper, ica, icb, str, ise);
        this.u = new rgr(context, this.a);
    }

    public final Location a(String str) {
        if (!jhx.a((Object[]) p(), (Object) rcy.c)) {
            rgr rgr = this.u;
            rgr.e.a();
            return rgr.e.b().b();
        }
        rgr rgr2 = this.u;
        rgr2.e.a();
        return rgr2.e.b().b(str);
    }

    public final void b(LocationRequestInternal locationRequestInternal, ige ige, rge rge) {
        reb reb;
        reb reb2;
        synchronized (this.u) {
            rgr rgr = this.u;
            rgr.a(locationRequestInternal);
            rgr.e.a();
            igc igc = ige.b;
            if (igc != null) {
                synchronized (rgr.d) {
                    reb2 = (reb) rgr.d.get(igc);
                    if (reb2 == null) {
                        reb2 = new reb(ige);
                    }
                    rgr.d.put(igc, reb2);
                }
                reb = reb2;
            } else {
                reb = null;
            }
            if (reb != null) {
                rgk b = rgr.e.b();
                reb.asBinder();
                b.a(new LocationRequestUpdateData(1, locationRequestInternal, (IBinder) null, (PendingIntent) null, reb, rge.asBinder()));
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void j() {
        /*
            r9 = this;
            rgr r0 = r9.u
            monitor-enter(r0)
            boolean r1 = r9.l()     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00ae
            rgr r1 = r9.u     // Catch:{ Exception -> 0x00a6 }
            java.util.Map r2 = r1.b     // Catch:{ Exception -> 0x00a6 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x00a6 }
            java.util.Map r3 = r1.b     // Catch:{ all -> 0x00a3 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x00a3 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x0018:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00a3 }
            r5 = 0
            if (r4 != 0) goto L_0x008c
            java.util.Map r3 = r1.b     // Catch:{ all -> 0x00a3 }
            r3.clear()     // Catch:{ all -> 0x00a3 }
            monitor-exit(r2)     // Catch:{ all -> 0x00a3 }
            java.util.Map r2 = r1.d     // Catch:{ Exception -> 0x00a6 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x00a6 }
            java.util.Map r3 = r1.d     // Catch:{ all -> 0x0089 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x0089 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0089 }
        L_0x0032:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0089 }
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0089 }
            reb r4 = (defpackage.reb) r4     // Catch:{ all -> 0x0089 }
            if (r4 == 0) goto L_0x0032
            rfk r6 = r1.e     // Catch:{ all -> 0x0089 }
            rgk r6 = r6.b()     // Catch:{ all -> 0x0089 }
            com.google.android.gms.location.internal.LocationRequestUpdateData r4 = com.google.android.gms.location.internal.LocationRequestUpdateData.a((defpackage.rec) r4, (defpackage.rge) r5)     // Catch:{ all -> 0x0089 }
            r6.a((com.google.android.gms.location.internal.LocationRequestUpdateData) r4)     // Catch:{ all -> 0x0089 }
            goto L_0x0032
        L_0x004e:
            java.util.Map r3 = r1.d     // Catch:{ all -> 0x0089 }
            r3.clear()     // Catch:{ all -> 0x0089 }
            monitor-exit(r2)     // Catch:{ all -> 0x0089 }
            java.util.Map r2 = r1.c     // Catch:{ Exception -> 0x00a6 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x00a6 }
            java.util.Map r3 = r1.c     // Catch:{ all -> 0x0086 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x0086 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0086 }
        L_0x0061:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0086 }
            rdy r4 = (defpackage.rdy) r4     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x0061
            rfk r6 = r1.e     // Catch:{ all -> 0x0086 }
            rgk r6 = r6.b()     // Catch:{ all -> 0x0086 }
            com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData r7 = new com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData     // Catch:{ all -> 0x0086 }
            r8 = 2
            r7.<init>(r8, r5, r4, r5)     // Catch:{ all -> 0x0086 }
            r6.a((com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData) r7)     // Catch:{ all -> 0x0086 }
            goto L_0x0061
        L_0x007f:
            java.util.Map r1 = r1.c     // Catch:{ all -> 0x0086 }
            r1.clear()     // Catch:{ all -> 0x0086 }
            monitor-exit(r2)     // Catch:{ all -> 0x0086 }
            goto L_0x00ae
        L_0x0086:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0086 }
            throw r1     // Catch:{ Exception -> 0x00a6 }
        L_0x0089:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0089 }
            throw r1     // Catch:{ Exception -> 0x00a6 }
        L_0x008c:
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00a3 }
            ree r4 = (defpackage.ree) r4     // Catch:{ all -> 0x00a3 }
            if (r4 == 0) goto L_0x0018
            rfk r6 = r1.e     // Catch:{ all -> 0x00a3 }
            rgk r6 = r6.b()     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.location.internal.LocationRequestUpdateData r4 = com.google.android.gms.location.internal.LocationRequestUpdateData.a((defpackage.ref) r4, (defpackage.rge) r5)     // Catch:{ all -> 0x00a3 }
            r6.a((com.google.android.gms.location.internal.LocationRequestUpdateData) r4)     // Catch:{ all -> 0x00a3 }
            goto L_0x0018
        L_0x00a3:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a3 }
            throw r1     // Catch:{ Exception -> 0x00a6 }
        L_0x00a6:
            r1 = move-exception
            java.lang.String r2 = "LocationClientImpl"
            java.lang.String r3 = "Client disconnected before listeners could be cleaned up"
            android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x00b3 }
        L_0x00ae:
            super.j()     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x00b3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x00b7
        L_0x00b6:
            throw r1
        L_0x00b7:
            goto L_0x00b6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgu.j():void");
    }

    public final void a(PendingIntent pendingIntent) {
        w();
        iva.a((Object) pendingIntent);
        ((rgk) x()).a(pendingIntent);
    }

    public final void a(PendingIntent pendingIntent, rge rge) {
        rgr rgr = this.u;
        rgr.e.a();
        rgr.e.b().a(new LocationRequestUpdateData(2, (LocationRequestInternal) null, (IBinder) null, pendingIntent, (IBinder) null, rge.asBinder()));
    }

    public final void b(igc igc, rge rge) {
        rgr rgr = this.u;
        rgr.e.a();
        iva.a((Object) igc, (Object) "Invalid null listener key");
        synchronized (rgr.d) {
            reb reb = (reb) rgr.d.remove(igc);
            if (reb != null) {
                reb.a();
                rgr.e.b().a(LocationRequestUpdateData.a((rec) reb, rge));
            }
        }
    }

    public final void a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, idg idg) {
        w();
        iva.a((Object) activityRecognitionRequest, (Object) "ActivityRecognitionRequest can't be null.");
        iva.a((Object) pendingIntent, (Object) "PendingIntent must be specified.");
        iva.a((Object) idg, (Object) "ResultHolder not provided.");
        ((rgk) x()).a(activityRecognitionRequest, pendingIntent, (ifu) new igt(idg));
    }

    public final void a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, idg idg) {
        w();
        iva.a((Object) geofencingRequest, (Object) "geofencingRequest can't be null.");
        iva.a((Object) pendingIntent, (Object) "PendingIntent must be specified.");
        iva.a((Object) idg, (Object) "ResultHolder not provided.");
        ((rgk) x()).a(geofencingRequest, pendingIntent, (rgh) new rgs(idg));
    }

    public final void a(LocationSettingsRequest locationSettingsRequest, idg idg, String str) {
        w();
        boolean z = true;
        iva.b(true, "locationSettingsRequest can't be null nor empty.");
        if (idg == null) {
            z = false;
        }
        iva.b(z, "listener can't be null.");
        ((rgk) x()).a(locationSettingsRequest, (rgn) new rgm(idg), str);
    }

    public final void a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent, rge rge) {
        rgr rgr = this.u;
        rgr.a(locationRequestInternal);
        rgr.e.a();
        rgr.e.b().a(new LocationRequestUpdateData(1, locationRequestInternal, (IBinder) null, pendingIntent, (IBinder) null, rge.asBinder()));
    }

    public final void a(LocationRequestInternal locationRequestInternal, ige ige, rge rge) {
        ree ree;
        ree ree2;
        synchronized (this.u) {
            rgr rgr = this.u;
            rgr.a(locationRequestInternal);
            rgr.e.a();
            igc igc = ige.b;
            if (igc != null) {
                synchronized (rgr.b) {
                    ree2 = (ree) rgr.b.get(igc);
                    if (ree2 == null) {
                        ree2 = new ree(ige);
                    }
                    rgr.b.put(igc, ree2);
                }
                ree = ree2;
            } else {
                ree = null;
            }
            if (ree != null) {
                rgk b = rgr.e.b();
                ree.asBinder();
                b.a(new LocationRequestUpdateData(1, locationRequestInternal, ree, (PendingIntent) null, (IBinder) null, rge.asBinder()));
            }
        }
    }

    public final void a(igc igc, rge rge) {
        rgr rgr = this.u;
        rgr.e.a();
        iva.a((Object) igc, (Object) "Invalid null listener key");
        synchronized (rgr.b) {
            ree ree = (ree) rgr.b.remove(igc);
            if (ree != null) {
                ree.a();
                rgr.e.b().a(LocationRequestUpdateData.a((ref) ree, rge));
            }
        }
    }
}
