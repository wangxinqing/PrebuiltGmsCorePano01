package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: athn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class athn {
    protected static athn a;
    protected aqep b;
    protected athz c;
    protected ArrayList d = new ArrayList();
    protected HashMap e = new HashMap();
    public final Object f = new Object();
    public int g = 0;
    public int h = 0;
    protected long i;
    protected long j;
    protected aqeq k;
    protected aqeq l;
    private atht m;
    private String n;
    private int o = 0;
    private final Random p = new Random();
    private final ThreadPoolExecutor q;

    protected athn(athm athm) {
        this.c = new athz(athm.b, athm.c, athm.d, athm.e, "g");
        aqep aqep = new aqep("MSMuxTR");
        this.b = aqep;
        synchronized (aqep.c) {
            if (!aqep.f) {
                aqep.f = true;
                char c2 = 0;
                while (true) {
                    Thread[] threadArr = aqep.d;
                    if (c2 > 0) {
                        break;
                    }
                    String str = aqep.e;
                    StringBuilder sb = new StringBuilder(str.length() + 12);
                    sb.append(str);
                    sb.append("-");
                    sb.append(0);
                    threadArr[0] = new Thread(aqep, sb.toString());
                    aqep.d[0].start();
                    c2 = 1;
                }
            }
        }
        this.n = athm.a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 15, 5, TimeUnit.MINUTES, new LinkedBlockingQueue(), new athl());
        this.q = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.m = new atht(this.b, this.q);
        this.k = new aqeq(this.b, new athi(this));
        this.l = new aqeq(this.b, new athj(this));
    }

    public static synchronized athn a() {
        athn athn;
        synchronized (athn.class) {
            athn = a;
        }
        return athn;
    }

    public final void b() {
        synchronized (this.f) {
            this.l.a();
            long j2 = -1;
            for (atih atih : this.e.keySet()) {
                if (atih.e) {
                    this.e.remove(atih);
                } else {
                    long j3 = atih.c;
                    if (j3 != -1 && (j2 == -1 || j2 > j3)) {
                        j2 = j3;
                    }
                }
            }
            if (j2 != -1) {
                this.l.b(j2);
                this.l.f();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = 10 + currentTimeMillis;
        long j3 = this.j;
        if (j3 == 0) {
            this.i = currentTimeMillis + 100;
            this.j = j2;
            this.k.b(j2);
            this.k.f();
            return;
        }
        long j4 = this.i;
        if (j2 < j4) {
            this.j = j2;
        } else if (j3 < j4) {
            this.j = j4;
        }
    }

    public final synchronized int d() {
        int i2;
        i2 = this.o + 1;
        this.o = i2;
        return i2;
    }

    public static synchronized void a(athm athm) {
        synchronized (athn.class) {
            if (a == null) {
                a = new athn(athm);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ArrayList arrayList) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        atih atih;
        int size = arrayList.size();
        atih[] atihArr = new atih[size];
        arrayList.toArray(atihArr);
        if (size == 0) {
            inputStream = this.c.b();
        } else {
            inputStream = new SequenceInputStream(this.c.b(), atihArr[0].b());
            int i2 = 1;
            while (i2 < size) {
                i2++;
                inputStream = new SequenceInputStream(inputStream, atihArr[i2].b());
            }
        }
        athr athr = new athr(this.m, this.n);
        athr.a("POST");
        int available = inputStream.available();
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(32);
            byte[] bArr = new byte[512];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            aqeg.a((OutputStream) byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            aqeg.a(inputStream);
            athr.a(byteArray);
            if (size != 0) {
                atih = atihArr[this.p.nextInt(size)];
            } else {
                atih = null;
            }
            if (atih != null) {
                athr.c = atih.i();
                athr.b = 1536;
            }
            athr.k();
            athr.b("application/binary");
            athr.a(new aqeo(this.b, new athk(this, athr, atihArr, available)));
            athr.a.b.execute(athr);
        } catch (Throwable th) {
            aqeg.a(inputStream);
            throw th;
        }
    }

    public final void a(atih[] atihArr, Exception exc) {
        atig g2;
        synchronized (this.f) {
            for (atih atih : atihArr) {
                if (atih != null) {
                    if (atih.j() && (g2 = atih.g()) != null) {
                        g2.a(atih, exc);
                    }
                }
            }
        }
    }
}
