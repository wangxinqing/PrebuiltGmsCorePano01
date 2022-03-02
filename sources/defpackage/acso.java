package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acso {
    static final SharedPreferences a = ihs.b().getSharedPreferences("EastworldUtilPrefs", 0);
    public static final /* synthetic */ int b = 0;
    private static adsa c = null;

    public static int a(hph hph) {
        try {
            return ((Integer) acws.a(hob.a(ihs.b()).a(), aznq.a.a().d(), TimeUnit.SECONDS)).intValue();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return -1;
        } catch (ExecutionException | TimeoutException e2) {
            hph.c("EastworldBootApiFailure").a();
            hph.d();
            return -1;
        }
    }

    public static long a(Context context) {
        return jhg.a(context) % TimeUnit.DAYS.toMillis(1);
    }

    static aucd a(boolean z, boolean z2, int i, hph hph) {
        avvf avvf;
        boolean z3;
        int i2;
        Cursor query;
        Throwable th;
        if (!aznq.b()) {
            return avvf.h.o();
        }
        try {
            String str = "";
            if (!azpj.b()) {
                str = a.getString(":eastworldStats", str);
            } else {
                try {
                    query = acsm.a((Context) ihs.b()).getReadableDatabase().query("eastworld_stats", new String[]{"stats_proto"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("stats_proto"));
                        if (query != null) {
                            query.close();
                        }
                        str = string;
                    } else if (query != null) {
                        query.close();
                    }
                } catch (SQLiteException e) {
                } catch (Throwable th2) {
                    apev.a(th, th2);
                }
            }
            avvf = (avvf) aucj.a((aucj) avvf.h, Base64.decode(str, 0));
        } catch (auda e2) {
            hph.c("EastworldStatsParseFailure").a();
            hph.d();
            avvf = avvf.h;
        }
        int i3 = avvf.b;
        int i4 = avvf.c;
        aucd aucd = (aucd) avvf.c(5);
        aucd.a((aucj) avvf);
        if (z) {
            int i5 = i3 + 1;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            avvf avvf2 = (avvf) aucd.b;
            avvf2.a |= 1;
            avvf2.b = i5;
        }
        if (z2) {
            int i6 = i4 + 1;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            avvf avvf3 = (avvf) aucd.b;
            avvf3.a |= 2;
            avvf3.c = i6;
            i2 = 0;
            z3 = true;
        } else {
            i2 = 0;
            z3 = true;
        }
        while (i2 < ((avvf) aucd.b).d.size()) {
            avvb avvb = (avvb) ((avvf) aucd.b).d.get(i2);
            avvh a2 = avvh.a(avvb.b);
            if (a2 == null) {
                a2 = avvh.UNKNOWN;
            }
            if (a2.i == i) {
                int i7 = avvb.c;
                aucd aucd2 = (aucd) avvb.c(5);
                aucd2.a((aucj) avvb);
                int i8 = i7 + 1;
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                avvb avvb2 = (avvb) aucd2.b;
                avvb avvb3 = avvb.d;
                avvb2.a |= 2;
                avvb2.c = i8;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                avvf avvf4 = (avvf) aucd.b;
                avvb avvb4 = (avvb) aucd2.i();
                avvb4.getClass();
                avvf4.c();
                avvf4.d.set(i2, avvb4);
                z3 = false;
            }
            i2++;
        }
        int i9 = i;
        if (z3) {
            avvh a3 = avvh.a(i);
            aucd o = avvb.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avvb avvb5 = (avvb) o.b;
            avvb5.b = a3.i;
            int i10 = avvb5.a | 1;
            avvb5.a = i10;
            avvb5.a = i10 | 2;
            avvb5.c = 1;
            avvb avvb6 = (avvb) o.i();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            avvf avvf5 = (avvf) aucd.b;
            avvb6.getClass();
            avvf5.c();
            avvf5.d.add(avvb6);
        }
        return aucd;
        throw th;
    }

    public static void a(aucd aucd, int i, int i2) {
        if (aznq.b()) {
            aucd o = avvc.f.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avvc avvc = (avvc) o.b;
            avvc.b = i2 - 1;
            avvc.a |= 1;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avvc avvc2 = (avvc) o.b;
            avvc2.a |= 2;
            avvc2.c = elapsedRealtime;
            long currentTimeMillis = System.currentTimeMillis();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avvc avvc3 = (avvc) o.b;
            int i3 = avvc3.a | 4;
            avvc3.a = i3;
            avvc3.d = currentTimeMillis;
            avvc3.a = i3 | 8;
            avvc3.e = i;
            ArrayDeque arrayDeque = new ArrayDeque(Collections.unmodifiableList(((avvf) aucd.b).f));
            arrayDeque.addFirst((avvc) o.i());
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            avvf avvf = avvf.h;
            ((avvf) aucd.b).f = aucj.s();
            Iterator it = arrayDeque.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                avvc avvc4 = (avvc) it.next();
                if (i4 < 10) {
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    avvf avvf2 = (avvf) aucd.b;
                    avvc4.getClass();
                    if (!avvf2.f.a()) {
                        avvf2.f = aucj.a(avvf2.f);
                    }
                    avvf2.f.add(avvc4);
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public static void a(aucd aucd, int i, int i2, long j, long j2) {
        if (aznq.b()) {
            avvd avvd = (avvd) Collections.unmodifiableMap(Collections.unmodifiableMap(((avvf) aucd.b).e)).get(3);
            aucd o = avvd.f.o();
            if (avvd != null) {
                o = (aucd) avvd.c(5);
                o.a((aucj) avvd);
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            avvd avvd2 = (avvd) o.b;
            int i3 = avvd2.a | 1;
            avvd2.a = i3;
            avvd2.b = i;
            int i4 = i3 | 8;
            avvd2.a = i4;
            avvd2.e = i2;
            int i5 = i4 | 2;
            avvd2.a = i5;
            avvd2.c = j;
            avvd2.a = i5 | 4;
            avvd2.d = j2;
            avvd avvd3 = (avvd) o.i();
            avvd3.getClass();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            avvf avvf = (avvf) aucd.b;
            avvf avvf2 = avvf.h;
            audr audr = avvf.e;
            if (!audr.a) {
                avvf.e = audr.a();
            }
            avvf.e.put(3, avvd3);
        }
    }

    static void a(avvf avvf) {
        if (!aznq.b()) {
            return;
        }
        if (azpj.b()) {
            acsm a2 = acsm.a((Context) ihs.b());
            String encodeToString = Base64.encodeToString(avvf.k(), 0);
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("stats_proto", encodeToString);
                a2.getWritableDatabase().update("eastworld_stats", contentValues, (String) null, (String[]) null);
            } catch (SQLiteException e) {
            }
        } else {
            SharedPreferences.Editor edit = a.edit();
            edit.putString(":eastworldStats", Base64.encodeToString(avvf.k(), 0));
            edit.apply();
        }
    }

    public static void a(iby iby, hol hol, hph hph, aucd aucd, boolean z, List list, boolean z2, boolean z3, String str, String str2, int i, aucd aucd2) {
        hol hol2 = hol;
        hph hph2 = hph;
        aucd aucd3 = aucd;
        List list2 = list;
        boolean z4 = z2;
        boolean z5 = z3;
        String str3 = str2;
        aucd aucd4 = aucd2;
        if (iby != null) {
            a(iby, hph, aucd, str2, i, aucd2);
            hph.d();
        } else if (!z && !z4 && !z5) {
            hph2.c("REQUEST_UPLOAD_WITHOUT_CONSENT").a();
            hph.d();
        } else if (z && (list2 == null || list.isEmpty())) {
            hph2.c(str.concat("_LOCKBOX_OPTED_IN_WITH_EMPTY_ACCOUNTS")).a();
            hph.d();
        } else {
            aucd o = avvi.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avvi avvi = (avvi) o.b;
            avvi.a |= 4;
            avvi.c = z5;
            aucd o2 = anuv.g.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anuv anuv = (anuv) o2.b;
            anuv.a |= 2;
            anuv.c = z4;
            int i2 = 1;
            if (!z) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avvi avvi2 = (avvi) o.b;
                anuv anuv2 = (anuv) o2.i();
                anuv2.getClass();
                avvi2.b = anuv2;
                avvi2.a |= 2;
                if (aucd3.c) {
                    aucd.c();
                    aucd3.c = false;
                }
                avvl avvl = (avvl) aucd3.b;
                avvi avvi3 = (avvi) o.i();
                avvl avvl2 = avvl.j;
                avvi3.getClass();
                avvl.c = avvi3;
                avvl.a |= 2;
                hoi a2 = hol2.a(((avvl) aucd.i()).k());
                a2.f = avsd.a(i);
                a2.d = str3;
                a2.b();
                if (aznq.e()) {
                    avvl avvl3 = (avvl) aucd.i();
                    int i3 = avvl3.U;
                    if (i3 == -1) {
                        i3 = aueh.a.a((Object) avvl3).b(avvl3);
                        avvl3.U = i3;
                    }
                    int a3 = avvk.a(((avvl) aucd3.b).b);
                    if (a3 != 0) {
                        i2 = a3;
                    }
                    a(aucd4, i3, i2);
                    return;
                }
                return;
            }
            int size = list.size();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anuv anuv3 = (anuv) o2.b;
            anuv3.a |= 1;
            anuv3.b = size;
            for (int i4 = 0; i4 < list.size(); i4++) {
                rox rox = (rox) list2.get(i4);
                if (azmy.b()) {
                    boolean c2 = rox.c();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anuv anuv4 = (anuv) o2.b;
                    anuv4.a |= 32;
                    anuv4.f = c2;
                } else {
                    boolean d = rox.d();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anuv anuv5 = (anuv) o2.b;
                    anuv5.a |= 8;
                    anuv5.e = d;
                }
                anuv anuv6 = (anuv) o2.b;
                anuv6.a |= 4;
                anuv6.d = i4;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avvi avvi4 = (avvi) o.b;
                anuv anuv7 = (anuv) o2.i();
                anuv7.getClass();
                avvi4.b = anuv7;
                avvi4.a |= 2;
                if (aucd3.c) {
                    aucd.c();
                    aucd3.c = false;
                }
                avvl avvl4 = (avvl) aucd3.b;
                avvi avvi5 = (avvi) o.i();
                avvl avvl5 = avvl.j;
                avvi5.getClass();
                avvl4.c = avvi5;
                avvl4.a |= 2;
                hoi a4 = hol2.a(((avvl) aucd.i()).k());
                a4.c(rox.b());
                a4.f = avsd.a(i);
                a4.d = str3;
                a4.b();
            }
            if (aznq.e()) {
                avvl avvl6 = (avvl) aucd.i();
                int i5 = avvl6.U;
                if (i5 == -1) {
                    i5 = aueh.a.a((Object) avvl6).b(avvl6);
                    avvl6.U = i5;
                }
                int a5 = avvk.a(((avvl) aucd3.b).b);
                if (a5 != 0) {
                    i2 = a5;
                }
                a(aucd4, i5, i2);
            }
        }
    }

    private static void a(iby iby, hph hph, aucd aucd, String str, int i, aucd aucd2) {
        avvl avvl = (avvl) aucd.i();
        try {
            byte[] k = avvl.k();
            if (c == null) {
                c = new acsn();
            }
            acwa a2 = iby.a(str, k, c, i);
            if (aznq.e()) {
                acws.a(a2, 10000, TimeUnit.MILLISECONDS);
                if (a2.b()) {
                    int i2 = avvl.U;
                    if (i2 == -1) {
                        i2 = aueh.a.a((Object) avvl).b(avvl);
                        avvl.U = i2;
                    }
                    int a3 = avvk.a(avvl.b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    a(aucd2, i2, a3);
                }
            }
        } catch (ExecutionException | TimeoutException e) {
            if (aznq.d()) {
                hph.c("ConsentApiUploadException").a();
            }
        } catch (InterruptedException e2) {
            if (aznq.d()) {
                hph.c("ConsentApiUploadException").a();
            }
            Thread.currentThread().interrupt();
        }
    }

    static boolean a() {
        long j;
        ihs b2 = ihs.b();
        long currentTimeMillis = System.currentTimeMillis();
        if (azpj.b()) {
            j = acsm.a((Context) ihs.b()).a();
        } else {
            j = a.getLong(":lastRandomSplitMillis", -1);
        }
        if (currentTimeMillis - j < TimeUnit.DAYS.toMillis(1)) {
            return false;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long timeInMillis = instance.getTimeInMillis() + a((Context) b2);
        if (azpj.b()) {
            acsm a2 = acsm.a((Context) ihs.b());
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_split_millis", Long.valueOf(timeInMillis));
                a2.getWritableDatabase().update("eastworld_stats", contentValues, (String) null, (String[]) null);
                return true;
            } catch (SQLiteException e) {
                return true;
            }
        } else {
            SharedPreferences.Editor edit = a.edit();
            edit.putLong(":lastRandomSplitMillis", timeInMillis);
            edit.apply();
            return true;
        }
    }
}
