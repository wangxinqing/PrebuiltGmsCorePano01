package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* renamed from: aueb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aueb implements aueq {
    private final audx a;
    private final auff b;
    private final boolean c;

    private aueb(auff auff, audx audx) {
        this.b = auff;
        this.c = audx instanceof aucg;
        this.a = audx;
    }

    static aueb a(auff auff, aubt aubt, audx audx) {
        return new aueb(auff, audx);
    }

    public final void d(Object obj) {
        auff.c(obj);
        aubt.c(obj);
    }

    public final boolean e(Object obj) {
        return aubt.a(obj).e();
    }

    public final int b(Object obj) {
        aufg a2 = auff.a(obj);
        int i = a2.e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < a2.b; i2++) {
                int i3 = a2.c[i2];
                int i4 = aubk.i(1);
                i += i4 + i4 + aubk.h(2, aufy.b(i3)) + aubk.c(3, (auay) a2.d[i2]);
            }
            a2.e = i;
        }
        if (!this.c) {
            return i;
        }
        aubx a3 = aubt.a(obj);
        int i5 = 0;
        for (int i6 = 0; i6 < a3.a.a(); i6++) {
            i5 += a3.b(a3.a.b(i6));
        }
        for (Map.Entry b2 : a3.a.b()) {
            i5 += a3.b(b2);
        }
        return i + i5;
    }

    public final int a(Object obj) {
        int hashCode = auff.a(obj).hashCode();
        return this.c ? (hashCode * 53) + aubt.a(obj).hashCode() : hashCode;
    }

    public final Object a() {
        return this.a.ay().h();
    }

    public final void a(Object obj, aubl aubl) {
        Iterator d = aubt.a(obj).d();
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            auch auch = (auch) entry.getKey();
            if (auch.a() != aufx.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof audc) {
                aubl.a(auch.a, (Object) ((aude) ((audc) entry).a.getValue()).a());
            } else {
                aubl.a(auch.a, entry.getValue());
            }
        }
        aufg a2 = auff.a(obj);
        for (int i = 0; i < a2.b; i++) {
            aubl.a(aufy.b(a2.c[i]), a2.d[i]);
        }
    }

    public final void b(Object obj, Object obj2) {
        auer.c(obj, obj2);
        if (this.c) {
            auer.b(obj, obj2);
        }
    }

    public final void a(Object obj, auek auek, aubs aubs) {
        boolean z;
        auff auff = this.b;
        Object b2 = auff.b(obj);
        aubx b3 = aubt.b(obj);
        while (auek.a() != Integer.MAX_VALUE) {
            try {
                int b4 = auek.b();
                if (b4 == aufy.a) {
                    int i = 0;
                    auci auci = null;
                    auay auay = null;
                    while (true) {
                        if (auek.a() == Integer.MAX_VALUE) {
                            break;
                        }
                        int b5 = auek.b();
                        if (b5 == aufy.c) {
                            i = auek.o();
                            auci = aubs.a(this.a, i);
                        } else if (b5 != aufy.d) {
                            if (!auek.c()) {
                                break;
                            }
                        } else if (auci != null) {
                            aubt.a(auek, auci, aubs, b3);
                        } else {
                            auay = auek.n();
                        }
                    }
                    if (auek.b() != aufy.b) {
                        throw auda.e();
                    } else if (auay == null) {
                        continue;
                    } else if (auci != null) {
                        audx h = auci.c.ay().h();
                        ByteBuffer wrap = ByteBuffer.wrap(auay.k());
                        if (wrap.hasArray()) {
                            auaj auaj = new auaj(wrap);
                            aueh.a.a((Object) h).a(h, auaj, aubs);
                            b3.a(auci.d, h);
                            if (auaj.a() != Integer.MAX_VALUE) {
                                throw auda.e();
                            }
                        } else {
                            throw new IllegalArgumentException("Direct buffers not yet supported");
                        }
                    } else {
                        ((aufg) b2).a(aufy.a(i, 2), (Object) auay);
                    }
                } else {
                    if (aufy.a(b4) == 2) {
                        auci a2 = aubs.a(this.a, aufy.b(b4));
                        if (a2 == null) {
                            z = auff.a(b2, auek);
                        } else {
                            aubt.a(auek, a2, aubs, b3);
                        }
                    } else {
                        z = auek.c();
                    }
                    if (!z) {
                        break;
                    }
                }
            } finally {
                auff.a(obj, (aufg) b2);
            }
        }
    }

    public final void a(Object obj, byte[] bArr, int i, int i2, auah auah) {
        aucj aucj = (aucj) obj;
        aufg aufg = aucj.T;
        if (aufg == aufg.a) {
            aufg = aufg.a();
            aucj.T = aufg;
        }
        aubx c2 = ((aucg) obj).c();
        auci auci = null;
        while (i < i2) {
            int a2 = auai.a(bArr, i, auah);
            int i3 = auah.a;
            if (i3 == aufy.a) {
                int i4 = 0;
                auay auay = null;
                while (a2 < i2) {
                    a2 = auai.a(bArr, a2, auah);
                    int i5 = auah.a;
                    int a3 = aufy.a(i5);
                    int b2 = aufy.b(i5);
                    if (b2 != 2) {
                        if (b2 == 3) {
                            if (auci != null) {
                                a2 = auai.a(aueh.a.a((Class) auci.c.getClass()), bArr, a2, i2, auah);
                                c2.a(auci.d, auah.c);
                            } else if (a3 == 2) {
                                a2 = auai.e(bArr, a2, auah);
                                auay = (auay) auah.c;
                            }
                        }
                    } else if (a3 == 0) {
                        a2 = auai.a(bArr, a2, auah);
                        i4 = auah.a;
                        auci = auah.d.a(this.a, i4);
                    }
                    if (i5 == aufy.b) {
                        break;
                    }
                    a2 = auai.a(i5, bArr, a2, i2, auah);
                }
                if (auay != null) {
                    aufg.a(aufy.a(i4, 2), (Object) auay);
                }
                i = a2;
            } else if (aufy.a(i3) == 2) {
                auci a4 = auah.d.a(this.a, aufy.b(i3));
                if (a4 == null) {
                    i = auai.a(i3, bArr, a2, i2, aufg, auah);
                    auci = a4;
                } else {
                    i = auai.a(aueh.a.a((Class) a4.c.getClass()), bArr, a2, i2, auah);
                    c2.a(a4.d, auah.c);
                    auci = a4;
                }
            } else {
                i = auai.a(i3, bArr, a2, i2, auah);
            }
        }
        if (i != i2) {
            throw auda.h();
        }
    }

    public final boolean a(Object obj, Object obj2) {
        if (!auff.a(obj).equals(auff.a(obj2))) {
            return false;
        }
        if (this.c) {
            return aubt.a(obj).equals(aubt.a(obj2));
        }
        return true;
    }
}
