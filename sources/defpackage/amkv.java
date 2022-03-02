package defpackage;

import java.util.Iterator;
import java.util.Set;

/* renamed from: amkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class amkv {
    private final amkv a;
    public final ou b;
    public boolean c = false;

    public amkv(amkv amkv, ou ouVar) {
        if (amkv != null) {
            amrl.a(amkv.c);
        }
        this.a = amkv;
        this.b = ouVar;
    }

    public static amks a(amkt amkt, amkv amkv, amlw amlw) {
        amrl.a((Object) amlw);
        Object b2 = amkv.b(amkt);
        if (b2 == null) {
            return amks.a(3);
        }
        amrl.a(b2);
        return new amks(1, b2, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r2.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.amkt r3) {
        /*
            r2 = this;
            boolean r0 = r2.c
            defpackage.amrl.b(r0)
            ou r0 = r2.b
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L_0x0016
            amkv r1 = r2.a
            if (r1 == 0) goto L_0x0016
            java.lang.Object r3 = r1.b(r3)
            return r3
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amkv.b(amkt):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this == amku.a;
    }

    public static amkv a(amkv amkv, amkv amkv2) {
        if (!amkv.b()) {
            return !amkv2.b() ? a((Set) anax.a((Object) amkv, (Object) amkv2)) : amkv;
        }
        return amkv2;
    }

    static amkv a(Set set) {
        boolean z;
        if (set.isEmpty()) {
            return amku.a;
        }
        if (set.size() == 1) {
            return (amkv) set.iterator().next();
        }
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            amkv amkv = (amkv) it.next();
            do {
                i += amkv.b.h;
                amkv = amkv.a;
            } while (amkv != null);
        }
        if (i == 0) {
            return amku.a;
        }
        ou ouVar = new ou(i);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            amkv amkv2 = (amkv) it2.next();
            do {
                int i2 = 0;
                while (true) {
                    ou ouVar2 = amkv2.b;
                    if (i2 >= ouVar2.h) {
                        break;
                    }
                    if (ouVar.put((amkt) ouVar2.b(i2), amkv2.b.c(i2)) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    amrl.a(z, "Duplicate bindings: %s", amkv2.b.b(i2));
                    i2++;
                }
                amkv2 = amkv2.a;
            } while (amkv2 != null);
        }
        return new amku((amkv) null, ouVar).a();
    }

    public final amkv a() {
        if (!this.c) {
            this.c = true;
            return (this.a == null || !this.b.isEmpty()) ? this : this.a;
        }
        throw new IllegalStateException("Already frozen");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.amkt r4) {
        /*
            r3 = this;
            ou r0 = r3.b
            boolean r0 = r0.containsKey(r4)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0016
            amkv r0 = r3.a
            if (r0 == 0) goto L_0x0017
            boolean r4 = r0.a((defpackage.amkt) r4)
            if (r4 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            return r1
        L_0x0016:
            r1 = 1
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amkv.a(amkt):boolean");
    }
}
