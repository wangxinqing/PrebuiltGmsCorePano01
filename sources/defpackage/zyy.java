package defpackage;

import java.util.Arrays;

/* renamed from: zyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyy {
    private final String a;
    private final String b;

    public zyy(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zyy) {
            zyy zyy = (zyy) obj;
            if (this.a.equals(zyy.a)) {
                String str = this.b;
                if (str != null) {
                    return str.equals(zyy.b);
                }
                if (zyy.b != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
