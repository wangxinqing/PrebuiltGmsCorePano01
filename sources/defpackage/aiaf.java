package defpackage;

import java.util.Arrays;

/* renamed from: aiaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aiaf {
    public final long a;

    protected aiaf(long j) {
        this.a = j;
    }

    private static boolean a(String str, String str2) {
        return str == str2 || (str != null && str.equals(str2));
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract int d();

    public abstract int e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiaf) {
            aiaf aiaf = (aiaf) obj;
            return a(a(), aiaf.a()) && a(b(), aiaf.b()) && c().equals(aiaf.c()) && d() == aiaf.d() && e() == aiaf.e() && f() == aiaf.f() && Arrays.equals(g(), aiaf.g()) && h() == aiaf.h();
        }
    }

    public abstract int f();

    public abstract String[] g();

    public abstract int h();

    public int hashCode() {
        String a2 = a();
        Object[] objArr = new Object[7];
        objArr[0] = c();
        objArr[1] = Integer.valueOf(e());
        objArr[2] = Integer.valueOf(f());
        objArr[3] = Integer.valueOf(d());
        if (a2 == null) {
            a2 = "";
        }
        objArr[4] = a2;
        objArr[5] = Integer.valueOf(h());
        objArr[6] = Integer.valueOf(Arrays.hashCode(g()));
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BluetoothDeviceGetter [");
        sb.append("name=");
        sb.append(a());
        sb.append(", alias=");
        sb.append(b());
        sb.append(", deviceClass=");
        sb.append(e());
        sb.append(", majorDeviceClass=");
        sb.append(f());
        sb.append(", bondState=");
        sb.append(d());
        sb.append(", address=");
        sb.append(c());
        sb.append(", type=");
        sb.append(h());
        sb.append(", uuids=[");
        String[] g = g();
        if (g != null) {
            int length = g.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                String str = g[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(str);
                i++;
                z = false;
            }
        }
        sb.append("]]");
        return sb.toString();
    }
}
