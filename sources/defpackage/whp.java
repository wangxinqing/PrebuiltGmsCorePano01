package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.nearby.sharing.Attachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: whp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class whp {
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.nearby.sharing.TextAttachment a(android.content.Context r8, android.content.Intent r9) {
        /*
            java.lang.String r9 = defpackage.wih.a(r9)
            if (r9 == 0) goto L_0x00ae
            boolean r0 = android.webkit.URLUtil.isValidUrl(r9)
            java.lang.String r1 = ""
            java.lang.String r2 = "url"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0014
            r1 = r2
            goto L_0x0063
        L_0x0014:
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            if (r0 < r5) goto L_0x0062
            java.lang.Class<android.view.textclassifier.TextClassificationManager> r0 = android.view.textclassifier.TextClassificationManager.class
            java.lang.Object r8 = r8.getSystemService(r0)
            android.view.textclassifier.TextClassificationManager r8 = (android.view.textclassifier.TextClassificationManager) r8
            android.view.textclassifier.TextClassifier r8 = r8.getTextClassifier()
            int r0 = r9.length()
            android.os.LocaleList r5 = new android.os.LocaleList
            java.util.Locale[] r6 = new java.util.Locale[r3]
            java.util.Locale r7 = java.util.Locale.US
            r6[r4] = r7
            r5.<init>(r6)
            android.view.textclassifier.TextClassification r8 = r8.classifyText(r9, r4, r0, r5)
            int r0 = r8.getEntityCount()
            if (r0 > 0) goto L_0x0040
            goto L_0x0046
        L_0x0040:
            java.lang.String r8 = r8.getEntity(r4)
            r1 = r8
        L_0x0046:
            jjg r8 = defpackage.vvj.a
            anie r8 = r8.d()
            anih r8 = (defpackage.anih) r8
            r0 = 117(0x75, float:1.64E-43)
            java.lang.String r5 = "wih"
            java.lang.String r6 = "a"
            java.lang.String r7 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r8 = r8.a((java.lang.String) r5, (java.lang.String) r6, (int) r0, (java.lang.String) r7)
            anih r8 = (defpackage.anih) r8
            java.lang.String r0 = "Text %s classified as %s"
            r8.a((java.lang.String) r0, (java.lang.Object) r9, (java.lang.Object) r1)
            goto L_0x0063
        L_0x0062:
        L_0x0063:
            int r8 = r1.hashCode()
            r0 = -1147692044(0xffffffffbb979bf4, float:-0.0046267454)
            r5 = 2
            if (r8 == r0) goto L_0x008a
            r0 = 116079(0x1c56f, float:1.62661E-40)
            if (r8 == r0) goto L_0x0082
            r0 = 106642798(0x65b3d6e, float:4.1234453E-35)
            if (r8 == r0) goto L_0x0078
            goto L_0x0094
        L_0x0078:
            java.lang.String r8 = "phone"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0094
            r8 = 2
            goto L_0x0095
        L_0x0082:
            boolean r8 = r1.equals(r2)
            if (r8 == 0) goto L_0x0094
            r8 = 0
            goto L_0x0095
        L_0x008a:
            java.lang.String r8 = "address"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0094
            r8 = 1
            goto L_0x0095
        L_0x0094:
            r8 = -1
        L_0x0095:
            if (r8 == 0) goto L_0x00a1
            if (r8 == r3) goto L_0x009f
            if (r8 == r5) goto L_0x009d
            r3 = 0
            goto L_0x00a2
        L_0x009d:
            r3 = 3
            goto L_0x00a2
        L_0x009f:
            r3 = 2
            goto L_0x00a2
        L_0x00a1:
        L_0x00a2:
            vtt r8 = new vtt
            r8.<init>(r9)
            r8.a = r3
            com.google.android.gms.nearby.sharing.TextAttachment r8 = r8.a()
            return r8
        L_0x00ae:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whp.a(android.content.Context, android.content.Intent):com.google.android.gms.nearby.sharing.TextAttachment");
    }

    public static String b(Intent intent) {
        ClipDescription description;
        ClipData clipData = intent.getClipData();
        if (clipData == null || (description = clipData.getDescription()) == null || description.getMimeTypeCount() == 0) {
            return "application/octet-stream";
        }
        String mimeType = description.getMimeType(0);
        if (TextUtils.isEmpty(mimeType)) {
            mimeType = "application/octet-stream";
        }
        for (int i = 1; i < description.getMimeTypeCount(); i++) {
            if (!mimeType.equals(description.getMimeType(i))) {
                return "application/octet-stream";
            }
        }
        return mimeType;
    }

    public static List b(Context context, Intent intent) {
        int i;
        Uri[] a = whw.a(intent);
        String b = b(intent);
        ArrayList arrayList = new ArrayList(r2);
        for (Uri uri : a) {
            String b2 = whw.b(context, uri, b);
            String a2 = whw.a(context, uri, b2);
            String b3 = whw.b(context, uri, b2);
            if (!b3.startsWith("image")) {
                i = !b3.startsWith("video") ? b3.startsWith("audio") ? 4 : 0 : 2;
            } else {
                i = 1;
            }
            long b4 = whw.b(context, uri);
            vja vja = new vja(a2);
            vja.c = i;
            vja.b = b4;
            vja.a = uri;
            vja.d = b2;
            arrayList.add(vja.a());
        }
        return arrayList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.nearby.sharing.WifiCredentialsAttachment a(android.content.Intent r9) {
        /*
            boolean r0 = defpackage.ayni.R()
            r1 = 0
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = "android.intent.extra.WIFI_CREDENTIALS_BUNDLE"
            android.os.Bundle r9 = r9.getBundleExtra(r0)
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r2 = "a"
            java.lang.String r3 = "whp"
            if (r9 != 0) goto L_0x002b
            jjg r9 = defpackage.vvj.a
            anie r9 = r9.d()
            anih r9 = (defpackage.anih) r9
            r4 = 77
            anie r9 = r9.a((java.lang.String) r3, (java.lang.String) r2, (int) r4, (java.lang.String) r0)
            anih r9 = (defpackage.anih) r9
            java.lang.String r0 = "Failed to get WifiCredentials from the intent. The WifiCredentialsBundle is null."
            r9.a((java.lang.String) r0)
            return r1
        L_0x002b:
            java.lang.String r4 = "android.intent.extra.SSID"
            java.lang.String r4 = r9.getString(r4)
            java.lang.String r5 = "android.intent.extra.SECURITY_TYPE"
            java.lang.String r5 = r9.getString(r5)
            java.lang.String r6 = "android.intent.extra.HIDDEN_SSID"
            boolean r6 = r9.getBoolean(r6)
            if (r4 != 0) goto L_0x0057
            jjg r9 = defpackage.vvj.a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            r4 = 92
            anie r9 = r9.a((java.lang.String) r3, (java.lang.String) r2, (int) r4, (java.lang.String) r0)
            anih r9 = (defpackage.anih) r9
            java.lang.String r0 = "Failed to get WifiCredentials from the intent. Ssid is null"
            r9.a((java.lang.String) r0)
            goto L_0x00d6
        L_0x0057:
            if (r5 == 0) goto L_0x00c1
            jjg r0 = defpackage.vvj.a
            java.lang.String r0 = "android.intent.extra.PASSWORD"
            java.lang.String r9 = r9.getString(r0)
            vty r0 = new vty
            r0.<init>(r4)
            int r1 = r5.hashCode()
            r2 = 0
            r3 = 4
            r4 = 3
            r7 = 2
            r8 = 1
            switch(r1) {
                case 85826: goto L_0x009b;
                case 86152: goto L_0x0091;
                case 2402104: goto L_0x0087;
                case 2670762: goto L_0x007d;
                case 2670763: goto L_0x0073;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x00a5
        L_0x0073:
            java.lang.String r1 = "WPA3"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x00a5
            r1 = 2
            goto L_0x00a6
        L_0x007d:
            java.lang.String r1 = "WPA2"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x00a5
            r1 = 1
            goto L_0x00a6
        L_0x0087:
            java.lang.String r1 = "NONE"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x00a5
            r1 = 4
            goto L_0x00a6
        L_0x0091:
            java.lang.String r1 = "WPA"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x00a5
            r1 = 0
            goto L_0x00a6
        L_0x009b:
            java.lang.String r1 = "WEP"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x00a5
            r1 = 3
            goto L_0x00a6
        L_0x00a5:
            r1 = -1
        L_0x00a6:
            if (r1 == 0) goto L_0x00b5
            if (r1 == r8) goto L_0x00b5
            if (r1 == r7) goto L_0x00b5
            if (r1 == r4) goto L_0x00b3
            if (r1 == r3) goto L_0x00b1
            goto L_0x00b6
        L_0x00b1:
            r2 = 1
            goto L_0x00b6
        L_0x00b3:
            r2 = 3
            goto L_0x00b6
        L_0x00b5:
            r2 = 2
        L_0x00b6:
            r0.a = r2
            r0.b = r9
            r0.c = r6
            com.google.android.gms.nearby.sharing.WifiCredentialsAttachment r1 = r0.a()
            goto L_0x00d6
        L_0x00c1:
            jjg r9 = defpackage.vvj.a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            r4 = 96
            anie r9 = r9.a((java.lang.String) r3, (java.lang.String) r2, (int) r4, (java.lang.String) r0)
            anih r9 = (defpackage.anih) r9
            java.lang.String r0 = "Failed to get WifiCredentials from the intent. Security type is null"
            r9.a((java.lang.String) r0)
        L_0x00d6:
            return r1
        L_0x00d7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whp.a(android.content.Intent):com.google.android.gms.nearby.sharing.WifiCredentialsAttachment");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.nearby.sharing.WifiCredentialsAttachment a(android.os.Bundle r9) {
        /*
            java.lang.String r0 = "android.intent.extra.SSID"
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r1 = "android.intent.extra.SECURITY_TYPE"
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r2 = "android.intent.extra.HIDDEN_SSID"
            boolean r2 = r9.getBoolean(r2)
            r3 = 0
            java.lang.String r4 = "whp"
            java.lang.String r5 = "a"
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r0 != 0) goto L_0x0031
            jjg r9 = defpackage.vvj.a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            r0 = 92
            anie r9 = r9.a((java.lang.String) r4, (java.lang.String) r5, (int) r0, (java.lang.String) r6)
            anih r9 = (defpackage.anih) r9
            java.lang.String r0 = "Failed to get WifiCredentials from the intent. Ssid is null"
            r9.a((java.lang.String) r0)
            return r3
        L_0x0031:
            if (r1 == 0) goto L_0x009b
            jjg r3 = defpackage.vvj.a
            java.lang.String r3 = "android.intent.extra.PASSWORD"
            java.lang.String r9 = r9.getString(r3)
            vty r3 = new vty
            r3.<init>(r0)
            int r0 = r1.hashCode()
            r4 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r0) {
                case 85826: goto L_0x0075;
                case 86152: goto L_0x006b;
                case 2402104: goto L_0x0061;
                case 2670762: goto L_0x0057;
                case 2670763: goto L_0x004d;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x007f
        L_0x004d:
            java.lang.String r0 = "WPA3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007f
            r0 = 2
            goto L_0x0080
        L_0x0057:
            java.lang.String r0 = "WPA2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007f
            r0 = 1
            goto L_0x0080
        L_0x0061:
            java.lang.String r0 = "NONE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007f
            r0 = 4
            goto L_0x0080
        L_0x006b:
            java.lang.String r0 = "WPA"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007f
            r0 = 0
            goto L_0x0080
        L_0x0075:
            java.lang.String r0 = "WEP"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007f
            r0 = 3
            goto L_0x0080
        L_0x007f:
            r0 = -1
        L_0x0080:
            if (r0 == 0) goto L_0x008f
            if (r0 == r8) goto L_0x008f
            if (r0 == r7) goto L_0x008f
            if (r0 == r6) goto L_0x008d
            if (r0 == r5) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            r4 = 1
            goto L_0x0090
        L_0x008d:
            r4 = 3
            goto L_0x0090
        L_0x008f:
            r4 = 2
        L_0x0090:
            r3.a = r4
            r3.b = r9
            r3.c = r2
            com.google.android.gms.nearby.sharing.WifiCredentialsAttachment r9 = r3.a()
            return r9
        L_0x009b:
            jjg r9 = defpackage.vvj.a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            r0 = 96
            anie r9 = r9.a((java.lang.String) r4, (java.lang.String) r5, (int) r0, (java.lang.String) r6)
            anih r9 = (defpackage.anih) r9
            java.lang.String r0 = "Failed to get WifiCredentials from the intent. Security type is null"
            r9.a((java.lang.String) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whp.a(android.os.Bundle):com.google.android.gms.nearby.sharing.WifiCredentialsAttachment");
    }

    public static boolean a(List list, int... iArr) {
        Iterator it = list.iterator();
        loop0:
        while (it.hasNext()) {
            Attachment attachment = (Attachment) it.next();
            if (attachment.c()) {
                int b = attachment.b();
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break loop0;
                    } else if (b != iArr[i]) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
