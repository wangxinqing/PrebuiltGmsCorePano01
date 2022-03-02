package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zzg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zzg extends nis {
    private static final Set a = new HashSet();
    private final zsg b = zsg.a("RestoreGmsContactsOp");
    private final zvm c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String[] h;

    public zzg(zvm zvm, String str, String str2, String str3, String str4, String[] strArr) {
        super(135, "RestoreContacts");
        this.c = zvm;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = strArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r0.a() == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r1 = defpackage.zzc.a().a(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r6 = new defpackage.zsn(r13);
        r2 = defpackage.zyz.a.a(r12.e, r12.f, r12.h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r2.a() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r3 = defpackage.zzf.a(r1, r13, r6, (defpackage.aqxb) r2.b(), r12.d, r12.e, r12.f, r12.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        defpackage.zzf.a(7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r1 != null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (r3 != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        r1.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r13 = r12.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        if (r3 != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        defpackage.zzf.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        if (r3 != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        r0 = com.google.android.gms.common.api.Status.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
        r0 = com.google.android.gms.common.api.Status.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        r13.a(r0);
        r13 = a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        a.remove(r12.f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r13) {
        /*
            r12 = this;
            zza r0 = defpackage.zza.a(r13)
            java.util.Set r1 = a
            monitor-enter(r1)
            java.util.Set r2 = a     // Catch:{ all -> 0x009e }
            java.lang.String r3 = r12.f     // Catch:{ all -> 0x009e }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x009e }
            r3 = 0
            if (r2 == 0) goto L_0x0026
            r13 = 1
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x009e }
            java.lang.String r2 = r12.g     // Catch:{ all -> 0x009e }
            r13[r3] = r2     // Catch:{ all -> 0x009e }
            r13 = 6
            defpackage.zzf.a(r13, r0)     // Catch:{ all -> 0x009e }
            zvm r13 = r12.c     // Catch:{ all -> 0x009e }
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.e     // Catch:{ all -> 0x009e }
            r13.a(r0)     // Catch:{ all -> 0x009e }
            monitor-exit(r1)     // Catch:{ all -> 0x009e }
            return
        L_0x0026:
            java.util.Set r2 = a     // Catch:{ all -> 0x009e }
            java.lang.String r4 = r12.f     // Catch:{ all -> 0x009e }
            r2.add(r4)     // Catch:{ all -> 0x009e }
            monitor-exit(r1)     // Catch:{ all -> 0x009e }
            boolean r1 = r0.a()
            if (r1 == 0) goto L_0x003d
            zzc r1 = defpackage.zzc.a()
            zzb r1 = r1.a(r13)
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            zsn r6 = new zsn
            r6.<init>(r13)
            zyz r2 = defpackage.zyz.a
            java.lang.String r4 = r12.e
            java.lang.String r5 = r12.f
            java.lang.String[] r7 = r12.h
            amri r2 = r2.a(r4, r5, r7)
            boolean r4 = r2.a()
            if (r4 == 0) goto L_0x006b
            java.lang.Object r2 = r2.b()
            r7 = r2
            aqxb r7 = (defpackage.aqxb) r7
            java.lang.String r8 = r12.d
            java.lang.String r9 = r12.e
            java.lang.String r10 = r12.f
            zsg r11 = r12.b
            r4 = r1
            r5 = r13
            boolean r3 = defpackage.zzf.a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x006f
        L_0x006b:
            r13 = 7
            defpackage.zzf.a(r13, r0)
        L_0x006f:
            if (r1 != 0) goto L_0x0072
            goto L_0x007b
        L_0x0072:
            if (r3 != 0) goto L_0x0078
            r1.b()
            goto L_0x007b
        L_0x0078:
            r1.a()
        L_0x007b:
            zvm r13 = r12.c
            if (r3 != 0) goto L_0x0081
            r1 = 4
            goto L_0x0082
        L_0x0081:
            r1 = 3
        L_0x0082:
            defpackage.zzf.a(r1, r0)
            if (r3 != 0) goto L_0x008a
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            goto L_0x008c
        L_0x008a:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
        L_0x008c:
            r13.a(r0)
            java.util.Set r13 = a
            monitor-enter(r13)
            java.util.Set r0 = a     // Catch:{ all -> 0x009b }
            java.lang.String r1 = r12.f     // Catch:{ all -> 0x009b }
            r0.remove(r1)     // Catch:{ all -> 0x009b }
            monitor-exit(r13)     // Catch:{ all -> 0x009b }
            return
        L_0x009b:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x009b }
            throw r0
        L_0x009e:
            r13 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009e }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzg.a(android.content.Context):void");
    }

    public final void a(Status status) {
        this.c.a(status);
    }
}
