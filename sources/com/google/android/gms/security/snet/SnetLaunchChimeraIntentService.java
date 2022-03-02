package com.google.android.gms.security.snet;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SnetLaunchChimeraIntentService extends IntentOperation {
    private static final String a = SnetLaunchChimeraIntentService.class.getSimpleName();
    private String b;
    private String c;
    private String d;
    private String e;
    private aaww f;
    private ArrayList g;
    private String h;
    private byte[] i;
    private Bundle j;
    private String[] k;
    private ArrayList l;

    public static ComponentName a(Context context, String str, String str2, long j2, int i2, String str3, String str4, String str5, ArrayList arrayList, aarw aarw, Set set, Bundle bundle) {
        Intent startIntent = IntentOperation.getStartIntent(context, SnetLaunchChimeraIntentService.class, str5);
        if (startIntent == null) {
            return null;
        }
        startIntent.putExtra("snet.intent.extra.SNET_PATH", str);
        startIntent.putExtra("snet.intent.extra.INSTALLED_JAR_PATH", str2);
        startIntent.putExtra("snet.intent.extra.JAR_VERSION", j2);
        startIntent.putExtra("snet.intent.extra.GMS_CORE_VERSION", i2);
        startIntent.putExtra("snet.intent.extra.UUID", str3);
        startIntent.putExtra("snet.intent.extra.SHARED_UUID", str4);
        startIntent.putStringArrayListExtra("snet.intent.extra.SNET_API_PACKAGES", arrayList);
        startIntent.putExtra("snet.intent.extra.CACHED_LOGS", aarw.k());
        startIntent.putExtra("snet.intent.extra.SNET_FLAGS", bundle);
        startIntent.putExtra("snet.intent.extra.REQUESTED_DIGESTS", (String[]) set.toArray(new String[set.size()]));
        startIntent.putParcelableArrayListExtra("snet.intent.extra.DEX_INFO_BUNDLES", aasb.a(context).a());
        return context.startService(startIntent);
    }

    public final void onCreate() {
    }

    public final void onHandleIntent(Intent intent) {
        Map a2;
        if (intent != null) {
            String action = intent.getAction();
            this.h = action;
            if (!"com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(action)) {
                a((Context) this, intent);
                return;
            }
            acrz acrz = new acrz(this, 1, a, (String) null, "com.google.android.gms");
            acrz.a(false);
            try {
                acrz.a(SnetWatchdogChimeraIntentService.a(this.h));
                a((Context) this, intent);
                if (azfv.a.a().H() && (a2 = new aaoc(this).a()) != null && a2.containsKey(aaub.NEW_ACTIVITY_AFTER_SCREEN_OFF)) {
                    aaww aaww = this.f;
                    aaww.a();
                    if (!a2.isEmpty()) {
                        aaob aaob = (aaob) a2.get(aaub.NEW_ACTIVITY_AFTER_SCREEN_OFF);
                        if (aaob != null) {
                            aucd o = aaud.b.o();
                            aucd o2 = aauc.e.o();
                            aaub aaub = aaub.NEW_ACTIVITY_AFTER_SCREEN_OFF;
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            aauc aauc = (aauc) o2.b;
                            aauc.b = aaub.c;
                            int i2 = aauc.a | 1;
                            aauc.a = i2;
                            int i3 = aaob.a;
                            aauc.a = i2 | 2;
                            aauc.c = i3;
                            for (Map.Entry entry : aaob.b.entrySet()) {
                                aucd o3 = aaue.e.o();
                                if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                                    String str = (String) entry.getKey();
                                    if (o3.c) {
                                        o3.c();
                                        o3.c = false;
                                    }
                                    aaue aaue = (aaue) o3.b;
                                    str.getClass();
                                    aaue.a |= 1;
                                    aaue.b = str;
                                    auay a3 = auay.a(((aanz) entry.getValue()).a);
                                    if (o3.c) {
                                        o3.c();
                                        o3.c = false;
                                    }
                                    aaue aaue2 = (aaue) o3.b;
                                    a3.getClass();
                                    aaue2.a |= 2;
                                    aaue2.c = a3;
                                    int i4 = ((aanz) entry.getValue()).b;
                                    if (o3.c) {
                                        o3.c();
                                        o3.c = false;
                                    }
                                    aaue aaue3 = (aaue) o3.b;
                                    aaue3.a |= 4;
                                    aaue3.d = i4;
                                    if (o2.c) {
                                        o2.c();
                                        o2.c = false;
                                    }
                                    aauc aauc2 = (aauc) o2.b;
                                    aaue aaue4 = (aaue) o3.i();
                                    aaue4.getClass();
                                    if (!aauc2.d.a()) {
                                        aauc2.d = aucj.a(aauc2.d);
                                    }
                                    aauc2.d.add(aaue4);
                                }
                            }
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aaud aaud = (aaud) o.b;
                            aauc aauc3 = (aauc) o2.i();
                            aauc3.getClass();
                            if (!aaud.a.a()) {
                                aaud.a = aucj.a(aaud.a);
                            }
                            aaud.a.add(aauc3);
                            aucd aucd = aaww.q;
                            if (aucd.c) {
                                aucd.c();
                                aucd.c = false;
                            }
                            aatz aatz = (aatz) aucd.b;
                            aaud aaud2 = (aaud) o.i();
                            aatz aatz2 = aatz.l;
                            aaud2.getClass();
                            aatz.k = aaud2;
                            aatz.b |= 4;
                        }
                    }
                    aaww aaww2 = this.f;
                    aaww2.a();
                    aucd aucd2 = aaww2.q;
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    aatz aatz3 = (aatz) aucd2.b;
                    aatz aatz4 = aatz.l;
                    aatz3.a |= 1;
                    aatz3.c = 10003000;
                    if (TextUtils.isEmpty(aaww2.m)) {
                        aucd aucd3 = aaww2.q;
                        String uuid = UUID.randomUUID().toString();
                        if (aucd3.c) {
                            aucd3.c();
                            aucd3.c = false;
                        }
                        aatz aatz5 = (aatz) aucd3.b;
                        uuid.getClass();
                        aatz5.a |= 2;
                        aatz5.d = uuid;
                        aucd aucd4 = aaww2.q;
                        if (aucd4.c) {
                            aucd4.c();
                            aucd4.c = false;
                        }
                        aatz aatz6 = (aatz) aucd4.b;
                        aatz6.a |= 4;
                        aatz6.e = false;
                    } else {
                        aucd aucd5 = aaww2.q;
                        String str2 = aaww2.m;
                        if (aucd5.c) {
                            aucd5.c();
                            aucd5.c = false;
                        }
                        aatz aatz7 = (aatz) aucd5.b;
                        str2.getClass();
                        aatz7.a |= 2;
                        aatz7.d = str2;
                        aucd aucd6 = aaww2.q;
                        if (aucd6.c) {
                            aucd6.c();
                            aucd6.c = false;
                        }
                        aatz aatz8 = (aatz) aucd6.b;
                        aatz8.a |= 4;
                        aatz8.e = true;
                    }
                    if (!TextUtils.isEmpty(aaww2.n)) {
                        aucd aucd7 = aaww2.q;
                        String str3 = aaww2.n;
                        if (aucd7.c) {
                            aucd7.c();
                            aucd7.c = false;
                        }
                        aatz aatz9 = (aatz) aucd7.b;
                        str3.getClass();
                        aatz9.a |= 8;
                        aatz9.f = str3;
                    }
                    String str4 = Build.FINGERPRINT;
                    aaww2.a();
                    if (str4 != null) {
                        aucd aucd8 = aaww2.q;
                        if (aucd8.c) {
                            aucd8.c();
                            aucd8.c = false;
                        }
                        aatz aatz10 = (aatz) aucd8.b;
                        str4.getClass();
                        aatz10.b = 1 | aatz10.b;
                        aatz10.j = str4;
                    }
                    if (!TextUtils.isEmpty(aaww2.o)) {
                        aucd aucd9 = aaww2.q;
                        String str5 = aaww2.o;
                        if (aucd9.c) {
                            aucd9.c();
                            aucd9.c = false;
                        }
                        aatz aatz11 = (aatz) aucd9.b;
                        str5.getClass();
                        aatz11.a |= 32;
                        aatz11.h = str5;
                    }
                    aucd aucd10 = aaww2.q;
                    boolean a4 = jix.a(aaww2.b);
                    if (aucd10.c) {
                        aucd10.c();
                        aucd10.c = false;
                    }
                    aatz aatz12 = (aatz) aucd10.b;
                    aatz12.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    aatz12.i = a4;
                    synchronized (aaww.l) {
                        aucd aucd11 = aaww2.q;
                        List list = aaww.k;
                        if (aucd11.c) {
                            aucd11.c();
                            aucd11.c = false;
                        }
                        aatz aatz13 = (aatz) aucd11.b;
                        if (!aatz13.g.a()) {
                            aatz13.g = aucj.a(aatz13.g);
                        }
                        auab.a((Iterable) list, (List) aatz13.g);
                        aaww.k.clear();
                    }
                    aaww2.a = (aatz) aaww2.q.i();
                    hol.a(aaww2.b, "ANDROID_SNET_JAR").a(aaww2.a.k()).b();
                    aaww2.q = aatz.l.o();
                    aaww2.a = null;
                }
            } catch (Throwable th) {
            }
            acrz.c();
        }
    }

    private final void a(Context context, Bundle bundle) {
        DexClassLoader dexClassLoader;
        String str;
        String absolutePath = new File(this.b, "dalvik-cache").getAbsolutePath();
        new File(absolutePath).mkdirs();
        new File(absolutePath, "snet.dex").delete();
        jjc.a(new File(this.b, "installed/oat"));
        new File(this.b, "installed/snet.jar.prof").delete();
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        if (systemClassLoader == null) {
            Log.e(a, "Couldn't find class loader");
            return;
        }
        ClassLoader parent = systemClassLoader.getParent();
        if (parent.getParent() != null) {
            parent = parent.getParent();
        }
        if (Build.VERSION.SDK_INT != 21 || !azfv.a.a().Z()) {
            dexClassLoader = new DexClassLoader(this.c, absolutePath, (String) null, parent);
        } else {
            dexClassLoader = new aawv(this.c, absolutePath, parent);
        }
        Class loadClass = dexClassLoader.loadClass("com.google.android.snet.Snet");
        if ("com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(this.h)) {
            str = "enterSnetIdle";
        } else {
            str = "enterSnet";
        }
        loadClass.getMethod(str, new Class[]{Context.class, Bundle.class}).invoke((Object) null, new Object[]{context, bundle});
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0104 A[Catch:{ all -> 0x013c, all -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0117 A[Catch:{ all -> 0x013c, all -> 0x0150 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com.google.android.gms.security.snet.ACTION_IDLE_MODE"
            java.lang.String r1 = "snet.intent.extra.GMS_CORE_VERSION"
            r2 = -1
            int r1 = r8.getIntExtra(r1, r2)
            aaww r3 = new aaww
            r3.<init>(r7, r1)
            r6.f = r3
            java.lang.String r1 = "snet.intent.extra.SNET_PATH"
            java.lang.String r1 = r8.getStringExtra(r1)
            r6.b = r1
            java.lang.String r1 = "snet.intent.extra.INSTALLED_JAR_PATH"
            java.lang.String r1 = r8.getStringExtra(r1)
            r6.c = r1
            java.lang.String r1 = "snet.intent.extra.UUID"
            java.lang.String r1 = r8.getStringExtra(r1)
            r6.d = r1
            java.lang.String r1 = "snet.intent.extra.SHARED_UUID"
            java.lang.String r1 = r8.getStringExtra(r1)
            r6.e = r1
            java.lang.String r1 = "snet.intent.extra.SNET_API_PACKAGES"
            java.util.ArrayList r1 = r8.getStringArrayListExtra(r1)
            r6.g = r1
            java.lang.String r1 = "snet.intent.extra.CACHED_LOGS"
            byte[] r1 = r8.getByteArrayExtra(r1)
            r6.i = r1
            java.lang.String r1 = "snet.intent.extra.SNET_FLAGS"
            android.os.Bundle r3 = r8.getBundleExtra(r1)
            r6.j = r3
            java.lang.String r3 = "snet.intent.extra.REQUESTED_DIGESTS"
            java.lang.String[] r3 = r8.getStringArrayExtra(r3)
            r6.k = r3
            java.lang.String r3 = r6.d
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x005e
            aaww r3 = r6.f
            java.lang.String r4 = r6.d
            r3.m = r4
        L_0x005e:
            java.lang.String r3 = r6.e
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x006c
            aaww r3 = r6.f
            java.lang.String r4 = r6.e
            r3.n = r4
        L_0x006c:
            java.lang.String r3 = defpackage.azfv.d()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x007e
            aaww r3 = r6.f
            java.lang.String r4 = defpackage.azfv.d()
            r3.o = r4
        L_0x007e:
            java.lang.String r3 = "snet.intent.extra.DEX_INFO_BUNDLES"
            java.util.ArrayList r8 = r8.getParcelableArrayListExtra(r3)
            r6.l = r8
            java.lang.String r8 = r6.h     // Catch:{ all -> 0x013c }
            if (r8 == 0) goto L_0x0135
            android.os.Bundle r8 = defpackage.aano.a(r7)     // Catch:{ all -> 0x013c }
            java.lang.String r4 = r6.d     // Catch:{ all -> 0x013c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x013c }
            if (r4 != 0) goto L_0x009e
            java.lang.String r4 = "snet_uuid"
            java.lang.String r5 = r6.d     // Catch:{ all -> 0x013c }
            r8.putString(r4, r5)     // Catch:{ all -> 0x013c }
        L_0x009e:
            java.lang.String r4 = r6.e     // Catch:{ all -> 0x013c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x013c }
            if (r4 == 0) goto L_0x00a7
            goto L_0x00ae
        L_0x00a7:
            java.lang.String r4 = "snet_shared_uuid"
            java.lang.String r5 = r6.e     // Catch:{ all -> 0x013c }
            r8.putString(r4, r5)     // Catch:{ all -> 0x013c }
        L_0x00ae:
            java.lang.String r4 = "snet_is_sidewinder_device"
            boolean r5 = defpackage.jix.a((android.content.Context) r7)     // Catch:{ all -> 0x013c }
            r8.putBoolean(r4, r5)     // Catch:{ all -> 0x013c }
            java.lang.String r4 = r6.h     // Catch:{ all -> 0x013c }
            boolean r4 = r0.equals(r4)     // Catch:{ all -> 0x013c }
            if (r4 != 0) goto L_0x00c0
            goto L_0x00c7
        L_0x00c0:
            java.lang.String r4 = "snet_upload_requested_apks"
            java.lang.String[] r5 = r6.k     // Catch:{ all -> 0x013c }
            r8.putCharSequenceArray(r4, r5)     // Catch:{ all -> 0x013c }
        L_0x00c7:
            java.lang.String r4 = "snet_verify_apps_api_usage"
            java.util.ArrayList r5 = r6.g     // Catch:{ all -> 0x013c }
            r8.putStringArrayList(r4, r5)     // Catch:{ all -> 0x013c }
            java.lang.String r4 = "snet_cached_logs"
            byte[] r5 = r6.i     // Catch:{ all -> 0x013c }
            r8.putByteArray(r4, r5)     // Catch:{ all -> 0x013c }
            android.os.Bundle r4 = r6.j     // Catch:{ all -> 0x013c }
            r8.putBundle(r1, r4)     // Catch:{ all -> 0x013c }
            java.util.ArrayList r1 = r6.l     // Catch:{ all -> 0x013c }
            r8.putParcelableArrayList(r3, r1)     // Catch:{ all -> 0x013c }
            java.lang.String r1 = r6.h     // Catch:{ all -> 0x013c }
            int r3 = r1.hashCode()     // Catch:{ all -> 0x013c }
            r4 = 372813122(0x1638ad42, float:1.4918072E-25)
            r5 = 1
            if (r3 == r4) goto L_0x00f9
            r4 = 539976355(0x202f62a3, float:1.4855713E-19)
            if (r3 == r4) goto L_0x00f1
        L_0x00f0:
            goto L_0x0102
        L_0x00f1:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x00f0
            r2 = 0
            goto L_0x0102
        L_0x00f9:
            java.lang.String r0 = "com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x00f0
            r2 = 1
        L_0x0102:
            if (r2 == 0) goto L_0x0117
            if (r2 == r5) goto L_0x0107
            goto L_0x012d
        L_0x0107:
            boolean r0 = defpackage.azfv.m()     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x012d
            boolean r0 = defpackage.azfv.g()     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x012d
            defpackage.aayu.b(r7, r8)     // Catch:{ all -> 0x013c }
            goto L_0x012d
        L_0x0117:
            boolean r0 = defpackage.azfv.w()     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x012a
            defpackage.aayu.a(r7, r8)     // Catch:{ all -> 0x013c }
            boolean r0 = defpackage.azfv.r()     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x012d
            r6.a((android.content.Context) r7, (android.os.Bundle) r8)     // Catch:{ all -> 0x013c }
            goto L_0x012d
        L_0x012a:
            r6.a((android.content.Context) r7, (android.os.Bundle) r8)     // Catch:{ all -> 0x013c }
        L_0x012d:
            java.lang.String r8 = r6.h     // Catch:{ RuntimeException -> 0x0133 }
            com.google.android.gms.security.snet.SnetWatchdogChimeraIntentService.a((android.content.Context) r7, (java.lang.String) r8)     // Catch:{ RuntimeException -> 0x0133 }
            return
        L_0x0133:
            r7 = move-exception
            return
        L_0x0135:
            r8 = 0
            com.google.android.gms.security.snet.SnetWatchdogChimeraIntentService.a((android.content.Context) r7, (java.lang.String) r8)     // Catch:{ RuntimeException -> 0x013a }
            return
        L_0x013a:
            r7 = move-exception
            return
        L_0x013c:
            r8 = move-exception
            defpackage.aaww.a((java.lang.Throwable) r8)     // Catch:{ all -> 0x0150 }
            aaww r8 = r6.f     // Catch:{ RuntimeException -> 0x0147 }
            r0 = 3
            r8.a((int) r0)     // Catch:{ RuntimeException -> 0x0147 }
            goto L_0x0148
        L_0x0147:
            r8 = move-exception
        L_0x0148:
            java.lang.String r8 = r6.h     // Catch:{ RuntimeException -> 0x014e }
            com.google.android.gms.security.snet.SnetWatchdogChimeraIntentService.a((android.content.Context) r7, (java.lang.String) r8)     // Catch:{ RuntimeException -> 0x014e }
            return
        L_0x014e:
            r7 = move-exception
            return
        L_0x0150:
            r8 = move-exception
            java.lang.String r0 = r6.h     // Catch:{ RuntimeException -> 0x0157 }
            com.google.android.gms.security.snet.SnetWatchdogChimeraIntentService.a((android.content.Context) r7, (java.lang.String) r0)     // Catch:{ RuntimeException -> 0x0157 }
            goto L_0x0158
        L_0x0157:
            r7 = move-exception
        L_0x0158:
            goto L_0x015a
        L_0x0159:
            throw r8
        L_0x015a:
            goto L_0x0159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.security.snet.SnetLaunchChimeraIntentService.a(android.content.Context, android.content.Intent):void");
    }
}
