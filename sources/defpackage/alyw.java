package defpackage;

import java.util.Arrays;

/* renamed from: alyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class alyw extends alzb {
    /* access modifiers changed from: protected */
    public abstract char a(int i);

    /* access modifiers changed from: protected */
    public abstract String a();

    public final /* bridge */ /* synthetic */ boolean a(int i, alzb alzb, int i2) {
        return a(i) == ((alyw) alzb).a(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof alyw)) {
            alyw alyw = (alyw) obj;
            if (alyw.b() == b()) {
                for (int i = 0; i < alyw.b(); i++) {
                    if (alyw.a(i) != a(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }
}
