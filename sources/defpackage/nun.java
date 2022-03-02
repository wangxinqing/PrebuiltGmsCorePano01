package defpackage;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: nun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nun {
    public static final long b = TimeUnit.DAYS.toMillis(372);
    public final ou a = new ou();
    public final int c;
    public final int d;
    public final num e;
    private final nsb f;

    public nun(int i, int i2, nsb nsb) {
        String str;
        this.c = i;
        this.d = i2;
        this.f = nsb;
        boolean z = i != 1 ? false : true;
        if (z) {
            str = d(ihs.b());
        } else {
            str = null;
        }
        this.e = new num(str, z);
    }

    private static String a(InetAddress inetAddress) {
        byte[] address;
        long j;
        if (inetAddress == null || (address = inetAddress.getAddress()) == null) {
            return "";
        }
        if (address.length == 16) {
            j = axlc.a.a().M();
        } else {
            j = axlc.a.a().L();
        }
        return Arrays.toString(Arrays.copyOf(address, (int) j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized java.lang.String c(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = defpackage.axlc.n()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0079
            nrr r0 = defpackage.nrr.a()     // Catch:{ all -> 0x0088 }
            nva r0 = r0.d()     // Catch:{ all -> 0x0088 }
            nuw r0 = r0.s     // Catch:{ all -> 0x0088 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x0088 }
            if (r0 != 0) goto L_0x0018
            goto L_0x0079
        L_0x0018:
            axlc r0 = defpackage.axlc.a     // Catch:{ all -> 0x0088 }
            axld r0 = r0.a()     // Catch:{ all -> 0x0088 }
            boolean r0 = r0.au()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x002b
            num r3 = r2.e     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = r3.c()     // Catch:{ all -> 0x0088 }
            goto L_0x007d
        L_0x002b:
            java.lang.String r3 = r2.d(r3)     // Catch:{ all -> 0x0088 }
            num r0 = r2.e     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = r0.c()     // Catch:{ all -> 0x0088 }
            boolean r1 = defpackage.axlc.w()     // Catch:{ all -> 0x0088 }
            if (r1 == 0) goto L_0x0078
            boolean r1 = a((java.lang.String) r3)     // Catch:{ all -> 0x0088 }
            if (r1 == 0) goto L_0x004f
            boolean r1 = a((java.lang.String) r0)     // Catch:{ all -> 0x0088 }
            if (r1 != 0) goto L_0x0048
            goto L_0x004f
        L_0x0048:
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0088 }
            if (r0 != 0) goto L_0x005c
            goto L_0x006a
        L_0x004f:
            boolean r1 = a((java.lang.String) r3)     // Catch:{ all -> 0x0088 }
            if (r1 != 0) goto L_0x006a
            boolean r0 = a((java.lang.String) r0)     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x005c
            goto L_0x006a
        L_0x005c:
            nsb r0 = r2.f     // Catch:{ all -> 0x0088 }
            nsa r0 = r0.a     // Catch:{ all -> 0x0088 }
            nqv r0 = r0.a()     // Catch:{ all -> 0x0088 }
            java.lang.String r1 = "MATCH"
            r0.a(r1)     // Catch:{ all -> 0x0088 }
            goto L_0x007d
        L_0x006a:
            nsb r0 = r2.f     // Catch:{ all -> 0x0088 }
            nsa r0 = r0.a     // Catch:{ all -> 0x0088 }
            nqv r0 = r0.a()     // Catch:{ all -> 0x0088 }
            java.lang.String r1 = "MISMATCH"
            r0.a(r1)     // Catch:{ all -> 0x0088 }
            goto L_0x007d
        L_0x0078:
            goto L_0x007d
        L_0x0079:
            java.lang.String r3 = r2.d(r3)     // Catch:{ all -> 0x0088 }
        L_0x007d:
            boolean r0 = a((java.lang.String) r3)     // Catch:{ all -> 0x0088 }
            if (r0 != 0) goto L_0x0086
            r3 = 0
            monitor-exit(r2)
            return r3
        L_0x0086:
            monitor-exit(r2)
            return r3
        L_0x0088:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nun.c(android.content.Context):java.lang.String");
    }

    private final String d(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
        if (connectionInfo == null) {
            return null;
        }
        if (axlc.w()) {
            ((ahgz) this.f.a.a().b.a()).b(new Object[0]);
        }
        return connectionInfo.getSSID();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.e.d();
    }

    /* access modifiers changed from: package-private */
    public final void b(Context context) {
        this.e.a(d(context));
    }

    private static final boolean a(String str) {
        return str != null && !str.equals("<unknown ssid>");
    }

    public final String a() {
        String str = (String) this.a.b(0);
        long b2 = ((nul) this.a.get(str)).b();
        int i = 1;
        while (true) {
            ou ouVar = this.a;
            if (i >= ouVar.h) {
                return str;
            }
            String str2 = (String) ouVar.b(i);
            nul nul = (nul) this.a.get(str2);
            if (nul.b() < b2) {
                b2 = nul.b();
                str = str2;
            }
            i++;
        }
    }

    public final synchronized nul a(Context context) {
        String str;
        int i = this.c;
        if (i == -1) {
            str = null;
        } else if (i == 1) {
            str = c(context);
            if (axlc.a.a().aq() && str == null) {
                str = a(nrr.a().g().f());
            }
        } else {
            str = nqw.e(i) ? ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator() : a(nrr.a().g().f());
        }
        if (str == null) {
            return null;
        }
        if (!this.a.containsKey(str)) {
            ou ouVar = this.a;
            if (ouVar.h == this.d) {
                ouVar.remove(a());
            }
            aucd o = nqj.k.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            nqj nqj = (nqj) o.b;
            str.getClass();
            int i2 = nqj.a | 1;
            nqj.a = i2;
            nqj.b = str;
            int i3 = i2 | 2;
            nqj.a = i3;
            nqj.c = -1;
            int i4 = this.c;
            int i5 = i3 | 64;
            nqj.a = i5;
            nqj.h = i4;
            nqj.a = i5 | 128;
            nqj.i = -1;
            this.a.put(str, new nul(this, o));
        }
        return (nul) this.a.get(str);
    }
}
