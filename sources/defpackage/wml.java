package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: wml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wml {
    public static final Random a = new Random();
    private static wml b;

    public static synchronized wml a() {
        wml wml;
        synchronized (wml.class) {
            if (b == null) {
                wmm.a();
                if (wmk.a == null) {
                    wmk.a = new wmk();
                }
                b = new wml();
            }
            wml = b;
        }
        return wml;
    }

    public static int b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static xnv c(int i, long j) {
        aucd o = xnv.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xnv xnv = (xnv) o.b;
        xnv.b = i - 1;
        int i2 = xnv.a | 1;
        xnv.a = i2;
        xnv.a = i2 | 2;
        xnv.c = j;
        return (xnv) o.i();
    }

    public static xns d(int i, long j) {
        aucd o = xns.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xns xns = (xns) o.b;
        xns.b = i - 1;
        int i2 = xns.a | 1;
        xns.a = i2;
        xns.a = i2 | 2;
        xns.c = j;
        return (xns) o.i();
    }

    public static xmc b(int i, long j) {
        aucd o = xmc.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xmc xmc = (xmc) o.b;
        xmc.b = i - 1;
        int i2 = xmc.a | 1;
        xmc.a = i2;
        xmc.a = i2 | 2;
        xmc.c = j;
        return (xmc) o.i();
    }

    public static xoa a(Context context, String str, String str2) {
        return a(context, str, str2, 0);
    }

    public static xoa a(Context context, String str, String str2, int i) {
        int i2;
        aucd o = xoa.e.o();
        anax a2 = ybx.a.a(context);
        if (a2 != null) {
            i2 = a2.e().indexOf(str);
        } else {
            i2 = -1;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        xoa xoa = (xoa) o.b;
        xoa.a |= 1;
        xoa.b = i2;
        boolean z = !TextUtils.isEmpty(str2);
        if (o.c) {
            o.c();
            o.c = false;
        }
        xoa xoa2 = (xoa) o.b;
        xoa2.a |= 2;
        xoa2.c = z;
        xip.a();
        if (((Boolean) xhu.a.a()).booleanValue() && i != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            xoa xoa3 = (xoa) o.b;
            xoa3.d = i - 1;
            xoa3.a |= 4;
        }
        return (xoa) o.i();
    }

    public static void a(aucd aucd, int i, int i2, Throwable th, int i3, int i4, long j, String str) {
        if (i != 1 && i != 9) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xny xny = (xny) aucd.b;
            xny xny2 = xny.w;
            xny.a |= 32;
            xny.g = i2;
            if (th != null) {
                String name = th.getClass().getName();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                xny xny3 = (xny) aucd.b;
                name.getClass();
                xny3.a |= 64;
                xny3.h = name;
                int cs = (int) aywy.a.a().cs();
                String stackTraceString = Log.getStackTraceString(th);
                String str2 = "";
                if (!TextUtils.isEmpty(stackTraceString)) {
                    str2 = stackTraceString.replaceAll("^.*?\\s+", str2).replaceAll("foreign key constraint failed.*?\\s+at\\s+", "FK ").replaceAll("\\s+", " ").replace(" at ", " ").replace("People", "P").replace("SQLite", "S").replace("(Native Method)", str2).replaceAll("SourceFile\\:", str2).replaceAll("\\b(?:android|com|org)\\.(?:[a-z0-9_]+\\.)*", str2);
                    if (str2.length() > cs) {
                        str2 = str2.substring(0, cs);
                    }
                }
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                xny xny4 = (xny) aucd.b;
                str2.getClass();
                xny4.a |= 128;
                xny4.i = str2;
            }
            if (i == 8 && !TextUtils.isEmpty(str)) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                xny xny5 = (xny) aucd.b;
                str.getClass();
                xny5.a |= 64;
                xny5.h = str;
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xny xny6 = (xny) aucd.b;
            int i5 = xny6.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            xny6.a = i5;
            xny6.j = i3;
            int i6 = i5 | 16384;
            xny6.a = i6;
            xny6.r = i4;
            xny6.a = i6 | 512;
            xny6.k = j;
        }
    }

    public static void a(aucd aucd, Context context, String str, amri amri, int i, String str2, int i2, int i3, int i4, long j, boolean z, boolean z2, xnq xnq, List list) {
        xoa xoa;
        Object obj;
        aucd aucd2 = aucd;
        Context context2 = context;
        int i5 = i4;
        xnq xnq2 = xnq;
        List list2 = list;
        xoa a2 = a(context2, str, (String) null);
        if (aucd2.c) {
            aucd.c();
            aucd2.c = false;
        }
        xny xny = (xny) aucd2.b;
        xny xny2 = xny.w;
        a2.getClass();
        xny.b = a2;
        int i6 = 1;
        int i7 = xny.a | 1;
        xny.a = i7;
        int i8 = 2;
        xny.a = i7 | 2;
        xny.c = i;
        int b2 = b(str2);
        if (aucd2.c) {
            aucd.c();
            aucd2.c = false;
        }
        xny xny3 = (xny) aucd2.b;
        int i9 = xny3.a | 8;
        xny3.a = i9;
        xny3.e = b2;
        xny3.d = i2 - 1;
        int i10 = i9 | 4;
        xny3.a = i10;
        xny3.a = i10 | FragmentTransaction.TRANSIT_ENTER_MASK;
        xny3.o = i3;
        if (amri.a()) {
            String str3 = (String) amri.b();
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            xny xny4 = (xny) aucd2.b;
            str3.getClass();
            xny4.a |= 32768;
            xny4.s = str3;
        }
        if (i5 != 0) {
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            xny xny5 = (xny) aucd2.b;
            xny5.f = i5;
            xny5.a |= 16;
        }
        if (aucd2.c) {
            aucd.c();
            aucd2.c = false;
        }
        xny xny6 = (xny) aucd2.b;
        int i11 = xny6.a | 1024;
        xny6.a = i11;
        xny6.m = j;
        xny6.a = i11 | FragmentTransaction.TRANSIT_EXIT_MASK;
        xny6.q = 0;
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(1);
        }
        if (z2) {
            arrayList.add(2);
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = ((Integer) arrayList.get(i12)).intValue();
        }
        List b3 = aoog.b(iArr);
        if (aucd2.c) {
            aucd.c();
            aucd2.c = false;
        }
        xny xny7 = (xny) aucd2.b;
        if (!xny7.p.a()) {
            xny7.p = aucj.a(xny7.p);
        }
        auab.a((Iterable) b3, (List) xny7.p);
        if (xnq2 != null) {
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            xny xny8 = (xny) aucd2.b;
            xnq.getClass();
            xny8.n = xnq2;
            int i13 = xny8.a | 2048;
            xny8.a = i13;
            long j2 = xny8.q;
            long j3 = xnq2.c;
            xny8.a = i13 | FragmentTransaction.TRANSIT_EXIT_MASK;
            xny8.q = j2 + j3;
        }
        if (list2 != null) {
            int size2 = list.size();
            xmu[] xmuArr = new xmu[size2];
            int i14 = 0;
            while (i14 < size2) {
                wmn wmn = (wmn) list2.get(i14);
                aucd o = xmu.J.o();
                xip.a();
                if (((Boolean) xhu.a.a()).booleanValue()) {
                    xoa = a(context2, wmn.a, wmn.b, wmn.Z);
                } else {
                    xoa = a(context2, wmn.a, wmn.b);
                }
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                xmu xmu = (xmu) o.b;
                xoa.getClass();
                xmu.c = xoa;
                int i15 = xmu.a | i6;
                xmu.a = i15;
                boolean z3 = wmn.c;
                int i16 = i15 | i8;
                xmu.a = i16;
                xmu.d = z3;
                int i17 = wmn.d;
                int i18 = i16 | 4;
                xmu.a = i18;
                xmu.e = i17;
                boolean z4 = wmn.h;
                int i19 = i18 | 2097152;
                xmu.a = i19;
                xmu.k = z4;
                boolean z5 = wmn.g;
                int i20 = i19 | 4194304;
                xmu.a = i20;
                xmu.l = z5;
                boolean z6 = wmn.f;
                int i21 = i20 | 8388608;
                xmu.a = i21;
                xmu.m = z6;
                boolean z7 = wmn.e;
                int i22 = i21 | 16777216;
                xmu.a = i22;
                xmu.n = z7;
                int i23 = i22 | 32768;
                xmu.a = i23;
                xmu.f = false;
                int i24 = i23 | 131072;
                xmu.a = i24;
                xmu.g = 0;
                int i25 = i24 | 262144;
                xmu.a = i25;
                xmu.h = 0;
                int i26 = i25 | 524288;
                xmu.a = i26;
                xmu.i = 0;
                int i27 = i26 | 1048576;
                xmu.a = i27;
                xmu.j = 0;
                boolean z8 = wmn.i;
                int i28 = i27 | 33554432;
                xmu.a = i28;
                xmu.o = z8;
                int i29 = wmn.j;
                int i30 = i28 | 67108864;
                xmu.a = i30;
                xmu.p = i29;
                int i31 = 134217728 | i30;
                xmu.a = i31;
                xmu.q = false;
                int i32 = i31 | 268435456;
                xmu.a = i32;
                xmu.r = 0;
                int i33 = i32 | 536870912;
                xmu.a = i33;
                xmu.s = 0;
                xmu.a = i33 | JGCastService.FLAG_PRIVATE_DISPLAY;
                xmu.t = 0;
                boolean z9 = wmn.k;
                int i34 = xmu.b | i6;
                xmu.b = i34;
                xmu.u = z9;
                int i35 = wmn.l;
                int i36 = i34 | i8;
                xmu.b = i36;
                xmu.v = i35;
                int i37 = wmn.m;
                int i38 = i36 | 4;
                xmu.b = i38;
                xmu.w = i37;
                int i39 = wmn.n;
                int i40 = i38 | 8;
                xmu.b = i40;
                xmu.x = i39;
                int i41 = wmn.o;
                int i42 = i40 | 16;
                xmu.b = i42;
                xmu.y = i41;
                int i43 = wmn.p;
                int i44 = i42 | 32;
                xmu.b = i44;
                xmu.z = i43;
                int i45 = wmn.q;
                int i46 = i44 | 64;
                xmu.b = i46;
                xmu.A = i45;
                int i47 = wmn.r;
                int i48 = i46 | 128;
                xmu.b = i48;
                xmu.B = i47;
                int i49 = wmn.s;
                int i50 = i48 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                xmu.b = i50;
                xmu.C = i49;
                long j4 = wmn.w;
                xmu.b = i50 | 32768;
                xmu.D = j4;
                if (ayws.g()) {
                    long j5 = wmn.O;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xmu xmu2 = (xmu) o.b;
                    xmu2.b |= 65536;
                    xmu2.E = j5;
                }
                if (ayws.e()) {
                    long j6 = wmn.P;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xmu xmu3 = (xmu) o.b;
                    xmu3.b |= 131072;
                    xmu3.F = j6;
                }
                if (ayws.f()) {
                    long j7 = wmn.Q;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xmu xmu4 = (xmu) o.b;
                    xmu4.b |= 262144;
                    xmu4.G = j7;
                }
                if (ayws.h()) {
                    int i51 = wmn.aa;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xmu xmu5 = (xmu) o.b;
                    int i52 = i51 - 1;
                    if (i51 != 0) {
                        xmu5.H = i52;
                        int i53 = xmu5.b | 524288;
                        xmu5.b = i53;
                        int i54 = wmn.ab;
                        int i55 = i54 - 1;
                        if (i54 != 0) {
                            xmu5.I = i55;
                            xmu5.b = i53 | 1048576;
                            obj = null;
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    obj = null;
                }
                xmuArr[i14] = (xmu) o.i();
                long j8 = ((xny) aucd2.b).q + wmn.G;
                if (aucd2.c) {
                    aucd.c();
                    aucd2.c = false;
                }
                xny xny9 = (xny) aucd2.b;
                xny9.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                xny9.q = j8;
                i14++;
                Object obj2 = obj;
                i6 = 1;
                i8 = 2;
            }
            List asList = Arrays.asList(xmuArr);
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            xny xny10 = (xny) aucd2.b;
            if (!xny10.l.a()) {
                xny10.l = aucj.a(xny10.l);
            }
            auab.a((Iterable) asList, (List) xny10.l);
        }
    }

    public final void a(int i, long j) {
        aucd o = xmh.o.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xmh xmh = (xmh) o.b;
        xmh.e = i - 1;
        int i2 = xmh.a | 8;
        xmh.a = i2;
        xmh.a = i2 | 4;
        xmh.d = j;
        xmh xmh2 = (xmh) o.i();
        aucd o2 = xol.w.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        xol xol = (xol) o2.b;
        xmh2.getClass();
        xol.m = xmh2;
        xol.a |= 1024;
        wmm.a((String) null, o2);
    }

    public final void a(int i, String str, String str2, String str3, int i2, int i3, int i4, List list, xlx xlx, xlp xlp, xma xma, double d) {
        String str4 = str;
        String str5 = str3;
        xlx xlx2 = xlx;
        xlp xlp2 = xlp;
        xma xma2 = xma;
        xip.a();
        if (!Boolean.valueOf(aywy.a.a().ay()).booleanValue() || a.nextDouble() < d) {
            aucd o = xme.l.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            xme xme = (xme) o.b;
            xme.b = i - 1;
            int i5 = xme.a | 1;
            xme.a = i5;
            int i6 = i5 | 2;
            xme.a = i6;
            xme.c = i3;
            int i7 = i2 - 1;
            if (i2 != 0) {
                xme.g = i7;
                int i8 = i6 | 16;
                xme.a = i8;
                if (str5 != null) {
                    str3.getClass();
                    xme.a = i8 | 4;
                    xme.d = str5;
                }
                if (ayuq.c() && str4 != null) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xme xme2 = (xme) o.b;
                    str.getClass();
                    xme2.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    xme2.k = str4;
                }
                if (((Boolean) xhh.a.a()).booleanValue()) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xme xme3 = (xme) o.b;
                    int i9 = i4 - 1;
                    if (i4 != 0) {
                        xme3.i = i9;
                        xme3.a |= 64;
                    } else {
                        throw null;
                    }
                }
                if (!jir.a((Collection) list)) {
                    xmc[] xmcArr = new xmc[list.size()];
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        xmcArr[i10] = (xmc) list.get(i10);
                    }
                    List asList = Arrays.asList(xmcArr);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xme xme4 = (xme) o.b;
                    if (!xme4.f.a()) {
                        xme4.f = aucj.a(xme4.f);
                    }
                    auab.a((Iterable) asList, (List) xme4.f);
                }
                if (xlx2 != null) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xme xme5 = (xme) o.b;
                    xlx.getClass();
                    xme5.e = xlx2;
                    xme5.a |= 8;
                }
                if (xlp2 != null) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xme xme6 = (xme) o.b;
                    xlp.getClass();
                    xme6.h = xlp2;
                    xme6.a |= 32;
                }
                if (xma2 != null) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xme xme7 = (xme) o.b;
                    xma.getClass();
                    xme7.j = xma2;
                    xme7.a |= 128;
                }
                aucd o2 = xol.w.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                xol xol = (xol) o2.b;
                xme xme8 = (xme) o.i();
                xme8.getClass();
                xol.l = xme8;
                xol.a |= 512;
                String str6 = str2;
                wmm.a(str2, o2);
                return;
            }
            throw null;
        }
    }

    public final void a(long j, long j2, long j3, long j4, int i, int i2) {
        aucd o = xmh.o.o();
        int i3 = (int) j;
        if (o.c) {
            o.c();
            o.c = false;
        }
        xmh xmh = (xmh) o.b;
        int i4 = xmh.a | 16;
        xmh.a = i4;
        xmh.f = i3;
        int i5 = i4 | 32;
        xmh.a = i5;
        xmh.g = (int) j2;
        int i6 = i5 | 64;
        xmh.a = i6;
        xmh.h = (int) j3;
        int i7 = i6 | 128;
        xmh.a = i7;
        xmh.i = (int) j4;
        xmh.a = i7 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        xmh.j = i;
        xip.a();
        if (((Boolean) xhk.a.a()).booleanValue()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            xmh xmh2 = (xmh) o.b;
            xmh2.a |= 512;
            xmh2.k = i2;
        }
        aucd o2 = xol.w.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        xol xol = (xol) o2.b;
        xmh xmh3 = (xmh) o.i();
        xmh3.getClass();
        xol.m = xmh3;
        xol.a |= 1024;
        wmm.a((String) null, o2);
    }

    public final void a(Context context, aucd aucd) {
        Collection collection;
        ModuleManager.ModuleSetInfo moduleSetInfo = null;
        try {
            ModuleManager.ConfigInfo currentConfig = ModuleManager.get(context).getCurrentConfig();
            if (currentConfig != null && (collection = currentConfig.moduleSets) != null) {
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ModuleManager.ModuleSetInfo moduleSetInfo2 = (ModuleManager.ModuleSetInfo) it.next();
                    if (moduleSetInfo2 == null) {
                        xdt.a("ModuleSetExtractor", "moduleSetInfo is null", new Object[0]);
                    } else if ("dogfood_people".equals(moduleSetInfo2.moduleSetId)) {
                        moduleSetInfo = moduleSetInfo2;
                        break;
                    }
                }
            }
        } catch (InvalidConfigException e) {
            Log.w("ModuleSetExtractor", "Invalid configuration", e);
        }
        if (moduleSetInfo != null) {
            aucd o = xmk.d.o();
            String str = moduleSetInfo.moduleSetId;
            if (o.c) {
                o.c();
                o.c = false;
            }
            xmk xmk = (xmk) o.b;
            str.getClass();
            int i = xmk.a | 1;
            xmk.a = i;
            xmk.b = str;
            int i2 = moduleSetInfo.moduleSetVariant;
            xmk.a = i | 2;
            xmk.c = i2;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xol xol = (xol) aucd.b;
            xmk xmk2 = (xmk) o.i();
            xol xol2 = xol.w;
            xmk2.getClass();
            if (!xol.j.a()) {
                xol.j = aucj.a(xol.j);
            }
            xol.j.add(xmk2);
        }
    }

    public final void a(Context context, String str, xny xny, xli[] xliArr, String str2) {
        if (((double) ycm.f.nextFloat()) < aywy.o()) {
            aucd o = xol.w.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            xol xol = (xol) o.b;
            xny.getClass();
            xol.d = xny;
            xol.a |= 4;
            boolean b2 = jgu.b(context);
            if (o.c) {
                o.c();
                o.c = false;
            }
            xol xol2 = (xol) o.b;
            int i = xol2.a | 8;
            xol2.a = i;
            xol2.e = b2;
            xol2.f = 2;
            xol2.a = i | 32;
            if (xliArr != null) {
                List asList = Arrays.asList(xliArr);
                if (!asList.contains((Object) null)) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xol xol3 = (xol) o.b;
                    if (!xol3.k.a()) {
                        xol3.k = aucj.a(xol3.k);
                    }
                    auab.a((Iterable) asList, (List) xol3.k);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                aucd o2 = xmw.l.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                xmw xmw = (xmw) o2.b;
                str2.getClass();
                xmw.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                xmw.j = str2;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                xol xol4 = (xol) o.b;
                xmw xmw2 = (xmw) o2.i();
                xmw2.getClass();
                xol4.c = xmw2;
                xol4.a = 2 | xol4.a;
            }
            a(context, o);
            wmm.a(str, o);
        }
    }

    public final void a(String str) {
        aucd o = xmq.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xmq xmq = (xmq) o.b;
        str.getClass();
        xmq.a |= 1;
        xmq.b = str;
        xmq xmq2 = (xmq) o.i();
        aucd o2 = xol.w.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        xol xol = (xol) o2.b;
        xmq2.getClass();
        xol.i = xmq2;
        xol.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        wmm.a((String) null, o2);
    }

    public final void a(String str, int i, int i2, int i3) {
        aucd o = xmh.o.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xmh xmh = (xmh) o.b;
        int i4 = xmh.a | 1024;
        xmh.a = i4;
        xmh.l = i;
        int i5 = i4 | 2048;
        xmh.a = i5;
        xmh.m = i2;
        xmh.n = i3 - 1;
        xmh.a = i5 | FragmentTransaction.TRANSIT_ENTER_MASK;
        xmh xmh2 = (xmh) o.i();
        aucd o2 = xol.w.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        xol xol = (xol) o2.b;
        xmh2.getClass();
        xol.m = xmh2;
        xol.a |= 1024;
        wmm.a(str, o2);
    }

    public final void a(String str, long j, int i) {
        aucd o = xoh.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xoh xoh = (xoh) o.b;
        xoh.b = 2;
        int i2 = xoh.a | 1;
        xoh.a = i2;
        str.getClass();
        int i3 = 2 | i2;
        xoh.a = i3;
        xoh.c = str;
        xoh.a = i3 | 8;
        xoh.e = j;
        int a2 = xog.a(i - 1);
        if (o.c) {
            o.c();
            o.c = false;
        }
        xoh xoh2 = (xoh) o.b;
        int i4 = a2 - 1;
        if (a2 != 0) {
            xoh2.d = i4;
            xoh2.a |= 4;
            xoh xoh3 = (xoh) o.i();
            aucd o2 = xol.w.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            xol xol = (xol) o2.b;
            xoh3.getClass();
            xol.h = xoh3;
            xol.a |= 128;
            wmm.a((String) null, o2);
            return;
        }
        throw null;
    }

    public final void a(xlc xlc) {
        aucd o = xol.w.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xol xol = (xol) o.b;
        xlc.getClass();
        xol.g = xlc;
        xol.a |= 64;
        wmm.a((String) null, o);
    }

    public final void a(xld xld) {
        aucd o = xol.w.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xol xol = (xol) o.b;
        xld.getClass();
        xol.s = xld;
        xol.a |= 65536;
        wmm.a((String) null, o);
    }

    public final void a(xle xle, String str) {
        aucd o = xol.w.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xol xol = (xol) o.b;
        xle.getClass();
        xol.t = xle;
        xol.a |= 131072;
        wmm.a(str, o);
    }

    public final void a(xlg xlg) {
        aucd o = xol.w.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xol xol = (xol) o.b;
        xlg.getClass();
        xol.r = xlg;
        xol.a |= 32768;
        wmm.a((String) null, o);
    }

    public final void a(xlj xlj, String str) {
        aucd o = xol.w.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xol xol = (xol) o.b;
        xlj.getClass();
        xol.v = xlj;
        xol.a |= 524288;
        wmm.a(str, o);
    }

    public final void a(xmt xmt, String str) {
        aucd o = xol.w.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xol xol = (xol) o.b;
        xmt.getClass();
        xol.q = xmt;
        xol.a |= 16384;
        wmm.a(str, o);
    }
}
