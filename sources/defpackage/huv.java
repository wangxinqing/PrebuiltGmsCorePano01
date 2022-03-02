package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.system.Os;
import android.util.Log;
import android.util.LruCache;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.clearcut.store.FlatFileLogStore$InvalidLogFileNameException;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ClosedByInterruptException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;

/* renamed from: huv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class huv implements hvg {
    public static final int a = aubk.k(Integer.MAX_VALUE);
    private static final amsk i = amsk.a(',');
    private static final String[] j = new String[0];
    private static final amsk k = amsk.a('.');
    public final Object b = new Object();
    public final Object c = new Object();
    public final Context d;
    public final File e;
    public final LruCache f = new hug(this, (int) awtf.a.a().k());
    public final LruCache g = new LruCache((int) awtf.a.a().j());
    final ahfv h;
    private final Object l = new Object();
    private final amzy m;
    private final hty n;
    private String o;
    private long p;
    private final LruCache q = new huj(this, (int) awtx.a.a().a());
    private volatile Map r = null;
    private volatile Long s = null;
    private final hoe t;

    public huv(Context context, ahei ahei) {
        File file = new File(context.getFilesDir(), "clearcut");
        hoe a2 = hob.a(context);
        this.d = context;
        this.e = file;
        try {
            this.o = file.getCanonicalPath();
        } catch (IOException e2) {
            Log.e("FlatFileLogStore", "Failed to get the canonical path for root directory.", e2);
        }
        this.m = amzy.a((Object[]) avsd.values());
        this.n = new hty(context, ahei);
        this.p = 0;
        ahee g2 = ahef.g();
        ahai a3 = ahaj.a();
        a3.a(file);
        a3.a("internal_events.pb");
        g2.a(a3.a());
        g2.a((audx) avra.b);
        this.h = ahei.a(g2.a());
        this.t = a2;
    }

    private static int a(aubc aubc) {
        int i2 = 0;
        while (!aubc.z()) {
            try {
                aubc.f(aubc.t());
                i2++;
            } catch (IOException e2) {
                Log.e("FlatFileLogStore", "Error counting log events in stream", e2);
            }
        }
        return i2;
    }

    public static final String[] a(String[] strArr) {
        return strArr == null ? j : strArr;
    }

    private static huk b(aubc aubc) {
        long j2 = Long.MIN_VALUE;
        long j3 = Long.MIN_VALUE;
        while (true) {
            int a2 = aubc.a();
            if (a2 != 0) {
                int b2 = aufy.b(a2);
                if (b2 == 17) {
                    j2 = aubc.e();
                } else if (b2 != 22) {
                    aubc.b(a2);
                } else {
                    j3 = aubc.e();
                }
                if (j3 != Long.MIN_VALUE && j2 != Long.MIN_VALUE) {
                    return new huk(j3, j2);
                }
            } else if (j2 != Long.MIN_VALUE) {
                return new huk(0, j2);
            } else {
                return null;
            }
        }
    }

    public static final int c(File file) {
        InputStream d2;
        try {
            d2 = d(file);
            int a2 = a(aubc.a(d2, a));
            d2.close();
            return a2;
        } catch (IOException e2) {
            String valueOf = String.valueOf(file.getAbsolutePath());
            Log.e("FlatFileLogStore", valueOf.length() == 0 ? new String("Error counting log events in file ") : "Error counting log events in file ".concat(valueOf), e2);
            return 0;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private static InputStream d(File file) {
        List c2 = k.c(file.getName());
        if (c2.isEmpty()) {
            String valueOf = String.valueOf(file.getAbsolutePath());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Empty file name:") : "Empty file name:".concat(valueOf));
        } else if (c2.size() > 2) {
            String valueOf2 = String.valueOf(file.getAbsolutePath());
            throw new FlatFileLogStore$InvalidLogFileNameException(valueOf2.length() == 0 ? new String("Invalid log file name: ") : "Invalid log file name: ".concat(valueOf2));
        } else if (c2.size() == 1) {
            return new FileInputStream(file);
        } else {
            try {
                if (hul.a((String) c2.get(1)) - 1 != 0) {
                    return new GZIPInputStream(new FileInputStream(file));
                }
                return new FileInputStream(file);
            } catch (IllegalArgumentException e2) {
                String valueOf3 = String.valueOf((String) c2.get(1));
                throw new IOException(valueOf3.length() == 0 ? new String("Unsupported compression algorithm: ") : "Unsupported compression algorithm: ".concat(valueOf3), e2);
            }
        }
    }

    private static auay e(File file) {
        InputStream d2;
        auay auay;
        InputStream d3 = d(file);
        try {
            ArrayList arrayList = new ArrayList();
            int i2 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            int i3 = 0;
            while (true) {
                try {
                    byte[] bArr = new byte[i2];
                    int i4 = 0;
                    while (i4 < i2) {
                        int read = d3.read(bArr, i4, i2 - i4);
                        if (read == -1) {
                            break;
                        }
                        i4 += read;
                    }
                    if (i4 != 0) {
                        auay = auay.a(bArr, 0, i4);
                    } else {
                        auay = null;
                    }
                    if (auay != null) {
                        i3 += auay.a();
                        arrayList.add(auay);
                        i2 = Math.min(i2 + i2, FragmentTransaction.TRANSIT_EXIT_MASK);
                    }
                } catch (EOFException e2) {
                    try {
                        d2 = d(file);
                        d2.skip((long) i3);
                        byte[] bArr2 = new byte[1];
                        while (d2.read(bArr2, 0, 1) != -1) {
                            arrayList.add(auay.a(bArr2));
                        }
                        d2.close();
                    } catch (EOFException e3) {
                    } catch (Throwable th) {
                        apev.a(th, th);
                    }
                } catch (Throwable th2) {
                    d2.close();
                    throw th2;
                }
                break;
            }
            auay a2 = auay.a((Iterable) arrayList);
            d3.close();
            return a2;
        } catch (Throwable th3) {
            apev.a(th, th3);
        }
        throw th;
    }

    public final void close() {
        synchronized (this.b) {
            g();
        }
    }

    public final Map f() {
        HashMap hashMap = new HashMap();
        synchronized (this.b) {
            for (File file : b(this.m)) {
                avtn avtn = (avtn) this.q.get(new File(file, "play_logger_context.pb").getAbsolutePath());
                if (avtn != null) {
                    Iterator it = huq.a(file).iterator();
                    long j2 = 0;
                    while (it.hasNext()) {
                        File a2 = ((hup) it).next();
                        if (!a2.getName().equals("play_logger_context.pb")) {
                            j2 += a(a2.length());
                        }
                    }
                    hashMap.put(avtn, new huy(j2));
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        this.f.evictAll();
        this.g.evictAll();
    }

    public final huz h() {
        return new hut(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ff, code lost:
        r22.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.hva i() {
        /*
            r25 = this;
            r7 = r25
            hva r15 = new hva
            r15.<init>()
            java.lang.Object r14 = r7.b
            monitor-enter(r14)
            r25.g()     // Catch:{ all -> 0x0215 }
            hui r13 = new hui     // Catch:{ all -> 0x0215 }
            long r0 = r25.b()     // Catch:{ all -> 0x0215 }
            long r2 = defpackage.awtf.e()     // Catch:{ all -> 0x0215 }
            long r0 = r0 - r2
            r13.<init>(r7, r0)     // Catch:{ all -> 0x0215 }
            long r0 = l()     // Catch:{ all -> 0x0215 }
            r11 = 1
            r16 = r0
            r0 = 0
            r18 = 0
        L_0x0025:
            int r9 = r0 + 1
            long r5 = r13.b     // Catch:{ all -> 0x0215 }
            huu r10 = new huu     // Catch:{ all -> 0x0215 }
            r10.<init>(r7)     // Catch:{ all -> 0x0215 }
            amzy r0 = r7.m     // Catch:{ all -> 0x0206 }
            java.lang.Iterable r0 = r7.b((defpackage.amzy) r0)     // Catch:{ all -> 0x0206 }
            java.util.Iterator r19 = r0.iterator()     // Catch:{ all -> 0x0206 }
        L_0x0038:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x0206 }
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r0 = r19.next()     // Catch:{ all -> 0x0206 }
            r3 = r0
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0206 }
            if (r9 == r11) goto L_0x004b
            r20 = r5
            goto L_0x00ec
        L_0x004b:
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0206 }
            java.lang.String r0 = "play_logger_context.pb"
            r8.<init>(r3, r0)     // Catch:{ all -> 0x0206 }
            byte[] r0 = r7.b((java.io.File) r8)     // Catch:{ IOException -> 0x00ae }
            int r0 = a((byte[]) r0)     // Catch:{ all -> 0x00a7 }
            java.io.File r4 = r8.getParentFile()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x00a7 }
            int r12 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x007e }
            if (r0 != r12) goto L_0x007b
            android.util.LruCache r0 = r7.q     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r8.getAbsolutePath()     // Catch:{ all -> 0x00a7 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x00a7 }
            avtn r0 = (defpackage.avtn) r0     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x0079
            hum r0 = defpackage.hum.FAIL_TO_PARSE_PLC_PROTO     // Catch:{ all -> 0x00a7 }
            goto L_0x00d5
        L_0x0079:
            r0 = 0
            goto L_0x00d5
        L_0x007b:
            hum r0 = defpackage.hum.PLC_HASH_MISMATCH     // Catch:{ NumberFormatException -> 0x007e }
            goto L_0x00d5
        L_0x007e:
            r0 = move-exception
            java.lang.String r12 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00a7 }
            int r12 = r12.length()     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            int r12 = r12 + 26
            r1.<init>(r12)     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "Failed to convert "
            r1.append(r2)     // Catch:{ all -> 0x00a7 }
            r1.append(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = " to int."
            r1.append(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "FlatFileLogStore"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a7 }
            android.util.Log.e(r2, r1, r0)     // Catch:{ all -> 0x00a7 }
            hum r0 = defpackage.hum.FAIL_TO_PARSE_PLC_DIR_NAME     // Catch:{ all -> 0x00a7 }
            goto L_0x00d5
        L_0x00a7:
            r0 = move-exception
            r1 = r0
            r22 = r10
            r5 = r14
            goto L_0x020b
        L_0x00ae:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "FlatFileLogStore"
            java.lang.String r2 = "Failed to read PLC file "
            java.lang.String r4 = r8.getAbsolutePath()     // Catch:{ all -> 0x0206 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0206 }
            int r12 = r4.length()     // Catch:{ all -> 0x0206 }
            if (r12 != 0) goto L_0x00c8
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00a7 }
            r4.<init>(r2)     // Catch:{ all -> 0x00a7 }
            goto L_0x00cc
        L_0x00c8:
            java.lang.String r4 = r2.concat(r4)     // Catch:{ all -> 0x0206 }
        L_0x00cc:
            android.util.Log.e(r0, r4, r1)     // Catch:{ all -> 0x0206 }
            hum r0 = defpackage.hum.FAIL_TO_READ_PLC_FILE     // Catch:{ all -> 0x0206 }
            hun r0 = r0.a(r1)     // Catch:{ all -> 0x0206 }
        L_0x00d5:
            if (r0 == 0) goto L_0x00ea
            r1 = r25
            r2 = r10
            r4 = r15
            r20 = r5
            r5 = r8
            r6 = r0
            long r0 = r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00a7 }
            r13.a(r0)     // Catch:{ all -> 0x00a7 }
            r5 = r20
            goto L_0x0038
        L_0x00ea:
            r20 = r5
        L_0x00ec:
            java.lang.String[] r0 = r3.list()     // Catch:{ all -> 0x0206 }
            java.lang.String[] r0 = a((java.lang.String[]) r0)     // Catch:{ all -> 0x0206 }
            int r1 = r0.length     // Catch:{ all -> 0x0206 }
            if (r1 > r11) goto L_0x0100
            java.util.Set r0 = r10.a     // Catch:{ all -> 0x00a7 }
            r0.add(r3)     // Catch:{ all -> 0x00a7 }
            r5 = r20
            goto L_0x0038
        L_0x0100:
            r2 = 0
        L_0x0101:
            if (r2 >= r1) goto L_0x01b2
            r4 = r0[r2]     // Catch:{ all -> 0x0206 }
            java.lang.String r5 = "play_logger_context.pb"
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0206 }
            if (r5 == 0) goto L_0x0117
            r23 = r1
            r6 = r9
            r22 = r10
            r1 = r13
            r5 = r14
            r10 = 0
            goto L_0x01a6
        L_0x0117:
            r5 = r18 ^ 1
            r8 = r10
            r6 = r9
            r22 = r10
            r9 = r16
            r12 = 1
            r11 = r3
            r23 = r1
            r1 = 0
            r12 = r4
            r1 = r13
            r13 = r5
            r5 = r14
            r14 = r15
            long r8 = a(r8, r9, r11, r12, r13, r14)     // Catch:{ all -> 0x0204 }
            r10 = -1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x01a2
            long r8 = r1.b     // Catch:{ all -> 0x0204 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x01a0
            r8 = 46
            int r8 = r4.indexOf(r8)     // Catch:{ all -> 0x0204 }
            r9 = -1
            if (r8 == r9) goto L_0x014a
            r10 = 0
            java.lang.String r8 = r4.substring(r10, r8)     // Catch:{ all -> 0x0204 }
            goto L_0x014c
        L_0x014a:
            r10 = 0
            r8 = r4
        L_0x014c:
            long r8 = java.lang.Long.parseLong(r8)     // Catch:{ all -> 0x0204 }
            long r11 = r1.b     // Catch:{ all -> 0x0204 }
            long r13 = r1.c     // Catch:{ all -> 0x0204 }
            int r24 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r24 <= 0) goto L_0x0161
            int r11 = r1.size()     // Catch:{ all -> 0x0204 }
            r12 = 1500(0x5dc, float:2.102E-42)
            if (r11 >= r12) goto L_0x0161
            goto L_0x0173
        L_0x0161:
            boolean r11 = r1.isEmpty()     // Catch:{ all -> 0x0204 }
            if (r11 != 0) goto L_0x01a6
            java.lang.Object r11 = r1.peek()     // Catch:{ all -> 0x0204 }
            huh r11 = (defpackage.huh) r11     // Catch:{ all -> 0x0204 }
            long r11 = r11.a     // Catch:{ all -> 0x0204 }
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x01a6
        L_0x0173:
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x0204 }
            r11.<init>(r3, r4)     // Catch:{ all -> 0x0204 }
            long r11 = r11.length()     // Catch:{ all -> 0x0204 }
            huv r4 = r1.d     // Catch:{ all -> 0x0204 }
            long r11 = r4.a((long) r11)     // Catch:{ all -> 0x0204 }
            huh r4 = new huh     // Catch:{ all -> 0x0204 }
            r4.<init>(r8, r11)     // Catch:{ all -> 0x0204 }
            r1.add(r4)     // Catch:{ all -> 0x0204 }
            long r8 = r1.a     // Catch:{ all -> 0x0204 }
            int r4 = r1.size()     // Catch:{ all -> 0x0204 }
            long r13 = (long) r4     // Catch:{ all -> 0x0204 }
            long r8 = java.lang.Math.max(r8, r13)     // Catch:{ all -> 0x0204 }
            r1.a = r8     // Catch:{ all -> 0x0204 }
            long r8 = r1.c     // Catch:{ all -> 0x0204 }
            long r8 = r8 + r11
            r1.c = r8     // Catch:{ all -> 0x0204 }
            r1.a()     // Catch:{ all -> 0x0204 }
            goto L_0x01a6
        L_0x01a0:
            r10 = 0
            goto L_0x01a6
        L_0x01a2:
            r10 = 0
            r1.a(r8)     // Catch:{ all -> 0x0204 }
        L_0x01a6:
            int r2 = r2 + 1
            r13 = r1
            r14 = r5
            r9 = r6
            r10 = r22
            r1 = r23
            r11 = 1
            goto L_0x0101
        L_0x01b2:
            r6 = r9
            r22 = r10
            r1 = r13
            r5 = r14
            r10 = 0
            r5 = r20
            r10 = r22
            r11 = 1
            goto L_0x0038
        L_0x01bf:
            r20 = r5
            r6 = r9
            r22 = r10
            r1 = r13
            r5 = r14
            r10 = 0
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0204 }
            if (r0 != 0) goto L_0x01ff
            java.lang.Object r0 = r1.peek()     // Catch:{ all -> 0x0204 }
            huh r0 = (defpackage.huh) r0     // Catch:{ all -> 0x0204 }
            long r2 = r0.a     // Catch:{ all -> 0x0204 }
            r8 = 1
            long r16 = r2 + r8
            r1.clear()     // Catch:{ all -> 0x0204 }
            long r2 = r1.b     // Catch:{ all -> 0x0204 }
            int r0 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e4
            r2 = 1
            goto L_0x01e8
        L_0x01e4:
            r2 = 1
            if (r6 == r2) goto L_0x01e8
            goto L_0x01ff
        L_0x01e8:
            r22.close()     // Catch:{ all -> 0x0219 }
            long r3 = r1.b     // Catch:{ all -> 0x0219 }
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0202
            r0 = 100
            if (r6 >= r0) goto L_0x0202
            r13 = r1
            r14 = r5
            r0 = r6
            r11 = 1
            r18 = 1
            goto L_0x0025
        L_0x01ff:
            r22.close()     // Catch:{ all -> 0x0219 }
        L_0x0202:
            monitor-exit(r5)     // Catch:{ all -> 0x0219 }
            return r15
        L_0x0204:
            r0 = move-exception
            goto L_0x020a
        L_0x0206:
            r0 = move-exception
            r22 = r10
            r5 = r14
        L_0x020a:
            r1 = r0
        L_0x020b:
            r22.close()     // Catch:{ all -> 0x020f }
            goto L_0x0214
        L_0x020f:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0219 }
        L_0x0214:
            throw r1     // Catch:{ all -> 0x0219 }
        L_0x0215:
            r0 = move-exception
            r5 = r14
        L_0x0217:
            monitor-exit(r5)     // Catch:{ all -> 0x0219 }
            throw r0
        L_0x0219:
            r0 = move-exception
            goto L_0x0217
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.huv.i():hva");
    }

    public final anaf j() {
        anaf a2;
        synchronized (this.c) {
            anab h2 = anaf.h();
            SharedPreferences sharedPreferences = this.d.getSharedPreferences("LogDropPref", 0);
            for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                List c2 = i.c((CharSequence) next.getKey());
                if (c2.size() == 1 && awtj.a.a().c()) {
                    h2.a(new hvf("", (String) c2.get(0)), (Integer) next.getValue());
                }
                if (c2.size() == 2) {
                    h2.a(new hvf((String) c2.get(0), (String) c2.get(1)), (Integer) next.getValue());
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            if (edit.commit()) {
                a2 = h2.a();
            } else {
                throw new IOException("Failed to clear log drop count");
            }
        }
        return a2;
    }

    public final String k() {
        return ((Build.VERSION.SDK_INT >= 24 && this.d.isDeviceProtectedStorage()) ? "DE" : "CE").concat("FlatFileLogStore");
    }

    /* access modifiers changed from: private */
    public final void c(String str, long j2) {
        if (this.r != null) {
            if (!this.r.containsKey(str)) {
                this.r.put(str, new huy());
            }
            ((huy) this.r.get(str)).c += j2;
        }
    }

    public static final long l() {
        return Math.max(0, System.currentTimeMillis() - awtf.a.a().i());
    }

    static int a(byte[] bArr) {
        return jkd.a(bArr, bArr.length, 0);
    }

    public static final long a(huu huu, long j2, File file, String str, boolean z, hva hva) {
        String str2;
        huu huu2 = huu;
        long j3 = j2;
        File file2 = file;
        String str3 = str;
        hva hva2 = hva;
        int indexOf = str3.indexOf(46);
        if (indexOf != -1) {
            try {
                str2 = str3.substring(0, indexOf);
            } catch (NumberFormatException e2) {
                return a(huu2, file2, str3, hva2);
            }
        } else {
            str2 = str3;
        }
        long parseLong = Long.parseLong(str2);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            if (str3.indexOf(46, i2) != -1) {
                return a(huu2, file2, str3, hva2);
            }
            try {
                hul.a(str3.substring(i2));
            } catch (IllegalArgumentException e3) {
                return a(huu2, file2, str3, hva2);
            }
        }
        if (parseLong >= j3) {
            return -1;
        }
        File file3 = new File(file2, str3);
        long length = file3.length();
        int c2 = c(file3);
        if (huu2.a(file3, file.getParentFile().getName(), !z ? hvc.OVERSIZE : hum.LOG_FILE_TOO_OLD, c2)) {
            if (hva2 != null) {
                if (z) {
                    hva2.a += length;
                    hva2.e += (long) c2;
                    if (awtf.a.a().h()) {
                        Date date = new Date(parseLong);
                        Date date2 = new Date(j3);
                        Date date3 = new Date(System.currentTimeMillis());
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
                        try {
                            hve hve = new hve(file.getParentFile().getName(), Long.parseLong(simpleDateFormat.format(date)), Long.parseLong(simpleDateFormat.format(date2)), Long.parseLong(simpleDateFormat.format(date3)));
                            if (!hva2.j.containsKey(hve)) {
                                hva2.j.put(hve, 1L);
                            } else {
                                Map map = hva2.j;
                                map.put(hve, Long.valueOf(((Long) map.get(hve)).longValue() + 1));
                            }
                        } catch (NumberFormatException e4) {
                            Log.e("FlatFileLogStore", "Failed to parse epoch time to date integer.", e4);
                        }
                    }
                } else {
                    hva2.f += (long) c2;
                    hva2.b += length;
                }
            }
            return length;
        }
        Log.e("FlatFileLogStore", String.valueOf(file3.getAbsolutePath()).concat(" could not be deleted."));
        return 0;
    }

    public final List c(String str) {
        InputStream d2;
        ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            g();
            huu huu = new huu(this);
            try {
                anhk i2 = this.m.listIterator();
                while (i2.hasNext()) {
                    File file = new File(this.e.getAbsolutePath().concat("/").concat(Integer.toString(((avsd) i2.next()).f)).concat("/").concat(str));
                    if (file.isDirectory()) {
                        Iterator it = huq.a(file).iterator();
                        while (it.hasNext()) {
                            File a2 = ((hup) it).next();
                            if (a2.isDirectory()) {
                                avtn avtn = (avtn) this.q.get(new File(a2, "play_logger_context.pb").getAbsolutePath());
                                if (avtn != null) {
                                    PlayLoggerContext a3 = hwt.a(avtn);
                                    Iterator it2 = huq.a(a2).iterator();
                                    while (it2.hasNext()) {
                                        File a4 = ((hup) it2).next();
                                        if (!a4.getName().equals("play_logger_context.pb")) {
                                            d2 = d(a4);
                                            aubc a5 = aubc.a(d2);
                                            while (!a5.z()) {
                                                LogEventParcelable logEventParcelable = new LogEventParcelable(a3);
                                                logEventParcelable.b = a5.m();
                                                arrayList.add(logEventParcelable);
                                            }
                                            huu.a(a4);
                                            d2.close();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                huu.close();
            } catch (Throwable th) {
                try {
                    huu.close();
                } catch (Throwable th2) {
                    apev.a(th, th2);
                }
                throw th;
            }
        }
        return arrayList;
        throw th;
    }

    private final Iterable b(amzy amzy) {
        return anbs.a((Iterable) amym.b(anbs.a(anbs.a((Iterable) amym.b(anbs.a(anbs.a(anbs.a((Iterable) amzy, (amqy) new htz(this)), hua.a), hub.a)), huc.a), hud.a)), hue.a);
    }

    public final boolean d() {
        long b2 = b();
        long e2 = awtf.e();
        return b2 > e2 + e2;
    }

    public final int[] d(String str) {
        SharedPreferences sharedPreferences = this.d.getSharedPreferences("TestCodePref", 0);
        synchronized (this.l) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String string = sharedPreferences.getString(str, "");
            if (string.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String a2 : i.a((CharSequence) string)) {
                Integer a3 = aoog.a(a2);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            edit.remove(str);
            if (!edit.commit()) {
                String valueOf = String.valueOf(str);
                Log.e("FlatFileLogStore", valueOf.length() == 0 ? new String("Failed to remove test codes for ") : "Failed to remove test codes for ".concat(valueOf));
            }
            int[] a4 = aoog.a((Collection) arrayList);
            return a4;
        }
    }

    public final long e() {
        anhk i2 = this.m.listIterator();
        long j2 = 0;
        while (i2.hasNext()) {
            File file = new File(this.e, Integer.toString(((avsd) i2.next()).f));
            if (file.isDirectory()) {
                Iterator it = huq.a(file).iterator();
                while (it.hasNext()) {
                    File a2 = ((hup) it).next();
                    if (a2.isDirectory()) {
                        j2 += (long) a(a2.list()).length;
                    }
                }
            }
        }
        return j2;
    }

    public final long b() {
        long longValue;
        if (this.s != null) {
            return this.s.longValue();
        }
        synchronized (this.b) {
            if (this.s == null) {
                long j2 = 0;
                for (File a2 : b(this.m)) {
                    Iterator it = huq.a(a2).iterator();
                    while (it.hasNext()) {
                        File a3 = ((hup) it).next();
                        if (!a3.getName().equals("play_logger_context.pb")) {
                            j2 += a(a3.length());
                        }
                    }
                }
                this.s = Long.valueOf(j2);
            }
            longValue = this.s.longValue();
        }
        return longValue;
    }

    public final int[] e(String str) {
        return aoog.a((Collection) this.n.a(str));
    }

    public final Map c() {
        synchronized (this.b) {
            if (this.r == null) {
                HashMap hashMap = new HashMap();
                for (File file : b(this.m)) {
                    String name = file.getParentFile().getName();
                    if (!hashMap.containsKey(name)) {
                        hashMap.put(name, new huy());
                    }
                    huy huy = (huy) hashMap.get(name);
                    huy.b++;
                    Iterator it = huq.a(file).iterator();
                    while (it.hasNext()) {
                        File a2 = ((hup) it).next();
                        if (!a2.getName().equals("play_logger_context.pb")) {
                            huy.c++;
                            huy.a += a(a2.length());
                        }
                    }
                }
                this.r = hashMap;
                HashMap hashMap2 = new HashMap(this.r);
                return hashMap2;
            }
            HashMap hashMap3 = new HashMap(this.r);
            return hashMap3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.b
            monitor-enter(r0)
            java.util.Map r1 = r3.r     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x001b
            java.util.Map r1 = r3.r     // Catch:{ all -> 0x0034 }
            boolean r1 = r1.containsKey(r4)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x001b
            java.util.Map r1 = r3.r     // Catch:{ all -> 0x0034 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0034 }
            huy r4 = (defpackage.huy) r4     // Catch:{ all -> 0x0034 }
            long r1 = r4.a     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r1
        L_0x001b:
            java.util.Map r1 = r3.r     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            r3.c()     // Catch:{ all -> 0x0034 }
        L_0x0023:
            java.util.Map r1 = r3.r     // Catch:{ all -> 0x0034 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0034 }
            huy r4 = (defpackage.huy) r4     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x0030
            long r1 = r4.a     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x0030:
            r1 = 0
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r1
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.huv.b(java.lang.String):long");
    }

    private final long a(huu huu, File file, hva hva, File file2, hvd hvd) {
        hva hva2 = hva;
        String name = file.getParentFile().getName();
        Iterator it = huq.a(file).iterator();
        long j2 = 0;
        while (it.hasNext()) {
            File a2 = ((hup) it).next();
            if (!a2.getName().equals("play_logger_context.pb")) {
                long length = a2.length();
                int c2 = c(a2);
                if (huu.a(a2, file.getParentFile().getName(), hvd, c2)) {
                    j2 += a(length);
                    if (hva2 != null) {
                        hva2.g += (long) c2;
                        hva2.c += length;
                    }
                }
            } else {
                huu huu2 = huu;
                hvd hvd2 = hvd;
            }
        }
        if (!file2.delete()) {
            Log.e("FlatFileLogStore", String.valueOf(file2.getAbsolutePath()).concat(" could not be deleted."));
        }
        if (!file.delete()) {
            Log.e("FlatFileLogStore", String.valueOf(file.getAbsolutePath()).concat(" could not be deleted."));
        } else {
            if (hva2 != null) {
                hva2.d++;
            }
            b(name, -1);
        }
        return j2;
    }

    public final void b(String str, long j2) {
        if (this.r != null) {
            if (!this.r.containsKey(str)) {
                this.r.put(str, new huy());
            }
            ((huy) this.r.get(str)).b += j2;
            if (((huy) this.r.get(str)).equals(new huy())) {
                this.r.remove(str);
            }
        }
    }

    public final void b(int[] iArr, String str, Collection collection) {
        this.n.a(iArr, str, collection);
    }

    public final byte[] b(File file) {
        FileInputStream fileInputStream;
        try {
            return anne.b(file);
        } catch (ClosedByInterruptException e2) {
            Thread.currentThread().interrupt();
            fileInputStream = new FileInputStream(file);
            byte[] a2 = anmr.a((InputStream) fileInputStream);
            fileInputStream.close();
            return a2;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
            throw th;
        }
    }

    private static final long a(huu huu, File file, String str, hva hva) {
        File file2 = new File(file, str);
        long length = file2.length();
        if (!huu.a(file2, file.getParentFile().getName(), hum.CORRUPTED_LOG_FILE_NAME, 1)) {
            return 0;
        }
        if (hva != null) {
            hva.i++;
        }
        return length;
    }

    static hus a(File file) {
        InputStream d2;
        String name = file.getName();
        try {
            d2 = d(file);
            int i2 = a;
            aubc a2 = aubc.a(d2, i2 + i2);
            a2.c(a2.n());
            hus hus = new hus(name, b(a2));
            d2.close();
            return hus;
        } catch (IOException e2) {
            Log.e("FlatFileLogStore", "Can't get boot count and uptime from log event.", e2);
            return new hus(name, (huk) null);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x00e2 A[EDGE_INSN: B:106:0x00e2->B:40:0x00e2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc A[Catch:{ EOFException -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf A[Catch:{ EOFException -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd A[Catch:{ EOFException -> 0x010c }, LOOP:2: B:23:0x0095->B:39:0x00cd, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.huw a(defpackage.avra r19, defpackage.hus r20, java.io.File r21) {
        /*
            r1 = r19
            r0 = r20
            r2 = r21
            boolean r3 = defpackage.awtf.f()
            if (r1 == 0) goto L_0x0159
            aucx r5 = r1.a
            int r5 = r5.size()
            if (r5 > 0) goto L_0x0016
            goto L_0x0159
        L_0x0016:
            huk r5 = r0.b
            if (r5 == 0) goto L_0x0159
            long r5 = r5.a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0159
            aucx r5 = r1.a
            int r5 = r5.size()
            aucx r6 = r1.a
            int r5 = r5 + -1
            java.lang.Object r5 = r6.get(r5)
            avqz r5 = (defpackage.avqz) r5
            huk r6 = r0.b
            huk r9 = new huk
            int r10 = r5.b
            long r10 = (long) r10
            long r12 = r5.c
            r9.<init>(r10, r12)
            int r5 = r6.compareTo(r9)
            if (r5 >= 0) goto L_0x0159
            r5 = 0
        L_0x0045:
            aucx r6 = r1.a
            java.lang.Object r6 = r6.get(r5)
            avqz r6 = (defpackage.avqz) r6
            huk r9 = r0.b
            huk r10 = new huk
            int r11 = r6.b
            long r11 = (long) r11
            long r13 = r6.c
            r10.<init>(r11, r13)
            int r9 = r9.compareTo(r10)
            if (r9 < 0) goto L_0x006a
            int r5 = r5 + 1
            aucx r9 = r1.a
            int r9 = r9.size()
            if (r5 < r9) goto L_0x0045
            goto L_0x006b
        L_0x006a:
        L_0x006b:
            auaw r9 = defpackage.auay.m()
            aubk r10 = defpackage.aubk.a((java.io.OutputStream) r9)
            java.io.InputStream r11 = d((java.io.File) r21)
            int r0 = a     // Catch:{ all -> 0x014d }
            int r0 = r0 + r0
            aubc r0 = defpackage.aubc.a((java.io.InputStream) r11, (int) r0)     // Catch:{ all -> 0x014d }
            int r12 = r0.n()     // Catch:{ all -> 0x014d }
            byte[] r12 = r0.e(r12)     // Catch:{ all -> 0x014d }
            r10.c((byte[]) r12)     // Catch:{ all -> 0x014d }
            r13 = 0
            r14 = 1
            r15 = 0
        L_0x008c:
            if (r13 == 0) goto L_0x008f
            goto L_0x0095
        L_0x008f:
            boolean r16 = r0.z()     // Catch:{ EOFException -> 0x0113 }
            if (r16 != 0) goto L_0x0110
        L_0x0095:
            if (r6 == 0) goto L_0x00b6
            if (r15 == 0) goto L_0x00b6
            r20 = r5
            long r4 = r15.a     // Catch:{ EOFException -> 0x010c }
            int r17 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r17 == 0) goto L_0x00b8
            huk r4 = new huk     // Catch:{ EOFException -> 0x010c }
            int r5 = r6.b     // Catch:{ EOFException -> 0x010c }
            long r7 = (long) r5     // Catch:{ EOFException -> 0x010c }
            r18 = r13
            long r12 = r6.c     // Catch:{ EOFException -> 0x010c }
            r4.<init>(r7, r12)     // Catch:{ EOFException -> 0x010c }
            int r4 = r15.compareTo(r4)     // Catch:{ EOFException -> 0x010c }
            if (r4 < 0) goto L_0x00ba
            r13 = r18
            goto L_0x00e2
        L_0x00b6:
            r20 = r5
        L_0x00b8:
            r18 = r13
        L_0x00ba:
            if (r18 != 0) goto L_0x00bf
            r13 = r18
            goto L_0x00c7
        L_0x00bf:
            r13 = r18
            r10.c((byte[]) r13)     // Catch:{ EOFException -> 0x010c }
            int r14 = r14 + 1
            r13 = 0
        L_0x00c7:
            boolean r4 = r0.z()     // Catch:{ EOFException -> 0x010c }
            if (r4 != 0) goto L_0x00e2
            int r4 = r0.n()     // Catch:{ EOFException -> 0x010c }
            byte[] r13 = r0.e(r4)     // Catch:{ EOFException -> 0x010c }
            aubc r4 = defpackage.aubc.a((byte[]) r13)     // Catch:{ EOFException -> 0x010c }
            huk r15 = b((defpackage.aubc) r4)     // Catch:{ EOFException -> 0x010c }
            r5 = r20
            r7 = 0
            goto L_0x0095
        L_0x00e2:
            if (r6 != 0) goto L_0x00e9
            r5 = r20
            r7 = 0
            goto L_0x008c
        L_0x00e9:
            auay r4 = r6.e     // Catch:{ EOFException -> 0x010c }
            r10.a((defpackage.auay) r4)     // Catch:{ EOFException -> 0x010c }
            int r4 = r20 + 1
            aucx r6 = r1.a     // Catch:{ EOFException -> 0x0109 }
            int r6 = r6.size()     // Catch:{ EOFException -> 0x0109 }
            if (r4 < r6) goto L_0x00fd
            r5 = r4
            r6 = 0
            r7 = 0
            goto L_0x008c
        L_0x00fd:
            aucx r6 = r1.a     // Catch:{ EOFException -> 0x0109 }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ EOFException -> 0x0109 }
            avqz r6 = (defpackage.avqz) r6     // Catch:{ EOFException -> 0x0109 }
            r5 = r4
            r7 = 0
            goto L_0x008c
        L_0x0109:
            r0 = move-exception
            r5 = r4
            goto L_0x0118
        L_0x010c:
            r0 = move-exception
            r5 = r20
            goto L_0x0118
        L_0x0110:
            r20 = r5
            goto L_0x0116
        L_0x0113:
            r0 = move-exception
            r20 = r5
        L_0x0116:
            r5 = r20
        L_0x0118:
            r11.close()
        L_0x011b:
            aucx r0 = r1.a
            int r0 = r0.size()
            if (r5 >= r0) goto L_0x0133
            aucx r0 = r1.a
            java.lang.Object r0 = r0.get(r5)
            avqz r0 = (defpackage.avqz) r0
            auay r0 = r0.e
            r10.a((defpackage.auay) r0)
            int r5 = r5 + 1
            goto L_0x011b
        L_0x0133:
            r10.c()
            if (r3 == 0) goto L_0x0142
            huw r0 = new huw
            auay r1 = r9.a()
            r0.<init>(r2, r1, r14)
            return r0
        L_0x0142:
            huw r0 = new huw
            auay r1 = r9.a()
            r3 = 1
            r0.<init>(r2, r1, r3)
            return r0
        L_0x014d:
            r0 = move-exception
            r1 = r0
            r11.close()     // Catch:{ all -> 0x0153 }
            goto L_0x0158
        L_0x0153:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)
        L_0x0158:
            throw r1
        L_0x0159:
            awtf r0 = defpackage.awtf.a
            awtg r0 = r0.a()
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x019a
            java.io.InputStream r1 = d((java.io.File) r21)
            if (r3 == 0) goto L_0x0180
            auay r0 = defpackage.auay.a((java.io.InputStream) r1)     // Catch:{ all -> 0x018e }
            aubc r3 = r0.h()     // Catch:{ all -> 0x018e }
            int r3 = a((defpackage.aubc) r3)     // Catch:{ all -> 0x018e }
            huw r4 = new huw     // Catch:{ all -> 0x018e }
            r4.<init>(r2, r0, r3)     // Catch:{ all -> 0x018e }
            r1.close()
            return r4
        L_0x0180:
            huw r0 = new huw     // Catch:{ all -> 0x018e }
            auay r3 = defpackage.auay.a((java.io.InputStream) r1)     // Catch:{ all -> 0x018e }
            r4 = 1
            r0.<init>(r2, r3, r4)     // Catch:{ all -> 0x018e }
            r1.close()
            return r0
        L_0x018e:
            r0 = move-exception
            r2 = r0
            r1.close()     // Catch:{ all -> 0x0194 }
            goto L_0x0199
        L_0x0194:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)
        L_0x0199:
            throw r2
        L_0x019a:
            if (r3 == 0) goto L_0x01ae
            auay r0 = e((java.io.File) r21)
            aubc r1 = r0.h()
            int r1 = a((defpackage.aubc) r1)
            huw r3 = new huw
            r3.<init>(r2, r0, r1)
            return r3
        L_0x01ae:
            huw r0 = new huw
            auay r1 = e((java.io.File) r21)
            r3 = 1
            r0.<init>(r2, r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.huv.a(avra, hus, java.io.File):huw");
    }

    private static final void a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final long a(long j2) {
        String str;
        long j3 = this.p;
        if (j3 == 0) {
            try {
                this.p = 4096;
                File absoluteFile = this.e.getAbsoluteFile();
                if (!absoluteFile.exists()) {
                    str = absoluteFile.getParent();
                } else {
                    str = absoluteFile.getAbsolutePath();
                }
                if (str != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    long j4 = Os.statvfs(str).f_frsize;
                    if (j4 >= 128 && j4 < 500000) {
                        this.p = j4;
                    }
                }
                j3 = this.p;
            } catch (Throwable th) {
                j3 = this.p;
            }
        }
        return ((j2 / j3) + ((long) (j2 % j3 == 0 ? 0 : 1))) * j3;
    }

    public final Map a(amzy amzy) {
        avtn avtn;
        anax a2 = hvi.a(this.d);
        HashMap hashMap = new HashMap();
        synchronized (this.b) {
            for (File file : b(amzy)) {
                avtn avtn2 = (avtn) this.q.get(new File(file, "play_logger_context.pb").getAbsolutePath());
                if (avtn2 != null) {
                    if (!a2.contains(hwt.b(avtn2))) {
                        avtn = hwt.c(avtn2);
                    } else {
                        avtn = avtn2;
                    }
                    Collection collection = (Collection) hashMap.get(avtn);
                    if (collection == null) {
                        collection = new ArrayList();
                        hashMap.put(avtn, collection);
                    }
                    try {
                        collection.add(new hvl(avtn2, Long.parseLong(file.getName())));
                    } catch (NumberFormatException e2) {
                        String name = file.getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25);
                        sb.append("Failed to parse ");
                        sb.append(name);
                        sb.append(" to long.");
                        Log.e("FlatFileLogStore", sb.toString(), e2);
                    }
                }
            }
        }
        return hashMap;
    }

    public final void a(int i2) {
        Integer num;
        try {
            num = (Integer) acws.a(this.t.a(), awso.a.a().a(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("FlatFileLogStore", "Failed to get boot count.", e2);
            num = null;
        }
        if (num != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long currentTimeMillis = System.currentTimeMillis();
            aucf aucf = (aucf) avrm.t.o();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrm avrm = (avrm) aucf.b;
            int i3 = avrm.a | 1;
            avrm.a = i3;
            avrm.b = currentTimeMillis;
            avrm.a = i3 | 2;
            avrm.c = elapsedRealtime;
            int a2 = avrl.a(i2);
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrm avrm2 = (avrm) aucf.b;
            int i4 = a2 - 1;
            if (a2 != 0) {
                avrm2.n = i4;
                avrm2.a |= 1048576;
                avrm avrm3 = (avrm) aucf.i();
                aucd o2 = avqz.f.o();
                int intValue = num.intValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                avqz avqz = (avqz) o2.b;
                int i5 = avqz.a | 1;
                avqz.a = i5;
                avqz.b = intValue;
                int i6 = i5 | 2;
                avqz.a = i6;
                avqz.c = elapsedRealtime;
                avqz.a = i6 | 4;
                avqz.d = currentTimeMillis;
                auay au = avrm3.au();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                avqz avqz2 = (avqz) o2.b;
                au.getClass();
                avqz2.a |= 8;
                avqz2.e = au;
                try {
                    aosr.a(this.h.a((amqy) new huf(Math.max(0, System.currentTimeMillis() - awtf.a.a().f()), new huk((long) num.intValue(), elapsedRealtime), o2), (Executor) aoqm.a));
                } catch (ExecutionException e3) {
                    Log.e("FlatFileLogStore", "Failed to update Clearcut internal events.", e3);
                }
            } else {
                throw null;
            }
        }
    }

    public final void a(String str, long j2) {
        long j3;
        long a2 = a(Math.abs(j2));
        if (this.s != null) {
            long longValue = this.s.longValue();
            if (j2 < 0) {
                j3 = -a2;
            } else {
                j3 = a2;
            }
            this.s = Long.valueOf(longValue + j3);
        }
        if (this.r != null) {
            if (!this.r.containsKey(str)) {
                this.r.put(str, new huy());
            }
            huy huy = (huy) this.r.get(str);
            long j4 = huy.a;
            if (j2 < 0) {
                a2 = -a2;
            }
            huy.a = j4 + a2;
        }
    }

    public final void a(String str, hvd hvd, int i2) {
        hsa.a(str, hvd.a(), i2);
        String valueOf = String.valueOf(hvd);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(",");
        sb.append(valueOf);
        String sb2 = sb.toString();
        SharedPreferences sharedPreferences = this.d.getSharedPreferences("LogDropPref", 0);
        synchronized (this.c) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(sb2, sharedPreferences.getInt(sb2, 0) + i2);
            if (!edit.commit()) {
                StringBuilder sb3 = new StringBuilder(40);
                sb3.append("Failed to record ");
                sb3.append(i2);
                sb3.append("dropped logs");
                Log.e("FlatFileLogStore", sb3.toString());
            }
        }
    }

    public final void a(Collection collection) {
        synchronized (this.b) {
            huu huu = new huu(this);
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    anhk i2 = ((hux) it.next()).c.listIterator();
                    while (i2.hasNext()) {
                        File file = ((huw) i2.next()).a;
                        if (file != null) {
                            huu.a(file);
                        }
                    }
                }
                huu.close();
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        return;
        throw th;
    }

    public final void a(int[] iArr, String str, Collection collection) {
        SharedPreferences sharedPreferences = this.d.getSharedPreferences("TestCodePref", 0);
        synchronized (this.l) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!str2.equals(str)) {
                    HashSet hashSet = new HashSet();
                    for (int valueOf : iArr) {
                        hashSet.add(Integer.valueOf(valueOf));
                    }
                    String string = sharedPreferences.getString(str2, "");
                    if (!string.isEmpty()) {
                        for (String a2 : i.a((CharSequence) string)) {
                            Integer a3 = aoog.a(a2);
                            if (a3 != null) {
                                hashSet.add(a3);
                            }
                        }
                    }
                    edit.putString(str2, amre.a(",").a((Iterable) hashSet));
                }
            }
            if (!edit.commit()) {
                Log.e("FlatFileLogStore", "Failed to persist test codes.");
            }
        }
    }

    public final boolean a() {
        File file = new File(this.e, Integer.toString(3));
        if (!file.isDirectory()) {
            return false;
        }
        Iterator it = huq.a(file).iterator();
        while (it.hasNext()) {
            File a2 = ((hup) it).next();
            if (a2.isDirectory() && a(a2.list()).length > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r25v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r25v1 */
    /* JADX WARNING: type inference failed for: r25v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0396, code lost:
        if (r1.f >= defpackage.awtf.a.a().r()) goto L_0x0398;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0235 A[Catch:{ all -> 0x00cb, all -> 0x03ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0236 A[Catch:{ all -> 0x00cb, all -> 0x03ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0285 A[Catch:{ all -> 0x00cb, all -> 0x03ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0292 A[Catch:{ all -> 0x00cb, all -> 0x03ce }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.avtn r27, defpackage.auay r28) {
        /*
            r26 = this;
            r7 = r26
            r12 = r27
            java.lang.String r15 = defpackage.hwt.b(r27)
            awtf r0 = defpackage.awtf.a
            awtg r0 = r0.a()
            java.lang.String r0 = r0.b()
            r13 = 1
            int r0 = defpackage.hul.a((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x001a }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException -> 0x001a }
            goto L_0x001c
        L_0x001a:
            r0 = move-exception
            r0 = 1
        L_0x001c:
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "Clearcut flat file serialize PLC proto"
            android.os.Trace.beginSection(r1)
            byte[] r8 = r27.k()
            r19 = 0
            if (r8 != 0) goto L_0x0031
            hum r0 = defpackage.hum.PLC_TO_BYTES_FAIL
            r7.a((java.lang.String) r15, (defpackage.hvd) r0, (int) r13)
            return r19
        L_0x0031:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.os.Trace.endSection()
            int r14 = a((byte[]) r8)
            java.io.File r1 = r7.e
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r2 = "/"
            java.lang.String r1 = r1.concat(r2)
            int r2 = r12.k
            java.lang.String r2 = java.lang.Integer.toString(r2)
            java.lang.String r1 = r1.concat(r2)
            java.lang.String r2 = "/"
            java.lang.String r1 = r1.concat(r2)
            java.lang.String r1 = r1.concat(r15)
            java.lang.String r2 = "/"
            java.lang.String r1 = r1.concat(r2)
            java.lang.String r2 = java.lang.String.valueOf(r14)
            java.lang.String r1 = r1.concat(r2)
            java.io.File r9 = new java.io.File
            r9.<init>(r1)
            java.io.File r10 = new java.io.File
            java.lang.String r1 = "play_logger_context.pb"
            r10.<init>(r9, r1)
            java.lang.Object r11 = r7.b
            monitor-enter(r11)
            boolean r1 = r9.exists()     // Catch:{ all -> 0x03ce }
            if (r1 != 0) goto L_0x007e
        L_0x007d:
            goto L_0x00d1
        L_0x007e:
            java.lang.String[] r1 = r9.list()     // Catch:{ all -> 0x03ce }
            java.lang.String[] r1 = a((java.lang.String[]) r1)     // Catch:{ all -> 0x03ce }
            int r1 = r1.length     // Catch:{ all -> 0x03ce }
            if (r1 <= 0) goto L_0x007d
            boolean r1 = r10.exists()     // Catch:{ all -> 0x03ce }
            if (r1 != 0) goto L_0x007d
            android.util.LruCache r1 = r7.f     // Catch:{ all -> 0x03ce }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x03ce }
            r1.remove(r2)     // Catch:{ all -> 0x03ce }
            android.util.LruCache r1 = r7.g     // Catch:{ all -> 0x03ce }
            r1.remove(r2)     // Catch:{ all -> 0x03ce }
            huu r6 = new huu     // Catch:{ all -> 0x03ce }
            r6.<init>(r7)     // Catch:{ all -> 0x03ce }
            r4 = 0
            hum r16 = defpackage.hum.DIR_HAS_NO_PLC_FILE     // Catch:{ all -> 0x00c3 }
            r1 = r26
            r2 = r6
            r3 = r9
            r5 = r10
            r17 = r6
            r6 = r16
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00c1 }
            r17.close()     // Catch:{ all -> 0x03ce }
            boolean r1 = r9.exists()     // Catch:{ all -> 0x03ce }
            if (r1 == 0) goto L_0x00d1
            hum r0 = defpackage.hum.FAIL_TO_DELETE_PLC_DIR     // Catch:{ all -> 0x03ce }
            r7.a((java.lang.String) r15, (defpackage.hvd) r0, (int) r13)     // Catch:{ all -> 0x03ce }
            monitor-exit(r11)     // Catch:{ all -> 0x03ce }
            return r19
        L_0x00c1:
            r0 = move-exception
            goto L_0x00c6
        L_0x00c3:
            r0 = move-exception
            r17 = r6
        L_0x00c6:
            r1 = r0
            r17.close()     // Catch:{ all -> 0x00cb }
            goto L_0x00d0
        L_0x00cb:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x03ce }
        L_0x00d0:
            throw r1     // Catch:{ all -> 0x03ce }
        L_0x00d1:
            android.util.LruCache r1 = r7.f     // Catch:{ all -> 0x03ce }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x03ce }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x03ce }
            huo r1 = (defpackage.huo) r1     // Catch:{ all -> 0x03ce }
            r20 = 0
            if (r1 == 0) goto L_0x011b
            avtn r2 = r1.c     // Catch:{ all -> 0x03ce }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x03ce }
            if (r2 != 0) goto L_0x00f0
            hum r0 = defpackage.hum.PLC_HASH_COLLISION     // Catch:{ all -> 0x03ce }
            r7.a((java.lang.String) r15, (defpackage.hvd) r0, (int) r13)     // Catch:{ all -> 0x03ce }
            monitor-exit(r11)     // Catch:{ all -> 0x03ce }
            return r19
        L_0x00f0:
            java.io.File r2 = r1.b     // Catch:{ all -> 0x03ce }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x03ce }
            java.lang.String r3 = defpackage.hul.a((int) r0)     // Catch:{ all -> 0x03ce }
            boolean r2 = r2.endsWith(r3)     // Catch:{ all -> 0x03ce }
            if (r2 == 0) goto L_0x010d
            long r2 = r1.f     // Catch:{ all -> 0x03ce }
            long r4 = defpackage.awtf.d()     // Catch:{ all -> 0x03ce }
            int r16 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r16 <= 0) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r2 = 1
            goto L_0x011c
        L_0x010d:
            android.util.LruCache r1 = r7.f     // Catch:{ all -> 0x03ce }
            r1.remove(r6)     // Catch:{ all -> 0x03ce }
            android.util.LruCache r1 = r7.g     // Catch:{ all -> 0x03ce }
            r1.remove(r6)     // Catch:{ all -> 0x03ce }
            r1 = r20
            r2 = 1
            goto L_0x011c
        L_0x011b:
            r2 = 0
        L_0x011c:
            r21 = 2
            r5 = 3
            r22 = 0
            if (r1 != 0) goto L_0x0300
            java.lang.String r1 = r7.o     // Catch:{ all -> 0x03ce }
            if (r1 == 0) goto L_0x013a
            java.lang.String r1 = r9.getCanonicalPath()     // Catch:{ all -> 0x03ce }
            java.lang.String r3 = r7.o     // Catch:{ all -> 0x03ce }
            boolean r1 = r1.startsWith(r3)     // Catch:{ all -> 0x03ce }
            if (r1 != 0) goto L_0x013a
            hum r0 = defpackage.hum.DIR_TRAVERSAL_ATTACK     // Catch:{ all -> 0x03ce }
            r7.a((java.lang.String) r15, (defpackage.hvd) r0, (int) r13)     // Catch:{ all -> 0x03ce }
            monitor-exit(r11)     // Catch:{ all -> 0x03ce }
            return r19
        L_0x013a:
            boolean r1 = r9.exists()     // Catch:{ all -> 0x03ce }
            r3 = 1
            if (r1 != 0) goto L_0x0169
            boolean r1 = r9.mkdirs()     // Catch:{ all -> 0x03ce }
            if (r1 == 0) goto L_0x014d
            r7.b(r15, r3)     // Catch:{ all -> 0x03ce }
            goto L_0x0169
        L_0x014d:
            com.google.android.gms.clearcut.store.FlatFileLogStore$CantCreateDirException r0 = new com.google.android.gms.clearcut.store.FlatFileLogStore$CantCreateDirException     // Catch:{ all -> 0x03ce }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x03ce }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x03ce }
            int r3 = r12.k     // Catch:{ all -> 0x03ce }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x03ce }
            r2[r19] = r3     // Catch:{ all -> 0x03ce }
            r2[r13] = r15     // Catch:{ all -> 0x03ce }
            r2[r21] = r6     // Catch:{ all -> 0x03ce }
            java.lang.String r3 = "Creating PlcHash directory '%s/%s/%s' failed."
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)     // Catch:{ all -> 0x03ce }
            r0.<init>(r1)     // Catch:{ all -> 0x03ce }
            throw r0     // Catch:{ all -> 0x03ce }
        L_0x0169:
            if (r2 != 0) goto L_0x01fd
            boolean r1 = r10.exists()     // Catch:{ all -> 0x03ce }
            if (r1 == 0) goto L_0x01f6
            byte[] r1 = r7.b((java.io.File) r10)     // Catch:{ all -> 0x03ce }
            boolean r2 = java.util.Arrays.equals(r1, r8)     // Catch:{ all -> 0x03ce }
            if (r2 != 0) goto L_0x01f2
            int r1 = a((byte[]) r1)     // Catch:{ all -> 0x03ce }
            if (r1 == r14) goto L_0x01eb
            huu r2 = new huu     // Catch:{ all -> 0x03ce }
            r2.<init>(r7)     // Catch:{ all -> 0x03ce }
            r16 = 0
            hum r17 = defpackage.hum.CORRUPTED_PLC_FILE     // Catch:{ all -> 0x01dd }
            r1 = r26
            r18 = r2
            r3 = r9
            r4 = r16
            r5 = r10
            r24 = r6
            r6 = r17
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x01db }
            r18.close()     // Catch:{ all -> 0x03ce }
            boolean r1 = r9.exists()     // Catch:{ all -> 0x03ce }
            if (r1 == 0) goto L_0x01a9
            hum r0 = defpackage.hum.FAIL_TO_DELETE_PLC_DIR     // Catch:{ all -> 0x03ce }
            r7.a((java.lang.String) r15, (defpackage.hvd) r0, (int) r13)     // Catch:{ all -> 0x03ce }
            monitor-exit(r11)     // Catch:{ all -> 0x03ce }
            return r19
        L_0x01a9:
            boolean r1 = r9.mkdirs()     // Catch:{ all -> 0x03ce }
            if (r1 == 0) goto L_0x01bc
            r1 = 1
            r7.b(r15, r1)     // Catch:{ all -> 0x03ce }
            a((java.io.File) r10, (byte[]) r8)     // Catch:{ all -> 0x03ce }
            r4 = r24
            r3 = 3
            goto L_0x0200
        L_0x01bc:
            com.google.android.gms.clearcut.store.FlatFileLogStore$CantCreateDirException r0 = new com.google.android.gms.clearcut.store.FlatFileLogStore$CantCreateDirException     // Catch:{ all -> 0x03ce }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x03ce }
            r3 = 3
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x03ce }
            int r3 = r12.k     // Catch:{ all -> 0x03ce }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x03ce }
            r2[r19] = r3     // Catch:{ all -> 0x03ce }
            r2[r13] = r15     // Catch:{ all -> 0x03ce }
            r4 = r24
            r2[r21] = r4     // Catch:{ all -> 0x03ce }
            java.lang.String r3 = "Creating PlcHash directory '%s/%s/%s' failed."
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)     // Catch:{ all -> 0x03ce }
            r0.<init>(r1)     // Catch:{ all -> 0x03ce }
            throw r0     // Catch:{ all -> 0x03ce }
        L_0x01db:
            r0 = move-exception
            goto L_0x01e0
        L_0x01dd:
            r0 = move-exception
            r18 = r2
        L_0x01e0:
            r1 = r0
            r18.close()     // Catch:{ all -> 0x01e5 }
            goto L_0x01ea
        L_0x01e5:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x03ce }
        L_0x01ea:
            throw r1     // Catch:{ all -> 0x03ce }
        L_0x01eb:
            hum r0 = defpackage.hum.PLC_HASH_COLLISION     // Catch:{ all -> 0x03ce }
            r7.a((java.lang.String) r15, (defpackage.hvd) r0, (int) r13)     // Catch:{ all -> 0x03ce }
            monitor-exit(r11)     // Catch:{ all -> 0x03ce }
            return r19
        L_0x01f2:
            r1 = r3
            r4 = r6
            r3 = 3
            goto L_0x0200
        L_0x01f6:
            r1 = r3
            r4 = r6
            r3 = 3
            a((java.io.File) r10, (byte[]) r8)     // Catch:{ all -> 0x03ce }
            goto L_0x0200
        L_0x01fd:
            r1 = r3
            r4 = r6
            r3 = 3
        L_0x0200:
            android.util.LruCache r5 = r7.g     // Catch:{ all -> 0x03ce }
            java.lang.Object r4 = r5.remove(r4)     // Catch:{ all -> 0x03ce }
            hur r4 = (defpackage.hur) r4     // Catch:{ all -> 0x03ce }
            if (r4 == 0) goto L_0x022e
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x03ce }
            java.lang.String r6 = r4.a     // Catch:{ all -> 0x03ce }
            r5.<init>(r9, r6)     // Catch:{ all -> 0x03ce }
            boolean r6 = r5.exists()     // Catch:{ all -> 0x03ce }
            if (r6 == 0) goto L_0x022e
            java.lang.String r6 = r4.a     // Catch:{ all -> 0x03ce }
            java.lang.String r8 = defpackage.hul.a((int) r0)     // Catch:{ all -> 0x03ce }
            boolean r6 = r6.endsWith(r8)     // Catch:{ all -> 0x03ce }
            if (r6 == 0) goto L_0x022e
            long r1 = r5.length()     // Catch:{ all -> 0x03ce }
            long r1 = r7.a((long) r1)     // Catch:{ all -> 0x03ce }
            long r3 = r4.b     // Catch:{ all -> 0x03ce }
            goto L_0x0233
        L_0x022e:
            r5 = r20
            r1 = r22
            r3 = r1
        L_0x0233:
            if (r5 == 0) goto L_0x0236
            goto L_0x0281
        L_0x0236:
            java.lang.String r5 = defpackage.hul.a((int) r0)     // Catch:{ all -> 0x03ce }
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03ce }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x03ce }
            java.lang.String r8 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x03ce }
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x03ce }
            int r10 = r10.length()     // Catch:{ all -> 0x03ce }
            int r18 = r5.length()     // Catch:{ all -> 0x03ce }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ce }
            r24 = 1
            int r10 = r10 + 1
            int r10 = r10 + r18
            r13.<init>(r10)     // Catch:{ all -> 0x03ce }
            r13.append(r8)     // Catch:{ all -> 0x03ce }
            java.lang.String r8 = "."
            r13.append(r8)     // Catch:{ all -> 0x03ce }
            r13.append(r5)     // Catch:{ all -> 0x03ce }
            java.lang.String r8 = r13.toString()     // Catch:{ all -> 0x03ce }
            r6.<init>(r9, r8)     // Catch:{ all -> 0x03ce }
        L_0x026d:
            boolean r8 = r6.exists()     // Catch:{ all -> 0x03ce }
            if (r8 != 0) goto L_0x02c2
            java.io.File r5 = r9.getParentFile()     // Catch:{ all -> 0x03ce }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x03ce }
            r8 = 1
            r7.c(r5, r8)     // Catch:{ all -> 0x03ce }
            r5 = r6
        L_0x0281:
            int r0 = r0 + -1
            if (r0 == 0) goto L_0x0292
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x03ce }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x03ce }
            r8 = 1
            r6.<init>(r5, r8)     // Catch:{ all -> 0x03ce }
            r0.<init>(r6, r8)     // Catch:{ all -> 0x03ce }
            r6 = 1
            goto L_0x0298
        L_0x0292:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x03ce }
            r6 = 1
            r0.<init>(r5, r6)     // Catch:{ all -> 0x03ce }
        L_0x0298:
            int r8 = a     // Catch:{ all -> 0x03ce }
            aubk r18 = defpackage.aubk.a((java.io.OutputStream) r0, (int) r8)     // Catch:{ all -> 0x03ce }
            huo r13 = new huo     // Catch:{ all -> 0x03ce }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03ce }
            r8 = r13
            r24 = r11
            r11 = r5
            r12 = r27
            r5 = r13
            r6 = r14
            r25 = 1
            r13 = r3
            r3 = r15
            r15 = r1
            r17 = r0
            r8.<init>(r9, r11, r12, r13, r15, r17, r18)     // Catch:{ all -> 0x03d3 }
            android.util.LruCache r0 = r7.f     // Catch:{ all -> 0x03d3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x03d3 }
            r0.put(r1, r5)     // Catch:{ all -> 0x03d3 }
            r8 = r3
            r1 = r5
            goto L_0x0306
        L_0x02c2:
            r24 = r11
            r6 = r14
            r8 = r15
            r25 = 1
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x03d3 }
            r13 = 1
            long r16 = r16 + r13
            java.lang.String r11 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x03d3 }
            java.lang.String r15 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x03d3 }
            int r15 = r15.length()     // Catch:{ all -> 0x03d3 }
            int r18 = r5.length()     // Catch:{ all -> 0x03d3 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x03d3 }
            int r15 = r15 + 1
            int r15 = r15 + r18
            r13.<init>(r15)     // Catch:{ all -> 0x03d3 }
            r13.append(r11)     // Catch:{ all -> 0x03d3 }
            java.lang.String r11 = "."
            r13.append(r11)     // Catch:{ all -> 0x03d3 }
            r13.append(r5)     // Catch:{ all -> 0x03d3 }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x03d3 }
            r10.<init>(r9, r11)     // Catch:{ all -> 0x03d3 }
            r14 = r6
            r15 = r8
            r6 = r10
            r11 = r24
            goto L_0x026d
        L_0x0300:
            r24 = r11
            r6 = r14
            r8 = r15
            r25 = 1
        L_0x0306:
            long r2 = r1.g     // Catch:{ all -> 0x03d3 }
            long r4 = r1.f     // Catch:{ all -> 0x03d3 }
            int r9 = defpackage.aubk.b((defpackage.auay) r28)     // Catch:{ all -> 0x03d3 }
            aubk r0 = r1.e     // Catch:{ IOException -> 0x0320 }
            r10 = r28
            r0.a((defpackage.auay) r10)     // Catch:{ IOException -> 0x0320 }
            aubk r0 = r1.e     // Catch:{ IOException -> 0x0320 }
            r0.c()     // Catch:{ IOException -> 0x0320 }
            java.io.OutputStream r0 = r1.d     // Catch:{ IOException -> 0x0320 }
            r0.flush()     // Catch:{ IOException -> 0x0320 }
            goto L_0x0323
        L_0x0320:
            r0 = move-exception
            r20 = r0
        L_0x0323:
            java.io.File r0 = r1.b     // Catch:{ all -> 0x03d3 }
            long r10 = r0.length()     // Catch:{ all -> 0x03d3 }
            long r10 = r7.a((long) r10)     // Catch:{ all -> 0x03d3 }
            int r0 = r1.h     // Catch:{ all -> 0x03d3 }
            int r0 = r0 + 1
            r1.h = r0     // Catch:{ all -> 0x03d3 }
            long r12 = (long) r9     // Catch:{ all -> 0x03d3 }
            long r14 = r1.f     // Catch:{ all -> 0x03d3 }
            long r14 = r14 + r12
            r1.f = r14     // Catch:{ all -> 0x03d3 }
            r1.g = r10     // Catch:{ all -> 0x03d3 }
            long r10 = r10 - r2
            r7.a((java.lang.String) r8, (long) r10)     // Catch:{ all -> 0x03d3 }
            if (r20 == 0) goto L_0x036e
            android.util.LruCache r0 = r7.f     // Catch:{ all -> 0x03d3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x03d3 }
            r0.remove(r2)     // Catch:{ all -> 0x03d3 }
            android.util.LruCache r0 = r7.g     // Catch:{ all -> 0x03d3 }
            r0.remove(r2)     // Catch:{ all -> 0x03d3 }
            int r0 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r0 != 0) goto L_0x036d
            huu r2 = new huu     // Catch:{ all -> 0x03d3 }
            r2.<init>(r7)     // Catch:{ all -> 0x03d3 }
            java.io.File r0 = r1.b     // Catch:{ all -> 0x0361 }
            r2.a(r0)     // Catch:{ all -> 0x0361 }
            r2.close()     // Catch:{ all -> 0x03d3 }
            goto L_0x036d
        L_0x0361:
            r0 = move-exception
            r1 = r0
            r2.close()     // Catch:{ all -> 0x0367 }
            goto L_0x036c
        L_0x0367:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x03d3 }
        L_0x036c:
            throw r1     // Catch:{ all -> 0x03d3 }
        L_0x036d:
            throw r20     // Catch:{ all -> 0x03d3 }
        L_0x036e:
            int r0 = r1.h     // Catch:{ all -> 0x03d3 }
            boolean r0 = defpackage.aons.a(r0)     // Catch:{ all -> 0x03d3 }
            if (r0 == 0) goto L_0x03cc
            int r0 = r1.h     // Catch:{ all -> 0x03d3 }
            long r2 = (long) r0     // Catch:{ all -> 0x03d3 }
            awtf r0 = defpackage.awtf.a     // Catch:{ all -> 0x03d3 }
            awtg r0 = r0.a()     // Catch:{ all -> 0x03d3 }
            long r4 = r0.s()     // Catch:{ all -> 0x03d3 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0388
            goto L_0x0398
        L_0x0388:
            long r2 = r1.f     // Catch:{ all -> 0x03d3 }
            awtf r0 = defpackage.awtf.a     // Catch:{ all -> 0x03d3 }
            awtg r0 = r0.a()     // Catch:{ all -> 0x03d3 }
            long r4 = r0.r()     // Catch:{ all -> 0x03d3 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x03cc
        L_0x0398:
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x03d3 }
            int r2 = r1.h     // Catch:{ all -> 0x03d3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x03d3 }
            r0[r19] = r2     // Catch:{ all -> 0x03d3 }
            long r2 = r1.f     // Catch:{ all -> 0x03d3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x03d3 }
            r0[r25] = r2     // Catch:{ all -> 0x03d3 }
            r0[r21] = r8     // Catch:{ all -> 0x03d3 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x03d3 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03d3 }
            long r5 = r1.a     // Catch:{ all -> 0x03d3 }
            long r3 = r3 - r5
            long r1 = r2.toSeconds(r3)     // Catch:{ all -> 0x03d3 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x03d3 }
            r2 = 3
            r0[r2] = r1     // Catch:{ all -> 0x03d3 }
            java.lang.String r1 = "FlatFileLogStore"
            java.lang.String r2 = "Excessive logging: %d events, %d bytes from log source %s last %ds"
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch:{ all -> 0x03d3 }
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x03d3 }
        L_0x03cc:
            monitor-exit(r24)     // Catch:{ all -> 0x03d3 }
            return r25
        L_0x03ce:
            r0 = move-exception
            r24 = r11
        L_0x03d1:
            monitor-exit(r24)     // Catch:{ all -> 0x03d3 }
            throw r0
        L_0x03d3:
            r0 = move-exception
            goto L_0x03d1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.huv.a(avtn, auay):boolean");
    }

    public final boolean a(String str) {
        anhk i2 = this.m.listIterator();
        while (i2.hasNext()) {
            File file = new File(this.e, Integer.toString(((avsd) i2.next()).f));
            if (file.isDirectory()) {
                Iterator it = huq.a(file).iterator();
                while (it.hasNext()) {
                    File a2 = ((hup) it).next();
                    if (a2.isDirectory() && !a2.getName().equals(str) && a(a2.list()).length > 0) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
