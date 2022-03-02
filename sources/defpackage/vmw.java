package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: vmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vmw {
    private final Map a = new nz();
    private final Map b = new nz();

    public final synchronized amzy a() {
        return amzy.a((Collection) this.b.keySet());
    }

    public final synchronized amzy b() {
        amzt amzt;
        amzt = new amzt();
        for (Map.Entry entry : this.b.entrySet()) {
            if (!"INTERNAL_PROVIDER_ID".equals(((vmv) entry.getValue()).a)) {
                amzt.c((wbx) entry.getKey());
            }
        }
        return amzt.a();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c(ShareTarget shareTarget) {
        String str = (String) this.a.remove(shareTarget);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String a(com.google.android.gms.nearby.sharing.ShareTarget r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Map r0 = r4.a     // Catch:{ all -> 0x0038 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0038 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0038 }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0038 }
            r1 = 0
            if (r0 != 0) goto L_0x0036
            java.util.Map r0 = r4.b     // Catch:{ all -> 0x0038 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0038 }
            anax r0 = defpackage.anax.a((java.util.Collection) r0)     // Catch:{ all -> 0x0038 }
            anhj r0 = r0.iterator()     // Catch:{ all -> 0x0038 }
        L_0x001e:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0038 }
            vmv r2 = (defpackage.vmv) r2     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = r2.a     // Catch:{ all -> 0x0038 }
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x001e
            java.lang.String r5 = r2.b     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)
            return r5
        L_0x0036:
            monitor-exit(r4)
            return r1
        L_0x0038:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x003c
        L_0x003b:
            throw r5
        L_0x003c:
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmw.a(com.google.android.gms.nearby.sharing.ShareTarget):java.lang.String");
    }

    public final synchronized wbx b(ShareTarget shareTarget) {
        String str = (String) this.a.get(shareTarget);
        if (str == null) {
            ((anih) vvj.a.c()).a("Failed to fetch serviceId for %s", (Object) shareTarget);
            return null;
        }
        return b(str);
    }

    /* access modifiers changed from: package-private */
    public final synchronized vmv a(wbx wbx) {
        vmv vmv;
        vmv = (vmv) this.b.get(wbx);
        if (vmv != null) {
            a(vmv.a);
        } else {
            vmv = null;
        }
        return vmv;
    }

    public final synchronized wbx b(String str) {
        for (wbx wbx : this.b.keySet()) {
            vmv vmv = (vmv) this.b.get(wbx);
            if (vmv != null && str.equals(vmv.a)) {
                return wbx;
            }
        }
        return null;
    }

    public final synchronized void a(ShareTarget shareTarget, String str) {
        this.a.put(shareTarget, str);
    }

    public final synchronized void a(String str) {
        wbx b2 = b(str);
        if (b2 != null) {
            this.b.remove(b2);
            Iterator it = new ob((Collection) this.a.keySet()).iterator();
            while (it.hasNext()) {
                ShareTarget shareTarget = (ShareTarget) it.next();
                if (str.equals(this.a.get(shareTarget))) {
                    this.a.remove(shareTarget);
                }
            }
        }
    }

    public final synchronized void a(wbx wbx, vmv vmv) {
        this.b.put(wbx, vmv);
    }
}
