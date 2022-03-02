package defpackage;

import android.net.Uri;
import android.util.Log;
import java.util.Collection;
import java.util.List;

/* renamed from: hff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hff {
    private static volatile hff e = null;
    private final Object a = new Object();
    private Uri b = null;
    private long c;
    private Object[] d = null;

    private hff() {
        hem.a();
    }

    public static int a(boz boz, String str, int i) {
        bob a2 = a(boz, a(str));
        if (a2 == null || a2.c < ((long) i)) {
            return -1;
        }
        return bpz.a(boz, b(str));
    }

    private static String b(String str) {
        if (str.startsWith("com.google.android.gms.")) {
            return str;
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("com.google.android.gms.") : "com.google.android.gms.".concat(valueOf);
    }

    private static bob a(boz boz, String str) {
        List a2 = bpr.a(boz, (Collection) amzy.a((Object) str));
        if (a2.isEmpty()) {
            String valueOf = String.valueOf(str);
            Log.w("ProviderHelper", valueOf.length() == 0 ? new String("Unknown dynamite feature ") : "Unknown dynamite feature ".concat(valueOf));
            return null;
        }
        bob bob = (bob) a2.get(0);
        if (!bob.d) {
            return bob;
        }
        String valueOf2 = String.valueOf(str);
        Log.w("ProviderHelper", valueOf2.length() == 0 ? new String("Ignoring optional dynamite feature ") : "Ignoring optional dynamite feature ".concat(valueOf2));
        return null;
    }

    public final void b() {
        synchronized (this.a) {
            this.c = 0;
            this.b = null;
            this.d = null;
        }
        hey.a(true);
    }

    public static hff a() {
        hff hff = e;
        if (hff == null) {
            synchronized (hff.class) {
                hff = e;
                if (hff == null) {
                    hff = new hff();
                    e = hff;
                }
            }
        }
        return hff;
    }

    private static String a(String str) {
        return str.startsWith("com.google.android.gms.") ? str.substring(23) : str;
    }

    private final void a(bkp bkp, Uri uri, Object[] objArr) {
        objArr[0] = 0;
        synchronized (this.a) {
            this.d = objArr;
            this.c = bkp.a;
            this.b = uri;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r8 = java.lang.String.valueOf(r8.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r8.length() == 0) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        new java.lang.String("No config found: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        "No config found: ".concat(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r6.j();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        b();
        r0 = r6.a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r21 == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01e0 A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:1:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor a(android.content.Context r18, defpackage.jlm r19, android.net.Uri r20, boolean r21, boolean r22) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            bkv r6 = defpackage.bkv.a((android.content.Context) r18)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            bkp r7 = new bkp     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r7.<init>()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            boz r0 = r6.a((defpackage.bkp) r7)     // Catch:{ InvalidConfigException -> 0x0016, IllegalArgumentException -> 0x01e0 }
            goto L_0x003f
        L_0x0016:
            r0 = move-exception
            r8 = r0
            if (r21 != 0) goto L_0x0038
            java.lang.String r0 = "No config found: "
            java.lang.String r8 = r8.getMessage()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            int r9 = r8.length()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            if (r9 != 0) goto L_0x0030
            java.lang.String r8 = new java.lang.String     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r8.<init>(r0)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            goto L_0x0033
        L_0x0030:
            r0.concat(r8)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
        L_0x0033:
            r6.j()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r0 = 0
            goto L_0x003f
        L_0x0038:
            r17.b()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            boz r0 = r6.a((defpackage.bkp) r7)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
        L_0x003f:
            java.lang.String[] r8 = defpackage.hfe.b     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            int r8 = r8.length     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.Object r10 = r1.a     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            monitor-enter(r10)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            long r11 = r1.c     // Catch:{ all -> 0x01dd }
            r13 = 0
            r15 = 1
            r5 = 0
            int r16 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r16 == 0) goto L_0x0068
            long r13 = r7.a     // Catch:{ all -> 0x01dd }
            int r16 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r16 != 0) goto L_0x0068
            android.net.Uri r11 = r1.b     // Catch:{ all -> 0x01dd }
            boolean r11 = r4.equals(r11)     // Catch:{ all -> 0x01dd }
            if (r11 == 0) goto L_0x0068
            java.lang.Object[] r11 = r1.d     // Catch:{ all -> 0x01dd }
            if (r11 == 0) goto L_0x0068
            java.lang.System.arraycopy(r11, r5, r9, r5, r8)     // Catch:{ all -> 0x01dd }
            r8 = 1
            goto L_0x0069
        L_0x0068:
            r8 = 0
        L_0x0069:
            monitor-exit(r10)     // Catch:{ all -> 0x01dd }
            if (r8 == 0) goto L_0x006e
            goto L_0x01b4
        L_0x006e:
            if (r0 == 0) goto L_0x01b1
            java.util.List r8 = r20.getPathSegments()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.Object r8 = r8.get(r15)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.String r11 = b(r8)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.String r12 = a(r8)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            bob r13 = a(r0, r12)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            if (r13 == 0) goto L_0x01ad
            int r14 = android.os.Binder.getCallingUid()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            int r10 = android.os.Process.myUid()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            if (r14 != r10) goto L_0x0093
            goto L_0x00bd
        L_0x0093:
            if (r3 == 0) goto L_0x00bd
            boolean r10 = defpackage.jlm.b()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            if (r10 == 0) goto L_0x00bd
            java.lang.String r10 = "ProviderHelper"
            java.lang.String r14 = "Device is not certified!"
            android.util.Log.e(r10, r14)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.String[] r10 = r3.b     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            int r14 = r10.length     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r15 = 0
        L_0x00a6:
            if (r15 >= r14) goto L_0x00b3
            r5 = r10[r15]     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            boolean r5 = r5.equals(r12)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            if (r5 != 0) goto L_0x00bd
            int r15 = r15 + 1
            goto L_0x00a6
        L_0x00b3:
            r0 = 2
            r3.a(r0)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r1.a((defpackage.bkp) r7, (android.net.Uri) r4, (java.lang.Object[]) r9)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            goto L_0x01b4
        L_0x00bd:
            int r3 = defpackage.bpz.a(r0, r11)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r5 = r3
            r3 = r0
            r0 = r21
        L_0x00c5:
            java.lang.String r10 = "com.google.android.gms.dynamiteloader"
            bpa r10 = r3.a((java.lang.String) r10)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            if (r10 == 0) goto L_0x00d6
            int r12 = r10.S()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            boy r12 = r3.a((int) r12)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            goto L_0x00d7
        L_0x00d6:
            r12 = 0
        L_0x00d7:
            if (r5 < 0) goto L_0x00dc
            if (r12 == 0) goto L_0x00dc
            goto L_0x011a
        L_0x00dc:
            if (r0 == 0) goto L_0x011a
            defpackage.hey.a()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r0 = 1
            defpackage.hey.a((android.content.Context) r2, (int) r0, (java.lang.String) r11)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            boz r3 = r6.a((defpackage.bkp) r7)     // Catch:{ InvalidConfigException -> 0x00f0, IllegalArgumentException -> 0x01e0 }
            r0 = 0
            int r5 = a((defpackage.boz) r3, (java.lang.String) r8, (int) r0)     // Catch:{ InvalidConfigException -> 0x00f0, IllegalArgumentException -> 0x01e0 }
            r0 = 0
            goto L_0x00c5
        L_0x00f0:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            int r2 = r2.length()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            int r2 = r2 + 29
            r3.<init>(r2)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.String r2 = "Failed to get module config: "
            r3.append(r2)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r3.append(r0)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.String r0 = "ProviderHelper"
            java.lang.String r2 = r3.toString()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            android.util.Log.w(r0, r2)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r1.a((defpackage.bkp) r7, (android.net.Uri) r4, (java.lang.Object[]) r9)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            goto L_0x01b4
        L_0x011a:
            if (r5 >= 0) goto L_0x011e
            goto L_0x01a0
        L_0x011e:
            if (r12 == 0) goto L_0x01a0
            if (r22 == 0) goto L_0x0150
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r2 = 24
            if (r0 < r2) goto L_0x0150
            int r0 = r12.a()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r2 = 3
            if (r0 == r2) goto L_0x0130
            goto L_0x0137
        L_0x0130:
            java.lang.String r0 = r12.b()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            defpackage.blz.a((java.lang.String) r0)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
        L_0x0137:
            bpa r0 = r3.b(r5)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            int r0 = r0.S()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            boy r0 = r3.a((int) r0)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            int r3 = r0.a()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            if (r3 != r2) goto L_0x0150
            java.lang.String r0 = r0.b()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            defpackage.blz.a((java.lang.String) r0)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
        L_0x0150:
            long r2 = r7.a     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r6 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r6)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r0.putLong(r2)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            byte[] r0 = r0.array()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            long r2 = r13.c     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r3 = 0
            r9[r3] = r2     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r2 = 1
            r9[r2] = r0     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.String r2 = r12.b()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r3 = 2
            r9[r3] = r2     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r2 = 4
            r9[r2] = r0     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r0 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r9[r0] = r2     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r0 = 6
            long r2 = r7.a     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r9[r0] = r2     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r0 = 7
            int r2 = r10.e()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r9[r0] = r2     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.Object r2 = r1.a     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            monitor-enter(r2)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r1.d = r9     // Catch:{ all -> 0x019d }
            long r5 = r7.a     // Catch:{ all -> 0x019d }
            r1.c = r5     // Catch:{ all -> 0x019d }
            r1.b = r4     // Catch:{ all -> 0x019d }
            monitor-exit(r2)     // Catch:{ all -> 0x019d }
            goto L_0x01b4
        L_0x019d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x019d }
            throw r0     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
        L_0x01a0:
            hem r0 = defpackage.hem.a()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r3 = 12
            r0.a(r2, r3, r11)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r1.a((defpackage.bkp) r7, (android.net.Uri) r4, (java.lang.Object[]) r9)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            goto L_0x01b4
        L_0x01ad:
            r1.a((defpackage.bkp) r7, (android.net.Uri) r4, (java.lang.Object[]) r9)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            goto L_0x01b4
        L_0x01b1:
            r1.a((defpackage.bkp) r7, (android.net.Uri) r4, (java.lang.Object[]) r9)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
        L_0x01b4:
            defpackage.bkn.b()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            boolean r0 = defpackage.hei.b()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r2 = 8
            r9[r2] = r0     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            defpackage.bkn.b()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r0 = 9
            boolean r2 = defpackage.hei.c()     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r9[r0] = r2     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            android.database.MatrixCursor r0 = new android.database.MatrixCursor     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            java.lang.String[] r2 = defpackage.hfe.b     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r0.<init>(r2)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            r0.addRow(r9)     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
            return r0
        L_0x01dd:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x01dd }
            throw r0     // Catch:{ InvalidConfigException -> 0x01e2, IllegalArgumentException -> 0x01e0 }
        L_0x01e0:
            r0 = move-exception
            goto L_0x01e3
        L_0x01e2:
            r0 = move-exception
        L_0x01e3:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 34
            r3.<init>(r2)
            java.lang.String r2 = "Failed to load module descriptor: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "ProviderHelper"
            android.util.Log.w(r2, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hff.a(android.content.Context, jlm, android.net.Uri, boolean, boolean):android.database.Cursor");
    }
}
