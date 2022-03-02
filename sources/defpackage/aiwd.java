package defpackage;

import java.util.LinkedList;

/* renamed from: aiwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiwd implements atig {
    final /* synthetic */ aiwa a;
    private final LinkedList b;
    private volatile aizn c;
    private atid d;
    private volatile long e = 0;
    private final ajbe f;
    private final int g;
    private airt h;

    public aiwd(aiwa aiwa, int i, ajbe ajbe) {
        String str;
        this.a = aiwa;
        this.g = i;
        int i2 = i - 1;
        if (i2 != 0) {
            str = i2 != 1 ? "-device-location-query" : "-upload";
        } else {
            str = "-query";
        }
        if (str.length() == 0) {
            new String("GlsClientMasf");
        } else {
            "GlsClientMasf".concat(str);
        }
        this.f = ajbe;
        this.b = new LinkedList();
    }

    private final void a(aqek aqek) {
        int i;
        int i2;
        aico aico;
        this.d = null;
        this.h = null;
        if (aqek != null) {
            i = aqek.c();
            i2 = 1;
        } else {
            i2 = 0;
            i = -1;
        }
        int i3 = this.g - 1;
        if (i3 == 0) {
            aico = aico.GLS_QUERY_RESPONSE;
        } else if (i3 != 1) {
            aico = aico.GLS_DEVICE_LOCATION_RESPONSE;
        } else {
            aico = aico.GLS_UPLOAD_RESPONSE;
        }
        aicn aicn = this.a.e;
        aicn.a(new aicl(aico, aicn.b(), "success %2$d, size %3$d", (Object) null, i2, i, -1));
        this.a.c.c(this.f);
        if (this.b.size() > 0) {
            a((aiwb) this.b.remove());
        }
    }

    private final boolean a() {
        int i = this.g;
        return i == 1 || i == 2;
    }

    private final void b() {
        int i = this.g - 1;
        if (i == 0) {
            amrl.a((Object) this.h);
            this.a.d.a((Runnable) new aiwc(this, (aqek) null, this.h));
        } else if (i != 1) {
            this.a.d.a((aqek) null);
        } else {
            this.a.d.b((aqek) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014c A[SYNTHETIC, Splitter:B:74:0x014c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.aiwb r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            atid r0 = r11.d     // Catch:{ all -> 0x020e }
            if (r0 != 0) goto L_0x0207
            aqek r0 = r12.a     // Catch:{ all -> 0x020e }
            aizx r1 = r12.c     // Catch:{ all -> 0x020e }
            aizn r2 = r12.d     // Catch:{ all -> 0x020e }
            airt r3 = r12.e     // Catch:{ all -> 0x020e }
            aiwa r4 = r11.a     // Catch:{ all -> 0x020e }
            ajbg r4 = r4.c     // Catch:{ all -> 0x020e }
            ajbe r5 = r11.f     // Catch:{ all -> 0x020e }
            r6 = 5000(0x1388, double:2.4703E-320)
            r4.b(r5, r6, r1)     // Catch:{ all -> 0x020e }
            r4 = -1
            if (r0 == 0) goto L_0x0020
            int r5 = r0.c()     // Catch:{ all -> 0x020e }
            goto L_0x0021
        L_0x0020:
            r5 = -1
        L_0x0021:
            int r6 = r11.g     // Catch:{ all -> 0x020e }
            int r6 = r6 + r4
            r7 = 1
            if (r6 == 0) goto L_0x003d
            if (r6 == r7) goto L_0x0033
            aiwa r12 = r11.a     // Catch:{ all -> 0x020e }
            aicn r12 = r12.e     // Catch:{ all -> 0x020e }
            aico r6 = defpackage.aico.GLS_DEVICE_LOCATION_QUERY     // Catch:{ all -> 0x020e }
            r12.a((defpackage.aico) r6, (int) r5)     // Catch:{ all -> 0x020e }
            goto L_0x0048
        L_0x0033:
            aiwa r12 = r11.a     // Catch:{ all -> 0x020e }
            aicn r12 = r12.e     // Catch:{ all -> 0x020e }
            aico r6 = defpackage.aico.GLS_UPLOAD     // Catch:{ all -> 0x020e }
            r12.a((defpackage.aico) r6, (int) r5)     // Catch:{ all -> 0x020e }
            goto L_0x0048
        L_0x003d:
            aiwa r6 = r11.a     // Catch:{ all -> 0x020e }
            aicn r6 = r6.e     // Catch:{ all -> 0x020e }
            aico r8 = defpackage.aico.GLS_QUERY     // Catch:{ all -> 0x020e }
            int r12 = r12.b     // Catch:{ all -> 0x020e }
            r6.a((defpackage.aico) r8, (int) r5, (int) r12)     // Catch:{ all -> 0x020e }
        L_0x0048:
            r11.c = r2     // Catch:{ all -> 0x020e }
            r11.h = r3     // Catch:{ all -> 0x020e }
            aiwa r12 = r11.a     // Catch:{ all -> 0x020e }
            android.content.Context r12 = r12.a     // Catch:{ all -> 0x020e }
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ all -> 0x020e }
            r5 = 0
            if (r3 == 0) goto L_0x005c
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x020e }
            goto L_0x005d
        L_0x005c:
            r3 = r5
        L_0x005d:
            aqek r6 = new aqek     // Catch:{ all -> 0x020e }
            aqem r8 = defpackage.ajck.ae     // Catch:{ all -> 0x020e }
            r6.<init>(r8)     // Catch:{ all -> 0x020e }
            int r8 = defpackage.jlo.b()     // Catch:{ all -> 0x020e }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x020e }
            r6.b((int) r7, (java.lang.Object) r8)     // Catch:{ all -> 0x020e }
            java.lang.String r8 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x020e }
            if (r8 == 0) goto L_0x008c
            java.lang.String r8 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x020e }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x020e }
            java.lang.String r9 = "android/"
            int r10 = r8.length()     // Catch:{ all -> 0x020e }
            if (r10 != 0) goto L_0x0087
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x020e }
            r8.<init>(r9)     // Catch:{ all -> 0x020e }
            goto L_0x008e
        L_0x0087:
            java.lang.String r8 = r9.concat(r8)     // Catch:{ all -> 0x020e }
            goto L_0x008e
        L_0x008c:
            java.lang.String r8 = "android"
        L_0x008e:
            r9 = 2
            r6.b((int) r9, (java.lang.Object) r8)     // Catch:{ all -> 0x020e }
            if (r3 == 0) goto L_0x0098
            r8 = 5
            r6.b((int) r8, (java.lang.Object) r3)     // Catch:{ all -> 0x020e }
        L_0x0098:
            java.lang.String r12 = defpackage.aiwa.b(r12)     // Catch:{ all -> 0x020e }
            boolean r3 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x020e }
            if (r3 != 0) goto L_0x00a6
            r3 = 3
            r6.b((int) r3, (java.lang.Object) r12)     // Catch:{ all -> 0x020e }
        L_0x00a6:
            r0.b((int) r7, (java.lang.Object) r6)     // Catch:{ all -> 0x020e }
            boolean r12 = r11.a()     // Catch:{ all -> 0x020e }
            if (r12 == 0) goto L_0x00bc
            r12 = 7
            aiwa r3 = r11.a     // Catch:{ all -> 0x020e }
            ahqp r3 = r3.f     // Catch:{ all -> 0x020e }
            int r3 = r3.c()     // Catch:{ all -> 0x020e }
            r0.g(r12, r3)     // Catch:{ all -> 0x020e }
        L_0x00bc:
            r12 = 4
            int r3 = r0.j(r12)     // Catch:{ all -> 0x020e }
            r6 = 0
            if (r3 <= 0) goto L_0x00c8
            r0.f(r12, r6)     // Catch:{ all -> 0x020e }
        L_0x00c8:
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x020e }
            r12.<init>()     // Catch:{ all -> 0x020e }
            r0.a((java.io.OutputStream) r12)     // Catch:{ Exception -> 0x01e0 }
            atid r0 = new atid     // Catch:{ all -> 0x020e }
            int r3 = r11.g     // Catch:{ all -> 0x020e }
            int r3 = r3 + r4
            if (r3 == 0) goto L_0x00df
            if (r3 == r7) goto L_0x00dc
            java.lang.String r3 = "g:loc/dl"
            goto L_0x00e1
        L_0x00dc:
            java.lang.String r3 = "g:loc/ul"
            goto L_0x00e1
        L_0x00df:
            java.lang.String r3 = "g:loc/ql"
        L_0x00e1:
            byte[] r12 = r12.toByteArray()     // Catch:{ all -> 0x020e }
            r0.<init>(r3, r12)     // Catch:{ all -> 0x020e }
            r11.d = r0     // Catch:{ all -> 0x020e }
            r0.a((defpackage.atig) r11)     // Catch:{ all -> 0x020e }
            if (r1 != 0) goto L_0x00f1
            goto L_0x0197
        L_0x00f1:
            java.lang.reflect.Field r12 = defpackage.ajrc.b     // Catch:{ Exception -> 0x0148 }
            if (r12 == 0) goto L_0x0146
            r12 = r1
            ajrc r12 = (defpackage.ajrc) r12     // Catch:{ Exception -> 0x0148 }
            android.os.WorkSource r12 = r12.a     // Catch:{ Exception -> 0x0148 }
            if (r12 == 0) goto L_0x0146
            java.lang.reflect.Field r12 = defpackage.ajrc.c     // Catch:{ Exception -> 0x0148 }
            if (r12 == 0) goto L_0x0146
            java.lang.reflect.Field r12 = defpackage.ajrc.c     // Catch:{ Exception -> 0x0148 }
            r3 = r1
            ajrc r3 = (defpackage.ajrc) r3     // Catch:{ Exception -> 0x0148 }
            android.os.WorkSource r3 = r3.a     // Catch:{ Exception -> 0x0148 }
            java.lang.Object r12 = r12.get(r3)     // Catch:{ Exception -> 0x0148 }
            if (r12 == 0) goto L_0x0118
            boolean r3 = r12 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0148 }
            if (r3 == 0) goto L_0x0118
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ Exception -> 0x0148 }
            int r4 = r12.intValue()     // Catch:{ Exception -> 0x0148 }
            goto L_0x0119
        L_0x0118:
        L_0x0119:
            if (r4 <= 0) goto L_0x0146
            java.lang.reflect.Field r12 = defpackage.ajrc.b     // Catch:{ Exception -> 0x0148 }
            ajrc r1 = (defpackage.ajrc) r1     // Catch:{ Exception -> 0x0148 }
            android.os.WorkSource r1 = r1.a     // Catch:{ Exception -> 0x0148 }
            java.lang.Object r12 = r12.get(r1)     // Catch:{ Exception -> 0x0148 }
            boolean r1 = r12 instanceof int[]     // Catch:{ Exception -> 0x0148 }
            if (r1 == 0) goto L_0x0146
            int[] r12 = (int[]) r12     // Catch:{ Exception -> 0x0148 }
            int r1 = r12.length     // Catch:{ Exception -> 0x0148 }
            int r1 = java.lang.Math.min(r4, r1)     // Catch:{ Exception -> 0x0148 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0148 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0148 }
        L_0x0135:
            if (r6 >= r1) goto L_0x0145
            r4 = r12[r6]     // Catch:{ Exception -> 0x0143 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0143 }
            r3.add(r4)     // Catch:{ Exception -> 0x0143 }
            int r6 = r6 + 1
            goto L_0x0135
        L_0x0143:
            r12 = move-exception
            goto L_0x014a
        L_0x0145:
            goto L_0x014a
        L_0x0146:
            r3 = r5
            goto L_0x014a
        L_0x0148:
            r12 = move-exception
            r3 = r5
        L_0x014a:
            if (r3 != 0) goto L_0x0150
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x020e }
        L_0x0150:
            if (r3 == 0) goto L_0x0197
            boolean r12 = r3.isEmpty()     // Catch:{ all -> 0x020e }
            if (r12 != 0) goto L_0x0197
            aiwa r12 = r11.a     // Catch:{ all -> 0x020e }
            java.util.Random r12 = r12.g     // Catch:{ all -> 0x020e }
            int r1 = r3.size()     // Catch:{ all -> 0x020e }
            int r12 = r12.nextInt(r1)     // Catch:{ all -> 0x020e }
            java.lang.Object r12 = r3.get(r12)     // Catch:{ all -> 0x020e }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x020e }
            int r12 = r12.intValue()     // Catch:{ all -> 0x020e }
            r0.b((int) r12)     // Catch:{ all -> 0x020e }
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x020e }
            int r3 = r3.length()     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            int r3 = r3 + 51
            r4.<init>(r3)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = "Will blame networking on uid: "
            r4.append(r3)     // Catch:{ all -> 0x020e }
            r4.append(r12)     // Catch:{ all -> 0x020e }
            java.lang.String r12 = " all uids="
            r4.append(r12)     // Catch:{ all -> 0x020e }
            r4.append(r1)     // Catch:{ all -> 0x020e }
            r4.toString()     // Catch:{ all -> 0x020e }
        L_0x0197:
            int r12 = r0.f()     // Catch:{ IOException -> 0x019f }
            long r3 = (long) r12     // Catch:{ IOException -> 0x019f }
            r11.e = r3     // Catch:{ IOException -> 0x019f }
            goto L_0x01a4
        L_0x019f:
            r12 = move-exception
            r3 = 0
            r11.e = r3     // Catch:{ all -> 0x020e }
        L_0x01a4:
            int r12 = r11.g     // Catch:{ all -> 0x020e }
            if (r12 == r9) goto L_0x01a9
            goto L_0x01be
        L_0x01a9:
            defpackage.amrl.a((java.lang.Object) r2)     // Catch:{ all -> 0x020e }
            long r3 = r11.e     // Catch:{ all -> 0x020e }
            boolean r12 = r2.a(r3)     // Catch:{ all -> 0x020e }
            if (r12 != 0) goto L_0x01be
            r11.d = r5     // Catch:{ all -> 0x020e }
            r11.b()     // Catch:{ all -> 0x020e }
            r11.a((defpackage.aqek) r5)     // Catch:{ all -> 0x020e }
            monitor-exit(r11)
            return
        L_0x01be:
            long r1 = r11.e     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r3 = 43
            r12.<init>(r3)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = "Sending "
            r12.append(r3)     // Catch:{ all -> 0x020e }
            r12.append(r1)     // Catch:{ all -> 0x020e }
            java.lang.String r1 = " bytes to MASF."
            r12.append(r1)     // Catch:{ all -> 0x020e }
            r12.toString()     // Catch:{ all -> 0x020e }
            aiwa r12 = r11.a     // Catch:{ all -> 0x020e }
            atho r12 = r12.k     // Catch:{ all -> 0x020e }
            r12.a((defpackage.atih) r0)     // Catch:{ all -> 0x020e }
            monitor-exit(r11)
            return
        L_0x01e0:
            r12 = move-exception
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x020e }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x020e }
            int r0 = r0.length()     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            int r0 = r0 + 45
            r1.<init>(r0)     // Catch:{ all -> 0x020e }
            java.lang.String r0 = "query(): unable to write request to payload: "
            r1.append(r0)     // Catch:{ all -> 0x020e }
            r1.append(r12)     // Catch:{ all -> 0x020e }
            r1.toString()     // Catch:{ all -> 0x020e }
            r11.b()     // Catch:{ all -> 0x020e }
            r11.a((defpackage.aqek) r5)     // Catch:{ all -> 0x020e }
            monitor-exit(r11)
            return
        L_0x0207:
            java.util.LinkedList r0 = r11.b     // Catch:{ all -> 0x020e }
            r0.add(r12)     // Catch:{ all -> 0x020e }
            monitor-exit(r11)
            return
        L_0x020e:
            r12 = move-exception
            monitor-exit(r11)
            goto L_0x0212
        L_0x0211:
            throw r12
        L_0x0212:
            goto L_0x0211
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwd.a(aiwb):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: aqek} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bf A[SYNTHETIC, Splitter:B:42:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e7 A[Catch:{ Exception -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010d A[Catch:{ Exception -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0147 A[SYNTHETIC, Splitter:B:61:0x0147] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.atih r6, defpackage.atii r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            atid r0 = r5.d     // Catch:{ all -> 0x0173 }
            if (r6 != r0) goto L_0x016b
            r6 = 1
            r0 = 0
            java.io.InputStream r1 = r7.b()     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            int r7 = r7.b     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r7 != r2) goto L_0x006b
            aqem r7 = defpackage.ajck.an     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            aqek r7 = defpackage.ajqx.a((java.io.InputStream) r1, (defpackage.aqem) r7)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            int r2 = r7.c()     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            r4 = 27
            r3.<init>(r4)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            java.lang.String r4 = "Received "
            r3.append(r4)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            r3.append(r2)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            java.lang.String r2 = " bytes."
            r3.append(r2)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            r3.toString()     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            int r2 = r7.b((int) r6)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            if (r2 == 0) goto L_0x0039
            goto L_0x0051
        L_0x0039:
            r2 = 3
            boolean r3 = r7.i(r2)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            if (r3 == 0) goto L_0x0051
            java.lang.String r2 = r7.f(r2)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            if (r3 != 0) goto L_0x0051
            aiwa r3 = r5.a     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            android.content.Context r3 = r3.a     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            defpackage.aiwa.a(r3, r2)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
        L_0x0051:
            boolean r2 = r5.a()     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            if (r2 != 0) goto L_0x0058
        L_0x0057:
            goto L_0x006c
        L_0x0058:
            r2 = 5
            boolean r3 = r7.i(r2)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            if (r3 == 0) goto L_0x0057
            aiwa r3 = r5.a     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            ahqp r3 = r3.f     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            aqek r2 = r7.e(r2)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            r3.a((defpackage.aqek) r2)     // Catch:{ Exception -> 0x0098, all -> 0x0094 }
            goto L_0x006c
        L_0x006b:
            r7 = r0
        L_0x006c:
            if (r1 != 0) goto L_0x006f
            goto L_0x0072
        L_0x006f:
            r1.close()     // Catch:{ Exception -> 0x0074 }
        L_0x0072:
            r0 = r7
            goto L_0x00e1
        L_0x0074:
            r7 = move-exception
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0173 }
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0173 }
            int r1 = r1.length()     // Catch:{ all -> 0x0173 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0173 }
            int r1 = r1 + 9
            r2.<init>(r1)     // Catch:{ all -> 0x0173 }
            java.lang.String r1 = "closing: "
            r2.append(r1)     // Catch:{ all -> 0x0173 }
            r2.append(r7)     // Catch:{ all -> 0x0173 }
        L_0x0090:
            r2.toString()     // Catch:{ all -> 0x0173 }
            goto L_0x00e0
        L_0x0094:
            r6 = move-exception
            r0 = r1
            goto L_0x0145
        L_0x0098:
            r7 = move-exception
            goto L_0x009f
        L_0x009a:
            r6 = move-exception
            goto L_0x0145
        L_0x009d:
            r7 = move-exception
            r1 = r0
        L_0x009f:
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0143 }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0143 }
            int r2 = r2.length()     // Catch:{ all -> 0x0143 }
            int r2 = r2 + 20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            r3.<init>(r2)     // Catch:{ all -> 0x0143 }
            java.lang.String r2 = "requestCompleted(): "
            r3.append(r2)     // Catch:{ all -> 0x0143 }
            r3.append(r7)     // Catch:{ all -> 0x0143 }
            r3.toString()     // Catch:{ all -> 0x0143 }
            if (r1 == 0) goto L_0x00e0
            r1.close()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00e1
        L_0x00c3:
            r7 = move-exception
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0173 }
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0173 }
            int r1 = r1.length()     // Catch:{ all -> 0x0173 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0173 }
            int r1 = r1 + 9
            r2.<init>(r1)     // Catch:{ all -> 0x0173 }
            java.lang.String r1 = "closing: "
            r2.append(r1)     // Catch:{ all -> 0x0173 }
            r2.append(r7)     // Catch:{ all -> 0x0173 }
            goto L_0x0090
        L_0x00e0:
        L_0x00e1:
            int r7 = r5.g     // Catch:{ all -> 0x0173 }
            int r7 = r7 + -1
            if (r7 == 0) goto L_0x010d
            if (r7 == r6) goto L_0x00f1
            aiwa r6 = r5.a     // Catch:{ all -> 0x0173 }
            aivu r6 = r6.d     // Catch:{ all -> 0x0173 }
            r6.a((defpackage.aqek) r0)     // Catch:{ all -> 0x0173 }
            goto L_0x013e
        L_0x00f1:
            aiwa r6 = r5.a     // Catch:{ all -> 0x0173 }
            aivu r6 = r6.d     // Catch:{ all -> 0x0173 }
            r6.b((defpackage.aqek) r0)     // Catch:{ all -> 0x0173 }
            long r6 = r5.e     // Catch:{ all -> 0x0173 }
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x013e
            aizn r6 = r5.c     // Catch:{ all -> 0x0173 }
            defpackage.amrl.a((java.lang.Object) r6)     // Catch:{ all -> 0x0173 }
            aizn r6 = r5.c     // Catch:{ all -> 0x0173 }
            long r1 = r5.e     // Catch:{ all -> 0x0173 }
            r6.b(r1)     // Catch:{ all -> 0x0173 }
            goto L_0x013e
        L_0x010d:
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0173 }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0173 }
            int r7 = r7.length()     // Catch:{ all -> 0x0173 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0173 }
            int r7 = r7 + 24
            r1.<init>(r7)     // Catch:{ all -> 0x0173 }
            java.lang.String r7 = "Posting GLS response is "
            r1.append(r7)     // Catch:{ all -> 0x0173 }
            r1.append(r6)     // Catch:{ all -> 0x0173 }
            r1.toString()     // Catch:{ all -> 0x0173 }
            airt r6 = r5.h     // Catch:{ all -> 0x0173 }
            defpackage.amrl.a((java.lang.Object) r6)     // Catch:{ all -> 0x0173 }
            aiwa r6 = r5.a     // Catch:{ all -> 0x0173 }
            aivu r6 = r6.d     // Catch:{ all -> 0x0173 }
            aiwc r7 = new aiwc     // Catch:{ all -> 0x0173 }
            airt r1 = r5.h     // Catch:{ all -> 0x0173 }
            r7.<init>(r5, r0, r1)     // Catch:{ all -> 0x0173 }
            r6.a((java.lang.Runnable) r7)     // Catch:{ all -> 0x0173 }
        L_0x013e:
            r5.a((defpackage.aqek) r0)     // Catch:{ all -> 0x0173 }
            monitor-exit(r5)
            return
        L_0x0143:
            r6 = move-exception
            r0 = r1
        L_0x0145:
            if (r0 == 0) goto L_0x016a
            r0.close()     // Catch:{ Exception -> 0x014b }
            goto L_0x016a
        L_0x014b:
            r7 = move-exception
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0173 }
            int r0 = r0.length()     // Catch:{ all -> 0x0173 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0173 }
            int r0 = r0 + 9
            r1.<init>(r0)     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = "closing: "
            r1.append(r0)     // Catch:{ all -> 0x0173 }
            r1.append(r7)     // Catch:{ all -> 0x0173 }
            r1.toString()     // Catch:{ all -> 0x0173 }
        L_0x016a:
            throw r6     // Catch:{ all -> 0x0173 }
        L_0x016b:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x0173 }
            java.lang.String r7 = "Response to unexpected request."
            r6.<init>(r7)     // Catch:{ all -> 0x0173 }
            throw r6     // Catch:{ all -> 0x0173 }
        L_0x0173:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0177
        L_0x0176:
            throw r6
        L_0x0177:
            goto L_0x0176
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwd.a(atih, atii):void");
    }

    public final synchronized void a(atih atih, Exception exc) {
        if (atih == this.d) {
            String valueOf = String.valueOf(exc);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("requestFailed: ");
            sb.append(valueOf);
            sb.toString();
            if (this.g == 2 && (exc instanceof athf) && this.e > 0) {
                amrl.a((Object) this.c);
                this.c.b(this.e);
            }
            b();
            a((aqek) null);
        } else {
            throw new RuntimeException("Response to unexpected request.");
        }
    }
}
