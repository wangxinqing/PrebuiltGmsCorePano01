package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.container.ModuleApi;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: boo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class boo {
    private static volatile boo a = null;
    private final Object b = new Object();
    private ou c = new ou();
    private final Map d = qug.a();
    private final Map e = qug.a();

    static final Resources a(bms bms) {
        if (bms instanceof bkw) {
            return null;
        }
        try {
            return bms.c();
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(bms);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Config is out of date: ");
            sb.append(valueOf);
            sb.append(" has been removed");
            Log.w("ChimeraModuleLdr", sb.toString());
            String valueOf2 = String.valueOf(bms);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
            sb2.append("can't load resources from ");
            sb2.append(valueOf2);
            throw new InvalidConfigException(sb2.toString(), e2);
        } catch (bop | RuntimeException e3) {
            String valueOf3 = String.valueOf(bms);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 36);
            sb3.append("Failed to load resources for module ");
            sb3.append(valueOf3);
            Log.e("ChimeraModuleLdr", sb3.toString(), e3);
            throw e3;
        }
    }

    public static boo a() {
        boo boo = a;
        if (boo == null) {
            synchronized (boo.class) {
                boo = a;
                if (boo == null) {
                    boo = new boo();
                    a = boo;
                }
            }
        }
        return boo;
    }

    static final void a(bms bms, boy boy, boolean z) {
        try {
            if (bms.a(boy, z)) {
                return;
            }
        } catch (PackageManager.NameNotFoundException e2) {
        }
        String valueOf = String.valueOf(bms);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("Config is out of date: ");
        sb.append(valueOf);
        sb.append(" has been modified");
        Log.w("ChimeraModuleLdr", sb.toString());
        String valueOf2 = String.valueOf(bms);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
        sb2.append("Module APK has been modified: ");
        sb2.append(valueOf2);
        throw new InvalidConfigException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    public final int a(Context context, boz boz, int i, boy boy, boolean z, boolean z2) {
        bka bka;
        boo boo;
        bon bon;
        int i2;
        bon bon2;
        bms bms;
        ClassLoader classLoader;
        String str;
        ModuleApi moduleApi;
        String str2;
        int i3;
        ArrayList arrayList;
        bpa bpa;
        bry bry;
        ArrayList arrayList2;
        boo boo2;
        ArrayList arrayList3;
        ClassLoader classLoader2;
        String str3;
        int i4;
        String str4;
        int i5;
        Context context2 = context;
        boz boz2 = boz;
        int i6 = i;
        boy boy2 = boy;
        String str5 = ":";
        String str6 = "ChimeraModuleLdr";
        bka bka2 = new bka(boy2);
        int a2 = this.c.a((Object) bka2);
        if (a2 < 0) {
            int j = boy.j();
            boolean z3 = j == 1 && boy.r().S() == i6;
            if (j == 0) {
                boo = this;
                bka = bka2;
            } else if (z3) {
                boo = this;
                bka = bka2;
            } else if (boz2 == null) {
                String valueOf = String.valueOf(boy.b());
                throw new InvalidConfigException(valueOf.length() == 0 ? new String("failed to load installed modules for ") : "failed to load installed modules for ".concat(valueOf));
            } else {
                String e2 = boy.e();
                ModuleApi a3 = a(e2);
                if (a3 == null) {
                    bla.a(context2, 15, e2);
                    String valueOf2 = String.valueOf(e2);
                    throw new bop(valueOf2.length() == 0 ? new String("failed to get module api:") : "failed to get module api:".concat(valueOf2));
                }
                Set instrumentationFilterRules = a3.getInstrumentationFilterRules(context2);
                ArrayList arrayList4 = new ArrayList(j);
                ArrayList arrayList5 = new ArrayList(j);
                apxg apxg = new apxg();
                bry bry2 = new bry();
                bka = bka2;
                bpa bpa2 = new bpa();
                Map a4 = qug.a();
                Set set = instrumentationFilterRules;
                int i7 = j - 1;
                Set set2 = set;
                while (i7 >= 0) {
                    boy2.a(apxg, i7);
                    int S = apxg.S();
                    if (i6 != S) {
                        Set set3 = set2;
                        i3 = i7;
                        ArrayList arrayList6 = arrayList5;
                        ArrayList arrayList7 = arrayList4;
                        moduleApi = a3;
                        bry = bry2;
                        int a5 = a(context, boz, S, boz2.a(S), z, z2);
                        int i8 = 10;
                        boo2 = this;
                        boy boy3 = ((bka) boo2.c.b(a5)).a;
                        bon bon3 = (bon) boo2.c.c(a5);
                        arrayList7.add(bon3);
                        int B = apxg.B();
                        int i9 = 0;
                        while (i9 < B) {
                            ArrayList arrayList8 = arrayList7;
                            String str7 = str5;
                            ArrayList arrayList9 = arrayList6;
                            String str8 = str6;
                            boz2.a(bry, apxg.j(i9));
                            int d2 = bry.d(i8);
                            if (d2 != 0) {
                                i5 = bry.d.getInt(d2 + bry.c);
                            } else {
                                i5 = 0;
                            }
                            bpa bpa3 = bpa2;
                            boz2.a(bpa3, i5);
                            boo2.d.put(bpa3.b(), boy3);
                            i9++;
                            str6 = str8;
                            str5 = str7;
                            i8 = 10;
                            arrayList6 = arrayList9;
                            arrayList7 = arrayList8;
                        }
                        a(bon3.a, boy3, z2);
                        ClassLoader classLoader3 = bon3.c;
                        if (!arrayList6.isEmpty()) {
                            arrayList3 = arrayList6;
                            classLoader2 = (ClassLoader) arrayList3.get(arrayList6.size() - 1);
                        } else {
                            arrayList3 = arrayList6;
                            classLoader2 = bof.a();
                        }
                        Set b2 = qug.b();
                        bry bry3 = new bry();
                        Set set4 = b2;
                        int B2 = apxg.B();
                        Set set5 = set4;
                        arrayList = arrayList7;
                        int i10 = 0;
                        while (i10 < B2) {
                            int i11 = B2;
                            boz2.a(bry3, apxg.j(i10));
                            String str9 = str5;
                            a4.put(bry3.f(), Integer.valueOf(bry3.R()));
                            if (set5 == null) {
                                str3 = str6;
                            } else {
                                int d3 = bry3.d(8);
                                if (d3 != 0) {
                                    i4 = bry3.g(d3);
                                } else {
                                    i4 = 0;
                                }
                                if (i4 == 0) {
                                    str3 = str6;
                                    set5 = null;
                                } else {
                                    int i12 = 0;
                                    while (i12 < i4) {
                                        int i13 = i4;
                                        String str10 = str6;
                                        int d4 = bry3.d(8);
                                        if (d4 != 0) {
                                            str4 = bry3.f(bry3.h(d4) + (i12 * 4));
                                        } else {
                                            str4 = null;
                                        }
                                        set5.add(str4);
                                        i12++;
                                        str6 = str10;
                                        i4 = i13;
                                    }
                                    str3 = str6;
                                }
                            }
                            i10++;
                            B2 = i11;
                            str6 = str3;
                            str5 = str9;
                        }
                        str = str5;
                        str2 = str6;
                        if ((!z || !bos.a()) && set5 != null) {
                            if (set3 != null) {
                                set5.addAll(set3);
                            }
                            classLoader3 = new bof(classLoader3, classLoader2, false, (String[]) set5.toArray(new String[set5.size()]));
                        }
                        arrayList3.add(classLoader3);
                        arrayList2 = arrayList3;
                        bpa = bpa2;
                        set2 = null;
                    } else {
                        Set set6 = set2;
                        i3 = i7;
                        arrayList2 = arrayList5;
                        arrayList = arrayList4;
                        moduleApi = a3;
                        bry = bry2;
                        str = str5;
                        str2 = str6;
                        bpa = bpa2;
                        boo2 = this;
                    }
                    i7 = i3 - 1;
                    boo boo3 = boo2;
                    arrayList5 = arrayList2;
                    bry2 = bry;
                    bpa2 = bpa;
                    arrayList4 = arrayList;
                    str6 = str2;
                    a3 = moduleApi;
                    str5 = str;
                    i6 = i;
                    boy2 = boy;
                }
                int i14 = Build.VERSION.SDK_INT;
                if (Build.SUPPORTED_64_BIT_ABIS.length > 0 && Build.SUPPORTED_32_BIT_ABIS.length > 0) {
                    bla.a(context2, !bor.a() ? 71 : 72, boy.o());
                }
                amrl.b(!arrayList4.isEmpty() && arrayList5.size() == arrayList4.size());
                bms a6 = bms.a(context2, boy2);
                if (a6 != null) {
                    try {
                        a3.onBeforeApkLoad(context.getApplicationContext(), a6);
                        try {
                            ClassLoader a7 = a6.a((ClassLoader) arrayList5.get(arrayList5.size() - 1));
                            if (z && bos.a()) {
                                bon2 = null;
                            } else {
                                int size = arrayList5.size();
                                boolean z4 = true;
                                bon bon4 = null;
                                while (size >= 0) {
                                    if (!z4) {
                                        classLoader = (ClassLoader) arrayList5.get(size);
                                    } else {
                                        classLoader = a7;
                                    }
                                    try {
                                        classLoader.loadClass("com.google.android.chimeraresources.R$id");
                                        bon4 = !z4 ? (bon) arrayList4.get(size) : null;
                                        size--;
                                        z4 = false;
                                    } catch (ClassNotFoundException e3) {
                                    }
                                }
                                bon2 = bon4;
                            }
                            Context applicationContext = context.getApplicationContext();
                            if (bon2 != null) {
                                bms = bon2.a;
                            } else {
                                bms = a6;
                            }
                            ModuleContext createApplicationContext = ModuleContext.createApplicationContext(applicationContext, a6, a(bms), a7, a4);
                            try {
                                a3.onApkLoaded(createApplicationContext);
                                bon = new bon(a6, createApplicationContext, a7, bon2);
                                boo = this;
                                bka bka3 = bka;
                                boo.c.put(bka3, bon);
                                return boo.c.a((Object) bka3);
                            } catch (Exception e4) {
                                Exception exc = e4;
                                String b3 = boy.b();
                                String valueOf3 = String.valueOf(b3);
                                Log.e(str6, valueOf3.length() == 0 ? new String("Initialization failed for module apk ") : "Initialization failed for module apk ".concat(valueOf3), exc);
                                String name = new File(b3).getName();
                                String message = exc.getMessage();
                                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(message).length());
                                sb.append(name);
                                sb.append(str5);
                                sb.append(message);
                                bla.a(context2, 18, sb.toString());
                                throw new bop("onApkLoaded failed.", exc);
                            }
                        } catch (PackageManager.NameNotFoundException e5) {
                            String valueOf4 = String.valueOf(a6);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 40);
                            sb2.append("Config is out of date: ");
                            sb2.append(valueOf4);
                            sb2.append(" has been removed");
                            Log.w(str6, sb2.toString());
                            String valueOf5 = String.valueOf(a6);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 21);
                            sb3.append("can't load code from ");
                            sb3.append(valueOf5);
                            throw new InvalidConfigException(sb3.toString(), e5);
                        } catch (bop | RuntimeException e6) {
                            String valueOf6 = String.valueOf(a6);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf6).length() + 31);
                            sb4.append("Failed to load code for module ");
                            sb4.append(valueOf6);
                            Log.e(str6, sb4.toString(), e6);
                            File file = new File(boy.b());
                            String name2 = file.getName();
                            String message2 = e6.getMessage();
                            StringBuilder sb5 = new StringBuilder(String.valueOf(name2).length() + 1 + String.valueOf(message2).length());
                            sb5.append(name2);
                            sb5.append(str5);
                            sb5.append(message2);
                            String sb6 = sb5.toString();
                            if (boy.a() == 3 && !file.canRead()) {
                                String valueOf7 = String.valueOf(sb6);
                                String str11 = "";
                                int i15 = 0;
                                while (file != null && i15 < 10) {
                                    if (!file.canRead()) {
                                        i2 = 0;
                                    } else {
                                        i2 = 4;
                                    }
                                    if (file.canWrite()) {
                                        i2 |= 2;
                                    }
                                    if (file.canExecute()) {
                                        i2 |= 1;
                                    }
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(str11).length() + 12);
                                    sb7.append("/");
                                    sb7.append(i2);
                                    sb7.append(str11);
                                    str11 = sb7.toString();
                                    file = file.getParentFile();
                                    i15++;
                                }
                                StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf7).length() + 1 + String.valueOf(str11).length());
                                sb8.append(valueOf7);
                                sb8.append(str5);
                                sb8.append(str11);
                                sb6 = sb8.toString();
                            }
                            bla.a(context2, 17, sb6);
                            throw e6;
                        }
                    } catch (Exception e7) {
                        String valueOf8 = String.valueOf(a6);
                        StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf8).length() + 24);
                        sb9.append("Setup failed for module ");
                        sb9.append(valueOf8);
                        Log.e(str6, sb9.toString(), e7);
                        String name3 = new File(boy.b()).getName();
                        String message3 = e7.getMessage();
                        StringBuilder sb10 = new StringBuilder(String.valueOf(name3).length() + 1 + String.valueOf(message3).length());
                        sb10.append(name3);
                        sb10.append(str5);
                        sb10.append(message3);
                        bla.a(context2, 16, sb10.toString());
                        throw new bop("onBeforeApkLoad failed.", e7);
                    }
                } else {
                    throw new bop("failed to create ModuleApk");
                }
            }
            boolean z5 = true;
            if (boy.a() != 1) {
                z5 = false;
            }
            amtf.a(z5);
            Map a8 = qug.a();
            if (z3 && boz2 != null) {
                int B3 = boy.r().B();
                bry bry4 = new bry();
                for (int i16 = 0; i16 < B3; i16++) {
                    int j2 = boy.r().j(i16);
                    if (boz2.a(bry4, j2) == null || bry4.f() == null) {
                        String b4 = boy.b();
                        StringBuilder sb11 = new StringBuilder(String.valueOf(b4).length() + 81);
                        sb11.append("failed to load installed modules for ");
                        sb11.append(b4);
                        sb11.append(": error reading on availableApis ");
                        sb11.append(j2);
                        throw new InvalidConfigException(sb11.toString());
                    }
                    a8.put(bry4.f(), Integer.valueOf(bry4.R()));
                }
            }
            bkw bkw = new bkw(context2);
            Context applicationContext2 = context.getApplicationContext();
            bon = new bon(bkw, ModuleContext.createApplicationContext(applicationContext2, bkw, (Resources) null, applicationContext2.getClassLoader(), a8), context.getClassLoader(), (bon) null);
            bka bka32 = bka;
            boo.c.put(bka32, bon);
            return boo.c.a((Object) bka32);
        }
        return a2;
    }

    public final Context a(Context context) {
        return a(context, (boz) null, "", -1, -1, new bkw(context).g(), false, false, true);
    }

    public final Context a(Context context, boz boz, bpa bpa, boolean z, boolean z2, boolean z3) {
        return a(context, boz, bpa.b(), bpa.e(), bpa.S(), boz.a(bpa.S()), z, z2, z3);
    }

    /* access modifiers changed from: package-private */
    public final Context a(Context context, boz boz, String str, int i, int i2, boy boy, boolean z, boolean z2, boolean z3) {
        Object obj;
        ModuleContext moduleContext;
        String str2 = str;
        Object obj2 = this.b;
        synchronized (obj2) {
            try {
                boy boy2 = (boy) this.d.get(str2);
                if (boy2 == null) {
                    boy boy3 = boy;
                } else if (bkd.a(boy2, boy, true) != 0) {
                    Object obj3 = obj2;
                    throw new InvalidConfigException("Module already loaded from different APK");
                }
                int a2 = a(context, boz, i2, boy, z, z3);
                boy boy4 = ((bka) this.c.b(a2)).a;
                bon bon = (bon) this.c.c(a2);
                Resources a3 = a(bon.d.a);
                this.d.put(str2, boy4);
                a(bon.a, boy4, z3);
                ModuleContext moduleContext2 = bon.b;
                if (!z2) {
                    int i3 = i;
                    moduleContext = moduleContext2;
                } else {
                    ModuleContext moduleContext3 = (ModuleContext) bon.e.get(str2);
                    if (moduleContext3 == null) {
                        ModuleContext createApplicationContext = ModuleContext.createApplicationContext(bon.b, str2, i);
                        bon.e.put(str2, createApplicationContext);
                        moduleContext = createApplicationContext;
                    } else {
                        int i4 = i;
                        moduleContext = moduleContext3;
                    }
                }
                obj = obj2;
                ModuleContext moduleContext4 = new ModuleContext(context, moduleContext, bon.a, str, i, a3, bon.c);
                return moduleContext4;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final ModuleApi a(String str) {
        ModuleApi moduleApi;
        synchronized (this.e) {
            moduleApi = (ModuleApi) this.e.get(str);
            if (moduleApi == null) {
                try {
                    moduleApi = (ModuleApi) Class.forName(str).asSubclass(ModuleApi.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48 + String.valueOf(valueOf).length());
                    sb.append("Failed to instantiate chimera ModuleApi class ");
                    sb.append(str);
                    sb.append(": ");
                    sb.append(valueOf);
                    String sb2 = sb.toString();
                    Throwable cause = e2.getCause();
                    if (cause == null) {
                        Log.e("ChimeraModuleLdr", sb2);
                    } else {
                        Log.e("ChimeraModuleLdr", sb2, cause);
                    }
                }
                if (moduleApi != null) {
                    this.e.put(str, moduleApi);
                }
            }
        }
        return moduleApi;
    }

    public final void a(boz boz) {
        boolean z;
        bpa a2;
        synchronized (this.b) {
            ou ouVar = new ou();
            for (Map.Entry entry : this.d.entrySet()) {
                String str = (String) entry.getKey();
                boy boy = (boy) entry.getValue();
                boy boy2 = null;
                if (!(boz == null || (a2 = boz.a(str)) == null)) {
                    boy2 = boz.a(a2.S());
                }
                if (boy2 != null) {
                    boolean z2 = false;
                    if (boy.a() != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bkd.a(boy, boy2, z) == 0) {
                        bka bka = new bka(boy2);
                        bon bon = (bon) this.c.get(bka);
                        if (boy2.a() == 1) {
                            z2 = true;
                        } else if (bon != null) {
                            z2 = true;
                        }
                        amtf.a(z2);
                        if (bon != null) {
                            int a3 = ouVar.a((Object) bka);
                            if (a3 >= 0) {
                                boy2 = ((bka) ouVar.b(a3)).a;
                            } else {
                                ouVar.put(bka, bon);
                            }
                        }
                        entry.setValue(boy2);
                    }
                }
                String valueOf = String.valueOf(str);
                Log.i("ChimeraModuleLdr", valueOf.length() == 0 ? new String("Module config changed, forcing restart due to module ") : "Module config changed, forcing restart due to module ".concat(valueOf));
                Process.killProcess(Process.myPid());
                return;
            }
            this.c = ouVar;
        }
    }
}
