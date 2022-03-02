package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: aqbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqbq extends azxl {
    public final Set a = angm.d();
    public final Deque b;
    public int c;
    public aqbp d;
    public azxk e;
    public boolean f = false;
    public boolean g = false;
    public azxl h;
    private final azxi i;
    private final baaj j;
    private final amzy k;
    private final Executor l;
    private final LinkedHashMap m = new LinkedHashMap();
    private final Set n = angm.d();
    private final Queue o;
    private azxh p;
    private final Queue q;
    private int r;
    private baaf s;

    public aqbq(azxi azxi, baaj baaj, azxh azxh, amzy amzy) {
        this.i = azxi;
        this.j = baaj;
        this.p = azxh;
        this.k = amzy;
        this.b = new ArrayDeque();
        this.q = new ArrayDeque();
        this.o = new ArrayDeque();
        this.d = new aqbp(amzy.size(), 1, 0, 0);
        Executor executor = azxh.c;
        this.l = new aqbc(this, aosd.a(executor == null ? aoqm.a : executor));
    }

    private final aqau b(aqau aqau) {
        azxh azxh = this.p;
        return azxh != aqau.b ? aqau.a(aqau.c, azxh, aqau.a, aqau.d) : aqau;
    }

    private final void d() {
        boolean z;
        aqbp aqbp;
        aqbp aqbp2 = this.d;
        if (aqbp2.e != 4) {
            z = false;
        } else {
            z = true;
        }
        amrl.b(!z, (Object) "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        int i2 = aqbp2.e;
        if (i2 == 3) {
            aqbp = new aqbp(aqbp2.a, 4, aqbp2.b, aqbp2.c);
        } else if (i2 == 1 && aqbp2.d) {
            int i3 = aqbp2.a;
            int i4 = aqbp2.b;
            aqbp = new aqbp(i3, 2, i4, i4);
        } else {
            int i5 = aqbp2.b;
            int i6 = i5 + 1;
            int i7 = aqbp2.a;
            if (i6 >= i7) {
                aqbp = new aqbp(i7, 3, i5, aqbp2.c);
            } else {
                aqbp = new aqbp(i7, 1, i6, aqbp2.c);
            }
        }
        this.d = aqbp;
        aqbz aqbz = aqbz.PROCEED;
        int i8 = this.d.e - 1;
        if (i8 == 0) {
            a(this.s);
        } else if (i8 != 2) {
            a();
        } else {
            azxl a2 = this.i.a(this.j, this.p);
            this.h = a2;
            a2.a(this.e, this.s);
            int i9 = this.c;
            if (i9 > 0) {
                this.h.a(i9);
            }
            for (Object a3 : this.o) {
                this.h.a(a3);
            }
            if (this.f && this.b.isEmpty()) {
                this.h.b();
            }
            d();
        }
    }

    private final void e() {
        while (!this.b.isEmpty()) {
            aqbo aqbo = (aqbo) this.b.peek();
            if (aqbo.b.isEmpty() && aqbo.c == aqbo.d.d.a) {
                Object obj = ((aqbo) this.b.poll()).a;
                if (this.d.e != 4) {
                    this.o.add(obj);
                } else {
                    this.h.a(obj);
                }
            } else {
                return;
            }
        }
    }

    public final void c() {
        if (this.f) {
            aqbo aqbo = (aqbo) this.b.peekLast();
            aqbz aqbz = aqbz.PROCEED;
            int i2 = this.d.e - 1;
            if (i2 != 1) {
                if (i2 == 3 && aqbo == null) {
                    this.h.b();
                }
            } else if (aqbo == null || (aqbo.b.isEmpty() && aqbo.c == aqbo.d.d.c + 1)) {
                d();
            }
        }
    }

    private final void a(aqbo aqbo, int i2, int i3) {
        amrl.b(aqbo.a instanceof audx, (Object) "Only MessageLite is supported");
        aqav aqav = new aqav((audx) aqbo.a);
        while (i2 < i3) {
            anhk i4 = ((amzy) this.k.get(i2)).listIterator();
            while (i4.hasNext()) {
                aqay aqay = (aqay) i4.next();
                aqcb b2 = aqay.b();
                if (b2.c.equals(aqbz.CONTINUE_AFTER)) {
                    aorr a2 = b2.a();
                    aqbo.b.put(aqay, a2);
                    a2.a(amll.a((Runnable) new aqbk(this, aqav, aqbo)), this.l);
                }
                if (a(b2)) {
                    return;
                }
            }
            i2++;
        }
        aqbo.c = i3;
        if (aqbo.b.isEmpty()) {
            e();
            c();
        }
    }

    public final void b() {
        this.l.execute(new aqbn(this));
    }

    private final boolean a(aqcb aqcb) {
        aqbz aqbz = aqbz.PROCEED;
        int ordinal = aqcb.c.ordinal();
        if (ordinal == 0) {
            azxh azxh = aqcb.f;
            if (azxh != null) {
                if (this.d.e != 1) {
                    IllegalStateException illegalStateException = new IllegalStateException("Cannot return proceedWithCallOptions() from message processing methods");
                    this.e.a(babj.a((Throwable) illegalStateException), new baaf());
                    if (this.d.e == 4) {
                        this.h.a("Interceptor returned invalid outcome", (Throwable) illegalStateException);
                    }
                    return true;
                }
                this.p = azxh;
            }
            return false;
        } else if (ordinal == 1) {
            aqbw aqbw = aqcb.e;
            this.e.a(aqbw.a, aqbw.b);
            if (this.d.e == 4) {
                this.h.a("Aborted RPC with exception", aqbw.a.t);
            }
            this.g = true;
            return true;
        } else if (ordinal == 2) {
            aqca aqca = aqcb.d;
            throw null;
        } else if (ordinal == 3) {
            aorr a2 = aqcb.a();
            this.a.add(a2);
            a2.a(new aqbi(this, a2), this.l);
            return false;
        } else if (ordinal == 4) {
            this.d.d = true;
            return false;
        } else {
            String valueOf = String.valueOf(aqcb.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Unrecognized outcome type: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void a() {
        aqbz aqbz = aqbz.PROCEED;
        int i2 = this.d.e - 1;
        if (i2 == 1) {
            for (aqbo aqbo : this.b) {
                int i3 = aqbo.c;
                int i4 = this.d.c;
                if (i3 <= i4) {
                    a(aqbo, i3, i4 + 1);
                }
            }
        } else if (i2 == 3) {
            for (aqbo aqbo2 : this.b) {
                a(aqbo2, aqbo2.c, this.d.a);
            }
        }
    }

    public final void a(int i2) {
        synchronized (this.q) {
            this.r += i2;
        }
        ArrayDeque<Object> arrayDeque = new ArrayDeque<>();
        synchronized (this.q) {
            if (!this.q.isEmpty()) {
                int i3 = this.r;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object poll = this.q.poll();
                    if (poll != null) {
                        arrayDeque.add(poll);
                        this.r--;
                    }
                }
                boolean isEmpty = this.q.isEmpty();
                for (Object a2 : arrayDeque) {
                    this.e.a(a2);
                }
                if (isEmpty) {
                    this.e.a(babj.b, (baaf) null);
                }
            }
        }
        this.l.execute(new aqbm(this, i2));
    }

    public final void a(aqau aqau) {
        if (!this.m.isEmpty()) {
            Iterator it = this.m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!((aorr) entry.getValue()).isDone()) {
                    break;
                }
                it.remove();
                aqay aqay = (aqay) entry.getKey();
                aqcb b2 = aqay.b(b(aqau));
                if (b2.c.equals(aqbz.CONTINUE_AFTER)) {
                    aorr a2 = b2.a();
                    this.m.put(aqay, a2);
                    a2.a(amll.a((Runnable) new aqbh(this, aqau)), this.l);
                }
                if (a(b2)) {
                    return;
                }
            }
            if (this.m.isEmpty()) {
                d();
            }
        }
    }

    public final void a(aqav aqav, aqbo aqbo) {
        Iterator it = aqbo.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((aorr) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            aqay aqay = (aqay) entry.getKey();
            aqcb a2 = aqay.a(aqav);
            if (a2.c.equals(aqbz.CONTINUE_AFTER)) {
                aorr a3 = a2.a();
                aqbo.b.put(aqay, a3);
                a3.a(amll.a((Runnable) new aqbl(this, aqav, aqbo)), this.l);
            }
            if (a(a2)) {
                return;
            }
        }
        if (aqbo.b.isEmpty()) {
            e();
            c();
        }
    }

    public final void a(azxk azxk, baaf baaf) {
        this.e = new aqch(new aqbv(azxk, this.k, this.n));
        this.s = baaf;
        this.l.execute(new aqbf(this, baaf));
    }

    public final void a(baaf baaf) {
        aqau a2 = aqau.a(this.j, this.p, baaf, this.i.a());
        anhk i2 = ((amzy) this.k.get(this.d.b)).listIterator();
        while (i2.hasNext()) {
            aqay aqay = (aqay) i2.next();
            aqcb a3 = aqay.a(b(a2));
            if (a3.c.equals(aqbz.CONTINUE_AFTER)) {
                aorr a4 = a3.a();
                this.m.put(aqay, a4);
                a4.a(amll.a((Runnable) new aqbg(this, a2)), this.l);
            }
            if (!a(a3)) {
                this.n.add(aqay);
            } else {
                return;
            }
        }
        if (this.m.isEmpty()) {
            d();
        }
    }

    public final void a(Object obj) {
        this.l.execute(new aqbj(this, obj));
    }

    public final void a(String str, Throwable th) {
        this.l.execute(new aqbd(this, str, th));
    }
}
