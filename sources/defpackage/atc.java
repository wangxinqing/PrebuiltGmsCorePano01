package defpackage;

/* renamed from: atc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class atc extends atb {
    protected ln[] m = null;
    String n;
    int o = 0;
    int p;

    public boolean a() {
        return false;
    }

    public ln[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public void setPathData(ln[] lnVarArr) {
        if (lo.a(this.m, lnVarArr)) {
            ln[] lnVarArr2 = this.m;
            for (int i = 0; i < lnVarArr.length; i++) {
                lnVarArr2[i].a = lnVarArr[i].a;
                int i2 = 0;
                while (true) {
                    float[] fArr = lnVarArr[i].b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    lnVarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
            return;
        }
        this.m = lo.a(lnVarArr);
    }

    public atc() {
    }

    public atc(atc atc) {
        this.n = atc.n;
        int i = atc.p;
        this.p = 0;
        this.m = lo.a(atc.m);
    }
}
