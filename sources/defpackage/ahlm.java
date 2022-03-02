package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahlm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahlm {
    public static final aibl a = new aibl(3, -1.0d);
    public final ahlk b = new ahlk();
    public final ahjp c = new ahjp();
    public final List d = new ArrayList();
    public final aizy e;
    public aibl f = a;
    public long g = 0;
    public boolean h = false;
    public long i = 0;
    public int j = 0;

    public ahlm(aizy aizy) {
        this.e = aizy;
    }

    public final boolean a() {
        return (this.f == null || SystemClock.elapsedRealtime() - this.g > 360000 || this.f == a) ? false : true;
    }
}
