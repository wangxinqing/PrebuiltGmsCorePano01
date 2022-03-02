package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: avzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avzy implements Closeable {
    static final Pattern a = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final batz i = new avzt();
    public final awdj b;
    public final File c;
    public final int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    private final File j;
    private final File k;
    private final File l;
    private final int m;
    private final long n;
    private long o = 0;
    private bate p;
    private final LinkedHashMap q = new LinkedHashMap(0, 0.75f, true);
    private long r = 0;
    private final Executor s;
    private final Runnable t = new avzr(this);

    public avzy(awdj awdj, File file, long j2, Executor executor) {
        this.b = awdj;
        this.c = file;
        this.m = 1;
        this.j = new File(file, "journal");
        this.k = new File(file, "journal.tmp");
        this.l = new File(file, "journal.bkp");
        this.d = 1;
        this.n = j2;
        this.s = executor;
    }

    public static avzy a(awdj awdj, File file, long j2) {
        if (j2 > 0) {
            return new avzy(awdj, file, j2, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), awaj.b("OkHttp DiskLruCache")));
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private static final void d(String str) {
        if (!a.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r3.length() != 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r3 = new java.lang.String("unexpected journal line: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r3 = "unexpected journal line: ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        throw new java.io.IOException(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f() {
        /*
            r11 = this;
            java.lang.String r0 = ", "
            java.io.File r1 = r11.j
            baua r1 = defpackage.batq.a((java.io.File) r1)
            batf r1 = defpackage.batq.a((defpackage.baua) r1)
            java.lang.String r2 = r1.l()     // Catch:{ all -> 0x01a7 }
            java.lang.String r3 = r1.l()     // Catch:{ all -> 0x01a7 }
            java.lang.String r4 = r1.l()     // Catch:{ all -> 0x01a7 }
            java.lang.String r5 = r1.l()     // Catch:{ all -> 0x01a7 }
            java.lang.String r6 = r1.l()     // Catch:{ all -> 0x01a7 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x01a7 }
            if (r7 == 0) goto L_0x0154
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x01a7 }
            if (r7 == 0) goto L_0x0154
            int r7 = r11.m     // Catch:{ all -> 0x01a7 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x01a7 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x01a7 }
            if (r4 == 0) goto L_0x0154
            int r4 = r11.d     // Catch:{ all -> 0x01a7 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x01a7 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x01a7 }
            if (r4 == 0) goto L_0x0154
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x01a7 }
            if (r4 == 0) goto L_0x0154
            r0 = 0
            r2 = 0
        L_0x0052:
            java.lang.String r3 = r1.l()     // Catch:{ EOFException -> 0x0136 }
            r4 = 32
            int r5 = r3.indexOf(r4)     // Catch:{ EOFException -> 0x0136 }
            java.lang.String r6 = "unexpected journal line: "
            r7 = -1
            if (r5 != r7) goto L_0x007b
            java.io.IOException r0 = new java.io.IOException     // Catch:{ EOFException -> 0x0136 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ EOFException -> 0x0136 }
            int r4 = r3.length()     // Catch:{ EOFException -> 0x0136 }
            if (r4 != 0) goto L_0x0073
            java.lang.String r3 = new java.lang.String     // Catch:{ EOFException -> 0x0136 }
            r3.<init>(r6)     // Catch:{ EOFException -> 0x0136 }
            goto L_0x0077
        L_0x0073:
            java.lang.String r3 = r6.concat(r3)     // Catch:{ EOFException -> 0x0136 }
        L_0x0077:
            r0.<init>(r3)     // Catch:{ EOFException -> 0x0136 }
            throw r0     // Catch:{ EOFException -> 0x0136 }
        L_0x007b:
            int r8 = r5 + 1
            int r4 = r3.indexOf(r4, r8)     // Catch:{ EOFException -> 0x0136 }
            if (r4 != r7) goto L_0x009a
            java.lang.String r8 = r3.substring(r8)     // Catch:{ EOFException -> 0x0136 }
            r9 = 6
            if (r5 == r9) goto L_0x008b
            goto L_0x009e
        L_0x008b:
            java.lang.String r9 = "REMOVE"
            boolean r9 = r3.startsWith(r9)     // Catch:{ EOFException -> 0x0136 }
            if (r9 == 0) goto L_0x009e
            java.util.LinkedHashMap r3 = r11.q     // Catch:{ EOFException -> 0x0136 }
            r3.remove(r8)     // Catch:{ EOFException -> 0x0136 }
            goto L_0x0118
        L_0x009a:
            java.lang.String r8 = r3.substring(r8, r4)     // Catch:{ EOFException -> 0x0136 }
        L_0x009e:
            java.util.LinkedHashMap r9 = r11.q     // Catch:{ EOFException -> 0x0136 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ EOFException -> 0x0136 }
            avzw r9 = (defpackage.avzw) r9     // Catch:{ EOFException -> 0x0136 }
            if (r9 != 0) goto L_0x00b3
            avzw r9 = new avzw     // Catch:{ EOFException -> 0x0136 }
            r9.<init>(r11, r8)     // Catch:{ EOFException -> 0x0136 }
            java.util.LinkedHashMap r10 = r11.q     // Catch:{ EOFException -> 0x0136 }
            r10.put(r8, r9)     // Catch:{ EOFException -> 0x0136 }
            goto L_0x00b4
        L_0x00b3:
        L_0x00b4:
            r8 = 5
            if (r4 == r7) goto L_0x00f6
            if (r5 != r8) goto L_0x00f6
            java.lang.String r10 = "CLEAN"
            boolean r10 = r3.startsWith(r10)     // Catch:{ EOFException -> 0x0136 }
            if (r10 == 0) goto L_0x00f6
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ EOFException -> 0x0136 }
            java.lang.String r4 = " "
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ EOFException -> 0x0136 }
            r9.e = true     // Catch:{ EOFException -> 0x0136 }
            r4 = 0
            r9.f = r4     // Catch:{ EOFException -> 0x0136 }
            int r4 = r3.length     // Catch:{ EOFException -> 0x0136 }
            avzy r5 = r9.h     // Catch:{ EOFException -> 0x0136 }
            int r5 = r5.d     // Catch:{ EOFException -> 0x0136 }
            if (r4 != r5) goto L_0x00f1
            r4 = 0
        L_0x00db:
            int r5 = r3.length     // Catch:{ NumberFormatException -> 0x00eb }
            if (r4 >= r5) goto L_0x0118
            long[] r5 = r9.b     // Catch:{ NumberFormatException -> 0x00eb }
            r6 = r3[r4]     // Catch:{ NumberFormatException -> 0x00eb }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x00eb }
            r5[r4] = r6     // Catch:{ NumberFormatException -> 0x00eb }
            int r4 = r4 + 1
            goto L_0x00db
        L_0x00eb:
            r0 = move-exception
            java.io.IOException r0 = defpackage.avzw.a((java.lang.String[]) r3)     // Catch:{ EOFException -> 0x0136 }
            throw r0     // Catch:{ EOFException -> 0x0136 }
        L_0x00f1:
            java.io.IOException r0 = defpackage.avzw.a((java.lang.String[]) r3)     // Catch:{ EOFException -> 0x0136 }
            throw r0     // Catch:{ EOFException -> 0x0136 }
        L_0x00f6:
            if (r4 != r7) goto L_0x010a
            if (r5 != r8) goto L_0x010a
            java.lang.String r8 = "DIRTY"
            boolean r8 = r3.startsWith(r8)     // Catch:{ EOFException -> 0x0136 }
            if (r8 == 0) goto L_0x010a
            avzv r3 = new avzv     // Catch:{ EOFException -> 0x0136 }
            r3.<init>(r11, r9)     // Catch:{ EOFException -> 0x0136 }
            r9.f = r3     // Catch:{ EOFException -> 0x0136 }
            goto L_0x0118
        L_0x010a:
            if (r4 == r7) goto L_0x010d
            goto L_0x011c
        L_0x010d:
            r4 = 4
            if (r5 != r4) goto L_0x011c
            java.lang.String r4 = "READ"
            boolean r4 = r3.startsWith(r4)     // Catch:{ EOFException -> 0x0136 }
            if (r4 == 0) goto L_0x011c
        L_0x0118:
            int r2 = r2 + 1
            goto L_0x0052
        L_0x011c:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ EOFException -> 0x0136 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ EOFException -> 0x0136 }
            int r4 = r3.length()     // Catch:{ EOFException -> 0x0136 }
            if (r4 != 0) goto L_0x012e
            java.lang.String r3 = new java.lang.String     // Catch:{ EOFException -> 0x0136 }
            r3.<init>(r6)     // Catch:{ EOFException -> 0x0136 }
            goto L_0x0132
        L_0x012e:
            java.lang.String r3 = r6.concat(r3)     // Catch:{ EOFException -> 0x0136 }
        L_0x0132:
            r0.<init>(r3)     // Catch:{ EOFException -> 0x0136 }
            throw r0     // Catch:{ EOFException -> 0x0136 }
        L_0x0136:
            r0 = move-exception
            java.util.LinkedHashMap r0 = r11.q     // Catch:{ all -> 0x01a7 }
            int r0 = r0.size()     // Catch:{ all -> 0x01a7 }
            int r2 = r2 - r0
            r11.e = r2     // Catch:{ all -> 0x01a7 }
            boolean r0 = r1.b()     // Catch:{ all -> 0x01a7 }
            if (r0 == 0) goto L_0x014d
            bate r0 = r11.g()     // Catch:{ all -> 0x01a7 }
            r11.p = r0     // Catch:{ all -> 0x01a7 }
            goto L_0x0150
        L_0x014d:
            r11.b()     // Catch:{ all -> 0x01a7 }
        L_0x0150:
            defpackage.awaj.a((java.io.Closeable) r1)
            return
        L_0x0154:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x01a7 }
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x01a7 }
            int r7 = r7.length()     // Catch:{ all -> 0x01a7 }
            int r7 = r7 + 35
            java.lang.String r8 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01a7 }
            int r8 = r8.length()     // Catch:{ all -> 0x01a7 }
            int r7 = r7 + r8
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01a7 }
            int r8 = r8.length()     // Catch:{ all -> 0x01a7 }
            int r7 = r7 + r8
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x01a7 }
            int r8 = r8.length()     // Catch:{ all -> 0x01a7 }
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a7 }
            r8.<init>(r7)     // Catch:{ all -> 0x01a7 }
            java.lang.String r7 = "unexpected journal header: ["
            r8.append(r7)     // Catch:{ all -> 0x01a7 }
            r8.append(r2)     // Catch:{ all -> 0x01a7 }
            r8.append(r0)     // Catch:{ all -> 0x01a7 }
            r8.append(r3)     // Catch:{ all -> 0x01a7 }
            r8.append(r0)     // Catch:{ all -> 0x01a7 }
            r8.append(r5)     // Catch:{ all -> 0x01a7 }
            r8.append(r0)     // Catch:{ all -> 0x01a7 }
            r8.append(r6)     // Catch:{ all -> 0x01a7 }
            java.lang.String r0 = "]"
            r8.append(r0)     // Catch:{ all -> 0x01a7 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x01a7 }
            r4.<init>(r0)     // Catch:{ all -> 0x01a7 }
            throw r4     // Catch:{ all -> 0x01a7 }
        L_0x01a7:
            r0 = move-exception
            defpackage.awaj.a((java.io.Closeable) r1)
            goto L_0x01ad
        L_0x01ac:
            throw r0
        L_0x01ad:
            goto L_0x01ac
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzy.f():void");
    }

    private final bate g() {
        batz batz;
        File file = this.j;
        try {
            batz = batq.c(file);
        } catch (FileNotFoundException e2) {
            file.getParentFile().mkdirs();
            batz = batq.c(file);
        }
        return batq.a((batz) new avzs(this, batz));
    }

    private final synchronized void h() {
        if (d()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized avzv b(String str) {
        a();
        h();
        d(str);
        avzw avzw = (avzw) this.q.get(str);
        if (avzw != null) {
            if (avzw.f != null) {
                return null;
            }
        }
        bate bate = this.p;
        bate.b("DIRTY");
        bate.h(32);
        bate.b(str);
        bate.h(10);
        this.p.flush();
        if (this.f) {
            return null;
        }
        if (avzw == null) {
            avzw = new avzw(this, str);
            this.q.put(str, avzw);
        }
        avzv avzv = new avzv(this, avzw);
        avzw.f = avzv;
        return avzv;
    }

    public final synchronized void c(String str) {
        a();
        h();
        d(str);
        avzw avzw = (avzw) this.q.get(str);
        if (avzw != null) {
            a(avzw);
        }
    }

    public final synchronized void close() {
        if (this.g && !this.h) {
            for (avzw avzw : (avzw[]) this.q.values().toArray(new avzw[this.q.size()])) {
                avzv avzv = avzw.f;
                if (avzv != null) {
                    avzv.a();
                }
            }
            e();
            this.p.close();
            this.p = null;
        }
        this.h = true;
    }

    public final synchronized boolean d() {
        return this.h;
    }

    public final void e() {
        while (this.o > this.n) {
            a((avzw) this.q.values().iterator().next());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.avzx a(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.a()     // Catch:{ all -> 0x004a }
            r3.h()     // Catch:{ all -> 0x004a }
            d(r4)     // Catch:{ all -> 0x004a }
            java.util.LinkedHashMap r0 = r3.q     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004a }
            avzw r0 = (defpackage.avzw) r0     // Catch:{ all -> 0x004a }
            r1 = 0
            if (r0 == 0) goto L_0x0048
            boolean r2 = r0.e     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0048
            avzx r0 = r0.a()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            int r1 = r3.e     // Catch:{ all -> 0x004a }
            int r1 = r1 + 1
            r3.e = r1     // Catch:{ all -> 0x004a }
            bate r1 = r3.p     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "READ"
            r1.b(r2)     // Catch:{ all -> 0x004a }
            r2 = 32
            r1.h(r2)     // Catch:{ all -> 0x004a }
            r1.b(r4)     // Catch:{ all -> 0x004a }
            r4 = 10
            r1.h(r4)     // Catch:{ all -> 0x004a }
            boolean r4 = r3.c()     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0046
            java.util.concurrent.Executor r4 = r3.s     // Catch:{ all -> 0x004a }
            java.lang.Runnable r1 = r3.t     // Catch:{ all -> 0x004a }
            r4.execute(r1)     // Catch:{ all -> 0x004a }
        L_0x0046:
            monitor-exit(r3)
            return r0
        L_0x0048:
            monitor-exit(r3)
            return r1
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzy.a(java.lang.String):avzx");
    }

    public final boolean c() {
        int i2 = this.e;
        return i2 >= 2000 && i2 >= this.q.size();
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void b() {
        bate bate = this.p;
        if (bate != null) {
            bate.close();
        }
        bate a2 = batq.a(this.b.a(this.k));
        try {
            a2.b("libcore.io.DiskLruCache");
            a2.h(10);
            a2.b("1");
            a2.h(10);
            a2.i((long) this.m);
            a2.h(10);
            a2.i((long) this.d);
            a2.h(10);
            a2.h(10);
            for (avzw avzw : this.q.values()) {
                if (avzw.f == null) {
                    a2.b("CLEAN");
                    a2.h(32);
                    a2.b(avzw.a);
                    avzw.a(a2);
                    a2.h(10);
                } else {
                    a2.b("DIRTY");
                    a2.h(32);
                    a2.b(avzw.a);
                    a2.h(10);
                }
            }
            a2.close();
            if (this.j.exists()) {
                this.b.a(this.j, this.l);
            }
            this.b.a(this.k, this.j);
            this.b.b(this.l);
            this.p = g();
            this.f = false;
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
    }

    public final synchronized void a() {
        if (!this.g) {
            if (this.l.exists()) {
                if (this.j.exists()) {
                    this.b.b(this.l);
                } else {
                    this.b.a(this.l, this.j);
                }
            }
            if (this.j.exists()) {
                try {
                    f();
                    this.b.b(this.k);
                    Iterator it = this.q.values().iterator();
                    while (it.hasNext()) {
                        avzw avzw = (avzw) it.next();
                        if (avzw.f != null) {
                            avzw.f = null;
                            for (int i2 = 0; i2 < this.d; i2++) {
                                this.b.b(avzw.c[i2]);
                                this.b.b(avzw.d[i2]);
                            }
                            it.remove();
                        } else {
                            for (int i3 = 0; i3 < this.d; i3++) {
                                this.o += avzw.b[i3];
                            }
                        }
                    }
                    this.g = true;
                    return;
                } catch (IOException e2) {
                    awag awag = awag.a;
                    String valueOf = String.valueOf(this.c);
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(message).length());
                    sb.append("DiskLruCache ");
                    sb.append(valueOf);
                    sb.append(" is corrupt: ");
                    sb.append(message);
                    sb.append(", removing");
                    awag.a(sb.toString());
                    close();
                    this.b.c(this.c);
                    this.h = false;
                }
            }
            b();
            this.g = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ba, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.avzv r11, boolean r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            avzw r0 = r11.a     // Catch:{ all -> 0x00fb }
            avzv r1 = r0.f     // Catch:{ all -> 0x00fb }
            if (r1 != r11) goto L_0x00f5
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L_0x0048
            boolean r3 = r0.e     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x0011
            r11 = 0
            goto L_0x0049
        L_0x0011:
            r3 = 0
        L_0x0012:
            int r4 = r10.d     // Catch:{ all -> 0x00fb }
            if (r3 >= r4) goto L_0x0046
            boolean[] r3 = r11.b     // Catch:{ all -> 0x00fb }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x002d
            java.io.File[] r3 = r0.d     // Catch:{ all -> 0x00fb }
            r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x0028
            r3 = 1
            goto L_0x0012
        L_0x0028:
            r11.a()     // Catch:{ all -> 0x00fb }
            monitor-exit(r10)
            return
        L_0x002d:
            r11.a()     // Catch:{ all -> 0x00fb }
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r0 = 61
            r12.<init>(r0)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "Newly created entry didn't create value for index 0"
            r12.append(r0)     // Catch:{ all -> 0x00fb }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x00fb }
            r11.<init>(r12)     // Catch:{ all -> 0x00fb }
            throw r11     // Catch:{ all -> 0x00fb }
        L_0x0046:
            r11 = 0
            goto L_0x0049
        L_0x0048:
            r11 = 0
        L_0x0049:
            int r3 = r10.d     // Catch:{ all -> 0x00fb }
            if (r11 < r3) goto L_0x00c3
            int r11 = r10.e     // Catch:{ all -> 0x00fb }
            int r11 = r11 + r1
            r10.e = r11     // Catch:{ all -> 0x00fb }
            r11 = 0
            r0.f = r11     // Catch:{ all -> 0x00fb }
            boolean r11 = r0.e     // Catch:{ all -> 0x00fb }
            r11 = r11 | r12
            r1 = 10
            r2 = 32
            if (r11 != 0) goto L_0x007c
            java.util.LinkedHashMap r11 = r10.q     // Catch:{ all -> 0x00fb }
            java.lang.String r12 = r0.a     // Catch:{ all -> 0x00fb }
            r11.remove(r12)     // Catch:{ all -> 0x00fb }
            bate r11 = r10.p     // Catch:{ all -> 0x00fb }
            java.lang.String r12 = "REMOVE"
            r11.b(r12)     // Catch:{ all -> 0x00fb }
            r11.h(r2)     // Catch:{ all -> 0x00fb }
            bate r11 = r10.p     // Catch:{ all -> 0x00fb }
            java.lang.String r12 = r0.a     // Catch:{ all -> 0x00fb }
            r11.b(r12)     // Catch:{ all -> 0x00fb }
            bate r11 = r10.p     // Catch:{ all -> 0x00fb }
            r11.h(r1)     // Catch:{ all -> 0x00fb }
            goto L_0x00a5
        L_0x007c:
            r0.e = true     // Catch:{ all -> 0x00fb }
            bate r11 = r10.p     // Catch:{ all -> 0x00fb }
            java.lang.String r3 = "CLEAN"
            r11.b(r3)     // Catch:{ all -> 0x00fb }
            r11.h(r2)     // Catch:{ all -> 0x00fb }
            bate r11 = r10.p     // Catch:{ all -> 0x00fb }
            java.lang.String r2 = r0.a     // Catch:{ all -> 0x00fb }
            r11.b(r2)     // Catch:{ all -> 0x00fb }
            bate r11 = r10.p     // Catch:{ all -> 0x00fb }
            r0.a((defpackage.bate) r11)     // Catch:{ all -> 0x00fb }
            bate r11 = r10.p     // Catch:{ all -> 0x00fb }
            r11.h(r1)     // Catch:{ all -> 0x00fb }
            if (r12 == 0) goto L_0x00a5
            long r11 = r10.r     // Catch:{ all -> 0x00fb }
            r1 = 1
            long r1 = r1 + r11
            r10.r = r1     // Catch:{ all -> 0x00fb }
            r0.g = r11     // Catch:{ all -> 0x00fb }
        L_0x00a5:
            bate r11 = r10.p     // Catch:{ all -> 0x00fb }
            r11.flush()     // Catch:{ all -> 0x00fb }
            long r11 = r10.o     // Catch:{ all -> 0x00fb }
            long r0 = r10.n     // Catch:{ all -> 0x00fb }
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00bb
            boolean r11 = r10.c()     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            monitor-exit(r10)
            return
        L_0x00bb:
            java.util.concurrent.Executor r11 = r10.s     // Catch:{ all -> 0x00fb }
            java.lang.Runnable r12 = r10.t     // Catch:{ all -> 0x00fb }
            r11.execute(r12)     // Catch:{ all -> 0x00fb }
            goto L_0x00b9
        L_0x00c3:
            java.io.File[] r11 = r0.d     // Catch:{ all -> 0x00fb }
            r11 = r11[r2]     // Catch:{ all -> 0x00fb }
            if (r12 != 0) goto L_0x00d1
            awdj r3 = r10.b     // Catch:{ all -> 0x00fb }
            r3.b(r11)     // Catch:{ all -> 0x00fb }
            r11 = 1
            goto L_0x0049
        L_0x00d1:
            boolean r3 = r11.exists()     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x00f2
            java.io.File[] r3 = r0.c     // Catch:{ all -> 0x00fb }
            r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            awdj r4 = r10.b     // Catch:{ all -> 0x00fb }
            r4.a(r11, r3)     // Catch:{ all -> 0x00fb }
            long[] r11 = r0.b     // Catch:{ all -> 0x00fb }
            r4 = r11[r2]     // Catch:{ all -> 0x00fb }
            long r6 = r3.length()     // Catch:{ all -> 0x00fb }
            long[] r11 = r0.b     // Catch:{ all -> 0x00fb }
            r11[r2] = r6     // Catch:{ all -> 0x00fb }
            long r8 = r10.o     // Catch:{ all -> 0x00fb }
            long r8 = r8 - r4
            long r8 = r8 + r6
            r10.o = r8     // Catch:{ all -> 0x00fb }
        L_0x00f2:
            r11 = 1
            goto L_0x0049
        L_0x00f5:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            r11.<init>()     // Catch:{ all -> 0x00fb }
            throw r11     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x00ff
        L_0x00fe:
            throw r11
        L_0x00ff:
            goto L_0x00fe
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzy.a(avzv, boolean):void");
    }

    public final void a(avzw avzw) {
        int i2;
        avzv avzv = avzw.f;
        if (avzv != null) {
            avzv.c = true;
            i2 = 0;
        } else {
            i2 = 0;
        }
        while (i2 < this.d) {
            this.b.b(avzw.c[0]);
            long j2 = this.o;
            long[] jArr = avzw.b;
            this.o = j2 - jArr[0];
            jArr[0] = 0;
            i2 = 1;
        }
        this.e++;
        bate bate = this.p;
        bate.b("REMOVE");
        bate.h(32);
        bate.b(avzw.a);
        bate.h(10);
        this.q.remove(avzw.a);
        if (c()) {
            this.s.execute(this.t);
        }
    }
}
