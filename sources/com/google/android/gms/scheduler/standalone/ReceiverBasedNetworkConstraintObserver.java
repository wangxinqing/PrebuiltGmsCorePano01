package com.google.android.gms.scheduler.standalone;

import android.content.Context;
import android.content.IntentFilter;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReceiverBasedNetworkConstraintObserver extends nla implements aaed {
    private int a;
    private boolean b = false;

    public ReceiverBasedNetworkConstraintObserver(Context context) {
        super("scheduler");
        if (a()) {
            a(context);
        }
    }

    private final void a(Context context) {
        context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.b = true;
    }

    private final boolean a(int i) {
        return (this.a & i) == i;
    }

    private final boolean a() {
        return this.a != 0 || (axmd.a.a().a() ^ true);
    }

    public final synchronized void a(Context context, int i) {
        if (i == 7) {
            try {
                this.a |= 1;
            } catch (Throwable th) {
                throw th;
            }
        } else if (i == 3) {
            this.a |= 2;
        }
        if (!this.b && a()) {
            a(context);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void a(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            java.lang.String r1 = r6.getAction()     // Catch:{ all -> 0x007d }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r5.getSystemService(r0)     // Catch:{ all -> 0x007d }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x007b
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x007b
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x007d }
            java.lang.String r2 = "networkType"
            r3 = 8
            int r6 = r6.getIntExtra(r2, r3)     // Catch:{ all -> 0x007d }
            int r2 = r1.getType()     // Catch:{ all -> 0x007d }
            if (r6 != r2) goto L_0x007b
            monitor-enter(r4)     // Catch:{ all -> 0x007d }
            int r6 = r4.a     // Catch:{ all -> 0x0078 }
            r2 = 2
            boolean r2 = r4.a((int) r2)     // Catch:{ all -> 0x0078 }
            if (r2 != 0) goto L_0x0038
        L_0x0037:
            goto L_0x0045
        L_0x0038:
            boolean r1 = r1.isConnected()     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x0037
            int r1 = r4.a     // Catch:{ all -> 0x0078 }
            r1 = r1 & -3
            r4.a = r1     // Catch:{ all -> 0x0078 }
            goto L_0x0037
        L_0x0045:
            r1 = 1
            boolean r1 = r4.a((int) r1)     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x0058
            boolean r0 = defpackage.ml.a(r0)     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0058
            int r0 = r4.a     // Catch:{ all -> 0x0078 }
            r0 = r0 & -2
            r4.a = r0     // Catch:{ all -> 0x0078 }
        L_0x0058:
            boolean r0 = r4.a()     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0068
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x0078 }
            r5.unregisterReceiver(r4)     // Catch:{ all -> 0x0078 }
            r5 = 0
            r4.b = r5     // Catch:{ all -> 0x0078 }
        L_0x0068:
            int r5 = r4.a     // Catch:{ all -> 0x0078 }
            if (r6 == r5) goto L_0x0075
            aabg r5 = defpackage.aabg.a()     // Catch:{ all -> 0x0078 }
            nsh r5 = r5.d     // Catch:{ all -> 0x0078 }
            r5.a()     // Catch:{ all -> 0x0078 }
        L_0x0075:
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            monitor-exit(r4)
            return
        L_0x0078:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            throw r5     // Catch:{ all -> 0x007d }
        L_0x007b:
            monitor-exit(r4)
            return
        L_0x007d:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x0081
        L_0x0080:
            throw r5
        L_0x0081:
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.scheduler.standalone.ReceiverBasedNetworkConstraintObserver.a(android.content.Context, android.content.Intent):void");
    }

    public final synchronized void a(PrintWriter printWriter) {
        aaec.a(printWriter, this.a);
    }
}
