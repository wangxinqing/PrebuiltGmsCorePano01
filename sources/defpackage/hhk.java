package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.io.File;
import java.util.List;

/* renamed from: hhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hhk extends hfd {
    private static ConnectivityManager d = null;
    private static volatile hhk e = null;
    private final Context a;
    private final cqm b;
    private final hhc c;
    private final cpz f;

    public hhk(Context context, cpz cpz, cqm cqm, hhc hhc) {
        this.a = context;
        this.f = cpz;
        this.b = cqm;
        this.c = hhc;
    }

    public static hhk a(Context context) {
        hhk hhk = e;
        if (hhk == null) {
            synchronized (hhk.class) {
                hhk = e;
                if (hhk == null) {
                    hfc hfc = new hfc(blu.a(context).a);
                    hhc b2 = hhc.b((Context) hfc);
                    hhj hhj = new hhj(awxo.a.a().O(), hem.a());
                    hhk hhk2 = new hhk(hfc, new cpz(cqh.a(hfc, b2, hhj)), cqh.a(hfc, b2, hhj), b2);
                    e = hhk2;
                    hhk = hhk2;
                }
            }
        }
        return hhk;
    }

    public static boolean b(Context context) {
        if (d == null) {
            synchronized (hhk.class) {
                if (d == null) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    d = connectivityManager;
                    if (connectivityManager == null) {
                        Log.e("ZappDownloader", "Failed to get connectivity manager");
                        return false;
                    }
                }
            }
        }
        return ml.a(d);
    }

    public final synchronized void b() {
        hhc hhc = this.c;
        List<hhe> a2 = hhc.e.a();
        long y = awxo.a.a().y();
        for (hhe hhe : a2) {
            if (hhe.e == 2 && ((long) hhe.g) < y && !hhc.a.contains(Long.valueOf(hhe.b)) && hhc.e.b(hhe.b)) {
                hhc.a(hhe.b, hhe.c, hhe.d, hhe.f);
            }
        }
    }

    private final boolean a(String str, String str2) {
        File file;
        cpz cpz = this.f;
        try {
            Bundle b2 = cpz.b(str, str2);
            b2.putBoolean("ingest", true);
            String string = cpz.a.a(b2).getString("file_path");
            if (string != null) {
                file = new File(string);
            } else {
                cpz.c(str, str2);
                file = null;
            }
            if (file == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
                sb.append("Zapp ingestion failed for module ");
                sb.append(str);
                sb.append(":");
                sb.append(str2);
                Log.e("ZappDownloader", sb.toString());
                return false;
            } else if (!hfz.a(this.a).a(str, str2, file)) {
                return false;
            } else {
                this.f.c(str, str2);
                return true;
            }
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        if (r6 != 5) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(defpackage.anax r25) {
        /*
            r24 = this;
            r1 = r24
            monitor-enter(r24)
            android.content.Context r0 = r1.a     // Catch:{ all -> 0x01dd }
            hfz r0 = defpackage.hfz.a((android.content.Context) r0)     // Catch:{ all -> 0x01dd }
            r2 = r25
            java.util.Collection r0 = r0.a((defpackage.anax) r2)     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x01da
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x01dd }
            int r5 = r0.size()     // Catch:{ all -> 0x01dd }
            r4.<init>(r5)     // Catch:{ all -> 0x01dd }
            awxo r5 = defpackage.awxo.a     // Catch:{ all -> 0x01dd }
            awxv r5 = r5.a()     // Catch:{ all -> 0x01dd }
            boolean r5 = r5.g()     // Catch:{ all -> 0x01dd }
            if (r5 == 0) goto L_0x003f
            android.content.Context r7 = r1.a     // Catch:{ all -> 0x01dd }
            boolean r7 = b(r7)     // Catch:{ all -> 0x01dd }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dd }
            r9 = 32
            r8.<init>(r9)     // Catch:{ all -> 0x01dd }
            java.lang.String r9 = "active network is metered: "
            r8.append(r9)     // Catch:{ all -> 0x01dd }
            r8.append(r7)     // Catch:{ all -> 0x01dd }
            r8.toString()     // Catch:{ all -> 0x01dd }
            goto L_0x0040
        L_0x003f:
            r7 = 0
        L_0x0040:
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x01dd }
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0047:
            boolean r13 = r8.hasNext()     // Catch:{ all -> 0x01dd }
            if (r13 == 0) goto L_0x0115
            java.lang.Object r13 = r8.next()     // Catch:{ all -> 0x01dd }
            hfy r13 = (defpackage.hfy) r13     // Catch:{ all -> 0x01dd }
            cpz r14 = r1.f     // Catch:{ all -> 0x01dd }
            java.lang.String r15 = r13.a     // Catch:{ all -> 0x01dd }
            java.lang.String r6 = r13.b     // Catch:{ all -> 0x01dd }
            int r6 = r14.a(r15, r6)     // Catch:{ all -> 0x01dd }
            awxo r14 = defpackage.awxo.a     // Catch:{ all -> 0x01dd }
            awxv r14 = r14.a()     // Catch:{ all -> 0x01dd }
            boolean r14 = r14.o()     // Catch:{ all -> 0x01dd }
            r15 = 6
            if (r14 != 0) goto L_0x0074
            if (r6 != r15) goto L_0x0086
            java.lang.String r6 = r13.a     // Catch:{ all -> 0x01dd }
            java.lang.String r13 = r13.b     // Catch:{ all -> 0x01dd }
            r1.a((java.lang.String) r6, (java.lang.String) r13)     // Catch:{ all -> 0x01dd }
            goto L_0x0047
        L_0x0074:
            if (r6 != r15) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            r14 = 5
            if (r6 == r14) goto L_0x007b
        L_0x007a:
            goto L_0x0086
        L_0x007b:
            java.lang.String r6 = r13.a     // Catch:{ all -> 0x01dd }
            java.lang.String r14 = r13.b     // Catch:{ all -> 0x01dd }
            boolean r6 = r1.a((java.lang.String) r6, (java.lang.String) r14)     // Catch:{ all -> 0x01dd }
            if (r6 != 0) goto L_0x0047
            goto L_0x007a
        L_0x0086:
            if (r5 != 0) goto L_0x008b
            r21 = 1
            goto L_0x00a8
        L_0x008b:
            if (r7 != 0) goto L_0x008e
            goto L_0x00a4
        L_0x008e:
            boolean r6 = r13.c     // Catch:{ all -> 0x01dd }
            if (r6 != 0) goto L_0x00a4
            hem r6 = defpackage.hem.a()     // Catch:{ all -> 0x01dd }
            android.content.Context r10 = r1.a     // Catch:{ all -> 0x01dd }
            r12 = 78
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x01dd }
            r6.a(r10, r12, r13)     // Catch:{ all -> 0x01dd }
            r10 = 1
            r12 = 1
            goto L_0x0047
        L_0x00a4:
            boolean r6 = r13.c     // Catch:{ all -> 0x01dd }
            r21 = r6
        L_0x00a8:
            java.lang.String r6 = r13.d     // Catch:{ all -> 0x01dd }
            java.lang.String r10 = r13.e     // Catch:{ all -> 0x01dd }
            r14 = 2131954386(0x7f130ad2, float:1.954527E38)
            r15 = 2131954387(0x7f130ad3, float:1.9545272E38)
            if (r6 != 0) goto L_0x00b5
            goto L_0x00ee
        L_0x00b5:
            if (r10 == 0) goto L_0x00ee
            java.lang.String r3 = r13.a     // Catch:{ all -> 0x01dd }
            java.lang.String r13 = r13.b     // Catch:{ all -> 0x01dd }
            android.content.Context r9 = r1.a     // Catch:{ all -> 0x01dd }
            java.lang.String r19 = r9.getString(r15)     // Catch:{ all -> 0x01dd }
            android.content.Context r9 = r1.a     // Catch:{ all -> 0x01dd }
            java.lang.String r20 = r9.getString(r14)     // Catch:{ all -> 0x01dd }
            java.lang.String r9 = "Patch being requested "
            int r14 = r10.length()     // Catch:{ all -> 0x01dd }
            if (r14 != 0) goto L_0x00d5
            java.lang.String r14 = new java.lang.String     // Catch:{ all -> 0x01dd }
            r14.<init>(r9)     // Catch:{ all -> 0x01dd }
            goto L_0x00d9
        L_0x00d5:
            java.lang.String r14 = r9.concat(r10)     // Catch:{ all -> 0x01dd }
        L_0x00d9:
            java.lang.String r9 = "DynamicModuleDownloader"
            android.util.Log.i(r9, r14)     // Catch:{ all -> 0x01dd }
            cpy r9 = new cpy     // Catch:{ all -> 0x01dd }
            r16 = r9
            r17 = r3
            r18 = r13
            r22 = r6
            r23 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x01dd }
            goto L_0x010d
        L_0x00ee:
            java.lang.String r3 = r13.a     // Catch:{ all -> 0x01dd }
            java.lang.String r6 = r13.b     // Catch:{ all -> 0x01dd }
            android.content.Context r9 = r1.a     // Catch:{ all -> 0x01dd }
            java.lang.String r19 = r9.getString(r15)     // Catch:{ all -> 0x01dd }
            android.content.Context r9 = r1.a     // Catch:{ all -> 0x01dd }
            java.lang.String r20 = r9.getString(r14)     // Catch:{ all -> 0x01dd }
            cpy r9 = new cpy     // Catch:{ all -> 0x01dd }
            r22 = 0
            r23 = 0
            r16 = r9
            r17 = r3
            r18 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x01dd }
        L_0x010d:
            r4.add(r9)     // Catch:{ all -> 0x01dd }
            int r11 = r11 + 1
            r10 = 1
            goto L_0x0047
        L_0x0115:
            if (r10 != 0) goto L_0x0122
            boolean r0 = r25.isEmpty()     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x01d2
            r24.a()     // Catch:{ all -> 0x01dd }
            goto L_0x01d2
        L_0x0122:
            if (r11 == 0) goto L_0x01d2
            cpz r3 = r1.f     // Catch:{ all -> 0x01dd }
            boolean r2 = r25.isEmpty()     // Catch:{ all -> 0x01dd }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x01dd }
            r5.<init>()     // Catch:{ all -> 0x01dd }
            int r6 = r4.size()     // Catch:{ all -> 0x01dd }
            r7 = 0
        L_0x0134:
            if (r7 >= r6) goto L_0x0189
            java.lang.Object r8 = r4.get(r7)     // Catch:{ all -> 0x01dd }
            cpy r8 = (defpackage.cpy) r8     // Catch:{ all -> 0x01dd }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x01dd }
            r9.<init>()     // Catch:{ all -> 0x01dd }
            java.lang.String r10 = "name"
            java.lang.String r11 = r8.a     // Catch:{ all -> 0x01dd }
            r9.putString(r10, r11)     // Catch:{ all -> 0x01dd }
            java.lang.String r10 = r8.b     // Catch:{ all -> 0x01dd }
            if (r10 != 0) goto L_0x014d
            goto L_0x0152
        L_0x014d:
            java.lang.String r11 = "version_code"
            r9.putString(r11, r10)     // Catch:{ all -> 0x01dd }
        L_0x0152:
            java.lang.String r10 = r8.c     // Catch:{ all -> 0x01dd }
            if (r10 != 0) goto L_0x0157
            goto L_0x015c
        L_0x0157:
            java.lang.String r11 = "notification_title"
            r9.putString(r11, r10)     // Catch:{ all -> 0x01dd }
        L_0x015c:
            java.lang.String r10 = r8.d     // Catch:{ all -> 0x01dd }
            if (r10 == 0) goto L_0x0165
            java.lang.String r11 = "notification_description"
            r9.putString(r11, r10)     // Catch:{ all -> 0x01dd }
        L_0x0165:
            boolean r10 = r8.e     // Catch:{ all -> 0x01dd }
            if (r10 != 0) goto L_0x016a
            goto L_0x0170
        L_0x016a:
            java.lang.String r10 = "metered"
            r11 = 1
            r9.putBoolean(r10, r11)     // Catch:{ all -> 0x01dd }
        L_0x0170:
            java.lang.String r10 = r8.f     // Catch:{ all -> 0x01dd }
            if (r10 != 0) goto L_0x0175
            goto L_0x017a
        L_0x0175:
            java.lang.String r11 = "existing_version_code"
            r9.putString(r11, r10)     // Catch:{ all -> 0x01dd }
        L_0x017a:
            java.lang.String r8 = r8.g     // Catch:{ all -> 0x01dd }
            if (r8 == 0) goto L_0x0183
            java.lang.String r10 = "patch_module_base_external_path"
            r9.putString(r10, r8)     // Catch:{ all -> 0x01dd }
        L_0x0183:
            r5.add(r9)     // Catch:{ all -> 0x01dd }
            int r7 = r7 + 1
            goto L_0x0134
        L_0x0189:
            cqm r3 = r3.a     // Catch:{ RemoteException -> 0x01cb }
            android.os.Bundle r2 = r3.a(r5, r2)     // Catch:{ RemoteException -> 0x01cb }
            java.lang.String r3 = "download_successful"
            boolean r2 = r2.getBoolean(r3)     // Catch:{ RemoteException -> 0x01cb }
            if (r2 != 0) goto L_0x01d2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dd }
            r2.<init>()     // Catch:{ all -> 0x01dd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01dd }
        L_0x01a0:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x01dd }
            if (r3 == 0) goto L_0x01b9
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x01dd }
            hfy r3 = (defpackage.hfy) r3     // Catch:{ all -> 0x01dd }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01dd }
            r2.append(r3)     // Catch:{ all -> 0x01dd }
            java.lang.String r3 = ","
            r2.append(r3)     // Catch:{ all -> 0x01dd }
            goto L_0x01a0
        L_0x01b9:
            hem r0 = defpackage.hem.a()     // Catch:{ all -> 0x01dd }
            android.content.Context r3 = r1.a     // Catch:{ all -> 0x01dd }
            r4 = 31
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01dd }
            r0.a(r3, r4, r2)     // Catch:{ all -> 0x01dd }
            monitor-exit(r24)
            r0 = 2
            return r0
        L_0x01cb:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x01dd }
            r2.<init>(r0)     // Catch:{ all -> 0x01dd }
            throw r2     // Catch:{ all -> 0x01dd }
        L_0x01d2:
            if (r12 == 0) goto L_0x01d7
            r0 = 3
            monitor-exit(r24)
            return r0
        L_0x01d7:
            monitor-exit(r24)
            r0 = 1
            return r0
        L_0x01da:
            monitor-exit(r24)
            r0 = 2
            return r0
        L_0x01dd:
            r0 = move-exception
            monitor-exit(r24)
            goto L_0x01e1
        L_0x01e0:
            throw r0
        L_0x01e1:
            goto L_0x01e0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhk.a(anax):int");
    }

    public final synchronized void a() {
        try {
            cqm cqm = this.f.a;
            new Bundle();
            cqm.c();
            hhc hhc = this.c;
            hhc.a.clear();
            hhc.e.b();
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015b, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(long r9, defpackage.aucd r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            cqm r0 = r8.b     // Catch:{ RemoteException -> 0x015e }
            android.os.Bundle r9 = r0.a((long) r9)     // Catch:{ RemoteException -> 0x015e }
            java.lang.String r10 = "com.google.android.finsky.zapp.MODULE_NAME"
            java.lang.String r10 = r9.getString(r10)     // Catch:{ all -> 0x015c }
            java.lang.String r0 = "com.google.android.finsky.zapp.MODULE_VERSION"
            java.lang.String r9 = r9.getString(r0)     // Catch:{ all -> 0x015c }
            if (r10 == 0) goto L_0x015a
            if (r9 == 0) goto L_0x015a
            boolean r0 = r11.c     // Catch:{ all -> 0x015c }
            r1 = 0
            if (r0 != 0) goto L_0x001d
            goto L_0x0022
        L_0x001d:
            r11.c()     // Catch:{ all -> 0x015c }
            r11.c = r1     // Catch:{ all -> 0x015c }
        L_0x0022:
            aucj r0 = r11.b     // Catch:{ all -> 0x015c }
            aogn r0 = (defpackage.aogn) r0     // Catch:{ all -> 0x015c }
            aogn r2 = defpackage.aogn.k     // Catch:{ all -> 0x015c }
            r10.getClass()     // Catch:{ all -> 0x015c }
            int r2 = r0.a     // Catch:{ all -> 0x015c }
            r3 = 1
            r2 = r2 | r3
            r0.a = r2     // Catch:{ all -> 0x015c }
            r0.b = r10     // Catch:{ all -> 0x015c }
            r9.getClass()     // Catch:{ all -> 0x015c }
            r2 = r2 | 2
            r0.a = r2     // Catch:{ all -> 0x015c }
            r0.c = r9     // Catch:{ all -> 0x015c }
            defpackage.hem.a()     // Catch:{ all -> 0x015c }
            android.content.Context r0 = r8.a     // Catch:{ all -> 0x015c }
            aucj r11 = r11.i()     // Catch:{ all -> 0x015c }
            aogn r11 = (defpackage.aogn) r11     // Catch:{ all -> 0x015c }
            aohl r2 = defpackage.aohl.u     // Catch:{ all -> 0x015c }
            aucd r2 = r2.o()     // Catch:{ all -> 0x015c }
            boolean r4 = r2.c     // Catch:{ all -> 0x015c }
            if (r4 != 0) goto L_0x0052
            goto L_0x0057
        L_0x0052:
            r2.c()     // Catch:{ all -> 0x015c }
            r2.c = r1     // Catch:{ all -> 0x015c }
        L_0x0057:
            aucj r4 = r2.b     // Catch:{ all -> 0x015c }
            aohl r4 = (defpackage.aohl) r4     // Catch:{ all -> 0x015c }
            r11.getClass()     // Catch:{ all -> 0x015c }
            r4.s = r11     // Catch:{ all -> 0x015c }
            int r11 = r4.a     // Catch:{ all -> 0x015c }
            r11 = r11 | 1024(0x400, float:1.435E-42)
            r4.a = r11     // Catch:{ all -> 0x015c }
            r11 = 23
            aucj r2 = r2.i()     // Catch:{ all -> 0x015c }
            aohl r2 = (defpackage.aohl) r2     // Catch:{ all -> 0x015c }
            byte[] r2 = r2.k()     // Catch:{ all -> 0x015c }
            com.google.android.gms.chimera.container.FileApkIntentOperation.a((android.content.Context) r0, (int) r11, (byte[]) r2)     // Catch:{ all -> 0x015c }
            cpz r11 = r8.f     // Catch:{ all -> 0x015c }
            int r11 = r11.a(r10, r9)     // Catch:{ all -> 0x015c }
            int r0 = r10.length()     // Catch:{ all -> 0x015c }
            int r2 = r9.length()     // Catch:{ all -> 0x015c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            int r0 = r0 + 27
            int r0 = r0 + r2
            r4.<init>(r0)     // Catch:{ all -> 0x015c }
            java.lang.String r0 = "Module "
            r4.append(r0)     // Catch:{ all -> 0x015c }
            r4.append(r10)     // Catch:{ all -> 0x015c }
            java.lang.String r0 = ":"
            r4.append(r0)     // Catch:{ all -> 0x015c }
            r4.append(r9)     // Catch:{ all -> 0x015c }
            java.lang.String r0 = " status "
            r4.append(r0)     // Catch:{ all -> 0x015c }
            r4.append(r11)     // Catch:{ all -> 0x015c }
            r4.toString()     // Catch:{ all -> 0x015c }
            r0 = 6
            if (r11 != r0) goto L_0x014e
            boolean r9 = r8.a((java.lang.String) r10, (java.lang.String) r9)     // Catch:{ all -> 0x015c }
            if (r9 == 0) goto L_0x014e
            android.content.Context r9 = r8.a     // Catch:{ all -> 0x015c }
            hgr r9 = defpackage.hgr.a(r9)     // Catch:{ all -> 0x015c }
            boolean r10 = defpackage.awxo.b()     // Catch:{ all -> 0x015c }
            if (r10 != 0) goto L_0x00c1
            boolean r10 = defpackage.awxo.i()     // Catch:{ all -> 0x015c }
            if (r10 == 0) goto L_0x0143
        L_0x00c1:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x015c }
            r10.<init>()     // Catch:{ all -> 0x015c }
            boolean r11 = r9.e     // Catch:{ all -> 0x015c }
            if (r11 == 0) goto L_0x0118
            android.os.UserManager r11 = r9.f     // Catch:{ all -> 0x015c }
            if (r11 == 0) goto L_0x0118
            monitor-enter(r9)     // Catch:{ all -> 0x015c }
            hgv r11 = r9.d()     // Catch:{ all -> 0x0115 }
            audr r11 = r11.a     // Catch:{ all -> 0x0115 }
            java.util.Map r11 = java.util.Collections.unmodifiableMap(r11)     // Catch:{ all -> 0x0115 }
            java.util.Set r11 = r11.entrySet()     // Catch:{ all -> 0x0115 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0115 }
        L_0x00e1:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x0115 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0115 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x0115 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0115 }
            long r4 = r2.longValue()     // Catch:{ all -> 0x0115 }
            long r6 = r9.g     // Catch:{ all -> 0x0115 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x00e1
            android.os.UserManager r2 = r9.f     // Catch:{ all -> 0x0115 }
            java.lang.Object r0 = r0.getKey()     // Catch:{ all -> 0x0115 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0115 }
            long r4 = r0.longValue()     // Catch:{ all -> 0x0115 }
            android.os.UserHandle r0 = r2.getUserForSerialNumber(r4)     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x00e1
            r10.add(r0)     // Catch:{ all -> 0x0115 }
            goto L_0x00e1
        L_0x0113:
            monitor-exit(r9)     // Catch:{ all -> 0x0115 }
            goto L_0x0118
        L_0x0115:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0115 }
            throw r10     // Catch:{ all -> 0x015c }
        L_0x0118:
            boolean r11 = r10.isEmpty()     // Catch:{ all -> 0x015c }
            if (r11 != 0) goto L_0x0143
            android.content.Intent r11 = new android.content.Intent     // Catch:{ all -> 0x015c }
            java.lang.String r0 = "com.google.android.gms.chimera.container.ACTION_SECONDARY_USER_RECHECK"
            r11.<init>(r0)     // Catch:{ all -> 0x015c }
            android.content.Context r0 = r9.a     // Catch:{ all -> 0x015c }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x015c }
            android.content.Intent r11 = r11.setPackage(r0)     // Catch:{ all -> 0x015c }
            int r0 = r10.size()     // Catch:{ all -> 0x015c }
        L_0x0133:
            if (r1 >= r0) goto L_0x0143
            java.lang.Object r2 = r10.get(r1)     // Catch:{ all -> 0x015c }
            android.os.UserHandle r2 = (android.os.UserHandle) r2     // Catch:{ all -> 0x015c }
            android.content.Context r4 = r9.a     // Catch:{ all -> 0x015c }
            r4.sendBroadcastAsUser(r11, r2)     // Catch:{ all -> 0x015c }
            int r1 = r1 + 1
            goto L_0x0133
        L_0x0143:
            android.content.Context r9 = r8.a     // Catch:{ all -> 0x015c }
            hfz r9 = defpackage.hfz.a((android.content.Context) r9)     // Catch:{ all -> 0x015c }
            r9.f()     // Catch:{ all -> 0x015c }
            r1 = 1
            goto L_0x014f
        L_0x014e:
        L_0x014f:
            android.content.Context r9 = r8.a     // Catch:{ all -> 0x015c }
            hek r9 = defpackage.hek.a((android.content.Context) r9)     // Catch:{ all -> 0x015c }
            r9.a((boolean) r1)     // Catch:{ all -> 0x015c }
            monitor-exit(r8)
            return
        L_0x015a:
            monitor-exit(r8)
            return
        L_0x015c:
            r9 = move-exception
            goto L_0x0185
        L_0x015e:
            r9 = move-exception
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x015c }
            java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x015c }
            int r10 = r10.length()     // Catch:{ all -> 0x015c }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            int r10 = r10 + 28
            r11.<init>(r10)     // Catch:{ all -> 0x015c }
            java.lang.String r10 = "onDownloadComplete failure: "
            r11.append(r10)     // Catch:{ all -> 0x015c }
            r11.append(r9)     // Catch:{ all -> 0x015c }
            java.lang.String r9 = "ZappDownloader"
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x015c }
            android.util.Log.e(r9, r10)     // Catch:{ all -> 0x015c }
            monitor-exit(r8)
            return
        L_0x0185:
            monitor-exit(r8)
            goto L_0x0188
        L_0x0187:
            throw r9
        L_0x0188:
            goto L_0x0187
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhk.a(long, aucd):void");
    }
}
