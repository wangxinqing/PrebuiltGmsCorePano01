package defpackage;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import java.io.IOException;

/* renamed from: qhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhk implements qhj {
    public final qiz a;
    public final qja b;
    public final jhr c;
    public final PackageManager d;

    public qhk(qiz qiz, qja qja, Context context) {
        this.a = qiz;
        this.b = qja;
        this.c = jhr.a(context);
        this.d = context.getPackageManager();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        r18 = r4;
        r16 = r5;
        r9 = r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.content.pm.ResolveInfo a(java.lang.String r19, defpackage.qhb r20, android.content.Intent r21, int r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
            java.util.Set r3 = r21.getCategories()
            if (r3 != 0) goto L_0x0011
            java.util.Set r3 = java.util.Collections.emptySet()
            goto L_0x0015
        L_0x0011:
            java.util.Set r3 = r21.getCategories()
        L_0x0015:
            java.lang.String r4 = r21.getAction()
            android.content.ComponentName r5 = r21.getComponent()
            aucx r6 = r1.e
            int r7 = r6.size()
            r9 = 0
        L_0x0024:
            r10 = 0
            if (r9 >= r7) goto L_0x00c1
            java.lang.Object r11 = r6.get(r9)
            qgz r11 = (defpackage.qgz) r11
            if (r5 != 0) goto L_0x0030
            goto L_0x004d
        L_0x0030:
            java.lang.String r12 = r11.a
            java.lang.String r13 = r5.getClassName()
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x004d
            java.lang.String r12 = r5.getPackageName()
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x004d
            qhd r10 = (defpackage.qhd) r10
            android.content.pm.ResolveInfo r0 = defpackage.qlr.a(r0, r1, r11, r10, r2)
            return r0
        L_0x004d:
            aucx r10 = r11.j
            int r12 = r10.size()
            r13 = 0
        L_0x0054:
            int r14 = r9 + 1
            if (r13 >= r12) goto L_0x00ba
            java.lang.Object r14 = r10.get(r13)
            qhd r14 = (defpackage.qhd) r14
            aucx r15 = r14.b
            int r15 = r15.size()
            if (r15 <= 0) goto L_0x006e
            java.util.HashSet r15 = new java.util.HashSet
            aucx r8 = r14.b
            r15.<init>(r8)
            goto L_0x0072
        L_0x006e:
            java.util.Set r15 = java.util.Collections.emptySet()
        L_0x0072:
            aucx r8 = r14.a
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0084
            java.util.HashSet r8 = new java.util.HashSet
            r16 = r5
            aucx r5 = r14.a
            r8.<init>(r5)
            goto L_0x008a
        L_0x0084:
            r16 = r5
            java.util.Set r8 = java.util.Collections.emptySet()
        L_0x008a:
            int r5 = r15.size()
            r15.removeAll(r3)
            int r17 = r8.size()
            r8.remove(r4)
            int r8 = r8.size()
            r18 = r4
            int r4 = r17 + -1
            if (r8 != r4) goto L_0x00b3
            int r4 = r15.size()
            int r8 = r3.size()
            int r5 = r5 - r8
            if (r4 == r5) goto L_0x00ae
            goto L_0x00b3
        L_0x00ae:
            android.content.pm.ResolveInfo r0 = defpackage.qlr.a(r0, r1, r11, r14, r2)
            return r0
        L_0x00b3:
            int r13 = r13 + 1
            r5 = r16
            r4 = r18
            goto L_0x0054
        L_0x00ba:
            r18 = r4
            r16 = r5
            r9 = r14
            goto L_0x0024
        L_0x00c1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhk.a(java.lang.String, qhb, android.content.Intent, int):android.content.pm.ResolveInfo");
    }

    public final PackageInfo b(String str, int i) {
        Signature[] signatureArr;
        ServiceInfo[] serviceInfoArr;
        ActivityInfo[] activityInfoArr;
        FeatureInfo[] featureInfoArr;
        qhb b2 = this.a.b(str);
        ProviderInfo[] providerInfoArr = null;
        if (b2 == null || b2.d == null) {
            return null;
        }
        qiz qiz = this.a;
        qiz.b();
        byte[] a2 = qiz.c.a(qiz.k(str));
        if (a2 != null) {
            qix qix = (qix) aucj.a((aucj) qix.b, a2, aubs.b());
            signatureArr = new Signature[qix.a.size()];
            for (int i2 = 0; i2 < qix.a.size(); i2++) {
                signatureArr[i2] = new Signature(((auay) qix.a.get(i2)).k());
            }
        } else {
            signatureArr = null;
        }
        Integer a3 = this.b.a(str);
        if (b2.d == null) {
            return null;
        }
        ApplicationInfo a4 = qlr.a(str, i, b2, a3);
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.applicationInfo = a4;
        packageInfo.packageName = str;
        packageInfo.versionCode = b2.h;
        if (!b2.i.isEmpty()) {
            packageInfo.versionName = b2.i;
        }
        if ((i & FragmentTransaction.TRANSIT_ENTER_MASK) != 0) {
            packageInfo.requestedPermissions = qlr.b(b2.a);
        }
        if ((i & 16384) != 0) {
            aucx aucx = b2.b;
            if (!aucx.isEmpty()) {
                featureInfoArr = new FeatureInfo[aucx.size()];
                for (int i3 = 0; i3 < aucx.size(); i3++) {
                    qhg qhg = (qhg) aucx.get(i3);
                    FeatureInfo featureInfo = new FeatureInfo();
                    featureInfo.name = qhg.a;
                    featureInfo.reqGlEsVersion = qhg.c;
                    int i4 = qhg.b;
                    char c2 = 2;
                    if (i4 != 0) {
                        c2 = i4 != 1 ? i4 != 2 ? (char) 0 : 4 : 3;
                    }
                    if (c2 != 0 && c2 == 3) {
                        featureInfo.flags = 1;
                    } else {
                        featureInfo.flags = 0;
                    }
                    featureInfoArr[i3] = featureInfo;
                }
            } else {
                featureInfoArr = null;
            }
            packageInfo.reqFeatures = featureInfoArr;
        }
        if ((i & 64) != 0) {
            packageInfo.signatures = signatureArr;
        }
        if (a4 != null) {
            if ((i & 1) != 0) {
                aucx aucx2 = b2.e;
                if (!aucx2.isEmpty()) {
                    activityInfoArr = new ActivityInfo[aucx2.size()];
                    for (int i5 = 0; i5 < aucx2.size(); i5++) {
                        activityInfoArr[i5] = qlr.a(a4, (qgz) aucx2.get(i5), i);
                    }
                } else {
                    activityInfoArr = null;
                }
                packageInfo.activities = activityInfoArr;
            }
            if ((i & 4) != 0) {
                aucx aucx3 = b2.f;
                if (!aucx3.isEmpty()) {
                    serviceInfoArr = new ServiceInfo[aucx3.size()];
                    for (int i6 = 0; i6 < aucx3.size(); i6++) {
                        qhf qhf = (qhf) aucx3.get(i6);
                        ServiceInfo serviceInfo = new ServiceInfo();
                        serviceInfo.applicationInfo = a4;
                        serviceInfo.packageName = a4.packageName;
                        serviceInfo.name = qhf.e;
                        serviceInfo.icon = qhf.b;
                        if ((i & 128) != 0) {
                            serviceInfo.metaData = qlr.a(qhf.f);
                        }
                        serviceInfo.labelRes = qhf.c;
                        if (!qhf.d.isEmpty()) {
                            serviceInfo.nonLocalizedLabel = qhf.d;
                        }
                        serviceInfo.enabled = !qhf.a;
                        serviceInfoArr[i6] = serviceInfo;
                    }
                } else {
                    serviceInfoArr = null;
                }
                packageInfo.services = serviceInfoArr;
            }
            if ((i & 8) != 0) {
                aucx aucx4 = b2.g;
                if (!aucx4.isEmpty()) {
                    providerInfoArr = new ProviderInfo[aucx4.size()];
                    for (int i7 = 0; i7 < aucx4.size(); i7++) {
                        qhc qhc = (qhc) aucx4.get(i7);
                        ProviderInfo providerInfo = new ProviderInfo();
                        providerInfo.applicationInfo = a4;
                        providerInfo.packageName = a4.packageName;
                        providerInfo.name = qhc.e;
                        providerInfo.icon = qhc.b;
                        if ((i & 128) != 0) {
                            providerInfo.metaData = qlr.a(qhc.g);
                        }
                        providerInfo.labelRes = qhc.c;
                        if (!qhc.d.isEmpty()) {
                            providerInfo.nonLocalizedLabel = qhc.d;
                        }
                        providerInfo.enabled = !qhc.a;
                        providerInfo.authority = qhc.f;
                        providerInfo.initOrder = qhc.h;
                        providerInfo.grantUriPermissions = true;
                        providerInfoArr[i7] = providerInfo;
                    }
                }
                packageInfo.providers = providerInfoArr;
            }
        }
        return packageInfo;
    }

    public final ApplicationInfo a(String str, int i) {
        qhb b2 = this.a.b(str);
        if (b2 == null || b2.d == null) {
            return null;
        }
        return qlr.a(str, i, b2, this.b.a(str));
    }

    public final Integer a(String str) {
        return this.b.a(str);
    }

    public final String a(int i) {
        return this.b.b(i);
    }

    public final boolean a(int i, String str) {
        String a2 = a(i);
        return a2 != null && a2.equals(str);
    }

    public final boolean a(String str, String str2) {
        try {
            qit a2 = this.a.a(str);
            if (a2 == null) {
                return false;
            }
            aucx aucx = a2.a;
            if (aucx.contains(str2) || (str2.equals("android.permission.ACCESS_COARSE_LOCATION") && aucx.contains("android.permission.ACCESS_FINE_LOCATION"))) {
                return true;
            }
            return false;
        } catch (IOException e) {
            Log.e("IAMetadataManagerImpl", "Error reading permissions", e);
            return false;
        }
    }
}
