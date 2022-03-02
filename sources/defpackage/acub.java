package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.util.StatsLog;
import com.android.volley.toolbox.ImageRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acub {
    public static final how a = new how(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
    private static final int[] b = new int[0];

    public static int a(String str, acrk acrk, Context context) {
        hph hph = new hph(new hol(context, (String) null, (String) null), "PLATFORM_STATS_COUNTERS", 1024);
        String valueOf = String.valueOf(str);
        hph.c(valueOf.length() == 0 ? new String("PeriodicSingleTaskCountFor") : "PeriodicSingleTaskCountFor".concat(valueOf)).a();
        if (acrk.b()) {
            return b(str, acrk, context);
        }
        String valueOf2 = String.valueOf(str);
        hph.c(valueOf2.length() == 0 ? new String("PeriodicSingleTaskNotEnabledForTag") : "PeriodicSingleTaskNotEnabledForTag".concat(valueOf2)).a();
        hph.d();
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d5 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.String r15, defpackage.acrk r16, android.content.Context r17) {
        /*
            r4 = r17
            java.lang.String r1 = "ConsentApiCanLogException"
            hol r5 = new hol
            r0 = 0
            r5.<init>(r4, r0, r0)
            hph r6 = new hph
            java.lang.String r0 = "PLATFORM_STATS_COUNTERS"
            r2 = 1024(0x400, float:1.435E-42)
            r6.<init>(r5, r0, r2)
            boolean r0 = defpackage.azoi.b()
            java.lang.String r2 = ""
            r12 = 0
            if (r0 == 0) goto L_0x00ad
            java.lang.String[] r0 = b()
            int[] r3 = b
            boolean r0 = a((java.lang.String[]) r0, (int[]) r3)
            if (r0 == 0) goto L_0x0030
            actz r0 = new actz
            r0.<init>(r4)
            r0.a((java.lang.String) r2)
        L_0x0030:
            adry r0 = new adry
            r0.<init>()
            iby r2 = defpackage.adrz.a(r4, r0)
            r3 = r16
            java.lang.String r0 = r3.b
            acwa r7 = r2.f(r0)
            r8 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x005b, TimeoutException -> 0x0059, InterruptedException -> 0x0049 }
            defpackage.acws.a(r7, r8, r0)     // Catch:{ ExecutionException -> 0x005b, TimeoutException -> 0x0059, InterruptedException -> 0x0049 }
            goto L_0x0063
        L_0x0049:
            r0 = move-exception
            hox r0 = r6.c(r1)
            r0.a()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0063
        L_0x0059:
            r0 = move-exception
            goto L_0x005c
        L_0x005b:
            r0 = move-exception
        L_0x005c:
            hox r0 = r6.c(r1)
            r0.a()
        L_0x0063:
            boolean r0 = r7.b()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r7.d()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0076
            goto L_0x0085
        L_0x0076:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r1 = r2
            r2 = r15
            r3 = r16
            r4 = r17
            a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        L_0x0085:
            java.lang.String r0 = "PlatformStatsUtil"
            java.lang.String r1 = "canLog says can't log"
            android.util.Log.i(r0, r1)
            java.lang.String r0 = java.lang.String.valueOf(r15)
            java.lang.String r1 = "ConsentApiOptedOut"
            int r2 = r0.length()
            if (r2 != 0) goto L_0x009e
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x00a2
        L_0x009e:
            java.lang.String r0 = r1.concat(r0)
        L_0x00a2:
            hox r0 = r6.c(r0)
            r0.a()
            r6.d()
            return r12
        L_0x00ad:
            r3 = r16
            acro r0 = new acro
            r0.<init>()
            boolean r7 = defpackage.aznh.b()
            r0 = 1
            if (r7 == 0) goto L_0x00c3
            boolean r1 = r16.f()
            if (r1 == 0) goto L_0x00c3
            r8 = 1
            goto L_0x00c4
        L_0x00c3:
            r8 = 0
        L_0x00c4:
            boolean r9 = c()
            java.util.List r10 = defpackage.acro.a(r17)
            boolean r1 = defpackage.azmm.c()
            r13 = 2
            if (r1 != 0) goto L_0x00d4
            goto L_0x00f4
        L_0x00d4:
            if (r10 != 0) goto L_0x00f4
            java.lang.String r0 = java.lang.String.valueOf(r15)
            java.lang.String r1 = "PeriodicTaskSwaaDiCheckFailedFor"
            int r2 = r0.length()
            if (r2 != 0) goto L_0x00e8
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x00ec
        L_0x00e8:
            java.lang.String r0 = r1.concat(r0)
        L_0x00ec:
            hox r0 = r6.c(r0)
            r0.a()
            return r13
        L_0x00f4:
            boolean r1 = defpackage.azpm.c()
            if (r1 == 0) goto L_0x010c
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L_0x010c
            boolean r1 = defpackage.azmy.b()
            if (r1 != 0) goto L_0x0108
            r11 = 1
            goto L_0x010d
        L_0x0108:
            if (r9 == 0) goto L_0x010c
            r11 = 1
            goto L_0x010d
        L_0x010c:
            r11 = 0
        L_0x010d:
            if (r8 != 0) goto L_0x0134
            if (r9 != 0) goto L_0x0134
            if (r11 != 0) goto L_0x0134
            java.lang.String r0 = java.lang.String.valueOf(r15)
            java.lang.String r1 = "PeriodicTaskOptedOutFor"
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0125
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0129
        L_0x0125:
            java.lang.String r0 = r1.concat(r0)
        L_0x0129:
            hox r0 = r6.c(r0)
            r0.a()
            r6.d()
            return r12
        L_0x0134:
            if (r9 == 0) goto L_0x0156
            if (r11 == 0) goto L_0x0156
            java.lang.String r0 = java.lang.String.valueOf(r15)
            java.lang.String r1 = "PeriodicTaskOptCheckboxAndLockboxFor"
            int r14 = r0.length()
            if (r14 != 0) goto L_0x014a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x014e
        L_0x014a:
            java.lang.String r0 = r1.concat(r0)
        L_0x014e:
            hox r0 = r6.c(r0)
            r0.a()
            goto L_0x0195
        L_0x0156:
            if (r9 == 0) goto L_0x0176
            java.lang.String r0 = java.lang.String.valueOf(r15)
            java.lang.String r1 = "PeriodicTaskOnlyOptCheckboxFor"
            int r14 = r0.length()
            if (r14 != 0) goto L_0x016a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x016e
        L_0x016a:
            java.lang.String r0 = r1.concat(r0)
        L_0x016e:
            hox r0 = r6.c(r0)
            r0.a()
            goto L_0x0195
        L_0x0176:
            if (r11 == 0) goto L_0x0195
            java.lang.String r0 = java.lang.String.valueOf(r15)
            java.lang.String r1 = "PeriodicTaskOnlyOptLockboxFor"
            int r14 = r0.length()
            if (r14 != 0) goto L_0x018a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x018e
        L_0x018a:
            java.lang.String r0 = r1.concat(r0)
        L_0x018e:
            hox r0 = r6.c(r0)
            r0.a()
        L_0x0195:
            if (r8 == 0) goto L_0x01b4
            java.lang.String r0 = java.lang.String.valueOf(r15)
            java.lang.String r1 = "PeriodicTaskOptDogfooderFor"
            int r14 = r0.length()
            if (r14 != 0) goto L_0x01a9
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x01ad
        L_0x01a9:
            java.lang.String r0 = r1.concat(r0)
        L_0x01ad:
            hox r0 = r6.c(r0)
            r0.a()
        L_0x01b4:
            java.lang.String[] r0 = b()
            int[] r1 = b
            boolean r0 = a((java.lang.String[]) r0, (int[]) r1)
            if (r0 == 0) goto L_0x01c8
            actz r0 = new actz
            r0.<init>(r4)
            r0.a((java.lang.String) r2)
        L_0x01c8:
            r1 = 0
            r2 = r15
            r3 = r16
            r4 = r17
            boolean r0 = a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 == 0) goto L_0x01d5
            return r12
        L_0x01d5:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acub.b(java.lang.String, acrk, android.content.Context):int");
    }

    public static boolean c() {
        if (aznb.a.a().a() && acua.a(ihs.b())) {
            return false;
        }
        try {
            ick ick = (ick) acws.a(adrz.b(ihs.b()).o(), azmm.b(), TimeUnit.SECONDS);
            if (ick != null) {
                return ick.p();
            }
            return false;
        } catch (ExecutionException | TimeoutException e) {
            return false;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    private static void a(int i) {
        if (jkr.g()) {
            StatsLog.logEvent(i);
        }
    }

    private static void a(hph hph, String str, long j, boolean z) {
        String str2 = !z ? "_without_upload_account" : "_with_upload_account";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 10 + str2.length());
        sb.append(str);
        sb.append("_log_event");
        sb.append(str2);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 9 + str2.length());
        sb3.append(str);
        sb3.append("_log_size");
        sb3.append(str2);
        String sb4 = sb3.toString();
        hph.c(sb2).a();
        hph.b(sb4, a).a(j);
    }

    public static void a(iby iby, hol hol, hph hph, avvz avvz, boolean z, List list, boolean z2, boolean z3, boolean z4, String str, String str2, int i) {
        acwa acwa;
        iby iby2 = iby;
        hol hol2 = hol;
        hph hph2 = hph;
        avvz avvz2 = avvz;
        List list2 = list;
        boolean z5 = z2;
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        if (iby2 != null) {
            if (a(str4, hph2)) {
                acwa = iby2.a(str4, ((avwc) avvz.i()).k(), acuc.a(hph), i2);
            } else {
                acwa = iby2.a(str4, ((avwc) avvz.i()).k(), (adsa) new acty(), i2);
            }
            try {
                acws.a(acwa, 15000, TimeUnit.MILLISECONDS);
            } catch (ExecutionException | TimeoutException e) {
                hph2.c("ConsentApiUploadException").a();
            } catch (InterruptedException e2) {
                hph2.c("ConsentApiUploadException").a();
                Thread.currentThread().interrupt();
            }
        } else if (!z && !z5 && !z3) {
            hph2.c("REQUEST_UPLOAD_WITHOUG_CONSENT").a();
        } else if (z && (list2 == null || list.isEmpty())) {
            hph2.c("LOCKBOX_OPTED_IN_WITH_EMPTY_ACCOUNTS").a();
        } else {
            avwc avwc = (avwc) avvz.i();
            int i3 = avwc.U;
            if (i3 == -1) {
                i3 = aueh.a.a((Object) avwc).b(avwc);
                avwc.U = i3;
            }
            long j = (long) i3;
            boolean z6 = false;
            if (avvz2.c) {
                avvz.c();
                avvz2.c = false;
            }
            avwc avwc2 = (avwc) avvz2.b;
            avwc avwc3 = avwc.v;
            int i4 = avwc2.a | 524288;
            avwc2.a = i4;
            avwc2.n = z4;
            avwc2.a = i4 | 1048576;
            avwc2.o = z5;
            boolean b2 = azoo.b();
            if (avvz2.c) {
                avvz.c();
                avvz2.c = false;
            }
            avwc avwc4 = (avwc) avvz2.b;
            avwc4.a |= 67108864;
            avwc4.u = b2;
            if (z) {
                aucd o = anuv.g.o();
                int size = list.size();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                anuv anuv = (anuv) o.b;
                int i5 = anuv.a | 1;
                anuv.a = i5;
                anuv.b = size;
                anuv.a = i5 | 2;
                anuv.c = z5;
                if (avvz2.c) {
                    avvz.c();
                    avvz2.c = false;
                }
                avwc avwc5 = (avwc) avvz2.b;
                anuv anuv2 = (anuv) o.i();
                anuv2.getClass();
                avwc5.l = anuv2;
                avwc5.a |= 131072;
            }
            if (!z) {
                hoi a2 = hol2.a(((avwc) avvz.i()).k());
                a2.f = avsd.a(i);
                a2.d = str4;
                if (a(str4, hph2)) {
                    a2.a(acuc.a(hph));
                }
                a2.b();
                a(hph2, str3, j, false);
                a(str2.hashCode());
                return;
            }
            a(str2.hashCode());
            for (int i6 = 0; i6 < list.size(); i6++) {
                rox rox = (rox) list2.get(i6);
                avvz avvz3 = (avvz) avvz.clone();
                if (!azmy.b()) {
                    anuv anuv3 = ((avwc) avvz2.b).l;
                    if (anuv3 == null) {
                        anuv3 = anuv.g;
                    }
                    aucd aucd = (aucd) anuv3.c(5);
                    aucd.a((aucj) anuv3);
                    boolean d = rox.d();
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = z6;
                    }
                    anuv anuv4 = (anuv) aucd.b;
                    int i7 = anuv4.a | 8;
                    anuv4.a = i7;
                    anuv4.e = d;
                    anuv4.a = i7 | 4;
                    anuv4.d = i6;
                    if (avvz3.c) {
                        avvz3.c();
                        avvz3.c = false;
                    }
                    avwc avwc6 = (avwc) avvz3.b;
                    anuv anuv5 = (anuv) aucd.i();
                    anuv5.getClass();
                    avwc6.l = anuv5;
                    avwc6.a |= 131072;
                    z6 = false;
                } else {
                    anuv anuv6 = ((avwc) avvz2.b).l;
                    if (anuv6 == null) {
                        anuv6 = anuv.g;
                    }
                    aucd aucd2 = (aucd) anuv6.c(5);
                    aucd2.a((aucj) anuv6);
                    boolean c = rox.c();
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    anuv anuv7 = (anuv) aucd2.b;
                    int i8 = anuv7.a | 32;
                    anuv7.a = i8;
                    anuv7.f = c;
                    anuv7.a = i8 | 4;
                    anuv7.d = i6;
                    if (!avvz3.c) {
                        z6 = false;
                    } else {
                        avvz3.c();
                        z6 = false;
                        avvz3.c = false;
                    }
                    avwc avwc7 = (avwc) avvz3.b;
                    anuv anuv8 = (anuv) aucd2.i();
                    anuv8.getClass();
                    avwc7.l = anuv8;
                    avwc7.a |= 131072;
                }
                hoi a3 = hol2.a(((avwc) avvz3.i()).k());
                a3.c(rox.b());
                a3.f = avsd.a(i);
                a3.d = str4;
                if (a(str4, hph2)) {
                    a3.a(acuc.a(hph));
                }
                a3.b();
                a(hph2, str3, j, true);
            }
        }
    }

    public static String[] b() {
        try {
            return azox.a.a().a().split(",");
        } catch (Exception e) {
            Log.e("PlatformStatsUtil", "Failed to parse phenotype log source flags", e);
            return null;
        }
    }

    public static boolean a() {
        int i = Build.VERSION.SDK_INT;
        return Process.myUserHandle().isOwner();
    }

    private static boolean a(iby iby, String str, acrk acrk, Context context, hol hol, hph hph, boolean z, boolean z2, boolean z3, List list, boolean z4) {
        long convert = TimeUnit.MILLISECONDS.convert(acrk.c(), TimeUnit.SECONDS);
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        long j = sharedPreferences.getLong(":lastRunMsec", -1);
        long currentTimeMillis = System.currentTimeMillis() - acrk.d();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(":lastRunMsec", currentTimeMillis);
        edit.apply();
        long j2 = currentTimeMillis - j;
        long j3 = (j2 >= 0 && j2 <= convert + convert) ? j : currentTimeMillis - convert;
        try {
            avwc a2 = acrk.a(context, j3, currentTimeMillis, hph);
            if (a2 != null) {
                aucd aucd = (aucd) a2.c(5);
                aucd.a((aucj) a2);
                acrk.a(iby, hol, hph, (avvz) aucd, z4, list, z3, z2, z);
            }
            hph.d();
            return true;
        } catch (acrj e) {
            hph.c(String.valueOf(str).concat("CollectionException")).a();
            if (azpm.a.a().f()) {
                try {
                    avvz avvz = (avvz) avwc.v.o();
                    if (avvz.c) {
                        avvz.c();
                        avvz.c = false;
                    }
                    avwc avwc = (avwc) avvz.b;
                    int i = 1 | avwc.a;
                    avwc.a = i;
                    avwc.d = j3;
                    avwc.a = i | 2;
                    avwc.e = currentTimeMillis;
                    String d = amtb.d(e);
                    String substring = d.substring(0, Math.min((int) azpm.a.a().e(), d.length()));
                    aucd o = avwa.j.o();
                    auay a3 = auay.a(substring.getBytes("UTF-8"));
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avwa avwa = (avwa) o.b;
                    a3.getClass();
                    avwa.a |= 2;
                    avwa.c = a3;
                    avvz.a((avwa) o.i());
                    a(iby, hol, hph, avvz, z4, list, z3, z2, z, "collectionExceptions", "AM_COLLECTION_EXCEPTIONS", (int) azpm.b());
                    avwc avwc2 = (avwc) avvz.i();
                } catch (UnsupportedEncodingException e2) {
                    Log.w("PlatformStatsUtil", "UTF-8 charset is unsupported. Skip uploading.");
                }
            }
            hph.d();
            return false;
        } catch (Throwable th) {
            th = th;
            hph.d();
            throw th;
        }
    }

    public static boolean a(String str, hph hph) {
        if (!azou.a.a().a() || !jkr.h()) {
            return false;
        }
        SharedPreferences sharedPreferences = ihs.b().getSharedPreferences("com.google.android.metrics", 0);
        String valueOf = String.valueOf(str);
        try {
            return sharedPreferences.getBoolean(valueOf.length() == 0 ? new String("clearcut_add_external_ids_log_source_") : "clearcut_add_external_ids_log_source_".concat(valueOf), false);
        } catch (ClassCastException e) {
            hph.c("StatsClassCastException").a();
            return false;
        }
    }

    public static boolean a(String[] strArr, int[] iArr) {
        acwa a2 = yef.a((Context) ihs.b()).a("com.google.android.metrics", 1, strArr, iArr);
        try {
            acws.a(a2, azmm.b(), TimeUnit.SECONDS);
            return a2.b();
        } catch (ExecutionException | TimeoutException e) {
            return false;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            return false;
        }
    }
}
