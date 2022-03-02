package defpackage;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: anhv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class anhv implements anie, anir {
    private static final String a = new String();
    private final Level b;
    private final long c;
    private anht d = null;
    private anhy e = null;
    private anjd f = null;
    private Object[] g = null;

    protected anhv(Level level, boolean z) {
        long e2 = aniy.e();
        ankq.a(level, "level");
        this.b = level;
        this.c = e2;
        if (z) {
            a(anhs.e, (Object) Boolean.TRUE);
        }
    }

    private final void b(String str, Object... objArr) {
        this.g = objArr;
        for (int i = 0; i < objArr.length; i++) {
            anhr anhr = objArr[i];
            if (anhr instanceof anhr) {
                objArr[i] = anhr.a();
            }
        }
        if (str != a) {
            this.f = new anjd(b(), str);
        }
        anhl a2 = a();
        ankq.a(this, "data");
        try {
            a2.b.a((anir) this);
        } catch (RuntimeException e2) {
            try {
                a2.b.a(e2, this);
            } catch (anit e3) {
                throw e3;
            } catch (RuntimeException e4) {
                PrintStream printStream = System.err;
                String valueOf = String.valueOf(e4.getMessage());
                printStream.println(valueOf.length() == 0 ? new String("logging error: ") : "logging error: ".concat(valueOf));
                apev.a.a((Throwable) e4, System.err);
            }
        }
    }

    private final boolean n() {
        Object obj;
        int a2;
        int i;
        Class<anhv> cls = anhv.class;
        if (this.e == null) {
            anhy a3 = aniy.a().a(cls, 1);
            ankq.a(a3, "logger backend must not return a null LogSite");
            this.e = a3;
        }
        if (this.e != anhy.a) {
            obj = this.e;
            String str = (String) k().b(anhs.d);
            if (str != null) {
                obj = new anhu(this.e, str);
            }
        } else {
            obj = null;
        }
        anht anht = this.d;
        if (!(anht == null || obj == null)) {
            Integer num = (Integer) anht.b(anhs.b);
            ania ania = (ania) this.d.b(anhs.c);
            anib anib = anic.a;
            anic anic = (anic) anib.a.get(obj);
            if (anic == null) {
                anic = new anic();
                anic anic2 = (anic) anib.a.putIfAbsent(obj, anic);
                if (anic2 != null) {
                    anic = anic2;
                }
            }
            if (num != null) {
                if (anic.b.getAndIncrement() % ((long) num.intValue()) != 0) {
                    return false;
                }
            }
            if (ania != null) {
                anic.c.get();
                throw null;
            }
        }
        anig anig = (anig) k().b(anhs.g);
        if (anig != null) {
            anif anif = anhs.g;
            anht anht2 = this.d;
            if (anht2 != null && (a2 = anht2.a(anif)) >= 0) {
                int i2 = a2 + a2;
                int i3 = i2 + 2;
                while (true) {
                    i = anht2.b;
                    if (i3 >= i + i) {
                        break;
                    }
                    Object obj2 = anht2.a[i3];
                    if (!obj2.equals(anif)) {
                        Object[] objArr = anht2.a;
                        objArr[i2] = obj2;
                        objArr[i2 + 1] = objArr[i3 + 1];
                        i2 += 2;
                    }
                    i3 += 2;
                }
                anht2.b = i - ((i3 - i2) >> 1);
                while (i2 < i3) {
                    anht2.a[i2] = null;
                    i2++;
                }
            }
            a(anhs.a, (Object) new anhz((Throwable) k().b(anhs.a), anig, ankp.b(cls, new Throwable(), anig.f)));
        }
        anjc c2 = aniy.c();
        if (!c2.b.isEmpty()) {
            a(anhs.f, (Object) c2);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract anhl a();

    public final anie a(String str, String str2, int i, String str3) {
        a((anhy) new anhx(str, str2, i, str3));
        return this;
    }

    public final void a(anhy anhy) {
        if (this.e == null) {
            this.e = anhy;
        }
    }

    /* access modifiers changed from: protected */
    public abstract ankm b();

    public final Level c() {
        return this.b;
    }

    public final long d() {
        return this.c;
    }

    public final String e() {
        return a().b.a();
    }

    public final anhy f() {
        anhy anhy = this.e;
        if (anhy != null) {
            return anhy;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    public final anjd g() {
        return this.f;
    }

    public final Object[] h() {
        if (this.f != null) {
            return this.g;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    public final Object i() {
        if (this.f == null) {
            return this.g[0];
        }
        throw new IllegalStateException("cannot get literal argument if a template context exists");
    }

    public final boolean j() {
        return this.d != null && Boolean.TRUE.equals(this.d.b(anhs.e));
    }

    public final aniv k() {
        anht anht = this.d;
        return anht == null ? aniu.a : anht;
    }

    public final boolean l() {
        return j() || a().c(this.b);
    }

    public final void m() {
        if (n()) {
            b(a, "");
        }
    }

    public final void a(int i) {
        if (j()) {
            return;
        }
        if (i <= 0) {
            throw new IllegalArgumentException("rate limit count must be positive");
        } else if (i > 1) {
            a(anhs.b, (Object) Integer.valueOf(i));
        }
    }

    public final void a(anif anif, Object obj) {
        if (this.d == null) {
            this.d = new anht();
        }
        anht anht = this.d;
        int a2 = anht.a(anif);
        if (a2 == -1) {
            int i = anht.b + 1;
            Object[] objArr = anht.a;
            int length = objArr.length;
            if (i + i > length) {
                anht.a = Arrays.copyOf(objArr, length + length);
            }
            Object[] objArr2 = anht.a;
            int i2 = anht.b;
            ankq.a(anif, "metadata key");
            objArr2[i2 + i2] = anif;
            Object[] objArr3 = anht.a;
            int i3 = anht.b;
            ankq.a(obj, "metadata value");
            objArr3[i3 + i3 + 1] = obj;
            anht.b++;
            return;
        }
        Object[] objArr4 = anht.a;
        ankq.a(obj, "metadata value");
        objArr4[a2 + a2 + 1] = obj;
    }

    public final void a(anig anig) {
        ankq.a(anig, "stack size");
        if (anig != anig.NONE) {
            a(anhs.g, (Object) anig);
        }
    }

    public final void a(String str) {
        if (n()) {
            b(a, str);
        }
    }

    public final void a(String str, byte b2) {
        if (n()) {
            b(str, Byte.valueOf(b2));
        }
    }

    public final void a(String str, byte b2, byte b3) {
        if (n()) {
            b(str, Byte.valueOf(b2), Byte.valueOf(b3));
        }
    }

    public final void a(String str, int i) {
        if (n()) {
            b(str, Integer.valueOf(i));
        }
    }

    public final void a(String str, int i, int i2) {
        if (n()) {
            b(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void a(String str, int i, long j) {
        if (n()) {
            b(str, Integer.valueOf(i), Long.valueOf(j));
        }
    }

    public final void a(String str, int i, Object obj) {
        if (n()) {
            b(str, Integer.valueOf(i), obj);
        }
    }

    public final void a(String str, long j) {
        if (n()) {
            b(str, Long.valueOf(j));
        }
    }

    public final void a(String str, long j, int i) {
        if (n()) {
            b(str, Long.valueOf(j), Integer.valueOf(i));
        }
    }

    public final void a(String str, long j, long j2) {
        if (n()) {
            b(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    public final void a(String str, long j, Object obj) {
        if (n()) {
            b(str, Long.valueOf(j), obj);
        }
    }

    public final void a(String str, long j, boolean z) {
        if (n()) {
            b(str, Long.valueOf(j), Boolean.valueOf(z));
        }
    }

    public final void a(String str, Object obj) {
        if (n()) {
            b(str, obj);
        }
    }

    public final void a(String str, Object obj, byte b2) {
        if (n()) {
            b(str, obj, Byte.valueOf(b2));
        }
    }

    public final void a(String str, Object obj, int i) {
        if (n()) {
            b(str, obj, Integer.valueOf(i));
        }
    }

    public final void a(String str, Object obj, long j) {
        if (n()) {
            b(str, obj, Long.valueOf(j));
        }
    }

    public final void a(String str, Object obj, Object obj2) {
        if (n()) {
            b(str, obj, obj2);
        }
    }

    public final void a(String str, Object obj, Object obj2, Object obj3) {
        if (n()) {
            b(str, obj, obj2, obj3);
        }
    }

    public final void a(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (n()) {
            b(str, obj, obj2, obj3, obj4);
        }
    }

    public final void a(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (n()) {
            b(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    public final void a(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (n()) {
            b(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    public final void a(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (n()) {
            b(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    public final void a(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (n()) {
            b(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        }
    }

    public final void a(String str, Object obj, boolean z) {
        if (n()) {
            b(str, obj, Boolean.valueOf(z));
        }
    }

    public final void a(String str, short s) {
        if (n()) {
            b(str, Short.valueOf(s));
        }
    }

    public final void a(String str, boolean z, boolean z2) {
        if (n()) {
            b(str, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    public final void a(String str, Object[] objArr) {
        if (n()) {
            b(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public final void a(Throwable th) {
        if (th != null) {
            a(anhs.a, (Object) th);
        }
    }
}
