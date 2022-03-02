package defpackage;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: akmx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akmx implements akmu {
    private final akmq a;

    public akmx(akmq akmq) {
        this.a = akmq;
    }

    private static int a(int i) {
        return (i % 8) * 3;
    }

    private static int b(int i) {
        return (i / 8) + 1;
    }

    private static boolean c(int i) {
        return i == 1 || i == 7;
    }

    public final String a() {
        return "HulkPersona";
    }

    public final akmy a(akln akln, List list) {
        List list2;
        Calendar calendar;
        long j;
        float f;
        int i;
        List list3;
        int i2;
        aucx aucx;
        List list4 = list;
        aklz.a();
        List a2 = akms.a(list.size());
        long currentTimeMillis = System.currentTimeMillis();
        long micros = TimeUnit.MILLISECONDS.toMicros(currentTimeMillis);
        Calendar a3 = this.a.a();
        a3.setTimeInMillis(currentTimeMillis);
        int i3 = 0;
        while (i3 < list.size()) {
            astv astv = ((akkk) list4.get(i3)).b;
            astj astj = null;
            if (!(astv == null || (astv.a & 8) == 0 || (astj = astv.e) != null)) {
                astj = astj.d;
            }
            if (astj != null) {
                aklu aklu = (aklu) a2.get(i3);
                long j2 = astj.a;
                if (j2 != 0 && j2 <= micros) {
                    aklu.a(85, Float.valueOf(akmt.a((float) TimeUnit.MICROSECONDS.toHours(micros - j2), 0.1f, -1.0f)));
                    aklz.a();
                }
                long j3 = astj.c;
                aucx aucx2 = astj.b;
                if (aucx2.isEmpty() || j3 <= 0) {
                    list2 = a2;
                    j = micros;
                    calendar = a3;
                    if (j3 < 0) {
                        akof a4 = aklz.a();
                        StringBuilder sb = new StringBuilder(65);
                        sb.append("number of days in persona has invalid value: ");
                        sb.append(j3);
                        a4.d(sb.toString());
                    }
                } else {
                    int i4 = a3.get(7);
                    int i5 = ((i4 - 1) * 8) + (a3.get(11) / 3);
                    int a5 = a(i5);
                    int b = b(i5);
                    int size = aucx2.size();
                    j = micros;
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    while (i6 < size) {
                        asti asti = (asti) aucx2.get(i6);
                        Calendar calendar2 = a3;
                        int i9 = asti.a;
                        if ((i9 & 1) == 0 || (i9 & 2) == 0) {
                            list3 = a2;
                            aucx = aucx2;
                            i2 = size;
                        } else {
                            int b2 = b(asti.b);
                            aucx = aucx2;
                            int a6 = a(asti.b);
                            i2 = size;
                            int i10 = asti.c;
                            if (i10 < 0) {
                                akof a7 = aklz.a();
                                int i11 = asti.c;
                                list3 = a2;
                                StringBuilder sb2 = new StringBuilder(89);
                                sb2.append("persona bucket has invalid values: weekday ");
                                sb2.append(b2);
                                sb2.append(" hour ");
                                sb2.append(a6);
                                sb2.append(" count ");
                                sb2.append(i11);
                                a7.d(sb2.toString());
                            } else {
                                list3 = a2;
                                if (a6 == a5) {
                                    if (b2 == b) {
                                        i7 += i10;
                                    }
                                    if (c(b2) == c(b)) {
                                        i8 += asti.c;
                                    }
                                }
                            }
                        }
                        i6++;
                        List list5 = list;
                        a3 = calendar2;
                        aucx2 = aucx;
                        size = i2;
                        a2 = list3;
                    }
                    list2 = a2;
                    calendar = a3;
                    if (i7 > 0) {
                        aklu.a(86, Float.valueOf(akmt.a(((float) i7) / (((float) j3) / 7.0f), 0.2f, 0.0f)));
                    }
                    if (i8 > 0) {
                        if (!c(b)) {
                            f = 5.0f;
                        } else {
                            f = 2.0f;
                        }
                        float f2 = ((float) i8) / ((((float) j3) * f) / 7.0f);
                        if (!c(i4)) {
                            i = 87;
                        } else {
                            i = 88;
                        }
                        aklu.a(Integer.valueOf(i), Float.valueOf(akmt.a(f2, 0.2f, 0.0f)));
                    }
                }
            } else {
                list2 = a2;
                j = micros;
                calendar = a3;
            }
            i3++;
            list4 = list;
            micros = j;
            a3 = calendar;
            a2 = list2;
        }
        return new akmy(list, a2);
    }
}
