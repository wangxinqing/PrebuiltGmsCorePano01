package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ahzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahzs {
    public ArrayList a;
    public List b;
    public long c;

    public ahzs() {
    }

    public static ahkv a(ahkw ahkw, long j, ahkw ahkw2, long j2) {
        return new ahkv(ahkw.b - j, j2 + ahkw2.b, ahkw.a);
    }

    public final Boolean b(long j, long j2, long j3) {
        return a(1, j, j2, j3);
    }

    public final Boolean c(long j, long j2, long j3) {
        return a(2, j, j2, j3);
    }

    private final Boolean a(int i, long j, long j2, long j3) {
        long j4;
        ahzs ahzs;
        long j5;
        if (j > j2) {
            j4 = j;
        } else {
            j4 = j2;
        }
        if (j > j2) {
            ahzs = this;
            j5 = j2;
        } else {
            ahzs = this;
            j5 = j;
        }
        List<ahkv> list = ahzs.b;
        if (list == null) {
            return null;
        }
        long j6 = 0;
        long j7 = 0;
        for (ahkv ahkv : list) {
            long max = Math.max(j5, ahkv.a);
            long min = Math.min(j4, ahkv.b);
            if (min > max) {
                long j8 = min - max;
                if (ahkv.c == i) {
                    j7 += j8;
                }
                j6 += j8;
            } else {
                int i2 = i;
            }
        }
        long j9 = j4 - j5;
        long j10 = j9 - j6;
        if (j7 > Math.min(Math.max(j9 - 1, 0), j3)) {
            return Boolean.TRUE;
        }
        if (j10 <= 30000) {
            return Boolean.FALSE;
        }
        return null;
    }

    public ahzs(byte[] bArr) {
        this.a = new ArrayList();
    }

    public final Boolean a(long j, long j2, long j3) {
        return a(0, j, j2, j3);
    }
}
