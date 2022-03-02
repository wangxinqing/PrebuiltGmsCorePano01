package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.UUID;

/* renamed from: ahui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahui extends ahum {
    public final ajbg a;
    public volatile ahtu b;
    public volatile boolean c = false;
    public final String d;
    public volatile ahts e;
    public ahuh f;
    public final aizx g;
    private final String m;
    private final String n;
    private final byte[] o;
    private final Context p;
    private final Object q = new Object();
    private volatile boolean r = false;
    private final int s;

    public ahui(Context context, ajbg ajbg, int i, ahuz ahuz, String str, String str2, byte[] bArr, ahss ahss, String str3, ajrh ajrh, aizx aizx) {
        super(ahss, ajrh, ahuz);
        amrl.a((Object) str3, (Object) "Session id should not be null. Please make sure you called the correct constructor.");
        i = i != 3 ? 2 : i;
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unsupported policy: ");
        sb.append(i - 1);
        amrl.a(true, (Object) sb.toString());
        this.p = context;
        this.n = str;
        this.m = str2;
        this.o = bArr;
        this.d = str3;
        this.s = i;
        this.g = aizx;
        this.a = ajbg;
    }

    public static final void a(aqek aqek, aqek aqek2, String str) {
        if (str != null) {
            aqek2.b(2, (Object) str);
        }
        aqek.b(6, (Object) aqek2);
    }

    static String b() {
        String valueOf = String.valueOf(UUID.randomUUID().toString());
        return valueOf.length() == 0 ? new String("@") : "@".concat(valueOf);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        ahuh ahuh = this.f;
        if (ahuh != null) {
            ahuh.a();
        }
    }

    public final void a(aqek aqek, ahul ahul, int i, String str) {
        ahss ahss = this.h;
        if (ahss != null) {
            String str2 = ahul.d;
            if (str2 == null) {
                str2 = "none";
            }
            ahss.a(str, i, str2);
        }
        if (this.m != null) {
            String name = Thread.currentThread().getName();
            Locale locale = Locale.ENGLISH;
            Object[] objArr = {name, Integer.valueOf(aqek.e(6).b(3)), str, this.m};
            synchronized (this.q) {
                if (this.e == null) {
                    this.e = new ahts(this.a, this.m, this.o, this.h, this.i, (ahuz) null, this.g);
                }
            }
            if (str != null) {
                this.e.a(str);
            }
            this.e.a(aqek);
            return;
        }
        int b2 = aqek.e(6).b(3);
        StringBuilder sb = new StringBuilder(63);
        sb.append("No backup data path specified, dropping data seqNum:");
        sb.append(b2);
        sb.toString();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(defpackage.aqek r5, defpackage.aqek r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.r     // Catch:{ all -> 0x006d }
            r1 = 1
            if (r0 != 0) goto L_0x0026
            r4.r = r1     // Catch:{ all -> 0x006d }
            ahtu r0 = new ahtu     // Catch:{ all -> 0x006d }
            android.content.Context r2 = r4.p     // Catch:{ all -> 0x006d }
            r0.<init>(r2)     // Catch:{ all -> 0x006d }
            r4.b = r0     // Catch:{ all -> 0x006d }
            ahug r0 = new ahug     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "RemoteScanResultWriter.workerThread"
            r0.<init>(r4, r2)     // Catch:{ all -> 0x006d }
            r0.start()     // Catch:{ all -> 0x006d }
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x006d }
            ahuh r2 = new ahuh     // Catch:{ all -> 0x006d }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x006d }
            r4.f = r2     // Catch:{ all -> 0x006d }
        L_0x0026:
            boolean r0 = r5.i(r1)     // Catch:{ all -> 0x006d }
            r2 = 3
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r4.n     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x003b
            aqek r0 = r5.e(r1)     // Catch:{ all -> 0x006d }
            java.lang.String r3 = r4.n     // Catch:{ all -> 0x006d }
            r0.b((int) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x006d }
        L_0x003b:
            int r0 = r4.s     // Catch:{ all -> 0x006d }
            if (r0 != r2) goto L_0x0065
            ahuh r0 = r4.f     // Catch:{ all -> 0x006d }
            r1 = 0
            boolean r0 = r0.a(r5, r6, r1)     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x0063
            java.lang.String r1 = r4.d     // Catch:{ all -> 0x006d }
            a(r5, r6, r1)     // Catch:{ all -> 0x006d }
            ahul r6 = new ahul     // Catch:{ all -> 0x006d }
            r1 = 0
            java.lang.String r3 = "To many data in upload queue."
            r6.<init>(r1, r3)     // Catch:{ all -> 0x006d }
            r1 = 6
            aqek r1 = r5.e(r1)     // Catch:{ all -> 0x006d }
            int r1 = r1.b((int) r2)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r4.d     // Catch:{ all -> 0x006d }
            r4.a(r5, r6, r1, r2)     // Catch:{ all -> 0x006d }
        L_0x0063:
            monitor-exit(r4)
            return r0
        L_0x0065:
            ahuh r0 = r4.f     // Catch:{ all -> 0x006d }
            boolean r5 = r0.a(r5, r6, r1)     // Catch:{ all -> 0x006d }
            monitor-exit(r4)
            return r5
        L_0x006d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahui.a(aqek, aqek):boolean");
    }
}
