package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;

/* renamed from: rpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rpq implements rpf {
    private static adsa a;
    private final PackageManager b;
    private final ActivityManager c;
    private final anuv d;

    public rpq(Context context, anuv anuv) {
        this.c = (ActivityManager) context.getSystemService("activity");
        this.d = anuv;
        this.b = context.getPackageManager();
    }

    public final adsa a() {
        if (a == null) {
            a = new rpp();
        }
        return a;
    }

    public final boolean b() {
        return true;
    }

    public final String a(audx audx) {
        ansd ansd = (ansd) audx;
        if ((ansd.a & 2048) == 0) {
            return "";
        }
        ansc ansc = ansd.j;
        if (ansc == null) {
            ansc = ansc.d;
        }
        return ansc.b;
    }

    public final rpe a(long j) {
        int a2 = (int) aygi.a.a().a();
        ArrayList arrayList = new ArrayList(a2);
        int i = -1;
        for (ActivityManager.RunningTaskInfo next : this.c.getRunningTasks(a2)) {
            i++;
            aucd o = ansd.m.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ansd ansd = (ansd) o.b;
            int i2 = ansd.a | 4;
            ansd.a = i2;
            ansd.c = j;
            ansd.a = i2 | 32;
            ansd.d = i;
            if (next.baseActivity != null) {
                ansc a3 = rpn.a(next.baseActivity);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ansd ansd2 = (ansd) o.b;
                a3.getClass();
                ansd2.e = a3;
                ansd2.a |= 64;
            }
            if (next.description != null) {
                String charSequence = next.description.toString();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ansd ansd3 = (ansd) o.b;
                charSequence.getClass();
                ansd3.a |= 128;
                ansd3.f = charSequence;
            }
            int i3 = next.id;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ansd ansd4 = (ansd) o.b;
            ansd4.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            ansd4.g = i3;
            int i4 = next.numActivities;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ansd ansd5 = (ansd) o.b;
            ansd5.a |= 512;
            ansd5.h = i4;
            int i5 = next.numRunning;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ansd ansd6 = (ansd) o.b;
            ansd6.a |= 1024;
            ansd6.i = i5;
            if (next.topActivity != null) {
                ansc a4 = rpn.a(next.topActivity);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ansd ansd7 = (ansd) o.b;
                a4.getClass();
                ansd7.j = a4;
                ansd7.a |= 2048;
            }
            ansd ansd8 = (ansd) o.b;
            if ((ansd8.a & 2048) != 0) {
                ansc ansc = ansd8.j;
                if (ansc == null) {
                    ansc = ansc.d;
                }
                if ((ansc.a & 1) != 0) {
                    try {
                        PackageManager packageManager = this.b;
                        ansc ansc2 = ((ansd) o.b).j;
                        if (ansc2 == null) {
                            ansc2 = ansc.d;
                        }
                        PackageInfo packageInfo = packageManager.getPackageInfo(ansc2.b, 0);
                        int i6 = packageInfo.versionCode;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        ansd ansd9 = (ansd) o.b;
                        ansd9.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                        ansd9.k = i6;
                        String a5 = jlh.a(packageInfo.versionName);
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        ansd ansd10 = (ansd) o.b;
                        a5.getClass();
                        ansd10.a |= 16384;
                        ansd10.l = a5;
                    } catch (PackageManager.NameNotFoundException e) {
                    } catch (RuntimeException e2) {
                        if (!e2.getClass().getName().equals("java.lang.RuntimeException")) {
                            throw e2;
                        }
                    }
                }
            }
            ansd ansd11 = (ansd) o.i();
            aucd aucd = (aucd) ansd11.c(5);
            aucd.a((aucj) ansd11);
            anuv anuv = this.d;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ansd ansd12 = (ansd) aucd.b;
            anuv.getClass();
            ansd12.b = anuv;
            ansd12.a |= 1;
            arrayList.add(Pair.create("LB_T", (ansd) aucd.i()));
        }
        return new rpo(arrayList.iterator());
    }
}
