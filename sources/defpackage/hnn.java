package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: hnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hnn {
    public static final fzi a = new hnm();
    public final hkx b = ((hkx) hkx.i.b());
    public final hmx c;
    public final Object d;
    private final hlo e = hlo.a();
    private final hne f = ((hne) hne.a.b());

    public hnn(Context context) {
        this.c = hmx.a(context);
        this.d = new Object();
    }

    public final void a(pyv pyv) {
        synchronized (this.d) {
            this.b.a(pyv, hkx.c, hkx.a, hkx.b);
            this.e.a(pyv);
            hne hne = this.f;
            hne.b.sendBroadcast(new Intent("com.google.android.gms.chromesync.METADATA_UPDATED").putExtra("account", pyv.a()), "com.google.android.gms.chromesync.permission.METADATA_UPDATED");
        }
    }

    public final amri b(pyv pyv) {
        amri amri;
        amri amri2;
        synchronized (this.d) {
            if (!((Boolean) this.b.a(pyv, hkx.c)).booleanValue()) {
                amri = (amri) this.b.a(pyv, hkx.b);
            } else {
                try {
                    hmx hmx = this.c;
                    iva.a((Object) pyv);
                    aucd o = aqow.b.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    "users/me".getClass();
                    ((aqow) o.b).a = "users/me";
                    aqow aqow = (aqow) o.i();
                    hjo hjo = hmx.a;
                    ClientContext a2 = hmx.a(pyv);
                    if (hjo.i == null) {
                        hjo.i = baaj.a(baai.UNARY, "google.internal.chrome.sync.passwords.v1.Passwords/GetMetadata", baoq.a(aqow.b), baoq.a(aqpb.d));
                    }
                    amri2 = amri.b((aqpb) hjo.a.a(hjo.i, a2, aqow, 10000, TimeUnit.MILLISECONDS));
                } catch (babk e2) {
                    if (hmy.a(e2) != babg.NOT_FOUND) {
                        throw new hjm(257, hmy.b(e2), e2);
                    }
                    throw new hmw();
                } catch (eif e3) {
                    throw new hjm(hjn.a(e3), (Throwable) e3);
                } catch (hmw e4) {
                    amri2 = ampu.a;
                }
                a(pyv, amri2);
                amri = amri2;
            }
        }
        return amri;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: aqpb} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aqpb c(defpackage.pyv r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.d
            monitor-enter(r0)
            amri r1 = r10.b(r11)     // Catch:{ all -> 0x0090 }
            boolean r2 = r1.a()     // Catch:{ all -> 0x0090 }
            if (r2 != 0) goto L_0x0087
            hmx r1 = r10.c     // Catch:{ all -> 0x0090 }
            defpackage.iva.a((java.lang.Object) r11)     // Catch:{ all -> 0x0090 }
            aqoq r2 = defpackage.aqoq.b     // Catch:{ all -> 0x0090 }
            aucd r2 = r2.o()     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = "users/me"
            boolean r4 = r2.c     // Catch:{ all -> 0x0090 }
            if (r4 != 0) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            r2.c()     // Catch:{ all -> 0x0090 }
            r4 = 0
            r2.c = r4     // Catch:{ all -> 0x0090 }
        L_0x0025:
            aucj r4 = r2.b     // Catch:{ all -> 0x0090 }
            aqoq r4 = (defpackage.aqoq) r4     // Catch:{ all -> 0x0090 }
            r3.getClass()     // Catch:{ all -> 0x0090 }
            r4.a = r3     // Catch:{ all -> 0x0090 }
            aucj r2 = r2.i()     // Catch:{ all -> 0x0090 }
            r6 = r2
            aqoq r6 = (defpackage.aqoq) r6     // Catch:{ all -> 0x0090 }
            hjo r2 = r1.a     // Catch:{ babk -> 0x0077, eif -> 0x006c }
            com.google.android.gms.common.internal.ClientContext r5 = r1.a((defpackage.pyv) r11)     // Catch:{ babk -> 0x0077, eif -> 0x006c }
            baaj r1 = defpackage.hjo.j     // Catch:{ babk -> 0x0077, eif -> 0x006c }
            if (r1 == 0) goto L_0x0040
            goto L_0x0056
        L_0x0040:
            baai r1 = defpackage.baai.UNARY     // Catch:{ babk -> 0x0077, eif -> 0x006c }
            java.lang.String r3 = "google.internal.chrome.sync.passwords.v1.Passwords/CreateMetadata"
            aqoq r4 = defpackage.aqoq.b     // Catch:{ babk -> 0x0077, eif -> 0x006c }
            baah r4 = defpackage.baoq.a(r4)     // Catch:{ babk -> 0x0077, eif -> 0x006c }
            aqpb r7 = defpackage.aqpb.d     // Catch:{ babk -> 0x0077, eif -> 0x006c }
            baah r7 = defpackage.baoq.a(r7)     // Catch:{ babk -> 0x0077, eif -> 0x006c }
            baaj r1 = defpackage.baaj.a(r1, r3, r4, r7)     // Catch:{ babk -> 0x0077, eif -> 0x006c }
            defpackage.hjo.j = r1     // Catch:{ babk -> 0x0077, eif -> 0x006c }
        L_0x0056:
            izd r3 = r2.a     // Catch:{ babk -> 0x0077, eif -> 0x006c }
            baaj r4 = defpackage.hjo.j     // Catch:{ babk -> 0x0077, eif -> 0x006c }
            r7 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x0077, eif -> 0x006c }
            java.lang.Object r1 = r3.a(r4, r5, r6, r7, r9)     // Catch:{ babk -> 0x0077, eif -> 0x006c }
            aqpb r1 = (defpackage.aqpb) r1     // Catch:{ babk -> 0x0077, eif -> 0x006c }
            amri r2 = defpackage.amri.b(r1)     // Catch:{ all -> 0x0090 }
            r10.a(r11, r2)     // Catch:{ all -> 0x0090 }
            goto L_0x008e
        L_0x006c:
            r11 = move-exception
            hjm r1 = new hjm     // Catch:{ all -> 0x0090 }
            int r2 = defpackage.hjn.a((defpackage.eif) r11)     // Catch:{ all -> 0x0090 }
            r1.<init>((int) r2, (java.lang.Throwable) r11)     // Catch:{ all -> 0x0090 }
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x0077:
            r11 = move-exception
            defpackage.hmy.a(r11)     // Catch:{ all -> 0x0090 }
            hjm r1 = new hjm     // Catch:{ all -> 0x0090 }
            r2 = 257(0x101, float:3.6E-43)
            java.lang.String r3 = defpackage.hmy.b(r11)     // Catch:{ all -> 0x0090 }
            r1.<init>(r2, r3, r11)     // Catch:{ all -> 0x0090 }
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x0087:
            java.lang.Object r11 = r1.b()     // Catch:{ all -> 0x0090 }
            r1 = r11
            aqpb r1 = (defpackage.aqpb) r1     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return r1
        L_0x0090:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnn.c(pyv):aqpb");
    }

    public final void a(pyv pyv, amri amri) {
        amri amri2 = (amri) this.b.a(pyv, hkx.b);
        if ((amri2.a() || amri.a()) && (!amri2.a() || !amri.a() || !TextUtils.equals(((aqpb) amri2.b()).a, ((aqpb) amri.b()).a))) {
            a(pyv);
        }
        this.b.a(pyv, hkx.c, false);
        this.b.a(pyv, hkx.b, amri);
    }
}
