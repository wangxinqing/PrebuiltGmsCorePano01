package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: ekq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ekq {
    static final long a = TimeUnit.MINUTES.toMillis(5);
    public static final fzh b = new ekn();
    private final Context c;
    private final hya d;
    private final Map e;

    public ekq(Context context) {
        hya a2 = hya.a(context);
        jiu jiu = jiu.a;
        HashMap hashMap = new HashMap();
        this.c = context;
        iva.a((Object) a2);
        this.d = a2;
        iva.a((Object) jiu);
        iva.a((Object) hashMap);
        this.e = hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[ExcHandler: NoSuchAlgorithmException (e java.security.NoSuchAlgorithmException), Splitter:B:3:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.eko b(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 2
            if (r1 >= r2) goto L_0x009c
            android.content.Context r2 = r12.c     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            jnh r2 = defpackage.jni.b(r2)     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            r3 = 64
            android.content.pm.PackageInfo r2 = r2.b(r13, r3)     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            if (r2 == 0) goto L_0x0086
            android.content.pm.Signature[] r3 = r2.signatures     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            if (r3 == 0) goto L_0x0086
            android.content.pm.Signature[] r3 = r2.signatures     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            int r3 = r3.length     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            if (r3 == 0) goto L_0x0086
            android.content.pm.Signature[] r3 = r2.signatures     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            r3 = r3[r0]     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            if (r3 == 0) goto L_0x0086
            android.content.pm.Signature[] r3 = r2.signatures     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            r3 = r3[r0]     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            byte[] r3 = r3.toByteArray()     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            java.lang.String r4 = "SHA1"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            byte[] r3 = r4.digest(r3)     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            anml r4 = defpackage.anml.g     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            anml r4 = r4.b()     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            java.lang.String r7 = r4.a((byte[]) r3)     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            eko r3 = new eko     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            hya r4 = r12.d     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            boolean r8 = r4.a((android.content.pm.PackageInfo) r2)     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            android.content.pm.ApplicationInfo r4 = r2.applicationInfo     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            int r4 = r4.uid     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            android.content.Context r5 = r12.c     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            jnh r5 = defpackage.jni.b(r5)     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            java.lang.String[] r4 = r5.a((int) r4)     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            if (r4 == 0) goto L_0x007e
            int r5 = r4.length     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            r6 = 0
        L_0x0058:
            r9 = 1
            if (r6 >= r5) goto L_0x0075
            r10 = r4[r6]     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            android.content.Context r11 = r12.c     // Catch:{ NameNotFoundException -> 0x0071, NoSuchAlgorithmException -> 0x008e }
            jnh r11 = defpackage.jni.b(r11)     // Catch:{ NameNotFoundException -> 0x0071, NoSuchAlgorithmException -> 0x008e }
            android.content.pm.PackageInfo r10 = r11.b(r10, r0)     // Catch:{ NameNotFoundException -> 0x0071, NoSuchAlgorithmException -> 0x008e }
            if (r10 == 0) goto L_0x0072
            android.content.pm.ApplicationInfo r10 = r10.applicationInfo     // Catch:{ NameNotFoundException -> 0x0071, NoSuchAlgorithmException -> 0x008e }
            int r10 = r10.flags     // Catch:{ NameNotFoundException -> 0x0071, NoSuchAlgorithmException -> 0x008e }
            r10 = r10 & r9
            if (r10 != 0) goto L_0x0076
            goto L_0x0072
        L_0x0071:
            r9 = move-exception
        L_0x0072:
            int r6 = r6 + 1
            goto L_0x0058
        L_0x0075:
            r9 = 0
        L_0x0076:
            long r10 = r2.firstInstallTime     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            r5 = r3
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            return r3
        L_0x007e:
            ekp r2 = new ekp     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            java.lang.String r3 = "Unable to get packages for the uid."
            r2.<init>(r3)     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            throw r2     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
        L_0x0086:
            ekp r2 = new ekp     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            java.lang.String r3 = "Invalid package signature."
            r2.<init>(r3)     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
            throw r2     // Catch:{ NameNotFoundException -> 0x0093, NoSuchAlgorithmException -> 0x008e }
        L_0x008e:
            r2 = move-exception
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0093:
            r13 = move-exception
            ekp r13 = new ekp
            java.lang.String r0 = "Invalid package name."
            r13.<init>(r0)
            throw r13
        L_0x009c:
            ekp r13 = new ekp
            java.lang.String r0 = "Unable to compute package signature."
            r13.<init>(r0)
            goto L_0x00a5
        L_0x00a4:
            throw r13
        L_0x00a5:
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekq.b(java.lang.String):eko");
    }

    public final eko a(String str) {
        synchronized (this.e) {
            oq oqVar = (oq) this.e.get(str);
            if (oqVar == null || ((Long) oqVar.b).longValue() <= SystemClock.elapsedRealtime() - a) {
                eko b2 = b(str);
                this.e.put(str, oq.a(b2, Long.valueOf(SystemClock.elapsedRealtime())));
                return b2;
            }
            eko eko = (eko) oqVar.a;
            return eko;
        }
    }
}
