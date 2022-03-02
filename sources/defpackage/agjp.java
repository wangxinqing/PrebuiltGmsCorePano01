package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: agjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agjp {
    private static final anhq a = anhq.a("agjp");
    private static final Pattern b = Pattern.compile("VmHWM:\\s*(\\d+)\\s*kB");
    private static final Pattern c = Pattern.compile("VmRSS:\\s*(\\d+)\\s*kB");
    private static final Pattern d = Pattern.compile("RssAnon:\\s*(\\d+)\\s*kB");
    private static final Pattern e = Pattern.compile("VmSwap:\\s*(\\d+)\\s*kB");
    private static final Pattern f = Pattern.compile("VmSize:\\s*(\\d+)\\s*kB");
    private static amsv g = amta.a(agjn.a);

    private static int a(Debug.MemoryInfo memoryInfo) {
        Method method = (Method) ((amri) g.a()).c();
        if (method == null) {
            return -1;
        }
        try {
            return ((Integer) method.invoke(memoryInfo, new Object[]{14})).intValue();
        } catch (Error | Exception e2) {
            g = agjm.a;
            anhn anhn = (anhn) a.b();
            anhn.a(e2);
            ((anhn) anhn.a("agjp", "a", 104, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MemoryInfo.getOtherPss(which) invocation failure");
            return -1;
        }
    }

    private static agjo a(aghh aghh) {
        agjo agjo = null;
        if (!aghh.f() && !aghh.g() && !aghh.h() && !aghh.i()) {
            return null;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            String a2 = anne.a(new File("/proc/self/status"), Charset.defaultCharset()).a();
            if (a2.isEmpty()) {
                ((anhn) ((anhn) a.b()).a("agjp", "a", 213, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Null or empty proc status");
            } else {
                agjo agjo2 = new agjo();
                if (aghh.f()) {
                    agjo2.a = a(b, a2);
                }
                if (aghh.g()) {
                    agjo2.b = a(c, a2);
                }
                if (aghh.h()) {
                    agjo2.c = a(d, a2);
                }
                if (aghh.i()) {
                    agjo2.d = a(e, a2);
                }
                if (aghh.j()) {
                    agjo2.e = a(f, a2);
                }
                agjo = agjo2;
            }
        } catch (IOException e2) {
            anhn anhn = (anhn) a.b();
            anhn.a((Throwable) e2);
            ((anhn) anhn.a("agjp", "a", 257, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error reading proc status");
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return agjo;
    }

    static agjo a(String str, aghh aghh) {
        if (str.isEmpty()) {
            ((anhn) ((anhn) a.b()).a("agjp", "a", 213, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Null or empty proc status");
            return null;
        }
        agjo agjo = new agjo();
        if (aghh.f()) {
            agjo.a = a(b, str);
        }
        if (aghh.g()) {
            agjo.b = a(c, str);
        }
        if (aghh.h()) {
            agjo.c = a(d, str);
        }
        if (aghh.i()) {
            agjo.d = a(e, str);
        }
        if (aghh.j()) {
            agjo.e = a(f, str);
        }
        return agjo;
    }

    static final /* synthetic */ amri a() {
        try {
            return amri.b(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", new Class[]{Integer.TYPE}));
        } catch (NoSuchMethodException e2) {
            return ampu.a;
        } catch (Error | Exception e3) {
            anhn anhn = (anhn) a.b();
            anhn.a(e3);
            ((anhn) anhn.a("agjp", "a", 91, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MemoryInfo.getOtherPss(which) failure");
            return ampu.a;
        }
    }

    /* JADX INFO: finally extract failed */
    public static barg a(int i, int i2, String str, Context context, String str2, aghh aghh) {
        Debug.MemoryInfo memoryInfo;
        ActivityManager.MemoryInfo memoryInfo2;
        agjo agjo;
        String str3 = str2;
        agzj.c();
        amrl.a((Object) context);
        if (aghh.k()) {
            memoryInfo = agjs.a(context).getProcessMemoryInfo(new int[]{i2})[0];
        } else {
            memoryInfo = null;
        }
        if (aghh.l()) {
            ActivityManager.MemoryInfo memoryInfo3 = new ActivityManager.MemoryInfo();
            agjs.a(context).getMemoryInfo(memoryInfo3);
            memoryInfo2 = memoryInfo3;
        } else {
            memoryInfo2 = null;
        }
        if (aghh.f() || aghh.g() || aghh.h() || aghh.i()) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                String a2 = anne.a(new File("/proc/self/status"), Charset.defaultCharset()).a();
                if (a2.isEmpty()) {
                    ((anhn) ((anhn) a.b()).a("agjp", "a", 213, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Null or empty proc status");
                    agjo = null;
                } else {
                    agjo = new agjo();
                    if (aghh.f()) {
                        agjo.a = a(b, a2);
                    }
                    if (aghh.g()) {
                        agjo.b = a(c, a2);
                    }
                    if (aghh.h()) {
                        agjo.c = a(d, a2);
                    }
                    if (aghh.i()) {
                        agjo.d = a(e, a2);
                    }
                    if (aghh.j()) {
                        agjo.e = a(f, a2);
                    }
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            } catch (IOException e2) {
                anhn anhn = (anhn) a.b();
                anhn.a((Throwable) e2);
                ((anhn) anhn.a("agjp", "a", 257, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error reading proc status");
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                agjo = null;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th;
            }
        } else {
            agjo = null;
        }
        aucf aucf = (aucf) barg.g.o();
        aucd o = bare.c.o();
        aucd o2 = barc.z.o();
        if (memoryInfo != null) {
            int i3 = memoryInfo.dalvikPss;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            barc barc = (barc) o2.b;
            barc.a |= 1;
            barc.b = i3;
            int i4 = memoryInfo.nativePss;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            barc barc2 = (barc) o2.b;
            barc2.a |= 2;
            barc2.c = i4;
            int i5 = memoryInfo.otherPss;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            barc barc3 = (barc) o2.b;
            barc3.a |= 4;
            barc3.d = i5;
            int i6 = memoryInfo.dalvikPrivateDirty;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            barc barc4 = (barc) o2.b;
            barc4.a |= 8;
            barc4.e = i6;
            int i7 = memoryInfo.nativePrivateDirty;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            barc barc5 = (barc) o2.b;
            barc5.a |= 16;
            barc5.f = i7;
            int i8 = memoryInfo.otherPrivateDirty;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            barc barc6 = (barc) o2.b;
            barc6.a |= 32;
            barc6.g = i8;
            int totalPss = memoryInfo.getTotalPss();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            barc barc7 = (barc) o2.b;
            barc7.a |= 64;
            barc7.h = totalPss;
            int i9 = Build.VERSION.SDK_INT;
            int totalPrivateClean = memoryInfo.getTotalPrivateClean();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            barc barc8 = (barc) o2.b;
            barc8.a |= 128;
            barc8.i = totalPrivateClean;
            int totalSwappablePss = memoryInfo.getTotalSwappablePss();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            barc barc9 = (barc) o2.b;
            barc9.a |= 512;
            barc9.k = totalSwappablePss;
            int totalSharedDirty = memoryInfo.getTotalSharedDirty();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            barc barc10 = (barc) o2.b;
            barc10.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            barc10.j = totalSharedDirty;
            int i10 = Build.VERSION.SDK_INT;
            int a3 = a(memoryInfo);
            if (a3 != -1) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                barc barc11 = (barc) o2.b;
                barc11.a |= 1024;
                barc11.l = a3;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    Map<String, String> memoryStats = memoryInfo.getMemoryStats();
                    Integer a4 = a(memoryStats.get("summary.code"));
                    if (a4 != null) {
                        int intValue = a4.intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        barc barc12 = (barc) o2.b;
                        barc12.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                        barc12.n = intValue;
                    }
                    Integer a5 = a(memoryStats.get("summary.stack"));
                    if (a5 != null) {
                        int intValue2 = a5.intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        barc barc13 = (barc) o2.b;
                        barc13.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                        barc13.o = intValue2;
                    }
                    Integer a6 = a(memoryStats.get("summary.graphics"));
                    if (a6 != null) {
                        int intValue3 = a6.intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        barc barc14 = (barc) o2.b;
                        barc14.a |= 16384;
                        barc14.p = intValue3;
                    }
                    Integer a7 = a(memoryStats.get("summary.system"));
                    if (a7 != null) {
                        int intValue4 = a7.intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        barc barc15 = (barc) o2.b;
                        barc15.a |= 65536;
                        barc15.r = intValue4;
                    }
                    Integer a8 = a(memoryStats.get("summary.java-heap"));
                    if (a8 != null) {
                        int intValue5 = a8.intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        barc barc16 = (barc) o2.b;
                        barc16.a |= 2048;
                        barc16.m = intValue5;
                    }
                    Integer a9 = a(memoryStats.get("summary.private-other"));
                    if (a9 != null) {
                        int intValue6 = a9.intValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        barc barc17 = (barc) o2.b;
                        barc17.a |= 32768;
                        barc17.q = intValue6;
                    }
                } catch (NumberFormatException e3) {
                    anhn anhn2 = (anhn) a.b();
                    anhn2.a((Throwable) e3);
                    ((anhn) anhn2.a("agjp", "a", 333, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("failed to collect memory summary stats");
                }
            }
        }
        if (memoryInfo2 != null) {
            int i11 = (int) (memoryInfo2.availMem >> 10);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            barc barc18 = (barc) o2.b;
            barc18.a |= 131072;
            barc18.s = i11;
            int i12 = (int) (memoryInfo2.totalMem >> 20);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            barc barc19 = (barc) o2.b;
            barc19.a |= 262144;
            barc19.t = i12;
        }
        if (agjo != null) {
            Long l = agjo.a;
            if (l != null) {
                long longValue = l.longValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                barc barc20 = (barc) o2.b;
                barc20.a |= 524288;
                barc20.u = longValue;
            }
            Long l2 = agjo.b;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                barc barc21 = (barc) o2.b;
                barc21.a |= 1048576;
                barc21.v = longValue2;
            }
            Long l3 = agjo.c;
            if (l3 != null) {
                long longValue3 = l3.longValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                barc barc22 = (barc) o2.b;
                barc22.a |= 2097152;
                barc22.w = longValue3;
            }
            Long l4 = agjo.d;
            if (l4 != null) {
                long longValue4 = l4.longValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                barc barc23 = (barc) o2.b;
                barc23.a |= 4194304;
                barc23.x = longValue4;
            }
            Long l5 = agjo.e;
            if (l5 != null) {
                long longValue5 = l5.longValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                barc barc24 = (barc) o2.b;
                barc24.a |= 8388608;
                barc24.y = longValue5;
            }
        }
        barc barc25 = (barc) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        bare bare = (bare) o.b;
        barc25.getClass();
        bare.b = barc25;
        bare.a |= 1;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        barg barg = (barg) aucf.b;
        bare bare2 = (bare) o.i();
        bare2.getClass();
        barg.b = bare2;
        barg.a |= 1;
        aucd o3 = basd.c.o();
        basc a10 = agjt.a(str, context);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        basd basd = (basd) o3.b;
        a10.getClass();
        basd.b = a10;
        basd.a |= 1;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        barg barg2 = (barg) aucf.b;
        basd basd2 = (basd) o3.i();
        basd2.getClass();
        barg2.c = basd2;
        barg2.a |= 2;
        aucd o4 = bard.c.o();
        boolean c2 = agjs.c(context);
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        bard bard = (bard) o4.b;
        bard.a = 1 | bard.a;
        bard.b = c2;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        barg barg3 = (barg) aucf.b;
        bard bard2 = (bard) o4.i();
        bard2.getClass();
        barg3.e = bard2;
        barg3.a |= 8;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        barg barg4 = (barg) aucf.b;
        int i13 = i - 1;
        if (i != 0) {
            barg4.d = i13;
            int i14 = barg4.a | 4;
            barg4.a = i14;
            if (str3 != null) {
                str2.getClass();
                barg4.a = i14 | 16;
                barg4.f = str3;
            }
            return (barg) aucf.i();
        }
        throw null;
    }

    public static barg a(int i, Context context, String str, aghh aghh) {
        return a(i, Process.myPid(), (String) null, context, str, aghh);
    }

    private static Integer a(String str) {
        if (str != null) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        return null;
    }

    private static Long a(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (matcher.find()) {
                return Long.valueOf(Long.parseLong(matcher.group(1)));
            }
            return null;
        } catch (NumberFormatException e2) {
            return null;
        }
    }

    private static void a(aucd aucd, Debug.MemoryInfo memoryInfo) {
        if (memoryInfo != null) {
            int i = memoryInfo.dalvikPss;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            barc barc = (barc) aucd.b;
            barc barc2 = barc.z;
            barc.a |= 1;
            barc.b = i;
            int i2 = memoryInfo.nativePss;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            barc barc3 = (barc) aucd.b;
            barc3.a |= 2;
            barc3.c = i2;
            int i3 = memoryInfo.otherPss;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            barc barc4 = (barc) aucd.b;
            barc4.a |= 4;
            barc4.d = i3;
            int i4 = memoryInfo.dalvikPrivateDirty;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            barc barc5 = (barc) aucd.b;
            barc5.a |= 8;
            barc5.e = i4;
            int i5 = memoryInfo.nativePrivateDirty;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            barc barc6 = (barc) aucd.b;
            barc6.a |= 16;
            barc6.f = i5;
            int i6 = memoryInfo.otherPrivateDirty;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            barc barc7 = (barc) aucd.b;
            barc7.a |= 32;
            barc7.g = i6;
            int totalPss = memoryInfo.getTotalPss();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            barc barc8 = (barc) aucd.b;
            barc8.a |= 64;
            barc8.h = totalPss;
            int i7 = Build.VERSION.SDK_INT;
            int totalPrivateClean = memoryInfo.getTotalPrivateClean();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            barc barc9 = (barc) aucd.b;
            barc9.a |= 128;
            barc9.i = totalPrivateClean;
            int totalSwappablePss = memoryInfo.getTotalSwappablePss();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            barc barc10 = (barc) aucd.b;
            barc10.a |= 512;
            barc10.k = totalSwappablePss;
            int totalSharedDirty = memoryInfo.getTotalSharedDirty();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            barc barc11 = (barc) aucd.b;
            barc11.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            barc11.j = totalSharedDirty;
            int i8 = Build.VERSION.SDK_INT;
            int a2 = a(memoryInfo);
            if (a2 != -1) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                barc barc12 = (barc) aucd.b;
                barc12.a |= 1024;
                barc12.l = a2;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    Map<String, String> memoryStats = memoryInfo.getMemoryStats();
                    Integer a3 = a(memoryStats.get("summary.code"));
                    if (a3 != null) {
                        int intValue = a3.intValue();
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        barc barc13 = (barc) aucd.b;
                        barc13.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                        barc13.n = intValue;
                    }
                    Integer a4 = a(memoryStats.get("summary.stack"));
                    if (a4 != null) {
                        int intValue2 = a4.intValue();
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        barc barc14 = (barc) aucd.b;
                        barc14.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                        barc14.o = intValue2;
                    }
                    Integer a5 = a(memoryStats.get("summary.graphics"));
                    if (a5 != null) {
                        int intValue3 = a5.intValue();
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        barc barc15 = (barc) aucd.b;
                        barc15.a |= 16384;
                        barc15.p = intValue3;
                    }
                    Integer a6 = a(memoryStats.get("summary.system"));
                    if (a6 != null) {
                        int intValue4 = a6.intValue();
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        barc barc16 = (barc) aucd.b;
                        barc16.a |= 65536;
                        barc16.r = intValue4;
                    }
                    Integer a7 = a(memoryStats.get("summary.java-heap"));
                    if (a7 != null) {
                        int intValue5 = a7.intValue();
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        barc barc17 = (barc) aucd.b;
                        barc17.a |= 2048;
                        barc17.m = intValue5;
                    }
                    Integer a8 = a(memoryStats.get("summary.private-other"));
                    if (a8 != null) {
                        int intValue6 = a8.intValue();
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        barc barc18 = (barc) aucd.b;
                        barc18.a |= 32768;
                        barc18.q = intValue6;
                    }
                } catch (NumberFormatException e2) {
                    anhn anhn = (anhn) a.b();
                    anhn.a((Throwable) e2);
                    ((anhn) anhn.a("agjp", "a", 333, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("failed to collect memory summary stats");
                }
            }
        }
    }
}
