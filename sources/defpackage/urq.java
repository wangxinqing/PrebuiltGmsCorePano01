package defpackage;

import java.io.PrintWriter;

/* renamed from: urq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class urq {
    private final tfw a;
    private boolean b;
    private tfv c;
    public int g;
    public volatile boolean h;

    public urq(int i) {
        this(i, (tfw) null);
    }

    /* access modifiers changed from: protected */
    public final int a(int i) {
        this.g = i;
        return 5;
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    public int b() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public void c(int i) {
        a();
    }

    public final String d() {
        int i = this.g;
        if (i == 1) {
            return "BT_RADIO_OFF";
        }
        if (i == 2) {
            return "BT_RADIO_TOGGLE";
        }
        if (i == 11) {
            return "WIFI_RADIO_OFF";
        }
        if (i == 12) {
            return "WIFI_RADIO_TOGGLE";
        }
        switch (i) {
            case 21:
                return "BT_CLASSIC_ADVERTISING";
            case 22:
                return "BT_CLASSIC_SCANNING";
            case 23:
                return "BT_CLASSIC_CONNECTING";
            case 24:
                return "BT_CLASSIC_CONNECTED";
            default:
                switch (i) {
                    case 31:
                        return "BLE_ADVERTISING";
                    case 32:
                        return "BLE_SERVER_SOCKET_OPENED";
                    case 33:
                        return "BLE_L2CAP_SERVER_SOCKET_OPENED";
                    case 34:
                        return "BLE_ADVERTISEMENT_GATT_SERVER_STARTED";
                    case 35:
                        return "BLE_SCANNING";
                    case 36:
                        return "BLE_FETCH_ADVERTISEMENT";
                    case 37:
                        return "BLE_CONNECTING";
                    case 38:
                        return "BLE_CONNECTED";
                    default:
                        switch (i) {
                            case 41:
                                return "WIFI_LAN_ADVERTISING";
                            case 42:
                                return "WIFI_LAN_SCANNING";
                            case 43:
                                return "WIFI_LAN_CONNECTING";
                            case 44:
                                return "WIFI_LAN_CONNECTED";
                            default:
                                switch (i) {
                                    case 51:
                                        return "WIFI_AWARE_ADVERTISING";
                                    case 52:
                                        return "WIFI_AWARE_SCANNING";
                                    case 53:
                                        return "WIFI_AWARE_CONNECTING";
                                    case 54:
                                        return "WIFI_AWARE_CONNECTED";
                                    default:
                                        switch (i) {
                                            case 61:
                                                return "WIFI_HOTSPOT_HOSTING_WIFI_DIRECT";
                                            case 62:
                                                return "WIFI_HOTSPOT_HOSTING_LOCAL_ONLY";
                                            case 63:
                                                return "WIFI_HOTSPOT_HOSTING_SOFT_AP";
                                            case 64:
                                                return "WIFI_HOTSPOT_AP_CONNECTED";
                                            case 65:
                                                return "WIFI_HOTSPOT_SOCKET_CONNECTED";
                                            default:
                                                switch (i) {
                                                    case 71:
                                                        return "WIFI_DIRECT_HOST_GROUP";
                                                    case 72:
                                                        return "WIFI_DIRECT_CONNECTING";
                                                    case 73:
                                                        return "WIFI_DIRECT_CONNECTED";
                                                    default:
                                                        return "UNKNOWN";
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized boolean e() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int f() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.e()     // Catch:{ all -> 0x004e }
            r1 = 2
            if (r0 != 0) goto L_0x004c
            tfw r0 = r4.a     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.b()     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r0 = 3
        L_0x0014:
            monitor-exit(r4)
            return r0
        L_0x0016:
            tfw r0 = r4.a     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x002a
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004e }
            urp r2 = new urp     // Catch:{ all -> 0x004e }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x004e }
            r4.c = r2     // Catch:{ all -> 0x004e }
            tfw r0 = r4.a     // Catch:{ all -> 0x004e }
            r0.a(r2)     // Catch:{ all -> 0x004e }
        L_0x002a:
            int r0 = r4.b()     // Catch:{ all -> 0x004e }
            tfw r2 = r4.a     // Catch:{ all -> 0x004e }
            if (r2 == 0) goto L_0x0041
            tfv r3 = r4.c     // Catch:{ all -> 0x004e }
            r2.b(r3)     // Catch:{ all -> 0x004e }
            boolean r2 = r4.h     // Catch:{ all -> 0x004e }
            if (r2 == 0) goto L_0x0041
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x004e }
            r2 = 0
            r4.h = r2     // Catch:{ all -> 0x004e }
        L_0x0041:
            if (r0 != r1) goto L_0x0044
        L_0x0043:
            goto L_0x0048
        L_0x0044:
            r1 = 5
            if (r0 != r1) goto L_0x0014
            goto L_0x0043
        L_0x0048:
            r1 = 1
            r4.b = r1     // Catch:{ all -> 0x004e }
            goto L_0x0014
        L_0x004c:
            monitor-exit(r4)
            return r1
        L_0x004e:
            r0 = move-exception
            monitor-exit(r4)
            goto L_0x0052
        L_0x0051:
            throw r0
        L_0x0052:
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urq.f():int");
    }

    public urq(int i, tfw tfw) {
        this.b = false;
        this.h = false;
        this.g = i;
        this.a = tfw;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(int i) {
        if (e()) {
            c(i);
            this.b = false;
        }
    }

    public void a(PrintWriter printWriter) {
        printWriter.write(String.format("  Medium Operation: %s\n", new Object[]{d()}));
        tfw tfw = this.a;
        if (tfw != null) {
            printWriter.write(String.format("  Cancelled: %s\n", new Object[]{Boolean.valueOf(tfw.b())}));
        }
        printWriter.flush();
    }
}
