package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.GenericDimension;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: hph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hph {
    public static final hpa a = new hpa(new GenericDimension[0], new byte[0]);
    public static final hpa b = new hpa(new GenericDimension[0], new byte[0]);
    public static final Comparator n = new hor();
    public static final Comparator o = new hos();
    public static final how p = new how(1);
    private static final Charset q = Charset.forName("UTF-8");
    public final int c;
    public final jiq d;
    public final ReentrantReadWriteLock e;
    public boolean f;
    public volatile int g;
    public volatile Future h;
    public long i;
    public Map j;
    public hpa k;
    public TreeMap l;
    public Integer m;
    private final String r;
    private ScheduledExecutorService s;
    private final hol t;
    private volatile hpc u;

    public hph(hol hol, String str, int i2) {
        this(hol, str, i2, jiu.a);
    }

    public static long a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(q));
            return ByteBuffer.wrap(instance.digest()).getLong();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final hox b(String str) {
        this.e.writeLock().lock();
        try {
            return new hox(this, str);
        } finally {
            this.e.writeLock().unlock();
        }
    }

    public final hox c(String str) {
        this.e.writeLock().lock();
        try {
            hot hot = (hot) this.j.get(str);
            if (hot != null) {
                hox hox = (hox) hot;
                this.e.writeLock().unlock();
                return hox;
            }
            hox b2 = b(str);
            this.e.writeLock().unlock();
            return b2;
        } catch (ClassCastException e2) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("another type of counter exists with name: ") : "another type of counter exists with name: ".concat(valueOf));
        } catch (Throwable th) {
            this.e.writeLock().unlock();
            throw th;
        }
    }

    public final hpb d(String str) {
        hpb hpb;
        ReentrantReadWriteLock reentrantReadWriteLock;
        this.e.writeLock().lock();
        try {
            hot hot = (hot) this.j.get(str);
            if (hot == null) {
                this.e.writeLock().lock();
                hpb = new hpb(this, str);
                this.e.writeLock().unlock();
                reentrantReadWriteLock = this.e;
            } else {
                hpb = (hpb) hot;
                reentrantReadWriteLock = this.e;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return hpb;
        } catch (ClassCastException e2) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("another type of counter exists with name: ") : "another type of counter exists with name: ".concat(valueOf));
        } catch (Throwable th) {
            this.e.writeLock().unlock();
            throw th;
        }
    }

    public final hpd e(String str) {
        return b(str, p);
    }

    public final hpg f(String str) {
        hpg hpg;
        ReentrantReadWriteLock reentrantReadWriteLock;
        how how = p;
        this.e.writeLock().lock();
        try {
            hot hot = (hot) this.j.get(str);
            if (hot != null) {
                hpg = (hpg) hot;
                if (!how.equals(hpg.d)) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("alias mismatch: ") : "alias mismatch: ".concat(valueOf));
                }
                reentrantReadWriteLock = this.e;
            } else {
                this.e.writeLock().lock();
                hpg = new hpg(this, str, how);
                this.e.writeLock().unlock();
                reentrantReadWriteLock = this.e;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return hpg;
        } catch (ClassCastException e2) {
            String valueOf2 = String.valueOf(str);
            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("another type of counter exists with name: ") : "another type of counter exists with name: ".concat(valueOf2));
        } catch (Throwable th) {
            this.e.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        this.e.readLock().lock();
        try {
            sb.append("{");
            boolean z = true;
            for (Map.Entry entry : this.l.entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append("(");
                hpa hpa = (hpa) entry.getKey();
                StringBuilder sb2 = new StringBuilder("{");
                sb2.append("(");
                int length = hpa.a.length;
                sb2.append("), ");
                sb2.append(new String(hpa.b, q));
                sb2.append("}");
                sb.append(sb2.toString());
                sb.append(") => ");
                sb.append(entry.getValue());
                z = false;
            }
            sb.append("}\n");
            for (hot hot : this.j.values()) {
                sb.append(hot.toString());
                sb.append("\n");
            }
            this.e.readLock().unlock();
            return sb.toString();
        } catch (Throwable th) {
            this.e.readLock().unlock();
            throw th;
        }
    }

    public hph(hol hol, String str, int i2, jiq jiq) {
        boolean z;
        this.e = new ReentrantReadWriteLock();
        this.j = new TreeMap();
        this.k = a;
        this.l = new TreeMap();
        this.m = null;
        this.u = null;
        iva.a((Object) str);
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        iva.a((Object) jiq);
        this.t = hol;
        this.r = str;
        this.c = i2;
        this.d = jiq;
        this.i = SystemClock.elapsedRealtime();
    }

    public final hpd a(String str, how how) {
        this.e.writeLock().lock();
        try {
            return new hpd(this, str, how);
        } finally {
            this.e.writeLock().unlock();
        }
    }

    public final hpd b(String str, how how) {
        this.e.writeLock().lock();
        try {
            hot hot = (hot) this.j.get(str);
            if (hot != null) {
                hpd hpd = (hpd) hot;
                if (!how.equals(hpd.d)) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("alias mismatch: ") : "alias mismatch: ".concat(valueOf));
                }
                this.e.writeLock().unlock();
                return hpd;
            }
            hpd a2 = a(str, how);
            this.e.writeLock().unlock();
            return a2;
        } catch (ClassCastException e2) {
            String valueOf2 = String.valueOf(str);
            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("another type of counter exists with name: ") : "another type of counter exists with name: ".concat(valueOf2));
        } catch (Throwable th) {
            this.e.writeLock().unlock();
            throw th;
        }
    }

    public final void a() {
        iva.a((Object) this.t);
        this.e.writeLock().lock();
        try {
            this.f = true;
        } finally {
            this.e.writeLock().unlock();
        }
    }

    private hph(hph hph) {
        this(hph.t, hph.r, hph.c, hph.d);
        Object obj;
        ReentrantReadWriteLock.WriteLock writeLock = hph.e.writeLock();
        writeLock.lock();
        try {
            this.k = hph.k;
            this.m = hph.m;
            this.i = hph.i;
            this.j = new TreeMap();
            for (Map.Entry entry : hph.j.entrySet()) {
                Map map = this.j;
                String str = (String) entry.getKey();
                hot hot = (hot) entry.getValue();
                if (hot instanceof hox) {
                    obj = new hox(this, (hox) hot);
                } else if (hot instanceof hpg) {
                    obj = new hpg(this, (hpg) hot);
                } else if (hot instanceof hpb) {
                    obj = new hpb(this, (hpb) hot);
                } else if (hot instanceof hpd) {
                    obj = new hpd(this, (hpd) hot);
                } else if (hot instanceof hov) {
                    obj = new hov(this, (hov) hot);
                } else {
                    String valueOf = String.valueOf(hot);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                    sb.append("Unknown counter type: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                map.put(str, obj);
            }
            TreeMap treeMap = this.l;
            this.l = hph.l;
            hph.l = treeMap;
            hph.m = null;
            hph.i = SystemClock.elapsedRealtime();
        } finally {
            writeLock.unlock();
        }
    }

    public final void a(hpa hpa) {
        if (hpa == null) {
            hpa = a;
        }
        this.e.writeLock().lock();
        try {
            this.k = hpa;
            this.m = null;
        } finally {
            this.e.writeLock().unlock();
        }
    }

    public final hpe c() {
        return new hpe(this);
    }

    public final void a(ScheduledExecutorService scheduledExecutorService, int i2) {
        this.e.writeLock().lock();
        try {
            this.s = scheduledExecutorService;
            if (scheduledExecutorService != null) {
                this.g = i2;
                b();
            } else {
                this.g = 0;
            }
        } finally {
            this.e.writeLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public final icf d() {
        this.e.writeLock().lock();
        try {
            hph hph = new hph(this);
            this.e.writeLock().unlock();
            int size = hph.l.size();
            hoi[] hoiArr = new hoi[size];
            for (Map.Entry entry : hph.l.entrySet()) {
                hoi a2 = hph.t.a((hok) new hoz(hph, ((hpa) entry.getKey()).b, Integer.valueOf(((Integer) entry.getValue()).intValue())));
                int length = ((hpa) entry.getKey()).a.length;
                hoiArr[((Integer) entry.getValue()).intValue()] = a2;
            }
            icf icf = null;
            for (int i2 = 0; i2 < size; i2++) {
                hoi hoi = hoiArr[i2];
                hoi.d = hph.r;
                icf = hoi.b();
            }
            return icf == null ? ich.a(Status.a, (icc) null) : icf;
        } catch (Throwable th) {
            this.e.writeLock().unlock();
            throw th;
        }
    }

    public final Integer b(hpa hpa) {
        Integer num = (Integer) this.l.get(hpa);
        if (num != null) {
            return num;
        }
        Integer valueOf = Integer.valueOf(this.l.size());
        this.l.put(hpa, valueOf);
        return valueOf;
    }

    public final void a(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            a(a);
        } else {
            a(new hpa(a.a, bArr));
        }
    }

    public final void b() {
        this.e.writeLock().lock();
        try {
            Future future = this.h;
            if (future != null) {
                future.cancel(false);
            }
            this.h = ((jfv) this.s).schedule((Runnable) new hoq(this), (long) this.g, TimeUnit.MILLISECONDS);
        } finally {
            this.e.writeLock().unlock();
        }
    }
}
