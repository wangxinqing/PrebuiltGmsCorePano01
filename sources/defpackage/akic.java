package defpackage;

import android.util.Log;
import com.google.android.chimera.Service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* renamed from: akic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akic {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r24) {
        /*
            r0 = r24
            int r1 = r24.hashCode()
            r2 = 23
            r3 = 21
            r4 = 7
            r5 = 34
            r6 = 63
            r7 = 39
            r8 = 33
            r9 = 84
            r10 = 12
            r11 = 72
            r12 = 78
            r13 = 74
            r14 = 65
            r15 = 95
            r16 = 27
            r17 = 79
            r18 = 87
            r19 = 86
            r20 = 3
            r21 = 83
            r22 = 36
            r23 = 4
            switch(r1) {
                case -2094695477: goto L_0x0615;
                case -2053308192: goto L_0x060a;
                case -2053263135: goto L_0x05ff;
                case -2052756090: goto L_0x05f4;
                case -2050684885: goto L_0x05e9;
                case -1964369267: goto L_0x05de;
                case -1921392712: goto L_0x05d3;
                case -1912447312: goto L_0x05c9;
                case -1897612291: goto L_0x05be;
                case -1884274053: goto L_0x05b2;
                case -1772467395: goto L_0x05a6;
                case -1771916171: goto L_0x059a;
                case -1741462721: goto L_0x058e;
                case -1740874356: goto L_0x0582;
                case -1700587098: goto L_0x0576;
                case -1682124937: goto L_0x056a;
                case -1676983117: goto L_0x055e;
                case -1655831541: goto L_0x0552;
                case -1648595317: goto L_0x0546;
                case -1637322286: goto L_0x053a;
                case -1625981817: goto L_0x052e;
                case -1521826541: goto L_0x0522;
                case -1480760809: goto L_0x0516;
                case -1396440608: goto L_0x050b;
                case -1367569419: goto L_0x04ff;
                case -1361036889: goto L_0x04f3;
                case -1326477025: goto L_0x04e7;
                case -1221262756: goto L_0x04db;
                case -1144292445: goto L_0x04cf;
                case -1137922232: goto L_0x04c3;
                case -1122304826: goto L_0x04b7;
                case -1109772796: goto L_0x04ab;
                case -1106572659: goto L_0x049f;
                case -1093701446: goto L_0x0493;
                case -1068340720: goto L_0x0487;
                case -1062811118: goto L_0x047b;
                case -991666997: goto L_0x0470;
                case -982670050: goto L_0x0464;
                case -911707720: goto L_0x0458;
                case -907977868: goto L_0x044c;
                case -894467854: goto L_0x0440;
                case -853258278: goto L_0x0434;
                case -803323243: goto L_0x0429;
                case -801413749: goto L_0x041d;
                case -793201736: goto L_0x0411;
                case -765945151: goto L_0x0405;
                case -735873907: goto L_0x03f9;
                case -687630504: goto L_0x03ed;
                case -616704468: goto L_0x03e1;
                case -602093443: goto L_0x03d5;
                case -594184620: goto L_0x03c9;
                case -494309456: goto L_0x03bd;
                case -482704010: goto L_0x03b2;
                case -480031188: goto L_0x03a6;
                case -475457925: goto L_0x039a;
                case -338178443: goto L_0x038e;
                case -318452207: goto L_0x0382;
                case -303628742: goto L_0x0376;
                case -299560451: goto L_0x036a;
                case -276749071: goto L_0x035e;
                case -210452739: goto L_0x0352;
                case -84391837: goto L_0x0346;
                case -79287106: goto L_0x033a;
                case -78601522: goto L_0x032e;
                case -63373159: goto L_0x0322;
                case -45393891: goto L_0x0316;
                case -11825110: goto L_0x030a;
                case 96922: goto L_0x02ff;
                case 97299: goto L_0x02f3;
                case 102843: goto L_0x02e7;
                case 114084: goto L_0x02db;
                case 120794: goto L_0x02cf;
                case 3016252: goto L_0x02c3;
                case 3045789: goto L_0x02b7;
                case 3148894: goto L_0x02ab;
                case 3433450: goto L_0x029f;
                case 3506395: goto L_0x0293;
                case 97526796: goto L_0x0287;
                case 106069776: goto L_0x027c;
                case 108704329: goto L_0x0270;
                case 109770977: goto L_0x0264;
                case 135260426: goto L_0x0258;
                case 166208699: goto L_0x024c;
                case 169749129: goto L_0x0240;
                case 189328014: goto L_0x0234;
                case 310317390: goto L_0x0228;
                case 339510492: goto L_0x021c;
                case 409204991: goto L_0x0210;
                case 444536918: goto L_0x0204;
                case 498460430: goto L_0x01f8;
                case 559132475: goto L_0x01ec;
                case 600590538: goto L_0x01e0;
                case 708899558: goto L_0x01d4;
                case 757331372: goto L_0x01c8;
                case 772885966: goto L_0x01bc;
                case 830244817: goto L_0x01b0;
                case 840925601: goto L_0x01a4;
                case 944808985: goto L_0x0198;
                case 957831062: goto L_0x018c;
                case 958132249: goto L_0x0180;
                case 980182244: goto L_0x0174;
                case 1002431734: goto L_0x0168;
                case 1040528330: goto L_0x015c;
                case 1164289476: goto L_0x0150;
                case 1191036144: goto L_0x0144;
                case 1239345090: goto L_0x0138;
                case 1284812246: goto L_0x012c;
                case 1381385199: goto L_0x0120;
                case 1381426776: goto L_0x0114;
                case 1501829832: goto L_0x0108;
                case 1532405365: goto L_0x00fc;
                case 1552746787: goto L_0x00f0;
                case 1565612293: goto L_0x00e4;
                case 1618734500: goto L_0x00d8;
                case 1738891626: goto L_0x00cc;
                case 1811306932: goto L_0x00c0;
                case 1900805475: goto L_0x00b4;
                case 1920052738: goto L_0x00a8;
                case 2059499969: goto L_0x009c;
                default: goto L_0x0034;
            }
        L_0x0034:
            switch(r1) {
                case -1704221286: goto L_0x0090;
                case -1704221285: goto L_0x0084;
                case -1704221284: goto L_0x0078;
                case -1704221283: goto L_0x006c;
                case -1704221282: goto L_0x0060;
                default: goto L_0x0037;
            }
        L_0x0037:
            switch(r1) {
                case 1191326709: goto L_0x0054;
                case 1191326710: goto L_0x0048;
                case 1191326711: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x061f
        L_0x003c:
            java.lang.String r1 = "administrative_area_level_3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 99
            goto L_0x0620
        L_0x0048:
            java.lang.String r1 = "administrative_area_level_2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 98
            goto L_0x0620
        L_0x0054:
            java.lang.String r1 = "administrative_area_level_1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 97
            goto L_0x0620
        L_0x0060:
            java.lang.String r1 = "sublocality_level_5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 123(0x7b, float:1.72E-43)
            goto L_0x0620
        L_0x006c:
            java.lang.String r1 = "sublocality_level_4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 122(0x7a, float:1.71E-43)
            goto L_0x0620
        L_0x0078:
            java.lang.String r1 = "sublocality_level_3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 121(0x79, float:1.7E-43)
            goto L_0x0620
        L_0x0084:
            java.lang.String r1 = "sublocality_level_2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 120(0x78, float:1.68E-43)
            goto L_0x0620
        L_0x0090:
            java.lang.String r1 = "sublocality_level_1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 119(0x77, float:1.67E-43)
            goto L_0x0620
        L_0x009c:
            java.lang.String r1 = "pet_store"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 71
            goto L_0x0620
        L_0x00a8:
            java.lang.String r1 = "movie_theater"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 64
            goto L_0x0620
        L_0x00b4:
            java.lang.String r1 = "locality"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x0620
        L_0x00c0:
            java.lang.String r1 = "department_store"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 29
            goto L_0x0620
        L_0x00cc:
            java.lang.String r1 = "clothing_store"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 25
            goto L_0x0620
        L_0x00d8:
            java.lang.String r1 = "subway_station"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 89
            goto L_0x0620
        L_0x00e4:
            java.lang.String r1 = "rv_park"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 81
            goto L_0x0620
        L_0x00f0:
            java.lang.String r1 = "dentist"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 28
            goto L_0x0620
        L_0x00fc:
            java.lang.String r1 = "bus_station"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 14
            goto L_0x0620
        L_0x0108:
            java.lang.String r1 = "transit_station"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 126(0x7e, float:1.77E-43)
            goto L_0x0620
        L_0x0114:
            java.lang.String r1 = "car_repair"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 19
            goto L_0x0620
        L_0x0120:
            java.lang.String r1 = "car_rental"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 18
            goto L_0x0620
        L_0x012c:
            java.lang.String r1 = "bowling_alley"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 13
            goto L_0x0620
        L_0x0138:
            java.lang.String r1 = "physiotherapist"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 73
            goto L_0x0620
        L_0x0144:
            java.lang.String r1 = "meal_delivery"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 60
            goto L_0x0620
        L_0x0150:
            java.lang.String r1 = "synthetic_geocode"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 125(0x7d, float:1.75E-43)
            goto L_0x0620
        L_0x015c:
            java.lang.String r1 = "hardware_store"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 46
            goto L_0x0620
        L_0x0168:
            java.lang.String r1 = "local_government_office"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 57
            goto L_0x0620
        L_0x0174:
            java.lang.String r1 = "car_dealer"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 17
            goto L_0x0620
        L_0x0180:
            java.lang.String r1 = "electrician"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 31
            goto L_0x0620
        L_0x018c:
            java.lang.String r1 = "country"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x0620
        L_0x0198:
            java.lang.String r1 = "electronics_store"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 32
            goto L_0x0620
        L_0x01a4:
            java.lang.String r1 = "bicycle_store"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 11
            goto L_0x0620
        L_0x01b0:
            java.lang.String r1 = "subpremise"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 124(0x7c, float:1.74E-43)
            goto L_0x0620
        L_0x01bc:
            java.lang.String r1 = "gas_station"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 41
            goto L_0x0620
        L_0x01c8:
            java.lang.String r1 = "post_box"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 110(0x6e, float:1.54E-43)
            goto L_0x0620
        L_0x01d4:
            java.lang.String r1 = "liquor_store"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 56
            goto L_0x0620
        L_0x01e0:
            java.lang.String r1 = "travel_agency"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 93
            goto L_0x0620
        L_0x01ec:
            java.lang.String r1 = "post_office"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 77
            goto L_0x0620
        L_0x01f8:
            java.lang.String r1 = "neighborhood"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 107(0x6b, float:1.5E-43)
            goto L_0x0620
        L_0x0204:
            java.lang.String r1 = "synagogue"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 90
            goto L_0x0620
        L_0x0210:
            java.lang.String r1 = "colloquial_area"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 100
            goto L_0x0620
        L_0x021c:
            java.lang.String r1 = "lodging"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 59
            goto L_0x0620
        L_0x0228:
            java.lang.String r1 = "hair_care"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 45
            goto L_0x0620
        L_0x0234:
            java.lang.String r1 = "university"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 94
            goto L_0x0620
        L_0x0240:
            java.lang.String r1 = "intersection"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 104(0x68, float:1.46E-43)
            goto L_0x0620
        L_0x024c:
            java.lang.String r1 = "library"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 55
            goto L_0x0620
        L_0x0258:
            java.lang.String r1 = "insurance_agency"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 51
            goto L_0x0620
        L_0x0264:
            java.lang.String r1 = "store"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 88
            goto L_0x0620
        L_0x0270:
            java.lang.String r1 = "route"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 116(0x74, float:1.63E-43)
            goto L_0x0620
        L_0x027c:
            java.lang.String r1 = "other"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 0
            goto L_0x0620
        L_0x0287:
            java.lang.String r1 = "floor"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 102(0x66, float:1.43E-43)
            goto L_0x0620
        L_0x0293:
            java.lang.String r1 = "room"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 115(0x73, float:1.61E-43)
            goto L_0x0620
        L_0x029f:
            java.lang.String r1 = "park"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 69
            goto L_0x0620
        L_0x02ab:
            java.lang.String r1 = "food"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 38
            goto L_0x0620
        L_0x02b7:
            java.lang.String r1 = "cafe"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 15
            goto L_0x0620
        L_0x02c3:
            java.lang.String r1 = "bank"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 8
            goto L_0x0620
        L_0x02cf:
            java.lang.String r1 = "zoo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 96
            goto L_0x0620
        L_0x02db:
            java.lang.String r1 = "spa"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 85
            goto L_0x0620
        L_0x02e7:
            java.lang.String r1 = "gym"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 44
            goto L_0x0620
        L_0x02f3:
            java.lang.String r1 = "bar"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 9
            goto L_0x0620
        L_0x02ff:
            java.lang.String r1 = "atm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 6
            goto L_0x0620
        L_0x030a:
            java.lang.String r1 = "car_wash"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 20
            goto L_0x0620
        L_0x0316:
            java.lang.String r1 = "laundry"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 53
            goto L_0x0620
        L_0x0322:
            java.lang.String r1 = "convenience_store"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 26
            goto L_0x0620
        L_0x032e:
            java.lang.String r1 = "hindu_temple"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 48
            goto L_0x0620
        L_0x033a:
            java.lang.String r1 = "geocode"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x0620
        L_0x0346:
            java.lang.String r1 = "point_of_interest"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x0620
        L_0x0352:
            java.lang.String r1 = "political"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 108(0x6c, float:1.51E-43)
            goto L_0x0620
        L_0x035e:
            java.lang.String r1 = "meal_takeaway"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 61
            goto L_0x0620
        L_0x036a:
            java.lang.String r1 = "train_station"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 92
            goto L_0x0620
        L_0x0376:
            java.lang.String r1 = "hospital"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 50
            goto L_0x0620
        L_0x0382:
            java.lang.String r1 = "premise"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 114(0x72, float:1.6E-43)
            goto L_0x0620
        L_0x038e:
            java.lang.String r1 = "taxi_stand"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 91
            goto L_0x0620
        L_0x039a:
            java.lang.String r1 = "plumber"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 75
            goto L_0x0620
        L_0x03a6:
            java.lang.String r1 = "general_contractor"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 42
            goto L_0x0620
        L_0x03b2:
            java.lang.String r1 = "art_gallery"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 5
            goto L_0x0620
        L_0x03bd:
            java.lang.String r1 = "postal_code_prefix"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 112(0x70, float:1.57E-43)
            goto L_0x0620
        L_0x03c9:
            java.lang.String r1 = "furniture_store"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 40
            goto L_0x0620
        L_0x03d5:
            java.lang.String r1 = "night_club"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 67
            goto L_0x0620
        L_0x03e1:
            java.lang.String r1 = "jewelry_store"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 52
            goto L_0x0620
        L_0x03ed:
            java.lang.String r1 = "home_goods_store"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 49
            goto L_0x0620
        L_0x03f9:
            java.lang.String r1 = "grocery_or_supermarket"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 43
            goto L_0x0620
        L_0x0405:
            java.lang.String r1 = "florist"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 37
            goto L_0x0620
        L_0x0411:
            java.lang.String r1 = "parking"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 70
            goto L_0x0620
        L_0x041d:
            java.lang.String r1 = "painter"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 68
            goto L_0x0620
        L_0x0429:
            java.lang.String r1 = "accounting"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 1
            goto L_0x0620
        L_0x0434:
            java.lang.String r1 = "finance"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 35
            goto L_0x0620
        L_0x0440:
            java.lang.String r1 = "cemetery"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 22
            goto L_0x0620
        L_0x044c:
            java.lang.String r1 = "school"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 82
            goto L_0x0620
        L_0x0458:
            java.lang.String r1 = "locksmith"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 58
            goto L_0x0620
        L_0x0464:
            java.lang.String r1 = "police"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 76
            goto L_0x0620
        L_0x0470:
            java.lang.String r1 = "airport"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 2
            goto L_0x0620
        L_0x047b:
            java.lang.String r1 = "museum"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 66
            goto L_0x0620
        L_0x0487:
            java.lang.String r1 = "mosque"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 62
            goto L_0x0620
        L_0x0493:
            java.lang.String r1 = "beauty_salon"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 10
            goto L_0x0620
        L_0x049f:
            java.lang.String r1 = "city_hall"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 24
            goto L_0x0620
        L_0x04ab:
            java.lang.String r1 = "lawyer"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 54
            goto L_0x0620
        L_0x04b7:
            java.lang.String r1 = "roofing_contractor"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 80
            goto L_0x0620
        L_0x04c3:
            java.lang.String r1 = "campground"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 16
            goto L_0x0620
        L_0x04cf:
            java.lang.String r1 = "sublocality"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 118(0x76, float:1.65E-43)
            goto L_0x0620
        L_0x04db:
            java.lang.String r1 = "health"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 47
            goto L_0x0620
        L_0x04e7:
            java.lang.String r1 = "doctor"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 30
            goto L_0x0620
        L_0x04f3:
            java.lang.String r1 = "church"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 23
            goto L_0x0620
        L_0x04ff:
            java.lang.String r1 = "casino"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 21
            goto L_0x0620
        L_0x050b:
            java.lang.String r1 = "bakery"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 7
            goto L_0x0620
        L_0x0516:
            java.lang.String r1 = "establishment"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 34
            goto L_0x0620
        L_0x0522:
            java.lang.String r1 = "movie_rental"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 63
            goto L_0x0620
        L_0x052e:
            java.lang.String r1 = "funeral_home"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 39
            goto L_0x0620
        L_0x053a:
            java.lang.String r1 = "embassy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 33
            goto L_0x0620
        L_0x0546:
            java.lang.String r1 = "shopping_mall"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 84
            goto L_0x0620
        L_0x0552:
            java.lang.String r1 = "book_store"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 12
            goto L_0x0620
        L_0x055e:
            java.lang.String r1 = "pharmacy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 72
            goto L_0x0620
        L_0x056a:
            java.lang.String r1 = "real_estate_agency"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 78
            goto L_0x0620
        L_0x0576:
            java.lang.String r1 = "place_of_worship"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 74
            goto L_0x0620
        L_0x0582:
            java.lang.String r1 = "moving_company"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 65
            goto L_0x0620
        L_0x058e:
            java.lang.String r1 = "veterinary_care"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 95
            goto L_0x0620
        L_0x059a:
            java.lang.String r1 = "courthouse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 27
            goto L_0x0620
        L_0x05a6:
            java.lang.String r1 = "restaurant"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 79
            goto L_0x0620
        L_0x05b2:
            java.lang.String r1 = "storage"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 87
            goto L_0x0620
        L_0x05be:
            java.lang.String r1 = "stadium"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 86
            goto L_0x0620
        L_0x05c9:
            java.lang.String r1 = "amusement_park"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 3
            goto L_0x0620
        L_0x05d3:
            java.lang.String r1 = "street_address"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 117(0x75, float:1.64E-43)
            goto L_0x0620
        L_0x05de:
            java.lang.String r1 = "shoe_store"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 83
            goto L_0x0620
        L_0x05e9:
            java.lang.String r1 = "fire_station"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 36
            goto L_0x0620
        L_0x05f4:
            java.lang.String r1 = "postal_town"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 113(0x71, float:1.58E-43)
            goto L_0x0620
        L_0x05ff:
            java.lang.String r1 = "postal_code"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 111(0x6f, float:1.56E-43)
            goto L_0x0620
        L_0x060a:
            java.lang.String r1 = "natural_feature"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 106(0x6a, float:1.49E-43)
            goto L_0x0620
        L_0x0615:
            java.lang.String r1 = "aquarium"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x061f
            r0 = 4
            goto L_0x0620
        L_0x061f:
            r0 = -1
        L_0x0620:
            switch(r0) {
                case 1: goto L_0x076d;
                case 2: goto L_0x076b;
                case 3: goto L_0x076a;
                case 4: goto L_0x0769;
                case 5: goto L_0x0767;
                case 6: goto L_0x0765;
                case 7: goto L_0x0764;
                case 8: goto L_0x0761;
                case 9: goto L_0x075e;
                case 10: goto L_0x075b;
                case 11: goto L_0x0758;
                case 12: goto L_0x0757;
                case 13: goto L_0x0754;
                case 14: goto L_0x0751;
                case 15: goto L_0x074e;
                case 16: goto L_0x074b;
                case 17: goto L_0x0748;
                case 18: goto L_0x0745;
                case 19: goto L_0x0742;
                case 20: goto L_0x073f;
                case 21: goto L_0x073e;
                case 22: goto L_0x073b;
                case 23: goto L_0x073a;
                case 24: goto L_0x0737;
                case 25: goto L_0x0734;
                case 26: goto L_0x0731;
                case 27: goto L_0x0730;
                case 28: goto L_0x072d;
                case 29: goto L_0x072a;
                case 30: goto L_0x0727;
                case 31: goto L_0x0724;
                case 32: goto L_0x0721;
                case 33: goto L_0x0720;
                case 34: goto L_0x071f;
                case 35: goto L_0x071c;
                case 36: goto L_0x071b;
                case 37: goto L_0x0718;
                case 38: goto L_0x0715;
                case 39: goto L_0x0714;
                case 40: goto L_0x0711;
                case 41: goto L_0x070e;
                case 42: goto L_0x070b;
                case 43: goto L_0x0708;
                case 44: goto L_0x0705;
                case 45: goto L_0x0702;
                case 46: goto L_0x06ff;
                case 47: goto L_0x06fc;
                case 48: goto L_0x06f9;
                case 49: goto L_0x06f6;
                case 50: goto L_0x06f3;
                case 51: goto L_0x06f0;
                case 52: goto L_0x06ed;
                case 53: goto L_0x06ea;
                case 54: goto L_0x06e7;
                case 55: goto L_0x06e4;
                case 56: goto L_0x06e1;
                case 57: goto L_0x06de;
                case 58: goto L_0x06db;
                case 59: goto L_0x06d8;
                case 60: goto L_0x06d5;
                case 61: goto L_0x06d2;
                case 62: goto L_0x06cf;
                case 63: goto L_0x06ce;
                case 64: goto L_0x06cb;
                case 65: goto L_0x06ca;
                case 66: goto L_0x06c7;
                case 67: goto L_0x06c4;
                case 68: goto L_0x06c1;
                case 69: goto L_0x06be;
                case 70: goto L_0x06bb;
                case 71: goto L_0x06b8;
                case 72: goto L_0x06b7;
                case 73: goto L_0x06b4;
                case 74: goto L_0x06b3;
                case 75: goto L_0x06b0;
                case 76: goto L_0x06ad;
                case 77: goto L_0x06aa;
                case 78: goto L_0x06a9;
                case 79: goto L_0x06a8;
                case 80: goto L_0x06a5;
                case 81: goto L_0x06a2;
                case 82: goto L_0x069f;
                case 83: goto L_0x069e;
                case 84: goto L_0x069d;
                case 85: goto L_0x069a;
                case 86: goto L_0x0699;
                case 87: goto L_0x0698;
                case 88: goto L_0x0695;
                case 89: goto L_0x0692;
                case 90: goto L_0x068f;
                case 91: goto L_0x068c;
                case 92: goto L_0x0689;
                case 93: goto L_0x0686;
                case 94: goto L_0x0683;
                case 95: goto L_0x0682;
                case 96: goto L_0x067f;
                case 97: goto L_0x067c;
                case 98: goto L_0x0679;
                case 99: goto L_0x0676;
                case 100: goto L_0x0673;
                case 101: goto L_0x0670;
                case 102: goto L_0x066d;
                case 103: goto L_0x066a;
                case 104: goto L_0x0667;
                case 105: goto L_0x0664;
                case 106: goto L_0x0661;
                case 107: goto L_0x065e;
                case 108: goto L_0x065b;
                case 109: goto L_0x0658;
                case 110: goto L_0x0655;
                case 111: goto L_0x0652;
                case 112: goto L_0x064f;
                case 113: goto L_0x064c;
                case 114: goto L_0x0649;
                case 115: goto L_0x0646;
                case 116: goto L_0x0643;
                case 117: goto L_0x0640;
                case 118: goto L_0x063d;
                case 119: goto L_0x063a;
                case 120: goto L_0x0637;
                case 121: goto L_0x0634;
                case 122: goto L_0x0631;
                case 123: goto L_0x062e;
                case 124: goto L_0x062b;
                case 125: goto L_0x0628;
                case 126: goto L_0x0625;
                default: goto L_0x0623;
            }
        L_0x0623:
            r0 = 0
            return r0
        L_0x0625:
            r0 = 1030(0x406, float:1.443E-42)
            return r0
        L_0x0628:
            r0 = 1029(0x405, float:1.442E-42)
            return r0
        L_0x062b:
            r0 = 1028(0x404, float:1.44E-42)
            return r0
        L_0x062e:
            r0 = 1027(0x403, float:1.439E-42)
            return r0
        L_0x0631:
            r0 = 1026(0x402, float:1.438E-42)
            return r0
        L_0x0634:
            r0 = 1025(0x401, float:1.436E-42)
            return r0
        L_0x0637:
            r0 = 1024(0x400, float:1.435E-42)
            return r0
        L_0x063a:
            r0 = 1023(0x3ff, float:1.434E-42)
            return r0
        L_0x063d:
            r0 = 1022(0x3fe, float:1.432E-42)
            return r0
        L_0x0640:
            r0 = 1021(0x3fd, float:1.431E-42)
            return r0
        L_0x0643:
            r0 = 1020(0x3fc, float:1.43E-42)
            return r0
        L_0x0646:
            r0 = 1019(0x3fb, float:1.428E-42)
            return r0
        L_0x0649:
            r0 = 1018(0x3fa, float:1.427E-42)
            return r0
        L_0x064c:
            r0 = 1017(0x3f9, float:1.425E-42)
            return r0
        L_0x064f:
            r0 = 1016(0x3f8, float:1.424E-42)
            return r0
        L_0x0652:
            r0 = 1015(0x3f7, float:1.422E-42)
            return r0
        L_0x0655:
            r0 = 1014(0x3f6, float:1.421E-42)
            return r0
        L_0x0658:
            r0 = 1013(0x3f5, float:1.42E-42)
            return r0
        L_0x065b:
            r0 = 1012(0x3f4, float:1.418E-42)
            return r0
        L_0x065e:
            r0 = 1011(0x3f3, float:1.417E-42)
            return r0
        L_0x0661:
            r0 = 1010(0x3f2, float:1.415E-42)
            return r0
        L_0x0664:
            r0 = 1009(0x3f1, float:1.414E-42)
            return r0
        L_0x0667:
            r0 = 1008(0x3f0, float:1.413E-42)
            return r0
        L_0x066a:
            r0 = 1007(0x3ef, float:1.411E-42)
            return r0
        L_0x066d:
            r0 = 1006(0x3ee, float:1.41E-42)
            return r0
        L_0x0670:
            r0 = 1005(0x3ed, float:1.408E-42)
            return r0
        L_0x0673:
            r0 = 1004(0x3ec, float:1.407E-42)
            return r0
        L_0x0676:
            r0 = 1003(0x3eb, float:1.406E-42)
            return r0
        L_0x0679:
            r0 = 1002(0x3ea, float:1.404E-42)
            return r0
        L_0x067c:
            r0 = 1001(0x3e9, float:1.403E-42)
            return r0
        L_0x067f:
            r0 = 96
            return r0
        L_0x0682:
            return r15
        L_0x0683:
            r0 = 94
            return r0
        L_0x0686:
            r0 = 93
            return r0
        L_0x0689:
            r0 = 92
            return r0
        L_0x068c:
            r0 = 91
            return r0
        L_0x068f:
            r0 = 90
            return r0
        L_0x0692:
            r0 = 89
            return r0
        L_0x0695:
            r0 = 88
            return r0
        L_0x0698:
            return r18
        L_0x0699:
            return r19
        L_0x069a:
            r0 = 85
            return r0
        L_0x069d:
            return r9
        L_0x069e:
            return r21
        L_0x069f:
            r0 = 82
            return r0
        L_0x06a2:
            r0 = 81
            return r0
        L_0x06a5:
            r0 = 80
            return r0
        L_0x06a8:
            return r17
        L_0x06a9:
            return r12
        L_0x06aa:
            r0 = 77
            return r0
        L_0x06ad:
            r0 = 76
            return r0
        L_0x06b0:
            r0 = 75
            return r0
        L_0x06b3:
            return r13
        L_0x06b4:
            r0 = 73
            return r0
        L_0x06b7:
            return r11
        L_0x06b8:
            r0 = 71
            return r0
        L_0x06bb:
            r0 = 70
            return r0
        L_0x06be:
            r0 = 69
            return r0
        L_0x06c1:
            r0 = 68
            return r0
        L_0x06c4:
            r0 = 67
            return r0
        L_0x06c7:
            r0 = 66
            return r0
        L_0x06ca:
            return r14
        L_0x06cb:
            r0 = 64
            return r0
        L_0x06ce:
            return r6
        L_0x06cf:
            r0 = 62
            return r0
        L_0x06d2:
            r0 = 61
            return r0
        L_0x06d5:
            r0 = 60
            return r0
        L_0x06d8:
            r0 = 59
            return r0
        L_0x06db:
            r0 = 58
            return r0
        L_0x06de:
            r0 = 57
            return r0
        L_0x06e1:
            r0 = 56
            return r0
        L_0x06e4:
            r0 = 55
            return r0
        L_0x06e7:
            r0 = 54
            return r0
        L_0x06ea:
            r0 = 53
            return r0
        L_0x06ed:
            r0 = 52
            return r0
        L_0x06f0:
            r0 = 51
            return r0
        L_0x06f3:
            r0 = 50
            return r0
        L_0x06f6:
            r0 = 49
            return r0
        L_0x06f9:
            r0 = 48
            return r0
        L_0x06fc:
            r0 = 47
            return r0
        L_0x06ff:
            r0 = 46
            return r0
        L_0x0702:
            r0 = 45
            return r0
        L_0x0705:
            r0 = 44
            return r0
        L_0x0708:
            r0 = 43
            return r0
        L_0x070b:
            r0 = 42
            return r0
        L_0x070e:
            r0 = 41
            return r0
        L_0x0711:
            r0 = 40
            return r0
        L_0x0714:
            return r7
        L_0x0715:
            r0 = 38
            return r0
        L_0x0718:
            r0 = 37
            return r0
        L_0x071b:
            return r22
        L_0x071c:
            r0 = 35
            return r0
        L_0x071f:
            return r5
        L_0x0720:
            return r8
        L_0x0721:
            r0 = 32
            return r0
        L_0x0724:
            r0 = 31
            return r0
        L_0x0727:
            r0 = 30
            return r0
        L_0x072a:
            r0 = 29
            return r0
        L_0x072d:
            r0 = 28
            return r0
        L_0x0730:
            return r16
        L_0x0731:
            r0 = 26
            return r0
        L_0x0734:
            r0 = 25
            return r0
        L_0x0737:
            r0 = 24
            return r0
        L_0x073a:
            return r2
        L_0x073b:
            r0 = 22
            return r0
        L_0x073e:
            return r3
        L_0x073f:
            r0 = 20
            return r0
        L_0x0742:
            r0 = 19
            return r0
        L_0x0745:
            r0 = 18
            return r0
        L_0x0748:
            r0 = 17
            return r0
        L_0x074b:
            r0 = 16
            return r0
        L_0x074e:
            r0 = 15
            return r0
        L_0x0751:
            r0 = 14
            return r0
        L_0x0754:
            r0 = 13
            return r0
        L_0x0757:
            return r10
        L_0x0758:
            r0 = 11
            return r0
        L_0x075b:
            r0 = 10
            return r0
        L_0x075e:
            r0 = 9
            return r0
        L_0x0761:
            r0 = 8
            return r0
        L_0x0764:
            return r4
        L_0x0765:
            r0 = 6
            return r0
        L_0x0767:
            r0 = 5
            return r0
        L_0x0769:
            return r23
        L_0x076a:
            return r20
        L_0x076b:
            r0 = 2
            return r0
        L_0x076d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akic.a(java.lang.String):int");
    }

    public static String b(int i) {
        if (i == 0) {
            return null;
        }
        if (i == 2) {
            return "address";
        }
        if (i == 34) {
            return "establishment";
        }
        if (i == 1007) {
            return "geocode";
        }
        if (i == 4) {
            return "(regions)";
        }
        if (i == 5) {
            return "(cities)";
        }
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", "toAutocompleteFilterString called without a valid type");
        }
        return null;
    }

    public static String a(int i) {
        switch (i) {
            case 0:
                return "other";
            case 1:
                return "accounting";
            case 2:
                return "airport";
            case 3:
                return "amusement_park";
            case 4:
                return "aquarium";
            case 5:
                return "art_gallery";
            case 6:
                return "atm";
            case 7:
                return "bakery";
            case 8:
                return "bank";
            case 9:
                return "bar";
            case 10:
                return "beauty_salon";
            case 11:
                return "bicycle_store";
            case 12:
                return "book_store";
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return "bowling_alley";
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return "bus_station";
            case Service.START_CONTINUATION_MASK:
                return "cafe";
            case 16:
                return "campground";
            case 17:
                return "car_dealer";
            case 18:
                return "car_rental";
            case 19:
                return "car_repair";
            case 20:
                return "car_wash";
            case 21:
                return "casino";
            case 22:
                return "cemetery";
            case 23:
                return "church";
            case 24:
                return "city_hall";
            case 25:
                return "clothing_store";
            case 26:
                return "convenience_store";
            case 27:
                return "courthouse";
            case 28:
                return "dentist";
            case 29:
                return "department_store";
            case 30:
                return "doctor";
            case 31:
                return "electrician";
            case 32:
                return "electronics_store";
            case 33:
                return "embassy";
            case 34:
                return "establishment";
            case 35:
                return "finance";
            case 36:
                return "fire_station";
            case 37:
                return "florist";
            case 38:
                return "food";
            case 39:
                return "funeral_home";
            case 40:
                return "furniture_store";
            case 41:
                return "gas_station";
            case 42:
                return "general_contractor";
            case 43:
                return "grocery_or_supermarket";
            case 44:
                return "gym";
            case 45:
                return "hair_care";
            case 46:
                return "hardware_store";
            case 47:
                return "health";
            case 48:
                return "hindu_temple";
            case 49:
                return "home_goods_store";
            case 50:
                return "hospital";
            case 51:
                return "insurance_agency";
            case 52:
                return "jewelry_store";
            case 53:
                return "laundry";
            case 54:
                return "lawyer";
            case 55:
                return "library";
            case 56:
                return "liquor_store";
            case 57:
                return "local_government_office";
            case 58:
                return "locksmith";
            case 59:
                return "lodging";
            case 60:
                return "meal_delivery";
            case 61:
                return "meal_takeaway";
            case 62:
                return "mosque";
            case 63:
                return "movie_rental";
            case 64:
                return "movie_theater";
            case 65:
                return "moving_company";
            case 66:
                return "museum";
            case 67:
                return "night_club";
            case 68:
                return "painter";
            case 69:
                return "park";
            case 70:
                return "parking";
            case 71:
                return "pet_store";
            case 72:
                return "pharmacy";
            case 73:
                return "physiotherapist";
            case 74:
                return "place_of_worship";
            case 75:
                return "plumber";
            case 76:
                return "police";
            case 77:
                return "post_office";
            case 78:
                return "real_estate_agency";
            case 79:
                return "restaurant";
            case 80:
                return "roofing_contractor";
            case 81:
                return "rv_park";
            case 82:
                return "school";
            case 83:
                return "shoe_store";
            case 84:
                return "shopping_mall";
            case 85:
                return "spa";
            case 86:
                return "stadium";
            case 87:
                return "storage";
            case 88:
                return "store";
            case 89:
                return "subway_station";
            case 90:
                return "synagogue";
            case 91:
                return "taxi_stand";
            case 92:
                return "train_station";
            case 93:
                return "travel_agency";
            case 94:
                return "university";
            case 95:
                return "veterinary_care";
            case 96:
                return "zoo";
            default:
                switch (i) {
                    case 1001:
                        return "administrative_area_level_1";
                    case 1002:
                        return "administrative_area_level_2";
                    case 1003:
                        return "administrative_area_level_3";
                    case 1004:
                        return "colloquial_area";
                    case 1005:
                        return "country";
                    case 1006:
                        return "floor";
                    case 1007:
                        return "geocode";
                    case 1008:
                        return "intersection";
                    case 1009:
                        return "locality";
                    case 1010:
                        return "natural_feature";
                    case 1011:
                        return "neighborhood";
                    case 1012:
                        return "political";
                    case 1013:
                        return "point_of_interest";
                    case 1014:
                        return "post_box";
                    case 1015:
                        return "postal_code";
                    case 1016:
                        return "postal_code_prefix";
                    case 1017:
                        return "postal_town";
                    case 1018:
                        return "premise";
                    case 1019:
                        return "room";
                    case 1020:
                        return "route";
                    case 1021:
                        return "street_address";
                    case 1022:
                        return "sublocality";
                    case 1023:
                        return "sublocality_level_1";
                    case 1024:
                        return "sublocality_level_2";
                    case 1025:
                        return "sublocality_level_3";
                    case 1026:
                        return "sublocality_level_4";
                    case 1027:
                        return "sublocality_level_5";
                    case 1028:
                        return "subpremise";
                    case 1029:
                        return "synthetic_geocode";
                    case 1030:
                        return "transit_station";
                    default:
                        StringBuilder sb = new StringBuilder(19);
                        sb.append("other (");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public static List a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(a(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }
}
