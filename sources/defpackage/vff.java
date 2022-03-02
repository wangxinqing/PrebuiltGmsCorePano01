package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: vff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class vff implements vev {
    private final vex a = new vex(this);
    private final vfe b = new vfe(this);
    private final ConnectivityManager c;
    private final String d;
    final Context e;
    public final ClientAppIdentifier f;
    public final arwg g;
    public final vew h;
    public final vav i;
    public final uyz j;
    public final vfg k;
    public volatile int l;
    public audx m;
    public audx n;
    private final uwv o;

    public vff(Context context, ClientAppIdentifier clientAppIdentifier, arwg arwg, audx audx, String str, vew vew) {
        uwv uwv = ((uwu) thl.a(context, uwu.class)).b;
        this.e = context;
        this.i = (vav) thl.a(context, vav.class);
        this.f = clientAppIdentifier;
        this.g = arwg;
        this.n = audx;
        this.h = vew;
        this.d = str.toLowerCase(Locale.US);
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
        this.j = (uyz) thl.a(context, uyz.class);
        auyy auyy = this.i.f.d;
        this.l = (auyy == null ? auyy.v : auyy).i;
        this.o = uwv;
        this.k = new vfg(this.e, this.d);
    }

    public static int a(int i2) {
        if (i2 >= 500) {
            return 7;
        }
        if (i2 != 401) {
            return i2 != 403 ? 13 : 2806;
        }
        return 2805;
    }

    private final auzh c() {
        try {
            ModuleManager moduleManager = ModuleManager.get(this.e);
            ModuleManager.ModuleInfo currentModule = moduleManager.getCurrentModule();
            ModuleManager.ModuleApkInfo currentModuleApk = moduleManager.getCurrentModuleApk();
            aucf aucf = (aucf) auzh.f.o();
            String str = currentModuleApk.apkPackageName;
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            auzh auzh = (auzh) aucf.b;
            str.getClass();
            int i2 = auzh.a | 1;
            auzh.a = i2;
            auzh.b = str;
            int i3 = currentModule.moduleVersion;
            auzh.a = i2 | 4;
            auzh.d = (long) i3;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i3);
            objArr[1] = !"com.google.android.gms".equals(currentModuleApk.apkPackageName) ? Integer.valueOf(currentModuleApk.apkVersionCode) : "9999999";
            String format = String.format("%s.%s", objArr);
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            auzh auzh2 = (auzh) aucf.b;
            format.getClass();
            auzh2.a |= 2;
            auzh2.c = format;
            return (auzh) aucf.i();
        } catch (IllegalStateException e2) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("vff", "c", 370, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get nearby module version");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract audx a();

    /* access modifiers changed from: protected */
    public abstract avcz a(audx audx);

    /* access modifiers changed from: protected */
    public abstract Object a(audx audx, audx audx2);

    /* access modifiers changed from: protected */
    public final avcy b(String str) {
        auzh auzh;
        String a2;
        String str2 = str;
        aucf aucf = (aucf) avcy.k.o();
        long currentTimeMillis = System.currentTimeMillis();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avcy avcy = (avcy) aucf.b;
        avcy.a |= 4;
        avcy.d = currentTimeMillis;
        if (!this.f.c("0p:discoverer") && (a2 = this.o.a()) != null) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avcy avcy2 = (avcy) aucf.b;
            a2.getClass();
            avcy2.a |= 8;
            avcy2.e = a2;
        }
        aucf aucf2 = (aucf) auzh.f.o();
        if (aucf2.c) {
            aucf2.c();
            aucf2.c = false;
        }
        auzh auzh2 = (auzh) aucf2.b;
        "com.google.android.gms".getClass();
        auzh2.a |= 1;
        auzh2.b = "com.google.android.gms";
        long b2 = (long) jlo.b();
        if (aucf2.c) {
            aucf2.c();
            aucf2.c = false;
        }
        auzh auzh3 = (auzh) aucf2.b;
        auzh3.a |= 4;
        auzh3.d = b2;
        String a3 = jlo.a();
        if (aucf2.c) {
            aucf2.c();
            aucf2.c = false;
        }
        auzh auzh4 = (auzh) aucf2.b;
        a3.getClass();
        auzh4.a |= 2;
        auzh4.c = a3;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avcy avcy3 = (avcy) aucf.b;
        auzh auzh5 = (auzh) aucf2.i();
        auzh5.getClass();
        avcy3.c = auzh5;
        avcy3.a |= 2;
        String str3 = null;
        try {
            ModuleManager moduleManager = ModuleManager.get(this.e);
            ModuleManager.ModuleInfo currentModule = moduleManager.getCurrentModule();
            ModuleManager.ModuleApkInfo currentModuleApk = moduleManager.getCurrentModuleApk();
            aucf aucf3 = (aucf) auzh.f.o();
            String str4 = currentModuleApk.apkPackageName;
            if (aucf3.c) {
                aucf3.c();
                aucf3.c = false;
            }
            auzh auzh6 = (auzh) aucf3.b;
            str4.getClass();
            int i2 = auzh6.a | 1;
            auzh6.a = i2;
            auzh6.b = str4;
            int i3 = currentModule.moduleVersion;
            aucf aucf4 = aucf3;
            auzh6.a = i2 | 4;
            auzh6.d = (long) i3;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i3);
            objArr[1] = !"com.google.android.gms".equals(currentModuleApk.apkPackageName) ? Integer.valueOf(currentModuleApk.apkVersionCode) : "9999999";
            String format = String.format("%s.%s", objArr);
            aucf aucf5 = aucf4;
            if (aucf5.c) {
                aucf5.c();
                aucf5.c = false;
            }
            auzh auzh7 = (auzh) aucf5.b;
            format.getClass();
            auzh7.a |= 2;
            auzh7.c = format;
            auzh = (auzh) aucf5.i();
        } catch (IllegalStateException e2) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("vff", "c", 370, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get nearby module version");
            auzh = null;
        }
        if (auzh != null) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avcy avcy4 = (avcy) aucf.b;
            auzh.getClass();
            avcy4.i = auzh;
            avcy4.a |= 512;
        }
        if (str2 != null) {
            aucf aucf6 = (aucf) auzh.f.o();
            if (aucf6.c) {
                aucf6.c();
                aucf6.c = false;
            }
            auzh auzh8 = (auzh) aucf6.b;
            str.getClass();
            auzh8.a |= 1;
            auzh8.b = str2;
            try {
                PackageInfo packageInfo = this.e.getPackageManager().getPackageInfo(str2, 64);
                long j2 = (long) packageInfo.versionCode;
                if (aucf6.c) {
                    aucf6.c();
                    aucf6.c = false;
                }
                auzh auzh9 = (auzh) aucf6.b;
                auzh9.a |= 4;
                auzh9.d = j2;
                if (packageInfo.versionName != null) {
                    String str5 = packageInfo.versionName;
                    if (aucf6.c) {
                        aucf6.c();
                        aucf6.c = false;
                    }
                    auzh auzh10 = (auzh) aucf6.b;
                    str5.getClass();
                    auzh10.a |= 2;
                    auzh10.c = str5;
                }
                String a4 = jhg.a(packageInfo);
                if (a4 != null) {
                    if (aucf6.c) {
                        aucf6.c();
                        aucf6.c = false;
                    }
                    auzh auzh11 = (auzh) aucf6.b;
                    a4.getClass();
                    auzh11.a |= 8;
                    auzh11.e = a4;
                }
            } catch (PackageManager.NameNotFoundException e3) {
                ((anih) ((anih) tgc.a.c()).a("vff", "a", 433, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to find package for %s", (Object) "ServerTask: ", (Object) str2);
            }
            auzh auzh12 = (auzh) aucf6.i();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avcy avcy5 = (avcy) aucf.b;
            auzh12.getClass();
            avcy5.b = auzh12;
            avcy5.a |= 1;
        }
        auyy auyy = this.i.f.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        String str6 = auyy.l;
        if (!TextUtils.isEmpty(str6)) {
            ium a5 = ium.a(",");
            ArrayList arrayList = new ArrayList();
            for (String trim : str6.split(",")) {
                String trim2 = trim.trim();
                if (!TextUtils.isEmpty(trim2)) {
                    arrayList.add(trim2);
                }
            }
            if (!arrayList.isEmpty()) {
                str3 = a5.a((Iterable) arrayList);
            }
        }
        if (str3 != null) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avcy avcy6 = (avcy) aucf.b;
            str3.getClass();
            avcy6.a |= 64;
            avcy6.h = str3;
        }
        aucf aucf7 = (aucf) auzi.h.o();
        if (aucf7.c) {
            aucf7.c();
            aucf7.c = false;
        }
        auzi auzi = (auzi) aucf7.b;
        auzi.d = 6;
        auzi.a |= 4;
        String str7 = Build.MANUFACTURER;
        if (aucf7.c) {
            aucf7.c();
            aucf7.c = false;
        }
        auzi auzi2 = (auzi) aucf7.b;
        str7.getClass();
        auzi2.a |= 1;
        auzi2.b = str7;
        String str8 = Build.MODEL;
        if (aucf7.c) {
            aucf7.c();
            aucf7.c = false;
        }
        auzi auzi3 = (auzi) aucf7.b;
        str8.getClass();
        auzi3.a |= 2;
        auzi3.c = str8;
        String str9 = Build.VERSION.RELEASE;
        if (aucf7.c) {
            aucf7.c();
            aucf7.c = false;
        }
        auzi auzi4 = (auzi) aucf7.b;
        str9.getClass();
        auzi4.a |= 8;
        auzi4.e = str9;
        int i4 = Build.VERSION.SDK_INT;
        if (aucf7.c) {
            aucf7.c();
            aucf7.c = false;
        }
        auzi auzi5 = (auzi) aucf7.b;
        auzi5.a |= 16;
        auzi5.f = i4;
        float f2 = this.e.getResources().getDisplayMetrics().density;
        if (aucf7.c) {
            aucf7.c();
            aucf7.c = false;
        }
        auzi auzi6 = (auzi) aucf7.b;
        auzi6.a |= 32;
        auzi6.g = f2;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avcy avcy7 = (avcy) aucf.b;
        auzi auzi7 = (auzi) aucf7.i();
        auzi7.getClass();
        avcy7.f = auzi7;
        avcy7.a |= 16;
        String str10 = this.i.c.b;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avcy avcy8 = (avcy) aucf.b;
        str10.getClass();
        avcy8.a |= 32;
        avcy8.g = str10;
        String U = aync.a.a().U();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avcy avcy9 = (avcy) aucf.b;
        U.getClass();
        avcy9.a |= 1024;
        avcy9.j = U;
        return (avcy) aucf.i();
    }

    private final auzh a(String str) {
        aucf aucf = (aucf) auzh.f.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        auzh auzh = (auzh) aucf.b;
        str.getClass();
        auzh.a |= 1;
        auzh.b = str;
        try {
            PackageInfo packageInfo = this.e.getPackageManager().getPackageInfo(str, 64);
            long j2 = (long) packageInfo.versionCode;
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            auzh auzh2 = (auzh) aucf.b;
            auzh2.a |= 4;
            auzh2.d = j2;
            if (packageInfo.versionName != null) {
                String str2 = packageInfo.versionName;
                if (aucf.c) {
                    aucf.c();
                    aucf.c = false;
                }
                auzh auzh3 = (auzh) aucf.b;
                str2.getClass();
                auzh3.a |= 2;
                auzh3.c = str2;
            }
            String a2 = jhg.a(packageInfo);
            if (a2 != null) {
                if (aucf.c) {
                    aucf.c();
                    aucf.c = false;
                }
                auzh auzh4 = (auzh) aucf.b;
                a2.getClass();
                auzh4.a |= 8;
                auzh4.e = a2;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            ((anih) ((anih) tgc.a.c()).a("vff", "a", 433, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to find package for %s", (Object) "ServerTask: ", (Object) str);
        }
        return (auzh) aucf.i();
    }

    /* access modifiers changed from: protected */
    public vee a(String str, int i2) {
        return new vee(this.e, str, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.google.android.gms.nearby.messages.ClientAppIdentifier} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r18 = this;
            r1 = r18
            arwg r0 = r1.g
            r0.b()
            audx r0 = r1.m
            if (r0 != 0) goto L_0x001c
            audx r0 = r18.a()
            r1.m = r0
            if (r0 == 0) goto L_0x0014
            goto L_0x001c
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "getRequest() cannot return null."
            r0.<init>(r2)
            throw r0
        L_0x001c:
            r2 = -1
            r3 = 0
            android.net.ConnectivityManager r0 = r1.c     // Catch:{ IOException -> 0x013b }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ IOException -> 0x013b }
            if (r0 == 0) goto L_0x0133
            boolean r0 = r0.isConnected()     // Catch:{ IOException -> 0x013b }
            if (r0 == 0) goto L_0x0133
            com.google.android.gms.nearby.messages.ClientAppIdentifier r0 = r1.f
            com.google.android.gms.nearby.messages.ClientAppIdentifier r4 = com.google.android.gms.nearby.messages.ClientAppIdentifier.a
            boolean r0 = r0.equals(r4)
            java.lang.String r4 = "com.google.android.gms"
            if (r0 != 0) goto L_0x0080
            com.google.android.gms.nearby.messages.ClientAppIdentifier r0 = r1.f
            com.google.android.gms.nearby.messages.internal.ClientAppContext r5 = r0.c
            java.lang.String r5 = r5.b
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0071
            com.google.android.gms.nearby.messages.ClientAppIdentifier r0 = r1.f
            com.google.android.gms.nearby.messages.internal.ClientAppContext r0 = r0.c
            java.lang.String r0 = r0.c
            java.lang.String r6 = "0p:discoverer"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005e
            aync r0 = defpackage.aync.a
            aynd r0 = r0.a()
            java.lang.String r0 = r0.o()
            r5 = r4
            goto L_0x0072
        L_0x005e:
            com.google.android.gms.nearby.messages.ClientAppIdentifier r0 = r1.f
            com.google.android.gms.nearby.messages.internal.ClientAppContext r0 = r0.c
            boolean r6 = r0.d
            if (r6 != 0) goto L_0x006e
            java.lang.String r6 = r0.f
            if (r6 != 0) goto L_0x006e
            java.lang.String r0 = "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk"
            r5 = r4
            goto L_0x0072
        L_0x006e:
            java.lang.String r0 = r0.f
            goto L_0x0072
        L_0x0071:
            r0 = r3
        L_0x0072:
            if (r0 != 0) goto L_0x007c
            android.content.Context r0 = r1.e
            java.lang.String r6 = "com.google.android.nearby.messages.API_KEY"
            java.lang.String r0 = defpackage.jhg.a((android.content.Context) r0, (java.lang.String) r5, (java.lang.String) r6)
        L_0x007c:
            r6 = 9729(0x2601, float:1.3633E-41)
            r10 = r5
            goto L_0x00a5
        L_0x0080:
            aync r0 = defpackage.aync.a
            aynd r0 = r0.a()
            java.lang.String r0 = r0.c()
            android.content.Context r5 = r1.e
            java.lang.String r5 = r5.getPackageName()
            aync r6 = defpackage.aync.a
            aynd r6 = r6.a()
            java.lang.String r6 = r6.Y()
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r5 = r6
        L_0x00a2:
            r6 = 9730(0x2602, float:1.3635E-41)
            r10 = r5
        L_0x00a5:
            com.google.android.gms.nearby.messages.ClientAppIdentifier r5 = r1.f
            if (r5 != 0) goto L_0x00aa
            goto L_0x00b5
        L_0x00aa:
            java.lang.String r7 = r5.a()
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x00d7
        L_0x00b5:
            android.content.Context r4 = r1.e
            java.util.Set r4 = defpackage.vgy.b(r4)
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x00d6
            java.util.Random r5 = new java.util.Random
            r5.<init>()
            int r7 = r4.size()
            int r5 = r5.nextInt(r7)
            java.lang.Object r4 = defpackage.anbs.a((java.lang.Iterable) r4, (int) r5)
            r5 = r4
            com.google.android.gms.nearby.messages.ClientAppIdentifier r5 = (com.google.android.gms.nearby.messages.ClientAppIdentifier) r5
            goto L_0x00d7
        L_0x00d6:
            r5 = r3
        L_0x00d7:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x00df
            r3 = r0
            goto L_0x00e0
        L_0x00df:
        L_0x00e0:
            vee r11 = r1.a((java.lang.String) r3, (int) r6)
            com.google.android.gms.common.internal.ClientContext r12 = new com.google.android.gms.common.internal.ClientContext
            android.content.Context r0 = r1.e
            if (r5 == 0) goto L_0x0102
            java.lang.String r3 = r5.a()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x00f8
            int r0 = defpackage.jhg.a
            r6 = r0
            goto L_0x0105
        L_0x00f8:
            int r0 = defpackage.jhg.i(r0, r3)
            if (r0 != r2) goto L_0x0100
            int r0 = defpackage.jhg.a
        L_0x0100:
            r6 = r0
            goto L_0x0105
        L_0x0102:
            int r0 = defpackage.jhg.a
            r6 = r0
        L_0x0105:
            r7 = 0
            r8 = 0
            r5 = r12
            r9 = r10
            r5.<init>((int) r6, (android.accounts.Account) r7, (android.accounts.Account) r8, (java.lang.String) r9, (java.lang.String) r10)
            vfg r0 = r1.k
            java.lang.String r2 = r1.d
            java.lang.String r2 = r11.a(r2)
            audx r3 = r1.m
            android.content.Context r4 = r11.i
            java.util.HashMap r4 = r11.a((android.content.Context) r4, (com.google.android.gms.common.internal.ClientContext) r12)
            r0.a((java.lang.String) r2, (defpackage.audx) r3, (java.util.Map) r4)
            java.lang.String r13 = r1.d
            audx r0 = r1.m
            byte[] r14 = r0.k()
            audx r15 = r1.n
            vfe r0 = r1.b
            r16 = r0
            r17 = r0
            r11.a((com.google.android.gms.common.internal.ClientContext) r12, (java.lang.String) r13, (byte[]) r14, (java.lang.Object) r15, (com.android.volley.Response.Listener) r16, (com.android.volley.Response.ErrorListener) r17)
            return
        L_0x0133:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x013b }
            java.lang.String r4 = "Not connected"
            r0.<init>(r4)     // Catch:{ IOException -> 0x013b }
            throw r0     // Catch:{ IOException -> 0x013b }
        L_0x013b:
            r0 = move-exception
            jjg r0 = defpackage.tgc.a
            uyz r0 = r1.j
            com.google.android.gms.nearby.messages.ClientAppIdentifier r4 = r1.f
            audx r5 = r1.m
            r0.a((com.google.android.gms.nearby.messages.ClientAppIdentifier) r4, (defpackage.audx) r5, (int) r2)
            r0 = 7
            r1.b((int) r0)
            vfg r0 = r1.k
            audx r4 = r1.m
            r0.a((java.lang.String) r3, (defpackage.audx) r4, (java.util.Map) r3)
            vfg r0 = r1.k
            r0.a((defpackage.audx) r3, (int) r2, (java.util.Map) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vff.b():void");
    }

    public final void b(int i2) {
        jjg jjg = tgc.a;
        vex vex = this.a;
        vex.a = i2;
        this.g.c(vex);
    }
}
