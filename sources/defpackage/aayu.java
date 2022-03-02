package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Log;
import android.util.SparseIntArray;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: aayu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aayu {
    static final anax a = anax.a("done", "default_packages", "su_files", "settings", "locale", "connection_info", "proxy", "setuid_files", "selinux_status", "sd_card_test", "apps", "logcat", "system_ca_cert_store", "attest", "gmscore", "event_log", "device_state", "carrier_info", "mount_options", "app_dir_wr", "phonesky", "internal_logs", "app_ops", "snet_network_watchlist", "snet_verify_apps_api_usage");
    private static final String b = aayu.class.getSimpleName();
    private final Context c;
    private final aayc d;
    private final aayx e;

    private aayu(Context context, aayc aayc) {
        aayx aayx = new aayx(context, aayc, new aaxh(context, aayc));
        this.c = context;
        this.d = aayc;
        this.e = aayx;
    }

    public static void b(Context context, Bundle bundle) {
        acrz acrz = new acrz(context, String.valueOf(aayu.class.getCanonicalName()).concat(":SnetNormal"));
        aayc aayc = new aayc(bundle);
        aayu aayu = new aayu(context, aayc);
        try {
            acrz.a(aayc.b.a("watchdog_timeout_ms", 120000));
            aayu.d();
            if (acrz.e()) {
                acrz.c();
            }
        } catch (Throwable th) {
            if (acrz.e()) {
                acrz.c();
            }
            throw th;
        }
    }

    private final void d() {
        if (!azfv.p()) {
            aayy aayy = new aayy(this.c);
            aaxt a2 = new aaxx(this.c, this.d, this.e).a(aayy.a());
            aaxq.a(this.c).a(a2.b);
            aayy.a(a2.a);
            if (azfv.c() && aayy.c()) {
                new aaxx(this.c, this.d, this.e);
                aaxs b2 = aaxx.b(aayy.a.getLong("snet_event_log_bal_last_timestamp", -1));
                aaxk.a(this.c).a(b2.b);
                aayy.a("snet_event_log_bal_last_timestamp", b2.a);
                return;
            }
            return;
        }
        aaxq a3 = aaxq.a(this.c);
        if (a3.c()) {
            aaxt a4 = new aaxx(this.c, this.d, this.e).a(a3.a());
            a3.a(a4.b);
            a3.a(a4.a);
            a3.d();
        }
        if (azfv.c()) {
            aaxk a5 = aaxk.a(this.c);
            if (!a5.d()) {
                return;
            }
            if (!a5.a()) {
                a5.e();
                return;
            }
            long c2 = a5.c();
            new aaxx(this.c, this.d, this.e);
            aaxs b3 = aaxx.b(c2);
            a5.a(b3.b);
            a5.a(b3.a);
            a5.e();
        }
    }

    private final void e() {
        if (aaza.a() || m()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(aayl.a());
            if (aaza.a()) {
                aayc aayc = this.d;
                ArrayList arrayList2 = new ArrayList();
                String a2 = aayc.b.a("selected_files");
                if (!TextUtils.isEmpty(a2)) {
                    arrayList2.addAll(Arrays.asList(a2.split(",")));
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    aayh aayh = new aayh();
                    ArrayDeque arrayDeque = new ArrayDeque(arrayList2);
                    while (!arrayDeque.isEmpty()) {
                        String str = (String) arrayDeque.poll();
                        File file = new File(str);
                        if (file.exists()) {
                            aaxz aaxz = new aaxz();
                            aaxz.a = str;
                            aaxz.c = file.exists();
                            if (file.isFile()) {
                                aaxz.g = aaza.a(file);
                                try {
                                    aaxz.h = aayh.a(str);
                                } catch (aayg e2) {
                                }
                            }
                            try {
                                aaxz.i = aayh.a(file);
                                if (file.isFile()) {
                                    boolean b2 = aayh.b(file);
                                    aaxz.e = b2;
                                    if (b2) {
                                        aaxz.f = aayh.c(file);
                                        if (!TextUtils.isEmpty(aaxz.f) && !arrayList2.contains(aaxz.f)) {
                                            arrayList2.add(aaxz.f);
                                            arrayDeque.offer(aaxz.f);
                                        }
                                    }
                                }
                            } catch (aayg e3) {
                            }
                            arrayList3.add(aaxz);
                        }
                    }
                    arrayList.addAll(arrayList3);
                }
            }
            aayx aayx = this.e;
            aayx.a();
            if (arrayList.size() != 0) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    aaxz aaxz2 = (aaxz) arrayList.get(i);
                    aucd o = aatd.m.o();
                    String str2 = aaxz2.a;
                    if (str2 != null) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aatd aatd = (aatd) o.b;
                        str2.getClass();
                        aatd.a |= 1;
                        aatd.b = str2;
                    }
                    boolean z = aaxz2.c;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aatd aatd2 = (aatd) o.b;
                    aatd2.a |= 2;
                    aatd2.c = z;
                    byte[] bArr = aaxz2.g;
                    if (bArr != null) {
                        auay a3 = auay.a(bArr);
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aatd aatd3 = (aatd) o.b;
                        a3.getClass();
                        aatd3.a |= 4;
                        aatd3.d = a3;
                    }
                    boolean z2 = aaxz2.h;
                    aatd aatd4 = (aatd) o.b;
                    int i2 = aatd4.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    aatd4.a = i2;
                    aatd4.j = z2;
                    aayf aayf = aaxz2.i;
                    if (aayf != null) {
                        long j = aayf.d;
                        int i3 = i2 | 8;
                        aatd4.a = i3;
                        aatd4.e = j;
                        int i4 = aayf.c;
                        int i5 = i3 | 16;
                        aatd4.a = i5;
                        aatd4.f = i4;
                        int i6 = aayf.b;
                        int i7 = i5 | 32;
                        aatd4.a = i7;
                        aatd4.g = i6;
                        int i8 = aayf.a;
                        i2 = i7 | 64;
                        aatd4.a = i2;
                        aatd4.h = i8;
                        String str3 = aayf.e;
                        if (str3 != null) {
                            str3.getClass();
                            i2 |= 128;
                            aatd4.a = i2;
                            aatd4.i = str3;
                        }
                    }
                    boolean z3 = aaxz2.e;
                    int i9 = i2 | 512;
                    aatd4.a = i9;
                    aatd4.k = z3;
                    String str4 = aaxz2.f;
                    if (str4 != null) {
                        str4.getClass();
                        aatd4.a = i9 | 1024;
                        aatd4.l = str4;
                    }
                    aucd aucd = aayx.e;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    aatt aatt = (aatt) aucd.b;
                    aatd aatd5 = (aatd) o.i();
                    aatt aatt2 = aatt.P;
                    aatd5.getClass();
                    if (!aatt.x.a()) {
                        aatt.x = aucj.a(aatt.x);
                    }
                    aatt.x.add(aatd5);
                }
            }
        }
    }

    private final void f() {
        aaye aaye = new aaye(this.c);
        aayx aayx = this.e;
        ConnectivityManager connectivityManager = (ConnectivityManager) aaye.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        aayd aayd = new aayd();
        if (activeNetworkInfo != null) {
            aayd.a = activeNetworkInfo.getType();
        }
        if (aayd.a == 0) {
            aayd.c = ((TelephonyManager) aaye.a.getSystemService("phone")).getNetworkOperatorName();
        }
        int i = 0;
        for (NetworkInfo type : connectivityManager.getAllNetworkInfo()) {
            int type2 = type.getType();
            if (type2 <= 30) {
                i |= 1 << type2;
            }
        }
        aayd.b = i;
        aayx.a();
        aucd o = aasv.e.o();
        int a2 = aasu.a(aayd.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aasv aasv = (aasv) o.b;
        int i2 = a2 - 1;
        if (a2 != 0) {
            aasv.b = i2;
            int i3 = aasv.a | 1;
            aasv.a = i3;
            int i4 = aayd.b;
            int i5 = i3 | 2;
            aasv.a = i5;
            aasv.c = i4;
            String str = aayd.c;
            if (str != null) {
                str.getClass();
                aasv.a = i5 | 4;
                aasv.d = str;
            }
            aucd aucd = aayx.e;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aatt aatt = (aatt) aucd.b;
            aasv aasv2 = (aasv) o.i();
            aatt aatt2 = aatt.P;
            aasv2.getClass();
            aatt.D = aasv2;
            aatt.a |= 134217728;
            return;
        }
        throw null;
    }

    private final void g() {
        int i;
        aaxf a2;
        boolean z;
        aaxh aaxh = new aaxh(this.c, this.d);
        ArrayList arrayList = new ArrayList();
        boolean b2 = aaxh.a.b();
        boolean c2 = aaxh.a.c();
        if (b2 || c2) {
            for (ApplicationInfo next : aaxh.b.getInstalledApplications(128)) {
                int i2 = next.flags & 1;
                if (((i2 != 0 && c2) || (i2 == 0 && b2)) && (a2 = aaxh.a(next.packageName)) != null) {
                    if (i2 == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    a2.d = z;
                    arrayList.add(a2);
                }
            }
        }
        aayx aayx = this.e;
        aayx.a();
        if (!arrayList.isEmpty()) {
            aucd o = aasp.f.o();
            boolean b3 = aayx.a.b.b("report_more_app_info");
            if (!b3) {
                i = aayx.c;
            } else {
                i = aayx.d;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aasp aasp = (aasp) o.b;
            int i3 = i - 1;
            if (i != 0) {
                aasp.d = i3;
                aasp.a |= 4;
                boolean c3 = aayx.a.c();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aasp aasp2 = (aasp) o.b;
                aasp2.a = 1 | aasp2.a;
                aasp2.b = c3;
                boolean b4 = aayx.a.b();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aasp aasp3 = (aasp) o.b;
                aasp3.a |= 2;
                aasp3.c = b4;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    aaxf aaxf = (aaxf) arrayList.get(i4);
                    if (aaxf != null) {
                        aasm a3 = aayx.a(aaxf, b3);
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aasp aasp4 = (aasp) o.b;
                        a3.getClass();
                        if (!aasp4.e.a()) {
                            aasp4.e = aucj.a(aasp4.e);
                        }
                        aasp4.e.add(a3);
                    }
                }
                aucd aucd = aayx.e;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aatt aatt = (aatt) aucd.b;
                aasp aasp5 = (aasp) o.i();
                aatt aatt2 = aatt.P;
                aasp5.getClass();
                aatt.B = aasp5;
                aatt.a |= 67108864;
                return;
            }
            throw null;
        }
    }

    private final boolean h() {
        for (Account account : qub.a(this.c).a("com.google")) {
            if (account.name.endsWith("@google.com")) {
                return true;
            }
        }
        return false;
    }

    private static boolean i() {
        if (((long) new SecureRandom().nextInt(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS)) < azfv.a.a().b()) {
            return true;
        }
        azft.c();
        return false;
    }

    private final void j() {
        aaxm a2 = aaxp.a(this.c, this.d);
        aayx aayx = this.e;
        aayx.a();
        aucd o = aatb.n.o();
        String str = a2.a;
        if (str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aatb aatb = (aatb) o.b;
            str.getClass();
            aatb.a |= 1;
            aatb.b = str;
        }
        String str2 = a2.b;
        if (str2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aatb aatb2 = (aatb) o.b;
            str2.getClass();
            aatb2.a |= 2;
            aatb2.c = str2;
        }
        int i = a2.d;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aatb aatb3 = (aatb) o.b;
        int i2 = aatb3.a | 4;
        aatb3.a = i2;
        aatb3.d = i;
        int i3 = a2.e;
        int i4 = i2 | 8;
        aatb3.a = i4;
        aatb3.e = i3;
        String str3 = a2.c;
        if (str3 != null) {
            str3.getClass();
            i4 |= 16;
            aatb3.a = i4;
            aatb3.f = str3;
        }
        String str4 = a2.f;
        if (str4 != null) {
            str4.getClass();
            i4 |= 32;
            aatb3.a = i4;
            aatb3.h = str4;
        }
        String str5 = a2.g;
        if (str5 != null) {
            str5.getClass();
            i4 |= 64;
            aatb3.a = i4;
            aatb3.i = str5;
        }
        String str6 = a2.h;
        if (str6 != null) {
            str6.getClass();
            aatb3.a = i4 | 128;
            aatb3.j = str6;
        }
        List list = a2.i;
        if (list != null && !list.isEmpty()) {
            List list2 = a2.i;
            int size = list2.size();
            for (int i5 = 0; i5 < size; i5++) {
                aaxo aaxo = (aaxo) list2.get(i5);
                aucd o2 = aatu.d.o();
                String str7 = aaxo.a;
                if (str7 != null) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aatu aatu = (aatu) o2.b;
                    str7.getClass();
                    aatu.a |= 1;
                    aatu.b = str7;
                }
                String str8 = aaxo.b;
                if (str8 != null) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aatu aatu2 = (aatu) o2.b;
                    str8.getClass();
                    aatu2.a |= 2;
                    aatu2.c = str8;
                }
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aatb aatb4 = (aatb) o.b;
                aatu aatu3 = (aatu) o2.i();
                aatu3.getClass();
                if (!aatb4.k.a()) {
                    aatb4.k = aucj.a(aatb4.k);
                }
                aatb4.k.add(aatu3);
            }
        }
        if (a2.j != null) {
            aucd o3 = aatg.d.o();
            int i6 = a2.j.b;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aatg aatg = (aatg) o3.b;
            int i7 = i6 - 1;
            if (i6 != 0) {
                aatg.b = i7;
                int i8 = aatg.a | 1;
                aatg.a = i8;
                int i9 = a2.j.a;
                aatg.a = i8 | 2;
                aatg.c = i9;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aatb aatb5 = (aatb) o.b;
                aatg aatg2 = (aatg) o3.i();
                aatg2.getClass();
                aatb5.l = aatg2;
                aatb5.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else {
                throw null;
            }
        }
        aatq[] aatqArr = a2.k;
        if (aatqArr != null) {
            List asList = Arrays.asList(aatqArr);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aatb aatb6 = (aatb) o.b;
            if (!aatb6.m.a()) {
                aatb6.m = aucj.a(aatb6.m);
            }
            auab.a((Iterable) asList, (List) aatb6.m);
        }
        aucd aucd = aayx.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aatt aatt = (aatt) aucd.b;
        aatb aatb7 = (aatb) o.i();
        aatt aatt2 = aatt.P;
        aatb7.getClass();
        aatt.o = aatb7;
        aatt.a |= 32768;
        if (!azfv.a.a().J() && Build.VERSION.SDK_INT > 23) {
            aayx aayx2 = this.e;
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder(25);
                sb.append("/sys/block/dm-");
                sb.append(i10);
                File file = new File(sb.toString());
                if (!file.exists()) {
                    break;
                }
                if (new File(file, "fec").exists()) {
                    File file2 = new File(file, "dm/name");
                    File file3 = new File(file, "fec/corrected");
                    if (file2.exists() && file3.exists()) {
                        aaxy aaxy = new aaxy();
                        try {
                            aaxy.a = aaza.c(file2);
                            String c2 = aaza.c(file3);
                            if (!TextUtils.isEmpty(c2)) {
                                aaxy.b = Integer.parseInt(c2, 10);
                            }
                            arrayList.add(aaxy);
                        } catch (NumberFormatException e2) {
                        }
                    }
                }
                i10++;
            }
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    aaxy aaxy2 = (aaxy) arrayList.get(i11);
                    aucd o4 = aasw.d.o();
                    String str9 = aaxy2.a;
                    if (str9 != null) {
                        if (o4.c) {
                            o4.c();
                            o4.c = false;
                        }
                        aasw aasw = (aasw) o4.b;
                        str9.getClass();
                        aasw.a |= 1;
                        aasw.b = str9;
                    }
                    int i12 = aaxy2.b;
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    aasw aasw2 = (aasw) o4.b;
                    aasw2.a |= 2;
                    aasw2.c = i12;
                    arrayList2.add((aasw) o4.i());
                }
                if (!arrayList2.isEmpty()) {
                    aatb aatb8 = ((aatt) aayx2.e.b).o;
                    if (aatb8 == null) {
                        aatb8 = aatb.n;
                    }
                    aucd aucd2 = (aucd) aatb8.c(5);
                    aucd2.a((aucj) aatb8);
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    aatb aatb9 = (aatb) aucd2.b;
                    if (!aatb9.g.a()) {
                        aatb9.g = aucj.a(aatb9.g);
                    }
                    auab.a((Iterable) arrayList2, (List) aatb9.g);
                    aucd aucd3 = aayx2.e;
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    aatt aatt3 = (aatt) aucd3.b;
                    aatb aatb10 = (aatb) aucd2.i();
                    aatb10.getClass();
                    aatt3.o = aatb10;
                    aatt3.a |= 32768;
                }
            }
        }
    }

    private final void k() {
        String networkOperatorName = ((TelephonyManager) this.c.getSystemService("phone")).getNetworkOperatorName();
        aayx aayx = this.e;
        aayx.a();
        aucd o = aass.c.o();
        if (networkOperatorName != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aass aass = (aass) o.b;
            networkOperatorName.getClass();
            aass.a |= 1;
            aass.b = networkOperatorName;
        }
        aucd aucd = aayx.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aatt aatt = (aatt) aucd.b;
        aass aass2 = (aass) o.i();
        aatt aatt2 = aatt.P;
        aass2.getClass();
        aatt.I = aass2;
        aatt.b |= 16;
    }

    private final void l() {
        if (aaza.a()) {
            aayx aayx = this.e;
            Context context = this.c;
            HashMap hashMap = new HashMap();
            List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(128);
            aayh aayh = new aayh();
            for (ApplicationInfo applicationInfo : installedApplications) {
                String str = applicationInfo.packageName;
                File file = new File(String.format("/data/data/%s", new Object[]{str}));
                if (file.exists() && file.isDirectory()) {
                    try {
                        aayf a2 = aayh.a(file);
                        if ((a2.c & 4) != 0) {
                            hashMap.put(str, a2);
                        }
                    } catch (aayg e2) {
                    }
                }
            }
            aayx.a();
            if (!hashMap.isEmpty()) {
                aate aate = ((aatt) aayx.e.b).K;
                if (aate == null) {
                    aate = aate.c;
                }
                aucd aucd = (aucd) aate.c(5);
                aucd.a((aucj) aate);
                for (String str2 : hashMap.keySet()) {
                    aucd o = aasl.e.o();
                    if (str2 != null) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aasl aasl = (aasl) o.b;
                        str2.getClass();
                        aasl.a |= 1;
                        aasl.b = str2;
                    }
                    aayf aayf = (aayf) hashMap.get(str2);
                    int i = aayf.c;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aasl aasl2 = (aasl) o.b;
                    int i2 = aasl2.a | 2;
                    aasl2.a = i2;
                    aasl2.c = i;
                    long j = aayf.d;
                    aasl2.a = i2 | 4;
                    aasl2.d = j;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    aate aate2 = (aate) aucd.b;
                    aasl aasl3 = (aasl) o.i();
                    aasl3.getClass();
                    if (!aate2.b.a()) {
                        aate2.b = aucj.a(aate2.b);
                    }
                    aate2.b.add(aasl3);
                }
                aucd aucd2 = aayx.e;
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                aatt aatt = (aatt) aucd2.b;
                aate aate3 = (aate) aucd.i();
                aatt aatt2 = aatt.P;
                aate3.getClass();
                aatt.K = aate3;
                aatt.b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }
    }

    private final boolean m() {
        return a(this.d);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        SparseIntArray sparseIntArray;
        ArrayList arrayList;
        int i;
        SparseIntArray sparseIntArray2;
        aaxf aaxf;
        aaxx aaxx = new aaxx(this.c, this.d, this.e);
        aaxv aaxv = null;
        if (azfv.m()) {
            d();
            aaxq a2 = aaxq.a(this.c);
            if (azfv.p()) {
                a2.c();
            }
            List e2 = a2.e();
            a2.f();
            if (azfv.p()) {
                a2.d();
            }
            aaxh aaxh = new aaxh(aaxx.a, aaxx.b);
            PackageManager packageManager = aaxx.a.getPackageManager();
            ArrayList arrayList2 = new ArrayList();
            int size = e2.size();
            for (int i2 = 0; i2 < size; i2++) {
                aart aart = (aart) e2.get(i2);
                int i3 = aart.e;
                if (!(i3 == -1 || !aaza.a(Process.myUid(), i3) || Process.myUid() == i3)) {
                    aaxu aaxu = new aaxu();
                    aaxu.e = aart.d;
                    aaxu.a = aart.b;
                    aaxu.b = aart.c;
                    aaxu.c = aart.f;
                    String[] packagesForUid = packageManager.getPackagesForUid(i3);
                    if (packagesForUid != null) {
                        List a3 = aaxx.a(packagesForUid, aaxh);
                        if (!aaxx.b(a3)) {
                            if (!a3.isEmpty()) {
                                aaxu.d = a3;
                            }
                        }
                    }
                    arrayList2.add(aaxu);
                }
            }
            aaxv = new aaxv();
            aaxv.a = arrayList2;
            aayy aayy = new aayy(this.c);
            if (azfv.c()) {
                if (azfv.p()) {
                    aaxk a4 = aaxk.a(this.c);
                    if (a4.d()) {
                        if (a4.a()) {
                            this.e.a(aaxx.a(a4.f()));
                        }
                        a4.g();
                        a4.a(i());
                        a4.e();
                    }
                } else {
                    if (aayy.c()) {
                        aaxk a5 = aaxk.a(this.c);
                        List f = a5.f();
                        a5.g();
                        this.e.a(aaxx.a(f));
                    }
                    aayy.a("is_blocked_bal_collection_enabled_for_device", i());
                }
            }
        } else {
            int[] iArr = aaxx.f;
            if (!(iArr == null || iArr.length == 0)) {
                ArrayList arrayList3 = new ArrayList();
                try {
                    EventLog.readEvents(aaxx.f, arrayList3);
                    aaxh aaxh2 = new aaxh(aaxx.a, aaxx.b);
                    SparseIntArray a6 = aaxh2.a();
                    ArrayList arrayList4 = new ArrayList();
                    aayy aayy2 = new aayy(aaxx.a);
                    long a7 = aayy2.a();
                    PackageManager packageManager2 = aaxx.a.getPackageManager();
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    long j = -1;
                    while (i4 < size2) {
                        EventLog.Event event = (EventLog.Event) arrayList3.get(i4);
                        j = event.getTimeNanos();
                        if (j > a7) {
                            aaxu aaxu2 = new aaxu();
                            aaxu2.a = event.getTag();
                            aaxu2.e = event.getTimeNanos();
                            int i5 = aaxx.d.get(event.getTag());
                            if (i5 == 1) {
                                if (event.getData() instanceof String) {
                                    aaxu2.c = (String) event.getData();
                                }
                                i = a6.get(event.getProcessId());
                            } else if (i5 != 2) {
                                if (i5 != 3) {
                                    arrayList = arrayList3;
                                    sparseIntArray = a6;
                                } else {
                                    try {
                                        Object[] objArr = (Object[]) event.getData();
                                        if (objArr == null || objArr.length != 3) {
                                            arrayList = arrayList3;
                                            sparseIntArray = a6;
                                        } else {
                                            Object obj = objArr[0];
                                            if (obj instanceof String) {
                                                String str = (String) obj;
                                                if (str.startsWith("do-not-log-")) {
                                                    arrayList = arrayList3;
                                                    sparseIntArray = a6;
                                                } else if (!azfv.x() || aaxx.e.contains(str)) {
                                                    aaxu2.b = str;
                                                    Object obj2 = objArr[1];
                                                    i = obj2 instanceof Integer ? ((Integer) obj2).intValue() : -1;
                                                    Object obj3 = objArr[2];
                                                    if (obj3 instanceof String) {
                                                        aaxu2.c = (String) obj3;
                                                    }
                                                } else {
                                                    arrayList = arrayList3;
                                                    sparseIntArray = a6;
                                                }
                                            } else {
                                                arrayList = arrayList3;
                                                sparseIntArray = a6;
                                            }
                                        }
                                    } catch (ClassCastException e3) {
                                        arrayList = arrayList3;
                                        sparseIntArray = a6;
                                    }
                                }
                            } else if (event.getData() instanceof Integer) {
                                i = ((Integer) event.getData()).intValue();
                            } else {
                                arrayList = arrayList3;
                                sparseIntArray = a6;
                            }
                            if (i == -1) {
                                arrayList = arrayList3;
                                sparseIntArray2 = a6;
                            } else if (!aaza.a(Process.myUid(), i)) {
                                arrayList = arrayList3;
                                sparseIntArray = a6;
                            } else if (Process.myUid() != i) {
                                String[] packagesForUid2 = packageManager2.getPackagesForUid(i);
                                if (packagesForUid2 != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    int length = packagesForUid2.length;
                                    arrayList = arrayList3;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 < length) {
                                            int i7 = length;
                                            String str2 = packagesForUid2[i6];
                                            if (azfv.n()) {
                                                sparseIntArray = a6;
                                                aaxf = aaxh2.a(str2, true);
                                            } else {
                                                sparseIntArray = a6;
                                                aaxf = aaxh2.a(str2, false);
                                            }
                                            if (aaxf != null) {
                                                if (aaxx.a(aaxf)) {
                                                    break;
                                                }
                                                arrayList5.add(aaxf);
                                            }
                                            i6++;
                                            length = i7;
                                            a6 = sparseIntArray;
                                        } else {
                                            sparseIntArray2 = a6;
                                            if (!arrayList5.isEmpty()) {
                                                aaxu2.d = arrayList5;
                                            }
                                        }
                                    }
                                } else {
                                    arrayList = arrayList3;
                                    sparseIntArray2 = a6;
                                }
                            } else {
                                arrayList = arrayList3;
                                sparseIntArray = a6;
                            }
                            arrayList4.add(aaxu2);
                        } else {
                            arrayList = arrayList3;
                            sparseIntArray = a6;
                        }
                        i4++;
                        arrayList3 = arrayList;
                        a6 = sparseIntArray;
                    }
                    long j2 = j;
                    if (j2 != -1) {
                        aayy2.a(j2);
                    }
                    aaxv = new aaxv();
                    aaxv.a = arrayList4;
                } catch (IOException e4) {
                    aaxx.c.a((Throwable) e4);
                }
            }
        }
        if (aaxv != null) {
            aayx aayx = this.e;
            aayx.a();
            List list = aaxv.a;
            if (list != null && !list.isEmpty()) {
                int size3 = list.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    aaxu aaxu3 = (aaxu) list.get(i8);
                    aucd o = aatc.g.o();
                    if (aaxu3 != null) {
                        int i9 = aaxu3.a;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aatc aatc = (aatc) o.b;
                        int i10 = aatc.a | 1;
                        aatc.a = i10;
                        aatc.b = i9;
                        String str3 = aaxu3.b;
                        String str4 = "";
                        if (str3 == null) {
                            str3 = str4;
                        }
                        str3.getClass();
                        int i11 = i10 | 2;
                        aatc.a = i11;
                        aatc.c = str3;
                        String str5 = aaxu3.c;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        str4.getClass();
                        int i12 = i11 | 8;
                        aatc.a = i12;
                        aatc.f = str4;
                        long j3 = aaxu3.e;
                        aatc.a = i12 | 4;
                        aatc.d = j3;
                        List list2 = aaxu3.d;
                        if (list2 != null && !list2.isEmpty()) {
                            List list3 = aaxu3.d;
                            int size4 = list3.size();
                            for (int i13 = 0; i13 < size4; i13++) {
                                aaxf aaxf2 = (aaxf) list3.get(i13);
                                if (aaxf2 != null) {
                                    aasm a8 = aayx.a(aaxf2, false);
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    aatc aatc2 = (aatc) o.b;
                                    a8.getClass();
                                    if (!aatc2.e.a()) {
                                        aatc2.e = aucj.a(aatc2.e);
                                    }
                                    aatc2.e.add(a8);
                                }
                            }
                        }
                        aucd aucd = aayx.e;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        aatt aatt = (aatt) aucd.b;
                        aatc aatc3 = (aatc) o.i();
                        aatt aatt2 = aatt.P;
                        aatc3.getClass();
                        if (!aatt.G.a()) {
                            aatt.G = aucj.a(aatt.G);
                        }
                        aatt.G.add(aatc3);
                    }
                }
            }
        }
    }

    public static void a(Context context, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        aayc aayc = new aayc(bundle);
        if (a(aayc)) {
            try {
                byte[] f = aayc.f();
                if (f != null) {
                    Iterator it = ((aarw) aucj.a((aucj) aarw.b, f)).a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        aarv aarv = ((aaru) it.next()).b;
                        if (aarv == null) {
                            aarv = aarv.e;
                        }
                        if ("network_watchlist_report".equals(aarv.c)) {
                            byte[] f2 = aayc.f();
                            if (f2 != null) {
                                aaza.a(context, f2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                if (Log.isLoggable(b, 6)) {
                    Log.e(b, "Error while getting watchlist report", th);
                }
            }
        }
        long b2 = new aayy(context).b();
        if (b2 == -1 || b2 + bundle.getLong("snet_idle_mode_wake_interval_ms") < System.currentTimeMillis()) {
            acrz acrz = new acrz(context, String.valueOf(aayu.class.getCanonicalName()).concat(":SnetIdle"));
            aayu aayu = new aayu(context, aayc);
            try {
                acrz.a(aayu.d.b.a("watchdog_idle_mode_timeout_ms", 600000));
                aayu.a();
                try {
                    acrz.c();
                } catch (RuntimeException e2) {
                    aayu.e.a((Throwable) e2);
                }
            } catch (Throwable th2) {
                try {
                    acrz.c();
                } catch (RuntimeException e3) {
                    aayu.e.a((Throwable) e3);
                }
                throw th2;
            }
        }
    }

    private final void b(String str) {
        if (this.d.b.b("log_execution_points")) {
            aaxx.a(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        aaxf a2 = new aaxh(this.c, this.d).a("com.google.android.gms");
        if (a2 != null) {
            int i = Build.VERSION.SDK_INT;
            a2.i = aaza.a(this.c, "com.google.android.gms");
            aayx aayx = this.e;
            aayx.a();
            if (a2.a != null) {
                aucd aucd = aayx.e;
                aasm a3 = aayx.a(a2, false);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aatt aatt = (aatt) aucd.b;
                aatt aatt2 = aatt.P;
                a3.getClass();
                aatt.z = a3;
                aatt.a |= 16777216;
            }
        }
    }

    private static boolean a(aayc aayc) {
        return "googler".equals(aayc.d());
    }

    private static String[] a(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : amsk.a(",").a((CharSequence) str)) {
            if (a.contains(str2)) {
                arrayList.add(str2);
            } else if (Log.isLoggable(b, 6)) {
                Log.e(b, String.format("Unknown tag: %s", new Object[]{str2}));
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x0e08, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:?, code lost:
        r1.e.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x0e0f, code lost:
        r1.e.a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:717:0x0e18, code lost:
        if (m() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:771:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x09ef A[SYNTHETIC, Splitter:B:486:0x09ef] */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x09fb A[SYNTHETIC, Splitter:B:494:0x09fb] */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x0a0a A[Catch:{ Exception -> 0x0c60, IncompatibleClassChangeError | NoClassDefFoundError -> 0x0c59, all -> 0x0e08 }] */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x0ad8 A[Catch:{ Exception -> 0x0c60, IncompatibleClassChangeError | NoClassDefFoundError -> 0x0c59, all -> 0x0e08 }] */
    /* JADX WARNING: Removed duplicated region for block: B:698:0x0dd8 A[Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }] */
    /* JADX WARNING: Removed duplicated region for block: B:703:0x0ddf A[Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }] */
    /* JADX WARNING: Removed duplicated region for block: B:712:0x0e08 A[ExcHandler: all (r0v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:660:0x0d40] */
    /* JADX WARNING: Removed duplicated region for block: B:730:0x0e3f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r22 = this;
            r1 = r22
            long r8 = java.lang.System.currentTimeMillis()
            aayy r10 = new aayy
            android.content.Context r2 = r1.c
            r10.<init>(r2)
            aayc r2 = r1.d     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            aayb r2 = r2.b     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            java.lang.String r3 = "is_targeted_by_gservices"
            boolean r2 = r2.b(r3)     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            if (r2 == 0) goto L_0x0024
            aayc r2 = r1.d     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            aayb r2 = r2.b     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            java.lang.String r3 = "idle_tags_whitelist"
            java.lang.String r2 = r2.a(r3)     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            goto L_0x0026
        L_0x0024:
            java.lang.String r2 = "system_ca_cert_store,setuid_files,gmscore,phonesky,device_state,locale,selinux_status,event_log,mount_options,app_dir_wr,internal_logs,default_packages,su_files,settings,ssl_proxy,sd_card_test,attest,carrier_info,logcat,connection_info,snet_verify_apps_api_usage,app_ops,snet_network_watchlist"
        L_0x0026:
            aayx r3 = r1.e     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            r3.a()     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            r12 = 0
            if (r2 == 0) goto L_0x004b
            aucd r3 = r3.e     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            boolean r4 = r3.c     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            if (r4 != 0) goto L_0x0035
            goto L_0x003a
        L_0x0035:
            r3.c()     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            r3.c = r12     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
        L_0x003a:
            aucj r3 = r3.b     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            aatt r3 = (defpackage.aatt) r3     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            aatt r4 = defpackage.aatt.P     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            r2.getClass()     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            int r4 = r3.a     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.a = r4     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            r3.j = r2     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
        L_0x004b:
            if (r2 == 0) goto L_0x0df6
            java.lang.String[] r13 = a((java.lang.String) r2)     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            int r14 = r13.length     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            r15 = 0
        L_0x0053:
            if (r15 < r14) goto L_0x0060
            java.lang.String r2 = "done"
            r1.b(r2)     // Catch:{ Exception -> 0x005c, all -> 0x0e08 }
            goto L_0x0df6
        L_0x005c:
            r0 = move-exception
            r2 = r0
            goto L_0x0e20
        L_0x0060:
            r7 = r13[r15]     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            r3 = 1
            r1.b(r7)     // Catch:{ Exception -> 0x0db4, NoClassDefFoundError -> 0x0da7, IncompatibleClassChangeError -> 0x0da5, all -> 0x0e08 }
            int r2 = r7.hashCode()
            r16 = 3
            r17 = 16
            r18 = 8
            r11 = 5
            switch(r2) {
                case -1798604890: goto L_0x0156;
                case -1280089869: goto L_0x014c;
                case -1179491089: goto L_0x0142;
                case -1097462182: goto L_0x0138;
                case -793616492: goto L_0x012d;
                case -585388696: goto L_0x0123;
                case -353763328: goto L_0x0118;
                case 3000946: goto L_0x010d;
                case 31746079: goto L_0x0103;
                case 106941038: goto L_0x00f8;
                case 153440620: goto L_0x00ed;
                case 648620331: goto L_0x00e1;
                case 731527535: goto L_0x00d5;
                case 844731307: goto L_0x00c9;
                case 919143411: goto L_0x00bd;
                case 1434631203: goto L_0x00b1;
                case 1492992120: goto L_0x00a6;
                case 1696564327: goto L_0x009a;
                case 1826448881: goto L_0x008e;
                case 1974327701: goto L_0x0082;
                case 2135644762: goto L_0x0076;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x0160
        L_0x0076:
            java.lang.String r2 = "su_files"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 11
            goto L_0x0161
        L_0x0082:
            java.lang.String r2 = "carrier_info"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 17
            goto L_0x0161
        L_0x008e:
            java.lang.String r2 = "internal_logs"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 9
            goto L_0x0161
        L_0x009a:
            java.lang.String r2 = "snet_network_watchlist"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 20
            goto L_0x0161
        L_0x00a6:
            java.lang.String r2 = "mount_options"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 7
            goto L_0x0161
        L_0x00b1:
            java.lang.String r2 = "settings"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 12
            goto L_0x0161
        L_0x00bd:
            java.lang.String r2 = "sd_card_test"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 15
            goto L_0x0161
        L_0x00c9:
            java.lang.String r2 = "app_dir_wr"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 8
            goto L_0x0161
        L_0x00d5:
            java.lang.String r2 = "connection_info"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 13
            goto L_0x0161
        L_0x00e1:
            java.lang.String r2 = "default_packages"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 10
            goto L_0x0161
        L_0x00ed:
            java.lang.String r2 = "gmscore"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 5
            goto L_0x0161
        L_0x00f8:
            java.lang.String r2 = "proxy"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 14
            goto L_0x0161
        L_0x0103:
            java.lang.String r2 = "event_log"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 1
            goto L_0x0161
        L_0x010d:
            java.lang.String r2 = "apps"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 16
            goto L_0x0161
        L_0x0118:
            java.lang.String r2 = "snet_verify_apps_api_usage"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 19
            goto L_0x0161
        L_0x0123:
            java.lang.String r2 = "device_state"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 2
            goto L_0x0161
        L_0x012d:
            java.lang.String r2 = "app_ops"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 18
            goto L_0x0161
        L_0x0138:
            java.lang.String r2 = "locale"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 3
            goto L_0x0161
        L_0x0142:
            java.lang.String r2 = "selinux_status"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 4
            goto L_0x0161
        L_0x014c:
            java.lang.String r2 = "phonesky"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 6
            goto L_0x0161
        L_0x0156:
            java.lang.String r2 = "setuid_files"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0160
            r2 = 0
            goto L_0x0161
        L_0x0160:
            r2 = -1
        L_0x0161:
            switch(r2) {
                case 0: goto L_0x0c65;
                case 1: goto L_0x0c4f;
                case 2: goto L_0x0c45;
                case 3: goto L_0x0bd2;
                case 4: goto L_0x0b46;
                case 5: goto L_0x0b3c;
                case 6: goto L_0x0ae7;
                case 7: goto L_0x0925;
                case 8: goto L_0x090d;
                case 9: goto L_0x089b;
                case 10: goto L_0x061f;
                case 11: goto L_0x0614;
                case 12: goto L_0x0544;
                case 13: goto L_0x0539;
                case 14: goto L_0x04bf;
                case 15: goto L_0x03ae;
                case 16: goto L_0x0398;
                case 17: goto L_0x038d;
                case 18: goto L_0x034f;
                case 19: goto L_0x0303;
                case 20: goto L_0x016b;
                default: goto L_0x0164;
            }
        L_0x0164:
            r21 = r7
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x016b:
            boolean r2 = r22.m()     // Catch:{ Exception -> 0x0300, NoClassDefFoundError -> 0x02fd, IncompatibleClassChangeError -> 0x02fb, all -> 0x0e08 }
            if (r2 != 0) goto L_0x0178
            aayc r2 = r1.d     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            byte[] r2 = r2.f()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            goto L_0x017e
        L_0x0178:
            android.content.Context r2 = r1.c     // Catch:{ Exception -> 0x0300, NoClassDefFoundError -> 0x02fd, IncompatibleClassChangeError -> 0x02fb, all -> 0x0e08 }
            byte[] r2 = defpackage.aaza.a((android.content.Context) r2)     // Catch:{ Exception -> 0x0300, NoClassDefFoundError -> 0x02fd, IncompatibleClassChangeError -> 0x02fb, all -> 0x0e08 }
        L_0x017e:
            if (r2 == 0) goto L_0x02ee
            aarw r11 = defpackage.aarw.b     // Catch:{ Exception -> 0x0300, NoClassDefFoundError -> 0x02fd, IncompatibleClassChangeError -> 0x02fb, all -> 0x0e08 }
            aucj r2 = defpackage.aucj.a((defpackage.aucj) r11, (byte[]) r2)     // Catch:{ Exception -> 0x0300, NoClassDefFoundError -> 0x02fd, IncompatibleClassChangeError -> 0x02fb, all -> 0x0e08 }
            aarw r2 = (defpackage.aarw) r2     // Catch:{ Exception -> 0x0300, NoClassDefFoundError -> 0x02fd, IncompatibleClassChangeError -> 0x02fb, all -> 0x0e08 }
            aucx r2 = r2.a     // Catch:{ Exception -> 0x0300, NoClassDefFoundError -> 0x02fd, IncompatibleClassChangeError -> 0x02fb, all -> 0x0e08 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0300, NoClassDefFoundError -> 0x02fd, IncompatibleClassChangeError -> 0x02fb, all -> 0x0e08 }
        L_0x018e:
            boolean r11 = r2.hasNext()     // Catch:{ Exception -> 0x0300, NoClassDefFoundError -> 0x02fd, IncompatibleClassChangeError -> 0x02fb, all -> 0x0e08 }
            if (r11 == 0) goto L_0x02e1
            java.lang.Object r11 = r2.next()     // Catch:{ Exception -> 0x0300, NoClassDefFoundError -> 0x02fd, IncompatibleClassChangeError -> 0x02fb, all -> 0x0e08 }
            aaru r11 = (defpackage.aaru) r11     // Catch:{ Exception -> 0x0300, NoClassDefFoundError -> 0x02fd, IncompatibleClassChangeError -> 0x02fb, all -> 0x0e08 }
            int r6 = r11.a     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r6 = r6 & r3
            if (r6 == 0) goto L_0x02d5
            aarv r6 = r11.b     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r6 == 0) goto L_0x01a4
            goto L_0x01a6
        L_0x01a4:
            aarv r6 = defpackage.aarv.e     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
        L_0x01a6:
            java.lang.String r6 = r6.c     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            java.lang.String r5 = "network_watchlist_report"
            boolean r5 = r6.equals(r5)     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r5 == 0) goto L_0x02c9
            aarv r5 = r11.b     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r5 == 0) goto L_0x01b5
            goto L_0x01b7
        L_0x01b5:
            aarv r5 = defpackage.aarv.e     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
        L_0x01b7:
            auay r5 = r5.d     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            byte[] r5 = r5.k()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aubs r6 = defpackage.aubs.c()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            auhy r11 = defpackage.auhy.d     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aucj r5 = defpackage.aucj.a((defpackage.aucj) r11, (byte[]) r5, (defpackage.aubs) r6)     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            auhy r5 = (defpackage.auhy) r5     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            int r6 = r5.a     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            java.lang.String r11 = r5.b     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            byte[] r11 = defpackage.aaza.a((java.lang.String) r11)     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            java.util.IdentityHashMap r4 = new java.util.IdentityHashMap     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r4.<init>()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aucx r5 = r5.c     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
        L_0x01dc:
            boolean r17 = r5.hasNext()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r17 == 0) goto L_0x01fc
            java.lang.Object r17 = r5.next()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r3 = r17
            auhx r3 = (defpackage.auhx) r3     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            java.lang.String r12 = r3.a     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            byte[] r12 = defpackage.aaza.a((java.lang.String) r12)     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            boolean r3 = r3.b     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r4.put(r12, r3)     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r3 = 1
            r12 = 0
            goto L_0x01dc
        L_0x01fc:
            aayx r3 = r1.e     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r3.a()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aati r5 = defpackage.aati.d     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aucd r5 = r5.o()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            boolean r12 = r5.c     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r12 != 0) goto L_0x020c
            goto L_0x0212
        L_0x020c:
            r5.c()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r12 = 0
            r5.c = r12     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
        L_0x0212:
            aucj r12 = r5.b     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aati r12 = (defpackage.aati) r12     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r17 = r2
            int r2 = r12.a     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r18 = 1
            r2 = r2 | 1
            r12.a = r2     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r12.b = r6     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            int r2 = r11.length     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r2 > 0) goto L_0x0226
            goto L_0x0244
        L_0x0226:
            auay r2 = defpackage.auay.a((byte[]) r11)     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            boolean r6 = r5.c     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r6 != 0) goto L_0x022f
            goto L_0x0235
        L_0x022f:
            r5.c()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r6 = 0
            r5.c = r6     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
        L_0x0235:
            aucj r6 = r5.b     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aati r6 = (defpackage.aati) r6     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r2.getClass()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            int r11 = r6.a     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r12 = 2
            r11 = r11 | r12
            r6.a = r11     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r6.c = r2     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
        L_0x0244:
            aucd r2 = r3.e     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            boolean r6 = r2.c     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r6 != 0) goto L_0x024b
            goto L_0x0251
        L_0x024b:
            r2.c()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r6 = 0
            r2.c = r6     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
        L_0x0251:
            aucj r2 = r2.b     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aatt r2 = (defpackage.aatt) r2     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aucj r5 = r5.i()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aati r5 = (defpackage.aati) r5     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aatt r6 = defpackage.aatt.P     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r5.getClass()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r2.F = r5     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            int r5 = r2.b     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r6 = 4
            r5 = r5 | r6
            r2.b = r5     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            boolean r2 = r4.isEmpty()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r2 != 0) goto L_0x02c0
            java.util.Set r2 = r4.keySet()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
        L_0x0276:
            boolean r5 = r2.hasNext()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r5 == 0) goto L_0x02b7
            java.lang.Object r5 = r2.next()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            byte[] r5 = (byte[]) r5     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            java.lang.Object r11 = r4.get(r5)     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            boolean r11 = r11.booleanValue()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r11 != 0) goto L_0x0290
            r12 = 2
            goto L_0x0291
        L_0x0290:
            r12 = 3
        L_0x0291:
            auay r5 = defpackage.auay.a((byte[]) r5)     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aucd r5 = r3.a((defpackage.auay) r5)     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            boolean r11 = r5.c     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r11 != 0) goto L_0x029e
            goto L_0x02a4
        L_0x029e:
            r5.c()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r11 = 0
            r5.c = r11     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
        L_0x02a4:
            aucj r5 = r5.b     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aask r5 = (defpackage.aask) r5     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aask r11 = defpackage.aask.e     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r11 = -1
            int r12 = r12 + r11
            r5.d = r12     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            int r12 = r5.a     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r19 = 2
            r12 = r12 | 2
            r5.a = r12     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            goto L_0x0276
        L_0x02b7:
            r11 = -1
            r19 = 2
            r2 = r17
            r3 = 1
            r12 = 0
            goto L_0x018e
        L_0x02c0:
            r11 = -1
            r19 = 2
            r2 = r17
            r3 = 1
            r12 = 0
            goto L_0x018e
        L_0x02c9:
            r17 = r2
            r6 = 4
            r11 = -1
            r18 = 1
            r19 = 2
            r3 = 1
            r12 = 0
            goto L_0x018e
        L_0x02d5:
            r17 = r2
            r6 = 4
            r11 = -1
            r18 = 1
            r19 = 2
            r3 = 1
            r12 = 0
            goto L_0x018e
        L_0x02e1:
            r6 = 4
            r11 = -1
            r18 = 1
            r19 = 2
            r21 = r7
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x02ee:
            r6 = 4
            r11 = -1
            r18 = 1
            r19 = 2
            r21 = r7
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x02fb:
            r0 = move-exception
            goto L_0x02fe
        L_0x02fd:
            r0 = move-exception
        L_0x02fe:
            r11 = -1
            goto L_0x0344
        L_0x0300:
            r0 = move-exception
            r11 = -1
            goto L_0x034a
        L_0x0303:
            r6 = 4
            r11 = -1
            r18 = 1
            r19 = 2
            aayx r2 = r1.e     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            aayc r3 = r1.d     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            java.util.List r3 = r3.e()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r3 == 0) goto L_0x033a
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r4.<init>()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
        L_0x031c:
            boolean r5 = r3.hasNext()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r5 == 0) goto L_0x032e
            java.lang.Object r5 = r3.next()     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            if (r5 == 0) goto L_0x031c
            r4.add(r5)     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            goto L_0x031c
        L_0x032e:
            aucd r2 = r2.e     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r2.af(r4)     // Catch:{ Exception -> 0x0349, NoClassDefFoundError -> 0x0343, IncompatibleClassChangeError -> 0x0341, all -> 0x0e08 }
            r21 = r7
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x033a:
            r21 = r7
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x0341:
            r0 = move-exception
            goto L_0x0344
        L_0x0343:
            r0 = move-exception
        L_0x0344:
            r2 = r0
            r21 = r7
            goto L_0x091b
        L_0x0349:
            r0 = move-exception
        L_0x034a:
            r2 = r0
            r21 = r7
            goto L_0x0921
        L_0x034f:
            r6 = 4
            r11 = -1
            r18 = 1
            r19 = 2
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0388, NoClassDefFoundError -> 0x0383, IncompatibleClassChangeError -> 0x0381, all -> 0x0e08 }
            aaxe r2 = new aaxe     // Catch:{ Exception -> 0x0388, NoClassDefFoundError -> 0x0383, IncompatibleClassChangeError -> 0x0381, all -> 0x0e08 }
            java.lang.Class<android.app.AppOpsManager> r3 = android.app.AppOpsManager.class
            r2.<init>(r3)     // Catch:{ Exception -> 0x0388, NoClassDefFoundError -> 0x0383, IncompatibleClassChangeError -> 0x0381, all -> 0x0e08 }
            aaxc r5 = new aaxc     // Catch:{ Exception -> 0x0388, NoClassDefFoundError -> 0x0383, IncompatibleClassChangeError -> 0x0381, all -> 0x0e08 }
            android.content.Context r2 = r1.c     // Catch:{ Exception -> 0x0388, NoClassDefFoundError -> 0x0383, IncompatibleClassChangeError -> 0x0381, all -> 0x0e08 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0388, NoClassDefFoundError -> 0x0383, IncompatibleClassChangeError -> 0x0381, all -> 0x0e08 }
            aaxd r12 = new aaxd     // Catch:{ Exception -> 0x0388, NoClassDefFoundError -> 0x0383, IncompatibleClassChangeError -> 0x0381, all -> 0x0e08 }
            android.content.Context r3 = r1.c     // Catch:{ Exception -> 0x0388, NoClassDefFoundError -> 0x0383, IncompatibleClassChangeError -> 0x0381, all -> 0x0e08 }
            aayx r4 = r1.e     // Catch:{ Exception -> 0x0388, NoClassDefFoundError -> 0x0383, IncompatibleClassChangeError -> 0x0381, all -> 0x0e08 }
            boolean r16 = r22.h()     // Catch:{ Exception -> 0x0388, NoClassDefFoundError -> 0x0383, IncompatibleClassChangeError -> 0x0381, all -> 0x0e08 }
            r2 = r12
            r11 = 1
            r6 = r10
            r21 = r7
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r12.a(r8)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x0381:
            r0 = move-exception
            goto L_0x0384
        L_0x0383:
            r0 = move-exception
        L_0x0384:
            r21 = r7
            goto L_0x091a
        L_0x0388:
            r0 = move-exception
            r21 = r7
            goto L_0x0920
        L_0x038d:
            r21 = r7
            r11 = 1
            r22.k()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x0398:
            r21 = r7
            r11 = 1
            boolean r2 = r22.h()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r2 == 0) goto L_0x03a9
            r22.g()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x03a9:
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x03ae:
            r21 = r7
            r11 = 1
            aayo r2 = new aayo     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            android.content.Context r3 = r1.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aayc r4 = r1.d     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aayn r2 = r2.a()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aayx r3 = r1.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.a()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r2 == 0) goto L_0x04b9
            aato r4 = defpackage.aato.i     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aucd r4 = r4.o()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r5 = r2.a()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r6 = r4.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r6 != 0) goto L_0x03d4
            goto L_0x03da
        L_0x03d4:
            r4.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6 = 0
            r4.c = r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x03da:
            aucj r6 = r4.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aato r6 = (defpackage.aato) r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r7 = r6.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7 = r7 | r11
            r6.a = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6.b = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r5 = r2.b()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r6 = r4.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r6 != 0) goto L_0x03ee
            goto L_0x03f4
        L_0x03ee:
            r4.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6 = 0
            r4.c = r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x03f4:
            aucj r6 = r4.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aato r6 = (defpackage.aato) r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r7 = r6.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r12 = 2
            r7 = r7 | r12
            r6.a = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6.c = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            long r5 = r2.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r7 = r4.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r7 != 0) goto L_0x0409
            goto L_0x040f
        L_0x0409:
            r4.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7 = 0
            r4.c = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x040f:
            aucj r7 = r4.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aato r7 = (defpackage.aato) r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r12 = r7.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11 = 4
            r12 = r12 | r11
            r7.a = r12     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7.d = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r5 = r2.d()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r6 = r4.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r6 != 0) goto L_0x0424
            goto L_0x042a
        L_0x0424:
            r4.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6 = 0
            r4.c = r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x042a:
            aucj r6 = r4.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aato r6 = (defpackage.aato) r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r7 = r6.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7 = r7 | 8
            r6.a = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6.e = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r5 = r2.e()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r6 = r4.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r6 != 0) goto L_0x043f
            goto L_0x0445
        L_0x043f:
            r4.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6 = 0
            r4.c = r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x0445:
            aucj r6 = r4.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aato r6 = (defpackage.aato) r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r7 = r6.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7 = r7 | 16
            r6.a = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6.f = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            long r5 = r2.g()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r7 = r4.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r7 != 0) goto L_0x045a
            goto L_0x0460
        L_0x045a:
            r4.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7 = 0
            r4.c = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x0460:
            aucj r7 = r4.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aato r7 = (defpackage.aato) r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r12 = r7.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r12 = r12 | 64
            r7.a = r12     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7.h = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.lang.String r5 = r2.f()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r5 == 0) goto L_0x0490
            java.lang.String r2 = r2.f()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r5 = r4.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r5 != 0) goto L_0x047b
            goto L_0x0481
        L_0x047b:
            r4.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r5 = 0
            r4.c = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x0481:
            aucj r5 = r4.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aato r5 = (defpackage.aato) r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r2.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r6 = r5.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6 = r6 | 32
            r5.a = r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r5.g = r2     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x0490:
            aucd r2 = r3.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r3 = r2.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r3 != 0) goto L_0x0497
            goto L_0x049d
        L_0x0497:
            r2.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3 = 0
            r2.c = r3     // Catch:{ Exception -> 0x0533, NoClassDefFoundError -> 0x052d, IncompatibleClassChangeError -> 0x052b, all -> 0x0e08 }
        L_0x049d:
            aucj r2 = r2.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r2 = (defpackage.aatt) r2     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aucj r3 = r4.i()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aato r3 = (defpackage.aato) r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r4 = defpackage.aatt.P     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r2.J = r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r3 = r2.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3 = r3 | 64
            r2.b = r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x04b9:
            r11 = 4
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x04bf:
            r21 = r7
            r11 = 4
            aayj r2 = defpackage.aayk.a()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3 = 0
            r2.c = r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aayx r3 = r1.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.a()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatl r4 = defpackage.aatl.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aucd r4 = r4.o()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r5 = r2.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r6 = r4.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r6 != 0) goto L_0x04db
            goto L_0x04e1
        L_0x04db:
            r4.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6 = 0
            r4.c = r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x04e1:
            aucj r6 = r4.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatl r6 = (defpackage.aatl) r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r7 = r6.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r12 = 1
            r7 = r7 | r12
            r6.a = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6.b = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r5 = r2.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7 = r7 | 2
            r6.a = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6.c = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.lang.String r2 = r2.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r2 == 0) goto L_0x0502
            r2.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r5 = r7 | 4
            r6.a = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6.d = r2     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x0502:
            aucd r2 = r3.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r3 = r2.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r3 != 0) goto L_0x0509
            goto L_0x050f
        L_0x0509:
            r2.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3 = 0
            r2.c = r3     // Catch:{ Exception -> 0x0533, NoClassDefFoundError -> 0x052d, IncompatibleClassChangeError -> 0x052b, all -> 0x0e08 }
        L_0x050f:
            aucj r2 = r2.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r2 = (defpackage.aatt) r2     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aucj r3 = r4.i()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatl r3 = (defpackage.aatl) r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r4 = defpackage.aatt.P     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r2.E = r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r3 = r2.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r4 = 2
            r3 = r3 | r4
            r2.b = r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x052b:
            r0 = move-exception
            goto L_0x052e
        L_0x052d:
            r0 = move-exception
        L_0x052e:
            r2 = r0
            r20 = r10
            goto L_0x0dae
        L_0x0533:
            r0 = move-exception
            r2 = r0
            r20 = r10
            goto L_0x0dbb
        L_0x0539:
            r21 = r7
            r11 = 4
            r22.f()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x0544:
            r21 = r7
            r11 = 4
            aayt r2 = new aayt     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            android.content.Context r3 = r1.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aayx r3 = r1.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aays r2 = r2.a()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.a()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r2 == 0) goto L_0x060f
            aata r4 = defpackage.aata.j     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aucd r4 = r4.o()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r5 = r2.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r6 = r4.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r6 != 0) goto L_0x0566
            goto L_0x056c
        L_0x0566:
            r4.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6 = 0
            r4.c = r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x056c:
            aucj r6 = r4.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aata r6 = (defpackage.aata) r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r7 = r6.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r12 = 1
            r7 = r7 | r12
            r6.a = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6.b = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r5 = r2.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7 = r7 | 2
            r6.a = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6.c = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r5 = r2.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7 = r7 | 8
            r6.a = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6.e = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            defpackage.aata.a(r6)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r5 = r4.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r5 != 0) goto L_0x0590
            goto L_0x0596
        L_0x0590:
            r4.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r5 = 0
            r4.c = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x0596:
            aucj r5 = r4.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aata r5 = (defpackage.aata) r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            defpackage.aata.b(r5)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r5 = r2.d     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r6 = r4.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r6 != 0) goto L_0x05a4
            goto L_0x05aa
        L_0x05a4:
            r4.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6 = 0
            r4.c = r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x05aa:
            aucj r6 = r4.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aata r6 = (defpackage.aata) r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r7 = r6.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7 = r7 | 128(0x80, float:1.794E-43)
            r6.a = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6.g = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r5 = r2.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7 = r7 | 512(0x200, float:7.175E-43)
            r6.a = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6.i = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r5 = r2.f     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r5 == 0) goto L_0x05cb
            int r5 = r5 + -1
            r6.d = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7 = r7 | 4
            r6.a = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            goto L_0x05cc
        L_0x05cb:
        L_0x05cc:
            int r5 = r2.g     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r5 != 0) goto L_0x05d1
            goto L_0x05d9
        L_0x05d1:
            int r5 = r5 + -1
            r6.f = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7 = r7 | 16
            r6.a = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x05d9:
            int r2 = r2.h     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r2 == 0) goto L_0x05e5
            int r2 = r2 + -1
            r6.h = r2     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r2 = r7 | 256(0x100, float:3.59E-43)
            r6.a = r2     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x05e5:
            aucd r2 = r3.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r3 = r2.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r3 != 0) goto L_0x05ec
            goto L_0x05f2
        L_0x05ec:
            r2.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3 = 0
            r2.c = r3     // Catch:{ Exception -> 0x0533, NoClassDefFoundError -> 0x052d, IncompatibleClassChangeError -> 0x052b, all -> 0x0e08 }
        L_0x05f2:
            aucj r2 = r2.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r2 = (defpackage.aatt) r2     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aucj r3 = r4.i()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aata r3 = (defpackage.aata) r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r4 = defpackage.aatt.P     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r2.y = r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r3 = r2.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r3 = r3 | r4
            r2.a = r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x060f:
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x0614:
            r21 = r7
            r11 = 4
            r22.e()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x061f:
            r21 = r7
            r11 = 4
            aayi r2 = new aayi     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            android.content.Context r3 = r1.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aayx r3 = r1.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            android.content.pm.PackageInfo r4 = r2.a()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.a()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.lang.String r5 = "android"
            if (r4 != 0) goto L_0x0638
            goto L_0x06df
        L_0x0638:
            aatj r6 = defpackage.aatj.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aucd r6 = r6.o()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.lang.String r7 = r4.packageName     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r7 == 0) goto L_0x0660
            java.lang.String r7 = r4.packageName     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r12 = r6.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r12 != 0) goto L_0x0649
            goto L_0x064f
        L_0x0649:
            r6.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r12 = 0
            r6.c = r12     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x064f:
            aucj r12 = r6.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatj r12 = (defpackage.aatj) r12     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r11 = r12.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r16 = 1
            r11 = r11 | 1
            r12.a = r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r12.b = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x0660:
            int r7 = r4.versionCode     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r11 = r6.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r11 != 0) goto L_0x0667
            goto L_0x066d
        L_0x0667:
            r6.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11 = 0
            r6.c = r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x066d:
            aucj r11 = r6.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatj r11 = (defpackage.aatj) r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r12 = r11.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r16 = 2
            r12 = r12 | 2
            r11.a = r12     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11.c = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.lang.String r7 = r4.versionName     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r7 != 0) goto L_0x0680
            goto L_0x069e
        L_0x0680:
            java.lang.String r7 = r4.versionName     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r11 = r6.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r11 != 0) goto L_0x0687
            goto L_0x068d
        L_0x0687:
            r6.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11 = 0
            r6.c = r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x068d:
            aucj r11 = r6.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatj r11 = (defpackage.aatj) r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r12 = r11.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r16 = 4
            r12 = r12 | 4
            r11.a = r12     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11.d = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x069e:
            java.lang.String r4 = r4.packageName     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r4 = r5.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r4 == 0) goto L_0x06ba
            boolean r4 = r6.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r4 != 0) goto L_0x06ac
        L_0x06ab:
            goto L_0x06b3
        L_0x06ac:
            r6.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r4 = 0
            r6.c = r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            goto L_0x06ab
        L_0x06b3:
            aucj r4 = r6.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatj r4 = (defpackage.aatj) r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            defpackage.aatj.a(r4)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x06ba:
            aucd r3 = r3.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r4 = r3.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r4 != 0) goto L_0x06c1
            goto L_0x06c7
        L_0x06c1:
            r3.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r4 = 0
            r3.c = r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x06c7:
            aucj r3 = r3.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r3 = (defpackage.aatt) r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aucj r4 = r6.i()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatj r4 = (defpackage.aatj) r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r6 = defpackage.aatt.P     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r4.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.s = r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r4 = r3.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r6 = 524288(0x80000, float:7.34684E-40)
            r4 = r4 | r6
            r3.a = r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x06df:
            aayx r3 = r1.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            android.content.pm.PackageInfo r4 = r2.b()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r4 != 0) goto L_0x06e9
            goto L_0x0790
        L_0x06e9:
            aatj r6 = defpackage.aatj.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aucd r6 = r6.o()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.lang.String r7 = r4.packageName     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r7 == 0) goto L_0x0711
            java.lang.String r7 = r4.packageName     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r11 = r6.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r11 != 0) goto L_0x06fa
            goto L_0x0700
        L_0x06fa:
            r6.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11 = 0
            r6.c = r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x0700:
            aucj r11 = r6.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatj r11 = (defpackage.aatj) r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r12 = r11.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r16 = 1
            r12 = r12 | 1
            r11.a = r12     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11.b = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x0711:
            int r7 = r4.versionCode     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r11 = r6.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r11 != 0) goto L_0x0718
            goto L_0x071e
        L_0x0718:
            r6.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11 = 0
            r6.c = r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x071e:
            aucj r11 = r6.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatj r11 = (defpackage.aatj) r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r12 = r11.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r16 = 2
            r12 = r12 | 2
            r11.a = r12     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11.c = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.lang.String r7 = r4.versionName     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r7 != 0) goto L_0x0731
            goto L_0x074f
        L_0x0731:
            java.lang.String r7 = r4.versionName     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r11 = r6.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r11 != 0) goto L_0x0738
            goto L_0x073e
        L_0x0738:
            r6.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11 = 0
            r6.c = r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x073e:
            aucj r11 = r6.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatj r11 = (defpackage.aatj) r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r12 = r11.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r16 = 4
            r12 = r12 | 4
            r11.a = r12     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11.d = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x074f:
            java.lang.String r4 = r4.packageName     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r4 = r5.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r4 == 0) goto L_0x076b
            boolean r4 = r6.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r4 != 0) goto L_0x075d
        L_0x075c:
            goto L_0x0764
        L_0x075d:
            r6.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r4 = 0
            r6.c = r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            goto L_0x075c
        L_0x0764:
            aucj r4 = r6.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatj r4 = (defpackage.aatj) r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            defpackage.aatj.a(r4)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x076b:
            aucd r3 = r3.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r4 = r3.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r4 != 0) goto L_0x0772
            goto L_0x0778
        L_0x0772:
            r3.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r4 = 0
            r3.c = r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x0778:
            aucj r3 = r3.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r3 = (defpackage.aatt) r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aucj r4 = r6.i()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatj r4 = (defpackage.aatj) r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r5 = defpackage.aatt.P     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r4.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.t = r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r4 = r3.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r5 = 1048576(0x100000, float:1.469368E-39)
            r4 = r4 | r5
            r3.a = r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x0790:
            aayx r3 = r1.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.util.List r4 = r2.d()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.a()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r5 = r4.size()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r5 != 0) goto L_0x07a1
            goto L_0x081a
        L_0x07a1:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x07a5:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r5 == 0) goto L_0x081a
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            android.content.pm.PackageInfo r5 = (android.content.pm.PackageInfo) r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatj r6 = defpackage.aatj.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aucd r6 = r6.o()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.lang.String r7 = r5.packageName     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r7 == 0) goto L_0x07d9
            java.lang.String r7 = r5.packageName     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r11 = r6.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r11 != 0) goto L_0x07c2
            goto L_0x07c8
        L_0x07c2:
            r6.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11 = 0
            r6.c = r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x07c8:
            aucj r11 = r6.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatj r11 = (defpackage.aatj) r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r12 = r11.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r16 = 1
            r12 = r12 | 1
            r11.a = r12     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11.b = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x07d9:
            int r7 = r5.versionCode     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r11 = r6.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r11 != 0) goto L_0x07e0
            goto L_0x07e6
        L_0x07e0:
            r6.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11 = 0
            r6.c = r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x07e6:
            aucj r11 = r6.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatj r11 = (defpackage.aatj) r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r12 = r11.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r16 = 2
            r12 = r12 | 2
            r11.a = r12     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r11.c = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.lang.String r7 = r5.versionName     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r7 == 0) goto L_0x0814
            java.lang.String r5 = r5.versionName     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r7 = r6.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r7 != 0) goto L_0x07ff
            goto L_0x0805
        L_0x07ff:
            r6.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7 = 0
            r6.c = r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x0805:
            aucj r7 = r6.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatj r7 = (defpackage.aatj) r7     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r5.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r11 = r7.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r12 = 4
            r11 = r11 | r12
            r7.a = r11     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7.d = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x0814:
            aucd r5 = r3.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r5.g((defpackage.aucd) r6)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            goto L_0x07a5
        L_0x081a:
            aayx r3 = r1.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.lang.String r4 = r2.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.a()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r4 == 0) goto L_0x0851
            aaxh r5 = r3.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aaxf r4 = r5.a(r4)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r4 == 0) goto L_0x0851
            aucd r3 = r3.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r5 = 0
            aasm r4 = defpackage.aayx.a(r4, r5)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r5 = r3.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r5 != 0) goto L_0x0839
            goto L_0x083f
        L_0x0839:
            r3.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r5 = 0
            r3.c = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x083f:
            aucj r3 = r3.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r3 = (defpackage.aatt) r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r5 = defpackage.aatt.P     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r4.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.v = r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r4 = r3.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r5 = 2097152(0x200000, float:2.938736E-39)
            r4 = r4 | r5
            r3.a = r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x0851:
            aayx r3 = r1.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            android.content.Context r2 = r2.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.lang.String r2 = android.provider.Telephony.Sms.getDefaultSmsPackage(r2)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.a()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r2 == 0) goto L_0x0896
            aaxh r4 = r3.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aaxf r2 = r4.a(r2)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r2 == 0) goto L_0x0891
            aucd r3 = r3.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r4 = 0
            aasm r2 = defpackage.aayx.a(r2, r4)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r4 = r3.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r4 != 0) goto L_0x0874
            goto L_0x087a
        L_0x0874:
            r3.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r4 = 0
            r3.c = r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x087a:
            aucj r3 = r3.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r3 = (defpackage.aatt) r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r4 = defpackage.aatt.P     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r2.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.w = r2     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r2 = r3.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r4 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 | r4
            r3.a = r2     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x0891:
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x0896:
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x089b:
            r21 = r7
            aayc r2 = r1.d     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aayb r2 = r2.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            android.os.Bundle r3 = r2.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.lang.String r4 = "snet_internal_security_logs"
            android.os.Bundle r3 = r3.getBundle(r4)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r3 != 0) goto L_0x08b4
            android.os.Bundle r2 = r2.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.lang.String r3 = "internal_security_logs"
            android.os.Bundle r3 = r2.getBundle(r3)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            goto L_0x08b5
        L_0x08b4:
        L_0x08b5:
            if (r3 == 0) goto L_0x0908
            aayx r2 = r1.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r2.a()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            java.lang.String r4 = "snet_offline_scan_usage"
            int r3 = r3.getInt(r4)     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aath r4 = defpackage.aath.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aucd r4 = r4.o()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r5 = r4.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r5 != 0) goto L_0x08cd
            goto L_0x08d3
        L_0x08cd:
            r4.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r5 = 0
            r4.c = r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x08d3:
            aucj r5 = r4.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aath r5 = (defpackage.aath) r5     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r6 = r5.a     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r7 = 1
            r6 = r6 | r7
            r5.a = r6     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r5.b = r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aucj r3 = r4.i()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aath r3 = (defpackage.aath) r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aucd r2 = r2.e     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            boolean r4 = r2.c     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            if (r4 != 0) goto L_0x08ec
            goto L_0x08f2
        L_0x08ec:
            r2.c()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r4 = 0
            r2.c = r4     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
        L_0x08f2:
            aucj r2 = r2.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r2 = (defpackage.aatt) r2     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            aatt r4 = defpackage.aatt.P     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3.getClass()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r2.L = r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            int r3 = r2.b     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r3 = r3 | 512(0x200, float:7.175E-43)
            r2.b = r3     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x0908:
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x090d:
            r21 = r7
            r22.l()     // Catch:{ Exception -> 0x091f, NoClassDefFoundError -> 0x0919, IncompatibleClassChangeError -> 0x0917, all -> 0x0e08 }
            r20 = r10
            r3 = 0
            goto L_0x0dc0
        L_0x0917:
            r0 = move-exception
            goto L_0x091a
        L_0x0919:
            r0 = move-exception
        L_0x091a:
            r2 = r0
        L_0x091b:
            r20 = r10
            goto L_0x0c5d
        L_0x091f:
            r0 = move-exception
        L_0x0920:
            r2 = r0
        L_0x0921:
            r20 = r10
            goto L_0x0c62
        L_0x0925:
            r21 = r7
            r2 = 5
            java.lang.String r3 = "/system"
            amzy r3 = defpackage.amzy.a((java.lang.Object) r3)     // Catch:{ Exception -> 0x0ae2, NoClassDefFoundError -> 0x0add, IncompatibleClassChangeError -> 0x0adb, all -> 0x0e08 }
            aayx r4 = r1.e     // Catch:{ Exception -> 0x0ae2, NoClassDefFoundError -> 0x0add, IncompatibleClassChangeError -> 0x0adb, all -> 0x0e08 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x0ae2, NoClassDefFoundError -> 0x0add, IncompatibleClassChangeError -> 0x0adb, all -> 0x0e08 }
            r5.<init>()     // Catch:{ Exception -> 0x0ae2, NoClassDefFoundError -> 0x0add, IncompatibleClassChangeError -> 0x0adb, all -> 0x0e08 }
            if (r3 == 0) goto L_0x0a03
            boolean r6 = r3.isEmpty()     // Catch:{ Exception -> 0x0ae2, NoClassDefFoundError -> 0x0add, IncompatibleClassChangeError -> 0x0adb, all -> 0x0e08 }
            if (r6 != 0) goto L_0x0a03
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0ae2, NoClassDefFoundError -> 0x0add, IncompatibleClassChangeError -> 0x0adb, all -> 0x0e08 }
            java.lang.String r7 = "/proc/self/mountinfo"
            r6.<init>(r7)     // Catch:{ Exception -> 0x0ae2, NoClassDefFoundError -> 0x0add, IncompatibleClassChangeError -> 0x0adb, all -> 0x0e08 }
            boolean r7 = r6.exists()     // Catch:{ Exception -> 0x0ae2, NoClassDefFoundError -> 0x0add, IncompatibleClassChangeError -> 0x0adb, all -> 0x0e08 }
            if (r7 == 0) goto L_0x0a03
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x09f5, all -> 0x09e8 }
            java.io.FileReader r11 = new java.io.FileReader     // Catch:{ IOException -> 0x09f5, all -> 0x09e8 }
            r11.<init>(r6)     // Catch:{ IOException -> 0x09f5, all -> 0x09e8 }
            r7.<init>(r11)     // Catch:{ IOException -> 0x09f5, all -> 0x09e8 }
        L_0x0954:
            java.lang.String r6 = r7.readLine()     // Catch:{ IOException -> 0x09e4, all -> 0x09df }
            if (r6 == 0) goto L_0x09d7
            java.lang.String r11 = "\\s+"
            java.lang.String[] r6 = r6.split(r11)     // Catch:{ IOException -> 0x09e4, all -> 0x09df }
            int r11 = r6.length     // Catch:{ IOException -> 0x09e4, all -> 0x09df }
            r12 = 10
            if (r11 < r12) goto L_0x09d0
            r11 = 4
            r16 = r6[r11]     // Catch:{ IOException -> 0x09e4, all -> 0x09df }
            boolean r11 = android.text.TextUtils.isEmpty(r16)     // Catch:{ IOException -> 0x09e4, all -> 0x09df }
            if (r11 != 0) goto L_0x09ca
            r11 = r6[r2]     // Catch:{ IOException -> 0x09e4, all -> 0x09df }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ IOException -> 0x09e4, all -> 0x09df }
            if (r11 != 0) goto L_0x09c4
            r11 = 4
            r12 = r6[r11]     // Catch:{ IOException -> 0x09e4, all -> 0x09df }
            boolean r12 = r3.contains(r12)     // Catch:{ IOException -> 0x09e4, all -> 0x09df }
            if (r12 == 0) goto L_0x09be
            r12 = r6[r11]     // Catch:{ IOException -> 0x09e4, all -> 0x09df }
            r6 = r6[r2]     // Catch:{ IOException -> 0x09e4, all -> 0x09df }
            java.lang.String r11 = ","
            java.lang.String[] r11 = r6.split(r11)     // Catch:{ IOException -> 0x09e4, all -> 0x09df }
            int r2 = r11.length     // Catch:{ IOException -> 0x09e4, all -> 0x09df }
            r17 = r3
            r3 = 0
        L_0x098d:
            if (r3 >= r2) goto L_0x09a6
            r18 = r2
            r2 = r11[r3]     // Catch:{ IOException -> 0x09e4, all -> 0x09df }
            r20 = r10
            java.lang.String r10 = "rw"
            boolean r2 = r2.equalsIgnoreCase(r10)     // Catch:{ IOException -> 0x09bc, all -> 0x09ba }
            if (r2 != 0) goto L_0x09a4
            int r3 = r3 + 1
            r2 = r18
            r10 = r20
            goto L_0x098d
        L_0x09a4:
            r3 = 1
            goto L_0x09a9
        L_0x09a6:
            r20 = r10
            r3 = 0
        L_0x09a9:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ IOException -> 0x09bc, all -> 0x09ba }
            android.util.Pair r2 = android.util.Pair.create(r6, r2)     // Catch:{ IOException -> 0x09bc, all -> 0x09ba }
            r5.put(r12, r2)     // Catch:{ IOException -> 0x09bc, all -> 0x09ba }
            r3 = r17
            r10 = r20
            r2 = 5
            goto L_0x0954
        L_0x09ba:
            r0 = move-exception
            goto L_0x09e2
        L_0x09bc:
            r0 = move-exception
            goto L_0x09f9
        L_0x09be:
            r17 = r3
            r20 = r10
            r2 = 5
            goto L_0x0954
        L_0x09c4:
            r17 = r3
            r20 = r10
            r2 = 5
            goto L_0x0954
        L_0x09ca:
            r17 = r3
            r20 = r10
            r2 = 5
            goto L_0x0954
        L_0x09d0:
            r17 = r3
            r20 = r10
            r2 = 5
            goto L_0x0954
        L_0x09d7:
            r20 = r10
            r7.close()     // Catch:{ IOException -> 0x09dd }
            goto L_0x0a05
        L_0x09dd:
            r0 = move-exception
            goto L_0x0a05
        L_0x09df:
            r0 = move-exception
            r20 = r10
        L_0x09e2:
            r2 = r0
            goto L_0x09ed
        L_0x09e4:
            r0 = move-exception
            r20 = r10
            goto L_0x09f9
        L_0x09e8:
            r0 = move-exception
            r20 = r10
            r2 = r0
            r7 = 0
        L_0x09ed:
            if (r7 == 0) goto L_0x09f4
            r7.close()     // Catch:{ IOException -> 0x09f3 }
            goto L_0x09f4
        L_0x09f3:
            r0 = move-exception
        L_0x09f4:
            throw r2     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x09f5:
            r0 = move-exception
            r20 = r10
            r7 = 0
        L_0x09f9:
            if (r7 == 0) goto L_0x0a01
            r7.close()     // Catch:{ IOException -> 0x0a00 }
            r5 = 0
            goto L_0x0a05
        L_0x0a00:
            r0 = move-exception
        L_0x0a01:
            r5 = 0
            goto L_0x0a05
        L_0x0a03:
            r20 = r10
        L_0x0a05:
            r4.a()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r5 == 0) goto L_0x0ad8
            boolean r2 = r5.isEmpty()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r2 != 0) goto L_0x0ad5
            aucd r2 = r4.e     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aucj r2 = r2.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatt r2 = (defpackage.aatt) r2     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aate r2 = r2.K     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r2 == 0) goto L_0x0a1b
            goto L_0x0a1d
        L_0x0a1b:
            aate r2 = defpackage.aate.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0a1d:
            r3 = 5
            java.lang.Object r3 = r2.c(r3)     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aucd r3 = (defpackage.aucd) r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3.a((defpackage.aucj) r2)     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            java.util.Set r2 = r5.keySet()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0a30:
            boolean r6 = r2.hasNext()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r6 != 0) goto L_0x0a5d
            aucd r2 = r4.e     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r4 = r2.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r4 != 0) goto L_0x0a3d
            goto L_0x0a43
        L_0x0a3d:
            r2.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r4 = 0
            r2.c = r4     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0a43:
            aucj r2 = r2.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatt r2 = (defpackage.aatt) r2     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aucj r3 = r3.i()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aate r3 = (defpackage.aate) r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatt r4 = defpackage.aatt.P     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3.getClass()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r2.K = r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r3 = r2.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3 = r3 | 256(0x100, float:3.59E-43)
            r2.b = r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3 = 0
            goto L_0x0dc0
        L_0x0a5d:
            java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatk r7 = defpackage.aatk.e     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aucd r7 = r7.o()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r6 != 0) goto L_0x0a6c
            goto L_0x0a86
        L_0x0a6c:
            boolean r10 = r7.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r10 != 0) goto L_0x0a71
            goto L_0x0a77
        L_0x0a71:
            r7.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r10 = 0
            r7.c = r10     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0a77:
            aucj r10 = r7.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatk r10 = (defpackage.aatk) r10     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r6.getClass()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r11 = r10.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r12 = 1
            r11 = r11 | r12
            r10.a = r11     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r10.b = r6     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0a86:
            java.lang.Object r6 = r5.get(r6)     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            java.lang.Object r10 = r6.first     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r10 != 0) goto L_0x0a91
            goto L_0x0ab1
        L_0x0a91:
            java.lang.Object r10 = r6.first     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r11 = r7.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r11 != 0) goto L_0x0a9a
            goto L_0x0aa0
        L_0x0a9a:
            r7.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r11 = 0
            r7.c = r11     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0aa0:
            aucj r11 = r7.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatk r11 = (defpackage.aatk) r11     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r10.getClass()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r12 = r11.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r16 = 2
            r12 = r12 | 2
            r11.a = r12     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r11.c = r10     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0ab1:
            java.lang.Object r6 = r6.second     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r6 = r6.booleanValue()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r10 = r7.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r10 != 0) goto L_0x0abe
            goto L_0x0ac4
        L_0x0abe:
            r7.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r10 = 0
            r7.c = r10     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0ac4:
            aucj r10 = r7.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatk r10 = (defpackage.aatk) r10     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r11 = r10.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r12 = 4
            r11 = r11 | r12
            r10.a = r11     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r10.d = r6     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3.e((defpackage.aucd) r7)     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            goto L_0x0a30
        L_0x0ad5:
            r3 = 0
            goto L_0x0dc0
        L_0x0ad8:
            r3 = 0
            goto L_0x0dc0
        L_0x0adb:
            r0 = move-exception
            goto L_0x0ade
        L_0x0add:
            r0 = move-exception
        L_0x0ade:
            r20 = r10
            goto L_0x0c5c
        L_0x0ae2:
            r0 = move-exception
            r20 = r10
            goto L_0x0c61
        L_0x0ae7:
            r21 = r7
            r20 = r10
            aaxh r2 = new aaxh     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            android.content.Context r3 = r1.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aayc r4 = r1.d     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            java.lang.String r3 = "com.android.vending"
            aaxf r2 = r2.a(r3)     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r2 == 0) goto L_0x0b39
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            android.content.Context r4 = r1.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r3 = defpackage.aaza.a((android.content.Context) r4, (java.lang.String) r3)     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r2.i = r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aayx r3 = r1.e     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3.a()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            java.lang.String r4 = r2.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r4 == 0) goto L_0x0b36
            aucd r3 = r3.e     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r4 = 0
            aasm r2 = defpackage.aayx.a(r2, r4)     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r4 = r3.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r4 != 0) goto L_0x0b1b
            goto L_0x0b21
        L_0x0b1b:
            r3.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r4 = 0
            r3.c = r4     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0b21:
            aucj r3 = r3.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatt r3 = (defpackage.aatt) r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatt r4 = defpackage.aatt.P     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r2.getClass()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3.A = r2     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r2 = r3.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 | r4
            r3.a = r2     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3 = 0
            goto L_0x0dc0
        L_0x0b36:
            r3 = 0
            goto L_0x0dc0
        L_0x0b39:
            r3 = 0
            goto L_0x0dc0
        L_0x0b3c:
            r21 = r7
            r20 = r10
            r22.b()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3 = 0
            goto L_0x0dc0
        L_0x0b46:
            r21 = r7
            r20 = r10
            aayx r2 = r1.e     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aayp r3 = defpackage.aayq.a()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r2.a()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatp r4 = defpackage.aatp.f     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aucd r4 = r4.o()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r5 = r3.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r6 = r4.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r6 != 0) goto L_0x0b60
            goto L_0x0b66
        L_0x0b60:
            r4.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r6 = 0
            r4.c = r6     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0b66:
            aucj r6 = r4.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatp r6 = (defpackage.aatp) r6     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r7 = r6.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r10 = 1
            r7 = r7 | r10
            r6.a = r7     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r6.b = r5     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r5 = r3.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r7 = r7 | 2
            r6.a = r7     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r6.c = r5     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            java.lang.String r5 = r3.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r5 == 0) goto L_0x0b87
            r5.getClass()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r7 = r7 | 4
            r6.a = r7     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r6.d = r5     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0b87:
            byte[] r3 = r3.d     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r3 != 0) goto L_0x0b8c
            goto L_0x0baa
        L_0x0b8c:
            auay r3 = defpackage.auay.a((byte[]) r3)     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r5 = r4.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r5 != 0) goto L_0x0b95
            goto L_0x0b9b
        L_0x0b95:
            r4.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r5 = 0
            r4.c = r5     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0b9b:
            aucj r5 = r4.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatp r5 = (defpackage.aatp) r5     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3.getClass()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r6 = r5.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r6 = r6 | 8
            r5.a = r6     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r5.e = r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0baa:
            aucd r2 = r2.e     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r3 = r2.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r3 != 0) goto L_0x0bb1
            goto L_0x0bb7
        L_0x0bb1:
            r2.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3 = 0
            r2.c = r3     // Catch:{ Exception -> 0x0d9b, NoClassDefFoundError -> 0x0d99, IncompatibleClassChangeError -> 0x0d97, all -> 0x0e08 }
        L_0x0bb7:
            aucj r2 = r2.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatt r2 = (defpackage.aatt) r2     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aucj r3 = r4.i()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatp r3 = (defpackage.aatp) r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatt r4 = defpackage.aatt.P     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3.getClass()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r2.r = r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r3 = r2.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 | r4
            r2.a = r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3 = 0
            goto L_0x0dc0
        L_0x0bd2:
            r21 = r7
            r20 = r10
            android.content.Context r2 = r1.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r2 != 0) goto L_0x0bdf
            goto L_0x0c0f
        L_0x0bdf:
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            java.util.Locale r2 = r2.locale     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aayx r3 = r1.e     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3.a()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r2 == 0) goto L_0x0c0f
            aucd r3 = r3.e     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r4 = r3.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r4 != 0) goto L_0x0bf7
            goto L_0x0bfd
        L_0x0bf7:
            r3.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r4 = 0
            r3.c = r4     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0bfd:
            aucj r3 = r3.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatt r3 = (defpackage.aatt) r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatt r4 = defpackage.aatt.P     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r2.getClass()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r4 = r3.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r5 = 65536(0x10000, float:9.18355E-41)
            r4 = r4 | r5
            r3.a = r4     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3.p = r2     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0c0f:
            aayx r2 = r1.e     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aayc r3 = r1.d     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aayb r3 = r3.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            java.lang.String r4 = "device_country"
            java.lang.String r3 = r3.a(r4)     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r2.a()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r3 == 0) goto L_0x0c42
            aucd r2 = r2.e     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r4 = r2.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r4 != 0) goto L_0x0c27
            goto L_0x0c2d
        L_0x0c27:
            r2.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r4 = 0
            r2.c = r4     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0c2d:
            aucj r2 = r2.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatt r2 = (defpackage.aatt) r2     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatt r4 = defpackage.aatt.P     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3.getClass()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r4 = r2.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r5 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 | r5
            r2.a = r4     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r2.q = r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3 = 0
            goto L_0x0dc0
        L_0x0c42:
            r3 = 0
            goto L_0x0dc0
        L_0x0c45:
            r21 = r7
            r20 = r10
            r22.j()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3 = 0
            goto L_0x0dc0
        L_0x0c4f:
            r21 = r7
            r20 = r10
            r22.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3 = 0
            goto L_0x0dc0
        L_0x0c59:
            r0 = move-exception
            goto L_0x0c5c
        L_0x0c5b:
            r0 = move-exception
        L_0x0c5c:
            r2 = r0
        L_0x0c5d:
            r3 = 0
            goto L_0x0dae
        L_0x0c60:
            r0 = move-exception
        L_0x0c61:
            r2 = r0
        L_0x0c62:
            r3 = 0
            goto L_0x0dbb
        L_0x0c65:
            r21 = r7
            r20 = r10
            boolean r2 = defpackage.aaza.a()     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            if (r2 == 0) goto L_0x0d9d
            aaya r10 = new aaya     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            android.content.Context r3 = r1.c     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            aayh r4 = new aayh     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            r4.<init>()     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            aayx r7 = r1.e     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            r2 = r10
            r5 = r8
            r2.<init>(r3, r4, r5, r7)     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            aayx r2 = r1.e     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            java.util.List r3 = r10.a()     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            r2.a()     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            aayc r4 = r2.a     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            int r4 = r4.a()     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            aats r5 = defpackage.aats.e     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            aucd r5 = r5.o()     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            if (r3 == 0) goto L_0x0d5a
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r6 = 0
            r7 = 0
        L_0x0c9c:
            boolean r10 = r3.hasNext()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r10 == 0) goto L_0x0d1b
            java.lang.Object r10 = r3.next()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aaxz r10 = (defpackage.aaxz) r10     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r11 = r10.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r11 == 0) goto L_0x0d16
            java.lang.String r11 = r10.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r11 != 0) goto L_0x0cb1
            goto L_0x0cb9
        L_0x0cb1:
            int r11 = r11.length()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r6 = r6 + r11
            if (r6 <= r4) goto L_0x0cb9
            goto L_0x0d1b
        L_0x0cb9:
            int r7 = r7 + 1
            aatr r11 = defpackage.aatr.d     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aucd r11 = r11.o()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            java.lang.String r12 = r10.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r12 == 0) goto L_0x0ce7
            r16 = r3
            boolean r3 = r11.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r3 != 0) goto L_0x0ccc
        L_0x0ccb:
            goto L_0x0cd3
        L_0x0ccc:
            r11.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3 = 0
            r11.c = r3     // Catch:{ Exception -> 0x0d9b, NoClassDefFoundError -> 0x0d99, IncompatibleClassChangeError -> 0x0d97, all -> 0x0e08 }
            goto L_0x0ccb
        L_0x0cd3:
            aucj r3 = r11.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatr r3 = (defpackage.aatr) r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r12.getClass()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r17 = r4
            int r4 = r3.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r18 = 1
            r4 = r4 | 1
            r3.a = r4     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3.b = r12     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            goto L_0x0ceb
        L_0x0ce7:
            r16 = r3
            r17 = r4
        L_0x0ceb:
            byte[] r3 = r10.g     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r3 != 0) goto L_0x0cf0
            goto L_0x0d0e
        L_0x0cf0:
            auay r3 = defpackage.auay.a((byte[]) r3)     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r4 = r11.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r4 != 0) goto L_0x0cf9
            goto L_0x0cff
        L_0x0cf9:
            r11.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r4 = 0
            r11.c = r4     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0cff:
            aucj r4 = r11.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatr r4 = (defpackage.aatr) r4     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3.getClass()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r10 = r4.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r12 = 2
            r10 = r10 | r12
            r4.a = r10     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r4.c = r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0d0e:
            r5.f((defpackage.aucd) r11)     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3 = r16
            r4 = r17
            goto L_0x0c9c
        L_0x0d16:
            r16 = r3
            r17 = r4
            goto L_0x0c9c
        L_0x0d1b:
            long r3 = (long) r7     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r6 = r5.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r6 != 0) goto L_0x0d21
            goto L_0x0d27
        L_0x0d21:
            r5.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r6 = 0
            r5.c = r6     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
        L_0x0d27:
            aucj r6 = r5.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aats r6 = (defpackage.aats) r6     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r7 = r6.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r10 = 2
            r7 = r7 | r10
            r6.a = r7     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r6.c = r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aucd r2 = r2.e     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            boolean r3 = r2.c     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            if (r3 != 0) goto L_0x0d3a
            goto L_0x0d40
        L_0x0d3a:
            r2.c()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3 = 0
            r2.c = r3     // Catch:{ Exception -> 0x0d9b, NoClassDefFoundError -> 0x0d99, IncompatibleClassChangeError -> 0x0d97, all -> 0x0e08 }
        L_0x0d40:
            aucj r2 = r2.b     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatt r2 = (defpackage.aatt) r2     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aucj r3 = r5.i()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aats r3 = (defpackage.aats) r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            aatt r4 = defpackage.aatt.P     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3.getClass()     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r2.n = r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            int r3 = r2.a     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r2.a = r3     // Catch:{ Exception -> 0x0c60, NoClassDefFoundError -> 0x0c5b, IncompatibleClassChangeError -> 0x0c59, all -> 0x0e08 }
            r3 = 0
            goto L_0x0dc0
        L_0x0d5a:
            boolean r3 = r5.c     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            if (r3 != 0) goto L_0x0d5f
            goto L_0x0d65
        L_0x0d5f:
            r5.c()     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            r3 = 0
            r5.c = r3     // Catch:{ Exception -> 0x0d9b, NoClassDefFoundError -> 0x0d99, IncompatibleClassChangeError -> 0x0d97, all -> 0x0e08 }
        L_0x0d65:
            aucj r3 = r5.b     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            aats r3 = (defpackage.aats) r3     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            int r4 = r3.a     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            r6 = 1
            r4 = r4 | r6
            r3.a = r4     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            r3.b = r6     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            aucd r2 = r2.e     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            boolean r3 = r2.c     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            if (r3 != 0) goto L_0x0d79
            r3 = 0
            goto L_0x0d7f
        L_0x0d79:
            r2.c()     // Catch:{ Exception -> 0x0da3, NoClassDefFoundError -> 0x0da1, IncompatibleClassChangeError -> 0x0d9f, all -> 0x0e08 }
            r3 = 0
            r2.c = r3     // Catch:{ Exception -> 0x0d9b, NoClassDefFoundError -> 0x0d99, IncompatibleClassChangeError -> 0x0d97, all -> 0x0e08 }
        L_0x0d7f:
            aucj r2 = r2.b     // Catch:{ Exception -> 0x0d9b, NoClassDefFoundError -> 0x0d99, IncompatibleClassChangeError -> 0x0d97, all -> 0x0e08 }
            aatt r2 = (defpackage.aatt) r2     // Catch:{ Exception -> 0x0d9b, NoClassDefFoundError -> 0x0d99, IncompatibleClassChangeError -> 0x0d97, all -> 0x0e08 }
            aucj r4 = r5.i()     // Catch:{ Exception -> 0x0d9b, NoClassDefFoundError -> 0x0d99, IncompatibleClassChangeError -> 0x0d97, all -> 0x0e08 }
            aats r4 = (defpackage.aats) r4     // Catch:{ Exception -> 0x0d9b, NoClassDefFoundError -> 0x0d99, IncompatibleClassChangeError -> 0x0d97, all -> 0x0e08 }
            aatt r5 = defpackage.aatt.P     // Catch:{ Exception -> 0x0d9b, NoClassDefFoundError -> 0x0d99, IncompatibleClassChangeError -> 0x0d97, all -> 0x0e08 }
            r4.getClass()     // Catch:{ Exception -> 0x0d9b, NoClassDefFoundError -> 0x0d99, IncompatibleClassChangeError -> 0x0d97, all -> 0x0e08 }
            r2.n = r4     // Catch:{ Exception -> 0x0d9b, NoClassDefFoundError -> 0x0d99, IncompatibleClassChangeError -> 0x0d97, all -> 0x0e08 }
            int r4 = r2.a     // Catch:{ Exception -> 0x0d9b, NoClassDefFoundError -> 0x0d99, IncompatibleClassChangeError -> 0x0d97, all -> 0x0e08 }
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            r2.a = r4     // Catch:{ Exception -> 0x0d9b, NoClassDefFoundError -> 0x0d99, IncompatibleClassChangeError -> 0x0d97, all -> 0x0e08 }
            goto L_0x0dc0
        L_0x0d97:
            r0 = move-exception
            goto L_0x0dad
        L_0x0d99:
            r0 = move-exception
            goto L_0x0dad
        L_0x0d9b:
            r0 = move-exception
            goto L_0x0dba
        L_0x0d9d:
            r3 = 0
            goto L_0x0dc0
        L_0x0d9f:
            r0 = move-exception
            goto L_0x0dac
        L_0x0da1:
            r0 = move-exception
            goto L_0x0dac
        L_0x0da3:
            r0 = move-exception
            goto L_0x0db9
        L_0x0da5:
            r0 = move-exception
            goto L_0x0da8
        L_0x0da7:
            r0 = move-exception
        L_0x0da8:
            r21 = r7
            r20 = r10
        L_0x0dac:
            r3 = 0
        L_0x0dad:
            r2 = r0
        L_0x0dae:
            aayx r4 = r1.e     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            r4.a((java.lang.Throwable) r2)     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            goto L_0x0dc0
        L_0x0db4:
            r0 = move-exception
            r21 = r7
            r20 = r10
        L_0x0db9:
            r3 = 0
        L_0x0dba:
            r2 = r0
        L_0x0dbb:
            aayx r4 = r1.e     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            r4.a((java.lang.Exception) r2)     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
        L_0x0dc0:
            android.content.Context r2 = r1.c     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            java.lang.String r5 = "android.intent.action.BATTERY_CHANGED"
            r4.<init>(r5)     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            r5 = 0
            android.content.Intent r2 = r2.registerReceiver(r5, r4)     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            java.lang.String r4 = "plugged"
            r5 = -1
            int r2 = r2.getIntExtra(r4, r5)     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            r4 = 1
            if (r2 != r4) goto L_0x0dd9
        L_0x0dd8:
            goto L_0x0def
        L_0x0dd9:
            r4 = 2
            if (r2 == r4) goto L_0x0dd8
            r4 = 4
            if (r2 == r4) goto L_0x0dd8
            int r2 = r13.length     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            int r2 = r2 + r5
            r2 = r13[r2]     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            r4 = r21
            boolean r2 = r4.equals(r2)     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            if (r2 != 0) goto L_0x0def
            defpackage.azft.c()     // Catch:{ Exception -> 0x0e1e, all -> 0x0e08 }
            return
        L_0x0def:
            int r15 = r15 + 1
            r10 = r20
            r12 = 0
            goto L_0x0053
        L_0x0df6:
            aayx r2 = r1.e
            r2.a((long) r8)
            boolean r2 = r22.m()
            if (r2 == 0) goto L_0x0e31
        L_0x0e01:
            android.content.Context r2 = r1.c
            r3 = 0
            defpackage.aaza.a((android.content.Context) r2, (byte[]) r3)
            return
        L_0x0e08:
            r0 = move-exception
            r2 = r0
            aayx r3 = r1.e     // Catch:{ all -> 0x0e1b }
            r3.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0e1b }
            aayx r2 = r1.e
            r2.a((long) r8)
            boolean r2 = r22.m()
            if (r2 == 0) goto L_0x0e31
            goto L_0x0e01
        L_0x0e1b:
            r0 = move-exception
            r2 = r0
            goto L_0x0e34
        L_0x0e1e:
            r0 = move-exception
            r2 = r0
        L_0x0e20:
            aayx r3 = r1.e     // Catch:{ all -> 0x0e32 }
            r3.a((java.lang.Exception) r2)     // Catch:{ all -> 0x0e32 }
            aayx r2 = r1.e
            r2.a((long) r8)
            boolean r2 = r22.m()
            if (r2 == 0) goto L_0x0e31
            goto L_0x0e01
        L_0x0e31:
            return
        L_0x0e32:
            r0 = move-exception
            r2 = r0
        L_0x0e34:
            aayx r3 = r1.e
            r3.a((long) r8)
            boolean r3 = r22.m()
            if (r3 == 0) goto L_0x0e45
            android.content.Context r3 = r1.c
            r4 = 0
            defpackage.aaza.a((android.content.Context) r3, (byte[]) r4)
        L_0x0e45:
            goto L_0x0e47
        L_0x0e46:
            throw r2
        L_0x0e47:
            goto L_0x0e46
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aayu.a():void");
    }
}
