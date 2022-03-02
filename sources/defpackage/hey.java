package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.gms.chimera.container.FileApkIntentOperation;
import com.google.android.gms.chimera.container.GmsModuleFinder$StageFileApksResultReceiver;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: hey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hey {
    private static final Object a = new Object();
    private static volatile hey b = null;
    private static boolean d = false;
    private static boolean e;
    private int c = 0;

    public static hey a() {
        hey hey = b;
        if (hey == null) {
            synchronized (hey.class) {
                hey = b;
                if (hey == null) {
                    hey = new hey();
                    b = hey;
                }
            }
        }
        return hey;
    }

    public static final Set b() {
        String str = (String) heh.g.c();
        if (str.isEmpty()) {
            return Collections.emptySet();
        }
        ob obVar = new ob();
        a(str, (Set) obVar);
        return obVar;
    }

    public static final Set c(Context context) {
        int i;
        String[] strArr = {(String) heh.f.c(), (String) heh.g.c(), "com.google.android.gms.setup"};
        ob obVar = new ob(8);
        for (int i2 = 0; i2 < 3; i2++) {
            a(strArr[i2], (Set) obVar);
        }
        PackageManager packageManager = context.getPackageManager();
        if (!jkr.c()) {
            i = 0;
        } else {
            i = 786432;
        }
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(new Intent("com.google.android.gms.chimera.module.QUERY"), i);
        if (queryBroadcastReceivers != null) {
            for (ResolveInfo next : queryBroadcastReceivers) {
                if (next.activityInfo != null) {
                    try {
                        if ((packageManager.getApplicationInfo(next.activityInfo.packageName, 0).flags & 129) != 0) {
                            obVar.add(next.activityInfo.packageName);
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                    }
                }
            }
        }
        obVar.remove("com.google.android.gms");
        return obVar;
    }

    public static final Set d(Context context) {
        Set c2 = c(context);
        Set b2 = b();
        ob obVar = new ob((Collection) blu.a(context).i());
        ob obVar2 = new ob(8);
        if (!a(context, c2, b2, (Set) obVar, true, (Collection) obVar2)) {
            return null;
        }
        return obVar2;
    }

    private static boolean e(Context context) {
        boolean z;
        synchronized (a) {
            if (!d) {
                e = context.getApplicationInfo().processName.equals(jhg.d());
                d = true;
            }
            z = e;
        }
        return z;
    }

    static final hfx a(Context context, Set set, Collection collection, boz boz, hex hex) {
        hfx hfx;
        hfk d2;
        hgh hgh;
        int i;
        ob obVar;
        nz nzVar;
        int i2;
        nz nzVar2;
        hfk hfk;
        bpw bpw;
        anax anax;
        boolean z;
        ansk ansk;
        bng bng;
        Set set2 = set;
        Collection collection2 = collection;
        boz boz2 = boz;
        try {
            hfz a2 = hfz.a(context);
            boolean e2 = e(context);
            if (a2.b()) {
                Log.e("ModuleSetMgr", "not migrated with user locked");
                hfx = null;
            } else {
                bpw bpw2 = bmy.c;
                bpw bpw3 = blj.c;
                if (boz2 == null) {
                    e2 = false;
                } else {
                    try {
                        bkv a3 = bkv.a(a2.a);
                        bpw c2 = a3.c(boz2);
                        bpw3 = a3.b(boz2);
                        bpw2 = c2;
                    } catch (InvalidConfigException e3) {
                        bpw2 = bmy.c;
                        bpw3 = blj.c;
                        e2 = false;
                    }
                }
                synchronized (a2.e) {
                    d2 = a2.d();
                }
                nz nzVar3 = new nz();
                ob obVar2 = new ob();
                if (collection2 != null) {
                    obVar2.addAll(collection2);
                }
                hfg g = a2.g();
                anax a4 = hgi.a(blu.a(a2.a).h());
                String valueOf = String.valueOf(a4);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Computing pending module set with APKs: ");
                sb.append(valueOf);
                Log.i("ModuleSetMgr", sb.toString());
                hgl hgl = new hgl(d2, d2.f, a4, blj.b(bpw3));
                ob obVar3 = new ob();
                while (true) {
                    nzVar3.clear();
                    hfz.a(d2.c, new hfu(obVar2, obVar3), false, nzVar3);
                    hfz.a(g, (Map) nzVar3);
                    hgh a5 = a2.a((Map) nzVar3, (hgm) hgl);
                    if (a5 == null) {
                        hgh = null;
                        break;
                    }
                    nz a6 = hfz.a(a5, (Map) nzVar3, a4);
                    if (!a6.isEmpty()) {
                        obVar2.addAll(a6.values());
                        if (hfz.a(g, (Collection) obVar2)) {
                            hgh = null;
                            break;
                        }
                    } else {
                        Set a7 = hgi.a((Iterable) a5.a);
                        if (!a7.isEmpty()) {
                            obVar3.addAll(a7);
                        } else {
                            if (!e2) {
                                ance.c(obVar3.iterator(), new hfv(bpw2));
                            }
                            String valueOf2 = String.valueOf(a5.d);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                            sb2.append("Pending container module APKs: ");
                            sb2.append(valueOf2);
                            Log.i("ModuleSetMgr", sb2.toString());
                            String valueOf3 = String.valueOf(a5.e);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 35);
                            sb3.append("Pending non-container module APKs: ");
                            sb3.append(valueOf3);
                            Log.i("ModuleSetMgr", sb3.toString());
                            hgh = a5.a(obVar3);
                        }
                    }
                }
                try {
                    i = new bkw(a2.a).f().h;
                } catch (PackageManager.NameNotFoundException e4) {
                    i = 0;
                }
                amzy h = amzy.h();
                if (awxs.a.a().o()) {
                    Context context2 = a2.a;
                    bng bng2 = bng.a;
                    if (bng2 == null) {
                        synchronized (bng.class) {
                            bng = bng.a;
                            if (bng == null) {
                                bng = new bng(context2);
                                bng.a = bng;
                            }
                        }
                        bng2 = bng;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        ApplicationInfo applicationInfo = bng2.b.getApplicationInfo();
                        String[] strArr = applicationInfo.splitNames;
                        String[] strArr2 = applicationInfo.splitSourceDirs;
                        if (strArr == null) {
                            String valueOf4 = String.valueOf(bng2.b.getPackageName());
                            if (valueOf4.length() == 0) {
                                new String("No split info found for ");
                            } else {
                                "No split info found for ".concat(valueOf4);
                            }
                            h = amzy.h();
                            obVar = obVar2;
                        } else {
                            amzt j = amzy.j();
                            int i3 = 0;
                            while (i3 < strArr.length) {
                                ob obVar4 = obVar2;
                                Context context3 = bng2.b;
                                String str = strArr[i3];
                                String str2 = strArr2[i3];
                                j.c(new bnf(context3, 0, str, str2, bmr.a(str2)));
                                i3++;
                                obVar2 = obVar4;
                            }
                            obVar = obVar2;
                            h = j.a();
                        }
                    } else {
                        obVar = obVar2;
                        h = amzy.h();
                    }
                    String valueOf5 = String.valueOf(h);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 18);
                    sb4.append("Found split apks: ");
                    sb4.append(valueOf5);
                    sb4.toString();
                } else {
                    obVar = obVar2;
                }
                if (hgh != null) {
                    Collection<blk> a8 = blu.a(a2.a).a(i, false, false, set2);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    amym<bms> a9 = amym.a(a8, h);
                    ob obVar5 = new ob((Collection) hgh.d);
                    ob obVar6 = new ob((Collection) hgh.e);
                    for (bms bms : a9) {
                        bmr bmr = bms.i;
                        if (bmr != null) {
                            if (obVar5.contains(bmr)) {
                                obVar5.remove(bmr);
                                arrayList.add(bms);
                            }
                            if (obVar6.contains(bmr)) {
                                obVar6.remove(bmr);
                                arrayList2.add(bms);
                            }
                        }
                        if (!bms.o()) {
                            arrayList3.add(bms);
                        }
                    }
                    if (!obVar5.isEmpty() || !obVar6.isEmpty()) {
                        hfx = hfx.a(arrayList3);
                    } else {
                        Collection values = nzVar3.values();
                        nz nzVar4 = new nz();
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            hfg hfg = (hfg) it.next();
                            aucx aucx = hfg.b;
                            int size = aucx.size();
                            int i4 = 0;
                            while (i4 < size) {
                                nzVar4.put(hgi.a((hfp) aucx.get(i4)), (ansk) hfg.a.get(0));
                                i4++;
                                it = it;
                                hfg = hfg;
                            }
                            Iterator it2 = it;
                        }
                        nz nzVar5 = new nz(nzVar4.h);
                        for (blk blk : a8) {
                            bmr bmr2 = blk.i;
                            if (!(bmr2 == null || (ansk = (ansk) nzVar4.get(bmr2)) == null)) {
                                nzVar5.put(blk, ansk);
                            }
                        }
                        anax anax2 = anfv.a;
                        if (e2) {
                            anav j2 = anax.j();
                            bpw bpw4 = hgh.a;
                            int size2 = bpw4.size();
                            int i5 = 0;
                            while (i5 < size2) {
                                ansk ansk2 = (ansk) bpw4.get(i5);
                                if (hgi.a(ansk2, 128)) {
                                    amrl.a(hgi.a(ansk2, 128));
                                    if (!"container".equals(ansk2.b)) {
                                        aucx aucx2 = d2.c;
                                        int a10 = hfz.a(ansk2.b, (List) aucx2);
                                        if (a10 >= 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        amtf.a(z);
                                        Set set3 = anfv.a;
                                        aucx aucx3 = ((hfj) aucx2.get(a10)).a;
                                        int size3 = aucx3.size();
                                        bpw = bpw4;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= size3) {
                                                nzVar2 = nzVar5;
                                                i2 = size2;
                                                hfk = d2;
                                                break;
                                            }
                                            i2 = size2;
                                            hfi hfi = (hfi) aucx3.get(i6);
                                            hfk = d2;
                                            hfg hfg2 = hfi.b;
                                            if (hfg2 == null) {
                                                hfg2 = hfg.d;
                                            }
                                            int i7 = i6 + 1;
                                            nzVar2 = nzVar5;
                                            aucx aucx4 = aucx3;
                                            if (((ansk) hfg2.a.get(0)).e == ansk2.e) {
                                                hfg hfg3 = hfi.b;
                                                if (hfg3 == null) {
                                                    hfg3 = hfg.d;
                                                }
                                                anav c3 = anax.c(hfg3.b.size());
                                                hfg hfg4 = hfi.b;
                                                if (hfg4 == null) {
                                                    hfg4 = hfg.d;
                                                }
                                                aucx aucx5 = hfg4.b;
                                                int size4 = aucx5.size();
                                                for (int i8 = 0; i8 < size4; i8++) {
                                                    c3.b(((hfp) aucx5.get(i8)).b);
                                                }
                                                set3 = c3.a();
                                            } else {
                                                size2 = i2;
                                                d2 = hfk;
                                                i6 = i7;
                                                nzVar5 = nzVar2;
                                                aucx3 = aucx4;
                                            }
                                        }
                                        if (!set3.isEmpty()) {
                                            anav c4 = anax.c(set3.size());
                                            boy boy = new boy();
                                            for (int i9 = 0; i9 < boz.b(); i9++) {
                                                boz2.a(boy, i9);
                                                if (set3.contains(boy.o())) {
                                                    c4.b(boy.b());
                                                }
                                            }
                                            anax = c4.a();
                                            if (set3.isEmpty() != anax.isEmpty()) {
                                                String str3 = ansk2.b;
                                                long j3 = ansk2.e;
                                                int size5 = set3.size();
                                                int size6 = anax.size();
                                                StringBuilder sb5 = new StringBuilder(String.valueOf(str3).length() + 142);
                                                sb5.append("Some placebo APKs for ");
                                                sb5.append(str3);
                                                sb5.append(":");
                                                sb5.append(j3);
                                                sb5.append(" didn't have a predecessor to touch - ");
                                                sb5.append(size5);
                                                sb5.append(" placebo APKs, ");
                                                sb5.append(size6);
                                                sb5.append(" predecessor APKs found.");
                                                sb5.toString();
                                            }
                                        } else {
                                            anax = anfv.a;
                                        }
                                    } else {
                                        bpw = bpw4;
                                        nzVar2 = nzVar5;
                                        i2 = size2;
                                        hfk = d2;
                                        anax = anfv.a;
                                    }
                                    j2.b((Iterable) anax);
                                } else {
                                    bpw = bpw4;
                                    nzVar2 = nzVar5;
                                    i2 = size2;
                                    hfk = d2;
                                }
                                i5++;
                                size2 = i2;
                                bpw4 = bpw;
                                d2 = hfk;
                                nzVar5 = nzVar2;
                            }
                            nzVar = nzVar5;
                            anax2 = j2.a();
                        } else {
                            nzVar = nzVar5;
                        }
                        hfx = new hfx(hgh.a, hgh.b, arrayList2, arrayList3, arrayList, nzVar, obVar, anax2);
                    }
                } else {
                    hfx = hfx.a(anda.a((Iterable) amym.a(blu.a(a2.a).a(i, true, true, set2), anbs.a((Iterable) h, hfq.a))));
                }
            }
        } catch (Error | Exception e5) {
            Throwable th = e5;
            if (hex.a(context, th)) {
                hfx = new hfx(bmy.c, blj.c, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyMap(), Collections.emptySet(), anfv.a);
            } else {
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        if (hfx != null) {
            for (String file : hfx.h) {
                File file2 = new File(file);
                file2.setLastModified(Math.max(System.currentTimeMillis(), file2.lastModified() + 1000));
            }
            return hfx;
        }
        throw new InvalidConfigException("not migrated with user locked");
    }

    public static final Set b(Context context) {
        boz boz;
        try {
            boz = bkv.a(context).f();
        } catch (InvalidConfigException e2) {
            boz = null;
        }
        ob obVar = new ob(8);
        if (boz != null) {
            int c2 = boz.c();
            bpa bpa = new bpa();
            boy boy = new boy();
            for (int i = 0; i < c2; i++) {
                boz.a(bpa, i);
                boz.a(boy, bpa.S());
                if (boy.a() == 2) {
                    obVar.add(boy.b());
                }
            }
        }
        obVar.addAll(blu.a(context).i());
        return obVar;
    }

    public static void a(Context context) {
        ou ouVar;
        hfg hfg;
        File parentFile;
        blg a2 = blg.a(context);
        if (!jkr.e()) {
            ouVar = new ou();
        } else {
            ob obVar = new ob();
            blu a3 = blu.a(context);
            ArrayList arrayList = new ArrayList();
            String f = a3.f();
            if (!(f == null || (parentFile = new File(f).getParentFile()) == null)) {
                File file = new File(parentFile, "m/optional");
                if (!file.isDirectory()) {
                    String valueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                    sb.append("System image module root not found at ");
                    sb.append(valueOf);
                    sb.append(". Ignoring.");
                    sb.toString();
                } else {
                    File[] listFiles = file.listFiles(blm.a);
                    if (listFiles == null) {
                        String valueOf2 = String.valueOf(file);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
                        sb2.append("Failed to list system image files in ");
                        sb2.append(valueOf2);
                        sb2.append(".");
                        sb2.toString();
                    } else {
                        Collections.addAll(arrayList, listFiles);
                    }
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                File file2 = (File) arrayList.get(i);
                bmr a4 = bmr.a(file2.getAbsolutePath());
                if (a4 == null) {
                    String valueOf3 = String.valueOf(file2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 59);
                    sb3.append("No module.yaml information found in ");
                    sb3.append(valueOf3);
                    sb3.append(", assuming not optional");
                    sb3.toString();
                } else {
                    obVar.add(a4);
                }
            }
            String valueOf4 = String.valueOf(obVar);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 35);
            sb4.append("Found modules in the system image: ");
            sb4.append(valueOf4);
            sb4.toString();
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 2097152);
                hfz a5 = hfz.a(context);
                try {
                    hfg = hgi.a(a5.a.getPackageManager().getResourcesForApplication(packageInfo.applicationInfo));
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("ModuleSetMgr", "Failed fetching resources for explicit container APK", e2);
                    hfg = null;
                }
                if (hfg != null) {
                    ou ouVar2 = new ou();
                    aucx aucx = hfg.b;
                    int size2 = aucx.size();
                    int i2 = 0;
                    loop1:
                    while (true) {
                        if (i2 >= size2) {
                            ouVar = ouVar2;
                            break;
                        }
                        hfp hfp = (hfp) aucx.get(i2);
                        if (obVar.contains(hgi.a(hfp))) {
                            aucx aucx2 = hfp.c;
                            int size3 = aucx2.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                boc boc = (boc) aucx2.get(i3);
                                String str = boc.b;
                                long j = boc.c;
                                Long l = (Long) ouVar2.get(str);
                                if (l == null) {
                                    ouVar2.put(str, Long.valueOf(j));
                                } else if (l.longValue() != j) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 60);
                                    sb5.append("Conflicting versions of feature ");
                                    sb5.append(str);
                                    sb5.append(" in the container module set");
                                    Log.e("GmsModuleFndr", sb5.toString());
                                    ouVar = new ou();
                                    break loop1;
                                }
                            }
                            continue;
                        }
                        i2++;
                    }
                } else {
                    Log.e("GmsModuleFndr", "Could not read system container module set");
                    ouVar = new ou();
                }
            } catch (PackageManager.NameNotFoundException e3) {
                Log.w("GmsModuleFndr", "Could not find system container");
                ouVar = new ou();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        List a6 = a2.a("system_image");
        int size4 = a6.size();
        for (int i4 = 0; i4 < size4; i4++) {
            boc boc2 = (boc) a6.get(i4);
            String str2 = boc2.b;
            Long l2 = (Long) ouVar.get(str2);
            if (l2 == null) {
                arrayList2.add(str2);
            } else if (l2.equals(Long.valueOf(boc2.c))) {
                ouVar.remove(str2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i5 = 0; i5 < ouVar.h; i5++) {
            String str3 = (String) ouVar.b(i5);
            long longValue = ((Long) ouVar.c(i5)).longValue();
            aucd o = boc.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            boc boc3 = (boc) o.b;
            str3.getClass();
            int i6 = boc3.a | 1;
            boc3.a = i6;
            boc3.b = str3;
            boc3.a = i6 | 2;
            boc3.c = longValue;
            arrayList3.add((boc) o.i());
        }
        if ((!arrayList3.isEmpty() || !arrayList2.isEmpty()) && !a2.a("system_image", arrayList3, arrayList2, false, false, (boj) null, (String) null, (blf) null)) {
            Log.e("FeatureMgr", "Feature update failed while updating system features");
            Log.e("GmsModuleFndr", "Feature update failed while updating system features");
        }
    }

    public static final void a(Context context, int i, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
        sb.append("Staging ");
        sb.append(str);
        sb.append(" and updating chimera config...");
        sb.toString();
        HandlerThread handlerThread = new HandlerThread("StageFileApksResultReceiverHandlerThread");
        handlerThread.start();
        GmsModuleFinder$StageFileApksResultReceiver gmsModuleFinder$StageFileApksResultReceiver = new GmsModuleFinder$StageFileApksResultReceiver(new qvr(handlerThread.getLooper()));
        if (i - 1 != 0) {
            boolean z = false;
            if (!e(context) || !(Looper.myLooper() == null || Looper.myLooper() == Looper.getMainLooper())) {
                z = true;
            }
            FileApkIntentOperation.a(z, context, str, (ResultReceiver) gmsModuleFinder$StageFileApksResultReceiver);
        } else {
            FileApkIntentOperation.a(context, str, (ResultReceiver) gmsModuleFinder$StageFileApksResultReceiver);
        }
        try {
            gmsModuleFinder$StageFileApksResultReceiver.a.poll(120, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Log.w("GmsModuleFndr", "Interruped/timed-out while waiting for staging to complete");
        } catch (Throwable th) {
            handlerThread.quit();
            throw th;
        }
        handlerThread.quit();
    }

    private static void a(Context context, hfx hfx, List list, Collection collection, Collection collection2) {
        collection.clear();
        collection2.clear();
        for (bms bms : hfx.c) {
            if (bms.p()) {
                collection.add(bms);
            } else {
                collection2.add(bms);
            }
        }
        collection.add(new bkw(context));
        collection2.addAll(list);
    }

    public static final void a(Context context, String str) {
        a(context, 2, str);
    }

    static final void a(Context context, Collection collection, int i) {
        hhr hhr = new hhr();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hhr.a((ansk) it.next(), i);
        }
        hhr.a(context);
    }

    private static void a(String str, Set set) {
        if (!str.isEmpty()) {
            Collections.addAll(set, str.split(","));
        }
    }

    public static void a(boolean z) {
        a(z, false);
    }

    public static void a(boolean z, boolean z2) {
        a().a(z, z2, (Set) null, (Set) null, (Set) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v26, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v42, resolved type: int} */
    /* JADX WARNING: type inference failed for: r9v5, types: [ob, java.util.Set] */
    /* JADX WARNING: type inference failed for: r25v8 */
    /* JADX WARNING: type inference failed for: r25v30 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r5 = (defpackage.hfj) r9.b;
        r6 = defpackage.hfj.b;
        r2.getClass();
        r5.a();
        r5.a.set(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c0, code lost:
        if (r7.c != false) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c4, code lost:
        r7.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r7.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02ca, code lost:
        r2 = (defpackage.hfk) r7.b;
        r6 = (defpackage.hfj) r9.i();
        r8 = defpackage.hfk.g;
        r6.getClass();
        r2.a();
        r2.c.set(r10, r6);
        r6 = r7;
        r2 = r21;
        r4 = r23;
        r14 = r24;
        r15 = r25;
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02ef, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x032b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x032c, code lost:
        r25 = r25;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0369, code lost:
        r8 = r2;
        r25 = r25;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0376, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0276, code lost:
        if (r2.c != false) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0278, code lost:
        r5 = (defpackage.aucd) r2.c(5);
        r5.a((defpackage.aucj) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0284, code lost:
        if (r5.c != false) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0287, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x028d, code lost:
        r2 = (defpackage.hfi) r5.b;
        r6 = defpackage.hfi.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0295, code lost:
        r14 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r2.a |= 2;
        r2.c = true;
        r2 = (defpackage.hfi) r5.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a4, code lost:
        if (r9.c != false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02a7, code lost:
        r9.c();
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0585  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x057b A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final boolean a(android.content.Context r35, defpackage.boz r36, java.util.Set r37, java.util.Set r38, java.util.List r39, boolean r40) {
        /*
            r1 = r35
            r11 = r36
            r0 = r37
            r12 = r39
            hex r13 = new hex
            r13.<init>()
            r14 = 0
            hfx r15 = a((android.content.Context) r1, (java.util.Set) r0, (java.util.Collection) r14, (defpackage.boz) r11, (defpackage.hex) r13)
            r7 = 0
            ob r6 = new ob     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r6.<init>()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            nz r16 = new nz     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r16.<init>()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            hfz r2 = defpackage.hfz.a((android.content.Context) r35)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.Object r3 = r2.e     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            hfk r2 = r2.d()     // Catch:{ all -> 0x036b }
            monitor-exit(r3)     // Catch:{ all -> 0x036b }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r5.<init>()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            aucx r2 = r2.c     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
        L_0x0034:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            hfj r3 = (defpackage.hfj) r3     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r4 = 0
        L_0x0041:
            aucx r8 = r3.a     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            int r8 = r8.size()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r4 >= r8) goto L_0x0034
            aucx r8 = r3.a     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.Object r8 = r8.get(r4)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            hfi r8 = (defpackage.hfi) r8     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            boolean r9 = r8.c     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r9 != 0) goto L_0x0056
            goto L_0x0068
        L_0x0056:
            hfg r8 = r8.b     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r8 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            hfg r8 = defpackage.hfg.d     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
        L_0x005d:
            aucx r8 = r8.a     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            ansk r8 = (defpackage.ansk) r8     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r5.add(r8)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
        L_0x0068:
            int r4 = r4 + 1
            goto L_0x0041
        L_0x006b:
            long r2 = defpackage.awxs.h()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            int r9 = (int) r2     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            bkv r19 = defpackage.bkv.a((android.content.Context) r35)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r3 = r15
            r2 = 0
            r20 = 0
        L_0x0078:
            if (r20 != 0) goto L_0x0365
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r4.<init>()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r8.<init>()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r3 == 0) goto L_0x0087
            goto L_0x008b
        L_0x0087:
            hfx r3 = a((android.content.Context) r1, (java.util.Set) r0, (java.util.Collection) r6, (defpackage.boz) r11, (defpackage.hex) r13)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
        L_0x008b:
            bpw r7 = r3.a     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            boolean r7 = r7.isEmpty()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r7 != 0) goto L_0x00bd
            java.util.Set r7 = r3.g     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r6.addAll(r7)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            a((android.content.Context) r1, (defpackage.hfx) r3, (java.util.List) r12, (java.util.Collection) r4, (java.util.Collection) r8)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.util.List r7 = r3.d     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r4.addAll(r7)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            bkt r7 = new bkt     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            bpw r14 = r3.a     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            bpw r10 = r3.e     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.util.List r0 = r3.b     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.util.Map r3 = r3.f     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r21 = r7
            r22 = r14
            r23 = r10
            r24 = r4
            r25 = r0
            r26 = r8
            r27 = r3
            r21.<init>(r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r0 = r7
            goto L_0x00be
        L_0x00bd:
            r0 = 0
        L_0x00be:
            if (r0 == 0) goto L_0x0360
            bpw r2 = r0.a     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r10 = 8
            a((android.content.Context) r1, (java.util.Collection) r2, (int) r10)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.String r7 = "com.google.android.gms.chimera.permission.CONFIG_CHANGE"
            java.lang.String r8 = "com.google.android.gms.chimera"
            r2 = r19
            r3 = r36
            r4 = r0
            r14 = r5
            r5 = r38
            r11 = r6
            r6 = r7
            r12 = 0
            r7 = r8
            r12 = 1
            r8 = r40
            r17 = r9
            r10 = r16
            boolean r2 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r2 != 0) goto L_0x0357
            boolean r3 = r16.isEmpty()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r3 == 0) goto L_0x00f9
            java.lang.String r0 = "GmsModuleFndr"
            java.lang.String r3 = "Moduleset rejected without rejectedApks"
            android.util.Log.e(r0, r3)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r21 = r2
            r25 = r15
            r5 = 0
            r14 = 2
            goto L_0x035d
        L_0x00f9:
            java.util.Set r3 = r16.entrySet()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
        L_0x0101:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r4 == 0) goto L_0x0188
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            bms r5 = (defpackage.bms) r5     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            bke r4 = (defpackage.bke) r4     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.util.Map r6 = r0.f     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            ansk r6 = (defpackage.ansk) r6     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r6 == 0) goto L_0x0167
            java.lang.String r5 = defpackage.bmy.a((defpackage.ansk) r6)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            int r8 = r8.length()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            int r9 = r9.length()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            int r8 = r8 + 30
            int r8 = r8 + r9
            r10.<init>(r8)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.String r8 = "excluding moduleset: "
            r10.append(r8)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r10.append(r5)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.String r5 = " reason: "
            r10.append(r5)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r10.append(r7)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.String r5 = "GmsModuleFndr"
            java.lang.String r7 = r10.toString()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            android.util.Log.w(r5, r7)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r11.add(r6)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            int r4 = r4.a     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r4 != r12) goto L_0x0101
            r14.add(r6)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            goto L_0x0101
        L_0x0167:
            java.lang.String r0 = "GmsModuleFndr"
            java.lang.String r3 = "Module APK doesn't have a corresponding moduleset: "
            java.lang.String r4 = r5.b()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            int r5 = r4.length()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r5 != 0) goto L_0x017f
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            goto L_0x0183
        L_0x017f:
            java.lang.String r4 = r3.concat(r4)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
        L_0x0183:
            android.util.Log.e(r0, r4)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r20 = 1
        L_0x0188:
            r16.clear()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            hfz r0 = defpackage.hfz.a((android.content.Context) r35)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            awxs r3 = defpackage.awxs.a     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            awxt r3 = r3.a()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            boolean r3 = r3.z()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r3 == 0) goto L_0x0336
            boolean r3 = r14.isEmpty()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r3 != 0) goto L_0x032d
            boolean r3 = r0.b()     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            if (r3 == 0) goto L_0x01b8
            java.lang.String r0 = "ModuleSetMgr"
            java.lang.String r3 = "not migrated with user locked"
            android.util.Log.e(r0, r3)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            r21 = r2
            r24 = r14
            r25 = r15
            r5 = 0
            r14 = 2
            goto L_0x033e
        L_0x01b8:
            java.lang.Object r3 = r0.e     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x037a, Error -> 0x0378 }
            hfk r4 = r0.d()     // Catch:{ all -> 0x0324 }
            r5 = 5
            java.lang.Object r6 = r4.c(r5)     // Catch:{ all -> 0x0324 }
            aucd r6 = (defpackage.aucd) r6     // Catch:{ all -> 0x0324 }
            r6.a((defpackage.aucj) r4)     // Catch:{ all -> 0x0324 }
            java.util.Iterator r4 = r14.iterator()     // Catch:{ all -> 0x0324 }
            r8 = 0
        L_0x01ce:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x0324 }
            if (r7 == 0) goto L_0x030e
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x0324 }
            ansk r7 = (defpackage.ansk) r7     // Catch:{ all -> 0x0324 }
            java.lang.String r9 = r7.b     // Catch:{ all -> 0x0324 }
            aucj r10 = r6.b     // Catch:{ all -> 0x0324 }
            hfk r10 = (defpackage.hfk) r10     // Catch:{ all -> 0x0324 }
            aucx r10 = r10.c     // Catch:{ all -> 0x0324 }
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)     // Catch:{ all -> 0x0324 }
            int r10 = defpackage.hfz.a((java.lang.String) r9, (java.util.List) r10)     // Catch:{ all -> 0x0324 }
            r12 = -1
            if (r10 != r12) goto L_0x0216
            java.lang.String r7 = "ModuleSetMgr"
            java.lang.String r10 = "Failed moduleset not in config: "
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0324 }
            int r12 = r9.length()     // Catch:{ all -> 0x0324 }
            if (r12 != 0) goto L_0x0201
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x0324 }
            r9.<init>(r10)     // Catch:{ all -> 0x0324 }
            goto L_0x0205
        L_0x0201:
            java.lang.String r9 = r10.concat(r9)     // Catch:{ all -> 0x0324 }
        L_0x0205:
            android.util.Log.w(r7, r9)     // Catch:{ all -> 0x0324 }
            r21 = r2
            r23 = r4
            r7 = r6
            r24 = r14
            r25 = r15
            r4 = 5
            r5 = 0
            r14 = 2
            goto L_0x0301
        L_0x0216:
            r12 = r6
            long r5 = r7.e     // Catch:{ all -> 0x0324 }
            r7 = r12
            aucj r12 = r7.b     // Catch:{ all -> 0x0324 }
            hfk r12 = (defpackage.hfk) r12     // Catch:{ all -> 0x0324 }
            aucx r12 = r12.c     // Catch:{ all -> 0x0324 }
            java.lang.Object r12 = r12.get(r10)     // Catch:{ all -> 0x0324 }
            hfj r12 = (defpackage.hfj) r12     // Catch:{ all -> 0x0324 }
            r9 = 5
            java.lang.Object r21 = r12.c(r9)     // Catch:{ all -> 0x0324 }
            r9 = r21
            aucd r9 = (defpackage.aucd) r9     // Catch:{ all -> 0x0324 }
            r9.a((defpackage.aucj) r12)     // Catch:{ all -> 0x0324 }
            r12 = 0
        L_0x0233:
            r21 = r2
            aucj r2 = r9.b     // Catch:{ all -> 0x0324 }
            hfj r2 = (defpackage.hfj) r2     // Catch:{ all -> 0x0324 }
            aucx r2 = r2.a     // Catch:{ all -> 0x0324 }
            int r2 = r2.size()     // Catch:{ all -> 0x0324 }
            if (r12 >= r2) goto L_0x02f8
            aucj r2 = r9.b     // Catch:{ all -> 0x0324 }
            hfj r2 = (defpackage.hfj) r2     // Catch:{ all -> 0x0324 }
            aucx r2 = r2.a     // Catch:{ all -> 0x0324 }
            java.lang.Object r2 = r2.get(r12)     // Catch:{ all -> 0x0324 }
            hfi r2 = (defpackage.hfi) r2     // Catch:{ all -> 0x0324 }
            r23 = r4
            hfg r4 = r2.b     // Catch:{ all -> 0x0324 }
            if (r4 == 0) goto L_0x0254
            goto L_0x0256
        L_0x0254:
            hfg r4 = defpackage.hfg.d     // Catch:{ all -> 0x0324 }
        L_0x0256:
            aucx r4 = r4.a     // Catch:{ all -> 0x0324 }
            r24 = r14
            r14 = 0
            java.lang.Object r4 = r4.get(r14)     // Catch:{ all -> 0x0324 }
            ansk r4 = (defpackage.ansk) r4     // Catch:{ all -> 0x0324 }
            r25 = r15
            long r14 = r4.e     // Catch:{ all -> 0x02f6 }
            int r4 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0274
            int r12 = r12 + 1
            r2 = r21
            r4 = r23
            r14 = r24
            r15 = r25
            goto L_0x0233
        L_0x0274:
            boolean r4 = r2.c     // Catch:{ all -> 0x02f6 }
            if (r4 != 0) goto L_0x02f2
            r4 = 5
            java.lang.Object r5 = r2.c(r4)     // Catch:{ all -> 0x02f6 }
            aucd r5 = (defpackage.aucd) r5     // Catch:{ all -> 0x02f6 }
            r5.a((defpackage.aucj) r2)     // Catch:{ all -> 0x02f6 }
            boolean r2 = r5.c     // Catch:{ all -> 0x02f6 }
            if (r2 != 0) goto L_0x0287
            goto L_0x028d
        L_0x0287:
            r5.c()     // Catch:{ all -> 0x02f6 }
            r2 = 0
            r5.c = r2     // Catch:{ all -> 0x02f6 }
        L_0x028d:
            aucj r2 = r5.b     // Catch:{ all -> 0x02f6 }
            hfi r2 = (defpackage.hfi) r2     // Catch:{ all -> 0x02f6 }
            hfi r6 = defpackage.hfi.g     // Catch:{ all -> 0x02f6 }
            int r6 = r2.a     // Catch:{ all -> 0x02f6 }
            r14 = 2
            r6 = r6 | r14
            r2.a = r6     // Catch:{ all -> 0x02ef }
            r6 = 1
            r2.c = r6     // Catch:{ all -> 0x02ef }
            aucj r2 = r5.i()     // Catch:{ all -> 0x02ef }
            hfi r2 = (defpackage.hfi) r2     // Catch:{ all -> 0x02ef }
            boolean r5 = r9.c     // Catch:{ all -> 0x02ef }
            if (r5 != 0) goto L_0x02a7
            goto L_0x02ad
        L_0x02a7:
            r9.c()     // Catch:{ all -> 0x02ef }
            r5 = 0
            r9.c = r5     // Catch:{ all -> 0x032b }
        L_0x02ad:
            aucj r5 = r9.b     // Catch:{ all -> 0x02ef }
            hfj r5 = (defpackage.hfj) r5     // Catch:{ all -> 0x02ef }
            hfj r6 = defpackage.hfj.b     // Catch:{ all -> 0x02ef }
            r2.getClass()     // Catch:{ all -> 0x02ef }
            r5.a()     // Catch:{ all -> 0x02ef }
            aucx r5 = r5.a     // Catch:{ all -> 0x02ef }
            r5.set(r12, r2)     // Catch:{ all -> 0x02ef }
            boolean r2 = r7.c     // Catch:{ all -> 0x02ef }
            if (r2 != 0) goto L_0x02c4
            r5 = 0
            goto L_0x02ca
        L_0x02c4:
            r7.c()     // Catch:{ all -> 0x02ef }
            r5 = 0
            r7.c = r5     // Catch:{ all -> 0x032b }
        L_0x02ca:
            aucj r2 = r7.b     // Catch:{ all -> 0x032b }
            hfk r2 = (defpackage.hfk) r2     // Catch:{ all -> 0x032b }
            aucj r6 = r9.i()     // Catch:{ all -> 0x032b }
            hfj r6 = (defpackage.hfj) r6     // Catch:{ all -> 0x032b }
            hfk r8 = defpackage.hfk.g     // Catch:{ all -> 0x032b }
            r6.getClass()     // Catch:{ all -> 0x032b }
            r2.a()     // Catch:{ all -> 0x032b }
            aucx r2 = r2.c     // Catch:{ all -> 0x032b }
            r2.set(r10, r6)     // Catch:{ all -> 0x032b }
            r6 = r7
            r2 = r21
            r4 = r23
            r14 = r24
            r15 = r25
            r5 = 5
            r8 = 1
            r12 = 1
            goto L_0x01ce
        L_0x02ef:
            r0 = move-exception
            r5 = 0
            goto L_0x0329
        L_0x02f2:
            r4 = 5
            r5 = 0
            r14 = 2
            goto L_0x0301
        L_0x02f6:
            r0 = move-exception
            goto L_0x0327
        L_0x02f8:
            r23 = r4
            r24 = r14
            r25 = r15
            r4 = 5
            r5 = 0
            r14 = 2
        L_0x0301:
            r6 = r7
            r2 = r21
            r4 = r23
            r14 = r24
            r15 = r25
            r5 = 5
            r12 = 1
            goto L_0x01ce
        L_0x030e:
            r21 = r2
            r7 = r6
            r24 = r14
            r25 = r15
            r5 = 0
            r14 = 2
            if (r8 == 0) goto L_0x0322
            aucj r2 = r7.i()     // Catch:{ all -> 0x032b }
            hfk r2 = (defpackage.hfk) r2     // Catch:{ all -> 0x032b }
            r0.a((defpackage.hfk) r2)     // Catch:{ all -> 0x032b }
        L_0x0322:
            monitor-exit(r3)     // Catch:{ all -> 0x032b }
            goto L_0x033e
        L_0x0324:
            r0 = move-exception
            r25 = r15
        L_0x0327:
            r5 = 0
            r14 = 2
        L_0x0329:
            monitor-exit(r3)     // Catch:{ all -> 0x032b }
            throw r0     // Catch:{ Exception -> 0x0374, Error -> 0x0372 }
        L_0x032b:
            r0 = move-exception
            goto L_0x0329
        L_0x032d:
            r21 = r2
            r24 = r14
            r25 = r15
            r5 = 0
            r14 = 2
            goto L_0x033e
        L_0x0336:
            r21 = r2
            r24 = r14
            r25 = r15
            r5 = 0
            r14 = 2
        L_0x033e:
            r0 = 10
            a((android.content.Context) r1, (java.util.Collection) r11, (int) r0)     // Catch:{ Exception -> 0x0374, Error -> 0x0372 }
            r0 = r37
            r12 = r39
            r6 = r11
            r9 = r17
            r2 = r21
            r5 = r24
            r15 = r25
            r3 = 0
            r7 = 0
            r14 = 0
            r11 = r36
            goto L_0x0078
        L_0x0357:
            r21 = r2
            r25 = r15
            r5 = 0
            r14 = 2
        L_0x035d:
            r8 = r21
            goto L_0x0386
        L_0x0360:
            r25 = r15
            r5 = 0
            r14 = 2
            goto L_0x0369
        L_0x0365:
            r25 = r15
            r5 = 0
            r14 = 2
        L_0x0369:
            r8 = r2
            goto L_0x0386
        L_0x036b:
            r0 = move-exception
            r25 = r15
            r5 = 0
            r14 = 2
        L_0x0370:
            monitor-exit(r3)     // Catch:{ all -> 0x0376 }
            throw r0     // Catch:{ Exception -> 0x0374, Error -> 0x0372 }
        L_0x0372:
            r0 = move-exception
            goto L_0x037f
        L_0x0374:
            r0 = move-exception
            goto L_0x037f
        L_0x0376:
            r0 = move-exception
            goto L_0x0370
        L_0x0378:
            r0 = move-exception
            goto L_0x037b
        L_0x037a:
            r0 = move-exception
        L_0x037b:
            r25 = r15
            r5 = 0
            r14 = 2
        L_0x037f:
            boolean r2 = r13.a(r1, r0)
            if (r2 == 0) goto L_0x058d
            r8 = 0
        L_0x0386:
            if (r8 != 0) goto L_0x057d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            hfz r0 = defpackage.hfz.a((android.content.Context) r35)
            r3 = r39
            r4 = r25
            r15 = 0
            a((android.content.Context) r1, (defpackage.hfx) r4, (java.util.List) r3, (java.util.Collection) r2, (java.util.Collection) r11)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r14)
            hfg r0 = r0.g()
            aucx r3 = r0.a
            java.lang.Object r3 = r3.get(r15)
            ansk r3 = (defpackage.ansk) r3
            java.lang.String r3 = r3.b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "-only"
            java.lang.String r3 = r3.concat(r4)
            aucx r0 = r0.c
            java.util.List r4 = java.util.Collections.emptyList()
            bpw r30 = defpackage.blj.a(r0, r4)
            bkt r4 = new bkt
            ansk r0 = defpackage.hgi.a((java.lang.String) r3)
            amzy r0 = defpackage.amzy.a((java.lang.Object) r0)
            java.util.Comparator r3 = defpackage.bmy.a
            bpw r29 = defpackage.bpw.a(r0, r3)
            r32 = 0
            r34 = 0
            r28 = r4
            r31 = r2
            r33 = r11
            r28.<init>(r29, r30, r31, r32, r33, r34)
            r14 = r36
            if (r14 == 0) goto L_0x0533
            bkv r0 = defpackage.bkv.a((android.content.Context) r35)
            bpw r3 = r0.b((defpackage.boz) r14)     // Catch:{ InvalidConfigException -> 0x052e }
            bpw r6 = r0.c(r14)     // Catch:{ InvalidConfigException -> 0x052e }
            bpw r0 = r4.a
            boolean r0 = defpackage.bmy.a((defpackage.bpw) r6, (defpackage.bpw) r0)
            if (r0 != 0) goto L_0x0533
            bpw r0 = r4.a
            java.lang.Object r0 = r0.get(r15)
            r7 = r0
            ansk r7 = (defpackage.ansk) r7
            int r0 = r6.size()
            r8 = 0
        L_0x0408:
            if (r8 >= r0) goto L_0x047f
            java.lang.Object r9 = r6.get(r8)
            ansk r9 = (defpackage.ansk) r9
            int r8 = r8 + 1
            r10 = 1
            boolean r12 = defpackage.hgi.a((defpackage.ansk) r9, (boolean) r10)
            if (r12 == 0) goto L_0x047a
            r0 = 64
            boolean r0 = defpackage.hgi.a((defpackage.ansk) r9, (int) r0)
            if (r0 == 0) goto L_0x0443
            bkw r0 = new bkw     // Catch:{ NameNotFoundException -> 0x043c }
            r0.<init>(r1)     // Catch:{ NameNotFoundException -> 0x043c }
            boy r8 = r14.a((int) r15)     // Catch:{ NameNotFoundException -> 0x043c }
            boolean r0 = r0.a((defpackage.boy) r8)     // Catch:{ NameNotFoundException -> 0x043c }
            if (r0 != 0) goto L_0x0436
            r37 = r11
            r16 = r13
            r8 = 1
            goto L_0x0454
        L_0x0436:
            r37 = r11
            r16 = r13
            r8 = 0
            goto L_0x0454
        L_0x043c:
            r0 = move-exception
            r37 = r11
            r16 = r13
            r8 = 0
            goto L_0x0454
        L_0x0443:
            r16 = r13
            long r12 = r7.e
            r37 = r11
            long r10 = r9.e
            boolean r0 = defpackage.hgi.a((long) r12, (long) r10)
            if (r0 != 0) goto L_0x0453
            r8 = 1
            goto L_0x0454
        L_0x0453:
            r8 = 0
        L_0x0454:
            if (r8 != 0) goto L_0x0459
            r0 = r6
            r7 = r8
            goto L_0x0485
        L_0x0459:
            int r0 = r6.size()
            r10 = 1
            if (r0 == r10) goto L_0x0477
            bpw r0 = r4.a
            defpackage.amtf.a((java.lang.Object) r0)
            anax r0 = defpackage.anax.a((java.lang.Object) r9)
            bpw r0 = r6.a((java.util.Set) r0)
            amzy r6 = defpackage.amzy.a((java.lang.Object) r7)
            bpw r0 = r0.a((java.util.Collection) r6)
            r7 = r8
            goto L_0x0485
        L_0x0477:
            r2 = 0
            goto L_0x0536
        L_0x047a:
            r37 = r11
            r16 = r13
            goto L_0x0408
        L_0x047f:
            r37 = r11
            r16 = r13
            r0 = r6
            r7 = 0
        L_0x0485:
            int r6 = r36.b()
            int r8 = r6 / 2
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r8)
            if (r7 != 0) goto L_0x04a0
            ob r9 = new ob
            int r11 = r2.size()
            int r11 = r11 + r8
            r9.<init>((int) r11)
            r9.addAll(r2)
            goto L_0x04a1
        L_0x04a0:
            r9 = 0
        L_0x04a1:
            boy r8 = new boy
            r8.<init>()
            r11 = 0
        L_0x04a7:
            if (r11 >= r6) goto L_0x04c8
            r14.a((defpackage.boy) r8, (int) r11)
            int r12 = r8.k()
            if (r12 == 0) goto L_0x04b8
            r13 = 1
            if (r12 == r13) goto L_0x04b6
            goto L_0x04c5
        L_0x04b6:
            r12 = r10
            goto L_0x04bc
        L_0x04b8:
            r13 = 1
            if (r9 == 0) goto L_0x04c5
            r12 = r9
        L_0x04bc:
            bms r13 = defpackage.bms.a((android.content.Context) r1, (defpackage.boy) r8)
            if (r13 == 0) goto L_0x04c5
            r12.add(r13)
        L_0x04c5:
            int r11 = r11 + 1
            goto L_0x04a7
        L_0x04c8:
            if (r7 == 0) goto L_0x051e
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r3.size()
            r6.<init>(r7)
            int r7 = r3.size()
            r8 = 0
        L_0x04d8:
            if (r8 >= r7) goto L_0x04eb
            java.lang.Object r11 = r3.get(r8)
            bob r11 = (defpackage.bob) r11
            boolean r12 = r11.e
            if (r12 == 0) goto L_0x04e5
            goto L_0x04e8
        L_0x04e5:
            r6.add(r11)
        L_0x04e8:
            int r8 = r8 + 1
            goto L_0x04d8
        L_0x04eb:
            bpw r3 = r4.b     // Catch:{ InvalidConfigException -> 0x04f7 }
            amzy r3 = defpackage.amzy.a((java.lang.Object) r6, (java.lang.Object) r3)     // Catch:{ InvalidConfigException -> 0x04f7 }
            bpw r3 = defpackage.blj.c(r3)     // Catch:{ InvalidConfigException -> 0x04f7 }
            r8 = r3
            goto L_0x051f
        L_0x04f7:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 43
            r3.<init>(r2)
            java.lang.String r2 = "Failed merging updated container features: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "GmsModuleFndr"
            android.util.Log.e(r2, r0)
            r2 = 0
            goto L_0x0536
        L_0x051e:
            r8 = r3
        L_0x051f:
            if (r9 == 0) goto L_0x0522
            goto L_0x0523
        L_0x0522:
            r9 = r2
        L_0x0523:
            bkt r2 = new bkt
            r12 = 0
            r6 = r2
            r7 = r0
            r11 = r37
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0536
        L_0x052e:
            r0 = move-exception
            r16 = r13
            r2 = 0
            goto L_0x0536
        L_0x0533:
            r16 = r13
            r2 = 0
        L_0x0536:
            if (r2 != 0) goto L_0x0539
            goto L_0x053c
        L_0x0539:
            r5.add(r2)
        L_0x053c:
            r5.add(r4)
            long r2 = defpackage.awxs.h()
            int r0 = (int) r2
            bkv r11 = defpackage.bkv.a((android.content.Context) r35)
            int r12 = r5.size()
            r7 = 0
        L_0x054d:
            if (r7 >= r12) goto L_0x057b
            java.lang.Object r2 = r5.get(r7)
            r4 = r2
            bkt r4 = (defpackage.bkt) r4
            bpw r2 = r4.a
            r13 = 8
            a((android.content.Context) r1, (java.util.Collection) r2, (int) r13)
            int r18 = r7 + 1
            r10 = 0
            java.lang.String r6 = "com.google.android.gms.chimera.permission.CONFIG_CHANGE"
            java.lang.String r7 = "com.google.android.gms.chimera"
            r2 = r11
            r3 = r36
            r19 = r5
            r5 = r38
            r8 = r40
            r9 = r0
            boolean r2 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r2 == 0) goto L_0x0576
            r8 = 1
            goto L_0x057f
        L_0x0576:
            r7 = r18
            r5 = r19
            goto L_0x054d
        L_0x057b:
            r8 = 0
            goto L_0x057f
        L_0x057d:
            r16 = r13
        L_0x057f:
            r1 = r16
            boolean r0 = r1.a
            if (r0 == 0) goto L_0x058c
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x058c:
            return r8
        L_0x058d:
            goto L_0x058f
        L_0x058e:
            throw r0
        L_0x058f:
            goto L_0x058e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hey.a(android.content.Context, boz, java.util.Set, java.util.Set, java.util.List, boolean):boolean");
    }

    public static final boolean a(Context context, Set set, Set set2, Set set3, boolean z, Collection collection) {
        PackageManager packageManager = context.getPackageManager();
        hya a2 = hya.a(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 192);
                if (a2.a(packageInfo, true) || a2.c(packageInfo)) {
                    collection.add(new bmb(context, set2.contains(str) ? 1 : 0, str));
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
                    sb.append("Module pkg ");
                    sb.append(str);
                    sb.append(" not signed by Google, skipping");
                    sb.toString();
                }
            } catch (PackageManager.NameNotFoundException e2) {
                if (z && set3.contains(str)) {
                    hxj hxj = hxj.a;
                    if (hxz.a(context, str)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 47);
                        sb2.append("Module pkg ");
                        sb2.append(str);
                        sb2.append(" is possibly updating, aborting scan");
                        sb2.toString();
                        return false;
                    }
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 35);
                sb3.append("Module pkg ");
                sb3.append(str);
                sb3.append(" not installed, skipping");
                sb3.toString();
            }
        }
        return true;
    }

    public final void a(boolean z, boolean z2, Set set, Set set2, Set set3) {
        Set set4;
        Set set5;
        Set set6;
        boolean z3;
        String str;
        boz boz;
        Context baseContext = ihs.b().getBaseContext();
        Context baseContext2 = baseContext instanceof ModuleContext ? ((ModuleContext) baseContext).getBaseContext() : baseContext;
        hem.a();
        bkv.a(baseContext2).a(awxs.e());
        if (set == null) {
            set4 = c(baseContext2);
        } else {
            set4 = set;
        }
        Set b2 = b();
        if (set2 == null) {
            set5 = b(baseContext2);
        } else {
            set5 = set2;
        }
        if (set3 == null) {
            Set b3 = ilv.b();
            String str2 = (String) heh.h.c();
            if (!str2.isEmpty()) {
                Collections.addAll(b3, str2.split(","));
            }
            set6 = b3;
        } else {
            set6 = set3;
        }
        boolean z4 = z2 || e(baseContext2);
        if (z4) {
            Context d2 = aekv.d(baseContext2);
            jjc.a(d2, bkq.a(d2));
        }
        ArrayList arrayList = new ArrayList();
        int i = 4;
        while (true) {
            Log.i("GmsModuleFndr", "Beginning GMS chimera module scan");
            synchronized (a) {
                arrayList.clear();
                if (i > 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i2 = i;
                if (a(baseContext2, set4, b2, set5, z3, (Collection) arrayList)) {
                    try {
                        try {
                            boz = bkv.a(baseContext2).f();
                        } catch (InvalidConfigException e2) {
                            boz = null;
                        }
                        if (a(baseContext2, boz, b2, set6, (List) arrayList, z4)) {
                            break;
                        } else if (boz != null) {
                            break;
                        } else {
                            throw new InvalidConfigException("No working module set config");
                        }
                    } catch (InvalidConfigException e3) {
                        FileApkIntentOperation.a(baseContext2);
                        i = i2 - 1;
                        if (i == 0) {
                            str = "failed after max retries";
                            break;
                        } else if (!z) {
                            str = "aborted, can't block";
                            break;
                        } else {
                            try {
                                Thread.sleep(4000);
                            } catch (InterruptedException e4) {
                                Thread.currentThread().interrupt();
                                str = "interrupted";
                            }
                        }
                        Log.i("GmsModuleFndr", str.length() == 0 ? new String("GMS chimera configuration check ") : "GMS chimera configuration check ".concat(str));
                        int i3 = this.c + 1;
                        this.c = i3;
                        if (i3 == 10) {
                            hem.a().a(baseContext2, 29, str);
                            return;
                        }
                        return;
                    }
                }
            }
            Thread.sleep(4000);
        }
        this.c = 0;
    }
}
