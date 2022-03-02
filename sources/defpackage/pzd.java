package defpackage;

import android.content.Intent;
import java.util.Arrays;

/* renamed from: pzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pzd {
    public final int a;
    public final Intent b;

    public pzd(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pzd) {
            pzd pzd = (pzd) obj;
            if (this.a != pzd.a || !amqx.a(this.b, pzd.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }
}
