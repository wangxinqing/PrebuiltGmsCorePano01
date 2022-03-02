package defpackage;

import java.util.Arrays;

/* renamed from: cvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cvm {
    public final String a;

    private cvm(String str) {
        this.a = str;
    }

    public static cvm a(String str) {
        if (str == null) {
            return new cvm("");
        }
        return new cvm(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cvm) {
            return this.a.equals(((cvm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
