package defpackage;

import android.net.NetworkInfo;
import java.util.Arrays;

/* renamed from: lgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lgx implements lgv {
    public final lgw a;
    public final boolean b;
    private final boolean c;

    public lgx(lgy lgy) {
        this.a = lgy.b();
        NetworkInfo c2 = lgy.c();
        boolean z = false;
        if (c2 != null && c2.isRoaming()) {
            z = true;
        }
        this.c = z;
        this.b = lgy.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            lgx lgx = (lgx) obj;
            return ius.a(Boolean.valueOf(this.c), Boolean.valueOf(lgx.c)) && ius.a(Boolean.valueOf(this.b), Boolean.valueOf(lgx.b)) && ius.a(this.a, lgx.a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Boolean.valueOf(this.b)});
    }
}
