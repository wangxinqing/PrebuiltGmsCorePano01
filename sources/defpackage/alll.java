package defpackage;

import android.os.SystemClock;
import com.google.android.chimera.Service;
import com.google.android.gms.userlocation.PlaceEstimate;
import com.google.android.gms.userlocation.Position;
import com.google.android.gms.userlocation.SemanticLocation;
import com.google.android.gms.userlocation.TransitEstimate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.chromium.net.UrlRequest;

/* renamed from: alll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alll {
    static final long a = (System.currentTimeMillis() - SystemClock.elapsedRealtime());
    private static final List b = new ArrayList(0);
    private static final TransitEstimate c = new TransitEstimate(0, 1.0f);

    public static int a(int i) {
        return i != 2 ? 0 : 2;
    }

    public static aklr a(Position position) {
        if (position != null) {
            return new aklr((int) (position.a * 1.0E7d), (int) (position.b * 1.0E7d), 0, Float.NaN, "unknown", 0, -1.0f);
        }
        return null;
    }

    private static PlaceEstimate a(akhx akhx) {
        boolean z;
        String str;
        adtz adtz = new adtz();
        adtz.a = akhx.b;
        adtz.b = akhx.f;
        adtz.c = akhx.d;
        adtz.d = akhx.h;
        adtz.f = akhx.e;
        adtz.g = akhx.j;
        int a2 = astg.a(akhx.c);
        if (a2 != 0) {
            switch (a2) {
                case 1:
                    str = "OTHER";
                    break;
                case 2:
                    str = "AIRPORT";
                    break;
                case 3:
                    str = "ASSOCIATION_OR_ORGANIZATION";
                    break;
                case 4:
                    str = "ATM";
                    break;
                case 5:
                    str = "ATTRACTION";
                    break;
                case 6:
                    str = "BANK";
                    break;
                case 7:
                    str = "BAR";
                    break;
                case 8:
                    str = "BEAUTY";
                    break;
                case 9:
                    str = "BUS_STOP";
                    break;
                case 10:
                    str = "CAFE";
                    break;
                case 11:
                    str = "CLOTHING_STORE";
                    break;
                case 12:
                    str = "CULTURE";
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    str = "EDUCATION";
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    str = "EMERGENCY_SERVICES";
                    break;
                case Service.START_CONTINUATION_MASK:
                    str = "ENTERTAINMENT_AND_RECREATION";
                    break;
                case 16:
                    str = "EVENT_VENUE";
                    break;
                case 17:
                    str = "FOOD_STORE";
                    break;
                case 18:
                    str = "GAS_STATION";
                    break;
                case 19:
                    str = "GYM";
                    break;
                case 20:
                    str = "HEALTH";
                    break;
                case 21:
                    str = "HOSPITAL";
                    break;
                case 22:
                    str = "INDOOR_LODGING";
                    break;
                case 23:
                    str = "MOVIE_THEATER";
                    break;
                case 24:
                    str = "NIGHTLIFE";
                    break;
                case 25:
                    str = "PARK";
                    break;
                case 26:
                    str = "PHARMACY";
                    break;
                case 27:
                    str = "PLACE_OF_WORSHIP";
                    break;
                case 28:
                    str = "PRODUCTION";
                    break;
                case 29:
                    str = "PROFESSIONAL_SERVICES";
                    break;
                case 30:
                    str = "PUBLIC_SERVICES";
                    break;
                case 31:
                    str = "REAL_ESTATE";
                    break;
                case 32:
                    str = "RESTAURANT";
                    break;
                case 33:
                    str = "SERVICES";
                    break;
                case 34:
                    str = "SHOPPING_CENTER";
                    break;
                case 35:
                    str = "STORE";
                    break;
                case 36:
                    str = "TRANSIT_STATION";
                    break;
                case 37:
                    str = "CAR_REPAIR";
                    break;
                case 38:
                    str = "WHOLESALE_GROCER";
                    break;
                case 39:
                    str = "BAKERY";
                    break;
                case 40:
                    str = "OUTLET_MALL";
                    break;
                case 41:
                    str = "LANDMARK";
                    break;
                case 42:
                    str = "NATURE_PRESERVE";
                    break;
                case 43:
                    str = "MONUMENT";
                    break;
                case 45:
                    str = "HISTORICAL_LANDMARK";
                    break;
                case 46:
                    str = "HISTORIC_SITE";
                    break;
                case 47:
                    str = "ARENA";
                    break;
                case 48:
                    str = "STADIUM";
                    break;
                case 49:
                    str = "AMUSEMENT_PARK";
                    break;
                case 50:
                    str = "MUSEUM";
                    break;
                case 51:
                    str = "FAST_FOOD_RESTAURANT";
                    break;
                default:
                    str = "FORTRESS";
                    break;
            }
            adtz.e = str.toLowerCase(Locale.US);
        }
        iva.a(adtz.a, (Object) "Place Id cannot be empty");
        float f = adtz.b;
        boolean z2 = true;
        if (f < 0.0f || f > 1.0f) {
            z = false;
        } else {
            z = true;
        }
        iva.b(z, "Invalid likelihood");
        float f2 = adtz.f;
        if (f2 < 0.0f || f2 > 1.0f) {
            z2 = false;
        }
        iva.b(z2, "Invalid flatLikelihood");
        return new PlaceEstimate(adtz.a, adtz.b, adtz.c, adtz.d, adtz.e, adtz.f, adtz.g);
    }

    public static SemanticLocation a(akip akip) {
        if (akip != null) {
            return a(akip, akip.b, true);
        }
        return null;
    }

    public static SemanticLocation a(akip akip, long j, boolean z) {
        return a(akip, z, false, j);
    }

    public static SemanticLocation a(akip akip, boolean z) {
        return a(akip, z, true, akip.b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.userlocation.SemanticLocation a(defpackage.akip r11, boolean r12, boolean r13, long r14) {
        /*
            r0 = 0
            if (r11 == 0) goto L_0x0137
            aduc r1 = new aduc
            r1.<init>()
            int r2 = r11.a
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L_0x0010
            r2 = 2
            goto L_0x0011
        L_0x0010:
            r2 = 1
        L_0x0011:
            if (r2 != r4) goto L_0x0015
            r3 = r2
            goto L_0x0016
        L_0x0015:
        L_0x0016:
            java.lang.String r2 = "Invalid state"
            defpackage.iva.b(r4, r2)
            r1.a = r3
            r1.g = r4
            long r2 = a
            long r14 = r14 + r2
            r1.b = r14
            com.google.android.gms.userlocation.TransitEstimate r14 = c
            r1.c = r14
            akhy r14 = r11.c
            java.util.List r14 = r14.b
            boolean r15 = r14.isEmpty()
            r2 = 0
            if (r15 != 0) goto L_0x00a8
            java.util.ArrayList r15 = new java.util.ArrayList
            r3 = 3
            r15.<init>(r3)
            java.lang.Object r3 = r14.get(r2)
            akhx r3 = (defpackage.akhx) r3
            com.google.android.gms.userlocation.PlaceEstimate r3 = a((defpackage.akhx) r3)
            r15.add(r3)
            java.lang.Object r3 = r14.get(r2)
            akhx r3 = (defpackage.akhx) r3
            int r3 = r3.h
            int r3 = r3 + -1
            java.lang.Object r5 = r14.get(r2)
            akhx r5 = (defpackage.akhx) r5
            java.util.List r5 = r5.g
            r7 = r0
            r6 = 1
        L_0x005b:
            int r8 = r14.size()
            if (r6 >= r8) goto L_0x009d
            java.lang.Object r8 = r14.get(r6)
            akhx r8 = (defpackage.akhx) r8
            java.lang.String r9 = r8.b
            boolean r9 = r5.contains(r9)
            if (r9 != 0) goto L_0x0070
        L_0x006f:
            goto L_0x007b
        L_0x0070:
            if (r7 == 0) goto L_0x007a
            float r9 = r8.f
            float r10 = r7.f
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x006f
        L_0x007a:
            r7 = r8
        L_0x007b:
            int r6 = r6 + 1
            int r8 = r14.size()
            if (r6 == r8) goto L_0x008e
            java.lang.Object r8 = r14.get(r6)
            akhx r8 = (defpackage.akhx) r8
            int r8 = r8.h
            if (r8 < r3) goto L_0x008e
            goto L_0x009c
        L_0x008e:
            if (r7 == 0) goto L_0x009d
            com.google.android.gms.userlocation.PlaceEstimate r5 = a((defpackage.akhx) r7)
            r15.add(r5)
            java.util.List r5 = r7.g
            int r3 = r3 + -1
            r7 = r0
        L_0x009c:
            goto L_0x005b
        L_0x009d:
            java.util.Collections.reverse(r15)
            if (r12 != 0) goto L_0x00a7
            java.util.List r15 = r15.subList(r2, r4)
            goto L_0x00aa
        L_0x00a7:
            goto L_0x00aa
        L_0x00a8:
            java.util.List r15 = b
        L_0x00aa:
            java.lang.String r12 = "PlaceHierarchy must not be null"
            defpackage.iva.a((java.lang.Object) r15, (java.lang.Object) r12)
            r1.d = r15
            aklr r12 = r11.e
            if (r12 == 0) goto L_0x00cf
            int r14 = r12.a
            int r12 = r12.b
            com.google.android.gms.userlocation.Position r0 = new com.google.android.gms.userlocation.Position
            double r14 = (double) r14
            r5 = 4711630319722168320(0x416312d000000000, double:1.0E7)
            java.lang.Double.isNaN(r14)
            double r14 = r14 / r5
            double r7 = (double) r12
            java.lang.Double.isNaN(r7)
            double r7 = r7 / r5
            r0.<init>(r14, r7)
            goto L_0x00d0
        L_0x00cf:
        L_0x00d0:
            r1.f = r0
            if (r13 == 0) goto L_0x00fc
            akhy r11 = r11.c
            java.util.List r11 = r11.b
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L_0x00fc
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x00e7:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00fb
            java.lang.Object r13 = r11.next()
            akhx r13 = (defpackage.akhx) r13
            com.google.android.gms.userlocation.PlaceEstimate r13 = a((defpackage.akhx) r13)
            r12.add(r13)
            goto L_0x00e7
        L_0x00fb:
            goto L_0x00fe
        L_0x00fc:
            java.util.List r12 = b
        L_0x00fe:
            java.lang.String r11 = "PlaceEstimates must not be null"
            defpackage.iva.a((java.lang.Object) r12, (java.lang.Object) r11)
            r1.e = r12
            boolean r11 = r1.g
            java.lang.String r12 = "State not set"
            defpackage.iva.b(r11, r12)
            long r11 = r1.b
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0116
            goto L_0x0117
        L_0x0116:
            r4 = 0
        L_0x0117:
            java.lang.String r11 = "Invalid timestamp"
            defpackage.iva.b(r4, r11)
            com.google.android.gms.userlocation.TransitEstimate r11 = r1.c
            java.lang.String r12 = "Transit estimate must not be null"
            defpackage.iva.a((java.lang.Object) r11, (java.lang.Object) r12)
            com.google.android.gms.userlocation.SemanticLocation r11 = new com.google.android.gms.userlocation.SemanticLocation
            int r3 = r1.a
            long r4 = r1.b
            com.google.android.gms.userlocation.TransitEstimate r6 = r1.c
            java.util.List r7 = r1.d
            java.util.List r8 = r1.e
            com.google.android.gms.userlocation.Position r9 = r1.f
            r2 = r11
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r11
        L_0x0137:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alll.a(akip, boolean, boolean, long):com.google.android.gms.userlocation.SemanticLocation");
    }
}
