package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.TimeZone;

/* renamed from: chl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class chl {
    public TimeZone a;
    public chk b;
    public chi c;
    private long[] d;

    public chl(atst atst) {
        a(atst);
    }

    public final long a(long j) {
        int i;
        long b2 = bvl.b(j, this.a);
        int binarySearch = Arrays.binarySearch(this.d, b2);
        if (binarySearch < 0) {
            i = (-binarySearch) - 1;
        } else {
            i = binarySearch + 1;
        }
        Object[] objArr = {Integer.valueOf(i), Long.valueOf(this.d[i]), Long.valueOf(this.d[i] - b2)};
        return this.d[i] - b2;
    }

    public final void a(atst atst) {
        long[] jArr;
        chk chk = this.b;
        if (chk == null) {
            atss atss = atst.c;
            if (atss == null) {
                atss = atss.c;
            }
            this.b = new chk(atss);
        } else {
            atss atss2 = atst.c;
            if (atss2 == null) {
                atss2 = atss.c;
            }
            chk.a(atss2);
        }
        chi chi = this.c;
        if (chi == null) {
            atsn atsn = atst.d;
            if (atsn == null) {
                atsn = atsn.b;
            }
            this.c = new chi(atsn);
        } else {
            atsn atsn2 = atst.d;
            if (atsn2 == null) {
                atsn2 = atsn.b;
            }
            chi.a(atsn2);
        }
        TimeZone timeZone = TimeZone.getTimeZone(atst.a);
        this.a = timeZone;
        if (timeZone == null) {
            ((anih) ((anih) bxk.a.b()).a("chl", "a", 128, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[LocaleBasedTimeModelHolder] Could not interpret TimeZone from id = %s, using user's default TimeZone", (Object) atst.a);
            this.a = TimeZone.getDefault();
        }
        long[] a2 = aook.a((Collection) atst.b);
        int length = a2.length;
        if (length == 0) {
            a2 = new long[]{0, 86400000};
        } else {
            Arrays.sort(a2);
            long j = a2[0];
            long j2 = a2[length - 1];
            if (!(j == 0 && j2 == 86400000)) {
                if (j == 0) {
                    long[] jArr2 = new long[(length + 1)];
                    jArr2[length] = 86400000;
                    System.arraycopy(a2, 0, jArr2, 0, length);
                    a2 = jArr2;
                } else {
                    if (j2 != 86400000) {
                        jArr = new long[(length + 2)];
                        jArr[length + 1] = 86400000;
                    } else {
                        jArr = new long[(length + 1)];
                    }
                    jArr[0] = 0;
                    System.arraycopy(a2, 0, jArr, 1, length);
                    a2 = jArr;
                }
            }
        }
        this.d = a2;
    }
}
