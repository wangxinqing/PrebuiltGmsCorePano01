package defpackage;

import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: ahiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahiw extends ahis {
    private final double A = axwx.a.a().sensorBatchingProbDelayConst();
    public long r = -1;
    public long s = -1;
    public long t = -1;
    public ahyr u;
    public double v = 1.0d;
    public final double w = axwx.a.a().sensorBatchingProbMin();
    public final Random x = new Random();
    public final ahjw y;
    public final ahld z;

    public ahiw(aizl aizl, ajqq ajqq, aizy aizy, aicn aicn, ahli ahli, ahjw ahjw, ahld ahld) {
        super(aizl, ajqq, aicn, ahli);
        this.y = ahjw;
        this.z = ahld;
    }

    /* access modifiers changed from: protected */
    public final ahtp a(Map map, int i, long j, aizx aizx, boolean z2) {
        String str;
        long j2;
        long j3 = j;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        if (j3 != Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder(32);
            double d = (double) j3;
            Double.isNaN(d);
            sb.append(d * 1.0E-9d);
            sb.append(" seconds");
            str = sb.toString();
        } else {
            str = "all buffered";
        }
        objArr[0] = str;
        Set a = ahup.a(ahup.ACCELEROMETER);
        if (this.i) {
            a.add(ahup.BAROMETER);
        }
        if (z2) {
            a.add(ahup.LIGHT);
        }
        aizl aizl = this.o;
        if (j3 != Long.MAX_VALUE) {
            j2 = (-j3) / 1000000;
        } else {
            j2 = -9223372036854775807L;
        }
        return aizl.a(true, a, map, j2, (ahuu) null, new ahiv(this), "BatchingSignalCollector", aizx);
    }

    public final void a(boolean z2) {
        double d = this.v;
        double d2 = this.A;
        double d3 = d * d2;
        this.v = d3;
        if (z2) {
            this.v = d3 + (1.0d - d2);
        }
    }
}
