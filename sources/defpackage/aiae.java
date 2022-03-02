package defpackage;

import java.util.ArrayList;

/* renamed from: aiae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiae {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public aibe c;
    public boolean d;

    public final void a(aiad aiad) {
        boolean z;
        aibw aibw;
        aiam aiam;
        long j;
        boolean z2;
        aiad aiad2 = aiad;
        if (this.a.size() == 0 && this.b.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i = 0;
        int i2 = 0;
        while (!z) {
            if (i < this.a.size()) {
                aibw = (aibw) this.a.get(i);
            } else {
                aibw = null;
            }
            if (i2 < this.b.size()) {
                aiam = (aiam) this.b.get(i2);
            } else {
                aiam = null;
            }
            long j2 = Long.MAX_VALUE;
            if (aibw != null) {
                j = aibw.d();
            } else {
                j = Long.MAX_VALUE;
            }
            if (aiam != null) {
                j2 = aiam.a();
            }
            if (Math.abs(j - j2) < 20000) {
                i++;
                i2++;
            } else if (j >= j2) {
                i2++;
                aibw = null;
            } else {
                i++;
                aiam = null;
            }
            if (i2 == this.b.size() && i == this.a.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                aiad2.a(aibw, aiam, this.c, this.d);
            } else {
                aiad2.a(aibw, aiam, (aibe) null, false);
            }
            z = z2;
        }
    }
}
