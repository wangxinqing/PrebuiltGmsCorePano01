package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: axi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axi {
    public axj a;
    private final List b;

    private axi(axi axi) {
        this.b = new ArrayList(axi.b);
        this.a = axi.a;
    }

    private final boolean a() {
        List list = this.b;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    private static final boolean b(String str) {
        return "__container".equals(str);
    }

    public final boolean c(String str, int i) {
        if (i >= this.b.size()) {
            return false;
        }
        int size = this.b.size() - 1;
        String str2 = (String) this.b.get(i);
        if (!str2.equals("**")) {
            boolean z = str2.equals(str) || str2.equals("*");
            if ((i == size || (i == this.b.size() - 2 && a())) && z) {
                return true;
            }
            return false;
        } else if (i == size) {
            return true;
        } else {
            int i2 = i + 1;
            if (((String) this.b.get(i2)).equals(str)) {
                if (i == this.b.size() - 2 || (i == this.b.size() - 3 && a())) {
                    return true;
                }
                return false;
            } else if (i2 >= this.b.size() - 1) {
                return ((String) this.b.get(i2)).equals(str);
            } else {
                return false;
            }
        }
    }

    public final boolean d(String str, int i) {
        if ("__container".equals(str) || i < this.b.size() - 1 || ((String) this.b.get(i)).equals("**")) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.b);
        sb.append(",resolved=");
        sb.append(this.a != null);
        sb.append('}');
        return sb.toString();
    }

    public axi(String... strArr) {
        this.b = Arrays.asList(strArr);
    }

    public final axi a(axj axj) {
        axi axi = new axi(this);
        axi.a = axj;
        return axi;
    }

    public final int b(String str, int i) {
        if (b(str)) {
            return 0;
        }
        if (!((String) this.b.get(i)).equals("**")) {
            return 1;
        }
        if (i == this.b.size() - 1 || !((String) this.b.get(i + 1)).equals(str)) {
            return 0;
        }
        return 2;
    }

    public final axi a(String str) {
        axi axi = new axi(this);
        axi.b.add(str);
        return axi;
    }

    public final boolean a(String str, int i) {
        if (b(str)) {
            return true;
        }
        if (i >= this.b.size()) {
            return false;
        }
        if (((String) this.b.get(i)).equals(str) || ((String) this.b.get(i)).equals("**") || ((String) this.b.get(i)).equals("*")) {
            return true;
        }
        return false;
    }
}
