package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import android.util.Xml;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: nsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsm {
    public final Context a;
    public String b;
    public String c;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/override");
    }

    public nsm(Context context) {
        this.a = context;
    }

    public static Context a(Context context, String str) {
        if (context.getPackageName().equals(str)) {
            return context;
        }
        try {
            return context.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public static int b(Context context, String str) {
        try {
            return jhg.b(context, str);
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }

    public final String c() {
        if (axkn.b()) {
            iva.a(aekv.b(this.a));
        } else if (!aekv.b(this.a)) {
            Log.e("GCM", "getToken: DirectBootUtils.isUserUnlocked() is false.");
        }
        if (this.c == null) {
            a();
        }
        return this.c;
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences("com.google.android.gcm", 4);
    }

    public static String a(Context context) {
        return context.getSharedPreferences("Checkin", 4).getString("CheckinService_versionInfo", "");
    }

    public final String b() {
        if (axkn.b()) {
            iva.a(aekv.b(this.a));
        } else if (!aekv.b(this.a)) {
            Log.e("GCM", "getAndroidId: DirectBootUtils.isUserUnlocked() is false.");
        }
        if (this.b == null) {
            a();
        }
        return this.b;
    }

    private static final String a(File file) {
        BufferedReader bufferedReader;
        try {
            if (file.exists() && file.canRead()) {
                bufferedReader = new BufferedReader(new FileReader(file));
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(bufferedReader);
                int eventType = newPullParser.getEventType();
                do {
                    if (eventType == 2) {
                        String name = newPullParser.getName();
                        String attributeValue = newPullParser.getAttributeValue((String) null, "name");
                        String attributeValue2 = newPullParser.getAttributeValue((String) null, "value");
                        if ("long".equals(name) && "CheckinTask_securityToken".equals(attributeValue) && attributeValue2 != null) {
                            bufferedReader.close();
                            return attributeValue2;
                        }
                    }
                    eventType = newPullParser.next();
                } while (eventType != 1);
                bufferedReader.close();
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Failed to read ");
            sb.append(valueOf);
            Log.e("GCM", sb.toString(), e);
        } catch (XmlPullParserException e2) {
            String valueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 16);
            sb2.append("Failed to parse ");
            sb2.append(valueOf2);
            Log.e("GCM", sb2.toString(), e2);
        } catch (Throwable th) {
            bufferedReader.close();
            throw th;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3 A[SYNTHETIC, Splitter:B:41:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0163 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r11 = this;
            java.lang.String r0 = "com.google.android.gsf"
            android.content.Context r1 = r11.a
            java.lang.String r2 = "GcmId"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            java.lang.String r2 = "gcmappid"
            r4 = 0
            java.lang.String r1 = r1.getString(r2, r4)
            boolean r2 = defpackage.awrq.h()
            java.lang.String r5 = ":"
            r6 = 1
            java.lang.String r7 = "GCM"
            if (r2 == 0) goto L_0x007e
            axlc r2 = defpackage.axlc.a
            axld r2 = r2.a()
            boolean r2 = r2.aj()
            if (r2 != 0) goto L_0x002a
            goto L_0x007f
        L_0x002a:
            if (r1 != 0) goto L_0x007e
            android.content.Context r2 = r11.a
            java.lang.String r8 = "checkin_id_token"
            java.io.FileInputStream r2 = r2.openFileInput(r8)     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0040 }
            java.lang.String r8 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0040 }
            byte[] r2 = defpackage.jjt.b((java.io.InputStream) r2)     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0040 }
            java.lang.String r9 = "UTF-8"
            r8.<init>(r2, r9)     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0040 }
            goto L_0x004a
        L_0x0040:
            r2 = move-exception
            java.lang.String r8 = "Error reading file: checkin_id_token"
            android.util.Log.w(r7, r8, r2)
            r8 = r4
            goto L_0x004a
        L_0x0048:
            r2 = move-exception
            r8 = r4
        L_0x004a:
            if (r8 == 0) goto L_0x007e
            java.lang.String[] r2 = r8.split(r5)
            int r9 = r2.length
            r10 = 2
            if (r9 == r10) goto L_0x006a
            java.lang.String r2 = "Invalid id-token:"
            int r9 = r8.length()
            if (r9 != 0) goto L_0x0062
            java.lang.String r8 = new java.lang.String
            r8.<init>(r2)
            goto L_0x0066
        L_0x0062:
            java.lang.String r8 = r2.concat(r8)
        L_0x0066:
            android.util.Log.w(r7, r8)
            goto L_0x007f
        L_0x006a:
            r9 = r2[r3]     // Catch:{ NumberFormatException -> 0x0077 }
            java.lang.Long.parseLong(r9)     // Catch:{ NumberFormatException -> 0x0077 }
            r2 = r2[r6]     // Catch:{ NumberFormatException -> 0x0077 }
            java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0077 }
            r1 = r8
            goto L_0x007f
        L_0x0077:
            r2 = move-exception
            java.lang.String r8 = "NumberFormatException while parsing id-token"
            android.util.Log.w(r7, r8, r2)
            goto L_0x007f
        L_0x007e:
        L_0x007f:
            if (r1 != 0) goto L_0x0164
            android.content.Context r1 = r11.a
            long r1 = defpackage.jhg.a((android.content.Context) r1)
            r8 = 0
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0092
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0093
        L_0x0092:
            r1 = r4
        L_0x0093:
            r11.b = r1
            android.content.Context r1 = r11.a     // Catch:{ Exception -> 0x00ba }
            android.content.Context r1 = a(r1, r0)     // Catch:{ Exception -> 0x00ba }
            if (r1 == 0) goto L_0x00b8
            java.lang.String r2 = "CheckinService"
            r5 = 4
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r5)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r2 = "CheckinTask_securityToken"
            long r1 = r1.getLong(r2, r8)     // Catch:{ Exception -> 0x00ba }
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x00b8
            java.lang.String r5 = "GCM config loaded"
            android.util.Log.i(r7, r5)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r1 = java.lang.Long.toString(r1)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00c1
        L_0x00b8:
            r1 = r4
            goto L_0x00c1
        L_0x00ba:
            r1 = move-exception
            java.lang.String r2 = "Unexpected error reading config file"
            android.util.Log.e(r7, r2, r1)
            r1 = r4
        L_0x00c1:
            if (r1 != 0) goto L_0x0159
            android.content.Context r1 = r11.a     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00ed, Exception -> 0x00e5 }
            android.content.Context r0 = a(r1, r0)     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00ed, Exception -> 0x00e5 }
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00ed, Exception -> 0x00e5 }
            java.lang.String r2 = "security_token"
            java.io.FileInputStream r0 = r0.openFileInput(r2)     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00ed, Exception -> 0x00e5 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00ed, Exception -> 0x00e5 }
            long r8 = r1.readLong()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = java.lang.Long.toString(r8)     // Catch:{ all -> 0x00e0 }
            r1.close()     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00ed, Exception -> 0x00e5 }
            goto L_0x00fc
        L_0x00e0:
            r0 = move-exception
            r1.close()     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00ed, Exception -> 0x00e5 }
            throw r0     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00ed, Exception -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            java.lang.String r0 = "GCM error reading backup config file"
            android.util.Log.e(r7, r0)
            r0 = r4
            goto L_0x00fc
        L_0x00ed:
            r0 = move-exception
            java.lang.String r0 = "GCM failed to read backup checkin config, checkin may have failed"
            android.util.Log.e(r7, r0)
            r0 = r4
            goto L_0x00fc
        L_0x00f5:
            r0 = move-exception
            java.lang.String r0 = "Missing checkin config file"
            android.util.Log.e(r7, r0)
            r0 = r4
        L_0x00fc:
            if (r0 != 0) goto L_0x0157
            android.content.Context r0 = r11.a
            java.lang.String r1 = "APP"
            java.io.File r0 = r0.getDir(r1, r3)
            java.io.File r0 = r0.getParentFile()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = ".gms"
            java.lang.String r2 = ".gsf"
            java.lang.String r0 = r0.replace(r1, r2)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "shared_prefs/CheckinService.xml"
            r0.<init>(r1, r2)
            java.lang.String r0 = a((java.io.File) r0)
            if (r0 != 0) goto L_0x0155
            axlc r0 = defpackage.axlc.a
            axld r0 = r0.a()
            java.lang.String r0 = r0.W()
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 0
        L_0x013a:
            if (r2 >= r1) goto L_0x014e
            r5 = r0[r2]
            java.io.File r8 = new java.io.File
            r8.<init>(r5)
            java.lang.String r5 = a((java.io.File) r8)
            if (r5 != 0) goto L_0x014c
            int r2 = r2 + 1
            goto L_0x013a
        L_0x014c:
            r4 = r5
            goto L_0x015a
        L_0x014e:
            java.lang.String r0 = "GCM FAILED TO INITIALIZE - missing checkin"
            android.util.Log.w(r7, r0)
            goto L_0x015a
        L_0x0155:
            r4 = r0
            goto L_0x015a
        L_0x0157:
            r4 = r0
            goto L_0x015a
        L_0x0159:
            r4 = r1
        L_0x015a:
            if (r4 == 0) goto L_0x0163
            java.lang.String r0 = r11.b
            if (r0 == 0) goto L_0x0163
            r11.c = r4
            return r6
        L_0x0163:
            return r3
        L_0x0164:
            java.lang.String[] r0 = r1.split(r5)
            r1 = r0[r3]
            r11.b = r1
            r0 = r0[r6]
            r11.c = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsm.a():boolean");
    }
}
