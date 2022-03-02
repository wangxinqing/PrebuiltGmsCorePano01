package defpackage;

import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Strategy;

/* renamed from: uyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyk {
    public int a = 3;
    public int b = 0;
    public int c = -1;
    private int d = 300;
    private int e = 0;

    public uyk() {
    }

    public final Strategy a() {
        int i = this.c;
        if (i != 2 || this.b != 1) {
            return new Strategy(2, 0, this.d, this.b, false, i, this.a, this.e);
        }
        throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
    }

    public uyk(Strategy strategy) {
        this.a = strategy.i;
        this.d = strategy.e;
        this.b = strategy.f;
        this.c = strategy.h;
        Parcelable.Creator creator = Strategy.CREATOR;
        this.e = strategy.j;
    }

    public final void a(int i) {
        boolean z;
        if (i == Integer.MAX_VALUE) {
            z = true;
        } else {
            z = i <= 86400;
        }
        iva.b(z, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", Integer.valueOf(i), 86400);
        this.d = i;
    }
}
