package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ttf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ttf {
    public final jiq a;
    public final tth b;
    public final ttj c;
    public final tum d;
    public final Context e;
    public final arwg f;
    public final arxg g;
    public boolean h = true;

    public ttf(Context context) {
        this.a = (jiq) thl.a(context, jiq.class);
        this.b = new tth(context);
        this.c = new ttj(context);
        this.d = new tum(context);
        this.e = context;
        this.f = (arwg) thl.a(context, arwg.class);
        this.g = (arxg) thl.a(context, arxg.class);
        f();
    }

    private final Object a(String str, amsv amsv) {
        if (e()) {
            jjg jjg = tsp.a;
            return amsv.a();
        }
        jjg jjg2 = tsp.a;
        AtomicReference atomicReference = new AtomicReference();
        try {
            this.f.a((arwm) new ttd(String.format("postAndWait: %s", new Object[]{str}), atomicReference, amsv));
            return atomicReference.get();
        } catch (InterruptedException e2) {
            anih anih = (anih) tsp.a.c();
            anih.a((Throwable) e2);
            anih.a("postAndWait failed: %s", (Object) str);
            return null;
        }
    }

    public static String b(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static void f() {
        if (aymw.a.a().N()) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            jjg jjg = tsp.a;
            int length = stackTrace.length;
            for (int i = 1; i < stackTrace.length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                stackTraceElement.getClassName();
                stackTraceElement.getMethodName();
                stackTraceElement.getFileName();
                stackTraceElement.getLineNumber();
            }
        }
    }

    public final List c() {
        return a((Collection) this.b.d());
    }

    public final List d() {
        tum tum = this.d;
        tum.getClass();
        return (List) a("getAllFastPairItems", (amsv) new tsy(tum));
    }

    public final ttg e(String str) {
        uaj uaj = (uaj) this.b.a(str);
        if (uaj != null) {
            return new ttg(this.e, uaj);
        }
        return null;
    }

    public final int b(String str) {
        int i = 0;
        for (tzi tzi : d()) {
            if (ampw.a(str, tzi.k)) {
                i++;
            }
        }
        return i;
    }

    public final void c(String str) {
        a("deleteFastPairItem", (amsv) new tsz(this, str));
        jjg jjg = tsp.a;
    }

    public final boolean d(String str) {
        return this.d.b(str);
    }

    public final List b() {
        return (List) a("getCurrentDiscoveryItems", (amsv) new tsv(this));
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        try {
            this.f.b();
            jjg jjg = tsp.a;
            return true;
        } catch (IllegalStateException | NullPointerException e2) {
            jjg jjg2 = tsp.a;
            return false;
        }
    }

    public final void b(ttg ttg) {
        this.b.e(ttg.b);
    }

    public final void b(tzi tzi) {
        if (this.d.a(tzi.b) != null) {
            d(tzi.b);
        }
        tzi a2 = a(tzi.c);
        if (a2 != null) {
            ((anih) tsp.a.d()).a("FastPair: Delete item from cache: %s due to duplicated account key", (Object) a2.b);
            d(a2.b);
        }
        this.d.e(tzi);
        ((anih) tsp.a.d()).a("FastPair: Saved the device (%s) to local cache.", (Object) tzi.b);
    }

    public static String a(ttg ttg) {
        if (ttg.H() == 0) {
            return String.format("[Invalid | %s] ", new Object[]{ttg.b()});
        }
        avbx avbx = avbx.NEARBY_TYPE_UNKNOWN;
        int H = ttg.H();
        int i = H - 1;
        if (H == 0) {
            throw null;
        } else if (i == 0) {
            return "[Evaluating...] ";
        } else {
            if (i == 1) {
                return "[Notification] ";
            }
            if (i != 2) {
                return String.format("[Invalid | %s] ", new Object[]{ttg.b()});
            }
            return String.format("[List View | %s] ", new Object[]{ttg.b()});
        }
    }

    public final List a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new ttg(this.e, (uaj) it.next()));
        }
        return arrayList;
    }

    public final tzi a(auay auay) {
        return (tzi) a("getFastPairItemByAccountKey", (amsv) new tsx(this, auay));
    }

    public final tzi a(String str) {
        return (tzi) a("getFastPairItem", (amsv) new tsw(this, str));
    }

    public final void a() {
        this.f.b();
        this.b.e();
        this.c.e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: aucd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04e7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0214  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.aucd r14) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x04e9
            jjg r0 = defpackage.tsp.a
            aucj r0 = r14.b
            ual r0 = (defpackage.ual) r0
            int r0 = r0.c
            avbx r0 = defpackage.avbx.a(r0)
            if (r0 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            avbx r0 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
        L_0x0013:
            boolean r0 = defpackage.ttg.b((defpackage.avbx) r0)
            if (r0 != 0) goto L_0x0022
            aucj r14 = r14.b
            ual r14 = (defpackage.ual) r14
            int r14 = r14.a
            r14 = r14 & 2
            return
        L_0x0022:
            aucj r0 = r14.b
            ual r0 = (defpackage.ual) r0
            int r0 = r0.c
            avbx r0 = defpackage.avbx.a(r0)
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            avbx r0 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
        L_0x0031:
            boolean r0 = defpackage.ttg.a((defpackage.avbx) r0)
            if (r0 == 0) goto L_0x0095
            aucj r0 = r14.b
            ual r0 = (defpackage.ual) r0
            int r1 = r0.a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0095
            int r0 = r0.c
            avbx r0 = defpackage.avbx.a(r0)
            if (r0 != 0) goto L_0x004b
            avbx r0 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
        L_0x004b:
            avbx r1 = defpackage.avbx.NEARBY_CHROMECAST
            if (r0 != r1) goto L_0x006a
            aucj r0 = r14.b
            ual r0 = (defpackage.ual) r0
            int r0 = r0.e
            long r0 = (long) r0
            aymq r2 = defpackage.aymq.a
            aymr r2 = r2.a()
            long r2 = r2.k()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0065
            goto L_0x006a
        L_0x0065:
            aucj r14 = r14.b
        L_0x0067:
            ual r14 = (defpackage.ual) r14
            return
        L_0x006a:
            aucj r0 = r14.b
            ual r0 = (defpackage.ual) r0
            int r0 = r0.c
            avbx r0 = defpackage.avbx.a(r0)
            if (r0 != 0) goto L_0x0078
            avbx r0 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
        L_0x0078:
            avbx r1 = defpackage.avbx.NEARBY_WEAR
            if (r0 == r1) goto L_0x007d
            goto L_0x0095
        L_0x007d:
            aucj r0 = r14.b
            ual r0 = (defpackage.ual) r0
            int r0 = r0.e
            long r0 = (long) r0
            aymq r2 = defpackage.aymq.a
            aymr r2 = r2.a()
            long r2 = r2.ag()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0095
            aucj r14 = r14.b
            goto L_0x0067
        L_0x0095:
            aucj r0 = r14.b
            ual r0 = (defpackage.ual) r0
            java.lang.String r0 = r0.b
            ttj r1 = r13.c
            java.lang.Object r0 = r1.a((java.lang.String) r0)
            ual r0 = (defpackage.ual) r0
            r1 = 4
            r2 = 0
            if (r0 == 0) goto L_0x0140
            aucj r3 = r14.b
            ual r3 = (defpackage.ual) r3
            int r3 = r3.a
            r3 = r3 & r1
            if (r3 == 0) goto L_0x00b1
            goto L_0x00d0
        L_0x00b1:
            int r3 = r0.a
            r3 = r3 & r1
            if (r3 == 0) goto L_0x00d0
            java.lang.String r3 = r0.d
            boolean r4 = r14.c
            if (r4 != 0) goto L_0x00bd
            goto L_0x00c2
        L_0x00bd:
            r14.c()
            r14.c = r2
        L_0x00c2:
            aucj r4 = r14.b
            ual r4 = (defpackage.ual) r4
            r3.getClass()
            int r5 = r4.a
            r5 = r5 | r1
            r4.a = r5
            r4.d = r3
        L_0x00d0:
            aucj r3 = r14.b
            ual r3 = (defpackage.ual) r3
            int r3 = r3.a
            r3 = r3 & 8
            if (r3 == 0) goto L_0x00db
            goto L_0x00f9
        L_0x00db:
            int r3 = r0.a
            r3 = r3 & 8
            if (r3 == 0) goto L_0x00f9
            int r3 = r0.e
            boolean r4 = r14.c
            if (r4 != 0) goto L_0x00e8
            goto L_0x00ed
        L_0x00e8:
            r14.c()
            r14.c = r2
        L_0x00ed:
            aucj r4 = r14.b
            ual r4 = (defpackage.ual) r4
            int r5 = r4.a
            r5 = r5 | 8
            r4.a = r5
            r4.e = r3
        L_0x00f9:
            aucj r3 = r14.b
            ual r3 = (defpackage.ual) r3
            int r3 = r3.a
            r3 = r3 & 16
            if (r3 != 0) goto L_0x0121
            int r3 = r0.a
            r3 = r3 & 16
            if (r3 == 0) goto L_0x0121
            int r3 = r0.f
            boolean r4 = r14.c
            if (r4 != 0) goto L_0x0110
            goto L_0x0115
        L_0x0110:
            r14.c()
            r14.c = r2
        L_0x0115:
            aucj r4 = r14.b
            ual r4 = (defpackage.ual) r4
            int r5 = r4.a
            r5 = r5 | 16
            r4.a = r5
            r4.f = r3
        L_0x0121:
            int r3 = r0.a
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0128
            goto L_0x0140
        L_0x0128:
            long r3 = r0.i
            boolean r0 = r14.c
            if (r0 != 0) goto L_0x012f
            goto L_0x0134
        L_0x012f:
            r14.c()
            r14.c = r2
        L_0x0134:
            aucj r0 = r14.b
            ual r0 = (defpackage.ual) r0
            int r5 = r0.a
            r5 = r5 | 128(0x80, float:1.794E-43)
            r0.a = r5
            r0.i = r3
        L_0x0140:
            aucj r14 = r14.i()
            ual r14 = (defpackage.ual) r14
            r0 = 5
            java.lang.Object r3 = r14.c(r0)
            aucd r3 = (defpackage.aucd) r3
            r3.a((defpackage.aucj) r14)
            aucj r14 = r3.b
            ual r14 = (defpackage.ual) r14
            int r4 = r14.a
            r4 = r4 & r1
            if (r4 == 0) goto L_0x04e8
            int r14 = r14.c
            avbx r14 = defpackage.avbx.a(r14)
            if (r14 != 0) goto L_0x0163
            avbx r14 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
        L_0x0163:
            int r14 = r14.ordinal()
            r4 = 3
            r5 = 0
            if (r14 == r4) goto L_0x0192
            if (r14 == r1) goto L_0x01be
            jjg r14 = defpackage.tsp.a
            anie r14 = r14.b()
            anih r14 = (defpackage.anih) r14
            aucj r6 = r3.b
            ual r6 = (defpackage.ual) r6
            int r7 = r6.a
            r7 = r7 & 2
            if (r7 == 0) goto L_0x018a
            int r6 = r6.c
            avbx r6 = defpackage.avbx.a(r6)
            if (r6 != 0) goto L_0x018b
            avbx r6 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
            goto L_0x018b
        L_0x018a:
            r6 = r5
        L_0x018b:
            java.lang.String r7 = "Unknown device type %s"
            r14.a((java.lang.String) r7, (java.lang.Object) r6)
            goto L_0x01e5
        L_0x0192:
            aymq r14 = defpackage.aymq.a
            aymr r14 = r14.a()
            boolean r14 = r14.aa()
            if (r14 == 0) goto L_0x01be
            aucj r14 = r3.b
            ual r14 = (defpackage.ual) r14
            int r14 = r14.h
            boolean r14 = defpackage.ttk.b(r14)
            if (r14 == 0) goto L_0x01be
            aucj r14 = r3.b
            ual r14 = (defpackage.ual) r14
            int r14 = r14.h
            long r6 = (long) r14
            long r8 = defpackage.aymq.e()
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 <= 0) goto L_0x01e5
            aucj r14 = r3.b
            ual r14 = (defpackage.ual) r14
            return
        L_0x01be:
            aucj r14 = r3.i()
            ual r14 = (defpackage.ual) r14
            int r6 = r14.a
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x01e5
            jiq r6 = r13.a
            long r6 = r6.a()
            long r8 = r14.i
            long r6 = r6 - r8
            long r8 = defpackage.aymq.e()
            r10 = 60000(0xea60, double:2.9644E-319)
            long r8 = r8 * r10
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 <= 0) goto L_0x01e5
            aucj r14 = r3.b
            ual r14 = (defpackage.ual) r14
            return
        L_0x01e5:
            ttj r14 = r13.c
            aucj r6 = r3.i()
            ual r6 = (defpackage.ual) r6
            r14.e(r6)
            tth r14 = r13.b
            aucj r3 = r3.i()
            ual r3 = (defpackage.ual) r3
            uaj r6 = defpackage.ttg.a()
            java.lang.Object r7 = r6.c(r0)
            aucd r7 = (defpackage.aucd) r7
            r7.a((defpackage.aucj) r6)
            int r6 = r3.c
            avbx r6 = defpackage.avbx.a(r6)
            if (r6 != 0) goto L_0x020f
            avbx r6 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
        L_0x020f:
            boolean r8 = r7.c
            if (r8 != 0) goto L_0x0214
            goto L_0x0219
        L_0x0214:
            r7.c()
            r7.c = r2
        L_0x0219:
            aucj r8 = r7.b
            uaj r8 = (defpackage.uaj) r8
            uaj r9 = defpackage.uaj.K
            int r6 = r6.h
            r8.d = r6
            int r6 = r8.a
            r6 = r6 | 2
            r8.a = r6
            int r6 = r3.c
            avbx r6 = defpackage.avbx.a(r6)
            if (r6 == 0) goto L_0x0232
            goto L_0x0234
        L_0x0232:
            avbx r6 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
        L_0x0234:
            int r6 = r6.ordinal()
            r8 = 1
            if (r6 == r4) goto L_0x0273
            if (r6 == r1) goto L_0x023f
            r4 = r5
            goto L_0x02a0
        L_0x023f:
            aymq r4 = defpackage.aymq.a
            aymr r4 = r4.a()
            java.lang.String r4 = r4.c()
            boolean r6 = r7.c
            if (r6 != 0) goto L_0x024e
            goto L_0x0253
        L_0x024e:
            r7.c()
            r7.c = r2
        L_0x0253:
            aucj r6 = r7.b
            uaj r6 = (defpackage.uaj) r6
            r4.getClass()
            int r9 = r6.a
            r9 = r9 | 8
            r6.a = r9
            r6.f = r4
            java.lang.String r4 = "wear_com.google.android.wearable.app"
            r4.getClass()
            r9 = r9 | r8
            r6.a = r9
            r6.c = r4
            aucj r4 = r7.i()
            uaj r4 = (defpackage.uaj) r4
            goto L_0x02a0
        L_0x0273:
            java.lang.String r4 = defpackage.aymq.b()
            boolean r6 = r7.c
            if (r6 != 0) goto L_0x027c
            goto L_0x0281
        L_0x027c:
            r7.c()
            r7.c = r2
        L_0x0281:
            aucj r6 = r7.b
            uaj r6 = (defpackage.uaj) r6
            r4.getClass()
            int r9 = r6.a
            r9 = r9 | 8
            r6.a = r9
            r6.f = r4
            java.lang.String r4 = "cc_com.google.android.apps.chromecast.app"
            r4.getClass()
            r9 = r9 | r8
            r6.a = r9
            r6.c = r4
            aucj r4 = r7.i()
            uaj r4 = (defpackage.uaj) r4
        L_0x02a0:
            r6 = 0
            if (r4 == 0) goto L_0x03d5
            java.lang.Object r9 = r4.c(r0)
            aucd r9 = (defpackage.aucd) r9
            r9.a((defpackage.aucj) r4)
            int r4 = r3.a
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x02ba
            long r10 = r3.i
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            goto L_0x02bb
        L_0x02ba:
            r4 = r5
        L_0x02bb:
            if (r4 == 0) goto L_0x02d7
            long r10 = r4.longValue()
            boolean r4 = r9.c
            if (r4 == 0) goto L_0x02ca
            r9.c()
            r9.c = r2
        L_0x02ca:
            aucj r4 = r9.b
            uaj r4 = (defpackage.uaj) r4
            int r12 = r4.a
            r12 = r12 | 512(0x200, float:7.175E-43)
            r4.a = r12
            r4.l = r10
            goto L_0x02ed
        L_0x02d7:
            boolean r4 = r9.c
            if (r4 != 0) goto L_0x02dc
            goto L_0x02e1
        L_0x02dc:
            r9.c()
            r9.c = r2
        L_0x02e1:
            aucj r4 = r9.b
            uaj r4 = (defpackage.uaj) r4
            int r10 = r4.a
            r10 = r10 & -513(0xfffffffffffffdff, float:NaN)
            r4.a = r10
            r4.l = r6
        L_0x02ed:
            int r4 = r3.a
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x02fa
            long r10 = r3.j
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            goto L_0x02fb
        L_0x02fa:
            r4 = r5
        L_0x02fb:
            if (r4 == 0) goto L_0x0317
            long r10 = r4.longValue()
            boolean r4 = r9.c
            if (r4 == 0) goto L_0x030a
            r9.c()
            r9.c = r2
        L_0x030a:
            aucj r4 = r9.b
            uaj r4 = (defpackage.uaj) r4
            int r12 = r4.a
            r12 = r12 | 256(0x100, float:3.59E-43)
            r4.a = r12
            r4.k = r10
            goto L_0x032d
        L_0x0317:
            boolean r4 = r9.c
            if (r4 != 0) goto L_0x031c
            goto L_0x0321
        L_0x031c:
            r9.c()
            r9.c = r2
        L_0x0321:
            aucj r4 = r9.b
            uaj r4 = (defpackage.uaj) r4
            int r10 = r4.a
            r10 = r10 & -257(0xfffffffffffffeff, float:NaN)
            r4.a = r10
            r4.k = r6
        L_0x032d:
            java.lang.String r4 = r3.d
            aucj r10 = r9.b
            uaj r10 = (defpackage.uaj) r10
            r4.getClass()
            int r11 = r10.a
            r11 = r11 | r1
            r10.a = r11
            r10.e = r4
            int r4 = r3.a
            r4 = r4 & 8
            if (r4 == 0) goto L_0x034a
            int r4 = r3.e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x034b
        L_0x034a:
            r4 = r5
        L_0x034b:
            if (r4 == 0) goto L_0x0367
            int r4 = r4.intValue()
            boolean r10 = r9.c
            if (r10 == 0) goto L_0x035a
            r9.c()
            r9.c = r2
        L_0x035a:
            aucj r10 = r9.b
            uaj r10 = (defpackage.uaj) r10
            int r11 = r10.a
            r11 = r11 | 8192(0x2000, float:1.14794E-41)
            r10.a = r11
            r10.p = r4
            goto L_0x037d
        L_0x0367:
            boolean r4 = r9.c
            if (r4 != 0) goto L_0x036c
            goto L_0x0371
        L_0x036c:
            r9.c()
            r9.c = r2
        L_0x0371:
            aucj r4 = r9.b
            uaj r4 = (defpackage.uaj) r4
            int r10 = r4.a
            r10 = r10 & -8193(0xffffffffffffdfff, float:NaN)
            r4.a = r10
            r4.p = r2
        L_0x037d:
            int r4 = r3.a
            r4 = r4 & 16
            if (r4 == 0) goto L_0x038a
            int r4 = r3.f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x038b
        L_0x038a:
            r4 = r5
        L_0x038b:
            if (r4 == 0) goto L_0x03a7
            int r4 = r4.intValue()
            boolean r10 = r9.c
            if (r10 == 0) goto L_0x039a
            r9.c()
            r9.c = r2
        L_0x039a:
            aucj r10 = r9.b
            uaj r10 = (defpackage.uaj) r10
            int r11 = r10.a
            r11 = r11 | 16384(0x4000, float:2.2959E-41)
            r10.a = r11
            r10.q = r4
            goto L_0x03bd
        L_0x03a7:
            boolean r4 = r9.c
            if (r4 != 0) goto L_0x03ac
            goto L_0x03b1
        L_0x03ac:
            r9.c()
            r9.c = r2
        L_0x03b1:
            aucj r4 = r9.b
            uaj r4 = (defpackage.uaj) r4
            int r10 = r4.a
            r10 = r10 & -16385(0xffffffffffffbfff, float:NaN)
            r4.a = r10
            r4.q = r2
        L_0x03bd:
            aucj r4 = r9.b
            uaj r4 = (defpackage.uaj) r4
            aucx r10 = defpackage.aucj.s()
            r4.C = r10
            int[] r4 = new int[r8]
            r8 = 501(0x1f5, float:7.02E-43)
            r4[r2] = r8
            java.util.List r4 = defpackage.tsr.a((int[]) r4)
            r9.ab(r4)
            goto L_0x03d6
        L_0x03d5:
            r9 = r5
        L_0x03d6:
            if (r9 == 0) goto L_0x04e7
            aucj r4 = r9.b
            uaj r4 = (defpackage.uaj) r4
            java.lang.String r4 = r4.c
            java.lang.Object r4 = r14.a((java.lang.String) r4)
            uaj r4 = (defpackage.uaj) r4
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r0 = r4.c(r0)
            r9 = r0
            aucd r9 = (defpackage.aucd) r9
            r9.a((defpackage.aucj) r4)
            int r0 = r3.c
            avbx r0 = defpackage.avbx.a(r0)
            if (r0 != 0) goto L_0x03fa
            avbx r0 = defpackage.avbx.NEARBY_TYPE_UNKNOWN
        L_0x03fa:
            boolean r4 = r9.c
            if (r4 != 0) goto L_0x03ff
            goto L_0x0404
        L_0x03ff:
            r9.c()
            r9.c = r2
        L_0x0404:
            aucj r4 = r9.b
            uaj r4 = (defpackage.uaj) r4
            int r0 = r0.h
            r4.d = r0
            int r0 = r4.a
            r0 = r0 | 2
            r4.a = r0
            java.lang.String r8 = r3.d
            r8.getClass()
            r0 = r0 | r1
            r4.a = r0
            r4.e = r8
            int r0 = r3.a
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0429
            long r0 = r3.j
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x042a
        L_0x0429:
            r0 = r5
        L_0x042a:
            if (r0 == 0) goto L_0x0446
            long r0 = r0.longValue()
            boolean r4 = r9.c
            if (r4 == 0) goto L_0x0439
            r9.c()
            r9.c = r2
        L_0x0439:
            aucj r4 = r9.b
            uaj r4 = (defpackage.uaj) r4
            int r6 = r4.a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r4.a = r6
            r4.k = r0
            goto L_0x045c
        L_0x0446:
            boolean r0 = r9.c
            if (r0 != 0) goto L_0x044b
            goto L_0x0450
        L_0x044b:
            r9.c()
            r9.c = r2
        L_0x0450:
            aucj r0 = r9.b
            uaj r0 = (defpackage.uaj) r0
            int r1 = r0.a
            r1 = r1 & -257(0xfffffffffffffeff, float:NaN)
            r0.a = r1
            r0.k = r6
        L_0x045c:
            int r0 = r3.a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0469
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x046a
        L_0x0469:
            r0 = r5
        L_0x046a:
            if (r0 == 0) goto L_0x0486
            int r0 = r0.intValue()
            boolean r1 = r9.c
            if (r1 == 0) goto L_0x0479
            r9.c()
            r9.c = r2
        L_0x0479:
            aucj r1 = r9.b
            uaj r1 = (defpackage.uaj) r1
            int r4 = r1.a
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            r1.a = r4
            r1.p = r0
            goto L_0x049c
        L_0x0486:
            boolean r0 = r9.c
            if (r0 != 0) goto L_0x048b
            goto L_0x0490
        L_0x048b:
            r9.c()
            r9.c = r2
        L_0x0490:
            aucj r0 = r9.b
            uaj r0 = (defpackage.uaj) r0
            int r1 = r0.a
            r1 = r1 & -8193(0xffffffffffffdfff, float:NaN)
            r0.a = r1
            r0.p = r2
        L_0x049c:
            int r0 = r3.a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x04a9
            int r0 = r3.f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            goto L_0x04aa
        L_0x04a9:
        L_0x04aa:
            if (r5 == 0) goto L_0x04c7
            int r0 = r5.intValue()
            boolean r1 = r9.c
            if (r1 != 0) goto L_0x04b5
            goto L_0x04ba
        L_0x04b5:
            r9.c()
            r9.c = r2
        L_0x04ba:
            aucj r1 = r9.b
            uaj r1 = (defpackage.uaj) r1
            int r2 = r1.a
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            r1.a = r2
            r1.q = r0
            goto L_0x04dd
        L_0x04c7:
            boolean r0 = r9.c
            if (r0 != 0) goto L_0x04cc
            goto L_0x04d1
        L_0x04cc:
            r9.c()
            r9.c = r2
        L_0x04d1:
            aucj r0 = r9.b
            uaj r0 = (defpackage.uaj) r0
            int r1 = r0.a
            r1 = r1 & -16385(0xffffffffffffbfff, float:NaN)
            r0.a = r1
            r0.q = r2
        L_0x04dd:
            aucj r0 = r9.i()
            uaj r0 = (defpackage.uaj) r0
            r14.e(r0)
            return
        L_0x04e7:
            return
        L_0x04e8:
            return
        L_0x04e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttf.a(aucd):void");
    }

    public final void a(String str, int i) {
        jjg jjg = tsp.a;
        ttg e2 = e(str);
        if (e2 != null) {
            e2.b(i);
        }
    }

    public final void a(String str, String str2) {
        tzi a2 = a(str);
        if (a2 == null || TextUtils.isEmpty(str2)) {
            ((anih) tsp.a.d()).a("FastPair: update fastPairItem fail with no valid update info");
            return;
        }
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        tzi tzi = (tzi) aucd.b;
        str2.getClass();
        tzi.a |= 16;
        tzi.f = str2;
        long a3 = ((jiq) thl.a(this.e, jiq.class)).a();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        tzi tzi2 = (tzi) aucd.b;
        int i = tzi2.a | 128;
        tzi2.a = i;
        tzi2.i = a3;
        tzi2.a = i | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        tzi2.j = true;
        a((tzi) aucd.i());
    }

    public final void a(String str, boolean z) {
        tzi a2 = a(str);
        if (a2 != null) {
            aucd aucd = (aucd) a2.c(5);
            aucd.a((aucj) a2);
            long a3 = ((jiq) thl.a(this.e, jiq.class)).a();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            tzi tzi = (tzi) aucd.b;
            int i = tzi.a | 64;
            tzi.a = i;
            tzi.h = a3;
            tzi.a = i | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            tzi.j = z;
            a((tzi) aucd.i());
            jjg jjg = tsp.a;
        }
    }

    public final void a(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((String) list.get(i2), i);
        }
    }

    public final void a(tzi tzi) {
        if (e()) {
            b(tzi);
        } else {
            this.f.c(new ttc(this, "putFastPairItem", tzi));
        }
    }

    public final void a(tzi tzi, boolean z) {
        tzi a2 = a(tzi.b);
        if (a2 == null) {
            return;
        }
        if ((a2.a & 2048) != 0 && a2.o == z) {
            ((anih) tsp.a.d()).a("FastPair: updateFastPairItemFmaState for device (%s), skip because of same state(%s).", (Object) a2.b, z);
            return;
        }
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        tzi tzi2 = (tzi) aucd.b;
        tzi2.a |= 2048;
        tzi2.o = z;
        a((tzi) aucd.i());
        ((anih) tsp.a.d()).a("FastPair: updateFastPairItemFmaState for device (%s), update to (%s).", (Object) a2.b, z);
    }

    public final void a(tzi tzi, boolean z, int i) {
        tzi a2 = a(tzi.b);
        if (a2 != null) {
            aucd aucd = (aucd) a2.c(5);
            aucd.a((aucj) a2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            tzi tzi2 = (tzi) aucd.b;
            int i2 = tzi2.a | 8;
            tzi2.a = i2;
            tzi2.e = i;
            tzi2.a = i2 | 4;
            tzi2.d = z;
            a((tzi) aucd.i());
            jjg jjg = tsp.a;
        }
    }
}
