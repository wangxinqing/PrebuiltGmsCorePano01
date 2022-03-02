package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.util.Set;

/* renamed from: bny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bny {
    private static final Set a = anax.a("activity", "service", "receiver", "provider");
    private static int d = 0;
    private static final bpa e = new bpa();
    private final Context b;
    private final Set c;
    private final bpa f = new bpa();
    private final bsb g = new bsb();
    private final bsa h = new bsa();
    private final brz i = new brz();
    private final bsc j = new bsc();
    private final apxg k = new apxg();

    public bny(Context context, Iterable iterable) {
        this.b = context;
        this.c = anax.a(iterable);
    }

    private static int a(int i2) {
        if (i2 != 1) {
            return i2 != 3 ? 0 : 1;
        }
        return 2;
    }

    private static boolean a(int i2, boolean z) {
        if (i2 == 1) {
            return true;
        }
        if (i2 != 0) {
            return false;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r2 == null) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ea A[Catch:{ IOException | XmlPullParserException -> 0x0205, all -> 0x0203 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0545 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x01f9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(defpackage.boz r24, java.util.Set r25) {
        /*
            r23 = this;
            r1 = r23
            r8 = r24
            r9 = r25
            java.lang.String r10 = "Cannot set component-enabled-setting on the pending provider: "
            java.lang.String r11 = " to "
            java.lang.String r12 = "setting pending provider "
            java.lang.String r13 = "ComponentsEnabler"
            android.content.Context r2 = r1.b
            java.lang.String r14 = r2.getPackageName()
            r15 = 0
            r7 = -1
            r16 = 0
            int r2 = d     // Catch:{ IOException -> 0x0035, XmlPullParserException -> 0x002c, all -> 0x0023 }
            android.content.res.XmlResourceParser r2 = r1.a((java.lang.String) r14, (int) r2)     // Catch:{ IOException -> 0x0035, XmlPullParserException -> 0x002c, all -> 0x0023 }
            if (r2 != 0) goto L_0x0021
            goto L_0x0038
        L_0x0021:
            r6 = r2
            goto L_0x003f
        L_0x0023:
            r0 = move-exception
            r2 = r0
            r21 = r10
            r22 = r11
            r10 = -1
            goto L_0x04b6
        L_0x002c:
            r0 = move-exception
            r2 = r0
            r21 = r10
            r22 = r11
            r10 = -1
            goto L_0x04c4
        L_0x0035:
            r0 = move-exception
            r2 = r16
        L_0x0038:
            r3 = 0
        L_0x0039:
            if (r2 == 0) goto L_0x049c
            int r3 = r3 + r7
            d = r3     // Catch:{ IOException -> 0x0494, XmlPullParserException -> 0x0492, all -> 0x048a }
            goto L_0x0021
        L_0x003f:
            int r2 = r6.next()     // Catch:{ IOException -> 0x0494, XmlPullParserException -> 0x0492, all -> 0x048a }
            r4 = r16
            r5 = -1
        L_0x0046:
            r3 = 1
            if (r2 != r3) goto L_0x00ba
            r6.close()     // Catch:{ IOException -> 0x00af, XmlPullParserException -> 0x00ad, all -> 0x00a2 }
            if (r4 == 0) goto L_0x00a1
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 40
            r6.<init>(r3)
            r6.append(r12)
            r6.append(r2)
            r6.append(r11)
            r6.append(r5)
            java.lang.String r2 = r6.toString()
            android.util.Log.i(r13, r2)
            android.content.Context r2 = r1.b     // Catch:{ IllegalArgumentException -> 0x007e }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x007e }
            r2.setComponentEnabledSetting(r4, r5, r15)     // Catch:{ IllegalArgumentException -> 0x007e }
            return
        L_0x007e:
            r0 = move-exception
            r2 = r0
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 62
            r4.<init>(r3)
            r4.append(r10)
        L_0x0096:
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.e(r13, r2)
            return
        L_0x00a1:
            return
        L_0x00a2:
            r0 = move-exception
            r2 = r0
            r17 = r5
            r21 = r10
            r22 = r11
            r11 = r4
            goto L_0x0446
        L_0x00ad:
            r0 = move-exception
            goto L_0x00b0
        L_0x00af:
            r0 = move-exception
        L_0x00b0:
            r2 = r0
            r17 = r5
            r21 = r10
            r22 = r11
            r11 = r4
            goto L_0x045b
        L_0x00ba:
            if (r2 != 0) goto L_0x00c8
            r17 = r5
            r18 = r6
            r21 = r10
            r22 = r11
            r10 = -1
            r11 = r4
            goto L_0x046a
        L_0x00c8:
            r7 = 2
            if (r2 != r7) goto L_0x0460
            java.lang.String r2 = r6.getName()     // Catch:{ IOException -> 0x0452, XmlPullParserException -> 0x0450, all -> 0x043d }
            int r7 = r6.getDepth()     // Catch:{ IOException -> 0x0452, XmlPullParserException -> 0x0450, all -> 0x043d }
            r15 = 3
            if (r7 != r15) goto L_0x041c
            java.util.Set r7 = a     // Catch:{ IOException -> 0x0452, XmlPullParserException -> 0x0450, all -> 0x043d }
            boolean r7 = r7.contains(r2)     // Catch:{ IOException -> 0x0452, XmlPullParserException -> 0x0450, all -> 0x043d }
            if (r7 == 0) goto L_0x041c
            r19 = r4
            r4 = r16
            r7 = r4
            r3 = 0
            r15 = 1
            r18 = 0
        L_0x00e7:
            r20 = r5
            int r5 = r6.getAttributeCount()     // Catch:{ IOException -> 0x0412, XmlPullParserException -> 0x0410, all -> 0x0406 }
            if (r3 >= r5) goto L_0x0229
            java.lang.String r5 = "name"
            r21 = r10
            java.lang.String r10 = r6.getAttributeName(r3)     // Catch:{ IOException -> 0x020d, XmlPullParserException -> 0x020b, all -> 0x0209 }
            boolean r5 = r5.equals(r10)     // Catch:{ IOException -> 0x020d, XmlPullParserException -> 0x020b, all -> 0x0209 }
            java.lang.String r10 = "http://schemas.android.com/apk/res/android"
            if (r5 == 0) goto L_0x0120
            java.lang.String r5 = r6.getAttributeNamespace(r3)     // Catch:{ IOException -> 0x011a, XmlPullParserException -> 0x0118, all -> 0x0112 }
            boolean r5 = r10.equals(r5)     // Catch:{ IOException -> 0x011a, XmlPullParserException -> 0x0118, all -> 0x0112 }
            if (r5 != 0) goto L_0x010a
            goto L_0x0120
        L_0x010a:
            java.lang.String r4 = r6.getAttributeValue(r3)     // Catch:{ IOException -> 0x011a, XmlPullParserException -> 0x0118, all -> 0x0112 }
            r22 = r11
            goto L_0x01f9
        L_0x0112:
            r0 = move-exception
            r2 = r0
            r22 = r11
            goto L_0x0215
        L_0x0118:
            r0 = move-exception
            goto L_0x011b
        L_0x011a:
            r0 = move-exception
        L_0x011b:
            r2 = r0
            r22 = r11
            goto L_0x0223
        L_0x0120:
            java.lang.String r5 = "enabled"
            r22 = r11
            java.lang.String r11 = r6.getAttributeName(r3)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            boolean r5 = r5.equals(r11)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            if (r5 == 0) goto L_0x0147
            java.lang.String r5 = r6.getAttributeNamespace(r3)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            boolean r5 = r10.equals(r5)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            if (r5 == 0) goto L_0x0147
            java.lang.String r5 = "false"
            java.lang.String r10 = r6.getAttributeValue(r3)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            boolean r5 = r5.equals(r10)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            r10 = 1
            r15 = r5 ^ 1
            goto L_0x01f9
        L_0x0147:
            java.lang.String r5 = "implementingModuleId"
            java.lang.String r10 = r6.getAttributeName(r3)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            boolean r5 = r5.equals(r10)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            java.lang.String r10 = "http://schemas.android.com/chimera"
            if (r5 == 0) goto L_0x0166
            java.lang.String r5 = r6.getAttributeNamespace(r3)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            boolean r5 = r10.equals(r5)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            if (r5 != 0) goto L_0x0160
            goto L_0x0166
        L_0x0160:
            java.lang.String r7 = r6.getAttributeValue(r3)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            goto L_0x01f9
        L_0x0166:
            java.lang.String r5 = "autoEnabled"
            java.lang.String r11 = r6.getAttributeName(r3)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            boolean r5 = r5.equals(r11)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            if (r5 == 0) goto L_0x01f8
            java.lang.String r5 = r6.getAttributeNamespace(r3)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            boolean r5 = r10.equals(r5)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            if (r5 != 0) goto L_0x017e
            goto L_0x01f9
        L_0x017e:
            java.lang.String r5 = r6.getAttributeValue(r3)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            if (r5 != 0) goto L_0x0186
            goto L_0x01f9
        L_0x0186:
            java.lang.String r10 = "true"
            boolean r10 = r5.equals(r10)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            if (r10 == 0) goto L_0x0191
            r18 = 1
            goto L_0x01f9
        L_0x0191:
            java.lang.String r10 = "@"
            boolean r10 = r5.startsWith(r10)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            if (r10 != 0) goto L_0x019a
            goto L_0x01f9
        L_0x019a:
            java.lang.String r10 = "@bool/"
            boolean r10 = r5.startsWith(r10)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            if (r10 == 0) goto L_0x01b4
            r10 = 6
            java.lang.String r5 = r5.substring(r10)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            android.content.Context r10 = r1.b     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            java.lang.String r11 = "bool"
            int r5 = r10.getIdentifier(r5, r11, r14)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            goto L_0x01e8
        L_0x01b4:
            r10 = 1
            java.lang.String r5 = r5.substring(r10)     // Catch:{ NumberFormatException -> 0x01c3 }
            java.lang.Integer r5 = java.lang.Integer.decode(r5)     // Catch:{ NumberFormatException -> 0x01c3 }
            int r5 = r5.intValue()     // Catch:{ NumberFormatException -> 0x01c3 }
            goto L_0x01e8
        L_0x01c3:
            r0 = move-exception
            r5 = r0
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            java.lang.String r11 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            int r11 = r11.length()     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            int r11 = r11 + 46
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            r10.<init>(r11)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            java.lang.String r11 = "Couldn't parse autoEnabled value in manifest: "
            r10.append(r11)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            r10.append(r5)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            java.lang.String r5 = r10.toString()     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            android.util.Log.e(r13, r5)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            r5 = 0
        L_0x01e8:
            if (r5 == 0) goto L_0x01f7
            android.content.Context r10 = r1.b     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            boolean r5 = r10.getBoolean(r5)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            r18 = r5
            goto L_0x01f9
        L_0x01f7:
            goto L_0x01f9
        L_0x01f8:
        L_0x01f9:
            int r3 = r3 + 1
            r5 = r20
            r10 = r21
            r11 = r22
            goto L_0x00e7
        L_0x0203:
            r0 = move-exception
            goto L_0x0214
        L_0x0205:
            r0 = move-exception
            goto L_0x0222
        L_0x0207:
            r0 = move-exception
            goto L_0x0222
        L_0x0209:
            r0 = move-exception
            goto L_0x0212
        L_0x020b:
            r0 = move-exception
            goto L_0x0220
        L_0x020d:
            r0 = move-exception
            goto L_0x0220
        L_0x020f:
            r0 = move-exception
            r21 = r10
        L_0x0212:
            r22 = r11
        L_0x0214:
            r2 = r0
        L_0x0215:
            r11 = r19
            r17 = r20
            goto L_0x0446
        L_0x021b:
            r0 = move-exception
            goto L_0x021e
        L_0x021d:
            r0 = move-exception
        L_0x021e:
            r21 = r10
        L_0x0220:
            r22 = r11
        L_0x0222:
            r2 = r0
        L_0x0223:
            r11 = r19
            r17 = r20
            goto L_0x045b
        L_0x0229:
            r21 = r10
            r22 = r11
            if (r18 != 0) goto L_0x0238
            r18 = r6
            r11 = r19
            r17 = r20
            r10 = -1
            goto L_0x046a
        L_0x0238:
            if (r4 == 0) goto L_0x03fd
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch:{ IOException -> 0x03fb, XmlPullParserException -> 0x03f9, all -> 0x03f7 }
            android.content.Context r5 = r1.b     // Catch:{ IOException -> 0x03fb, XmlPullParserException -> 0x03f9, all -> 0x03f7 }
            r3.<init>(r5, r4)     // Catch:{ IOException -> 0x03fb, XmlPullParserException -> 0x03f9, all -> 0x03f7 }
            java.lang.String r4 = "activity"
            boolean r4 = r2.equals(r4)     // Catch:{ IOException -> 0x03fb, XmlPullParserException -> 0x03f9, all -> 0x03f7 }
            if (r4 == 0) goto L_0x02a5
            apxg r2 = r24.f()     // Catch:{ IOException -> 0x03fb, XmlPullParserException -> 0x03f9, all -> 0x03f7 }
            apxg r4 = r1.k     // Catch:{ IOException -> 0x03fb, XmlPullParserException -> 0x03f9, all -> 0x03f7 }
            apxg r5 = r24.f()     // Catch:{ IOException -> 0x03fb, XmlPullParserException -> 0x03f9, all -> 0x03f7 }
            java.lang.String r5 = r5.F()     // Catch:{ IOException -> 0x03fb, XmlPullParserException -> 0x03f9, all -> 0x03f7 }
            java.lang.String r10 = r3.getClassName()     // Catch:{ IOException -> 0x03fb, XmlPullParserException -> 0x03f9, all -> 0x03f7 }
            java.lang.String r5 = defpackage.brt.a((java.lang.String) r5, (java.lang.String) r10)     // Catch:{ IOException -> 0x03fb, XmlPullParserException -> 0x03f9, all -> 0x03f7 }
            r10 = 22
            int r10 = r2.d((int) r10)     // Catch:{ IOException -> 0x03fb, XmlPullParserException -> 0x03f9, all -> 0x03f7 }
            if (r10 == 0) goto L_0x0272
            int r10 = r2.h(r10)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            java.nio.ByteBuffer r2 = r2.d     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            apxg r2 = defpackage.apxg.a(r4, r10, r5, r2)     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            goto L_0x0274
        L_0x0272:
            r2 = r16
        L_0x0274:
            if (r2 == 0) goto L_0x027e
            apxg r2 = r1.k     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            int r2 = r2.T()     // Catch:{ IOException -> 0x0207, XmlPullParserException -> 0x0205, all -> 0x0203 }
            r5 = r2
            goto L_0x027f
        L_0x027e:
            r5 = -1
        L_0x027f:
            r3.toShortString()     // Catch:{ IOException -> 0x03fb, XmlPullParserException -> 0x03f9, all -> 0x03f7 }
            boolean r2 = r1.a((java.util.Set) r9, (defpackage.boz) r8, (int) r5)     // Catch:{ IOException -> 0x03fb, XmlPullParserException -> 0x03f9, all -> 0x03f7 }
            if (r2 == 0) goto L_0x029b
            android.content.Context r10 = r1.b     // Catch:{ IOException -> 0x03fb, XmlPullParserException -> 0x03f9, all -> 0x03f7 }
            r2 = r3
            r3 = r7
            r11 = r19
            r4 = r24
            r17 = r20
            r18 = r6
            r6 = r15
            r15 = -1
            r7 = r10
            a(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            goto L_0x02a2
        L_0x029b:
            r18 = r6
            r11 = r19
            r17 = r20
            r15 = -1
        L_0x02a2:
            r10 = -1
            goto L_0x046a
        L_0x02a5:
            r18 = r6
            r11 = r19
            r17 = r20
            r10 = -1
            java.lang.String r4 = "service"
            boolean r4 = r2.equals(r4)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            if (r4 == 0) goto L_0x0300
            apxg r2 = r24.f()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            bsb r4 = r1.g     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            apxg r5 = r24.f()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.lang.String r5 = r5.F()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.lang.String r6 = r3.getClassName()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.lang.String r5 = defpackage.brt.a((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            r6 = 16
            int r6 = r2.d((int) r6)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            if (r6 == 0) goto L_0x02dd
            int r6 = r2.h(r6)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.nio.ByteBuffer r2 = r2.d     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            bsb r2 = defpackage.bsb.a(r4, r6, r5, r2)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            goto L_0x02df
        L_0x02dd:
            r2 = r16
        L_0x02df:
            if (r2 == 0) goto L_0x02e9
            bsb r2 = r1.g     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            int r2 = r2.T()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            r5 = r2
            goto L_0x02ea
        L_0x02e9:
            r5 = -1
        L_0x02ea:
            r3.toShortString()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            boolean r2 = r1.a((java.util.Set) r9, (defpackage.boz) r8, (int) r5)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            if (r2 == 0) goto L_0x02fe
            android.content.Context r6 = r1.b     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            r2 = r3
            r3 = r7
            r4 = r24
            r7 = r6
            r6 = r15
            a(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
        L_0x02fe:
            goto L_0x046a
        L_0x0300:
            java.lang.String r4 = "receiver"
            boolean r2 = r2.equals(r4)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            if (r2 != 0) goto L_0x03ac
            apxg r2 = r24.f()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            brz r4 = r1.i     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            apxg r5 = r24.f()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.lang.String r5 = r5.F()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.lang.String r6 = r3.getClassName()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.lang.String r5 = defpackage.brt.a((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            r6 = 20
            int r6 = r2.d((int) r6)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            if (r6 == 0) goto L_0x0331
            int r6 = r2.h(r6)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.nio.ByteBuffer r2 = r2.d     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            brz r2 = defpackage.brz.a(r4, r6, r5, r2)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            goto L_0x0333
        L_0x0331:
            r2 = r16
        L_0x0333:
            if (r2 != 0) goto L_0x036b
            apxg r2 = r24.f()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            bsc r4 = r1.j     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            apxg r5 = r24.f()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.lang.String r5 = r5.F()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.lang.String r6 = r3.getClassName()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.lang.String r5 = defpackage.brt.a((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            r6 = 34
            int r6 = r2.d((int) r6)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            if (r6 == 0) goto L_0x035e
            int r6 = r2.h(r6)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.nio.ByteBuffer r2 = r2.d     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            bsc r2 = defpackage.bsc.a(r4, r6, r5, r2)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            goto L_0x0360
        L_0x035e:
            r2 = r16
        L_0x0360:
            if (r2 == 0) goto L_0x0369
            bsc r2 = r1.j     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            int r2 = r2.T()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            goto L_0x0371
        L_0x0369:
            r2 = -1
            goto L_0x0371
        L_0x036b:
            brz r2 = r1.i     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            int r2 = r2.T()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
        L_0x0371:
            r3.toString()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            boolean r4 = r1.a((java.util.Set) r9, (defpackage.boz) r8, (int) r2)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            if (r4 == 0) goto L_0x03a3
            int r2 = a((defpackage.boz) r8, (int) r2, (java.lang.String) r7)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            int r7 = a((int) r2)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            boolean r2 = a((int) r7, (boolean) r15)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            if (r2 != 0) goto L_0x0389
            goto L_0x039c
        L_0x0389:
            if (r11 != 0) goto L_0x039c
            android.content.Context r2 = r1.b     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            int r2 = r2.getComponentEnabledSetting(r3)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            boolean r2 = a((int) r2, (boolean) r15)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            if (r2 != 0) goto L_0x039c
            goto L_0x03a4
        L_0x039c:
            android.content.Context r2 = r1.b     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            a(r7, r3, r15, r2)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            r7 = -1
            goto L_0x03a4
        L_0x03a3:
            r7 = -1
        L_0x03a4:
            if (r7 != r10) goto L_0x03a8
            goto L_0x046a
        L_0x03a8:
            r4 = r3
            r5 = r7
            goto L_0x046d
        L_0x03ac:
            apxg r2 = r24.f()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            bsa r4 = r1.h     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            apxg r5 = r24.f()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.lang.String r5 = r5.F()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.lang.String r6 = r3.getClassName()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.lang.String r5 = defpackage.brt.a((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            r6 = 18
            int r6 = r2.d((int) r6)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            if (r6 == 0) goto L_0x03d5
            int r6 = r2.h(r6)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            java.nio.ByteBuffer r2 = r2.d     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            bsa r2 = defpackage.bsa.a(r4, r6, r5, r2)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            goto L_0x03d7
        L_0x03d5:
            r2 = r16
        L_0x03d7:
            if (r2 == 0) goto L_0x03e1
            bsa r2 = r1.h     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            int r2 = r2.T()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            r5 = r2
            goto L_0x03e2
        L_0x03e1:
            r5 = -1
        L_0x03e2:
            r3.toShortString()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            boolean r2 = r1.a((java.util.Set) r9, (defpackage.boz) r8, (int) r5)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            if (r2 == 0) goto L_0x0404
            android.content.Context r6 = r1.b     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            r2 = r3
            r3 = r7
            r4 = r24
            r7 = r6
            r6 = r15
            a(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            goto L_0x0404
        L_0x03f7:
            r0 = move-exception
            goto L_0x040b
        L_0x03f9:
            r0 = move-exception
            goto L_0x0417
        L_0x03fb:
            r0 = move-exception
            goto L_0x0417
        L_0x03fd:
            r18 = r6
            r11 = r19
            r17 = r20
            r10 = -1
        L_0x0404:
            goto L_0x046a
        L_0x0406:
            r0 = move-exception
            r21 = r10
            r22 = r11
        L_0x040b:
            r11 = r19
            r17 = r20
            goto L_0x0445
        L_0x0410:
            r0 = move-exception
            goto L_0x0413
        L_0x0412:
            r0 = move-exception
        L_0x0413:
            r21 = r10
            r22 = r11
        L_0x0417:
            r11 = r19
            r17 = r20
            goto L_0x045a
        L_0x041c:
            r17 = r5
            r18 = r6
            r21 = r10
            r22 = r11
            r10 = -1
            r11 = r4
            int r2 = r18.next()     // Catch:{ IOException -> 0x043b, XmlPullParserException -> 0x0439, all -> 0x0437 }
            r4 = r11
            r5 = r17
            r6 = r18
            r10 = r21
            r11 = r22
            r7 = -1
            r15 = 0
            goto L_0x0046
        L_0x0437:
            r0 = move-exception
            goto L_0x0445
        L_0x0439:
            r0 = move-exception
            goto L_0x045a
        L_0x043b:
            r0 = move-exception
            goto L_0x045a
        L_0x043d:
            r0 = move-exception
            r17 = r5
            r21 = r10
            r22 = r11
            r11 = r4
        L_0x0445:
            r2 = r0
        L_0x0446:
            r5 = r2
            r4 = r11
            r7 = r17
            r3 = r21
            r2 = r22
            goto L_0x054c
        L_0x0450:
            r0 = move-exception
            goto L_0x0453
        L_0x0452:
            r0 = move-exception
        L_0x0453:
            r17 = r5
            r21 = r10
            r22 = r11
            r11 = r4
        L_0x045a:
            r2 = r0
        L_0x045b:
            r4 = r11
            r7 = r17
            goto L_0x04c7
        L_0x0460:
            r17 = r5
            r18 = r6
            r21 = r10
            r22 = r11
            r10 = -1
            r11 = r4
        L_0x046a:
            r4 = r11
            r5 = r17
        L_0x046d:
            int r2 = r18.next()     // Catch:{ IOException -> 0x0486, XmlPullParserException -> 0x0484, all -> 0x047b }
            r6 = r18
            r10 = r21
            r11 = r22
            r7 = -1
            r15 = 0
            goto L_0x0046
        L_0x047b:
            r0 = move-exception
            r7 = r5
            r3 = r21
            r2 = r22
            r5 = r0
            goto L_0x054c
        L_0x0484:
            r0 = move-exception
            goto L_0x0487
        L_0x0486:
            r0 = move-exception
        L_0x0487:
            r2 = r0
            r7 = r5
            goto L_0x04c7
        L_0x048a:
            r0 = move-exception
            r21 = r10
            r22 = r11
            r10 = -1
        L_0x0490:
            r2 = r0
            goto L_0x04b6
        L_0x0492:
            r0 = move-exception
            goto L_0x0495
        L_0x0494:
            r0 = move-exception
        L_0x0495:
            r21 = r10
            r22 = r11
            r10 = -1
        L_0x049a:
            r2 = r0
            goto L_0x04c4
        L_0x049c:
            r21 = r10
            r22 = r11
            r10 = -1
            int r4 = d     // Catch:{ IOException -> 0x04c2, XmlPullParserException -> 0x04c0, all -> 0x04b4 }
            if (r3 != r4) goto L_0x04a6
            goto L_0x04aa
        L_0x04a6:
            android.content.res.XmlResourceParser r2 = r1.a((java.lang.String) r14, (int) r3)     // Catch:{ IOException -> 0x04c2, XmlPullParserException -> 0x04c0, all -> 0x04b4 }
        L_0x04aa:
            int r3 = r3 + 1
            r10 = r21
            r11 = r22
            r7 = -1
            r15 = 0
            goto L_0x0039
        L_0x04b4:
            r0 = move-exception
            goto L_0x0490
        L_0x04b6:
            r5 = r2
            r4 = r16
            r3 = r21
            r2 = r22
            r7 = -1
            goto L_0x054c
        L_0x04c0:
            r0 = move-exception
            goto L_0x049a
        L_0x04c2:
            r0 = move-exception
            goto L_0x049a
        L_0x04c4:
            r4 = r16
            r7 = -1
        L_0x04c7:
            android.content.Context r3 = r1.b     // Catch:{ all -> 0x0546 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0546 }
            r6 = 41
            defpackage.bla.a(r3, r6, r5)     // Catch:{ all -> 0x0546 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0546 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0546 }
            int r3 = r3.length()     // Catch:{ all -> 0x0546 }
            int r3 = r3 + 49
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0546 }
            r5.<init>(r3)     // Catch:{ all -> 0x0546 }
            java.lang.String r3 = "Cannot parse all proxy components from manifest. "
            r5.append(r3)     // Catch:{ all -> 0x0546 }
            r5.append(r2)     // Catch:{ all -> 0x0546 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0546 }
            android.util.Log.e(r13, r2)     // Catch:{ all -> 0x0546 }
            if (r4 == 0) goto L_0x0545
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 40
            r5.<init>(r3)
            r5.append(r12)
            r5.append(r2)
            r2 = r22
            r5.append(r2)
            r5.append(r7)
            java.lang.String r2 = r5.toString()
            android.util.Log.i(r13, r2)
            android.content.Context r2 = r1.b     // Catch:{ IllegalArgumentException -> 0x0529 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x0529 }
            r3 = 0
            r2.setComponentEnabledSetting(r4, r7, r3)     // Catch:{ IllegalArgumentException -> 0x0529 }
            return
        L_0x0529:
            r0 = move-exception
            r2 = r0
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 62
            r4.<init>(r3)
            r3 = r21
            r4.append(r3)
            goto L_0x0096
        L_0x0545:
            return
        L_0x0546:
            r0 = move-exception
            r3 = r21
            r2 = r22
            r5 = r0
        L_0x054c:
            if (r4 == 0) goto L_0x05a1
            java.lang.String r6 = java.lang.String.valueOf(r4)
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r8 = r8 + 40
            r9.<init>(r8)
            r9.append(r12)
            r9.append(r6)
            r9.append(r2)
            r9.append(r7)
            java.lang.String r2 = r9.toString()
            android.util.Log.i(r13, r2)
            android.content.Context r2 = r1.b     // Catch:{ IllegalArgumentException -> 0x057f }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x057f }
            r6 = 0
            r2.setComponentEnabledSetting(r4, r7, r6)     // Catch:{ IllegalArgumentException -> 0x057f }
            goto L_0x05a1
        L_0x057f:
            r0 = move-exception
            r2 = r0
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 62
            r6.<init>(r4)
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.e(r13, r2)
        L_0x05a1:
            goto L_0x05a3
        L_0x05a2:
            throw r5
        L_0x05a3:
            goto L_0x05a2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bny.b(boz, java.util.Set):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized int a(defpackage.boz r3, int r4, java.lang.String r5) {
        /*
            java.lang.Class<bny> r0 = defpackage.bny.class
            monitor-enter(r0)
            r1 = 1
            if (r4 < 0) goto L_0x001f
            bpa r4 = r3.b(r4)     // Catch:{ all -> 0x001d }
            int r4 = r4.S()     // Catch:{ all -> 0x001d }
            boy r3 = r3.a((int) r4)     // Catch:{ all -> 0x001d }
            int r3 = r3.a()     // Catch:{ all -> 0x001d }
            if (r3 != r1) goto L_0x001b
            r3 = 2
        L_0x0019:
            monitor-exit(r0)
            return r3
        L_0x001b:
            r3 = 3
            goto L_0x0019
        L_0x001d:
            r3 = move-exception
            goto L_0x003c
        L_0x001f:
            if (r5 == 0) goto L_0x003e
            bpa r4 = e     // Catch:{ all -> 0x001d }
            r2 = 8
            int r2 = r3.d((int) r2)     // Catch:{ all -> 0x001d }
            if (r2 == 0) goto L_0x0036
            int r2 = r3.h(r2)     // Catch:{ all -> 0x001d }
            java.nio.ByteBuffer r3 = r3.d     // Catch:{ all -> 0x001d }
            bpa r3 = defpackage.bpa.a(r4, r2, r5, r3)     // Catch:{ all -> 0x001d }
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 != 0) goto L_0x003e
            r3 = 4
            monitor-exit(r0)
            return r3
        L_0x003c:
            monitor-exit(r0)
            throw r3
        L_0x003e:
            monitor-exit(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bny.a(boz, int, java.lang.String):int");
    }

    private static void a(int i2, ComponentName componentName, boolean z, Context context) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(componentName);
            boolean a2 = a(componentEnabledSetting, z);
            boolean a3 = a(i2, z);
            if (a2 != a3) {
                Log.i("ComponentsEnabler", String.format("auto-enabling %s from %d (effect: %b) to %d (effect: %b)", new Object[]{componentName, Integer.valueOf(componentEnabledSetting), Boolean.valueOf(a2), Integer.valueOf(i2), Boolean.valueOf(a3)}));
                try {
                    context.getPackageManager().setComponentEnabledSetting(componentName, i2, 1);
                } catch (IllegalArgumentException e2) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb.append("Cannot set component-enabled-setting: ");
                    sb.append(valueOf);
                    Log.e("ComponentsEnabler", sb.toString());
                }
            }
        } catch (IllegalArgumentException e3) {
            String valueOf2 = String.valueOf(e3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
            sb2.append("Cannot get component-enabled-setting: ");
            sb2.append(valueOf2);
            Log.e("ComponentsEnabler", sb2.toString());
        }
    }

    private static void a(ComponentName componentName, String str, boz boz, int i2, boolean z, Context context) {
        a(a(a(boz, i2, str)), componentName, z, context);
    }

    private final boolean a(Set set, boz boz, int i2) {
        String str = null;
        if (i2 >= 0 && i2 < boz.c()) {
            boz.a(this.f, i2);
            str = this.f.b();
        }
        if (str == null || set.contains(str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.XmlResourceParser a(java.lang.String r5, int r6) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = r4.b     // Catch:{ XmlPullParserException -> 0x0054 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ XmlPullParserException -> 0x0054 }
            java.lang.String r2 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r6 = r1.openXmlResourceParser(r6, r2)     // Catch:{ XmlPullParserException -> 0x0054 }
            int r1 = r6.next()     // Catch:{ XmlPullParserException -> 0x0052 }
        L_0x0011:
            r2 = 1
            if (r1 == r2) goto L_0x0051
            r3 = 2
            if (r1 != r3) goto L_0x004c
            int r1 = r6.getDepth()     // Catch:{ XmlPullParserException -> 0x0052 }
            if (r1 != r2) goto L_0x004c
            java.lang.String r1 = r6.getName()     // Catch:{ XmlPullParserException -> 0x0052 }
            java.lang.String r2 = "manifest"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0052 }
            if (r1 != 0) goto L_0x002a
            goto L_0x004c
        L_0x002a:
            r1 = 0
        L_0x002b:
            int r2 = r6.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x0052 }
            if (r1 >= r2) goto L_0x0051
            java.lang.String r2 = "package"
            java.lang.String r3 = r6.getAttributeName(r1)     // Catch:{ XmlPullParserException -> 0x0052 }
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0052 }
            if (r2 != 0) goto L_0x0040
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0040:
            java.lang.String r1 = r6.getAttributeValue(r1)     // Catch:{ XmlPullParserException -> 0x0052 }
            boolean r5 = r5.equals(r1)     // Catch:{ XmlPullParserException -> 0x0052 }
            if (r5 != 0) goto L_0x004b
            goto L_0x007a
        L_0x004b:
            return r6
        L_0x004c:
            int r1 = r6.next()     // Catch:{ XmlPullParserException -> 0x0052 }
            goto L_0x0011
        L_0x0051:
            goto L_0x007a
        L_0x0052:
            r5 = move-exception
            goto L_0x0056
        L_0x0054:
            r5 = move-exception
            r6 = r0
        L_0x0056:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 53
            r2.<init>(r1)
            java.lang.String r1 = "The XML parser cannot pull from AndroidManifest.xml: "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r1 = "ComponentsEnabler"
            android.util.Log.w(r1, r5)
        L_0x007a:
            if (r6 == 0) goto L_0x007f
            r6.close()
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bny.a(java.lang.String, int):android.content.res.XmlResourceParser");
    }

    public final void a(boz boz) {
        a(boz, (Set) null);
    }

    public final void a(boz boz, Set set) {
        Set set2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (set != null) {
            set2 = angm.b(this.c, set);
        } else {
            set2 = this.c;
        }
        synchronized (bny.class) {
            b(boz, set2);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder(68);
        sb.append("Elapsed milliSeconds to auto-enable components: ");
        sb.append(elapsedRealtime2 - elapsedRealtime);
        Log.i("ComponentsEnabler", sb.toString());
    }
}
