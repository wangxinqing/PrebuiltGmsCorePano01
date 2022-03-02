package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: nvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nvx {
    private static LevelDb b;
    private SimpleDateFormat a;
    private final Context c;
    private final nvy d;

    public nvx(Context context, nvy nvy) {
        this.c = context;
        this.d = nvy;
    }

    public static final void c() {
        synchronized (nvx.class) {
            if (b != null) {
                b.close();
                b = null;
            }
        }
    }

    public final long a(String str) {
        if (str == null) {
            return 0;
        }
        if (this.a == null) {
            this.a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        }
        try {
            return this.a.parse(str).getTime();
        } catch (ParseException e) {
            Log.e("GCM", "Error while parsing device-time message date");
            return 0;
        }
    }

    public final LevelDb b() {
        LevelDb levelDb;
        synchronized (nvx.class) {
            if (b == null) {
                File file = new File(this.c.getApplicationContext().getFilesDir(), "gcm_cm.ldb");
                try {
                    b = LevelDb.open(file);
                } catch (LevelDbCorruptionException e) {
                    Log.e("GCM", "Failed to open device-time msgs db: db is corrupted");
                    try {
                        LevelDb.destroy(file);
                    } catch (LevelDbException e2) {
                        Log.e("GCM", "Failed to delete device-time db", e2);
                    }
                } catch (LevelDbException e3) {
                    Log.e("GCM", "Failed to open device-time msgs db", e3);
                } catch (UnsatisfiedLinkError e4) {
                    Log.e("GCM", "Failed to open device-time msgs db: unable to use native methods");
                }
            }
            levelDb = b;
        }
        return levelDb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0187, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r15 = this;
            java.lang.Class<nvx> r0 = defpackage.nvx.class
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            monitor-enter(r0)
            com.google.android.gms.leveldb.LevelDb r3 = r15.b()     // Catch:{ all -> 0x0191 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x009b
            com.google.android.gms.leveldb.LevelDb$Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0191 }
            r3.seekToFirst()     // Catch:{ all -> 0x0096 }
        L_0x001d:
            boolean r7 = r3.isValid()     // Catch:{ all -> 0x0096 }
            if (r7 == 0) goto L_0x0090
            byte[] r7 = r3.key()     // Catch:{ all -> 0x0096 }
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x004a }
            java.lang.String r9 = "UTF-8"
            r8.<init>(r7, r9)     // Catch:{ UnsupportedEncodingException -> 0x004a }
            java.lang.String r9 = "@"
            java.lang.String[] r8 = r8.split(r9)     // Catch:{ UnsupportedEncodingException -> 0x004a }
            int r9 = r8.length     // Catch:{ UnsupportedEncodingException -> 0x004a }
            nvw r14 = new nvw     // Catch:{ UnsupportedEncodingException -> 0x004a }
            r9 = 0
            r9 = r8[r9]     // Catch:{ UnsupportedEncodingException -> 0x004a }
            long r10 = r15.a(r9)     // Catch:{ UnsupportedEncodingException -> 0x004a }
            r8 = r8[r4]     // Catch:{ UnsupportedEncodingException -> 0x004a }
            long r12 = r15.a(r8)     // Catch:{ UnsupportedEncodingException -> 0x004a }
            r8 = r14
            r9 = r7
            r8.<init>(r9, r10, r12)     // Catch:{ UnsupportedEncodingException -> 0x004a }
            goto L_0x0056
        L_0x004a:
            r8 = move-exception
            nvw r14 = new nvw     // Catch:{ all -> 0x0096 }
            r10 = 0
            r12 = 0
            r8 = r14
            r9 = r7
            r8.<init>(r9, r10, r12)     // Catch:{ all -> 0x0096 }
        L_0x0056:
            long r7 = r14.a     // Catch:{ all -> 0x0096 }
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x0087
            long r7 = r14.b     // Catch:{ all -> 0x0096 }
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x0087
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0096 }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0070
            byte[] r7 = r14.c     // Catch:{ all -> 0x0096 }
            r1.add(r7)     // Catch:{ all -> 0x0096 }
            goto L_0x008c
        L_0x0070:
            long r7 = r14.a     // Catch:{ all -> 0x0096 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0096 }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x0080
            byte[] r7 = r14.c     // Catch:{ all -> 0x0096 }
            r2.add(r7)     // Catch:{ all -> 0x0096 }
            goto L_0x008c
        L_0x0080:
            long r7 = r14.a     // Catch:{ all -> 0x0096 }
            r3.close()     // Catch:{ all -> 0x0191 }
            monitor-exit(r0)     // Catch:{ all -> 0x0191 }
            goto L_0x009d
        L_0x0087:
            byte[] r7 = r14.c     // Catch:{ all -> 0x0096 }
            r1.add(r7)     // Catch:{ all -> 0x0096 }
        L_0x008c:
            r3.next()     // Catch:{ all -> 0x0096 }
            goto L_0x001d
        L_0x0090:
            r3.close()     // Catch:{ all -> 0x0191 }
            monitor-exit(r0)     // Catch:{ all -> 0x0191 }
            r7 = r5
            goto L_0x009d
        L_0x0096:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0191 }
            throw r1     // Catch:{ all -> 0x0191 }
        L_0x009b:
            monitor-exit(r0)     // Catch:{ all -> 0x0191 }
            r7 = r5
        L_0x009d:
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00ea
            nvy r3 = r15.d
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r5
            qxf r5 = new qxf
            r5.<init>()
            java.lang.String r6 = "com.google.android.gms.gcm.gmsproc.cm.GcmReceiverService$MessageTriggeredService"
            r5.i = r6
            java.lang.String r6 = "GCM-CM"
            r5.k = r6
            r9 = 1
            long r9 = r9 + r7
            r5.a(r7, r9)
            r5.n = r4
            r4 = 2
            r5.a((int) r4)
            qxg r4 = r5.b()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 59
            r5.<init>(r6)
            java.lang.String r6 = "device-time msg is being scheduled in "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = "s"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "GCM"
            android.util.Log.i(r6, r5)
            qwq r3 = r3.a
            r3.a((defpackage.qxx) r4)
        L_0x00ea:
            monitor-enter(r0)
            com.google.android.gms.leveldb.LevelDb r3 = r15.b()     // Catch:{ all -> 0x018e }
            if (r3 == 0) goto L_0x018c
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x018e }
        L_0x00f5:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x018e }
            if (r5 == 0) goto L_0x013d
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x018e }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x018e }
            byte[] r5 = r3.get(r5)     // Catch:{ LevelDbException -> 0x013b }
            r6 = 0
            if (r5 == 0) goto L_0x0132
            amnc r7 = defpackage.amnc.r     // Catch:{ auda -> 0x0130 }
            aucj r5 = defpackage.aucj.a((defpackage.aucj) r7, (byte[]) r5)     // Catch:{ auda -> 0x0130 }
            amnc r5 = (defpackage.amnc) r5     // Catch:{ auda -> 0x0130 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ LevelDbException -> 0x013b }
            r6.<init>()     // Catch:{ LevelDbException -> 0x013b }
            aucx r5 = r5.g     // Catch:{ LevelDbException -> 0x013b }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ LevelDbException -> 0x013b }
        L_0x011b:
            boolean r7 = r5.hasNext()     // Catch:{ LevelDbException -> 0x013b }
            if (r7 == 0) goto L_0x012f
            java.lang.Object r7 = r5.next()     // Catch:{ LevelDbException -> 0x013b }
            ammv r7 = (defpackage.ammv) r7     // Catch:{ LevelDbException -> 0x013b }
            java.lang.String r8 = r7.b     // Catch:{ LevelDbException -> 0x013b }
            java.lang.String r7 = r7.c     // Catch:{ LevelDbException -> 0x013b }
            r6.putString(r8, r7)     // Catch:{ LevelDbException -> 0x013b }
            goto L_0x011b
        L_0x012f:
            goto L_0x0133
        L_0x0130:
            r5 = move-exception
            goto L_0x0133
        L_0x0132:
        L_0x0133:
            if (r6 == 0) goto L_0x00f5
            nvy r5 = r15.d     // Catch:{ LevelDbException -> 0x013b }
            r5.a(r6)     // Catch:{ LevelDbException -> 0x013b }
            goto L_0x00f5
        L_0x013b:
            r5 = move-exception
            goto L_0x00f5
        L_0x013d:
            boolean r4 = r1.isEmpty()     // Catch:{ all -> 0x018e }
            if (r4 == 0) goto L_0x0149
            boolean r4 = r2.isEmpty()     // Catch:{ all -> 0x018e }
            if (r4 != 0) goto L_0x0186
        L_0x0149:
            com.google.android.gms.leveldb.WriteBatch r4 = com.google.android.gms.leveldb.WriteBatch.create()     // Catch:{ all -> 0x018e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ LevelDbException -> 0x017b }
        L_0x0151:
            boolean r5 = r1.hasNext()     // Catch:{ LevelDbException -> 0x017b }
            if (r5 == 0) goto L_0x0161
            java.lang.Object r5 = r1.next()     // Catch:{ LevelDbException -> 0x017b }
            byte[] r5 = (byte[]) r5     // Catch:{ LevelDbException -> 0x017b }
            r4.delete(r5)     // Catch:{ LevelDbException -> 0x017b }
            goto L_0x0151
        L_0x0161:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ LevelDbException -> 0x017b }
        L_0x0165:
            boolean r2 = r1.hasNext()     // Catch:{ LevelDbException -> 0x017b }
            if (r2 == 0) goto L_0x0175
            java.lang.Object r2 = r1.next()     // Catch:{ LevelDbException -> 0x017b }
            byte[] r2 = (byte[]) r2     // Catch:{ LevelDbException -> 0x017b }
            r4.delete(r2)     // Catch:{ LevelDbException -> 0x017b }
            goto L_0x0165
        L_0x0175:
            r3.write(r4)     // Catch:{ LevelDbException -> 0x017b }
            goto L_0x0183
        L_0x0179:
            r1 = move-exception
            goto L_0x0188
        L_0x017b:
            r1 = move-exception
            java.lang.String r2 = "GCM"
            java.lang.String r3 = "Failed to delete expired and triggered device-time messages"
            android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0179 }
        L_0x0183:
            r4.close()     // Catch:{ all -> 0x018e }
        L_0x0186:
            monitor-exit(r0)     // Catch:{ all -> 0x018e }
            return
        L_0x0188:
            r4.close()     // Catch:{ all -> 0x018e }
            throw r1     // Catch:{ all -> 0x018e }
        L_0x018c:
            monitor-exit(r0)     // Catch:{ all -> 0x018e }
            return
        L_0x018e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x018e }
            throw r1
        L_0x0191:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0191 }
            goto L_0x0195
        L_0x0194:
            throw r1
        L_0x0195:
            goto L_0x0194
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvx.a():void");
    }
}
