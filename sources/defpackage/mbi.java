package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.io.File;
import java.security.GeneralSecurityException;

/* renamed from: mbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mbi {
    public static final maq a = new maq();
    public final Context b;
    public final mbe c;
    public final mad d;
    private final man e;
    private final lyp f;

    public mbi(Context context, mbe mbe, man man, lyp lyp, mad mad) {
        this.b = context;
        this.c = mbe;
        this.e = man;
        this.f = lyp;
        this.d = mad;
    }

    private final boolean a(File file) {
        try {
            return this.e.a(file);
        } catch (GeneralSecurityException e2) {
            String absolutePath = file.getAbsolutePath();
            StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 37);
            sb.append("APK at ");
            sb.append(absolutePath);
            sb.append(" failed signature verification");
            Log.e("DG", sb.toString(), e2);
            lyp lyp = this.f;
            if (lyp == null) {
                return false;
            }
            lyp.a((Throwable) e2);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
        throw new defpackage.mbf(r8, "Couldn't load VM class", r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4 A[Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4, mah -> 0x0097, ClassNotFoundException -> 0x00a4, all -> 0x00a2 }, ExcHandler: ClassNotFoundException (r7v2 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:2:0x0003] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class a(defpackage.mbh r7, byte[] r8) {
        /*
            r6 = this;
            maq r0 = a
            monitor-enter(r0)
            maq r1 = a     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.lang.Object r1 = r1.a(r7)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            if (r1 != 0) goto L_0x008b
            mbe r1 = r6.c     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            mbg r1 = r1.a((defpackage.mbh) r7)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            if (r1 == 0) goto L_0x0063
            java.io.File r2 = r1.a     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            boolean r2 = r6.a(r2)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            if (r2 == 0) goto L_0x0054
            mad r2 = r6.d     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            r3 = 7
            maf r4 = defpackage.maf.FINE     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            r2.a(r3, r4)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            dalvik.system.DexClassLoader r2 = new dalvik.system.DexClassLoader     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.io.File r3 = r1.a     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.io.File r1 = r1.b     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            r4 = 0
            android.content.Context r5 = r6.b     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            r2.<init>(r3, r1, r4, r5)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            mad r1 = r6.d     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            r3 = 8
            maf r4 = defpackage.maf.FINE     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            r1.a(r3, r4)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.lang.String r1 = "com.google.ccc.abuse.droidguard.DroidGuard"
            java.lang.Class r1 = r2.loadClass(r1)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            maq r2 = a     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.util.Map r2 = r2.a     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            r2.put(r7, r1)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            goto L_0x00a0
        L_0x0054:
            java.io.File r7 = r1.a()     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            defpackage.lzv.a(r7)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.lang.ClassNotFoundException r7 = new java.lang.ClassNotFoundException     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.lang.String r1 = "APK signature verification failed"
            r7.<init>(r1)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            throw r7     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
        L_0x0063:
            mbf r1 = new mbf     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.lang.String r7 = r7.a     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            int r2 = r2.length()     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            int r2 = r2 + 30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            r3.<init>(r2)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.lang.String r2 = "VM key "
            r3.append(r2)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            r3.append(r7)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.lang.String r7 = " not found in the cache"
            r3.append(r7)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            java.lang.String r7 = r3.toString()     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            r1.<init>((byte[]) r8, (java.lang.String) r7)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            throw r1     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
        L_0x008b:
            mbe r2 = r6.c     // Catch:{ mah -> 0x0097, ClassNotFoundException -> 0x00a4 }
            java.lang.String r7 = r7.a     // Catch:{ mah -> 0x0097, ClassNotFoundException -> 0x00a4 }
            mbg r7 = r2.a((java.lang.String) r7)     // Catch:{ mah -> 0x0097, ClassNotFoundException -> 0x00a4 }
            defpackage.mbe.a((defpackage.mbg) r7)     // Catch:{ mah -> 0x0097, ClassNotFoundException -> 0x00a4 }
            goto L_0x00a0
        L_0x0097:
            r7 = move-exception
            lyp r2 = r6.f     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
            if (r2 == 0) goto L_0x009f
            r2.a((java.lang.Throwable) r7)     // Catch:{ mah -> 0x00ad, ClassNotFoundException -> 0x00a4 }
        L_0x009f:
        L_0x00a0:
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            return r1
        L_0x00a2:
            r7 = move-exception
            goto L_0x00b6
        L_0x00a4:
            r7 = move-exception
            mbf r1 = new mbf     // Catch:{ all -> 0x00a2 }
            java.lang.String r2 = "Couldn't load VM class"
            r1.<init>(r8, r2, r7)     // Catch:{ all -> 0x00a2 }
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x00ad:
            r7 = move-exception
            mbf r1 = new mbf     // Catch:{ all -> 0x00a2 }
            java.lang.String r2 = "Exception in VM cache lookup"
            r1.<init>(r8, r2, r7)     // Catch:{ all -> 0x00a2 }
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x00b6:
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbi.a(mbh, byte[]):java.lang.Class");
    }

    public final mbj a(String str, mas mas, Object obj, DroidGuardResultsRequest droidGuardResultsRequest) {
        Bundle bundle;
        Class a2 = a(mas.b, mas.d);
        if (droidGuardResultsRequest != null) {
            bundle = droidGuardResultsRequest.a;
        } else {
            bundle = null;
        }
        return new mbj(a2, this.b, str, mas, obj, mas.d, bundle);
    }
}
