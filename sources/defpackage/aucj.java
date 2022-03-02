package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: aucj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aucj extends auac {
    public static final Map V = new ConcurrentHashMap();
    protected aufg T = aufg.a;
    public int U = -1;

    public static auci a(audx audx, Object obj, audx audx2, int i, aufw aufw) {
        return new auci(audx, obj, audx2, new auch(i, aufw));
    }

    public static aucj b(aucj aucj, InputStream inputStream) {
        aucj aucj2;
        aubs b = aubs.b();
        try {
            int read = inputStream.read();
            if (read != -1) {
                aubc a = aubc.a((InputStream) new auaa(inputStream, aubc.a(read, inputStream)));
                aucj2 = (aucj) aucj.c(4);
                try {
                    aueq a2 = aueh.a.a((Object) aucj2);
                    a2.a(aucj2, aubd.a(a), b);
                    a2.d(aucj2);
                    try {
                        a.a(0);
                    } catch (auda e) {
                        throw e;
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof auda) {
                        throw ((auda) e2.getCause());
                    }
                    throw new auda(e2.getMessage());
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof auda) {
                        throw ((auda) e3.getCause());
                    }
                    throw e3;
                }
            } else {
                aucj2 = null;
            }
            b(aucj2);
            return aucj2;
        } catch (IOException e4) {
            throw new auda(e4.getMessage());
        }
    }

    public static aucs q() {
        return aucl.b;
    }

    public static aucv r() {
        return audl.b;
    }

    public static aucx s() {
        return auei.b;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i, Object obj);

    public final boolean az() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e = aueh.a.a((Object) this).e(this);
        if (!booleanValue) {
            return e;
        }
        a(2, (Object) !e ? null : this);
        return e;
    }

    public final void b(int i) {
        this.U = i;
    }

    public final Object c(int i) {
        return a(i, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return aueh.a.a((Object) this).a((Object) this, (Object) (aucj) obj);
    }

    public final int hashCode() {
        int i = this.S;
        if (i != 0) {
            return i;
        }
        int a = aueh.a.a((Object) this).a(this);
        this.S = a;
        return a;
    }

    public final int l() {
        return this.U;
    }

    public final auef n() {
        return (auef) c(7);
    }

    public final aucd o() {
        return (aucd) c(5);
    }

    public final int p() {
        int i = this.U;
        if (i != -1) {
            return i;
        }
        int b = aueh.a.a((Object) this).b(this);
        this.U = b;
        return b;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        audz.a(this, sb, 0);
        return sb.toString();
    }

    public static aucj a(aucj aucj, auay auay) {
        aubs b = aubs.b();
        try {
            aubc h = auay.h();
            aucj aucj2 = (aucj) aucj.c(4);
            aueq a = aueh.a.a((Object) aucj2);
            a.a(aucj2, aubd.a(h), b);
            a.d(aucj2);
            h.a(0);
            b(aucj2);
            b(aucj2);
            return aucj2;
        } catch (IOException e) {
            if (!(e.getCause() instanceof auda)) {
                throw new auda(e.getMessage());
            }
            throw ((auda) e.getCause());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof auda) {
                throw ((auda) e2.getCause());
            }
            throw e2;
        } catch (auda e3) {
            throw e3;
        } catch (auda e4) {
            throw e4;
        }
    }

    public final /* bridge */ /* synthetic */ audw av() {
        aucd aucd = (aucd) c(5);
        aucd.a(this);
        return aucd;
    }

    public final /* bridge */ /* synthetic */ audw ay() {
        return (aucd) c(5);
    }

    public final /* bridge */ /* synthetic */ audx j() {
        return (aucj) c(6);
    }

    public static void b(aucj aucj) {
        if (aucj != null && !aucj.az()) {
            throw m().a();
        }
    }

    public static aucj a(aucj aucj, aubc aubc) {
        aubs b = aubs.b();
        aucj aucj2 = (aucj) aucj.c(4);
        try {
            aueq a = aueh.a.a((Object) aucj2);
            a.a(aucj2, aubd.a(aubc), b);
            a.d(aucj2);
            b(aucj2);
            return aucj2;
        } catch (IOException e) {
            if (e.getCause() instanceof auda) {
                throw ((auda) e.getCause());
            }
            throw new auda(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof auda) {
                throw ((auda) e2.getCause());
            }
            throw e2;
        }
    }

    static aucj a(aucj aucj, aubc aubc, aubs aubs) {
        aucj aucj2 = (aucj) aucj.c(4);
        try {
            aueq a = aueh.a.a((Object) aucj2);
            a.a(aucj2, aubd.a(aubc), aubs);
            a.d(aucj2);
            return aucj2;
        } catch (IOException e) {
            if (e.getCause() instanceof auda) {
                throw ((auda) e.getCause());
            }
            throw new auda(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof auda) {
                throw ((auda) e2.getCause());
            }
            throw e2;
        }
    }

    public static aucj a(aucj aucj, InputStream inputStream) {
        aubc a = aubc.a(inputStream);
        aubs b = aubs.b();
        aucj aucj2 = (aucj) aucj.c(4);
        try {
            aueq a2 = aueh.a.a((Object) aucj2);
            a2.a(aucj2, aubd.a(a), b);
            a2.d(aucj2);
            b(aucj2);
            return aucj2;
        } catch (IOException e) {
            if (e.getCause() instanceof auda) {
                throw ((auda) e.getCause());
            }
            throw new auda(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof auda) {
                throw ((auda) e2.getCause());
            }
            throw e2;
        }
    }

    public static aucj a(aucj aucj, InputStream inputStream, aubs aubs) {
        aubc a = aubc.a(inputStream);
        aucj aucj2 = (aucj) aucj.c(4);
        try {
            aueq a2 = aueh.a.a((Object) aucj2);
            a2.a(aucj2, aubd.a(a), aubs);
            a2.d(aucj2);
            b(aucj2);
            return aucj2;
        } catch (IOException e) {
            if (e.getCause() instanceof auda) {
                throw ((auda) e.getCause());
            }
            throw new auda(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof auda) {
                throw ((auda) e2.getCause());
            }
            throw e2;
        }
    }

    public static aucj a(aucj aucj, ByteBuffer byteBuffer) {
        aubs b = aubs.b();
        aubc a = aubc.a(byteBuffer);
        aucj aucj2 = (aucj) aucj.c(4);
        try {
            aueq a2 = aueh.a.a((Object) aucj2);
            a2.a(aucj2, aubd.a(a), b);
            a2.d(aucj2);
            b(aucj2);
            b(aucj2);
            return aucj2;
        } catch (IOException e) {
            if (e.getCause() instanceof auda) {
                throw ((auda) e.getCause());
            }
            throw new auda(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof auda) {
                throw ((auda) e2.getCause());
            }
            throw e2;
        }
    }

    public static aucj a(aucj aucj, ByteBuffer byteBuffer, aubs aubs) {
        aubc a = aubc.a(byteBuffer);
        aucj aucj2 = (aucj) aucj.c(4);
        try {
            aueq a2 = aueh.a.a((Object) aucj2);
            a2.a(aucj2, aubd.a(a), aubs);
            a2.d(aucj2);
            b(aucj2);
            b(aucj2);
            return aucj2;
        } catch (IOException e) {
            if (e.getCause() instanceof auda) {
                throw ((auda) e.getCause());
            }
            throw new auda(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof auda) {
                throw ((auda) e2.getCause());
            }
            throw e2;
        }
    }

    public static aucj a(aucj aucj, byte[] bArr) {
        aucj a = a(aucj, bArr, 0, bArr.length, aubs.b());
        b(a);
        return a;
    }

    public static aucj a(aucj aucj, byte[] bArr, int i, int i2, aubs aubs) {
        aucj aucj2 = (aucj) aucj.c(4);
        try {
            aueq a = aueh.a.a((Object) aucj2);
            a.a(aucj2, bArr, i, i + i2, new auah(aubs));
            a.d(aucj2);
            if (aucj2.S == 0) {
                return aucj2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof auda) {
                throw ((auda) e.getCause());
            }
            throw new auda(e.getMessage());
        } catch (IndexOutOfBoundsException e2) {
            throw auda.a();
        }
    }

    public static aucj a(aucj aucj, byte[] bArr, aubs aubs) {
        aucj a = a(aucj, bArr, 0, bArr.length, aubs);
        b(a);
        return a;
    }

    public static aucr a(aucr aucr) {
        int size = aucr.size();
        return aucr.a(size != 0 ? size + size : 10);
    }

    public static aucs a(aucs aucs) {
        int size = aucs.size();
        return aucs.a(size != 0 ? size + size : 10);
    }

    public static aucv a(aucv aucv) {
        int size = aucv.size();
        return aucv.c(size != 0 ? size + size : 10);
    }

    public static aucx a(aucx aucx) {
        int size = aucx.size();
        return aucx.b(size != 0 ? size + size : 10);
    }

    protected static Object a(audx audx, String str, Object[] objArr) {
        return new auej(audx, str, objArr);
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static void a(Class cls, aucj aucj) {
        V.put(cls, aucj);
    }

    public final aucd a(aucj aucj) {
        aucd o = o();
        o.a(aucj);
        return o;
    }

    public final void a(aubk aubk) {
        aueq a = aueh.a.a((Object) this);
        aubl aubl = aubk.f;
        if (aubl == null) {
            aubl = new aubl(aubk);
        }
        a.a((Object) this, aubl);
    }
}
