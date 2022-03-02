package defpackage;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: bvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bvl {
    public static final TimeZone a = TimeZone.getTimeZone("GMT");
    public static final TimeZone b = TimeZone.getTimeZone("UTC");

    static {
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    }

    public static long a(long j) {
        return TimeUnit.MICROSECONDS.toMillis(j);
    }

    public static long c(long j, TimeZone timeZone) {
        if (timeZone == null || timeZone.getRawOffset() == 0) {
            return j;
        }
        Calendar a2 = a(j, b);
        Calendar a3 = a(timeZone);
        a3.set(1, a2.get(1));
        a3.set(2, a2.get(2));
        a3.set(5, a2.get(5));
        a3.set(11, a2.get(11));
        a3.set(12, a2.get(12));
        a3.set(13, a2.get(13));
        a3.set(14, a2.get(14));
        return a3.getTimeInMillis();
    }

    public static long a(TimeZone timeZone, TimeZone timeZone2) {
        if (!TextUtils.equals(timeZone.getID(), timeZone2.getID())) {
            return (((long) timeZone.getRawOffset()) - ((long) timeZone2.getRawOffset())) + ((long) (timeZone.getDSTSavings() - timeZone2.getDSTSavings()));
        }
        return 0;
    }

    public static long b(long j, TimeZone timeZone) {
        Calendar a2 = a(j, timeZone);
        a2.set(11, 0);
        a2.set(12, 0);
        a2.set(13, 0);
        a2.set(14, 0);
        return j - a2.getTimeInMillis();
    }

    public static atsd a(Calendar calendar) {
        aucd o = atsd.f.o();
        int i = calendar.get(5);
        if (o.c) {
            o.c();
            o.c = false;
        }
        atsd atsd = (atsd) o.b;
        atsd.a |= 1;
        atsd.b = i;
        int i2 = calendar.get(2) + 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atsd atsd2 = (atsd) o.b;
        atsd2.a |= 2;
        atsd2.c = i2;
        int i3 = calendar.get(1);
        if (o.c) {
            o.c();
            o.c = false;
        }
        atsd atsd3 = (atsd) o.b;
        atsd3.a |= 4;
        atsd3.d = i3;
        switch (calendar.get(7)) {
            case 1:
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atsd atsd4 = (atsd) o.b;
                atsd4.e = 1;
                atsd4.a |= 8;
                break;
            case 2:
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atsd atsd5 = (atsd) o.b;
                atsd5.e = 2;
                atsd5.a |= 8;
                break;
            case 3:
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atsd atsd6 = (atsd) o.b;
                atsd6.e = 3;
                atsd6.a |= 8;
                break;
            case 4:
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atsd atsd7 = (atsd) o.b;
                atsd7.e = 4;
                atsd7.a |= 8;
                break;
            case 5:
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atsd atsd8 = (atsd) o.b;
                atsd8.e = 5;
                atsd8.a |= 8;
                break;
            case 6:
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atsd atsd9 = (atsd) o.b;
                atsd9.e = 6;
                atsd9.a |= 8;
                break;
            case 7:
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atsd atsd10 = (atsd) o.b;
                atsd10.e = 7;
                atsd10.a |= 8;
                break;
            default:
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atsd atsd11 = (atsd) o.b;
                atsd11.e = 0;
                atsd11.a |= 8;
                break;
        }
        return (atsd) o.i();
    }

    private static jut b(jut jut) {
        boolean z;
        long c = jut.c();
        long d = jut.d();
        boolean z2 = true;
        if (!b(jut.c())) {
            ((anih) ((anih) bxk.a.b()).a("bvl", "b", 219, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[TimeUtils] Invalid start time received for the context.");
            c = TimeUnit.MICROSECONDS.toMillis(jut.c());
            z = true;
        } else {
            z = false;
        }
        if (!b(jut.d())) {
            ((anih) ((anih) bxk.a.b()).a("bvl", "b", 224, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[TimeUtils] Invalid end time received for the context.");
            d = TimeUnit.MICROSECONDS.toMillis(jut.d());
        } else {
            z2 = z;
        }
        if (z2) {
            return jut.a(c, d);
        }
        return null;
    }

    private static boolean b(long j) {
        return cbi.i().a() + 3153600000000L > j;
    }

    public static Calendar a(long j, TimeZone timeZone) {
        Calendar a2 = a(timeZone);
        a2.setTimeInMillis(j);
        return a2;
    }

    public static Calendar a(TimeZone timeZone) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(timeZone);
        instance.setLenient(true);
        return instance;
    }

    public static jut a(jut jut) {
        boolean z;
        int a2 = jut.a();
        boolean z2 = true;
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    ((anih) ((anih) bxk.a.b()).a("bvl", "a", 191, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[TimeUtils] Invalid time type %s received. Cannot proceed", jut.a());
                    return null;
                }
                long c = jut.c();
                long d = jut.d();
                if (!b(jut.c())) {
                    ((anih) ((anih) bxk.a.b()).a("bvl", "b", 219, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[TimeUtils] Invalid start time received for the context.");
                    c = TimeUnit.MICROSECONDS.toMillis(jut.c());
                    z = true;
                } else {
                    z = false;
                }
                if (!b(jut.d())) {
                    ((anih) ((anih) bxk.a.b()).a("bvl", "b", 224, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[TimeUtils] Invalid end time received for the context.");
                    d = TimeUnit.MICROSECONDS.toMillis(jut.d());
                } else {
                    z2 = z;
                }
                if (z2) {
                    return jut.a(c, d);
                }
                return null;
            } else if (!b(jut.c())) {
                return jut.b(TimeUnit.MICROSECONDS.toMillis(jut.c()));
            } else {
                return null;
            }
        } else if (!b(jut.c())) {
            return jut.a(TimeUnit.MICROSECONDS.toMillis(jut.c()));
        } else {
            return null;
        }
    }
}
