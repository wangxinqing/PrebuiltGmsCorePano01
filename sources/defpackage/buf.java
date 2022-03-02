package defpackage;

/* renamed from: buf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class buf {
    public final atjv a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public buf(atjv atjv) {
        this.a = atjv;
        a();
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
    }

    public final boolean a(atjv atjv, int i2) {
        boolean z;
        if (atjv == this.a) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        switch (i2) {
            case 5:
                this.b++;
                break;
            case 6:
                this.c++;
                break;
            case 7:
                this.f++;
                break;
            case 8:
                this.g++;
                break;
            case 9:
                this.i++;
                break;
            case 10:
                this.h++;
                break;
            case 11:
                this.d++;
                break;
            case 12:
                this.e++;
                break;
            default:
                ((anih) ((anih) bxk.a.b()).a("buf", "a", 251, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[GcmSyncStatisticsImpl] Context recd stats incorrect mode %d", i2);
                return false;
        }
        return true;
    }

    public final boolean a(atjv atjv, int i2, int i3) {
        boolean z;
        boolean z2;
        if (atjv == this.a) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        if (i3 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2);
        if (i2 == 7) {
            this.k += i3;
        } else if (i2 == 8) {
            this.l += i3;
        } else if (i2 != 13) {
            ((anih) ((anih) bxk.a.b()).a("buf", "a", 274, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[GcmSyncStatisticsImpl] Context recd stats incorrect mode %d", i2);
            return false;
        } else {
            this.j += i3;
        }
        return true;
    }
}
