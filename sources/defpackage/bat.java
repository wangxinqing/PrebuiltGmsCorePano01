package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* renamed from: bat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bat implements Closeable {
    public static final String[] a = new String[128];
    int b;
    int[] c = new int[32];
    String[] d = new String[32];
    int[] e = new int[32];

    static {
        for (int i = 0; i <= 31; i++) {
            a[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static bat a(batf batf) {
        return new bau(batf);
    }

    public abstract int a(bar bar);

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    public abstract String f();

    public abstract void g();

    public abstract String h();

    public abstract boolean i();

    public abstract double j();

    public abstract int k();

    public abstract void l();

    public final String m() {
        int i = this.b;
        int[] iArr = this.c;
        String[] strArr = this.d;
        int[] iArr2 = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract int n();

    /* access modifiers changed from: package-private */
    public final baq a(String str) {
        throw new baq(str + " at path " + m());
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        int i2 = this.b;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 != 256) {
                this.c = Arrays.copyOf(iArr, length + length);
                String[] strArr = this.d;
                int length2 = strArr.length;
                this.d = (String[]) Arrays.copyOf(strArr, length2 + length2);
                int[] iArr2 = this.e;
                int length3 = iArr2.length;
                this.e = Arrays.copyOf(iArr2, length3 + length3);
            } else {
                throw new bap("Nesting too deep at " + m());
            }
        }
        int[] iArr3 = this.c;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr3[i3] = i;
    }
}
