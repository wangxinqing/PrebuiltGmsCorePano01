package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.format.DateFormat;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: aans  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aans extends aann {
    public static final long a = TimeUnit.MINUTES.toMillis(10);
    public static final long b = 102400;
    private static final Map c = new HashMap();

    static {
        aans.class.getSimpleName();
    }

    public static long a(long j) {
        return j * 1073741824;
    }

    public static byte[] b(File file) {
        FileInputStream fileInputStream;
        if (file != null) {
            if (c.containsKey(file)) {
                return (byte[]) c.get(file);
            }
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                try {
                    fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            fileInputStream.close();
                            byte[] digest = instance.digest();
                            c.put(file, digest);
                            return digest;
                        }
                        instance.update(bArr, 0, read);
                    }
                } catch (IOException e) {
                    return null;
                } catch (Throwable th) {
                    apev.a(th, th);
                }
            } catch (NoSuchAlgorithmException e2) {
            }
        }
        return null;
        throw th;
    }

    public static boolean c(Context context) {
        return new aaal(context).c();
    }

    public static boolean d(Context context) {
        int i = Build.VERSION.SDK_INT;
        return e(context) < 1500000000;
    }

    public static long e(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static boolean f(Context context) {
        int i = Build.VERSION.SDK_INT;
        return e(context) >= a(azfv.a.a().N());
    }

    public static aanr a(Context context, long j, long j2) {
        String str;
        if (j2 > j) {
            return null;
        }
        long j3 = j - j2;
        if (j3 < 691200000) {
            int i = (int) (j3 / 86400000);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d");
            if (!simpleDateFormat.format(Long.valueOf(j)).equals(simpleDateFormat.format(Long.valueOf((((long) i) * 86400000) + j2)))) {
                i++;
            }
            int i2 = 1;
            if (i <= 1) {
                if (DateFormat.is24HourFormat(context)) {
                    str = new SimpleDateFormat("HH:mm").format(new Date(j2));
                } else {
                    str = java.text.DateFormat.getTimeInstance(3, context.getResources().getConfiguration().locale).format(new Date(j2));
                }
                if (i != 0) {
                    i2 = 2;
                }
                return new aanr(i2, str);
            } else if (i <= 7) {
                return new aanr(i);
            }
        }
        if (j3 < 28857600000L) {
            return new aanr(4, new SimpleDateFormat("MMMM d").format(new Date(j2)));
        }
        return null;
    }

    public static Intent a(Context context, int i) {
        if (azfv.h()) {
            Intent intent = new Intent("com.google.android.finsky.PLAY_PROTECT").addCategory("android.intent.category.DEFAULT").setPackage("com.android.vending");
            if (azfv.k()) {
                intent.putExtra("gpp_home_user_entry_point", i - 1);
            }
            if (!context.getPackageManager().queryIntentActivities(intent, 65536).isEmpty()) {
                return intent;
            }
        }
        Intent a2 = aann.a(context, VerifyAppsSettingsChimeraActivity.class);
        if (azfv.k()) {
            a2.putExtra("gpp_home_user_entry_point", i - 1);
        }
        return a2;
    }

    public static File a(String str, Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                return new File(applicationInfo.sourceDir);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public static void a(StringBuilder sb, String str, String str2) {
        try {
            sb.append("&");
            sb.append(URLEncoder.encode(str, "UTF-8"));
            sb.append("=");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(URLEncoder.encode(str2, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("UTF-8 should be always supported", e);
        }
    }

    public static void a(jnb jnb, jmb jmb, int i, int i2) {
        jnb.a(i);
        jnb.b(i2);
        jnb.a(jmb);
    }

    public static boolean a(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085 A[SYNTHETIC, Splitter:B:45:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a A[SYNTHETIC, Splitter:B:56:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.lang.String r6, int r7, android.content.Context r8) {
        /*
            if (r7 == 0) goto L_0x0005
            defpackage.izj.b(r7)
        L_0x0005:
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x0095, all -> 0x0081 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0095, all -> 0x0081 }
            boolean r6 = defpackage.azfv.f()     // Catch:{ IOException -> 0x0095, all -> 0x0081 }
            if (r6 != 0) goto L_0x0018
            java.net.URLConnection r6 = defpackage.jlk.a(r1, r7)     // Catch:{ IOException -> 0x0095, all -> 0x0081 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x0095, all -> 0x0081 }
            goto L_0x002e
        L_0x0018:
            defpackage.izj.b(r7)     // Catch:{ IOException -> 0x0095, all -> 0x0081 }
            com.google.android.gms.net.PlayServicesCronetProvider r6 = new com.google.android.gms.net.PlayServicesCronetProvider     // Catch:{ IOException -> 0x0095, all -> 0x0081 }
            r6.<init>(r8)     // Catch:{ IOException -> 0x0095, all -> 0x0081 }
            org.chromium.net.CronetEngine$Builder r6 = r6.createBuilder()     // Catch:{ IOException -> 0x0095, all -> 0x0081 }
            org.chromium.net.CronetEngine r6 = r6.build()     // Catch:{ IOException -> 0x0095, all -> 0x0081 }
            java.net.URLConnection r6 = r6.openConnection(r1)     // Catch:{ IOException -> 0x0095, all -> 0x0081 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x0095, all -> 0x0081 }
        L_0x002e:
            int r8 = r6.getResponseCode()     // Catch:{ IOException -> 0x007e, all -> 0x0079 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r8 != r1) goto L_0x006e
            java.io.InputStream r8 = r6.getInputStream()     // Catch:{ IOException -> 0x007e, all -> 0x0079 }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x006c, all -> 0x0066 }
            r1.<init>()     // Catch:{ IOException -> 0x006c, all -> 0x0066 }
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x006c, all -> 0x0066 }
        L_0x0043:
            int r3 = r8.read(r2)     // Catch:{ IOException -> 0x006c, all -> 0x0066 }
            if (r3 >= 0) goto L_0x005f
            byte[] r0 = r1.toByteArray()     // Catch:{ IOException -> 0x006c, all -> 0x0066 }
            if (r8 == 0) goto L_0x0054
            r8.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0054
        L_0x0053:
            r8 = move-exception
        L_0x0054:
            if (r6 == 0) goto L_0x0059
            defpackage.jlk.a(r6)
        L_0x0059:
            if (r7 == 0) goto L_0x005e
            defpackage.izj.a()
        L_0x005e:
            return r0
        L_0x005f:
            if (r3 <= 0) goto L_0x0043
            r4 = 0
            r1.write(r2, r4, r3)     // Catch:{ IOException -> 0x006c, all -> 0x0066 }
            goto L_0x0043
        L_0x0066:
            r0 = move-exception
            r5 = r8
            r8 = r6
            r6 = r0
            r0 = r5
            goto L_0x0083
        L_0x006c:
            r1 = move-exception
            goto L_0x0098
        L_0x006e:
            if (r6 == 0) goto L_0x0073
            defpackage.jlk.a(r6)
        L_0x0073:
            if (r7 == 0) goto L_0x0078
            defpackage.izj.a()
        L_0x0078:
            return r0
        L_0x0079:
            r8 = move-exception
            r5 = r8
            r8 = r6
            r6 = r5
            goto L_0x0083
        L_0x007e:
            r8 = move-exception
            r8 = r0
            goto L_0x0098
        L_0x0081:
            r6 = move-exception
            r8 = r0
        L_0x0083:
            if (r0 == 0) goto L_0x008a
            r0.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x008a
        L_0x0089:
            r0 = move-exception
        L_0x008a:
            if (r8 == 0) goto L_0x008f
            defpackage.jlk.a(r8)
        L_0x008f:
            if (r7 == 0) goto L_0x0094
            defpackage.izj.a()
        L_0x0094:
            throw r6
        L_0x0095:
            r6 = move-exception
            r6 = r0
            r8 = r6
        L_0x0098:
            if (r8 == 0) goto L_0x009f
            r8.close()     // Catch:{ IOException -> 0x009e }
            goto L_0x009f
        L_0x009e:
            r8 = move-exception
        L_0x009f:
            if (r6 == 0) goto L_0x00a4
            defpackage.jlk.a(r6)
        L_0x00a4:
            if (r7 == 0) goto L_0x00a9
            defpackage.izj.a()
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aans.a(java.lang.String, int, android.content.Context):byte[]");
    }
}
