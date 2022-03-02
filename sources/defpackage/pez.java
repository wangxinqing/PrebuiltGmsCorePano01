package defpackage;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.Section;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: pez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pez implements afbu {
    public static final /* synthetic */ int f = 0;
    private static final String[] g = {"apps"};
    private static final QuerySpecification h;
    public final awdn a;
    public final awdn b;
    public final Executor c;
    public final pes d;
    public final Map e = new HashMap();
    private final PackageManager i;
    private final amsv j;
    private final aelh k;
    private final aelh l;
    private final aelh m;
    private final aalw n;
    private final pdd o;

    static {
        dti dti = new dti();
        dti.b();
        dti.a(new Section("name"));
        dti.a(new Section("package_name"));
        h = dti.a();
    }

    public pez(awdn awdn, pdd pdd, PackageManager packageManager, awdn awdn2, Executor executor, aalw aalw, pes pes, amsv amsv, aelh aelh, aelh aelh2, aelh aelh3) {
        this.a = awdn;
        this.o = pdd;
        this.i = packageManager;
        this.b = awdn2;
        this.c = executor;
        this.n = aalw;
        this.d = pes;
        this.j = amsv;
        this.k = aelh;
        this.l = aelh2;
        this.m = aelh3;
    }

    private final anua a(String str, String str2) {
        PackageInfo packageInfo;
        aucd o2 = anua.h.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anua anua = (anua) o2.b;
        str.getClass();
        int i2 = anua.a | 1;
        anua.a = i2;
        anua.b = str;
        str2.getClass();
        anua.a = i2 | 2;
        anua.c = str2;
        if (((Boolean) this.m.a()).booleanValue()) {
            try {
                if (Build.VERSION.SDK_INT < 28) {
                    packageInfo = this.i.getPackageInfo(str2, 64);
                    Iterable a2 = a(packageInfo.signatures);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anua anua2 = (anua) o2.b;
                    if (!anua2.f.a()) {
                        anua2.f = aucj.a(anua2.f);
                    }
                    auab.a(a2, (List) anua2.f);
                } else {
                    packageInfo = this.i.getPackageInfo(str2, 134217728);
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null) {
                        anue anue = (anue) anuf.e.o();
                        anue.a(a(signingInfo.getApkContentsSigners()));
                        anue.a(a(signingInfo.getSigningCertificateHistory()));
                        boolean hasMultipleSigners = signingInfo.hasMultipleSigners();
                        if (anue.c) {
                            anue.c();
                            anue.c = false;
                        }
                        anuf anuf = (anuf) anue.b;
                        anuf.a |= 1;
                        anuf.c = hasMultipleSigners;
                        boolean hasPastSigningCertificates = signingInfo.hasPastSigningCertificates();
                        if (anue.c) {
                            anue.c();
                            anue.c = false;
                        }
                        anuf anuf2 = (anuf) anue.b;
                        anuf2.a |= 2;
                        anuf2.d = hasPastSigningCertificates;
                        anuf anuf3 = (anuf) anue.i();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        anua anua3 = (anua) o2.b;
                        anuf3.getClass();
                        anua3.g = anuf3;
                        anua3.a |= 32;
                    }
                }
                long j2 = packageInfo.lastUpdateTime;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anua anua4 = (anua) o2.b;
                anua4.a |= 4;
                anua4.d = j2;
                int i3 = packageInfo.versionCode;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anua anua5 = (anua) o2.b;
                anua5.a |= 8;
                anua5.e = i3;
            } catch (PackageManager.NameNotFoundException e2) {
                String valueOf = String.valueOf(str2);
                Log.w("AppsUpload", valueOf.length() == 0 ? new String("Failed to get PackageInfo for Package Name ") : "Failed to get PackageInfo for Package Name ".concat(valueOf), e2);
            }
        } else {
            try {
                PackageInfo packageInfo2 = this.i.getPackageInfo(str2, 0);
                long j3 = packageInfo2.lastUpdateTime;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anua anua6 = (anua) o2.b;
                anua6.a |= 4;
                anua6.d = j3;
                int i4 = packageInfo2.versionCode;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anua anua7 = (anua) o2.b;
                anua7.a |= 8;
                anua7.e = i4;
            } catch (PackageManager.NameNotFoundException e3) {
                String valueOf2 = String.valueOf(str2);
                Log.w("AppsUpload", valueOf2.length() == 0 ? new String("Failed to get PackageInfo for Package Name ") : "Failed to get PackageInfo for Package Name ".concat(valueOf2), e3);
            }
        }
        return (anua) o2.i();
    }

    private final anuc a() {
        String str;
        long a2 = axrs.a.a().a();
        int b2 = (int) axrs.a.a().b();
        anub anub = (anub) anuc.e.o();
        int i2 = 0;
        while (((long) ((anuc) anub.b).b.size()) < a2) {
            try {
                SearchResults searchResults = (SearchResults) acws.a(this.n.a("", "com.google.android.gms", g, i2, b2, h), 5, TimeUnit.SECONDS);
                if (searchResults != null && !searchResults.a()) {
                    dua b3 = searchResults.iterator();
                    while (b3.hasNext() && ((long) ((anuc) anub.b).b.size()) < a2) {
                        dtz a3 = b3.next();
                        anub.a(a(a3.b("name"), a3.b("package_name")));
                    }
                    if (searchResults.g < b2) {
                        break;
                    }
                    i2 += b2;
                } else {
                    ((aetj) this.b.a()).a(12004);
                    if (searchResults != null) {
                        str = searchResults.a;
                    } else {
                        str = null;
                    }
                    String valueOf = String.valueOf(str);
                    throw new pey(valueOf.length() == 0 ? new String("Apps corpus query search result error: ") : "Apps corpus query search result error: ".concat(valueOf));
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                ((aetj) this.b.a()).a(12003);
                throw new pey("Apps corpus query failure", e2);
            }
        }
        String a4 = a(Build.MODEL);
        if (anub.c) {
            anub.c();
            anub.c = false;
        }
        anuc anuc = (anuc) anub.b;
        a4.getClass();
        anuc.a |= 2;
        anuc.d = a4;
        return (anuc) anub.i();
    }

    private static Iterable a(Signature[] signatureArr) {
        if (signatureArr == null) {
            return Collections.emptyList();
        }
        amzt j2 = amzy.j();
        try {
            for (Signature byteArray : signatureArr) {
                aucd o2 = anud.c.o();
                byte[] byteArray2 = byteArray.toByteArray();
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                instance.update(byteArray2);
                auay a2 = auay.a(instance.digest());
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anud anud = (anud) o2.b;
                a2.getClass();
                anud.a |= 1;
                anud.b = a2;
                j2.c((anud) o2.i());
            }
            return j2.a();
        } catch (NoSuchAlgorithmException e2) {
            Log.w("AppsUpload", "Failed to digest signature.", e2);
            return Collections.emptyList();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized java.lang.String a(java.lang.String r6) {
        /*
            java.lang.Class<pez> r0 = defpackage.pez.class
            monitor-enter(r0)
            if (r6 == 0) goto L_0x00d2
            axrs r1 = defpackage.axrs.a     // Catch:{ all -> 0x00d6 }
            axrt r1 = r1.a()     // Catch:{ all -> 0x00d6 }
            java.lang.String r1 = r1.c()     // Catch:{ all -> 0x00d6 }
            axrs r2 = defpackage.axrs.a     // Catch:{ all -> 0x00d6 }
            axrt r2 = r2.a()     // Catch:{ all -> 0x00d6 }
            java.lang.String r2 = r2.d()     // Catch:{ all -> 0x00d6 }
            boolean r3 = r1.isEmpty()     // Catch:{ all -> 0x00d6 }
            r4 = 0
            if (r3 != 0) goto L_0x003b
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x00d6 }
            if (r3 == 0) goto L_0x0027
            goto L_0x003b
        L_0x0027:
            auqb r3 = new auqb     // Catch:{ all -> 0x00d6 }
            r5 = 124(0x7c, float:1.74E-43)
            amsk r5 = defpackage.amsk.a((char) r5)     // Catch:{ all -> 0x00d6 }
            java.lang.Iterable r2 = r5.a((java.lang.CharSequence) r2)     // Catch:{ all -> 0x00d6 }
            java.util.ArrayList r2 = defpackage.anda.a((java.lang.Iterable) r2)     // Catch:{ all -> 0x00d6 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x00d6 }
            goto L_0x0071
        L_0x003b:
            auqb r3 = new auqb     // Catch:{ all -> 0x00d6 }
            r1 = 8
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x00d6 }
            java.lang.String r2 = "Sony"
            r1[r4] = r2     // Catch:{ all -> 0x00d6 }
            r2 = 1
            java.lang.String r5 = "HTC"
            r1[r2] = r5     // Catch:{ all -> 0x00d6 }
            r2 = 2
            java.lang.String r5 = "Samsung"
            r1[r2] = r5     // Catch:{ all -> 0x00d6 }
            r2 = 3
            java.lang.String r5 = "sonyericsson"
            r1[r2] = r5     // Catch:{ all -> 0x00d6 }
            r2 = 4
            java.lang.String r5 = "MICROMAX"
            r1[r2] = r5     // Catch:{ all -> 0x00d6 }
            r2 = 5
            java.lang.String r5 = "huawei"
            r1[r2] = r5     // Catch:{ all -> 0x00d6 }
            r2 = 6
            java.lang.String r5 = "nook"
            r1[r2] = r5     // Catch:{ all -> 0x00d6 }
            r2 = 7
            java.lang.String r5 = "ZTE"
            r1[r2] = r5     // Catch:{ all -> 0x00d6 }
            java.lang.String r2 = " -_"
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x00d6 }
            r3.<init>(r2, r1)     // Catch:{ all -> 0x00d6 }
        L_0x0071:
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x00d6 }
            if (r6 == 0) goto L_0x0082
            java.lang.String r1 = r3.a     // Catch:{ all -> 0x00d6 }
            amqm r1 = defpackage.amqm.c((java.lang.CharSequence) r1)     // Catch:{ all -> 0x00d6 }
            java.lang.String r1 = r1.b((java.lang.CharSequence) r6)     // Catch:{ all -> 0x00d6 }
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            java.lang.String r6 = defpackage.auqb.a(r6, r1)     // Catch:{ all -> 0x00d6 }
            amzy r1 = r3.b     // Catch:{ all -> 0x00d6 }
            anhk r1 = r1.listIterator()     // Catch:{ all -> 0x00d6 }
        L_0x008d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00d6 }
            if (r2 == 0) goto L_0x00ac
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00d6 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00d6 }
            boolean r3 = r6.startsWith(r2)     // Catch:{ all -> 0x00d6 }
            if (r3 == 0) goto L_0x008d
            int r1 = r2.length()     // Catch:{ all -> 0x00d6 }
            int r2 = r6.length()     // Catch:{ all -> 0x00d6 }
            java.lang.String r1 = r6.substring(r1, r2)     // Catch:{ all -> 0x00d6 }
            goto L_0x00ad
        L_0x00ac:
            r1 = r6
        L_0x00ad:
            java.lang.String r6 = defpackage.auqb.a(r6, r1)     // Catch:{ all -> 0x00d6 }
            r1 = 47
            int r1 = r6.indexOf(r1)     // Catch:{ all -> 0x00d6 }
            r2 = -1
            if (r1 == r2) goto L_0x00bf
            java.lang.String r1 = r6.substring(r4, r1)     // Catch:{ all -> 0x00d6 }
            goto L_0x00c0
        L_0x00bf:
            r1 = r6
        L_0x00c0:
            int r2 = r1.length()     // Catch:{ all -> 0x00d6 }
            r3 = 16
            if (r2 <= r3) goto L_0x00cc
            java.lang.String r1 = r1.substring(r4, r3)     // Catch:{ all -> 0x00d6 }
        L_0x00cc:
            java.lang.String r6 = defpackage.auqb.a(r6, r1)     // Catch:{ all -> 0x00d6 }
            monitor-exit(r0)
            return r6
        L_0x00d2:
            java.lang.String r6 = ""
            monitor-exit(r0)
            return r6
        L_0x00d6:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x00da
        L_0x00d9:
            throw r6
        L_0x00da:
            goto L_0x00d9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pez.a(java.lang.String):java.lang.String");
    }

    public final aorr a(Bundle bundle) {
        boolean z;
        anuc anuc;
        String str;
        anub anub;
        if (!pxb.a()) {
            z = ((Boolean) pba.i.c()).booleanValue();
        } else {
            z = ((Boolean) pba.l.c()).booleanValue();
        }
        if (z) {
            try {
                if (((Boolean) this.k.a()).booleanValue()) {
                    Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                    int i2 = Build.VERSION.SDK_INT;
                    if (!((Boolean) this.j.a()).booleanValue()) {
                        str = "android.intent.category.LAUNCHER";
                    } else {
                        str = "android.intent.category.LEANBACK_LAUNCHER";
                    }
                    intent.addCategory(str);
                    anub = (anub) anuc.e.o();
                    String a2 = a(Build.MODEL);
                    if (anub.c) {
                        anub.c();
                        anub.c = false;
                    }
                    anuc anuc2 = (anuc) anub.b;
                    a2.getClass();
                    anuc2.a |= 2;
                    anuc2.d = a2;
                    for (ResolveInfo next : this.i.queryIntentActivities(intent, 0)) {
                        anub.a(a(next.loadLabel(this.i).toString(), next.activityInfo.applicationInfo.packageName));
                    }
                    anuc = (anuc) anub.i();
                } else {
                    anuc = a();
                }
            } catch (Exception e2) {
                if (!((Boolean) this.l.a()).booleanValue()) {
                    anuc = (anuc) anub.i();
                } else {
                    throw e2;
                }
            } catch (pey e3) {
                Log.e("AppsUpload", "Failed to upload apps list", e3);
                return aorl.a((Object) null);
            }
            return aopr.a(aopr.a(this.o.a(), (amqy) new pev(this), this.c), (aoqb) new peu(this, anuc, bundle), this.c);
        }
        Log.v("AppsUpload", "Apps upload disabled");
        return aorl.a((Object) null);
    }
}
