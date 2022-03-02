package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: agwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agwj {
    public static final boolean a = true;
    static final ConcurrentHashMap b = new ConcurrentHashMap();
    static volatile boolean c;
    public static amri d = ampu.a;
    public final agvm e;
    public final String f;
    public final boolean g = false;
    public final agxa h = new agxa(new agwc(this));

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public agwj(agvm agvm, String str) {
        this.e = agvm;
        this.f = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map a() {
        /*
            r9 = this;
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.io.File r1 = r9.b()
            java.lang.String r2 = "r"
            r0.<init>(r1, r2)
            java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch:{ all -> 0x0076 }
            java.nio.channels.FileChannel$MapMode r4 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0076 }
            r5 = 0
            long r7 = r0.length()     // Catch:{ all -> 0x0076 }
            java.nio.MappedByteBuffer r1 = r3.map(r4, r5, r7)     // Catch:{ all -> 0x0076 }
            agxe r2 = defpackage.agxe.g     // Catch:{ all -> 0x0076 }
            aucj r1 = defpackage.aucj.a((defpackage.aucj) r2, (java.nio.ByteBuffer) r1)     // Catch:{ all -> 0x0076 }
            agxe r1 = (defpackage.agxe) r1     // Catch:{ all -> 0x0076 }
            aucx r2 = r1.f     // Catch:{ all -> 0x0076 }
            int r2 = r2.size()     // Catch:{ all -> 0x0076 }
            int r2 = r2 + 3
            java.util.HashMap r2 = defpackage.anet.a((int) r2)     // Catch:{ all -> 0x0076 }
            aucx r3 = r1.f     // Catch:{ all -> 0x0076 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0076 }
        L_0x0035:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0076 }
            if (r4 != 0) goto L_0x005c
            java.lang.String r3 = "__phenotype_server_token"
            java.lang.String r4 = r1.d     // Catch:{ all -> 0x0076 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = "__phenotype_snapshot_token"
            java.lang.String r4 = r1.b     // Catch:{ all -> 0x0076 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = "__phenotype_configuration_version"
            long r4 = r1.e     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x0076 }
            r2.put(r3, r1)     // Catch:{ all -> 0x0076 }
            anaf r1 = defpackage.anaf.a((java.util.Map) r2)     // Catch:{ all -> 0x0076 }
            r0.close()
            return r1
        L_0x005c:
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0076 }
            agxf r4 = (defpackage.agxf) r4     // Catch:{ all -> 0x0076 }
            java.lang.String r5 = r4.d     // Catch:{ all -> 0x0076 }
            java.lang.String r6 = ""
            int r7 = r4.b     // Catch:{ all -> 0x0076 }
            r8 = 5
            if (r7 != r8) goto L_0x0071
            java.lang.Object r4 = r4.c     // Catch:{ all -> 0x0076 }
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0076 }
            goto L_0x0072
        L_0x0071:
        L_0x0072:
            r2.put(r5, r6)     // Catch:{ all -> 0x0076 }
            goto L_0x0035
        L_0x0076:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x007b }
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r0)
        L_0x007f:
            goto L_0x0081
        L_0x0080:
            throw r1
        L_0x0081:
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agwj.a():java.util.Map");
    }

    private final File b() {
        return new File(this.e.d.getDir("phenotype_file", 0), String.valueOf(this.f).concat(".pb"));
    }

    static final /* synthetic */ void a(CancellationSignal cancellationSignal) {
        try {
            cancellationSignal.cancel();
        } catch (OperationCanceledException e2) {
        }
    }

    public final Map a(ContentResolver contentResolver, Uri uri, String[] strArr, CancellationSignal cancellationSignal) {
        Cursor query;
        anaf anaf;
        if (!c) {
            aort a2 = this.e.a().a((Runnable) new agwh(cancellationSignal), 2000, TimeUnit.MILLISECONDS);
            try {
                query = contentResolver.query(uri, strArr, (String) null, (String[]) null, (String) null, cancellationSignal);
                if (query != null) {
                    HashMap a3 = anet.a(query.getCount());
                    while (query.moveToNext()) {
                        a3.put(query.getString(0), query.getString(1));
                    }
                    anaf = anaf.a((Map) a3);
                } else {
                    anaf = anfu.b;
                }
                a2.cancel(true);
                if (query != null) {
                    query.close();
                }
                return anaf;
            } catch (SQLiteException | OperationCanceledException | IllegalStateException | SecurityException e2) {
                Log.e("ContentProviderFlagSource", "Could not read flags from ContentProvider, falling back to local stale flags", e2);
                if (e2 instanceof OperationCanceledException) {
                    c = true;
                }
                return a();
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            Log.w("ContentProviderFlagSource", "Skipping content resolver query because of previous time outs.");
            return a();
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(long j, long j2, long j3, long j4) {
        hol hol = new hol(this.e.d, "PHENOTYPE_COUNTERS", (String) null);
        hol.a(avsd.UNMETERED_OR_DAILY);
        hph hph = new hph(hol, "PHENOTYPE_COUNTERS", 1024);
        hph.e("ContentProvider_ProcessStable_UptimeLatency").a(j - j2);
        hph.e("ContentProvider_ProcessStable_RealLatency").a(j3 - j4);
        hph.d();
    }

    public final void a(Map map) {
        FileOutputStream fileOutputStream;
        File b2 = b();
        if (!map.isEmpty()) {
            aucd o = agxe.g.o();
            for (Map.Entry entry : map.entrySet()) {
                if ("__phenotype_server_token".equals(entry.getKey())) {
                    String str = (String) map.get("__phenotype_server_token");
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    agxe agxe = (agxe) o.b;
                    str.getClass();
                    agxe.a |= 4;
                    agxe.d = str;
                } else if ("__phenotype_snapshot_token".equals(entry.getKey())) {
                    String str2 = (String) map.get("__phenotype_snapshot_token");
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    agxe agxe2 = (agxe) o.b;
                    str2.getClass();
                    agxe2.a |= 1;
                    agxe2.b = str2;
                } else if ("__phenotype_configuration_version".equals(entry.getKey())) {
                    long parseLong = Long.parseLong((String) map.get("__phenotype_configuration_version"));
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    agxe agxe3 = (agxe) o.b;
                    agxe3.a |= 8;
                    agxe3.e = parseLong;
                } else {
                    aucd o2 = agxf.e.o();
                    String str3 = (String) entry.getKey();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    agxf agxf = (agxf) o2.b;
                    str3.getClass();
                    agxf.a |= 1;
                    agxf.d = str3;
                    String str4 = (String) entry.getValue();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    agxf agxf2 = (agxf) o2.b;
                    str4.getClass();
                    agxf2.b = 5;
                    agxf2.c = str4;
                    o.i(o2);
                }
            }
            agxe agxe4 = (agxe) o.i();
            File dir = this.e.d.getDir("phenotype_file", 0);
            String str5 = this.f;
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 8);
            sb.append("temp-");
            sb.append(str5);
            sb.append(".pb");
            File file = new File(dir, sb.toString());
            try {
                fileOutputStream = new FileOutputStream(file);
                agxe4.a(fileOutputStream);
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (file.exists() && !file.renameTo(b2)) {
                    Log.e("ContentProviderFlagSource", "Could not write Phenotype flags to backup local storage.");
                    file.delete();
                    return;
                }
                return;
            } catch (IOException e2) {
                Log.e("ContentProviderFlagSource", "Could not write Phenotype flags to temp local storage.");
                file.delete();
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else if (b2.exists()) {
            b2.delete();
            return;
        } else {
            return;
        }
        throw th;
    }
}
