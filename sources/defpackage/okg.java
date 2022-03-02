package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: okg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class okg {
    static final ium a = ium.a("|");
    public static final /* synthetic */ int b = 0;
    private static final int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

    public static void b(Context context, HelpConfig helpConfig, okc okc) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 181;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        String F = helpConfig.F();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo2 = (olo) o.b;
        F.getClass();
        olo2.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        olo2.n = F;
        a(context, helpConfig, okc, o);
        olo olo3 = (olo) o.i();
    }

    public static void c(Context context, HelpConfig helpConfig, okc okc) {
        ThemeSettings themeSettings = helpConfig.A;
        int i = 193;
        if (themeSettings != null) {
            int i2 = themeSettings.a;
            if (!(i2 == 0 || i2 == 1)) {
                i = i2 != 2 ? 194 : 192;
            }
        } else {
            i = 194;
        }
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 182;
        int i3 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i3;
        olo.k = i - 1;
        olo.a = i3 | 1024;
        a(context, helpConfig, okc, o);
        olo olo2 = (olo) o.i();
    }

    public static void d(nzu nzu) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 108;
        int i = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i;
        olo.k = 161;
        olo.a = i | 1024;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void e(nzu nzu) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 176;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void f(nzu nzu) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 174;
        int i = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i;
        olo.k = 20;
        olo.a = i | 1024;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void g(nzu nzu) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 117;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void h(nzu nzu) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 161;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void i(nzu nzu) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 129;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void j(nzu nzu) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 54;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void k(nzu nzu) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 48;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void l(nzu nzu) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 145;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void m(nzu nzu) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 144;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("rtc_") : "rtc_".concat(valueOf);
    }

    public static void n(nzu nzu) {
        a(nzu, 33, 16, avmt.UNKNOWN_CONTACT_MODE);
    }

    public static void a(int i, int i2, Context context, HelpConfig helpConfig, okc okc) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = i - 1;
        int i3 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i3;
        olo.k = i2 - 1;
        olo.a = i3 | 1024;
        a(context, helpConfig, okc, o);
        olo olo2 = (olo) o.i();
    }

    public static void c(nzu nzu) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 97;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void e(nzu nzu, int i) {
        String str;
        HelpConfig f = nzu.f();
        if (f == null) {
            str = "";
        } else {
            str = f.F();
        }
        a(nzu, 173, i, (avmt) null, str);
    }

    public static void g(nzu nzu, int i) {
        a(nzu, i, 1, avmt.UNKNOWN_CONTACT_MODE);
    }

    public static void d(nzu nzu, int i) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 174;
        int i2 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i2;
        olo.k = i - 1;
        olo.a = i2 | 1024;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void f(nzu nzu, int i) {
        String str;
        HelpConfig f = nzu.f();
        if (f == null) {
            str = "";
        } else {
            str = f.F();
        }
        a(nzu, 174, i, (avmt) null, str);
    }

    public static void a(Context context, HelpConfig helpConfig, String str, okc okc) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 135;
        int i = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i;
        str.getClass();
        olo.a = i | FragmentTransaction.TRANSIT_EXIT_MASK;
        olo.n = str;
        a(context, helpConfig, okc, o);
        olo olo2 = (olo) o.i();
    }

    public static void b(Context context, HelpConfig helpConfig, okc okc, int i) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 187;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        String F = helpConfig.F();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo2 = (olo) o.b;
        F.getClass();
        int i2 = olo2.a | FragmentTransaction.TRANSIT_EXIT_MASK;
        olo2.a = i2;
        olo2.n = F;
        olo2.k = i - 1;
        olo2.a = i2 | 1024;
        a(context, helpConfig, okc, o);
        olo olo3 = (olo) o.i();
    }

    public static void c(nzu nzu, int i) {
        String str;
        HelpConfig f = nzu.f();
        if (f == null) {
            str = "";
        } else {
            str = f.G();
        }
        a(nzu, 181, i, (avmt) null, str);
    }

    public static void a(Context context, HelpConfig helpConfig, okc okc) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 134;
        int i = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i;
        String str = helpConfig.V;
        if (str != null) {
            str.getClass();
            olo.a = i | FragmentTransaction.TRANSIT_EXIT_MASK;
            olo.n = str;
        }
        a(context, helpConfig, okc, o);
        olo olo2 = (olo) o.i();
    }

    public static void c(nzu nzu, avmt avmt) {
        String str;
        HelpConfig f = nzu.f();
        if (f == null) {
            str = "";
        } else {
            str = f.F();
        }
        a(nzu, 172, 21, avmt, str);
    }

    public static void c(nzu nzu, String str) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 168;
        int i = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i;
        str.getClass();
        olo.a = i | FragmentTransaction.TRANSIT_EXIT_MASK;
        olo.n = str;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void b(nzu nzu) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 140;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void a(Context context, HelpConfig helpConfig, okc okc, int i) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 75;
        int i2 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i2;
        olo.k = i - 1;
        olo.a = i2 | 1024;
        a(context, helpConfig, okc, o);
        olo olo2 = (olo) o.i();
    }

    public static void b(nzu nzu, int i) {
        String str;
        HelpConfig f = nzu.f();
        if (f == null) {
            str = "";
        } else {
            str = f.G();
        }
        a(nzu, 180, i, (avmt) null, str);
    }

    public static void a(Context context, HelpConfig helpConfig, okc okc, int i, long j) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 49;
        int i2 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i2;
        int i3 = i - 1;
        if (i != 0) {
            olo.k = i3;
            int i4 = i2 | 1024;
            olo.a = i4;
            olo.a = i4 | 262144;
            olo.q = j;
            a(context, helpConfig, okc, o);
            olo olo2 = (olo) o.i();
            return;
        }
        throw null;
    }

    public static void b(nzu nzu, int i, avmt avmt) {
        a(nzu, i, 1, avmt);
    }

    public static void b(nzu nzu, int i, String str) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = i - 1;
        int i2 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i2;
        str.getClass();
        int i3 = i2 | FragmentTransaction.TRANSIT_EXIT_MASK;
        olo.a = i3;
        olo.n = str;
        olo.x = 8;
        olo.a = i3 | 536870912;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    private static void a(Context context, HelpConfig helpConfig, okc okc, aucd aucd) {
        a(aucd, context);
        a(aucd, helpConfig);
        axmv.c();
        new Thread(new okf(helpConfig, aucd, okc)).start();
        axmv.c();
    }

    public static void b(nzu nzu, long j) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 177;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.b |= 32;
        olo.F = j;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void a(Context context, HelpConfig helpConfig, okc okc, avmt avmt) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 187;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        String F = helpConfig.F();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo2 = (olo) o.b;
        F.getClass();
        int i = olo2.a | FragmentTransaction.TRANSIT_EXIT_MASK;
        olo2.a = i;
        olo2.n = F;
        olo2.k = 207;
        olo2.a = i | 1024;
        if (avmt != avmt.UNKNOWN_CONTACT_MODE) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo3 = (olo) o.b;
            olo3.p = avmt.i;
            olo3.a |= 131072;
        }
        a(context, helpConfig, okc, o);
        olo olo4 = (olo) o.i();
    }

    public static void b(nzu nzu, avmt avmt) {
        String str;
        HelpConfig f = nzu.f();
        if (f == null) {
            str = "";
        } else {
            str = f.F();
        }
        a(nzu, 172, 22, avmt, str);
    }

    public static void b(nzu nzu, String str) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 137;
        int i = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i;
        str.getClass();
        olo.a = i | FragmentTransaction.TRANSIT_EXIT_MASK;
        olo.n = str;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void a(Context context, HelpConfig helpConfig, okc okc, boolean z) {
        int i;
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 131;
        int i2 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i2;
        if (!z) {
            i = 22;
        } else {
            i = 21;
        }
        olo.k = i - 1;
        int i3 = i2 | 1024;
        olo.a = i3;
        String str = helpConfig.U;
        if (str != null) {
            str.getClass();
            olo.a = i3 | FragmentTransaction.TRANSIT_ENTER_MASK;
            olo.m = str;
        }
        a(context, helpConfig, okc, o);
        olo olo2 = (olo) o.i();
    }

    public static void a(aucd aucd, Context context) {
        if (((olo) aucd.b).t <= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            olo olo = (olo) aucd.b;
            olo olo2 = olo.I;
            olo.a |= 16777216;
            olo.t = currentTimeMillis;
        }
        if (context != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            int i = 61;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type == 1) {
                    i = 51;
                } else {
                    if (type == 0) {
                        int subtype = activeNetworkInfo.getSubtype();
                        int[] iArr = c;
                        if (subtype < iArr.length) {
                            i = iArr[subtype];
                        }
                    }
                    i = 1;
                }
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            olo olo3 = (olo) aucd.b;
            int i2 = i - 1;
            olo olo4 = olo.I;
            if (i != 0) {
                olo3.s = i2;
                olo3.a |= 8388608;
                boolean z = !jkf.a(context);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                olo olo5 = (olo) aucd.b;
                olo5.a |= Integer.MIN_VALUE;
                olo5.z = z;
                int i3 = ModuleManager.get(context).getCurrentModuleApk().apkVersionCode;
                if (hxj.b != i3) {
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    olo olo6 = (olo) aucd.b;
                    olo6.a |= 134217728;
                    olo6.w = i3;
                }
            } else {
                throw null;
            }
        }
        int i4 = hxj.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        olo olo7 = (olo) aucd.b;
        olo olo8 = olo.I;
        olo7.a |= 67108864;
        olo7.v = i4;
    }

    public static void a(aucd aucd, HelpConfig helpConfig) {
        if (!TextUtils.isEmpty(helpConfig.b)) {
            String str = helpConfig.b;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            olo olo = (olo) aucd.b;
            olo olo2 = olo.I;
            str.getClass();
            olo.a |= 2;
            olo.d = str;
        }
        if (helpConfig.g()) {
            String a2 = myo.a(helpConfig.d);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            olo olo3 = (olo) aucd.b;
            olo olo4 = olo.I;
            a2.getClass();
            olo3.a |= 4;
            olo3.e = a2;
        }
        if (helpConfig.d()) {
            String str2 = helpConfig.c;
            if (str2 != null) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                olo olo5 = (olo) aucd.b;
                olo olo6 = olo.I;
                str2.getClass();
                olo5.a |= 8;
                olo5.f = str2;
            } else {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                olo olo7 = (olo) aucd.b;
                olo olo8 = olo.I;
                olo7.a &= -9;
                olo7.f = olo.I.f;
            }
        }
        if ((((olo) aucd.b).a & 64) == 0 && !TextUtils.isEmpty(helpConfig.e)) {
            String str3 = helpConfig.e;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            olo olo9 = (olo) aucd.b;
            olo olo10 = olo.I;
            str3.getClass();
            olo9.a |= 64;
            olo9.i = str3;
        }
        int i = helpConfig.D;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        olo olo11 = (olo) aucd.b;
        olo olo12 = olo.I;
        olo11.a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        olo11.y = i;
    }

    public static void a(String str, String str2, Context context, HelpConfig helpConfig, okc okc) {
        aucd o = avmn.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avmn avmn = (avmn) o.b;
        avmn.b = 2;
        avmn.a |= 1;
        avmn avmn2 = (avmn) o.i();
        aucd o2 = avmq.h.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avmq avmq = (avmq) o2.b;
        str.getClass();
        avmq.a |= 1;
        avmq.d = str;
        aufc a2 = augk.a(System.currentTimeMillis());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avmq avmq2 = (avmq) o2.b;
        a2.getClass();
        avmq2.e = a2;
        int i = avmq2.a | 2;
        avmq2.a = i;
        if (str2 != null) {
            str2.getClass();
            avmq2.b = 3;
            avmq2.c = str2;
        }
        avmq2.f = 3;
        int i2 = i | 16;
        avmq2.a = i2;
        if (avmn2 != null) {
            avmn2.getClass();
            avmq2.g = avmn2;
            avmq2.a = i2 | 32;
        }
        aucd o3 = olo.I.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        olo olo = (olo) o3.b;
        avmq avmq3 = (avmq) o2.i();
        avmq3.getClass();
        olo.H = avmq3;
        olo.b |= 128;
        axnj.c();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        olo olo2 = (olo) o3.b;
        olo2.j = 189;
        int i3 = olo2.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo2.a = i3;
        olo2.k = 211;
        olo2.a = i3 | 1024;
        a(context, helpConfig, okc, o3);
        olo olo3 = (olo) o3.i();
    }

    public static void a(nzu nzu) {
        g(nzu, 127);
    }

    public static void a(nzu nzu, int i) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 178;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.b |= 64;
        olo.G = i;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void a(nzu nzu, int i, int i2, avmt avmt) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = i - 1;
        int i3 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i3;
        olo.k = i2 - 1;
        int i4 = i3 | 1024;
        olo.a = i4;
        olo.p = avmt.i;
        olo.a = i4 | 131072;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    private static void a(nzu nzu, int i, int i2, avmt avmt, String str) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = i - 1;
        int i3 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i3;
        olo.k = i2 - 1;
        int i4 = i3 | 1024;
        olo.a = i4;
        if (avmt != null) {
            olo.p = avmt.i;
            olo.a = i4 | 131072;
        }
        if (!TextUtils.isEmpty(str)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo2 = (olo) o.b;
            str.getClass();
            olo2.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            olo2.n = str;
        }
        a(nzu, o, (jiq) jiu.a);
        olo olo3 = (olo) o.i();
    }

    public static void a(nzu nzu, int i, long j) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 86;
        int i2 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i2;
        olo.k = i - 1;
        int i3 = i2 | 1024;
        olo.a = i3;
        olo.a = i3 | 262144;
        olo.q = j;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void a(nzu nzu, int i, long j, avmw avmw, String str, String str2, int i2) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 49;
        int i3 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i3;
        int i4 = i - 1;
        if (i != 0) {
            olo.k = i4;
            int i5 = i3 | 1024;
            olo.a = i5;
            olo.a = i5 | 262144;
            olo.q = j;
            a(nzu, o, (jiq) jiu.a, avmw, i2, str, str2);
            olo olo2 = (olo) o.i();
            return;
        }
        throw null;
    }

    public static void a(nzu nzu, int i, avmt avmt) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 10;
        int i2 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i2;
        olo.k = i - 1;
        int i3 = i2 | 1024;
        olo.a = i3;
        olo.p = avmt.i;
        olo.a = i3 | 131072;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void a(nzu nzu, int i, avmt avmt, int i2) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = i - 1;
        int i3 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i3;
        olo.p = avmt.i;
        int i4 = i3 | 131072;
        olo.a = i4;
        if (i2 >= 0) {
            olo.a = i4 | 16384;
            olo.o = i2 + 1;
        }
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void a(nzu nzu, int i, avmw avmw, int i2, String str, String str2) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 1;
        int i3 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i3;
        if (i != 0) {
            olo.k = i - 1;
            olo.a = i3 | 1024;
        }
        a(nzu, o, (jiq) jiu.a, avmw, i2, str, str2);
        olo olo2 = (olo) o.i();
    }

    public static void a(nzu nzu, int i, String str) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = i - 1;
        int i2 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i2;
        olo.x = 8;
        olo.a = i2 | 536870912;
        if (!TextUtils.isEmpty(str)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo2 = (olo) o.b;
            str.getClass();
            olo2.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            olo2.n = str;
        }
        a(nzu, o, (jiq) jiu.a);
        olo olo3 = (olo) o.i();
    }

    public static void a(nzu nzu, int i, String str, int i2, String str2) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        int i3 = i - 1;
        if (i != 0) {
            olo.j = i3;
            int i4 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            olo.a = i4;
            str.getClass();
            int i5 = i4 | FragmentTransaction.TRANSIT_EXIT_MASK;
            olo.a = i5;
            olo.n = str;
            if (i2 >= 0) {
                i5 |= 16384;
                olo.a = i5;
                olo.o = i2 + 1;
            }
            str2.getClass();
            olo.a = i5 | FragmentTransaction.TRANSIT_ENTER_MASK;
            olo.m = str2;
            a(nzu, o, (jiq) jiu.a);
            olo olo2 = (olo) o.i();
            return;
        }
        throw null;
    }

    public static void a(nzu nzu, int i, String str, int i2, String str2, boolean z) {
        int i3;
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        int i4 = i - 1;
        if (i != 0) {
            olo.j = i4;
            int i5 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            olo.a = i5;
            if (!z) {
                i3 = 22;
            } else {
                i3 = 21;
            }
            olo.k = i3 - 1;
            int i6 = i5 | 1024;
            olo.a = i6;
            str.getClass();
            int i7 = i6 | FragmentTransaction.TRANSIT_EXIT_MASK;
            olo.a = i7;
            olo.n = str;
            if (i2 >= 0) {
                olo.a = i7 | 16384;
                olo.o = i2 + 1;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                olo olo2 = (olo) o.b;
                str2.getClass();
                olo2.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                olo2.m = str2;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo3 = (olo) o.b;
            olo3.x = 8;
            olo3.a |= 536870912;
            a(nzu, o, (jiq) jiu.a);
            olo olo4 = (olo) o.i();
            return;
        }
        throw null;
    }

    public static void a(nzu nzu, int i, List list, String str) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = i - 1;
        int i2 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i2;
        str.getClass();
        olo.a = i2 | FragmentTransaction.TRANSIT_ENTER_MASK;
        olo.m = str;
        String a2 = a.a((Iterable) anda.a(list, oke.a));
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo2 = (olo) o.b;
        a2.getClass();
        olo2.a |= 2048;
        olo2.l = a2;
        a(nzu, o, (jiq) jiu.a);
        olo olo3 = (olo) o.i();
    }

    public static void a(nzu nzu, long j) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 175;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.b |= 32;
        olo.F = j;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void a(nzu nzu, Account account) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 113;
        int i = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i;
        if (account != null) {
            olo.k = 162;
            olo.a = i | 1024;
            String a2 = myo.a(account);
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo2 = (olo) o.b;
            a2.getClass();
            olo2.a |= 4;
            olo2.e = a2;
        } else {
            olo.k = 163;
            olo.a = i | 1024;
        }
        a(nzu, o, (jiq) jiu.a);
        olo olo3 = (olo) o.i();
    }

    static void a(nzu nzu, aucd aucd, jiq jiq) {
        a(nzu.k(), nzu.f(), nzu.h(), aucd);
    }

    static void a(nzu nzu, aucd aucd, jiq jiq, avmw avmw, int i, String str, String str2) {
        int i2 = avmw.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        olo olo = (olo) aucd.b;
        olo olo2 = olo.I;
        olo.a |= 2097152;
        olo.r = i2;
        if (avmw == avmw.HELP_ANSWER_FRAGMENT) {
            if (i >= 0) {
                int i3 = i + 1;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                olo olo3 = (olo) aucd.b;
                olo3.a |= 16384;
                olo3.o = i3;
            }
            if (!TextUtils.isEmpty(str)) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                olo olo4 = (olo) aucd.b;
                str.getClass();
                olo4.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                olo4.m = str;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                olo olo5 = (olo) aucd.b;
                str2.getClass();
                olo5.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                olo5.n = str2;
            }
        }
        a((Context) nzu, nzu.f(), nzu.h(), aucd);
    }

    public static void a(nzu nzu, avmt avmt) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 116;
        int i = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i;
        olo.p = avmt.i;
        olo.a = 131072 | i;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void a(nzu nzu, avmw avmw, int i, String str, String str2) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 9;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a(nzu, o, (jiq) jiu.a, avmw, i, str, str2);
        olo olo2 = (olo) o.i();
    }

    public static void a(nzu nzu, CharSequence charSequence) {
        aucd o = olo.I.o();
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo = (olo) o.b;
            charSequence2.getClass();
            olo.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            olo.m = charSequence2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo2 = (olo) o.b;
        olo2.j = 167;
        olo2.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a(nzu, o, (jiq) jiu.a);
        olo olo3 = (olo) o.i();
    }

    public static void a(nzu nzu, String str) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 138;
        int i = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i;
        str.getClass();
        olo.a = i | FragmentTransaction.TRANSIT_EXIT_MASK;
        olo.n = str;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }

    public static void a(nzu nzu, String str, String str2) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 55;
        int i = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i;
        str.getClass();
        olo.a = i | FragmentTransaction.TRANSIT_EXIT_MASK;
        olo.n = str;
        if (!TextUtils.isEmpty(str2)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo2 = (olo) o.b;
            str2.getClass();
            olo2.a |= 2048;
            olo2.l = str2;
        }
        a(nzu, o, (jiq) jiu.a);
        olo olo3 = (olo) o.i();
    }

    public static void a(nzu nzu, List list, omv omv) {
        int i;
        String str;
        if (omv != null) {
            String str2 = omv.c;
            int i2 = omv.a;
            if (i2 == 0) {
                i = 25;
            } else {
                i = 32;
            }
            aucd o = olo.I.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo = (olo) o.b;
            olo.j = i - 1;
            int i3 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            olo.a = i3;
            if (i2 != 0) {
                str = omv.d;
            } else {
                str = str2;
            }
            if (str != null) {
                str.getClass();
                i3 |= FragmentTransaction.TRANSIT_EXIT_MASK;
                olo.a = i3;
                olo.n = str;
            }
            if (str2 != null) {
                str2.getClass();
                olo.a = i3 | FragmentTransaction.TRANSIT_ENTER_MASK;
                olo.m = str2;
            }
            aucd o2 = olo.I.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            olo olo2 = (olo) o2.b;
            olo2.j = 47;
            int i4 = olo2.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            olo2.a = i4;
            if (str2 != null) {
                str2.getClass();
                olo2.a = i4 | FragmentTransaction.TRANSIT_ENTER_MASK;
                olo2.m = str2;
            }
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                omv omv2 = (omv) list.get(i5);
                int i6 = omv2.a;
                if (i6 == 0) {
                    arrayList.add(omv2.c);
                } else if (i6 == 1 || i6 == 2) {
                    arrayList.add(omv2.d);
                }
                if (omv2.equals(omv)) {
                    int i7 = i5 + 1;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    olo olo3 = (olo) o.b;
                    olo3.a |= 16384;
                    olo3.o = i7;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    olo olo4 = (olo) o2.b;
                    int i8 = olo4.a | 16384;
                    olo4.a = i8;
                    olo4.o = i7;
                    olo4.k = (i6 != 0 ? 32 : 25) - 1;
                    olo4.a = i8 | 1024;
                }
            }
            String a2 = a.a((Iterable) arrayList);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            olo olo5 = (olo) o2.b;
            a2.getClass();
            olo5.a |= 2048;
            olo5.l = a2;
            a(nzu, o, (jiq) jiu.a);
            a(nzu, o2, (jiq) jiu.a);
            Arrays.asList(new olo[]{(olo) o.i(), (olo) o2.i()});
        }
    }

    public static void a(nzu nzu, oab oab) {
        a(nzu, 24, oab.e, -1, "");
    }

    public static void a(nzu nzu, boolean z) {
        int i;
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 62;
        int i2 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i2;
        if (!z) {
            i = 22;
        } else {
            i = 21;
        }
        olo.k = i - 1;
        olo.a = i2 | 1024;
        a(nzu, o, (jiq) jiu.a);
        olo olo2 = (olo) o.i();
    }
}
