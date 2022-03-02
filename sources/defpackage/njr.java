package defpackage;

import android.util.SparseArray;

/* renamed from: njr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class njr implements aghu {
    private final float a;
    private final njh b;
    private final float c;

    public njr(float f, njh njh, int i) {
        this.a = f;
        this.b = njh;
        float f2 = 1.0f;
        if (axda.a.a().s() && i > 0) {
            f2 = 1.0f / ((float) i);
        }
        this.c = f2;
    }

    public final amri a(SparseArray sparseArray, amln amln) {
        boolean z;
        aucx aucx = amln.d;
        int size = aucx.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            amkp amkp = (amkp) aucx.get(i);
            amks a2 = amkv.a(ammb.a, (amkv) sparseArray.get(amkp.c, amku.a), amlw.a);
            if (a2.b()) {
                z = ((njx) a2.a()).a;
            } else {
                z = false;
            }
            if (z || amkp.d == -1) {
                str = amkp.b;
                if (z) {
                    break;
                }
            }
        }
        float sqrt = this.a / ((float) Math.sqrt((double) this.b.a(str, amln.e, 1)));
        return amlp.a(amln, sqrt) ? amri.b(Float.valueOf(sqrt * this.c)) : ampu.a;
    }
}
