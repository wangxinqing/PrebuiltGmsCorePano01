package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.Service;
import com.google.firebase.appindexing.internal.Thing;
import java.net.URISyntaxException;
import java.util.Arrays;
import org.chromium.net.UrlRequest;

/* renamed from: oxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxz {
    public static int a(aolx aolx) {
        aolx aolx2 = aolx.NO_ERROR;
        switch (aolx.ordinal()) {
            case 0:
            case 18:
                return 0;
            case 1:
            case 5:
            case 50:
                String valueOf = String.valueOf(aolx);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Cannot translate error to be sent to the client: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
            case UrlRequest.Status.READING_RESPONSE /*14*/:
            case Service.START_CONTINUATION_MASK:
            case 16:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
                return 17510;
            case 3:
            case 4:
                return 17600;
            case 20:
            case 43:
                return 17511;
            case 22:
                return 17514;
            case 24:
                return 17601;
            case 32:
                return 17512;
            case 33:
                return 17513;
            case 44:
                return 17515;
            case 45:
                return 17602;
            case 46:
                return 17516;
            case 47:
                return 17517;
            case 48:
                return 17518;
            case 49:
                return 17519;
            default:
                return 17500;
        }
    }

    public static void b(Thing thing) {
        String str;
        long[] b = thing.c.b("scope");
        if (b != null) {
            int length = b.length;
            if (length != 1 || !aplx.a((int) b[0])) {
                if (length <= 0) {
                    str = "unknown";
                } else {
                    str = Arrays.toString(b);
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
                sb.append("The scope of this indexable is not valid, scope value is ");
                sb.append(str);
                sb.append(".");
                throw new oxy(sb.toString(), thing, aolx.INVALID_INDEXABLE_INVALID_SCOPE);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v36, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.firebase.appindexing.internal.Thing r16, java.lang.String r17, android.content.Context r18, boolean r19, int r20, defpackage.oyb r21) {
        /*
            r1 = r16
            r0 = r17
            r8 = r20
            r9 = r21
            r2 = 5
            if (r8 > r2) goto L_0x03fb
            java.lang.String r2 = r1.d
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0025
            defpackage.oyn.a(r2)     // Catch:{ IllegalArgumentException -> 0x0017 }
            goto L_0x0025
        L_0x0017:
            r0 = move-exception
            r2 = r0
            oxy r0 = new oxy
            java.lang.String r3 = r2.getMessage()
            aolx r4 = defpackage.aolx.INVALID_ARGUMENT_URI
            r0.<init>(r3, r1, r4, r2)
            throw r0
        L_0x0025:
            java.lang.String r2 = "image"
            java.lang.String[] r2 = r1.b(r2)
            r10 = 0
            if (r2 != 0) goto L_0x0030
            goto L_0x003c
        L_0x0030:
            int r3 = r2.length     // Catch:{ IllegalArgumentException -> 0x03ee }
            r4 = 0
        L_0x0032:
            if (r4 >= r3) goto L_0x003c
            r5 = r2[r4]     // Catch:{ IllegalArgumentException -> 0x03ee }
            defpackage.oyn.a(r5)     // Catch:{ IllegalArgumentException -> 0x03ee }
            int r4 = r4 + 1
            goto L_0x0032
        L_0x003c:
            java.lang.String r2 = "sameAs"
            java.lang.String[] r3 = r1.b(r2)
            if (r3 == 0) goto L_0x005e
            int r4 = r3.length     // Catch:{ IllegalArgumentException -> 0x0051 }
            r5 = 0
        L_0x0047:
            if (r5 >= r4) goto L_0x005e
            r6 = r3[r5]     // Catch:{ IllegalArgumentException -> 0x0051 }
            defpackage.oyn.b(r6)     // Catch:{ IllegalArgumentException -> 0x0051 }
            int r5 = r5 + 1
            goto L_0x0047
        L_0x0051:
            r0 = move-exception
            oxy r2 = new oxy
            java.lang.String r3 = r0.getMessage()
            aolx r4 = defpackage.aolx.INVALID_INDEXABLE_INVALID_WEB_URL
            r2.<init>(r3, r1, r4, r0)
            throw r2
        L_0x005e:
            if (r8 == 0) goto L_0x0073
            com.google.firebase.appindexing.internal.Thing$Metadata r3 = r1.c
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x0069
            goto L_0x0073
        L_0x0069:
            oxy r0 = new oxy
            aolx r2 = defpackage.aolx.INVALID_INDEXABLE_METADATA_AT_NON_TOP_LEVEL
            java.lang.String r3 = "Metadata can only be set on the top-level Indexable."
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x0073:
            if (r19 != 0) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            com.google.firebase.appindexing.internal.Thing$Metadata r3 = r1.c
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x03e4
        L_0x007e:
            agvx r3 = defpackage.pba.g
            java.lang.Object r3 = r3.c()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x009d
            boolean r3 = a((com.google.firebase.appindexing.internal.Thing) r16)
            if (r3 == 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            oxy r0 = new oxy
            aolx r2 = defpackage.aolx.INVALID_INDEXABLE
            java.lang.String r3 = "Handling of non-global searchable indexables is not supported yet."
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x009d:
            b(r16)
            r11 = 1
            if (r8 != 0) goto L_0x01c3
            java.lang.String r3 = r1.d
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x01b9
            int r3 = r3.length()
            r4 = 256(0x100, float:3.59E-43)
            if (r3 > r4) goto L_0x01af
            java.lang.String r3 = r1.e
            agvx r4 = defpackage.ozx.aQ
            java.lang.Object r4 = r4.c()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0102
            agvx r4 = defpackage.ozx.aQ
            java.lang.Object r4 = r4.c()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = ","
            java.lang.String[] r4 = r4.split(r5)
            boolean r3 = defpackage.jhx.a((java.lang.Object[]) r4, (java.lang.Object) r3)
            if (r3 != 0) goto L_0x00d8
            goto L_0x0102
        L_0x00d8:
            oxy r0 = new oxy
            java.lang.String r2 = r1.e
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 55
            r4.<init>(r3)
            java.lang.String r3 = "Handling of indexables of type '"
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = "' is not supported yet."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            aolx r3 = defpackage.aolx.FEATURE_OFF
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x0102:
            anax r3 = r9.b
            java.lang.String r4 = r1.e
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x0185
            java.lang.String[] r2 = r1.b(r2)
            if (r2 != 0) goto L_0x0113
            goto L_0x0116
        L_0x0113:
            int r2 = r2.length
            if (r2 > r11) goto L_0x017b
        L_0x0116:
            agvx r2 = defpackage.ozx.as
            java.lang.Object r2 = r2.c()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x01c3
            java.lang.String r2 = r18.getPackageName()
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x01c3
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = r1.d
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r4 = "android.intent.action.VIEW"
            r2.<init>(r4, r3)
            r2.setPackage(r0)
            android.content.pm.PackageManager r3 = r18.getPackageManager()
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r3 = r3.queryIntentActivities(r2, r4)
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x014f
            goto L_0x01c3
        L_0x014f:
            oxy r0 = new oxy
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 29
            r4.<init>(r3)
            java.lang.String r3 = "Intent '"
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = "' cannot be resolved."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            aolx r3 = defpackage.aolx.INVALID_INDEXABLE_INTENT_NOT_HANDLED
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x017b:
            oxy r0 = new oxy
            aolx r2 = defpackage.aolx.INVALID_INDEXABLE_SAME_AS_FIELD_REPEATED
            java.lang.String r3 = "The sameAs field of the top-level Indexable cannot be repeated."
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x0185:
            oxy r0 = new oxy
            java.lang.String r2 = r1.e
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 121
            r4.<init>(r3)
            java.lang.String r3 = "Indexable of type "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = " can only be used as a parameter in other builders, it cannot be passed to the update() method directly"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            aolx r3 = defpackage.aolx.INVALID_INDEXABLE_INVALID_TYPE_AT_TOP_LEVEL
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x01af:
            oxy r0 = new oxy
            aolx r2 = defpackage.aolx.INVALID_ARGUMENT_URI_TOO_LONG
            java.lang.String r3 = "URL too long (max 256 characters)."
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x01b9:
            oxy r0 = new oxy
            aolx r2 = defpackage.aolx.INVALID_INDEXABLE_MISSING_REQUIRED_FIELD
            java.lang.String r3 = "The URL of the top-level Indexable isn't set. Call the builder's setUrl() method."
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x01c3:
            if (r8 != 0) goto L_0x01c7
            r2 = 1
            goto L_0x01c8
        L_0x01c7:
            r2 = 0
        L_0x01c8:
            java.lang.String r3 = r1.e
            ovo r3 = r9.a((java.lang.String) r3, (boolean) r2)
            aucx r3 = r3.d
            int r4 = r3.size()
            r5 = 0
        L_0x01d5:
            if (r5 >= r4) goto L_0x028c
            java.lang.Object r6 = r3.get(r5)
            ovn r6 = (defpackage.ovn) r6
            java.lang.String r7 = r6.b
            java.util.List r7 = defpackage.oyb.a((com.google.firebase.appindexing.internal.Thing) r1, (java.lang.String) r7)
            int r12 = r6.c
            int r12 = defpackage.ovm.a(r12)
            r13 = 2
            if (r12 == 0) goto L_0x020f
            if (r12 == r11) goto L_0x020f
            int r12 = r7.size()
            if (r12 > r11) goto L_0x01f5
            goto L_0x020f
        L_0x01f5:
            oxy r0 = new oxy
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.String r3 = r6.b
            r2[r10] = r3
            java.lang.String r3 = r16.b()
            r2[r11] = r3
            java.lang.String r3 = "The %s field of type %s cannot be repeated."
            java.lang.String r2 = java.lang.String.format(r3, r2)
            aolx r3 = defpackage.aolx.INVALID_INDEXABLE_INVALID_REPEATED_FIELD
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x020f:
            if (r2 != 0) goto L_0x0213
            goto L_0x0288
        L_0x0213:
            r12 = 3
            if (r19 != 0) goto L_0x024d
            int r14 = r6.c
            int r14 = defpackage.ovm.a(r14)
            if (r14 == 0) goto L_0x0288
            if (r14 != r12) goto L_0x0288
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0227
            goto L_0x0288
        L_0x0227:
            java.lang.String r0 = r6.b
            oxy r2 = new oxy
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r10] = r0
            java.lang.String r4 = r0.substring(r10, r11)
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = r4.toUpperCase(r5)
            r3[r11] = r4
            java.lang.String r0 = r0.substring(r11)
            r3[r13] = r0
            java.lang.String r0 = "The %s field of the top-level Indexable isn't set. Call the builder's set%s%s() method."
            java.lang.String r0 = java.lang.String.format(r0, r3)
            aolx r3 = defpackage.aolx.INVALID_INDEXABLE_MISSING_REQUIRED_FIELD
            r2.<init>(r0, r1, r3)
            throw r2
        L_0x024d:
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0288
            agvx r7 = defpackage.pba.aq
            java.lang.Object r7 = r7.c()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0262
            goto L_0x0288
        L_0x0262:
            java.lang.String r0 = r6.b
            oxy r2 = new oxy
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r10] = r0
            java.lang.String r4 = r0.substring(r10, r11)
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = r4.toUpperCase(r5)
            r3[r11] = r4
            java.lang.String r0 = r0.substring(r11)
            r3[r13] = r0
            java.lang.String r0 = "The predefined %s field of the top-level Indexable is set. Don't call the builder's set%s%s() method."
            java.lang.String r0 = java.lang.String.format(r0, r3)
            aolx r3 = defpackage.aolx.INVALID_INDEXABLE_BAD_PATCH
            r2.<init>(r0, r1, r3)
            throw r2
        L_0x0288:
            int r5 = r5 + 1
            goto L_0x01d5
        L_0x028c:
            android.os.Bundle r2 = r1.b
            int r2 = r2.size()
            r3 = 20
            if (r2 > r3) goto L_0x03da
            android.os.Bundle r2 = r1.b
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r12 = r2.iterator()
        L_0x02a0:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x03d9
            java.lang.Object r2 = r12.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x03cf
            int r3 = r2.length()
            r4 = 50
            if (r3 > r4) goto L_0x03b5
            java.lang.String[] r3 = r1.b(r2)
            com.google.firebase.appindexing.internal.Thing[] r4 = r1.a((java.lang.String) r2)
            long[] r5 = r1.c(r2)
            double[] r6 = r1.d(r2)
            android.os.Bundle r7 = r1.b
            java.lang.Object r7 = r7.get(r2)
            boolean r7 = r7 instanceof boolean[]
            r13 = 0
            if (r7 == 0) goto L_0x02d8
            android.os.Bundle r7 = r1.b
            boolean[] r7 = r7.getBooleanArray(r2)
            goto L_0x02d9
        L_0x02d8:
            r7 = r13
        L_0x02d9:
            r14 = 100
            if (r3 == 0) goto L_0x02fc
            int r4 = r3.length
            if (r4 <= r14) goto L_0x02ec
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r14)
            java.lang.String[] r3 = (java.lang.String[]) r3
            android.os.Bundle r4 = r1.b
            r4.putStringArray(r2, r3)
            goto L_0x02ed
        L_0x02ec:
        L_0x02ed:
            r2 = 0
        L_0x02ee:
            int r4 = r3.length
            if (r2 >= r4) goto L_0x02a0
            r4 = r3[r2]
            java.lang.String r4 = defpackage.apnd.a(r4)
            r3[r2] = r4
            int r2 = r2 + 1
            goto L_0x02ee
        L_0x02fc:
            if (r4 == 0) goto L_0x0326
            int r3 = r4.length
            if (r3 <= r14) goto L_0x030f
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r14)
            r4 = r3
            com.google.firebase.appindexing.internal.Thing[] r4 = (com.google.firebase.appindexing.internal.Thing[]) r4
            android.os.Bundle r3 = r1.b
            r3.putParcelableArray(r2, r4)
            r13 = r4
            goto L_0x0310
        L_0x030f:
            r13 = r4
        L_0x0310:
            int r14 = r13.length
            r15 = 0
        L_0x0312:
            if (r15 >= r14) goto L_0x02a0
            r2 = r13[r15]
            int r6 = r8 + 1
            r3 = r17
            r4 = r18
            r5 = r19
            r7 = r21
            a(r2, r3, r4, r5, r6, r7)
            int r15 = r15 + 1
            goto L_0x0312
        L_0x0326:
            if (r5 == 0) goto L_0x0336
            int r3 = r5.length
            if (r3 <= r14) goto L_0x02a0
            long[] r3 = java.util.Arrays.copyOf(r5, r14)
            android.os.Bundle r4 = r1.b
            r4.putLongArray(r2, r3)
            goto L_0x02a0
        L_0x0336:
            if (r6 == 0) goto L_0x0346
            int r3 = r6.length
            if (r3 <= r14) goto L_0x02a0
            double[] r3 = java.util.Arrays.copyOf(r6, r14)
            android.os.Bundle r4 = r1.b
            r4.putDoubleArray(r2, r3)
            goto L_0x02a0
        L_0x0346:
            if (r7 != 0) goto L_0x03a7
            android.os.Bundle r3 = r1.b
            java.lang.Object r3 = r3.get(r2)
            boolean r3 = r3 instanceof byte[]
            if (r3 == 0) goto L_0x0359
            android.os.Bundle r3 = r1.b
            byte[] r13 = r3.getByteArray(r2)
            goto L_0x035a
        L_0x0359:
        L_0x035a:
            if (r13 != 0) goto L_0x02a0
            android.os.Bundle r3 = r1.b
            java.lang.Object r2 = r3.get(r2)
            if (r19 != 0) goto L_0x0371
            if (r2 == 0) goto L_0x0367
            goto L_0x0371
        L_0x0367:
            oxy r0 = new oxy
            aolx r2 = defpackage.aolx.INVALID_ARGUMENT_NULL
            java.lang.String r3 = "Property value cannot be null."
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x0371:
            if (r19 == 0) goto L_0x0377
            if (r2 != 0) goto L_0x0377
            goto L_0x02a0
        L_0x0377:
            oxy r0 = new oxy
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 43
            r4.<init>(r3)
            java.lang.String r3 = "Indexable contains unsupported data type: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = "."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            aolx r3 = defpackage.aolx.INVALID_INDEXABLE_UNSUPPORTED_DATA_TYPE
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x03a7:
            int r3 = r7.length
            if (r3 <= r14) goto L_0x02a0
            boolean[] r3 = java.util.Arrays.copyOf(r7, r14)
            android.os.Bundle r4 = r1.b
            r4.putBooleanArray(r2, r3)
            goto L_0x02a0
        L_0x03b5:
            oxy r0 = new oxy
            java.lang.String r3 = "Key string length is longer than 50, key : "
            int r4 = r2.length()
            if (r4 != 0) goto L_0x03c5
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x03c9
        L_0x03c5:
            java.lang.String r2 = r3.concat(r2)
        L_0x03c9:
            aolx r3 = defpackage.aolx.INVALID_INDEXABLE_STRING_KEY_TOO_LONG
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x03cf:
            oxy r0 = new oxy
            aolx r2 = defpackage.aolx.INVALID_ARGUMENT_NULL
            java.lang.String r3 = "Property key cannot be null."
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x03d9:
            return
        L_0x03da:
            oxy r0 = new oxy
            aolx r2 = defpackage.aolx.INVALID_INDEXABLE_TOO_MANY_FIELDS
            java.lang.String r3 = "Indexable contains more than 20 fields."
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x03e4:
            oxy r0 = new oxy
            aolx r2 = defpackage.aolx.INVALID_INDEXABLE_BAD_PATCH
            java.lang.String r3 = "Metadata can not be set in the patch Indexable."
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x03ee:
            r0 = move-exception
            oxy r2 = new oxy
            java.lang.String r3 = r0.getMessage()
            aolx r4 = defpackage.aolx.INVALID_ARGUMENT_URI
            r2.<init>(r3, r1, r4, r0)
            throw r2
        L_0x03fb:
            oxy r0 = new oxy
            aolx r2 = defpackage.aolx.INVALID_INDEXABLE_OVER_MAX_NESTING_DEPTH
            java.lang.String r3 = "Nested Indexable cannot be deeper than 5 levels."
            r0.<init>(r3, r1, r2)
            goto L_0x0406
        L_0x0405:
            throw r0
        L_0x0406:
            goto L_0x0405
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxz.a(com.google.firebase.appindexing.internal.Thing, java.lang.String, android.content.Context, boolean, int, oyb):void");
    }

    public static void a(Thing[] thingArr, String str, Context context, boolean z, oyb oyb) {
        Intent intent;
        if (thingArr != null) {
            int length = thingArr.length;
            if (length <= 1000) {
                int i = 0;
                while (i < length) {
                    Thing thing = thingArr[i];
                    if (thing != null) {
                        Bundle bundle = thing.b;
                        if (bundle != null) {
                            try {
                                bundle.keySet();
                                String[] a = thing.c.a("sliceUri");
                                if (a != null && a.length > 0) {
                                    Uri parse = Uri.parse(a[0]);
                                    if (((Boolean) pba.au.c()).booleanValue()) {
                                        int i2 = Build.VERSION.SDK_INT;
                                        if (!"vnd.android.slice".equals(context.getContentResolver().getType(parse))) {
                                            throw new oyf("Slice error. Given Slice Uri is not a SLICE_TYPE Uri.", parse, aolx.INVALID_SLICE_URI_TYPE);
                                        }
                                    }
                                    if (axrj.a.a().h() && !context.getPackageManager().resolveContentProvider(parse.getAuthority(), 0).packageName.equals(str)) {
                                        throw new oyf("Slice error. Invalid Slice Uri authority.", parse, aolx.INVALID_SLICE_AUTHORITY);
                                    } else if (((Boolean) pba.as.c()).booleanValue()) {
                                        int i3 = Build.VERSION.SDK_INT;
                                        try {
                                            int i4 = context.getPackageManager().getApplicationInfo(str, 0).flags & 2;
                                            if (!((Boolean) pba.aB.c()).booleanValue() || i4 != 0) {
                                                try {
                                                    intent = Intent.parseUri(thing.d, 3);
                                                } catch (URISyntaxException e) {
                                                    intent = new Intent("android.intent.action.VIEW", Uri.parse(thing.d));
                                                }
                                                if (intent.getComponent() == null && intent.getPackage() == null) {
                                                    intent.setPackage(str);
                                                }
                                                try {
                                                    Uri a2 = aoe.a(context).a(intent);
                                                    if (a2 == null) {
                                                        throw new oyf("Slice error. Could not map the Indexable url to the given Slice Uri.", parse, aolx.INVALID_SLICE_ARGUMENT);
                                                    } else if (!parse.equals(a2)) {
                                                        throw new oyf("Slice error. Slice Uri mapped from SliceProvider does not match the Slice Uri in the Indexable.", parse, aolx.INVALID_SLICE_ARGUMENT);
                                                    }
                                                } catch (IllegalArgumentException e2) {
                                                    throw new oyf("Slice error. Could not map the Indexable url to the given Slice Uri.", parse, aolx.INVALID_SLICE_ARGUMENT);
                                                }
                                            }
                                        } catch (PackageManager.NameNotFoundException e3) {
                                            throw new oxy("Unknown client package name.", thing, aolx.INVALID_REQUEST, e3);
                                        }
                                    }
                                }
                                Thing a3 = oyk.a(thing);
                                thingArr[i] = a3;
                                try {
                                    a(a3, str, context, z, 0, oyb);
                                    avqi b = oyl.b(a3);
                                    int i5 = b.U;
                                    if (i5 == -1) {
                                        i5 = aueh.a.a((Object) b).b(b);
                                        b.U = i5;
                                    }
                                    if (i5 <= 30000) {
                                        i++;
                                    } else {
                                        StringBuilder sb = new StringBuilder(92);
                                        sb.append("Indexable is ");
                                        sb.append(i5);
                                        sb.append(" bytes, which is larger than the maximum allowed size of 30000 bytes");
                                        throw new oxy(sb.toString(), a3, aolx.INVALID_INDEXABLE_TOO_LARGE);
                                    }
                                } catch (oxy e4) {
                                    throw new oxy(e4.getMessage(), a3, e4.a);
                                }
                            } catch (RuntimeException e5) {
                                throw new oxy("Properties contain bad parcelable.", thing, aolx.INVALID_INDEXABLE_BAD_PARCELABLE, e5);
                            }
                        } else {
                            throw new oxy("Properties cannot be null.", thing, aolx.INVALID_ARGUMENT_NULL);
                        }
                    } else {
                        throw new oxy("Indexable cannot be null.", aolx.INVALID_ARGUMENT_NULL);
                    }
                }
                return;
            }
            throw new oxy("Providing more than 1000 indexables in one update call is not allowed.", aolx.INVALID_ARGUMENT_TOO_MANY);
        }
        throw new oxy("Indexables cannot be null.", aolx.INVALID_ARGUMENT_NULL);
    }

    public static boolean a(Thing thing) {
        boolean[] c = thing.c.c("isGlobalSearchable");
        return c == null || c.length == 0 || c[0];
    }
}
