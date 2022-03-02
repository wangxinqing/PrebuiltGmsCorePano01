package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: rpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rpl implements rpe {
    private static boolean h = false;
    private static boolean i = false;
    private final SharedPreferences a;
    private final anuv b;
    private final Iterator c;
    private rpi d;
    private final long e;
    private long f;
    private final PackageManager g;
    private final HashMap j = new HashMap();

    public rpl(SharedPreferences sharedPreferences, rpk rpk, anuv anuv, long j2, PackageManager packageManager) {
        Iterator it;
        this.a = sharedPreferences;
        this.b = anuv;
        this.g = packageManager;
        long j3 = this.a.getLong("lastEventMillis", 0);
        this.e = j3;
        long j4 = j3 + 1;
        if (j4 >= j2) {
            StringBuilder sb = new StringBuilder(62);
            sb.append("wrong time range: [");
            sb.append(j4);
            sb.append(", ");
            sb.append(j2);
            sb.append(")");
            Log.e("AppUsageEventWatcher", sb.toString());
            this.c = Collections.emptyIterator();
        } else {
            try {
                it = new rpj(rpk.a.queryEvents(j4, j2));
            } catch (NullPointerException e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("AppUsageEventWatcher", valueOf.length() == 0 ? new String("Query events in UsageStatsManager caused NPE: ") : "Query events in UsageStatsManager caused NPE: ".concat(valueOf));
                it = Collections.emptyIterator();
            }
            this.c = it;
        }
        h = ayft.a.a().a();
        boolean z = false;
        if (jkr.g() && ayfz.a.a().a()) {
            z = true;
        }
        i = z;
    }

    private static final boolean a(int i2) {
        return i2 == 1 || i2 == 2 || (h && i2 == 8) || (i && i2 == 11);
    }

    public final boolean hasNext() {
        if (this.d == null) {
            while (this.c.hasNext()) {
                rpi rpi = (rpi) this.c.next();
                this.d = rpi;
                int b2 = rpi.b();
                if (a(b2) || b2 == 5) {
                    break;
                }
                this.d = null;
            }
        }
        return this.d != null;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Pair pair;
        iva.a((Object) this.d, (Object) "hasNext() must be called and must return true before calling next()");
        if (this.d.a() > this.f) {
            this.f = this.d.a();
        }
        rpi rpi = this.d;
        aucd o = ansg.l.o();
        int b2 = rpi.b();
        int a2 = ansf.a(b2);
        if (a2 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            ansg ansg = (ansg) o.b;
            ansg.b = a2 - 1;
            ansg.a |= 1;
        }
        long a3 = rpi.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ansg ansg2 = (ansg) o.b;
        int i2 = ansg2.a | 2;
        ansg2.a = i2;
        ansg2.c = a3;
        anuv anuv = this.b;
        anuv.getClass();
        ansg2.g = anuv;
        ansg2.a = i2 | 32;
        if (a(b2)) {
            String a4 = jlh.a(rpi.a.getPackageName());
            if (o.c) {
                o.c();
                o.c = false;
            }
            ansg ansg3 = (ansg) o.b;
            a4.getClass();
            ansg3.a |= 4;
            ansg3.d = a4;
            String a5 = jlh.a(rpi.a.getClassName());
            if (o.c) {
                o.c();
                o.c = false;
            }
            ansg ansg4 = (ansg) o.b;
            a5.getClass();
            ansg4.a |= 8;
            ansg4.e = a5;
            if (ansg4.d.length() > 0) {
                if (this.j.containsKey(((ansg) o.b).d)) {
                    Pair pair2 = (Pair) this.j.get(((ansg) o.b).d);
                    if (pair2 != null) {
                        int intValue = ((Integer) pair2.first).intValue();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        ansg ansg5 = (ansg) o.b;
                        ansg5.a |= 64;
                        ansg5.h = intValue;
                        String str = (String) pair2.second;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        ansg ansg6 = (ansg) o.b;
                        str.getClass();
                        ansg6.a |= 128;
                        ansg6.i = str;
                    }
                } else {
                    try {
                        PackageInfo packageInfo = this.g.getPackageInfo(((ansg) o.b).d, 0);
                        int i3 = packageInfo.versionCode;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        ansg ansg7 = (ansg) o.b;
                        ansg7.a |= 64;
                        ansg7.h = i3;
                        String a6 = jlh.a(packageInfo.versionName);
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        ansg ansg8 = (ansg) o.b;
                        a6.getClass();
                        ansg8.a |= 128;
                        ansg8.i = a6;
                        this.j.put(ansg8.d, Pair.create(Integer.valueOf(ansg8.h), ((ansg) o.b).i));
                    } catch (PackageManager.NameNotFoundException e2) {
                        this.j.put(((ansg) o.b).d, (Object) null);
                    }
                }
            }
            if (h && rpi.b() == 8) {
                String a7 = jlh.a(rpi.a.getShortcutId());
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ansg ansg9 = (ansg) o.b;
                a7.getClass();
                ansg9.a |= 512;
                ansg9.j = a7;
            }
            if (i && rpi.b() == 11) {
                int appStandbyBucket = rpi.a.getAppStandbyBucket();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ansg ansg10 = (ansg) o.b;
                ansg10.a |= 1024;
                ansg10.k = appStandbyBucket;
            }
            pair = Pair.create("LB_AS", (ansg) o.i());
        } else {
            iva.a(b2 == 5);
            Configuration configuration = rpi.a.getConfiguration();
            if (configuration != null) {
                aucd o2 = anqx.k.o();
                float f2 = configuration.fontScale;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anqx anqx = (anqx) o2.b;
                anqx.a = 1 | anqx.a;
                anqx.b = f2;
                if (configuration.locale != null) {
                    String locale = configuration.locale.toString();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anqx anqx2 = (anqx) o2.b;
                    locale.getClass();
                    anqx2.a |= 2;
                    anqx2.c = locale;
                }
                int a8 = anqq.a((configuration.screenLayout & 192) >> 6);
                if (a8 != 0) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anqx anqx3 = (anqx) o2.b;
                    anqx3.d = a8 - 1;
                    anqx3.a |= 4;
                }
                int a9 = anqs.a(configuration.orientation);
                if (a9 != 0) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anqx anqx4 = (anqx) o2.b;
                    anqx4.e = a9 - 1;
                    anqx4.a |= 8;
                }
                int a10 = anqw.a(configuration.uiMode & 15);
                if (a10 != 0) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anqx anqx5 = (anqx) o2.b;
                    anqx5.f = a10 - 1;
                    anqx5.a |= 16;
                }
                int a11 = anqu.a((configuration.uiMode & 48) >> 4);
                if (a11 != 0) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anqx anqx6 = (anqx) o2.b;
                    anqx6.g = a11 - 1;
                    anqx6.a |= 32;
                }
                int a12 = anqm.a(configuration.keyboardHidden);
                if (a12 != 0) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anqx anqx7 = (anqx) o2.b;
                    anqx7.h = a12 - 1;
                    anqx7.a |= 64;
                }
                int a13 = anqk.a(configuration.hardKeyboardHidden);
                if (a13 != 0) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anqx anqx8 = (anqx) o2.b;
                    anqx8.i = a13 - 1;
                    anqx8.a |= 128;
                }
                int a14 = anqo.a(configuration.navigationHidden);
                if (a14 != 0) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anqx anqx9 = (anqx) o2.b;
                    anqx9.j = a14 - 1;
                    anqx9.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                anqx anqx10 = (anqx) o2.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ansg ansg11 = (ansg) o.b;
                anqx10.getClass();
                ansg11.f = anqx10;
                ansg11.a |= 16;
            }
            pair = Pair.create("LB_CFG", (ansg) o.i());
        }
        this.d = null;
        return pair;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final void a() {
        if (this.f > this.e) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putLong("lastEventMillis", this.f);
            edit.apply();
        }
    }
}
