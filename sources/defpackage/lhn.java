package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/* renamed from: lhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lhn implements lhk {
    public static final ith a = new ith("NetworkStoreImpl", "");
    public final ConnectivityManager b;
    public final Object c = new Object();
    public final Set d = new HashSet();
    public final Set e = new HashSet();
    public final Comparator f = new lhm(this);
    private final ConnectivityManager.NetworkCallback g = new lhl(this);

    public lhn(ConnectivityManager connectivityManager) {
        int i = Build.VERSION.SDK_INT;
        iva.a(true);
        this.b = connectivityManager;
        this.b.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), this.g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r4.isRoaming() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r5.a() == 1) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r4.getType() == 1) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r4 = r3.b.getNetworkInfo(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r5.b() != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.net.Network r4, defpackage.jzy r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            java.util.Set r1 = r3.d     // Catch:{ all -> 0x0036 }
            boolean r1 = r1.contains(r4)     // Catch:{ all -> 0x0036 }
            r2 = 0
            if (r1 == 0) goto L_0x0034
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            android.net.ConnectivityManager r0 = r3.b
            android.net.NetworkInfo r4 = r0.getNetworkInfo(r4)
            r0 = 1
            if (r4 == 0) goto L_0x0032
            boolean r1 = r5.b()
            if (r1 != 0) goto L_0x0022
            boolean r1 = r4.isRoaming()
            if (r1 != 0) goto L_0x0032
        L_0x0022:
            int r5 = r5.a()
            if (r5 == r0) goto L_0x0030
            int r4 = r4.getType()
            if (r4 == r0) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            return r0
        L_0x0030:
            r2 = 1
            goto L_0x0033
        L_0x0032:
        L_0x0033:
            return r2
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return r2
        L_0x0036:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhn.a(android.net.Network, jzy):boolean");
    }
}
