package defpackage;

import com.google.android.chimera.Service;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* renamed from: aubd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aubd implements auek {
    private final aubc a;
    private int b;
    private int c;
    private int d = 0;

    private aubd(aubc aubc) {
        aucy.a((Object) aubc, "input");
        this.a = aubc;
        aubc.d = this;
    }

    public static aubd a(aubc aubc) {
        aubd aubd = aubc.d;
        return aubd == null ? new aubd(aubc) : aubd;
    }

    private final void b(int i) {
        if (this.a.A() != i) {
            throw auda.a();
        }
    }

    private final Object c(aueq aueq, aubs aubs) {
        int n = this.a.n();
        aubc aubc = this.a;
        int i = aubc.a;
        int i2 = aubc.b;
        if (i < 100) {
            int c2 = aubc.c(n);
            Object a2 = aueq.a();
            this.a.a++;
            aueq.a(a2, this, aubs);
            aueq.d(a2);
            this.a.a(0);
            aubc aubc2 = this.a;
            aubc2.a--;
            aubc2.d(c2);
            return a2;
        }
        throw new auda("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final Object d(aueq aueq, aubs aubs) {
        int i = this.c;
        this.c = aufy.a(aufy.b(this.b), 4);
        try {
            Object a2 = aueq.a();
            aueq.a(a2, this, aubs);
            aueq.d(a2);
            if (this.b == this.c) {
                return a2;
            }
            throw auda.h();
        } finally {
            this.c = i;
        }
    }

    public final int b() {
        return this.b;
    }

    public final float e() {
        a(5);
        return this.a.c();
    }

    public final long f() {
        a(0);
        return this.a.d();
    }

    public final long g() {
        a(0);
        return this.a.e();
    }

    public final int h() {
        a(0);
        return this.a.f();
    }

    public final long i() {
        a(1);
        return this.a.g();
    }

    public final int j() {
        a(5);
        return this.a.h();
    }

    public final void k(List list) {
        int a2;
        if (aufy.a(this.b) == 2) {
            do {
                list.add(n());
                if (!this.a.z()) {
                    a2 = this.a.a();
                } else {
                    return;
                }
            } while (a2 == this.b);
            this.d = a2;
            return;
        }
        throw auda.f();
    }

    public final String l() {
        a(2);
        return this.a.j();
    }

    public final String m() {
        a(2);
        return this.a.k();
    }

    public final auay n() {
        a(2);
        return this.a.l();
    }

    public final int o() {
        a(0);
        return this.a.n();
    }

    public final int p() {
        a(0);
        return this.a.o();
    }

    public final int q() {
        a(5);
        return this.a.p();
    }

    public final long r() {
        a(1);
        return this.a.q();
    }

    public final int s() {
        a(0);
        return this.a.r();
    }

    public final long t() {
        a(0);
        return this.a.s();
    }

    public final void e(List list) {
        int a2;
        int a3;
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            int a4 = aufy.a(this.b);
            if (a4 == 0) {
                do {
                    aucl.d(this.a.f());
                    if (!this.a.z()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (a4 == 2) {
                int A = this.a.A() + this.a.n();
                do {
                    aucl.d(this.a.f());
                } while (this.a.A() < A);
                b(A);
            } else {
                throw auda.f();
            }
        } else {
            int a5 = aufy.a(this.b);
            if (a5 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.f()));
                    if (!this.a.z()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (a5 == 2) {
                int A2 = this.a.A() + this.a.n();
                do {
                    list.add(Integer.valueOf(this.a.f()));
                } while (this.a.A() < A2);
                b(A2);
            } else {
                throw auda.f();
            }
        }
    }

    public final void f(List list) {
        int a2;
        int a3;
        if (list instanceof audl) {
            audl audl = (audl) list;
            int a4 = aufy.a(this.b);
            if (a4 == 1) {
                do {
                    audl.a(this.a.g());
                    if (!this.a.z()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (a4 == 2) {
                int n = this.a.n();
                d(n);
                int A = this.a.A() + n;
                do {
                    audl.a(this.a.g());
                } while (this.a.A() < A);
            } else {
                throw auda.f();
            }
        } else {
            int a5 = aufy.a(this.b);
            if (a5 == 1) {
                do {
                    list.add(Long.valueOf(this.a.g()));
                    if (!this.a.z()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (a5 == 2) {
                int n2 = this.a.n();
                d(n2);
                int A2 = this.a.A() + n2;
                do {
                    list.add(Long.valueOf(this.a.g()));
                } while (this.a.A() < A2);
            } else {
                throw auda.f();
            }
        }
    }

    public final void g(List list) {
        int a2;
        int a3;
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            int a4 = aufy.a(this.b);
            if (a4 == 2) {
                int n = this.a.n();
                c(n);
                int A = this.a.A() + n;
                do {
                    aucl.d(this.a.h());
                } while (this.a.A() < A);
            } else if (a4 == 5) {
                do {
                    aucl.d(this.a.h());
                    if (!this.a.z()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else {
                throw auda.f();
            }
        } else {
            int a5 = aufy.a(this.b);
            if (a5 == 2) {
                int n2 = this.a.n();
                c(n2);
                int A2 = this.a.A() + n2;
                do {
                    list.add(Integer.valueOf(this.a.h()));
                } while (this.a.A() < A2);
            } else if (a5 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.h()));
                    if (!this.a.z()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else {
                throw auda.f();
            }
        }
    }

    public final void h(List list) {
        int a2;
        int a3;
        if (list instanceof aual) {
            aual aual = (aual) list;
            int a4 = aufy.a(this.b);
            if (a4 == 0) {
                do {
                    aual.a(this.a.i());
                    if (!this.a.z()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (a4 == 2) {
                int A = this.a.A() + this.a.n();
                do {
                    aual.a(this.a.i());
                } while (this.a.A() < A);
                b(A);
            } else {
                throw auda.f();
            }
        } else {
            int a5 = aufy.a(this.b);
            if (a5 == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.i()));
                    if (!this.a.z()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (a5 == 2) {
                int A2 = this.a.A() + this.a.n();
                do {
                    list.add(Boolean.valueOf(this.a.i()));
                } while (this.a.A() < A2);
                b(A2);
            } else {
                throw auda.f();
            }
        }
    }

    public final void i(List list) {
        a(list, false);
    }

    public final void j(List list) {
        a(list, true);
    }

    public final void l(List list) {
        int a2;
        int a3;
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            int a4 = aufy.a(this.b);
            if (a4 == 0) {
                do {
                    aucl.d(this.a.n());
                    if (!this.a.z()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (a4 == 2) {
                int A = this.a.A() + this.a.n();
                do {
                    aucl.d(this.a.n());
                } while (this.a.A() < A);
                b(A);
            } else {
                throw auda.f();
            }
        } else {
            int a5 = aufy.a(this.b);
            if (a5 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.n()));
                    if (!this.a.z()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (a5 == 2) {
                int A2 = this.a.A() + this.a.n();
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.A() < A2);
                b(A2);
            } else {
                throw auda.f();
            }
        }
    }

    public final void m(List list) {
        int a2;
        int a3;
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            int a4 = aufy.a(this.b);
            if (a4 == 0) {
                do {
                    aucl.d(this.a.o());
                    if (!this.a.z()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (a4 == 2) {
                int A = this.a.A() + this.a.n();
                do {
                    aucl.d(this.a.o());
                } while (this.a.A() < A);
                b(A);
            } else {
                throw auda.f();
            }
        } else {
            int a5 = aufy.a(this.b);
            if (a5 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.o()));
                    if (!this.a.z()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (a5 == 2) {
                int A2 = this.a.A() + this.a.n();
                do {
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.A() < A2);
                b(A2);
            } else {
                throw auda.f();
            }
        }
    }

    public final void n(List list) {
        int a2;
        int a3;
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            int a4 = aufy.a(this.b);
            if (a4 == 2) {
                int n = this.a.n();
                c(n);
                int A = this.a.A() + n;
                do {
                    aucl.d(this.a.p());
                } while (this.a.A() < A);
            } else if (a4 == 5) {
                do {
                    aucl.d(this.a.p());
                    if (!this.a.z()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else {
                throw auda.f();
            }
        } else {
            int a5 = aufy.a(this.b);
            if (a5 == 2) {
                int n2 = this.a.n();
                c(n2);
                int A2 = this.a.A() + n2;
                do {
                    list.add(Integer.valueOf(this.a.p()));
                } while (this.a.A() < A2);
            } else if (a5 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.p()));
                    if (!this.a.z()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else {
                throw auda.f();
            }
        }
    }

    public final void o(List list) {
        int a2;
        int a3;
        if (list instanceof audl) {
            audl audl = (audl) list;
            int a4 = aufy.a(this.b);
            if (a4 == 1) {
                do {
                    audl.a(this.a.q());
                    if (!this.a.z()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (a4 == 2) {
                int n = this.a.n();
                d(n);
                int A = this.a.A() + n;
                do {
                    audl.a(this.a.q());
                } while (this.a.A() < A);
            } else {
                throw auda.f();
            }
        } else {
            int a5 = aufy.a(this.b);
            if (a5 == 1) {
                do {
                    list.add(Long.valueOf(this.a.q()));
                    if (!this.a.z()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (a5 == 2) {
                int n2 = this.a.n();
                d(n2);
                int A2 = this.a.A() + n2;
                do {
                    list.add(Long.valueOf(this.a.q()));
                } while (this.a.A() < A2);
            } else {
                throw auda.f();
            }
        }
    }

    public final void p(List list) {
        int a2;
        int a3;
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            int a4 = aufy.a(this.b);
            if (a4 == 0) {
                do {
                    aucl.d(this.a.r());
                    if (!this.a.z()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (a4 == 2) {
                int A = this.a.A() + this.a.n();
                do {
                    aucl.d(this.a.r());
                } while (this.a.A() < A);
                b(A);
            } else {
                throw auda.f();
            }
        } else {
            int a5 = aufy.a(this.b);
            if (a5 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.r()));
                    if (!this.a.z()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (a5 == 2) {
                int A2 = this.a.A() + this.a.n();
                do {
                    list.add(Integer.valueOf(this.a.r()));
                } while (this.a.A() < A2);
                b(A2);
            } else {
                throw auda.f();
            }
        }
    }

    public final void q(List list) {
        int a2;
        int a3;
        if (list instanceof audl) {
            audl audl = (audl) list;
            int a4 = aufy.a(this.b);
            if (a4 == 0) {
                do {
                    audl.a(this.a.s());
                    if (!this.a.z()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (a4 == 2) {
                int A = this.a.A() + this.a.n();
                do {
                    audl.a(this.a.s());
                } while (this.a.A() < A);
                b(A);
            } else {
                throw auda.f();
            }
        } else {
            int a5 = aufy.a(this.b);
            if (a5 == 0) {
                do {
                    list.add(Long.valueOf(this.a.s()));
                    if (!this.a.z()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (a5 == 2) {
                int A2 = this.a.A() + this.a.n();
                do {
                    list.add(Long.valueOf(this.a.s()));
                } while (this.a.A() < A2);
                b(A2);
            } else {
                throw auda.f();
            }
        }
    }

    private final Object a(aufw aufw, Class cls, aubs aubs) {
        aufw aufw2 = aufw.DOUBLE;
        switch (aufw.ordinal()) {
            case 0:
                return Double.valueOf(d());
            case 1:
                return Float.valueOf(e());
            case 2:
                return Long.valueOf(g());
            case 3:
                return Long.valueOf(f());
            case 4:
                return Integer.valueOf(h());
            case 5:
                return Long.valueOf(i());
            case 6:
                return Integer.valueOf(j());
            case 7:
                return Boolean.valueOf(k());
            case 8:
                return m();
            case 10:
                return a(cls, aubs);
            case 11:
                return n();
            case 12:
                return Integer.valueOf(o());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return Integer.valueOf(p());
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return Integer.valueOf(q());
            case Service.START_CONTINUATION_MASK:
                return Long.valueOf(r());
            case 16:
                return Integer.valueOf(s());
            case 17:
                return Long.valueOf(t());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public final Object b(aueq aueq, aubs aubs) {
        a(3);
        return d(aueq, aubs);
    }

    public final Object b(Class cls, aubs aubs) {
        a(3);
        return d(aueh.a.a(cls), aubs);
    }

    private static final void d(int i) {
        if ((i & 7) != 0) {
            throw auda.h();
        }
    }

    public final void b(List list) {
        int a2;
        int a3;
        if (list instanceof aubz) {
            aubz aubz = (aubz) list;
            int a4 = aufy.a(this.b);
            if (a4 == 2) {
                int n = this.a.n();
                c(n);
                int A = this.a.A() + n;
                do {
                    aubz.a(this.a.c());
                } while (this.a.A() < A);
            } else if (a4 == 5) {
                do {
                    aubz.a(this.a.c());
                    if (!this.a.z()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else {
                throw auda.f();
            }
        } else {
            int a5 = aufy.a(this.b);
            if (a5 == 2) {
                int n2 = this.a.n();
                c(n2);
                int A2 = this.a.A() + n2;
                do {
                    list.add(Float.valueOf(this.a.c()));
                } while (this.a.A() < A2);
            } else if (a5 == 5) {
                do {
                    list.add(Float.valueOf(this.a.c()));
                    if (!this.a.z()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else {
                throw auda.f();
            }
        }
    }

    public final boolean k() {
        a(0);
        return this.a.i();
    }

    public final double d() {
        a(1);
        return this.a.b();
    }

    private static final void c(int i) {
        if ((i & 3) != 0) {
            throw auda.h();
        }
    }

    public final void d(List list) {
        int a2;
        int a3;
        if (list instanceof audl) {
            audl audl = (audl) list;
            int a4 = aufy.a(this.b);
            if (a4 == 0) {
                do {
                    audl.a(this.a.e());
                    if (!this.a.z()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (a4 == 2) {
                int A = this.a.A() + this.a.n();
                do {
                    audl.a(this.a.e());
                } while (this.a.A() < A);
                b(A);
            } else {
                throw auda.f();
            }
        } else {
            int a5 = aufy.a(this.b);
            if (a5 == 0) {
                do {
                    list.add(Long.valueOf(this.a.e()));
                    if (!this.a.z()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (a5 == 2) {
                int A2 = this.a.A() + this.a.n();
                do {
                    list.add(Long.valueOf(this.a.e()));
                } while (this.a.A() < A2);
                b(A2);
            } else {
                throw auda.f();
            }
        }
    }

    public final void c(List list) {
        int a2;
        int a3;
        if (list instanceof audl) {
            audl audl = (audl) list;
            int a4 = aufy.a(this.b);
            if (a4 == 0) {
                do {
                    audl.a(this.a.d());
                    if (!this.a.z()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (a4 == 2) {
                int A = this.a.A() + this.a.n();
                do {
                    audl.a(this.a.d());
                } while (this.a.A() < A);
                b(A);
            } else {
                throw auda.f();
            }
        } else {
            int a5 = aufy.a(this.b);
            if (a5 == 0) {
                do {
                    list.add(Long.valueOf(this.a.d()));
                    if (!this.a.z()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (a5 == 2) {
                int A2 = this.a.A() + this.a.n();
                do {
                    list.add(Long.valueOf(this.a.d()));
                } while (this.a.A() < A2);
                b(A2);
            } else {
                throw auda.f();
            }
        }
    }

    public final void b(List list, aueq aueq, aubs aubs) {
        int a2;
        if (aufy.a(this.b) == 3) {
            int i = this.b;
            do {
                list.add(d(aueq, aubs));
                if (!this.a.z() && this.d == 0) {
                    a2 = this.a.a();
                } else {
                    return;
                }
            } while (a2 == i);
            this.d = a2;
            return;
        }
        throw auda.f();
    }

    public final boolean c() {
        int i;
        if (this.a.z() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.b(i);
    }

    private final void a(int i) {
        if (aufy.a(this.b) != i) {
            throw auda.f();
        }
    }

    public final int a() {
        int i = this.d;
        if (i == 0) {
            i = this.a.a();
            this.b = i;
        } else {
            this.b = i;
            this.d = 0;
        }
        if (i == 0 || i == this.c) {
            return Integer.MAX_VALUE;
        }
        return aufy.b(i);
    }

    public final Object a(aueq aueq, aubs aubs) {
        a(2);
        return c(aueq, aubs);
    }

    public final Object a(Class cls, aubs aubs) {
        a(2);
        return c(aueh.a.a(cls), aubs);
    }

    public final void a(List list) {
        int a2;
        int a3;
        if (list instanceof aubm) {
            aubm aubm = (aubm) list;
            int a4 = aufy.a(this.b);
            if (a4 == 1) {
                do {
                    aubm.a(this.a.b());
                    if (!this.a.z()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (a4 == 2) {
                int n = this.a.n();
                d(n);
                int A = this.a.A() + n;
                do {
                    aubm.a(this.a.b());
                } while (this.a.A() < A);
            } else {
                throw auda.f();
            }
        } else {
            int a5 = aufy.a(this.b);
            if (a5 == 1) {
                do {
                    list.add(Double.valueOf(this.a.b()));
                    if (!this.a.z()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (a5 == 2) {
                int n2 = this.a.n();
                d(n2);
                int A2 = this.a.A() + n2;
                do {
                    list.add(Double.valueOf(this.a.b()));
                } while (this.a.A() < A2);
            } else {
                throw auda.f();
            }
        }
    }

    public final void a(List list, aueq aueq, aubs aubs) {
        int a2;
        if (aufy.a(this.b) == 2) {
            int i = this.b;
            do {
                list.add(c(aueq, aubs));
                if (!this.a.z() && this.d == 0) {
                    a2 = this.a.a();
                } else {
                    return;
                }
            } while (a2 == i);
            this.d = a2;
            return;
        }
        throw auda.f();
    }

    public final void a(List list, boolean z) {
        int a2;
        int a3;
        if (aufy.a(this.b) != 2) {
            throw auda.f();
        } else if ((list instanceof audh) && !z) {
            audh audh = (audh) list;
            do {
                audh.a(n());
                if (!this.a.z()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
        } else {
            do {
                list.add(!z ? l() : m());
                if (!this.a.z()) {
                    a2 = this.a.a();
                } else {
                    return;
                }
            } while (a2 == this.b);
            this.d = a2;
        }
    }

    public final void a(Map map, audp audp, aubs aubs) {
        a(2);
        int c2 = this.a.c(this.a.n());
        Object obj = audp.b;
        Object obj2 = audp.d;
        while (true) {
            try {
                int a2 = a();
                if (a2 == Integer.MAX_VALUE || this.a.z()) {
                    map.put(obj, obj2);
                } else if (a2 == 1) {
                    obj = a(audp.a, (Class) null, (aubs) null);
                } else if (a2 == 2) {
                    obj2 = a(audp.c, (Class) audp.d.getClass(), aubs);
                } else if (!c()) {
                    throw new auda("Unable to parse map entry.");
                }
            } catch (aucz e) {
                if (!c()) {
                    throw new auda("Unable to parse map entry.");
                }
            } catch (Throwable th) {
                this.a.d(c2);
                throw th;
            }
        }
        map.put(obj, obj2);
        this.a.d(c2);
    }
}
