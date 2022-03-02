package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: nuk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nuk {
    public final SparseArray a;
    private final SparseIntArray b;
    private final Context c;
    private final qwq d;
    private final nsb e;
    private final jiq f;

    public nuk(Context context, qwq qwq, nsb nsb, jiq jiq) {
        this.c = context;
        this.d = qwq;
        this.e = nsb;
        this.f = jiq;
        qxi qxi = new qxi();
        qxi.k = "PersistConnectionInfos";
        qxi.i = "com.google.android.gms.gcm.HeartbeatAlarm$ConnectionInfoPersistService";
        qxi.a = 21600;
        qxi.b = 3600;
        this.d.a((qxx) qxi.b());
        SparseIntArray sparseIntArray = new SparseIntArray(r10);
        for (String split : axlf.a.a().g().split(";")) {
            String[] split2 = split.split("=");
            if (split2.length == 2) {
                try {
                    sparseIntArray.put(Integer.parseInt(split2[0]), Integer.parseInt(split2[1]));
                } catch (NumberFormatException e2) {
                    String str = split2[0];
                    String str2 = split2[1];
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
                    sb.append("Failed to parse key-value pair: ");
                    sb.append(str);
                    sb.append(", ");
                    sb.append(str2);
                    Log.e("GCM", sb.toString());
                }
            }
        }
        this.b = sparseIntArray;
        this.a = new SparseArray();
        b();
        for (int i = 0; i < this.a.size(); i++) {
            nun nun = (nun) this.a.valueAt(i);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                ou ouVar = nun.a;
                if (i2 >= ouVar.h) {
                    break;
                }
                nul nul = (nul) ouVar.c(i2);
                if (nul.b() > 0 && System.currentTimeMillis() - nul.b() > nun.b) {
                    arrayList.add((String) nun.a.b(i2));
                }
                i2++;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                nun.a.remove((String) arrayList.get(i3));
            }
        }
    }

    private final synchronized void b() {
        int i;
        File file = new File(nrq.c(this.c).getFilesDir(), "gcm_connection_infos");
        if (file.exists()) {
            try {
                try {
                    aucx aucx = ((nqk) aucj.a((aucj) nqk.b, jjt.a(file))).a;
                    int size = aucx.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        nqj nqj = (nqj) aucx.get(i2);
                        if ((nqj.a & 64) != 0) {
                            i = nqj.h;
                        } else {
                            i = 1;
                        }
                        nun a2 = a(i);
                        ou ouVar = a2.a;
                        if (ouVar.h == a2.d) {
                            ouVar.remove(a2.a());
                        }
                        a2.a.put(nqj.b, new nul(a2, nqj.k.a((aucj) nqj)));
                    }
                } catch (auda e2) {
                    Log.w("GCM", "Failed to parse connection info from storage.");
                }
            } catch (IOException e3) {
                Log.w("GCM", "Failed to load connection info from storage.");
            }
        }
    }

    public final synchronized nun a(int i) {
        nun nun;
        nun = (nun) this.a.get(i);
        if (nun == null) {
            nun = new nun(i, this.b.get(i, (int) axlf.a.a().j()), this.e);
            this.a.put(i, nun);
        }
        return nun;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9 A[SYNTHETIC, Splitter:B:43:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0103 A[SYNTHETIC, Splitter:B:50:0x0103] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r8 = this;
            monitor-enter(r8)
            nqk r0 = defpackage.nqk.b     // Catch:{ all -> 0x012d }
            aucd r0 = r0.o()     // Catch:{ all -> 0x012d }
            r1 = 0
            r2 = 0
        L_0x0009:
            android.util.SparseArray r3 = r8.a     // Catch:{ all -> 0x012d }
            int r3 = r3.size()     // Catch:{ all -> 0x012d }
            if (r2 >= r3) goto L_0x0056
            android.util.SparseArray r3 = r8.a     // Catch:{ all -> 0x012d }
            java.lang.Object r3 = r3.valueAt(r2)     // Catch:{ all -> 0x012d }
            nun r3 = (defpackage.nun) r3     // Catch:{ all -> 0x012d }
            r4 = 0
        L_0x001a:
            ou r5 = r3.a     // Catch:{ all -> 0x012d }
            int r6 = r5.h     // Catch:{ all -> 0x012d }
            if (r4 >= r6) goto L_0x0053
            java.lang.Object r5 = r5.c(r4)     // Catch:{ all -> 0x012d }
            nul r5 = (defpackage.nul) r5     // Catch:{ all -> 0x012d }
            nqj r5 = r5.c()     // Catch:{ all -> 0x012d }
            boolean r6 = r0.c     // Catch:{ all -> 0x012d }
            if (r6 != 0) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            r0.c()     // Catch:{ all -> 0x012d }
            r0.c = r1     // Catch:{ all -> 0x012d }
        L_0x0034:
            aucj r6 = r0.b     // Catch:{ all -> 0x012d }
            nqk r6 = (defpackage.nqk) r6     // Catch:{ all -> 0x012d }
            r5.getClass()     // Catch:{ all -> 0x012d }
            aucx r7 = r6.a     // Catch:{ all -> 0x012d }
            boolean r7 = r7.a()     // Catch:{ all -> 0x012d }
            if (r7 != 0) goto L_0x004b
            aucx r7 = r6.a     // Catch:{ all -> 0x012d }
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)     // Catch:{ all -> 0x012d }
            r6.a = r7     // Catch:{ all -> 0x012d }
        L_0x004b:
            aucx r6 = r6.a     // Catch:{ all -> 0x012d }
            r6.add(r5)     // Catch:{ all -> 0x012d }
            int r4 = r4 + 1
            goto L_0x001a
        L_0x0053:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0056:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x012d }
            android.content.Context r2 = r8.c     // Catch:{ all -> 0x012d }
            android.content.Context r2 = defpackage.nrq.c(r2)     // Catch:{ all -> 0x012d }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ all -> 0x012d }
            java.lang.String r3 = "gcm_connection_infos"
            r1.<init>(r2, r3)     // Catch:{ all -> 0x012d }
            r2 = 0
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00b2, all -> 0x00b0 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00b2, all -> 0x00b0 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x00b2, all -> 0x00b0 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00b2, all -> 0x00b0 }
            aucj r0 = r0.i()     // Catch:{ IOException -> 0x00ad, all -> 0x00aa }
            nqk r0 = (defpackage.nqk) r0     // Catch:{ IOException -> 0x00ad, all -> 0x00aa }
            r0.a(r3)     // Catch:{ IOException -> 0x00ad, all -> 0x00aa }
            r3.flush()     // Catch:{ IOException -> 0x00ad, all -> 0x00aa }
            r3.close()     // Catch:{ IOException -> 0x0083 }
        L_0x0081:
            monitor-exit(r8)
            return
        L_0x0083:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x012d }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x012d }
            int r1 = r1.length()     // Catch:{ all -> 0x012d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            int r1 = r1 + 35
            r2.<init>(r1)     // Catch:{ all -> 0x012d }
            java.lang.String r1 = "Failed to persist ConnectionInfos: "
            r2.append(r1)     // Catch:{ all -> 0x012d }
            r2.append(r0)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "GCM"
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x012d }
        L_0x00a5:
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x012d }
        L_0x00a8:
            monitor-exit(r8)
            return
        L_0x00aa:
            r0 = move-exception
            r2 = r3
            goto L_0x0101
        L_0x00ad:
            r0 = move-exception
            r2 = r3
            goto L_0x00b3
        L_0x00b0:
            r0 = move-exception
            goto L_0x0101
        L_0x00b2:
            r0 = move-exception
        L_0x00b3:
            java.lang.String r1 = "GCM"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0100 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0100 }
            int r3 = r3.length()     // Catch:{ all -> 0x0100 }
            int r3 = r3 + 35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0100 }
            r4.<init>(r3)     // Catch:{ all -> 0x0100 }
            java.lang.String r3 = "Failed to persist ConnectionInfos: "
            r4.append(r3)     // Catch:{ all -> 0x0100 }
            r4.append(r0)     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0100 }
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x00a8
            r2.close()     // Catch:{ IOException -> 0x00dd }
            goto L_0x0081
        L_0x00dd:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x012d }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x012d }
            int r1 = r1.length()     // Catch:{ all -> 0x012d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            int r1 = r1 + 35
            r2.<init>(r1)     // Catch:{ all -> 0x012d }
            java.lang.String r1 = "Failed to persist ConnectionInfos: "
            r2.append(r1)     // Catch:{ all -> 0x012d }
            r2.append(r0)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "GCM"
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x012d }
            goto L_0x00a5
        L_0x0100:
            r0 = move-exception
        L_0x0101:
            if (r2 == 0) goto L_0x012c
            r2.close()     // Catch:{ IOException -> 0x0107 }
            goto L_0x012c
        L_0x0107:
            r1 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x012d }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x012d }
            int r2 = r2.length()     // Catch:{ all -> 0x012d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            int r2 = r2 + 35
            r3.<init>(r2)     // Catch:{ all -> 0x012d }
            java.lang.String r2 = "Failed to persist ConnectionInfos: "
            r3.append(r2)     // Catch:{ all -> 0x012d }
            r3.append(r1)     // Catch:{ all -> 0x012d }
            java.lang.String r1 = "GCM"
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x012d }
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x012d }
        L_0x012c:
            throw r0     // Catch:{ all -> 0x012d }
        L_0x012d:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x0131
        L_0x0130:
            throw r0
        L_0x0131:
            goto L_0x0130
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuk.a():void");
    }
}
