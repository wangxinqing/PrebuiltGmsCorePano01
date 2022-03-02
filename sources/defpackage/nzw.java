package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;
import java.util.List;

/* renamed from: nzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzw {
    public Context a;
    public HelpConfig b;
    public String c;
    public String d;
    public List e;
    public String f;
    public String g;
    public olw[] h;
    public String i;
    public String j;
    public String k;
    public olt l;
    public String m;
    public String n;
    public String o;
    public Long p;
    public boolean q;
    public olh r;
    public old s;
    public okw t;
    public String u;
    public List v;

    public static nzw a() {
        return new nzw();
    }

    public final olv b() {
        String str;
        String str2;
        if (this.a != null) {
            HelpConfig helpConfig = this.b;
            if (helpConfig == null) {
                throw new IllegalStateException("The HelpConfig is null, but must be set.");
            } else if (!TextUtils.isEmpty(helpConfig.b)) {
                aucd o2 = olv.h.o();
                String l2 = !TextUtils.isEmpty(this.d) ? this.d : axmj.l();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                olv olv = (olv) o2.b;
                l2.getClass();
                olv.a |= 8;
                olv.e = l2;
                HelpConfig helpConfig2 = this.b;
                String str3 = helpConfig2.b;
                if (!TextUtils.isEmpty(helpConfig2.L)) {
                    str3 = this.b.L;
                }
                aucd o3 = olw.d.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                olw olw = (olw) o3.b;
                str3.getClass();
                olw.a |= 1;
                olw.b = str3;
                try {
                    PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str3, 0);
                    if (TextUtils.isEmpty(packageInfo.versionName)) {
                        str2 = Integer.toString(packageInfo.versionCode);
                    } else {
                        str2 = packageInfo.versionName;
                    }
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    olw olw2 = (olw) o3.b;
                    str2.getClass();
                    olw2.a |= 2;
                    olw2.c = str2;
                } catch (PackageManager.NameNotFoundException e2) {
                    String name = e2.getClass().getName();
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 22 + String.valueOf(str3).length());
                    sb.append(name);
                    sb.append(": ");
                    sb.append(str3);
                    sb.append(" is not a valid pkg.");
                    Log.e("gH_HelpMobileReqBuilder", sb.toString());
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    olw olw3 = (olw) o3.b;
                    "UNKNOWN".getClass();
                    olw3.a |= 2;
                    olw3.c = "UNKNOWN";
                }
                olw olw4 = (olw) o3.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                olv olv2 = (olv) o2.b;
                olw4.getClass();
                olv2.b = olw4;
                olv2.a |= 1;
                aucd o4 = olx.g.o();
                String networkOperatorName = ((TelephonyManager) this.a.getSystemService("phone")).getNetworkOperatorName();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                olx olx = (olx) o4.b;
                networkOperatorName.getClass();
                olx.a |= 8;
                olx.e = networkOperatorName;
                String str4 = Build.MODEL;
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                olx olx2 = (olx) o4.b;
                str4.getClass();
                olx2.a |= 2;
                olx2.c = str4;
                String str5 = Build.DEVICE;
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                olx olx3 = (olx) o4.b;
                str5.getClass();
                olx3.a |= 64;
                olx3.f = str5;
                String a2 = oal.a();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                olx olx4 = (olx) o4.b;
                a2.getClass();
                olx4.a |= 1;
                olx4.b = a2;
                String str6 = Build.VERSION.RELEASE;
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                olx olx5 = (olx) o4.b;
                str6.getClass();
                olx5.a |= 4;
                olx5.d = str6;
                olx olx6 = (olx) o4.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                olv olv3 = (olv) o2.b;
                olx6.getClass();
                olv3.c = olx6;
                olv3.a |= 2;
                aucd o5 = oma.q.o();
                if (this.b.d() && (str = this.b.c) != null) {
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    oma oma = (oma) o5.b;
                    str.getClass();
                    oma.a |= 4;
                    oma.c = str;
                }
                if (!TextUtils.isEmpty(this.b.e)) {
                    String str7 = this.b.e;
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    oma oma2 = (oma) o5.b;
                    str7.getClass();
                    oma2.a |= 8;
                    oma2.d = str7;
                }
                List a3 = this.b.a(this.a);
                if (a3 != null) {
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    oma oma3 = (oma) o5.b;
                    if (!oma3.e.a()) {
                        oma3.e = aucj.a(oma3.e);
                    }
                    auab.a((Iterable) a3, (List) oma3.e);
                }
                if (!TextUtils.isEmpty(this.c)) {
                    String trim = this.c.trim();
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    oma oma4 = (oma) o5.b;
                    trim.getClass();
                    oma4.a |= 1;
                    oma4.b = trim;
                }
                if (this.e != null) {
                    aucd o6 = olu.b.o();
                    List list = this.e;
                    if (o6.c) {
                        o6.c();
                        o6.c = false;
                    }
                    olu olu = (olu) o6.b;
                    if (!olu.a.a()) {
                        olu.a = aucj.a(olu.a);
                    }
                    auab.a((Iterable) list, (List) olu.a);
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    oma oma5 = (oma) o5.b;
                    olu olu2 = (olu) o6.i();
                    olu2.getClass();
                    oma5.f = olu2;
                    oma5.a |= 16;
                }
                if (!TextUtils.isEmpty(this.j)) {
                    aucd o7 = ols.e.o();
                    String str8 = this.j;
                    if (o7.c) {
                        o7.c();
                        o7.c = false;
                    }
                    ols ols = (ols) o7.b;
                    str8.getClass();
                    ols.a |= 2;
                    ols.c = str8;
                    if (!TextUtils.isEmpty(this.i)) {
                        String str9 = this.i;
                        if (o7.c) {
                            o7.c();
                            o7.c = false;
                        }
                        ols ols2 = (ols) o7.b;
                        str9.getClass();
                        ols2.a |= 1;
                        ols2.b = str9;
                    }
                    if (!TextUtils.isEmpty(this.k)) {
                        String str10 = this.k;
                        if (o7.c) {
                            o7.c();
                            o7.c = false;
                        }
                        ols ols3 = (ols) o7.b;
                        str10.getClass();
                        ols3.a |= 4;
                        ols3.d = str10;
                    }
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    oma oma6 = (oma) o5.b;
                    ols ols4 = (ols) o7.i();
                    ols4.getClass();
                    oma6.g = ols4;
                    oma6.a |= 32;
                }
                if (this.n != null) {
                    aucd o8 = olr.g.o();
                    String str11 = this.n;
                    if (o8.c) {
                        o8.c();
                        o8.c = false;
                    }
                    olr olr = (olr) o8.b;
                    str11.getClass();
                    olr.a |= 1;
                    olr.b = str11;
                    if (!TextUtils.isEmpty(this.o)) {
                        String str12 = this.o;
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        olr olr2 = (olr) o8.b;
                        str12.getClass();
                        olr2.a |= 8;
                        olr2.e = str12;
                    }
                    Long l3 = this.p;
                    if (l3 != null) {
                        long longValue = l3.longValue();
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        olr olr3 = (olr) o8.b;
                        olr3.a |= 2;
                        olr3.c = longValue;
                    }
                    if (this.q) {
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        olr olr4 = (olr) o8.b;
                        olr4.a |= 4;
                        olr4.d = true;
                    }
                    if (!TextUtils.isEmpty(this.m)) {
                        String str13 = this.m;
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        olr olr5 = (olr) o8.b;
                        str13.getClass();
                        olr5.a |= 16;
                        olr5.f = str13;
                    }
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    oma oma7 = (oma) o5.b;
                    olr olr6 = (olr) o8.i();
                    olr6.getClass();
                    oma7.h = olr6;
                    oma7.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                if (!TextUtils.isEmpty(this.u)) {
                    String str14 = this.u;
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    oma oma8 = (oma) o5.b;
                    str14.getClass();
                    oma8.a |= 524288;
                    oma8.o = str14;
                }
                if (!TextUtils.isEmpty(this.f)) {
                    String str15 = this.f;
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    oma oma9 = (oma) o5.b;
                    str15.getClass();
                    oma9.a |= 16384;
                    oma9.n = str15;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    if (!TextUtils.isEmpty(this.g)) {
                        String str16 = this.g;
                        if (o5.c) {
                            o5.c();
                            o5.c = false;
                        }
                        oma oma10 = (oma) o5.b;
                        str16.getClass();
                        oma10.a |= 1048576;
                        oma10.p = str16;
                    }
                    if (this.r != null) {
                        aucd o9 = olq.e.o();
                        olh olh = this.r;
                        if (o9.c) {
                            o9.c();
                            o9.c = false;
                        }
                        olq olq = (olq) o9.b;
                        olh.getClass();
                        olq.d = olh;
                        olq.a |= 4;
                        if (o5.c) {
                            o5.c();
                            o5.c = false;
                        }
                        oma oma11 = (oma) o5.b;
                        olq olq2 = (olq) o9.i();
                        olq2.getClass();
                        oma11.m = olq2;
                        oma11.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                    } else if (this.s != null) {
                        aucd o10 = olq.e.o();
                        old old = this.s;
                        if (o10.c) {
                            o10.c();
                            o10.c = false;
                        }
                        olq olq3 = (olq) o10.b;
                        old.getClass();
                        olq3.b = old;
                        olq3.a |= 1;
                        if (o5.c) {
                            o5.c();
                            o5.c = false;
                        }
                        oma oma12 = (oma) o5.b;
                        olq olq4 = (olq) o10.i();
                        olq4.getClass();
                        oma12.m = olq4;
                        oma12.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                    } else if (this.t != null) {
                        aucd o11 = olq.e.o();
                        okw okw = this.t;
                        if (o11.c) {
                            o11.c();
                            o11.c = false;
                        }
                        olq olq5 = (olq) o11.b;
                        okw.getClass();
                        olq5.c = okw;
                        olq5.a |= 2;
                        if (o5.c) {
                            o5.c();
                            o5.c = false;
                        }
                        oma oma13 = (oma) o5.b;
                        olq olq6 = (olq) o11.i();
                        olq6.getClass();
                        oma13.m = olq6;
                        oma13.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                    }
                    olt olt = this.l;
                    if (olt != null) {
                        if (o5.c) {
                            o5.c();
                            o5.c = false;
                        }
                        oma oma14 = (oma) o5.b;
                        olt.getClass();
                        oma14.i = olt;
                        oma14.a |= 512;
                    }
                    if (this.v != null) {
                        aucd o12 = olp.b.o();
                        List list2 = this.v;
                        if (o12.c) {
                            o12.c();
                            o12.c = false;
                        }
                        olp olp = (olp) o12.b;
                        if (!olp.a.a()) {
                            olp.a = aucj.a(olp.a);
                        }
                        auab.a((Iterable) list2, (List) olp.a);
                        if (o5.c) {
                            o5.c();
                            o5.c = false;
                        }
                        oma oma15 = (oma) o5.b;
                        olp olp2 = (olp) o12.i();
                        olp2.getClass();
                        oma15.l = olp2;
                        oma15.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                    }
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    oma oma16 = (oma) o5.b;
                    int i2 = oma16.a | 1024;
                    oma16.a = i2;
                    oma16.j = 201216073;
                    "20.12.16 (080306-{{cl}})".getClass();
                    oma16.a = i2 | 2048;
                    oma16.k = "20.12.16 (080306-{{cl}})";
                    oma oma17 = (oma) o5.i();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    olv olv4 = (olv) o2.b;
                    oma17.getClass();
                    olv4.d = oma17;
                    olv4.a |= 4;
                    aucd o13 = oly.b.o();
                    olw[] olwArr = this.h;
                    if (olwArr != null) {
                        List asList = Arrays.asList(olwArr);
                        if (o13.c) {
                            o13.c();
                            o13.c = false;
                        }
                        oly oly = (oly) o13.b;
                        if (!oly.a.a()) {
                            oly.a = aucj.a(oly.a);
                        }
                        auab.a((Iterable) asList, (List) oly.a);
                    }
                    oly oly2 = (oly) o13.i();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    olv olv5 = (olv) o2.b;
                    oly2.getClass();
                    olv5.f = oly2;
                    olv5.a |= 16;
                    if (axpy.b()) {
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        olv olv6 = (olv) o2.b;
                        olv6.g = 6;
                        olv6.a |= 32;
                    }
                    return (olv) o2.i();
                }
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                oma oma18 = (oma) o5.b;
                throw null;
            } else {
                throw new IllegalStateException("The app package name is empty, but must be set.");
            }
        } else {
            throw new IllegalStateException("The context is null, but must be set.");
        }
    }
}
