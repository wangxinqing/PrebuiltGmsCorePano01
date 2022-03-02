package defpackage;

import java.util.Arrays;

/* renamed from: amic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amic {
    public static final amic a = new amic();
    public amib b = amib.KIND_NOT_SET;
    private Object c = null;

    private amic() {
    }

    public static amia f() {
        return new amia();
    }

    public final double a() {
        if (this.b == amib.NUMBER_VALUE) {
            return ((Double) this.c).doubleValue();
        }
        return 0.0d;
    }

    public final String b() {
        return this.b == amib.STRING_VALUE ? (String) this.c : "";
    }

    public final boolean c() {
        if (this.b == amib.BOOL_VALUE) {
            return ((Boolean) this.c).booleanValue();
        }
        return false;
    }

    public final amhx d() {
        return this.b == amib.STRUCT_VALUE ? (amhx) this.c : amhx.a;
    }

    public final amhu e() {
        return this.b == amib.LIST_VALUE ? (amhu) this.c : amhu.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amic) {
            amic amic = (amic) obj;
            return alyr.a(this.c, amic.c) && this.b == amic.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.b});
    }

    public amic(amia amia) {
        this.c = amia.b;
        this.b = amia.a;
    }
}
