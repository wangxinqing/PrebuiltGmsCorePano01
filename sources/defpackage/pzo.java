package defpackage;

import android.content.Intent;
import java.util.Arrays;

/* renamed from: pzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pzo {
    public final int a;
    public final Intent b;

    public pzo(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pzo) {
            pzo pzo = (pzo) obj;
            if (this.a != pzo.a || !amqx.a(this.b, pzo.b)) {
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
