package com.google.android.chimera.config;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleManager {
    public static final int FEATURE_CHECK_ERROR = 3;
    public static final int FEATURE_CHECK_SUCCESS = 0;
    public static final int FEATURE_CHECK_UNKNOWN_FEATURE = 1;
    public static final int FEATURE_CHECK_UPDATE_REQUIRED = 2;
    @ChimeraApiVersion(added = 105)
    public static final int FEATURE_REQUEST_RESULT_FAILURE = 1;
    @ChimeraApiVersion(added = 105)
    public static final int FEATURE_REQUEST_RESULT_FAILURE_NO_RETRY = 2;
    @ChimeraApiVersion(added = 105)
    public static final int FEATURE_REQUEST_RESULT_SUCCESS = 0;
    private static final WeakHashMap e = new WeakHashMap();
    private static final Object f = new Object();
    private static volatile Uri g;
    private final Context a;
    private final ModuleContext b;
    private ModuleInfo c;
    private ModuleApkInfo d;

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class BasicModuleInfo {
        public final String moduleId;
        public final int moduleVersion;

        public BasicModuleInfo(String str, int i) {
            this.moduleId = str;
            this.moduleVersion = i;
        }
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ConfigInfo {
        public final int chimeraConfigModifierFlags;
        public final Collection moduleSets;
        public final Collection optionalModules;

        @ChimeraApiVersion(added = 0)
        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public @interface ChimeraConfigModifierFlags {
            public static final int HAS_BLACKLISTED_MODULES = 1;
        }

        public ConfigInfo(List list, List list2, int i) {
            this.moduleSets = Collections.unmodifiableList(list);
            this.optionalModules = Collections.unmodifiableList(list2);
            this.chimeraConfigModifierFlags = i;
        }
    }

    @ChimeraApiVersion(added = 104)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class FeatureCheck {
        public final List a = new ArrayList();

        private final void a(String str, long j) {
            List list = this.a;
            aucd o = boc.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            boc boc = (boc) o.b;
            str.getClass();
            int i = boc.a | 1;
            boc.a = i;
            boc.b = str;
            boc.a = i | 2;
            boc.c = j;
            list.add((boc) o.i());
        }

        public FeatureCheck checkFeatureAtAnyVersion(String str) {
            a(str, 0);
            return this;
        }

        public FeatureCheck checkFeatureAtLatestVersion(String str) {
            a(str, -1);
            return this;
        }

        public FeatureCheck checkFeatureAtVersion(String str, long j) {
            amrl.a(j > 0);
            a(str, j);
            return this;
        }

        public List getFeatureDescriptors() {
            return amzy.a((Collection) this.a);
        }
    }

    @ChimeraApiVersion(added = 0)
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public @interface FeatureCheckResult {
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class FeatureList {
        private final byte[] a;

        private FeatureList(byte[] bArr) {
            this.a = bArr;
        }

        public static FeatureList fromDescriptors(List list) {
            aucd o = boe.b.o();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                boc boc = (boc) list.get(i);
                aucd o2 = bob.f.o();
                String str = boc.b;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                bob bob = (bob) o2.b;
                str.getClass();
                int i2 = bob.a | 1;
                bob.a = i2;
                bob.b = str;
                long j = boc.c;
                bob.a = i2 | 2;
                bob.c = j;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                boe boe = (boe) o.b;
                bob bob2 = (bob) o2.i();
                bob2.getClass();
                boe.a();
                boe.a.add(bob2);
            }
            return new FeatureList(((boe) o.i()).k());
        }

        public static FeatureList fromFeatures(List list) {
            aucd o = boe.b.o();
            o.j((Iterable) list);
            return new FeatureList(((boe) o.i()).k());
        }

        public static FeatureList fromProto(byte[] bArr) {
            return new FeatureList(bArr);
        }

        public byte[] getProtoBytes() {
            return this.a;
        }
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class FeatureRequest {
        private final ou a = new ou();
        private final ob b = new ob();
        private boolean c = false;
        private boolean d = false;
        private FeatureRequestProgressListener e = null;
        private String f = null;

        private final void a(String str, long j) {
            this.a.put(str, Long.valueOf(j));
        }

        public FeatureRequest requestFeatureAtAnyVersion(String str) {
            a(str, 0);
            return this;
        }

        public FeatureRequest requestFeatureAtLatestVersion(String str) {
            a(str, -1);
            return this;
        }

        public FeatureRequest requestFeatureAtVersion(String str, long j) {
            amrl.a(j > 0);
            a(str, j);
            return this;
        }

        public FeatureRequest requestFeatures(FeatureList featureList) {
            boolean z;
            aucx aucx = ((boe) aucj.a((aucj) boe.b, featureList.getProtoBytes(), aubs.b())).a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                bob bob = (bob) aucx.get(i);
                long j = bob.c;
                if (j >= -1) {
                    z = true;
                } else {
                    z = false;
                }
                amrl.a(z);
                a(bob.b, j);
            }
            return this;
        }

        public FeatureRequest setForceUnrequest() {
            this.c = true;
            return this;
        }

        @ChimeraApiVersion(added = 106)
        public FeatureRequest setSessionId(String str) {
            this.f = str;
            return this;
        }

        public FeatureRequest setUrgent() {
            this.d = true;
            return this;
        }

        public FeatureRequest setUrgent(FeatureRequestProgressListener featureRequestProgressListener) {
            this.d = true;
            this.e = featureRequestProgressListener;
            return this;
        }

        public Bundle toContractBundle(String str) {
            bju bju;
            ou ouVar = this.a;
            ob obVar = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            FeatureRequestProgressListener featureRequestProgressListener = this.e;
            if (featureRequestProgressListener != null) {
                bju = featureRequestProgressListener.a();
            } else {
                bju = null;
            }
            String str2 = this.f;
            Bundle bundle = new Bundle();
            bundle.putString("requester", str);
            bundle.putBoolean("forceUnrequest", z);
            bundle.putBoolean("urgent", z2);
            bpx.a(bundle, "listener", (boj) bju);
            if (!ouVar.isEmpty()) {
                int i = ouVar.h;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    aucd o = boc.d.o();
                    String str3 = (String) ouVar.b(i2);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    boc boc = (boc) o.b;
                    str3.getClass();
                    boc.a |= 1;
                    boc.b = str3;
                    long longValue = ((Long) ouVar.c(i2)).longValue();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    boc boc2 = (boc) o.b;
                    boc2.a |= 2;
                    boc2.c = longValue;
                    arrayList.add((boc) o.i());
                }
                aucd o2 = bod.b.o();
                o2.i((Iterable) arrayList);
                bundle.putByteArray("requested", ((bod) o2.i()).k());
            }
            if (!obVar.isEmpty()) {
                bundle.putStringArrayList("unrequested", new ArrayList(obVar));
            }
            if (str2 != null) {
                bundle.putString("sessionId", str2);
            }
            return bundle;
        }

        public FeatureRequest unrequestFeature(String str) {
            this.b.add(str);
            return this;
        }
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public abstract class FeatureRequestProgressListener {
        private bju a = null;

        public final synchronized bju a() {
            if (this.a == null) {
                this.a = new bju(this);
            }
            return this.a;
        }

        @Deprecated
        public void onRequestComplete() {
        }

        @ChimeraApiVersion(added = 105)
        public void onRequestComplete(int i) {
            onRequestComplete();
        }
    }

    @ChimeraApiVersion(added = 105)
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public @interface FeatureRequestResult {
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ModuleApkInfo {
        public final String apkPackageName;
        public final boolean apkRequired;
        public final long apkTimestamp;
        public final int apkType;
        public final int apkVersionCode;
        public final String apkVersionName;

        public ModuleApkInfo(boy boy) {
            this.apkPackageName = boy.f();
            this.apkVersionName = boy.g();
            this.apkVersionCode = boy.h();
            this.apkType = boy.a();
            this.apkTimestamp = boy.d();
            this.apkRequired = !ModuleManager.a(boy);
        }
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ModuleInfo extends BasicModuleInfo {
        private Bundle a;
        public final ModuleApkInfo moduleApk;

        public ModuleInfo(bpa bpa, ModuleApkInfo moduleApkInfo) {
            this(bpa, moduleApkInfo, (Bundle) null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized android.os.Bundle getMetadata(android.content.Context r12) {
            /*
                r11 = this;
                monitor-enter(r11)
                android.os.Bundle r0 = r11.a     // Catch:{ all -> 0x010d }
                if (r0 != 0) goto L_0x0109
                bkv r12 = defpackage.bkv.a((android.content.Context) r12)     // Catch:{ all -> 0x010d }
                boz r12 = r12.f()     // Catch:{ all -> 0x010d }
                java.lang.String r0 = r11.moduleId     // Catch:{ all -> 0x010d }
                int r0 = defpackage.bpz.a(r12, r0)     // Catch:{ all -> 0x010d }
                apxg r12 = r12.f()     // Catch:{ all -> 0x010d }
                bqi r1 = new bqi     // Catch:{ all -> 0x010d }
                java.nio.ByteBuffer r2 = defpackage.bqj.a     // Catch:{ all -> 0x010d }
                r1.<init>(r0, r2)     // Catch:{ all -> 0x010d }
                bqb r2 = defpackage.bqj.d     // Catch:{ all -> 0x010d }
                int r1 = defpackage.bqj.a(r12, r2, r1)     // Catch:{ all -> 0x010d }
                if (r1 < 0) goto L_0x0027
                goto L_0x002a
            L_0x0027:
                int r1 = -r1
                int r1 = r1 + -1
            L_0x002a:
                int r2 = r12.G()     // Catch:{ all -> 0x010d }
                brw r3 = new brw     // Catch:{ all -> 0x010d }
                r3.<init>()     // Catch:{ all -> 0x010d }
                if (r1 >= r2) goto L_0x0105
                brw r4 = r12.a((defpackage.brw) r3, (int) r1)     // Catch:{ all -> 0x010d }
                int r4 = r4.T()     // Catch:{ all -> 0x010d }
                if (r4 == r0) goto L_0x0041
                goto L_0x0105
            L_0x0041:
                android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x010d }
                r4.<init>()     // Catch:{ all -> 0x010d }
            L_0x0046:
                int r5 = r1 + 1
                brw r1 = r12.a((defpackage.brw) r3, (int) r1)     // Catch:{ all -> 0x010d }
                r6 = 6
                int r6 = r1.d((int) r6)     // Catch:{ all -> 0x010d }
                r7 = 0
                if (r6 == 0) goto L_0x005e
                java.nio.ByteBuffer r8 = r1.d     // Catch:{ all -> 0x010d }
                int r9 = r1.c     // Catch:{ all -> 0x010d }
                int r6 = r6 + r9
                int r6 = r8.getInt(r6)     // Catch:{ all -> 0x010d }
                goto L_0x005f
            L_0x005e:
                r6 = 0
            L_0x005f:
                r8 = 1
                if (r6 == r8) goto L_0x00db
                r9 = 2
                if (r6 == r9) goto L_0x00c0
                r9 = 3
                if (r6 == r9) goto L_0x00a1
                r7 = 4
                if (r6 == r7) goto L_0x0088
                r7 = 5
                if (r6 == r7) goto L_0x0070
                goto L_0x00f5
            L_0x0070:
                r6 = 16
                java.nio.ByteBuffer r6 = r1.i(r6)     // Catch:{ all -> 0x010d }
                int r7 = r6.remaining()     // Catch:{ all -> 0x010d }
                byte[] r7 = new byte[r7]     // Catch:{ all -> 0x010d }
                r6.get(r7)     // Catch:{ all -> 0x010d }
                java.lang.String r1 = r1.Q()     // Catch:{ all -> 0x010d }
                r4.putByteArray(r1, r7)     // Catch:{ all -> 0x010d }
                goto L_0x00f5
            L_0x0088:
                java.lang.String r6 = r1.Q()     // Catch:{ all -> 0x010d }
                r7 = 14
                int r7 = r1.d((int) r7)     // Catch:{ all -> 0x010d }
                if (r7 == 0) goto L_0x009c
                int r8 = r1.c     // Catch:{ all -> 0x010d }
                int r7 = r7 + r8
                java.lang.String r1 = r1.f(r7)     // Catch:{ all -> 0x010d }
                goto L_0x009d
            L_0x009c:
                r1 = 0
            L_0x009d:
                r4.putCharSequence(r6, r1)     // Catch:{ all -> 0x010d }
                goto L_0x00f5
            L_0x00a1:
                java.lang.String r6 = r1.Q()     // Catch:{ all -> 0x010d }
                r9 = 12
                int r9 = r1.d((int) r9)     // Catch:{ all -> 0x010d }
                if (r9 == 0) goto L_0x00bb
                java.nio.ByteBuffer r10 = r1.d     // Catch:{ all -> 0x010d }
                int r1 = r1.c     // Catch:{ all -> 0x010d }
                int r9 = r9 + r1
                byte r1 = r10.get(r9)     // Catch:{ all -> 0x010d }
                if (r1 != 0) goto L_0x00b9
                goto L_0x00bc
            L_0x00b9:
                r7 = 1
                goto L_0x00bc
            L_0x00bb:
            L_0x00bc:
                r4.putBoolean(r6, r7)     // Catch:{ all -> 0x010d }
                goto L_0x00f5
            L_0x00c0:
                java.lang.String r6 = r1.Q()     // Catch:{ all -> 0x010d }
                r7 = 10
                int r7 = r1.d((int) r7)     // Catch:{ all -> 0x010d }
                if (r7 == 0) goto L_0x00d6
                java.nio.ByteBuffer r8 = r1.d     // Catch:{ all -> 0x010d }
                int r1 = r1.c     // Catch:{ all -> 0x010d }
                int r7 = r7 + r1
                float r1 = r8.getFloat(r7)     // Catch:{ all -> 0x010d }
                goto L_0x00d7
            L_0x00d6:
                r1 = 0
            L_0x00d7:
                r4.putFloat(r6, r1)     // Catch:{ all -> 0x010d }
                goto L_0x00f5
            L_0x00db:
                java.lang.String r6 = r1.Q()     // Catch:{ all -> 0x010d }
                r8 = 8
                int r8 = r1.d((int) r8)     // Catch:{ all -> 0x010d }
                if (r8 == 0) goto L_0x00f1
                java.nio.ByteBuffer r7 = r1.d     // Catch:{ all -> 0x010d }
                int r1 = r1.c     // Catch:{ all -> 0x010d }
                int r8 = r8 + r1
                int r7 = r7.getInt(r8)     // Catch:{ all -> 0x010d }
                goto L_0x00f2
            L_0x00f1:
            L_0x00f2:
                r4.putInt(r6, r7)     // Catch:{ all -> 0x010d }
            L_0x00f5:
                if (r5 >= r2) goto L_0x0104
                brw r1 = r12.a((defpackage.brw) r3, (int) r5)     // Catch:{ all -> 0x010d }
                int r1 = r1.T()     // Catch:{ all -> 0x010d }
                if (r1 != r0) goto L_0x0104
                r1 = r5
                goto L_0x0046
            L_0x0104:
                goto L_0x0107
            L_0x0105:
                android.os.Bundle r4 = android.os.Bundle.EMPTY     // Catch:{ all -> 0x010d }
            L_0x0107:
                r11.a = r4     // Catch:{ all -> 0x010d }
            L_0x0109:
                android.os.Bundle r12 = r11.a     // Catch:{ all -> 0x010d }
                monitor-exit(r11)
                return r12
            L_0x010d:
                r12 = move-exception
                monitor-exit(r11)
                goto L_0x0111
            L_0x0110:
                throw r12
            L_0x0111:
                goto L_0x0110
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.chimera.config.ModuleManager.ModuleInfo.getMetadata(android.content.Context):android.os.Bundle");
        }

        public ModuleInfo(bpa bpa, ModuleApkInfo moduleApkInfo, Bundle bundle) {
            super(bpa.b(), bpa.e());
            this.moduleApk = moduleApkInfo;
            this.a = null;
        }
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ModuleSetInfo {
        private final ansk a;
        public final String moduleSetId;
        @Deprecated
        public final int moduleSetVariant;
        @ChimeraApiVersion(added = 103)
        public final long moduleSetVersion;
        public final int moduleTargeting;

        public ModuleSetInfo(ansk ansk) {
            this.a = ansk;
            this.moduleSetId = ansk.b;
            this.moduleSetVariant = ansk.c;
            this.moduleSetVersion = ansk.e;
            this.moduleTargeting = ansk.d;
        }

        public byte[] getProtoBytes() {
            return this.a.k();
        }
    }

    public ModuleManager(Context context) {
        this.a = context.getApplicationContext();
        this.b = ModuleContext.getModuleContext(context);
    }

    private final void a() {
        try {
            boz f2 = bkv.a(this.a).f();
            amtf.a((Object) this.b);
            bnm e2 = this.b.getModuleApk().e();
            int a2 = bnj.a(e2.b);
            if (a2 == 0) {
                a2 = 1;
            }
            int a3 = bqj.a(f2, bqj.b, new bqg(a2 - 1, ByteBuffer.wrap(e2.c.getBytes((Charset) apxg.b.get()))));
            if (a3 >= 0) {
                this.d = new ModuleApkInfo(f2.a(a3));
                String moduleId = this.b.getModuleId();
                if (moduleId != null) {
                    this.c = new ModuleInfo(f2.a(moduleId), this.d);
                    return;
                }
                return;
            }
            throw new InvalidConfigException("missing ApkDescriptor");
        } catch (InvalidConfigException | NullPointerException e3) {
            amtf.a(false);
        }
    }

    public static ModuleManager get(Context context) {
        return new ModuleManager(context);
    }

    public static BasicModuleInfo getBasicModuleInfo(Context context) {
        String moduleId;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext == null || (moduleId = moduleContext.getModuleId()) == null) {
            return null;
        }
        return new BasicModuleInfo(moduleId, moduleContext.getModuleVersion());
    }

    public FeatureList fetchFeatures(String... strArr) {
        if (strArr.length == 0) {
            Log.e("ModuleManager", "Feature check call didn't receive any featureNames");
            return null;
        }
        try {
            return FeatureList.fromFeatures(bpr.a(bkv.a(this.a).f(), (Collection) Arrays.asList(strArr)));
        } catch (InvalidConfigException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Unable to retrieve available features: ");
            sb.append(valueOf);
            Log.e("ModuleManager", sb.toString());
            return null;
        }
    }

    public Collection getAllModules() {
        List list;
        boz f2 = bkv.a(this.a).f();
        synchronized (e) {
            bjv bjv = (bjv) e.get(f2);
            if (bjv != null) {
                list = bjv.b;
            } else {
                list = null;
            }
            if (list == null) {
                int b2 = f2.b();
                ModuleApkInfo[] moduleApkInfoArr = new ModuleApkInfo[b2];
                boy boy = new boy();
                for (int i = 0; i < b2; i++) {
                    f2.a(boy, i);
                    moduleApkInfoArr[i] = new ModuleApkInfo(boy);
                }
                int c2 = f2.c();
                ArrayList arrayList = new ArrayList(c2);
                bpa bpa = new bpa();
                for (int i2 = 0; i2 < c2; i2++) {
                    f2.a(bpa, i2);
                    arrayList.add(new ModuleInfo(bpa, moduleApkInfoArr[bpa.S()]));
                }
                list = Collections.unmodifiableList(arrayList);
                if (bjv == null) {
                    bjv = new bjv();
                    e.put(f2, bjv);
                }
                bjv.b = list;
            }
        }
        return list;
    }

    public Collection getAllModulesWithMetadata(String str) {
        ArrayList arrayList = new ArrayList();
        for (ModuleInfo moduleInfo : getAllModules()) {
            if (moduleInfo.getMetadata(this.a).get(str) != null) {
                arrayList.add(moduleInfo);
            }
        }
        return arrayList;
    }

    @ChimeraApiVersion(added = 100)
    public int getApiVersion(String str) {
        ModuleContext moduleContext = this.b;
        if (moduleContext != null) {
            return ((Integer) moduleContext.getFulfilledApis().getOrDefault(str, -1)).intValue();
        }
        Log.w("ModuleManager", "Unable to get current module's fulfilled APIs in ModuleManager created with non-module Context");
        return -2;
    }

    public ConfigInfo getCurrentConfig() {
        ConfigInfo configInfo;
        bkv a2 = bkv.a(this.a);
        boz f2 = a2.f();
        bpw c2 = a2.c(f2);
        synchronized (e) {
            bjv bjv = (bjv) e.get(f2);
            if (bjv != null) {
                configInfo = bjv.a;
            } else {
                configInfo = null;
            }
            if (configInfo == null) {
                int b2 = f2.b();
                SparseArray sparseArray = new SparseArray(b2 - 1);
                boy boy = new boy();
                int i = 0;
                for (int i2 = 0; i2 < b2; i2++) {
                    f2.a(boy, i2);
                    if (a(boy)) {
                        sparseArray.put(i2, new ModuleApkInfo(boy));
                    }
                }
                int c3 = f2.c();
                ArrayList arrayList = new ArrayList(c3);
                bpa bpa = new bpa();
                for (int i3 = 0; i3 < c3; i3++) {
                    f2.a(bpa, i3);
                    ModuleApkInfo moduleApkInfo = (ModuleApkInfo) sparseArray.get(bpa.S());
                    if (moduleApkInfo != null) {
                        arrayList.add(new ModuleInfo(bpa, moduleApkInfo));
                    }
                }
                ArrayList arrayList2 = new ArrayList(c2.size());
                Iterator it = c2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new ModuleSetInfo((ansk) it.next()));
                }
                if (f2.d() > 0) {
                    i = 1;
                }
                ConfigInfo configInfo2 = new ConfigInfo(arrayList2, arrayList, i);
                if (bjv == null) {
                    bjv = new bjv();
                    e.put(f2, bjv);
                }
                bjv.a = configInfo2;
                configInfo = configInfo2;
            }
        }
        return configInfo;
    }

    public ModuleInfo getCurrentModule() {
        ModuleInfo moduleInfo;
        ModuleContext moduleContext = this.b;
        if (moduleContext == null || moduleContext.getModuleId() == null) {
            throw new IllegalStateException("Unable to get current module info in ModuleManager created with non-module Context");
        }
        synchronized (this) {
            if (this.c == null) {
                a();
            }
            moduleInfo = this.c;
        }
        return moduleInfo;
    }

    public ModuleApkInfo getCurrentModuleApk() {
        ModuleApkInfo moduleApkInfo;
        if (this.b != null) {
            synchronized (this) {
                if (this.d == null) {
                    a();
                }
                moduleApkInfo = this.d;
            }
            return moduleApkInfo;
        }
        throw new IllegalStateException("Unable to get current module APK info in ModuleManager created with non-module Context");
    }

    public Uri getModuleProviderUri() {
        Uri build;
        if (g != null) {
            return g;
        }
        synchronized (f) {
            String str = null;
            try {
                boz f2 = bkv.a(this.a).f();
                Uri.Builder scheme = new Uri.Builder().scheme("content");
                int d2 = f2.d(18);
                if (d2 != 0) {
                    str = f2.f(d2 + f2.c);
                }
                build = scheme.authority(str).path("features").build();
                g = build;
            } catch (InvalidConfigException e2) {
                Log.e("ModuleManager", "Exception retrieving installed module configuration");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return build;
    }

    public Map getThirdPartyLicenses() {
        String n;
        boz f2 = bkv.a(this.a).f();
        Map a2 = qug.a();
        int b2 = f2.b();
        boy boy = new boy();
        for (int i = 0; i < b2; i++) {
            f2.a(boy, i);
            bms a3 = bms.a(this.a, boy);
            if (!(a3 == null || (n = a3.n()) == null)) {
                a2.put(new ModuleApkInfo(boy), n);
            }
        }
        return a2;
    }

    public boolean requestFeatures(FeatureRequest featureRequest) {
        String moduleId;
        ModuleContext moduleContext = this.b;
        if (moduleContext == null || (moduleId = moduleContext.getModuleId()) == null) {
            throw new IllegalStateException("Unable to get current module ID");
        }
        Uri moduleProviderUri = getModuleProviderUri();
        if (moduleProviderUri == null) {
            Log.e("ModuleManager", "Feature request call couldn't determine a suitable uri");
            return false;
        }
        Bundle bundle = null;
        try {
            bundle = this.a.getContentResolver().call(moduleProviderUri, "feature_request", (String) null, featureRequest.toContractBundle(moduleId));
        } catch (IllegalArgumentException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Feature request failed: ");
            sb.append(valueOf);
            Log.w("ModuleManager", sb.toString());
        }
        if (bundle == null || !bundle.getBoolean("result")) {
            return false;
        }
        return true;
    }

    @ChimeraApiVersion(added = 104)
    public int checkFeaturesAreAvailable(FeatureCheck featureCheck) {
        if (featureCheck.a.isEmpty()) {
            return 0;
        }
        try {
            return bpr.a(bkv.a(this.a).f(), featureCheck.getFeatureDescriptors());
        } catch (InvalidConfigException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Unable to retrieve available features: ");
            sb.append(valueOf);
            Log.e("ModuleManager", sb.toString());
            return 3;
        }
    }

    @Deprecated
    public int checkFeaturesAreAvailable(FeatureList featureList) {
        byte[] protoBytes = featureList.getProtoBytes();
        if (protoBytes == null || protoBytes.length == 0) {
            return 0;
        }
        try {
            return bpr.a(bkv.a(this.a).f(), protoBytes);
        } catch (InvalidConfigException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Unable to retrieve available features: ");
            sb.append(valueOf);
            Log.e("ModuleManager", sb.toString());
            return 3;
        }
    }

    /* access modifiers changed from: private */
    public static boolean a(boy boy) {
        return boy.k() == 2;
    }
}
