package defpackage;

import android.util.SparseArray;

/* renamed from: bug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bug {
    public int a;
    public int b;
    public int c;
    public int d;
    public final cld e = new cld();
    public final cld f = new cld();
    public final SparseArray g = new SparseArray();

    public bug() {
        a();
    }

    public final buf a(atjv atjv) {
        buf buf = (buf) this.g.get(atjv.bA);
        if (buf != null) {
            return buf;
        }
        buf buf2 = new buf(atjv);
        this.g.put(atjv.bA, buf2);
        return buf2;
    }

    public final void a() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e.a();
        this.f.a();
        this.g.clear();
    }

    public final boolean a(atjv atjv, int i) {
        boolean z;
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                buf a2 = a(atjv);
                if (atjv == a2.a) {
                    z = true;
                } else {
                    z = false;
                }
                iva.b(z);
                switch (i) {
                    case 5:
                        a2.b++;
                        break;
                    case 6:
                        a2.c++;
                        break;
                    case 7:
                        a2.f++;
                        break;
                    case 8:
                        a2.g++;
                        break;
                    case 9:
                        a2.i++;
                        break;
                    case 10:
                        a2.h++;
                        break;
                    case 11:
                        a2.d++;
                        break;
                    case 12:
                        a2.e++;
                        break;
                    default:
                        ((anih) ((anih) bxk.a.b()).a("buf", "a", 251, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[GcmSyncStatisticsImpl] Context recd stats incorrect mode %d", i);
                        return false;
                }
                return true;
            default:
                ((anih) ((anih) bxk.a.b()).a("bug", "a", 136, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[GcmSyncStatisticsImpl] Context recd stats incorrect mode %d", i);
                return false;
        }
    }
}
