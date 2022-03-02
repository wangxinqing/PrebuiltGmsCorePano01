package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserHandle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.location.reporting.ReportingState;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class acrk {
    public static final Charset e = Charset.forName("UTF-8");
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public acrk(String str, String str2, boolean z) {
        this(str, str2, z, false);
        avsd avsd = avsd.DEFAULT;
    }

    public int a() {
        return (int) azpm.b();
    }

    /* access modifiers changed from: protected */
    public abstract avwc b(Context context, long j, long j2, hph hph);

    public abstract boolean b();

    public abstract long c();

    public abstract long d();

    public boolean e() {
        return true;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return true;
    }

    public acrk(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        ibq ibq = rmf.a;
    }

    public final avwc a(Context context, long j, long j2, hph hph) {
        int i;
        boolean z;
        avwc b2 = b(context, j, j2, hph);
        List list = null;
        if (b2 == null) {
            return null;
        }
        aucd aucd = (aucd) b2.c(5);
        aucd.a((aucj) b2);
        avvz avvz = (avvz) aucd;
        int i2 = Build.VERSION.SDK_INT;
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager != null) {
            i = userManager.getUserCount();
        } else {
            i = 1;
        }
        if (avvz.c) {
            avvz.c();
            avvz.c = false;
        }
        avwc avwc = (avwc) avvz.b;
        int i3 = avwc.a | 32;
        avwc.a = i3;
        avwc.j = i;
        boolean z2 = this.d;
        avwc.a = i3 | 2097152;
        avwc.p = z2;
        avwc.q = aucj.q();
        ArrayList arrayList = new ArrayList();
        int i4 = Build.VERSION.SDK_INT;
        UserManager userManager2 = (UserManager) context.getSystemService("user");
        if (userManager2 != null) {
            for (UserHandle identifier : userManager2.getUserProfiles()) {
                int identifier2 = identifier.getIdentifier();
                if (identifier2 != 0) {
                    arrayList.add(Integer.valueOf(identifier2));
                }
            }
        }
        List b3 = aoog.b(jhx.a((Collection) arrayList));
        if (avvz.c) {
            avvz.c();
            avvz.c = false;
        }
        avwc avwc2 = (avwc) avvz.b;
        if (!avwc2.q.a()) {
            avwc2.q = aucj.a(avwc2.q);
        }
        auab.a((Iterable) b3, (List) avwc2.q);
        String str = this.a;
        int i5 = Build.VERSION.SDK_INT;
        Collections.emptyList();
        try {
            list = jgu.d(context, context.getPackageName());
        } catch (Exception e2) {
            Log.w(str, "Failed to get google accounts,", e2);
        }
        if (list != null) {
            int size = list.size();
            if (avvz.c) {
                avvz.c();
                avvz.c = false;
            }
            avwc avwc3 = (avwc) avvz.b;
            avwc3.a |= 64;
            avwc3.k = size;
            if (azpm.a.a().b()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    try {
                        ReportingState reportingState = (ReportingState) acws.a(rmf.a(context).a((Account) it.next()), azmm.b(), TimeUnit.SECONDS);
                        if (reportingState != null && reportingState.b) {
                            z = true;
                            break;
                        }
                    } catch (ExecutionException | TimeoutException e3) {
                    } catch (InterruptedException e4) {
                        Thread.currentThread().interrupt();
                    }
                }
                if (avvz.c) {
                    avvz.c();
                    avvz.c = false;
                }
                avwc avwc4 = (avwc) avvz.b;
                avwc4.a |= 4194304;
                avwc4.r = z;
            }
        }
        if (this.c) {
            PackageManager packageManager = context.getPackageManager();
            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(FragmentTransaction.TRANSIT_EXIT_MASK);
            ArrayList arrayList2 = new ArrayList();
            for (PackageInfo next : installedPackages) {
                if (next != null) {
                    aucd o = avwb.i.o();
                    if (next.packageName != null) {
                        String str2 = next.packageName;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        avwb avwb = (avwb) o.b;
                        str2.getClass();
                        avwb.a |= 1;
                        avwb.b = str2;
                        try {
                            String installerPackageName = packageManager.getInstallerPackageName(next.packageName);
                            if (installerPackageName != null) {
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                avwb avwb2 = (avwb) o.b;
                                installerPackageName.getClass();
                                avwb2.a |= 16;
                                avwb2.f = installerPackageName;
                            }
                        } catch (IllegalArgumentException e5) {
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            avwb avwb3 = (avwb) o.b;
                            "<UNKNOWN>".getClass();
                            avwb3.a |= 16;
                            avwb3.f = "<UNKNOWN>";
                        }
                    }
                    int i6 = next.versionCode;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avwb avwb4 = (avwb) o.b;
                    avwb4.a |= 2;
                    avwb4.c = i6;
                    if (next.versionName != null) {
                        String str3 = next.versionName;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        avwb avwb5 = (avwb) o.b;
                        str3.getClass();
                        avwb5.a |= 4;
                        avwb5.d = str3;
                    }
                    if (next.applicationInfo != null) {
                        long j3 = (long) next.applicationInfo.uid;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        avwb avwb6 = (avwb) o.b;
                        avwb6.a |= 8;
                        avwb6.e = j3;
                    }
                    long j4 = next.lastUpdateTime;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avwb avwb7 = (avwb) o.b;
                    avwb7.a |= 32;
                    avwb7.g = j4;
                    long j5 = next.firstInstallTime;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avwb avwb8 = (avwb) o.b;
                    avwb8.a |= 64;
                    avwb8.h = j5;
                    arrayList2.add((avwb) o.i());
                }
            }
            if (avvz.c) {
                avvz.c();
                avvz.c = false;
            }
            ((avwc) avvz.b).h = aucj.s();
            if (avvz.c) {
                avvz.c();
                avvz.c = false;
            }
            avwc avwc5 = (avwc) avvz.b;
            if (!avwc5.h.a()) {
                avwc5.h = aucj.a(avwc5.h);
            }
            auab.a((Iterable) arrayList2, (List) avwc5.h);
        }
        return (avwc) avvz.i();
    }

    public void a(iby iby, hol hol, hph hph, avvz avvz, boolean z, List list, boolean z2, boolean z3, boolean z4) {
        avvz avvz2 = avvz;
        if (jlh.d(((avwc) avvz2.b).g)) {
            avwc avwc = (avwc) avvz2.b;
            if ((avwc.a & 16777216) == 0 || avwc.t.a() == 0) {
                hph.c(String.valueOf(this.a).concat("EmptyDumpsysOutput")).a();
                if (!azpm.a.a().a()) {
                    hph.d();
                    return;
                }
            } else {
                hph hph2 = hph;
            }
        } else {
            hph hph3 = hph;
        }
        acub.a(iby, hol, hph, avvz, z, list, z2, z3, z4, this.a, this.b, a());
    }
}
