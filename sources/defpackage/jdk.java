package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.util.Log;
import com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Iterator;
import java.util.List;

/* renamed from: jdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jdk {
    public static PackageManager a;
    private static final int b = ((Integer) jcg.d.c()).intValue();
    private static final int c = ((Integer) jcg.e.c()).intValue();
    private static final jje p = new jde();
    private static final jje q = new jdf();
    private static final jje r = new jdg();
    private static final jje s = new jdh();
    private static final jje t = new jdi();
    private RandomAccessFile d;
    private InputStream e;
    private FileChannel f;
    private FileLock g;
    private BufferedReader h;
    private File i;
    private List j;
    private final Context k;
    private Cursor l;
    private boolean m;
    private List n;
    private Iterator o;
    private final int u;

    public jdk(Context context, int i2) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        iva.a((Object) context);
        Context d2 = aekv.d(context);
        this.k = d2;
        this.u = i2;
        a = d2.getPackageManager();
    }

    public static jdk a(Context context, int i2, File file) {
        if (file.exists()) {
            jdk jdk = new jdk(context, i2, file);
            try {
                jdk.a(jdk.i);
                return jdk;
            } catch (IOException | OverlappingFileLockException e2) {
                jdk.a();
                throw new jdj(e2);
            }
        } else {
            String absolutePath = file.getAbsolutePath();
            StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 20);
            sb.append("File ");
            sb.append(absolutePath);
            sb.append(" does not exist");
            throw new jdj(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (!this.m) {
            a();
        }
    }

    private jdk(Context context, int i2, File file) {
        this(context, i2);
        this.i = file;
        this.m = true;
    }

    public jdk(Context context, int i2, List list) {
        this(context, i2);
        this.j = list;
    }

    private static final void a(long j2) {
        jes a2 = jes.a();
        RadiosTracingLoggerProvider.NetworkActivityLogger networkActivityLogger = ihs.b().getNetworkActivityLogger();
        if (a2 != null && !networkActivityLogger.isNopLogger()) {
            a2.a.a("radio_activity", "event_time_ms BETWEEN ? AND ?", new String[]{"0", String.valueOf(j2)});
            networkActivityLogger.deleteEntries("event_time_ms", 0, j2);
            RadiosTracingLoggerProvider.NetworkLatencyLogger networkLatencyLogger = ihs.b().getNetworkLatencyLogger();
            if (!networkLatencyLogger.isNopLogger()) {
                networkLatencyLogger.deleteEntries("event_time_ms", 0, j2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0140, code lost:
        throw new java.lang.IndexOutOfBoundsException("Size of module id list, cpu millis list and trace counts list doesn't match");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0160, code lost:
        r20 = r4;
        r14 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.aucd r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            java.lang.String r3 = "StatsUploader"
            long r4 = java.lang.System.currentTimeMillis()
            awym r0 = defpackage.awym.a
            awyn r0 = r0.a()
            long r6 = r0.e()
            long r4 = r4 - r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r0 = 8
            njo[] r6 = new defpackage.njo[r0]
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r0 = r1.j
            java.util.Iterator r8 = r0.iterator()
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = -9223372036854775808
            r14 = 0
        L_0x002f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r0 = r8.next()
            java.io.File r0 = (java.io.File) r0
            boolean r16 = r0.exists()
            if (r16 == 0) goto L_0x01ac
            java.lang.String r9 = r0.getName()
            java.lang.String r15 = "cpu_aggregates"
            boolean r9 = r9.endsWith(r15)
            if (r9 != 0) goto L_0x0051
            r20 = r4
            goto L_0x01ae
        L_0x0051:
            r9 = 1
            r1.m = r9
            r1.a((java.io.File) r0)     // Catch:{ OverlappingFileLockException -> 0x01a2, IOException -> 0x01a0 }
            if (r14 != 0) goto L_0x0193
            java.io.DataInputStream r9 = new java.io.DataInputStream     // Catch:{ IndexOutOfBoundsException -> 0x0189, IOException -> 0x017f }
            java.io.InputStream r0 = r1.e     // Catch:{ IndexOutOfBoundsException -> 0x0189, IOException -> 0x017f }
            defpackage.iva.a((java.lang.Object) r0)     // Catch:{ IndexOutOfBoundsException -> 0x0189, IOException -> 0x017f }
            r9.<init>(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0189, IOException -> 0x017f }
        L_0x0063:
            int r0 = r9.available()     // Catch:{ all -> 0x016d }
            if (r0 > 0) goto L_0x006d
            r20 = r4
            goto L_0x0163
        L_0x006d:
            int r0 = r9.readInt()     // Catch:{ all -> 0x016d }
            r15 = 1090234222(0x40fba76e, float:7.864188)
            if (r0 == r15) goto L_0x007b
            r20 = r4
            r14 = 1
            goto L_0x0163
        L_0x007b:
            int r0 = r9.readInt()     // Catch:{ all -> 0x016d }
            r15 = 100000(0x186a0, float:1.4013E-40)
            if (r0 > r15) goto L_0x0160
            byte[] r15 = new byte[r0]     // Catch:{ all -> 0x016d }
            int r1 = r9.read(r15)     // Catch:{ all -> 0x016d }
            if (r0 != r1) goto L_0x0160
            jeg r0 = defpackage.jeg.g     // Catch:{ all -> 0x016d }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r0, (byte[]) r15)     // Catch:{ all -> 0x016d }
            jeg r0 = (defpackage.jeg) r0     // Catch:{ all -> 0x016d }
            long r1 = r0.a     // Catch:{ all -> 0x016d }
            int r15 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r15 < 0) goto L_0x0156
            int r15 = r0.c     // Catch:{ all -> 0x016d }
            long r1 = java.lang.Math.min(r10, r1)     // Catch:{ all -> 0x016d }
            long r10 = r0.b     // Catch:{ all -> 0x014d }
            long r10 = java.lang.Math.max(r12, r10)     // Catch:{ all -> 0x014d }
            r12 = 7
            if (r15 <= r12) goto L_0x00b0
            r20 = r4
            r12 = r10
            r14 = 1
            r10 = r1
            goto L_0x0163
        L_0x00b0:
            r12 = r6[r15]     // Catch:{ all -> 0x0145 }
            if (r12 != 0) goto L_0x00bc
            njo r12 = new njo     // Catch:{ all -> 0x0145 }
            r12.<init>()     // Catch:{ all -> 0x0145 }
            r6[r15] = r12     // Catch:{ all -> 0x0145 }
            goto L_0x00bd
        L_0x00bc:
        L_0x00bd:
            android.util.SparseArray r12 = r12.b     // Catch:{ all -> 0x0145 }
            aucs r13 = r0.d     // Catch:{ all -> 0x0145 }
            aucs r15 = r0.e     // Catch:{ all -> 0x0145 }
            aucs r0 = r0.f     // Catch:{ all -> 0x0145 }
            r17 = r1
            int r1 = r13.size()     // Catch:{ all -> 0x0143 }
            int r2 = r15.size()     // Catch:{ all -> 0x0143 }
            if (r1 != r2) goto L_0x0137
            int r1 = r13.size()     // Catch:{ all -> 0x0143 }
            int r2 = r0.size()     // Catch:{ all -> 0x0143 }
            if (r1 != r2) goto L_0x0134
            r1 = 0
        L_0x00dc:
            int r2 = r13.size()     // Catch:{ all -> 0x0143 }
            if (r1 >= r2) goto L_0x012e
            java.lang.Object r2 = r13.get(r1)     // Catch:{ all -> 0x0143 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0143 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0143 }
            java.lang.Object r2 = r12.get(r2)     // Catch:{ all -> 0x0143 }
            njn r2 = (defpackage.njn) r2     // Catch:{ all -> 0x0143 }
            if (r2 == 0) goto L_0x00f7
            r20 = r4
            goto L_0x010b
        L_0x00f7:
            njn r2 = new njn     // Catch:{ all -> 0x0143 }
            r2.<init>()     // Catch:{ all -> 0x0143 }
            java.lang.Object r19 = r13.get(r1)     // Catch:{ all -> 0x0143 }
            java.lang.Integer r19 = (java.lang.Integer) r19     // Catch:{ all -> 0x0143 }
            r20 = r4
            int r4 = r19.intValue()     // Catch:{ all -> 0x0141 }
            r12.put(r4, r2)     // Catch:{ all -> 0x0141 }
        L_0x010b:
            int r4 = r2.a     // Catch:{ all -> 0x0141 }
            java.lang.Object r5 = r0.get(r1)     // Catch:{ all -> 0x0141 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0141 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0141 }
            int r4 = r4 + r5
            r2.a = r4     // Catch:{ all -> 0x0141 }
            int r4 = r2.b     // Catch:{ all -> 0x0141 }
            java.lang.Object r5 = r15.get(r1)     // Catch:{ all -> 0x0141 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0141 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0141 }
            int r4 = r4 + r5
            r2.b = r4     // Catch:{ all -> 0x0141 }
            int r1 = r1 + 1
            r4 = r20
            goto L_0x00dc
        L_0x012e:
            r20 = r4
            r12 = r10
            r10 = r17
            goto L_0x0158
        L_0x0134:
            r20 = r4
            goto L_0x0139
        L_0x0137:
            r20 = r4
        L_0x0139:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0141 }
            java.lang.String r1 = "Size of module id list, cpu millis list and trace counts list doesn't match"
            r0.<init>(r1)     // Catch:{ all -> 0x0141 }
            throw r0     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r0 = move-exception
            goto L_0x014a
        L_0x0143:
            r0 = move-exception
            goto L_0x0148
        L_0x0145:
            r0 = move-exception
            r17 = r1
        L_0x0148:
            r20 = r4
        L_0x014a:
            r1 = r0
            r12 = r10
            goto L_0x0153
        L_0x014d:
            r0 = move-exception
            r17 = r1
            r20 = r4
            r1 = r0
        L_0x0153:
            r10 = r17
            goto L_0x0171
        L_0x0156:
            r20 = r4
        L_0x0158:
            r1 = r22
            r2 = r23
            r4 = r20
            goto L_0x0063
        L_0x0160:
            r20 = r4
            r14 = 1
        L_0x0163:
            r22.a()     // Catch:{ all -> 0x016a }
            r9.close()     // Catch:{ IndexOutOfBoundsException -> 0x017d, IOException -> 0x017b }
            goto L_0x01ae
        L_0x016a:
            r0 = move-exception
            r1 = r0
            goto L_0x0171
        L_0x016d:
            r0 = move-exception
            r20 = r4
            r1 = r0
        L_0x0171:
            r9.close()     // Catch:{ all -> 0x0175 }
            goto L_0x017a
        L_0x0175:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ IndexOutOfBoundsException -> 0x017d, IOException -> 0x017b }
        L_0x017a:
            throw r1     // Catch:{ IndexOutOfBoundsException -> 0x017d, IOException -> 0x017b }
        L_0x017b:
            r0 = move-exception
            goto L_0x0182
        L_0x017d:
            r0 = move-exception
            goto L_0x018c
        L_0x017f:
            r0 = move-exception
            r20 = r4
        L_0x0182:
            java.lang.String r1 = "CPU trace aggregate log file has corrupted logs"
            android.util.Log.e(r3, r1, r0)
            goto L_0x01ae
        L_0x0189:
            r0 = move-exception
            r20 = r4
        L_0x018c:
            java.lang.String r1 = "Error occurred while reading the proto"
            android.util.Log.e(r3, r1, r0)
            goto L_0x01ae
        L_0x0193:
            r20 = r4
            r22.a()     // Catch:{ OverlappingFileLockException -> 0x01a2, IOException -> 0x01a0 }
            r1 = r22
            r2 = r23
            r4 = r20
            goto L_0x002f
        L_0x01a0:
            r0 = move-exception
            goto L_0x01a3
        L_0x01a2:
            r0 = move-exception
        L_0x01a3:
            r22.a()
            jdj r1 = new jdj
            r1.<init>((java.lang.Throwable) r0)
            throw r1
        L_0x01ac:
            r20 = r4
        L_0x01ae:
            r1 = r22
            r2 = r23
            r4 = r20
            goto L_0x002f
        L_0x01b6:
            if (r14 != 0) goto L_0x02c4
            int[] r0 = defpackage.njo.a
            int r1 = r0.length
            r2 = 0
        L_0x01bc:
            if (r2 >= r1) goto L_0x0280
            r3 = r0[r2]
            r4 = r6[r3]
            if (r4 == 0) goto L_0x027c
            android.util.SparseArray r4 = r4.b
            aohu r5 = defpackage.aohu.h
            aucd r5 = r5.o()
            boolean r8 = r5.c
            if (r8 != 0) goto L_0x01d1
            goto L_0x01d7
        L_0x01d1:
            r5.c()
            r8 = 0
            r5.c = r8
        L_0x01d7:
            aucj r8 = r5.b
            aohu r8 = (defpackage.aohu) r8
            int r9 = r8.a
            r14 = 1
            r9 = r9 | r14
            r8.a = r9
            r8.b = r3
            r3 = r9 | 2
            r8.a = r3
            r8.c = r10
            r3 = r3 | 4
            r8.a = r3
            r8.d = r12
            r3 = 0
        L_0x01f0:
            int r8 = r4.size()
            if (r3 >= r8) goto L_0x0273
            java.lang.Object r8 = r4.valueAt(r3)
            njn r8 = (defpackage.njn) r8
            int r9 = r4.keyAt(r3)
            boolean r15 = r5.c
            if (r15 == 0) goto L_0x020a
            r5.c()
            r15 = 0
            r5.c = r15
        L_0x020a:
            aucj r15 = r5.b
            aohu r15 = (defpackage.aohu) r15
            aucs r14 = r15.e
            boolean r14 = r14.a()
            if (r14 != 0) goto L_0x021e
            aucs r14 = r15.e
            aucs r14 = defpackage.aucj.a((defpackage.aucs) r14)
            r15.e = r14
        L_0x021e:
            aucs r14 = r15.e
            r14.d(r9)
            int r9 = r8.b
            boolean r14 = r5.c
            if (r14 == 0) goto L_0x022f
            r5.c()
            r14 = 0
            r5.c = r14
        L_0x022f:
            aucj r14 = r5.b
            aohu r14 = (defpackage.aohu) r14
            aucs r15 = r14.f
            boolean r15 = r15.a()
            if (r15 != 0) goto L_0x0243
            aucs r15 = r14.f
            aucs r15 = defpackage.aucj.a((defpackage.aucs) r15)
            r14.f = r15
        L_0x0243:
            aucs r14 = r14.f
            r14.d(r9)
            int r8 = r8.a
            boolean r9 = r5.c
            if (r9 != 0) goto L_0x024f
            goto L_0x0255
        L_0x024f:
            r5.c()
            r9 = 0
            r5.c = r9
        L_0x0255:
            aucj r9 = r5.b
            aohu r9 = (defpackage.aohu) r9
            aucs r14 = r9.g
            boolean r14 = r14.a()
            if (r14 != 0) goto L_0x0269
            aucs r14 = r9.g
            aucs r14 = defpackage.aucj.a((defpackage.aucs) r14)
            r9.g = r14
        L_0x0269:
            aucs r9 = r9.g
            r9.d(r8)
            int r3 = r3 + 1
            r14 = 1
            goto L_0x01f0
        L_0x0273:
            aucj r3 = r5.i()
            aohu r3 = (defpackage.aohu) r3
            r7.add(r3)
        L_0x027c:
            int r2 = r2 + 1
            goto L_0x01bc
        L_0x0280:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x02c4
            r1 = r23
            boolean r0 = r1.c
            if (r0 != 0) goto L_0x028d
            goto L_0x0293
        L_0x028d:
            r23.c()
            r2 = 0
            r1.c = r2
        L_0x0293:
            aucj r0 = r1.b
            aohl r0 = (defpackage.aohl) r0
            aohl r2 = defpackage.aohl.u
            aucx r2 = defpackage.aucj.s()
            r0.q = r2
            boolean r0 = r1.c
            if (r0 != 0) goto L_0x02a4
            goto L_0x02aa
        L_0x02a4:
            r23.c()
            r2 = 0
            r1.c = r2
        L_0x02aa:
            aucj r0 = r1.b
            aohl r0 = (defpackage.aohl) r0
            aucx r1 = r0.q
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x02be
            aucx r1 = r0.q
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r0.q = r1
        L_0x02be:
            aucx r0 = r0.q
            defpackage.auab.a((java.lang.Iterable) r7, (java.util.List) r0)
            return
        L_0x02c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdk.a(aucd):void");
    }

    private final void a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.d = randomAccessFile;
        FileChannel channel = randomAccessFile.getChannel();
        this.f = channel;
        FileLock tryLock = channel.tryLock();
        this.g = tryLock;
        if (tryLock == null) {
            String valueOf = String.valueOf(file.getName());
            Log.w("StatsUploader", valueOf.length() == 0 ? new String("Not able to lock file") : "Not able to lock file".concat(valueOf));
            throw new IOException("Unable to obtain exclusive lock");
        }
        this.e = Channels.newInputStream(this.f);
        this.h = new BufferedReader(new InputStreamReader(this.e));
        this.m = false;
    }

    private final boolean a(jje jje, List list) {
        try {
            if (this.h == null) {
                Log.e("StatsUploader", "mBufferedReader is null!!! Try again later.");
                return false;
            }
            String str = null;
            int i2 = 0;
            while (i2 < b) {
                BufferedReader bufferedReader = this.h;
                iva.a((Object) bufferedReader);
                str = bufferedReader.readLine();
                if (str == null) {
                    break;
                }
                Object a2 = jje.a(str);
                if (a2 != null) {
                    list.add(a2);
                    i2++;
                }
            }
            if (str != null) {
                return true;
            }
            return false;
        } catch (IOException e2) {
            Log.e("StatsUploader", e2.toString());
            return false;
        }
    }

    public final void a() {
        try {
            FileLock fileLock = this.g;
            if (fileLock != null) {
                if (fileLock.isValid()) {
                    FileChannel fileChannel = this.f;
                    if (fileChannel != null) {
                        fileChannel.truncate(0);
                    }
                }
                FileLock fileLock2 = this.g;
                iva.a((Object) fileLock2);
                fileLock2.release();
            }
            RandomAccessFile randomAccessFile = this.d;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            FileChannel fileChannel2 = this.f;
            if (fileChannel2 != null && fileChannel2.isOpen()) {
                this.f.close();
            }
            InputStream inputStream = this.e;
            if (inputStream != null) {
                inputStream.close();
            }
            BufferedReader bufferedReader = this.h;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            Cursor cursor = this.l;
            if (cursor != null) {
                if (!cursor.isClosed()) {
                    this.l.close();
                }
                this.l = null;
            }
            this.o = null;
            this.n = null;
        } catch (IOException e2) {
            String valueOf = String.valueOf(e2.toString());
            Log.e("StatsUploader", valueOf.length() == 0 ? new String("cleanup - try: ") : "cleanup - try: ".concat(valueOf));
        }
        this.m = true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0754, code lost:
        r2 = r1;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:?, code lost:
        throw null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0588 A[Catch:{ all -> 0x057d, all -> 0x05da }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0598 A[Catch:{ all -> 0x057d, all -> 0x05da }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x06c0 A[Catch:{ all -> 0x0750 }, LOOP:4: B:305:0x06c0->B:307:0x06c7, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x072d A[Catch:{ all -> 0x0758 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x074a A[LOOP:0: B:7:0x001a->B:331:0x074a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0763 A[LOOP:7: B:341:0x075d->B:343:0x0763, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0736 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.jdd r26, java.util.List r27, defpackage.aohg r28) {
        /*
            r25 = this;
            r1 = r25
            java.io.File r0 = r1.i
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x000e
            java.io.BufferedReader r0 = r1.h
            if (r0 != 0) goto L_0x000e
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            java.lang.String r4 = "Uploader's file has not been opened"
            defpackage.iva.a((boolean) r0, (java.lang.Object) r4)
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r5 = 5
            r4.<init>(r5)
        L_0x001a:
            aohl r0 = defpackage.aohl.u     // Catch:{ all -> 0x075a }
            aucd r6 = r0.o()     // Catch:{ all -> 0x075a }
            defpackage.iva.a((java.lang.Object) r6)     // Catch:{ all -> 0x075a }
            int r0 = r1.u     // Catch:{ all -> 0x075a }
            int r7 = r0 + -1
            if (r0 == 0) goto L_0x0754
            r0 = 2
            if (r7 == r0) goto L_0x064f
            r9 = 3
            if (r7 == r9) goto L_0x05e4
            r9 = 4
            if (r7 == r9) goto L_0x01d9
            if (r7 == r5) goto L_0x016b
            r0 = 18
            if (r7 == r0) goto L_0x005d
            r0 = 20
            if (r7 == r0) goto L_0x0043
            r2 = r1
            r17 = r4
            r1 = r6
            r0 = 0
            goto L_0x06b8
        L_0x0043:
            r1.a((defpackage.aucd) r6)     // Catch:{ jdj -> 0x004d }
            r2 = r1
            r17 = r4
            r1 = r6
            r0 = 0
            goto L_0x06b8
        L_0x004d:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "StatsUploader"
            java.lang.String r9 = "Failed to upload logs. "
            android.util.Log.e(r0, r9, r7)     // Catch:{ all -> 0x075a }
            r2 = r1
            r17 = r4
            r1 = r6
            r0 = 0
            goto L_0x06b8
        L_0x005d:
            java.util.Iterator r0 = r1.o     // Catch:{ all -> 0x075a }
            if (r0 != 0) goto L_0x00e9
            java.util.Calendar r0 = defpackage.jii.a()     // Catch:{ all -> 0x075a }
            long r9 = r0.getTimeInMillis()     // Catch:{ all -> 0x075a }
            axbe r0 = defpackage.axbe.a     // Catch:{ all -> 0x075a }
            axbf r0 = r0.a()     // Catch:{ all -> 0x075a }
            long r11 = r0.g()     // Catch:{ all -> 0x075a }
            long r9 = r9 - r11
            a((long) r9)     // Catch:{ all -> 0x075a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x075a }
            r0.<init>()     // Catch:{ all -> 0x075a }
            axbe r7 = defpackage.axbe.a     // Catch:{ all -> 0x075a }
            axbf r7 = r7.a()     // Catch:{ all -> 0x075a }
            boolean r7 = r7.p()     // Catch:{ all -> 0x075a }
            if (r7 != 0) goto L_0x00bf
            java.util.Calendar r7 = defpackage.jii.a()     // Catch:{ all -> 0x075a }
            long r9 = r7.getTimeInMillis()     // Catch:{ all -> 0x075a }
            r11 = -86400000(0xfffffffffad9a400, double:NaN)
            long r11 = r11 + r9
            axbe r7 = defpackage.axbe.a     // Catch:{ all -> 0x075a }
            axbf r7 = r7.a()     // Catch:{ all -> 0x075a }
            boolean r7 = r7.n()     // Catch:{ all -> 0x075a }
            if (r7 != 0) goto L_0x00a1
            goto L_0x00a9
        L_0x00a1:
            java.util.List r7 = defpackage.jeo.a(r11, r9, r3)     // Catch:{ all -> 0x075a }
            r0.addAll(r7)     // Catch:{ all -> 0x075a }
        L_0x00a9:
            axbe r7 = defpackage.axbe.a     // Catch:{ all -> 0x075a }
            axbf r7 = r7.a()     // Catch:{ all -> 0x075a }
            boolean r7 = r7.o()     // Catch:{ all -> 0x075a }
            if (r7 != 0) goto L_0x00b6
            goto L_0x00d7
        L_0x00b6:
            java.util.List r7 = defpackage.jeo.a(r11, r9, r2)     // Catch:{ all -> 0x075a }
            r0.addAll(r7)     // Catch:{ all -> 0x075a }
            goto L_0x00d7
        L_0x00bf:
            r9 = 0
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r7 = defpackage.jeo.a(r9, r11, r3)     // Catch:{ all -> 0x075a }
            r0.addAll(r7)     // Catch:{ all -> 0x075a }
            java.util.List r7 = defpackage.jeo.a(r9, r11, r2)     // Catch:{ all -> 0x075a }
            r0.addAll(r7)     // Catch:{ all -> 0x075a }
            a((long) r11)     // Catch:{ all -> 0x075a }
        L_0x00d7:
            r1.n = r0     // Catch:{ all -> 0x075a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x075a }
            if (r0 != 0) goto L_0x00e6
            java.util.List r0 = r1.n     // Catch:{ all -> 0x075a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x075a }
            goto L_0x00e7
        L_0x00e6:
            r0 = 0
        L_0x00e7:
            r1.o = r0     // Catch:{ all -> 0x075a }
        L_0x00e9:
            java.util.Iterator r0 = r1.o     // Catch:{ all -> 0x075a }
            if (r0 == 0) goto L_0x0164
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x075a }
            if (r0 == 0) goto L_0x0164
            java.util.Iterator r0 = r1.o     // Catch:{ all -> 0x075a }
            defpackage.iva.a((java.lang.Object) r0)     // Catch:{ all -> 0x075a }
            java.util.List r7 = r1.n     // Catch:{ all -> 0x075a }
            defpackage.iva.a((java.lang.Object) r7)     // Catch:{ all -> 0x075a }
            int r7 = r7.size()     // Catch:{ all -> 0x075a }
            axbe r9 = defpackage.axbe.a     // Catch:{ all -> 0x075a }
            axbf r9 = r9.a()     // Catch:{ all -> 0x075a }
            long r9 = r9.k()     // Catch:{ all -> 0x075a }
            int r10 = (int) r9     // Catch:{ all -> 0x075a }
            int r7 = java.lang.Math.min(r7, r10)     // Catch:{ all -> 0x075a }
            boolean r9 = r6.c     // Catch:{ all -> 0x075a }
            if (r9 != 0) goto L_0x0115
            goto L_0x011a
        L_0x0115:
            r6.c()     // Catch:{ all -> 0x075a }
            r6.c = r3     // Catch:{ all -> 0x075a }
        L_0x011a:
            aucj r9 = r6.b     // Catch:{ all -> 0x075a }
            aohl r9 = (defpackage.aohl) r9     // Catch:{ all -> 0x075a }
            aucx r10 = defpackage.aucj.s()     // Catch:{ all -> 0x075a }
            r9.p = r10     // Catch:{ all -> 0x075a }
            r9 = 0
        L_0x0125:
            if (r9 >= r7) goto L_0x015a
            java.lang.Object r10 = r0.next()     // Catch:{ all -> 0x075a }
            aoid r10 = (defpackage.aoid) r10     // Catch:{ all -> 0x075a }
            boolean r11 = r6.c     // Catch:{ all -> 0x075a }
            if (r11 != 0) goto L_0x0132
            goto L_0x0137
        L_0x0132:
            r6.c()     // Catch:{ all -> 0x075a }
            r6.c = r3     // Catch:{ all -> 0x075a }
        L_0x0137:
            aucj r11 = r6.b     // Catch:{ all -> 0x075a }
            aohl r11 = (defpackage.aohl) r11     // Catch:{ all -> 0x075a }
            r10.getClass()     // Catch:{ all -> 0x075a }
            aucx r12 = r11.p     // Catch:{ all -> 0x075a }
            boolean r12 = r12.a()     // Catch:{ all -> 0x075a }
            if (r12 == 0) goto L_0x0147
            goto L_0x014f
        L_0x0147:
            aucx r12 = r11.p     // Catch:{ all -> 0x075a }
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)     // Catch:{ all -> 0x075a }
            r11.p = r12     // Catch:{ all -> 0x075a }
        L_0x014f:
            aucx r11 = r11.p     // Catch:{ all -> 0x075a }
            r11.add(r10)     // Catch:{ all -> 0x075a }
            r0.remove()     // Catch:{ all -> 0x075a }
            int r9 = r9 + 1
            goto L_0x0125
        L_0x015a:
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x075a }
            r2 = r1
            r17 = r4
            r1 = r6
            goto L_0x06b8
        L_0x0164:
            r2 = r1
            r17 = r4
            r1 = r6
            r0 = 0
            goto L_0x06b8
        L_0x016b:
            java.io.File r0 = r1.i     // Catch:{ all -> 0x075a }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x075a }
            if (r0 == 0) goto L_0x01d2
            java.io.File r0 = r1.i     // Catch:{ all -> 0x075a }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x075a }
            java.lang.String r7 = "alarms"
            boolean r0 = r0.endsWith(r7)     // Catch:{ all -> 0x075a }
            if (r0 == 0) goto L_0x01d2
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x075a }
            r0.<init>()     // Catch:{ all -> 0x075a }
            jje r7 = p     // Catch:{ all -> 0x075a }
            boolean r7 = r1.a(r7, r0)     // Catch:{ all -> 0x075a }
            int r9 = r0.size()     // Catch:{ all -> 0x075a }
            if (r9 <= 0) goto L_0x01ca
            boolean r9 = r6.c     // Catch:{ all -> 0x075a }
            if (r9 != 0) goto L_0x0197
            goto L_0x019c
        L_0x0197:
            r6.c()     // Catch:{ all -> 0x075a }
            r6.c = r3     // Catch:{ all -> 0x075a }
        L_0x019c:
            aucj r9 = r6.b     // Catch:{ all -> 0x075a }
            aohl r9 = (defpackage.aohl) r9     // Catch:{ all -> 0x075a }
            aucx r10 = defpackage.aucj.s()     // Catch:{ all -> 0x075a }
            r9.h = r10     // Catch:{ all -> 0x075a }
            boolean r9 = r6.c     // Catch:{ all -> 0x075a }
            if (r9 != 0) goto L_0x01ab
            goto L_0x01b0
        L_0x01ab:
            r6.c()     // Catch:{ all -> 0x075a }
            r6.c = r3     // Catch:{ all -> 0x075a }
        L_0x01b0:
            aucj r9 = r6.b     // Catch:{ all -> 0x075a }
            aohl r9 = (defpackage.aohl) r9     // Catch:{ all -> 0x075a }
            aucx r10 = r9.h     // Catch:{ all -> 0x075a }
            boolean r10 = r10.a()     // Catch:{ all -> 0x075a }
            if (r10 != 0) goto L_0x01c4
            aucx r10 = r9.h     // Catch:{ all -> 0x075a }
            aucx r10 = defpackage.aucj.a((defpackage.aucx) r10)     // Catch:{ all -> 0x075a }
            r9.h = r10     // Catch:{ all -> 0x075a }
        L_0x01c4:
            aucx r9 = r9.h     // Catch:{ all -> 0x075a }
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r9)     // Catch:{ all -> 0x075a }
            goto L_0x01cb
        L_0x01ca:
        L_0x01cb:
            r2 = r1
            r17 = r4
            r1 = r6
            r0 = r7
            goto L_0x06b8
        L_0x01d2:
            r2 = r1
            r17 = r4
            r1 = r6
            r0 = 0
            goto L_0x06b8
        L_0x01d9:
            boolean r7 = defpackage.jkr.g()     // Catch:{ all -> 0x05df }
            if (r7 != 0) goto L_0x01e0
        L_0x01df:
            goto L_0x01f5
        L_0x01e0:
            agvx r7 = defpackage.jcd.g     // Catch:{ all -> 0x05df }
            java.lang.Object r7 = r7.c()     // Catch:{ all -> 0x05df }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x05df }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x05df }
            if (r7 != 0) goto L_0x01df
            r2 = r1
            r17 = r4
            r1 = r6
            r0 = 0
            goto L_0x06b8
        L_0x01f5:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x05df }
            r7.<init>()     // Catch:{ all -> 0x05df }
            boolean r10 = defpackage.jkr.c()     // Catch:{ all -> 0x05df }
            if (r10 == 0) goto L_0x0391
            agvx r10 = defpackage.jcd.g     // Catch:{ all -> 0x075a }
            java.lang.Object r10 = r10.c()     // Catch:{ all -> 0x075a }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x075a }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x075a }
            if (r10 == 0) goto L_0x0391
            android.database.Cursor r10 = r1.l     // Catch:{ all -> 0x075a }
            if (r10 != 0) goto L_0x021e
            jje r10 = s     // Catch:{ all -> 0x075a }
            android.content.Context r11 = r1.k     // Catch:{ all -> 0x075a }
            java.lang.Object r10 = r10.a(r11)     // Catch:{ all -> 0x075a }
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch:{ all -> 0x075a }
            r1.l = r10     // Catch:{ all -> 0x075a }
        L_0x021e:
            android.database.Cursor r10 = r1.l     // Catch:{ all -> 0x075a }
            if (r10 == 0) goto L_0x0389
            java.lang.String r11 = "tag_androidN"
            int r11 = r10.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x037e }
            java.lang.String r12 = "uid_androidN"
            int r12 = r10.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x037e }
            java.lang.String r13 = "device_state_androidN"
            int r13 = r10.getColumnIndexOrThrow(r13)     // Catch:{ all -> 0x037e }
            java.lang.String r14 = "transport_type_androidN"
            int r14 = r10.getColumnIndexOrThrow(r14)     // Catch:{ all -> 0x037e }
            java.lang.String r15 = "rxbytes_androidN"
            int r15 = r10.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x037e }
            java.lang.String r5 = "rxpackets_androidN"
            int r5 = r10.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x037e }
            java.lang.String r2 = "txbytes_androidN"
            int r2 = r10.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x037e }
            java.lang.String r8 = "txpackets_androidN"
            int r8 = r10.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x037e }
        L_0x0252:
            int r17 = c     // Catch:{ all -> 0x037e }
            if (r17 <= 0) goto L_0x0365
            boolean r17 = r10.moveToNext()     // Catch:{ all -> 0x037e }
            if (r17 == 0) goto L_0x0365
            aoho r17 = defpackage.aoho.s     // Catch:{ all -> 0x037e }
            aucd r0 = r17.o()     // Catch:{ all -> 0x037e }
            int r9 = r10.getInt(r11)     // Catch:{ all -> 0x037e }
            boolean r3 = r0.c     // Catch:{ all -> 0x037e }
            if (r3 != 0) goto L_0x026b
            goto L_0x0271
        L_0x026b:
            r0.c()     // Catch:{ all -> 0x037e }
            r3 = 0
            r0.c = r3     // Catch:{ all -> 0x037e }
        L_0x0271:
            aucj r3 = r0.b     // Catch:{ all -> 0x037e }
            aoho r3 = (defpackage.aoho) r3     // Catch:{ all -> 0x037e }
            r19 = r11
            int r11 = r3.a     // Catch:{ all -> 0x037e }
            r17 = 4
            r11 = r11 | 4
            r3.a = r11     // Catch:{ all -> 0x037e }
            r3.d = r9     // Catch:{ all -> 0x037e }
            int r3 = r10.getInt(r12)     // Catch:{ all -> 0x037e }
            boolean r9 = r0.c     // Catch:{ all -> 0x037e }
            if (r9 != 0) goto L_0x028a
            goto L_0x0290
        L_0x028a:
            r0.c()     // Catch:{ all -> 0x037e }
            r9 = 0
            r0.c = r9     // Catch:{ all -> 0x037e }
        L_0x0290:
            aucj r9 = r0.b     // Catch:{ all -> 0x037e }
            aoho r9 = (defpackage.aoho) r9     // Catch:{ all -> 0x037e }
            int r11 = r9.a     // Catch:{ all -> 0x037e }
            r18 = 2
            r11 = r11 | 2
            r9.a = r11     // Catch:{ all -> 0x037e }
            r9.c = r3     // Catch:{ all -> 0x037e }
            int r3 = r10.getInt(r13)     // Catch:{ all -> 0x037e }
            boolean r9 = r0.c     // Catch:{ all -> 0x037e }
            if (r9 != 0) goto L_0x02a7
            goto L_0x02ad
        L_0x02a7:
            r0.c()     // Catch:{ all -> 0x037e }
            r9 = 0
            r0.c = r9     // Catch:{ all -> 0x037e }
        L_0x02ad:
            aucj r9 = r0.b     // Catch:{ all -> 0x037e }
            aoho r9 = (defpackage.aoho) r9     // Catch:{ all -> 0x037e }
            int r11 = r9.a     // Catch:{ all -> 0x037e }
            r11 = r11 | 2048(0x800, float:2.87E-42)
            r9.a = r11     // Catch:{ all -> 0x037e }
            r9.m = r3     // Catch:{ all -> 0x037e }
            int r3 = r10.getInt(r14)     // Catch:{ all -> 0x037e }
            int r3 = defpackage.aohn.a(r3)     // Catch:{ all -> 0x037e }
            boolean r9 = r0.c     // Catch:{ all -> 0x037e }
            if (r9 != 0) goto L_0x02c6
            goto L_0x02cc
        L_0x02c6:
            r0.c()     // Catch:{ all -> 0x037e }
            r9 = 0
            r0.c = r9     // Catch:{ all -> 0x037e }
        L_0x02cc:
            aucj r9 = r0.b     // Catch:{ all -> 0x037e }
            aoho r9 = (defpackage.aoho) r9     // Catch:{ all -> 0x037e }
            int r11 = r3 + -2
            if (r3 == 0) goto L_0x0362
            r9.n = r11     // Catch:{ all -> 0x037e }
            int r3 = r9.a     // Catch:{ all -> 0x037e }
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            r9.a = r3     // Catch:{ all -> 0x037e }
            r3 = r12
            long r11 = r10.getLong(r15)     // Catch:{ all -> 0x037e }
            boolean r9 = r0.c     // Catch:{ all -> 0x037e }
            if (r9 != 0) goto L_0x02e6
            goto L_0x02ec
        L_0x02e6:
            r0.c()     // Catch:{ all -> 0x037e }
            r9 = 0
            r0.c = r9     // Catch:{ all -> 0x037e }
        L_0x02ec:
            aucj r9 = r0.b     // Catch:{ all -> 0x037e }
            aoho r9 = (defpackage.aoho) r9     // Catch:{ all -> 0x037e }
            r20 = r3
            int r3 = r9.a     // Catch:{ all -> 0x037e }
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            r9.a = r3     // Catch:{ all -> 0x037e }
            r9.o = r11     // Catch:{ all -> 0x037e }
            long r11 = r10.getLong(r5)     // Catch:{ all -> 0x037e }
            boolean r3 = r0.c     // Catch:{ all -> 0x037e }
            if (r3 != 0) goto L_0x0303
            goto L_0x0309
        L_0x0303:
            r0.c()     // Catch:{ all -> 0x037e }
            r3 = 0
            r0.c = r3     // Catch:{ all -> 0x037e }
        L_0x0309:
            aucj r3 = r0.b     // Catch:{ all -> 0x037e }
            aoho r3 = (defpackage.aoho) r3     // Catch:{ all -> 0x037e }
            int r9 = r3.a     // Catch:{ all -> 0x037e }
            r9 = r9 | 16384(0x4000, float:2.2959E-41)
            r3.a = r9     // Catch:{ all -> 0x037e }
            r3.p = r11     // Catch:{ all -> 0x037e }
            long r11 = r10.getLong(r2)     // Catch:{ all -> 0x037e }
            boolean r3 = r0.c     // Catch:{ all -> 0x037e }
            if (r3 != 0) goto L_0x031e
            goto L_0x0324
        L_0x031e:
            r0.c()     // Catch:{ all -> 0x037e }
            r3 = 0
            r0.c = r3     // Catch:{ all -> 0x037e }
        L_0x0324:
            aucj r3 = r0.b     // Catch:{ all -> 0x037e }
            aoho r3 = (defpackage.aoho) r3     // Catch:{ all -> 0x037e }
            int r9 = r3.a     // Catch:{ all -> 0x037e }
            r21 = 32768(0x8000, float:4.5918E-41)
            r9 = r9 | r21
            r3.a = r9     // Catch:{ all -> 0x037e }
            r3.q = r11     // Catch:{ all -> 0x037e }
            long r11 = r10.getLong(r8)     // Catch:{ all -> 0x037e }
            boolean r3 = r0.c     // Catch:{ all -> 0x037e }
            if (r3 != 0) goto L_0x033c
            goto L_0x0342
        L_0x033c:
            r0.c()     // Catch:{ all -> 0x037e }
            r3 = 0
            r0.c = r3     // Catch:{ all -> 0x037e }
        L_0x0342:
            aucj r3 = r0.b     // Catch:{ all -> 0x037e }
            aoho r3 = (defpackage.aoho) r3     // Catch:{ all -> 0x037e }
            int r9 = r3.a     // Catch:{ all -> 0x037e }
            r21 = 65536(0x10000, float:9.18355E-41)
            r9 = r9 | r21
            r3.a = r9     // Catch:{ all -> 0x037e }
            r3.r = r11     // Catch:{ all -> 0x037e }
            aucj r0 = r0.i()     // Catch:{ all -> 0x037e }
            aoho r0 = (defpackage.aoho) r0     // Catch:{ all -> 0x037e }
            r7.add(r0)     // Catch:{ all -> 0x037e }
            r11 = r19
            r12 = r20
            r0 = 2
            r3 = 0
            r9 = 4
            goto L_0x0252
        L_0x0362:
            r2 = 0
            throw r2     // Catch:{ all -> 0x037e }
        L_0x0365:
            boolean r0 = r10.isAfterLast()     // Catch:{ all -> 0x075a }
            if (r0 == 0) goto L_0x0376
            r10.close()     // Catch:{ all -> 0x075a }
            r17 = r4
            r18 = r6
            r3 = r7
            r0 = 0
            goto L_0x0592
        L_0x0376:
            r17 = r4
            r18 = r6
            r3 = r7
            r0 = 1
            goto L_0x0592
        L_0x037e:
            r0 = move-exception
            boolean r2 = r10.isAfterLast()     // Catch:{ all -> 0x075a }
            if (r2 == 0) goto L_0x0388
            r10.close()     // Catch:{ all -> 0x075a }
        L_0x0388:
            throw r0     // Catch:{ all -> 0x075a }
        L_0x0389:
            r17 = r4
            r18 = r6
            r3 = r7
            r0 = 0
            goto L_0x0592
        L_0x0391:
            android.database.Cursor r0 = r1.l     // Catch:{ all -> 0x05df }
            if (r0 != 0) goto L_0x03a1
            jje r0 = t     // Catch:{ all -> 0x075a }
            android.content.Context r2 = r1.k     // Catch:{ all -> 0x075a }
            java.lang.Object r0 = r0.a(r2)     // Catch:{ all -> 0x075a }
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch:{ all -> 0x075a }
            r1.l = r0     // Catch:{ all -> 0x075a }
        L_0x03a1:
            android.database.Cursor r2 = r1.l     // Catch:{ all -> 0x05df }
            if (r2 == 0) goto L_0x058c
            java.lang.String r0 = "iface"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x057f }
            java.lang.String r3 = "tag"
            int r3 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x057f }
            java.lang.String r5 = "uid"
            int r5 = r2.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x057f }
            java.lang.String r8 = "device_state"
            int r8 = r2.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x057f }
            java.lang.String r9 = "transport_type"
            int r9 = r2.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x057f }
            java.lang.String r10 = "background_rxbytes"
            int r10 = r2.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x057f }
            java.lang.String r11 = "background_rxpackets"
            int r11 = r2.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x057f }
            java.lang.String r12 = "background_txbytes"
            int r12 = r2.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x057f }
            java.lang.String r13 = "background_txpackets"
            int r13 = r2.getColumnIndexOrThrow(r13)     // Catch:{ all -> 0x057f }
            java.lang.String r14 = "foreground_rxbytes"
            int r14 = r2.getColumnIndexOrThrow(r14)     // Catch:{ all -> 0x057f }
            java.lang.String r15 = "foreground_rxpackets"
            int r15 = r2.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x057f }
            r17 = r4
            java.lang.String r4 = "foreground_txbytes"
            int r4 = r2.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x057d }
            java.lang.String r1 = "foreground_txpackets"
            int r1 = r2.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x057d }
        L_0x03f5:
            int r18 = c     // Catch:{ all -> 0x057d }
            if (r18 <= 0) goto L_0x056e
            boolean r18 = r2.moveToNext()     // Catch:{ all -> 0x057d }
            if (r18 == 0) goto L_0x056a
            r18 = r6
            java.lang.String r6 = r2.getString(r0)     // Catch:{ all -> 0x057d }
            r19 = r0
            int r0 = r2.getInt(r3)     // Catch:{ all -> 0x057d }
            r20 = r3
            int r3 = r2.getInt(r5)     // Catch:{ all -> 0x057d }
            r21 = r5
            int r5 = r2.getInt(r8)     // Catch:{ all -> 0x057d }
            aoho r22 = defpackage.aoho.s     // Catch:{ all -> 0x057d }
            r23 = r8
            aucd r8 = r22.o()     // Catch:{ all -> 0x057d }
            r22 = r7
            boolean r7 = r8.c     // Catch:{ all -> 0x057d }
            if (r7 != 0) goto L_0x0426
            goto L_0x042c
        L_0x0426:
            r8.c()     // Catch:{ all -> 0x057d }
            r7 = 0
            r8.c = r7     // Catch:{ all -> 0x057d }
        L_0x042c:
            aucj r7 = r8.b     // Catch:{ all -> 0x057d }
            aoho r7 = (defpackage.aoho) r7     // Catch:{ all -> 0x057d }
            r6.getClass()     // Catch:{ all -> 0x057d }
            r24 = r1
            int r1 = r7.a     // Catch:{ all -> 0x057d }
            r16 = 1
            r1 = r1 | 1
            r7.a = r1     // Catch:{ all -> 0x057d }
            r7.b = r6     // Catch:{ all -> 0x057d }
            r1 = r1 | 4
            r7.a = r1     // Catch:{ all -> 0x057d }
            r7.d = r0     // Catch:{ all -> 0x057d }
            r0 = r1 | 2
            r7.a = r0     // Catch:{ all -> 0x057d }
            r7.c = r3     // Catch:{ all -> 0x057d }
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r7.a = r0     // Catch:{ all -> 0x057d }
            r7.m = r5     // Catch:{ all -> 0x057d }
            int r0 = r2.getInt(r9)     // Catch:{ all -> 0x057d }
            int r0 = defpackage.aohn.a(r0)     // Catch:{ all -> 0x057d }
            boolean r1 = r8.c     // Catch:{ all -> 0x057d }
            if (r1 != 0) goto L_0x045e
            goto L_0x0464
        L_0x045e:
            r8.c()     // Catch:{ all -> 0x057d }
            r1 = 0
            r8.c = r1     // Catch:{ all -> 0x057d }
        L_0x0464:
            aucj r1 = r8.b     // Catch:{ all -> 0x057d }
            aoho r1 = (defpackage.aoho) r1     // Catch:{ all -> 0x057d }
            int r3 = r0 + -2
            if (r0 == 0) goto L_0x0567
            r1.n = r3     // Catch:{ all -> 0x057d }
            int r0 = r1.a     // Catch:{ all -> 0x057d }
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.a = r0     // Catch:{ all -> 0x057d }
            long r0 = r2.getLong(r10)     // Catch:{ all -> 0x057d }
            boolean r3 = r8.c     // Catch:{ all -> 0x057d }
            if (r3 != 0) goto L_0x047d
            goto L_0x0483
        L_0x047d:
            r8.c()     // Catch:{ all -> 0x057d }
            r3 = 0
            r8.c = r3     // Catch:{ all -> 0x057d }
        L_0x0483:
            aucj r3 = r8.b     // Catch:{ all -> 0x057d }
            aoho r3 = (defpackage.aoho) r3     // Catch:{ all -> 0x057d }
            int r5 = r3.a     // Catch:{ all -> 0x057d }
            r5 = r5 | 8
            r3.a = r5     // Catch:{ all -> 0x057d }
            r3.e = r0     // Catch:{ all -> 0x057d }
            long r0 = r2.getLong(r11)     // Catch:{ all -> 0x057d }
            boolean r3 = r8.c     // Catch:{ all -> 0x057d }
            if (r3 != 0) goto L_0x0498
            goto L_0x049e
        L_0x0498:
            r8.c()     // Catch:{ all -> 0x057d }
            r3 = 0
            r8.c = r3     // Catch:{ all -> 0x057d }
        L_0x049e:
            aucj r3 = r8.b     // Catch:{ all -> 0x057d }
            aoho r3 = (defpackage.aoho) r3     // Catch:{ all -> 0x057d }
            int r5 = r3.a     // Catch:{ all -> 0x057d }
            r5 = r5 | 16
            r3.a = r5     // Catch:{ all -> 0x057d }
            r3.f = r0     // Catch:{ all -> 0x057d }
            long r0 = r2.getLong(r12)     // Catch:{ all -> 0x057d }
            boolean r3 = r8.c     // Catch:{ all -> 0x057d }
            if (r3 != 0) goto L_0x04b3
            goto L_0x04b9
        L_0x04b3:
            r8.c()     // Catch:{ all -> 0x057d }
            r3 = 0
            r8.c = r3     // Catch:{ all -> 0x057d }
        L_0x04b9:
            aucj r3 = r8.b     // Catch:{ all -> 0x057d }
            aoho r3 = (defpackage.aoho) r3     // Catch:{ all -> 0x057d }
            int r5 = r3.a     // Catch:{ all -> 0x057d }
            r5 = r5 | 32
            r3.a = r5     // Catch:{ all -> 0x057d }
            r3.g = r0     // Catch:{ all -> 0x057d }
            long r0 = r2.getLong(r13)     // Catch:{ all -> 0x057d }
            boolean r3 = r8.c     // Catch:{ all -> 0x057d }
            if (r3 != 0) goto L_0x04ce
            goto L_0x04d4
        L_0x04ce:
            r8.c()     // Catch:{ all -> 0x057d }
            r3 = 0
            r8.c = r3     // Catch:{ all -> 0x057d }
        L_0x04d4:
            aucj r3 = r8.b     // Catch:{ all -> 0x057d }
            aoho r3 = (defpackage.aoho) r3     // Catch:{ all -> 0x057d }
            int r5 = r3.a     // Catch:{ all -> 0x057d }
            r5 = r5 | 64
            r3.a = r5     // Catch:{ all -> 0x057d }
            r3.h = r0     // Catch:{ all -> 0x057d }
            long r0 = r2.getLong(r14)     // Catch:{ all -> 0x057d }
            boolean r3 = r8.c     // Catch:{ all -> 0x057d }
            if (r3 != 0) goto L_0x04e9
            goto L_0x04ef
        L_0x04e9:
            r8.c()     // Catch:{ all -> 0x057d }
            r3 = 0
            r8.c = r3     // Catch:{ all -> 0x057d }
        L_0x04ef:
            aucj r3 = r8.b     // Catch:{ all -> 0x057d }
            aoho r3 = (defpackage.aoho) r3     // Catch:{ all -> 0x057d }
            int r5 = r3.a     // Catch:{ all -> 0x057d }
            r5 = r5 | 128(0x80, float:1.794E-43)
            r3.a = r5     // Catch:{ all -> 0x057d }
            r3.i = r0     // Catch:{ all -> 0x057d }
            long r0 = r2.getLong(r15)     // Catch:{ all -> 0x057d }
            boolean r3 = r8.c     // Catch:{ all -> 0x057d }
            if (r3 != 0) goto L_0x0504
            goto L_0x050a
        L_0x0504:
            r8.c()     // Catch:{ all -> 0x057d }
            r3 = 0
            r8.c = r3     // Catch:{ all -> 0x057d }
        L_0x050a:
            aucj r3 = r8.b     // Catch:{ all -> 0x057d }
            aoho r3 = (defpackage.aoho) r3     // Catch:{ all -> 0x057d }
            int r5 = r3.a     // Catch:{ all -> 0x057d }
            r5 = r5 | 256(0x100, float:3.59E-43)
            r3.a = r5     // Catch:{ all -> 0x057d }
            r3.j = r0     // Catch:{ all -> 0x057d }
            long r0 = r2.getLong(r4)     // Catch:{ all -> 0x057d }
            boolean r3 = r8.c     // Catch:{ all -> 0x057d }
            if (r3 != 0) goto L_0x051f
            goto L_0x0525
        L_0x051f:
            r8.c()     // Catch:{ all -> 0x057d }
            r3 = 0
            r8.c = r3     // Catch:{ all -> 0x057d }
        L_0x0525:
            aucj r3 = r8.b     // Catch:{ all -> 0x057d }
            aoho r3 = (defpackage.aoho) r3     // Catch:{ all -> 0x057d }
            int r5 = r3.a     // Catch:{ all -> 0x057d }
            r5 = r5 | 512(0x200, float:7.175E-43)
            r3.a = r5     // Catch:{ all -> 0x057d }
            r3.k = r0     // Catch:{ all -> 0x057d }
            r0 = r24
            long r5 = r2.getLong(r0)     // Catch:{ all -> 0x057d }
            boolean r1 = r8.c     // Catch:{ all -> 0x057d }
            if (r1 != 0) goto L_0x053c
            goto L_0x0542
        L_0x053c:
            r8.c()     // Catch:{ all -> 0x057d }
            r1 = 0
            r8.c = r1     // Catch:{ all -> 0x057d }
        L_0x0542:
            aucj r1 = r8.b     // Catch:{ all -> 0x057d }
            aoho r1 = (defpackage.aoho) r1     // Catch:{ all -> 0x057d }
            int r3 = r1.a     // Catch:{ all -> 0x057d }
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r1.a = r3     // Catch:{ all -> 0x057d }
            r1.l = r5     // Catch:{ all -> 0x057d }
            aucj r1 = r8.i()     // Catch:{ all -> 0x057d }
            aoho r1 = (defpackage.aoho) r1     // Catch:{ all -> 0x057d }
            r3 = r22
            r3.add(r1)     // Catch:{ all -> 0x057d }
            r1 = r0
            r7 = r3
            r6 = r18
            r0 = r19
            r3 = r20
            r5 = r21
            r8 = r23
            goto L_0x03f5
        L_0x0567:
            r1 = 0
            throw r1     // Catch:{ all -> 0x057d }
        L_0x056a:
            r18 = r6
            r3 = r7
            goto L_0x0571
        L_0x056e:
            r18 = r6
            r3 = r7
        L_0x0571:
            boolean r0 = r2.isAfterLast()     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x057b
            r2.close()     // Catch:{ all -> 0x05da }
            goto L_0x0591
        L_0x057b:
            r0 = 1
            goto L_0x0592
        L_0x057d:
            r0 = move-exception
            goto L_0x0582
        L_0x057f:
            r0 = move-exception
            r17 = r4
        L_0x0582:
            boolean r1 = r2.isAfterLast()     // Catch:{ all -> 0x05da }
            if (r1 == 0) goto L_0x058b
            r2.close()     // Catch:{ all -> 0x05da }
        L_0x058b:
            throw r0     // Catch:{ all -> 0x05da }
        L_0x058c:
            r17 = r4
            r18 = r6
            r3 = r7
        L_0x0591:
            r0 = 0
        L_0x0592:
            boolean r1 = r3.isEmpty()     // Catch:{ all -> 0x05da }
            if (r1 != 0) goto L_0x05d4
            r1 = r18
            boolean r2 = r1.c     // Catch:{ all -> 0x05da }
            if (r2 != 0) goto L_0x059f
            goto L_0x05a5
        L_0x059f:
            r1.c()     // Catch:{ all -> 0x05da }
            r2 = 0
            r1.c = r2     // Catch:{ all -> 0x05da }
        L_0x05a5:
            aucj r2 = r1.b     // Catch:{ all -> 0x05da }
            aohl r2 = (defpackage.aohl) r2     // Catch:{ all -> 0x05da }
            aucx r4 = defpackage.aucj.s()     // Catch:{ all -> 0x05da }
            r2.g = r4     // Catch:{ all -> 0x05da }
            boolean r2 = r1.c     // Catch:{ all -> 0x05da }
            if (r2 != 0) goto L_0x05b4
            goto L_0x05ba
        L_0x05b4:
            r1.c()     // Catch:{ all -> 0x05da }
            r2 = 0
            r1.c = r2     // Catch:{ all -> 0x05da }
        L_0x05ba:
            aucj r2 = r1.b     // Catch:{ all -> 0x05da }
            aohl r2 = (defpackage.aohl) r2     // Catch:{ all -> 0x05da }
            aucx r4 = r2.g     // Catch:{ all -> 0x05da }
            boolean r4 = r4.a()     // Catch:{ all -> 0x05da }
            if (r4 != 0) goto L_0x05ce
            aucx r4 = r2.g     // Catch:{ all -> 0x05da }
            aucx r4 = defpackage.aucj.a((defpackage.aucx) r4)     // Catch:{ all -> 0x05da }
            r2.g = r4     // Catch:{ all -> 0x05da }
        L_0x05ce:
            aucx r2 = r2.g     // Catch:{ all -> 0x05da }
            defpackage.auab.a((java.lang.Iterable) r3, (java.util.List) r2)     // Catch:{ all -> 0x05da }
            goto L_0x05d6
        L_0x05d4:
            r1 = r18
        L_0x05d6:
            r2 = r25
            goto L_0x06b8
        L_0x05da:
            r0 = move-exception
            r2 = r25
            goto L_0x0751
        L_0x05df:
            r0 = move-exception
            r2 = r25
            goto L_0x075c
        L_0x05e4:
            r17 = r4
            r1 = r6
            r2 = r25
            java.io.File r0 = r2.i     // Catch:{ all -> 0x0750 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0750 }
            if (r0 == 0) goto L_0x064c
            java.io.File r0 = r2.i     // Catch:{ all -> 0x0750 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0750 }
            java.lang.String r3 = "wakelocks"
            boolean r0 = r0.endsWith(r3)     // Catch:{ all -> 0x0750 }
            if (r0 == 0) goto L_0x064c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0750 }
            r0.<init>()     // Catch:{ all -> 0x0750 }
            jje r3 = r     // Catch:{ all -> 0x0750 }
            boolean r3 = r2.a(r3, r0)     // Catch:{ all -> 0x0750 }
            boolean r4 = r0.isEmpty()     // Catch:{ all -> 0x0750 }
            if (r4 != 0) goto L_0x064b
            boolean r4 = r1.c     // Catch:{ all -> 0x0750 }
            if (r4 != 0) goto L_0x0615
            goto L_0x061b
        L_0x0615:
            r1.c()     // Catch:{ all -> 0x0750 }
            r4 = 0
            r1.c = r4     // Catch:{ all -> 0x0750 }
        L_0x061b:
            aucj r4 = r1.b     // Catch:{ all -> 0x0750 }
            aohl r4 = (defpackage.aohl) r4     // Catch:{ all -> 0x0750 }
            aucx r5 = defpackage.aucj.s()     // Catch:{ all -> 0x0750 }
            r4.f = r5     // Catch:{ all -> 0x0750 }
            boolean r4 = r1.c     // Catch:{ all -> 0x0750 }
            if (r4 != 0) goto L_0x062a
            goto L_0x0630
        L_0x062a:
            r1.c()     // Catch:{ all -> 0x0750 }
            r4 = 0
            r1.c = r4     // Catch:{ all -> 0x0750 }
        L_0x0630:
            aucj r4 = r1.b     // Catch:{ all -> 0x0750 }
            aohl r4 = (defpackage.aohl) r4     // Catch:{ all -> 0x0750 }
            aucx r5 = r4.f     // Catch:{ all -> 0x0750 }
            boolean r5 = r5.a()     // Catch:{ all -> 0x0750 }
            if (r5 != 0) goto L_0x0644
            aucx r5 = r4.f     // Catch:{ all -> 0x0750 }
            aucx r5 = defpackage.aucj.a((defpackage.aucx) r5)     // Catch:{ all -> 0x0750 }
            r4.f = r5     // Catch:{ all -> 0x0750 }
        L_0x0644:
            aucx r4 = r4.f     // Catch:{ all -> 0x0750 }
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r4)     // Catch:{ all -> 0x0750 }
            goto L_0x06b5
        L_0x064b:
            goto L_0x06b5
        L_0x064c:
            r0 = 0
            goto L_0x06b8
        L_0x064f:
            r2 = r1
            r17 = r4
            r1 = r6
            java.io.File r0 = r2.i     // Catch:{ all -> 0x0750 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0750 }
            if (r0 == 0) goto L_0x06b7
            java.io.File r0 = r2.i     // Catch:{ all -> 0x0750 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0750 }
            java.lang.String r3 = "service_connections"
            boolean r0 = r0.endsWith(r3)     // Catch:{ all -> 0x0750 }
            if (r0 == 0) goto L_0x06b7
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0750 }
            r0.<init>()     // Catch:{ all -> 0x0750 }
            jje r3 = q     // Catch:{ all -> 0x0750 }
            boolean r3 = r2.a(r3, r0)     // Catch:{ all -> 0x0750 }
            boolean r4 = r0.isEmpty()     // Catch:{ all -> 0x0750 }
            if (r4 != 0) goto L_0x06b4
            boolean r4 = r1.c     // Catch:{ all -> 0x0750 }
            if (r4 != 0) goto L_0x067f
            goto L_0x0685
        L_0x067f:
            r1.c()     // Catch:{ all -> 0x0750 }
            r4 = 0
            r1.c = r4     // Catch:{ all -> 0x0750 }
        L_0x0685:
            aucj r4 = r1.b     // Catch:{ all -> 0x0750 }
            aohl r4 = (defpackage.aohl) r4     // Catch:{ all -> 0x0750 }
            aucx r5 = defpackage.aucj.s()     // Catch:{ all -> 0x0750 }
            r4.e = r5     // Catch:{ all -> 0x0750 }
            boolean r4 = r1.c     // Catch:{ all -> 0x0750 }
            if (r4 != 0) goto L_0x0694
            goto L_0x069a
        L_0x0694:
            r1.c()     // Catch:{ all -> 0x0750 }
            r4 = 0
            r1.c = r4     // Catch:{ all -> 0x0750 }
        L_0x069a:
            aucj r4 = r1.b     // Catch:{ all -> 0x0750 }
            aohl r4 = (defpackage.aohl) r4     // Catch:{ all -> 0x0750 }
            aucx r5 = r4.e     // Catch:{ all -> 0x0750 }
            boolean r5 = r5.a()     // Catch:{ all -> 0x0750 }
            if (r5 != 0) goto L_0x06ae
            aucx r5 = r4.e     // Catch:{ all -> 0x0750 }
            aucx r5 = defpackage.aucj.a((defpackage.aucx) r5)     // Catch:{ all -> 0x0750 }
            r4.e = r5     // Catch:{ all -> 0x0750 }
        L_0x06ae:
            aucx r4 = r4.e     // Catch:{ all -> 0x0750 }
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r4)     // Catch:{ all -> 0x0750 }
            goto L_0x06b5
        L_0x06b4:
        L_0x06b5:
            r0 = r3
            goto L_0x06b8
        L_0x06b7:
            r0 = 0
        L_0x06b8:
            r3 = r26
            boolean r4 = r3.a((defpackage.aucd) r1)     // Catch:{ all -> 0x0750 }
            if (r4 == 0) goto L_0x072d
        L_0x06c0:
            int r4 = r17.size()     // Catch:{ all -> 0x0750 }
            r5 = 5
            if (r4 < r5) goto L_0x06d1
            java.lang.Object r4 = r17.removeFirst()     // Catch:{ all -> 0x0750 }
            icf r4 = (defpackage.icf) r4     // Catch:{ all -> 0x0750 }
            r4.a()     // Catch:{ all -> 0x0750 }
            goto L_0x06c0
        L_0x06d1:
            boolean r4 = r1.c     // Catch:{ all -> 0x0750 }
            if (r4 != 0) goto L_0x06d7
            r4 = 0
            goto L_0x06dd
        L_0x06d7:
            r1.c()     // Catch:{ all -> 0x0750 }
            r4 = 0
            r1.c = r4     // Catch:{ all -> 0x0750 }
        L_0x06dd:
            aucj r6 = r1.b     // Catch:{ all -> 0x0750 }
            aohl r6 = (defpackage.aohl) r6     // Catch:{ all -> 0x0750 }
            r28.getClass()     // Catch:{ all -> 0x0750 }
            r7 = r28
            r6.b = r7     // Catch:{ all -> 0x0750 }
            int r8 = r6.a     // Catch:{ all -> 0x0750 }
            r9 = 1
            r8 = r8 | r9
            r6.a = r8     // Catch:{ all -> 0x0750 }
            aucj r1 = r1.i()     // Catch:{ all -> 0x0750 }
            aohl r1 = (defpackage.aohl) r1     // Catch:{ all -> 0x0750 }
            java.util.Iterator r6 = r27.iterator()     // Catch:{ all -> 0x0750 }
        L_0x06f8:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x0750 }
            if (r8 == 0) goto L_0x072a
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0750 }
            hol r8 = (defpackage.hol) r8     // Catch:{ all -> 0x0750 }
            hoi r8 = r8.a((defpackage.audx) r1)     // Catch:{ all -> 0x0750 }
            java.lang.String r10 = r26.a()     // Catch:{ all -> 0x0750 }
            r8.b((java.lang.String) r10)     // Catch:{ all -> 0x0750 }
            int r10 = r26.d()     // Catch:{ all -> 0x0750 }
            int r11 = r10 + -1
            if (r10 == 0) goto L_0x0726
            r8.b((int) r11)     // Catch:{ all -> 0x0750 }
            icf r8 = r8.b()     // Catch:{ all -> 0x0750 }
            r10 = r17
            r10.addLast(r8)     // Catch:{ all -> 0x0758 }
            r17 = r10
            goto L_0x06f8
        L_0x0726:
            r10 = r17
            r1 = 0
            throw r1     // Catch:{ all -> 0x0758 }
        L_0x072a:
            r10 = r17
            goto L_0x0734
        L_0x072d:
            r7 = r28
            r10 = r17
            r4 = 0
            r5 = 5
            r9 = 1
        L_0x0734:
            if (r0 != 0) goto L_0x074a
            r25.a()     // Catch:{ all -> 0x0758 }
        L_0x0739:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0749
            java.lang.Object r0 = r10.removeFirst()
            icf r0 = (defpackage.icf) r0
            r0.a()
            goto L_0x0739
        L_0x0749:
            return
        L_0x074a:
            r1 = r2
            r4 = r10
            r2 = 1
            r3 = 0
            goto L_0x001a
        L_0x0750:
            r0 = move-exception
        L_0x0751:
            r10 = r17
            goto L_0x075d
        L_0x0754:
            r2 = r1
            r10 = r4
            r1 = 0
            throw r1     // Catch:{ all -> 0x0758 }
        L_0x0758:
            r0 = move-exception
            goto L_0x075d
        L_0x075a:
            r0 = move-exception
            r2 = r1
        L_0x075c:
            r10 = r4
        L_0x075d:
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L_0x076d
            java.lang.Object r1 = r10.removeFirst()
            icf r1 = (defpackage.icf) r1
            r1.a()
            goto L_0x075d
        L_0x076d:
            goto L_0x076f
        L_0x076e:
            throw r0
        L_0x076f:
            goto L_0x076e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdk.a(jdd, java.util.List, aohg):void");
    }
}
