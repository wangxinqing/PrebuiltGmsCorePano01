package defpackage;

import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: acya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acya {
    SparseArray a;
    int b = 0;

    public acya() {
        byte[] bArr;
        bazf j = azqq.a.a().j();
        if (j != null) {
            bArr = j.k();
        } else {
            bArr = null;
        }
        if (bArr != null) {
            try {
                bazf bazf = (bazf) aucj.a((aucj) bazf.b, bArr, aubs.c());
                SparseArray sparseArray = this.a;
                if (sparseArray == null) {
                    this.a = new SparseArray(64);
                } else {
                    sparseArray.clear();
                }
                for (baze baze : bazf.a) {
                    this.a.put(baze.a, Integer.valueOf(baze.b));
                }
            } catch (auda e) {
                Log.e("TronConfig", "failed to decode field mapping configuration", e);
                SparseArray sparseArray2 = this.a;
                if (sparseArray2 == null || sparseArray2.size() == 0) {
                    this.a = a();
                }
            }
        } else {
            this.a = a();
        }
    }

    private static SparseArray a() {
        SparseArray sparseArray = new SparseArray(64);
        sparseArray.put(826, 1000002);
        sparseArray.put(827, 1000001);
        sparseArray.put(825, 1000004);
        sparseArray.put(319, 1000018);
        sparseArray.put(325, 1000014);
        sparseArray.put(871, 1000015);
        sparseArray.put(320, 759);
        sparseArray.put(904, 799);
        sparseArray.put(905, 10000016);
        sparseArray.put(321, 1000019);
        sparseArray.put(322, 1000020);
        sparseArray.put(945, 1000021);
        sparseArray.put(901, 1000007);
        sparseArray.put(902, 759);
        sparseArray.put(793, 1000007);
        sparseArray.put(794, 1000009);
        sparseArray.put(795, 1000008);
        sparseArray.put(796, 1000010);
        sparseArray.put(797, 1000011);
        sparseArray.put(798, 1000013);
        sparseArray.put(825, 1000004);
        sparseArray.put(908, 1000015);
        sparseArray.put(909, 1000001);
        sparseArray.put(911, 759);
        sparseArray.put(914, 1000001);
        sparseArray.put(915, 759);
        sparseArray.put(917, 1000001);
        sparseArray.put(833, 1000001);
        sparseArray.put(865, 10000016);
        sparseArray.put(943, 10000016);
        sparseArray.put(903, 1000017);
        return sparseArray;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i, Object obj) {
        if (azqq.c()) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("Unpackable field in log: ");
            sb.append(i);
            sb.append(" with value ");
            sb.append(valueOf);
            sb.toString();
        }
        this.b++;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, Object obj) {
        if (azqq.c()) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
            sb.append("Overpacked field in log: ");
            sb.append(i);
            sb.append(" with second value ");
            sb.append(valueOf);
            sb.toString();
        }
        this.b++;
    }

    public final void a(int i, Object obj, aucd aucd) {
        Object obj2 = obj;
        aucd aucd2 = aucd;
        Integer num = (Integer) this.a.get(i);
        if (num == null) {
            num = Integer.valueOf(i);
        }
        try {
            int intValue = num.intValue();
            if (intValue == 799) {
                if (!TextUtils.isEmpty(((avqd) aucd2.b).v)) {
                    a(num.intValue(), obj2);
                }
                String str = (String) obj2;
                if (aucd2.c) {
                    aucd.c();
                    aucd2.c = false;
                }
                avqd avqd = (avqd) aucd2.b;
                avqd avqd2 = avqd.al;
                str.getClass();
                avqd.a |= 1048576;
                avqd.v = str;
            } else if (intValue != 10000016) {
                switch (intValue) {
                    case 757:
                        bbl a2 = bbl.a(((avqd) aucd2.b).d);
                        if (a2 == null) {
                            a2 = bbl.VIEW_UNKNOWN;
                        }
                        if (a2 != bbl.VIEW_UNKNOWN) {
                            a(num.intValue(), obj2);
                        }
                        bbl a3 = bbl.a(((Integer) obj2).intValue());
                        if (a3 != null) {
                            if (aucd2.c) {
                                aucd.c();
                                aucd2.c = false;
                            }
                            avqd avqd3 = (avqd) aucd2.b;
                            avqd avqd4 = avqd.al;
                            avqd3.d = a3.CA;
                            avqd3.a |= 2;
                            return;
                        }
                        return;
                    case 758:
                        int a4 = bbj.a(((avqd) aucd2.b).c);
                        if (a4 != 0) {
                            if (a4 != 1) {
                                a(num.intValue(), obj2);
                            }
                        }
                        int a5 = bbj.a(((Integer) obj2).intValue());
                        if (a5 != 0) {
                            if (aucd2.c) {
                                aucd.c();
                                aucd2.c = false;
                            }
                            avqd avqd5 = (avqd) aucd2.b;
                            avqd avqd6 = avqd.al;
                            avqd5.c = a5 - 1;
                            avqd5.a |= 1;
                            return;
                        }
                        return;
                    case 759:
                        if (((avqd) aucd2.b).g != 0) {
                            a(num.intValue(), obj2);
                        }
                        int intValue2 = ((Integer) obj2).intValue();
                        if (aucd2.c) {
                            aucd.c();
                            aucd2.c = false;
                        }
                        avqd avqd7 = (avqd) aucd2.b;
                        avqd avqd8 = avqd.al;
                        avqd7.a |= 32;
                        avqd7.g = intValue2;
                        return;
                    default:
                        switch (intValue) {
                            case 801:
                            case 802:
                            case 803:
                            case 804:
                                b(num.intValue(), obj2);
                                return;
                            case 805:
                                if (((avqd) aucd2.b).e != 0) {
                                    a(num.intValue(), obj2);
                                }
                                long longValue = ((Number) obj2).longValue();
                                if (aucd2.c) {
                                    aucd.c();
                                    aucd2.c = false;
                                }
                                avqd avqd9 = (avqd) aucd2.b;
                                avqd avqd10 = avqd.al;
                                avqd9.a |= 4;
                                avqd9.e = longValue;
                                return;
                            case 806:
                                if (!TextUtils.isEmpty(((avqd) aucd2.b).f)) {
                                    a(num.intValue(), obj2);
                                }
                                String str2 = (String) obj2;
                                if (aucd2.c) {
                                    aucd.c();
                                    aucd2.c = false;
                                }
                                avqd avqd11 = (avqd) aucd2.b;
                                avqd avqd12 = avqd.al;
                                str2.getClass();
                                avqd11.a |= 16;
                                avqd11.f = str2;
                                return;
                            default:
                                switch (intValue) {
                                    case 1000001:
                                        if (((avqd) aucd2.b).s != 0) {
                                            a(num.intValue(), obj2);
                                        }
                                        int intValue3 = ((Integer) obj2).intValue();
                                        if (aucd2.c) {
                                            aucd.c();
                                            aucd2.c = false;
                                        }
                                        avqd avqd13 = (avqd) aucd2.b;
                                        avqd avqd14 = avqd.al;
                                        avqd13.a |= 131072;
                                        avqd13.s = intValue3;
                                        return;
                                    case 1000002:
                                        if (((avqd) aucd2.b).r != 0) {
                                            a(num.intValue(), obj2);
                                        }
                                        int intValue4 = ((Integer) obj2).intValue();
                                        if (aucd2.c) {
                                            aucd.c();
                                            aucd2.c = false;
                                        }
                                        avqd avqd15 = (avqd) aucd2.b;
                                        avqd avqd16 = avqd.al;
                                        avqd15.a |= 65536;
                                        avqd15.r = intValue4;
                                        return;
                                    case 1000003:
                                        bbl a6 = bbl.a(((avqd) aucd2.b).t);
                                        if (a6 == null) {
                                            a6 = bbl.VIEW_UNKNOWN;
                                        }
                                        if (a6 != bbl.VIEW_UNKNOWN) {
                                            a(num.intValue(), obj2);
                                        }
                                        bbl a7 = bbl.a(((Integer) obj2).intValue());
                                        if (a7 != null) {
                                            if (aucd2.c) {
                                                aucd.c();
                                                aucd2.c = false;
                                            }
                                            avqd avqd17 = (avqd) aucd2.b;
                                            avqd avqd18 = avqd.al;
                                            avqd17.t = a7.CA;
                                            avqd17.a |= 262144;
                                            return;
                                        }
                                        return;
                                    case 1000004:
                                        if (((avqd) aucd2.b).u != 0.0f) {
                                            a(num.intValue(), obj2);
                                        }
                                        float floatValue = ((Float) obj2).floatValue();
                                        if (aucd2.c) {
                                            aucd.c();
                                            aucd2.c = false;
                                        }
                                        avqd avqd19 = (avqd) aucd2.b;
                                        avqd avqd20 = avqd.al;
                                        avqd19.a |= 524288;
                                        avqd19.u = floatValue;
                                        return;
                                    default:
                                        switch (intValue) {
                                            case 1000007:
                                                if (((avqd) aucd2.b).h != 0) {
                                                    a(num.intValue(), obj2);
                                                }
                                                long longValue2 = ((Number) obj2).longValue();
                                                if (aucd2.c) {
                                                    aucd.c();
                                                    aucd2.c = false;
                                                }
                                                avqd avqd21 = (avqd) aucd2.b;
                                                avqd avqd22 = avqd.al;
                                                avqd21.a |= 64;
                                                avqd21.h = longValue2;
                                                return;
                                            case 1000008:
                                                if (((avqd) aucd2.b).i != 0) {
                                                    a(num.intValue(), obj2);
                                                }
                                                long longValue3 = ((Number) obj2).longValue();
                                                if (aucd2.c) {
                                                    aucd.c();
                                                    aucd2.c = false;
                                                }
                                                avqd avqd23 = (avqd) aucd2.b;
                                                avqd avqd24 = avqd.al;
                                                avqd23.a |= 128;
                                                avqd23.i = longValue3;
                                                return;
                                            case 1000009:
                                                if (((avqd) aucd2.b).j != 0) {
                                                    a(num.intValue(), obj2);
                                                }
                                                long longValue4 = ((Number) obj2).longValue();
                                                if (aucd2.c) {
                                                    aucd.c();
                                                    aucd2.c = false;
                                                }
                                                avqd avqd25 = (avqd) aucd2.b;
                                                avqd avqd26 = avqd.al;
                                                avqd25.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                avqd25.j = longValue4;
                                                return;
                                            case 1000010:
                                                if (((avqd) aucd2.b).k != 0) {
                                                    a(num.intValue(), obj2);
                                                }
                                                int intValue5 = ((Integer) obj2).intValue();
                                                if (aucd2.c) {
                                                    aucd.c();
                                                    aucd2.c = false;
                                                }
                                                avqd avqd27 = (avqd) aucd2.b;
                                                avqd avqd28 = avqd.al;
                                                avqd27.a |= 512;
                                                avqd27.k = intValue5;
                                                return;
                                            case 1000011:
                                                if (!TextUtils.isEmpty(((avqd) aucd2.b).l)) {
                                                    a(num.intValue(), obj2);
                                                }
                                                String str3 = (String) obj2;
                                                if (aucd2.c) {
                                                    aucd.c();
                                                    aucd2.c = false;
                                                }
                                                avqd avqd29 = (avqd) aucd2.b;
                                                avqd avqd30 = avqd.al;
                                                str3.getClass();
                                                avqd29.a |= 1024;
                                                avqd29.l = str3;
                                                return;
                                            case 1000012:
                                                if (!TextUtils.isEmpty(((avqd) aucd2.b).m)) {
                                                    a(num.intValue(), obj2);
                                                }
                                                String str4 = (String) obj2;
                                                if (aucd2.c) {
                                                    aucd.c();
                                                    aucd2.c = false;
                                                }
                                                avqd avqd31 = (avqd) aucd2.b;
                                                avqd avqd32 = avqd.al;
                                                str4.getClass();
                                                avqd31.a |= 2048;
                                                avqd31.m = str4;
                                                return;
                                            case 1000013:
                                                int intValue6 = ((Integer) obj2).intValue();
                                                if (aucd2.c) {
                                                    aucd.c();
                                                    aucd2.c = false;
                                                }
                                                avqd avqd33 = (avqd) aucd2.b;
                                                avqd avqd34 = avqd.al;
                                                avqd33.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                                                avqd33.o = intValue6;
                                                return;
                                            case 1000014:
                                                if (((avqd) aucd2.b).p > 0) {
                                                    a(num.intValue(), obj2);
                                                }
                                                long longValue5 = ((Number) obj2).longValue();
                                                if (aucd2.c) {
                                                    aucd.c();
                                                    aucd2.c = false;
                                                }
                                                avqd avqd35 = (avqd) aucd2.b;
                                                avqd avqd36 = avqd.al;
                                                avqd35.a |= 16384;
                                                avqd35.p = longValue5;
                                                return;
                                            case 1000015:
                                                if (!TextUtils.isEmpty(((avqd) aucd2.b).q)) {
                                                    a(num.intValue(), obj2);
                                                }
                                                String str5 = (String) obj2;
                                                if (aucd2.c) {
                                                    aucd.c();
                                                    aucd2.c = false;
                                                }
                                                avqd avqd37 = (avqd) aucd2.b;
                                                avqd avqd38 = avqd.al;
                                                str5.getClass();
                                                avqd37.a |= 32768;
                                                avqd37.q = str5;
                                                return;
                                            default:
                                                switch (intValue) {
                                                    case 1000017:
                                                        if (!TextUtils.isEmpty(((avqd) aucd2.b).w)) {
                                                            a(num.intValue(), obj2);
                                                        }
                                                        String str6 = (String) obj2;
                                                        if (aucd2.c) {
                                                            aucd.c();
                                                            aucd2.c = false;
                                                        }
                                                        avqd avqd39 = (avqd) aucd2.b;
                                                        avqd avqd40 = avqd.al;
                                                        str6.getClass();
                                                        avqd39.a |= 2097152;
                                                        avqd39.w = str6;
                                                        return;
                                                    case 1000018:
                                                        if (((avqd) aucd2.b).y != 0) {
                                                            a(num.intValue(), obj2);
                                                        }
                                                        long longValue6 = ((Number) obj2).longValue();
                                                        if (aucd2.c) {
                                                            aucd.c();
                                                            aucd2.c = false;
                                                        }
                                                        avqd avqd41 = (avqd) aucd2.b;
                                                        avqd avqd42 = avqd.al;
                                                        avqd41.a |= 8388608;
                                                        avqd41.y = longValue6;
                                                        return;
                                                    case 1000019:
                                                        if (((avqd) aucd2.b).z != 0) {
                                                            a(num.intValue(), obj2);
                                                        }
                                                        long longValue7 = ((Number) obj2).longValue();
                                                        if (aucd2.c) {
                                                            aucd.c();
                                                            aucd2.c = false;
                                                        }
                                                        avqd avqd43 = (avqd) aucd2.b;
                                                        avqd avqd44 = avqd.al;
                                                        avqd43.a |= 16777216;
                                                        avqd43.z = longValue7;
                                                        return;
                                                    case 1000020:
                                                        if (((avqd) aucd2.b).A != 0) {
                                                            a(num.intValue(), obj2);
                                                        }
                                                        long longValue8 = ((Number) obj2).longValue();
                                                        if (aucd2.c) {
                                                            aucd.c();
                                                            aucd2.c = false;
                                                        }
                                                        avqd avqd45 = (avqd) aucd2.b;
                                                        avqd avqd46 = avqd.al;
                                                        avqd45.a |= 33554432;
                                                        avqd45.A = longValue8;
                                                        return;
                                                    case 1000021:
                                                        if (((avqd) aucd2.b).B != 0) {
                                                            a(num.intValue(), obj2);
                                                        }
                                                        long longValue9 = ((Number) obj2).longValue();
                                                        if (aucd2.c) {
                                                            aucd.c();
                                                            aucd2.c = false;
                                                        }
                                                        avqd avqd47 = (avqd) aucd2.b;
                                                        avqd avqd48 = avqd.al;
                                                        avqd47.a |= 67108864;
                                                        avqd47.B = longValue9;
                                                        return;
                                                    case 1000022:
                                                        if (((avqd) aucd2.b).C != 0) {
                                                            a(num.intValue(), obj2);
                                                        }
                                                        long longValue10 = ((Number) obj2).longValue();
                                                        if (aucd2.c) {
                                                            aucd.c();
                                                            aucd2.c = false;
                                                        }
                                                        avqd avqd49 = (avqd) aucd2.b;
                                                        avqd avqd50 = avqd.al;
                                                        avqd49.a |= 134217728;
                                                        avqd49.C = longValue10;
                                                        return;
                                                    case 1000023:
                                                        if (!TextUtils.isEmpty(((avqd) aucd2.b).D)) {
                                                            a(num.intValue(), obj2);
                                                        }
                                                        String str7 = (String) obj2;
                                                        if (aucd2.c) {
                                                            aucd.c();
                                                            aucd2.c = false;
                                                        }
                                                        avqd avqd51 = (avqd) aucd2.b;
                                                        avqd avqd52 = avqd.al;
                                                        str7.getClass();
                                                        avqd51.a |= 268435456;
                                                        avqd51.D = str7;
                                                        return;
                                                    case 1000024:
                                                        if (!TextUtils.isEmpty(((avqd) aucd2.b).E)) {
                                                            a(num.intValue(), obj2);
                                                        }
                                                        String str8 = (String) obj2;
                                                        if (aucd2.c) {
                                                            aucd.c();
                                                            aucd2.c = false;
                                                        }
                                                        avqd avqd53 = (avqd) aucd2.b;
                                                        avqd avqd54 = avqd.al;
                                                        str8.getClass();
                                                        avqd53.a |= 536870912;
                                                        avqd53.E = str8;
                                                        return;
                                                    case 1000025:
                                                        if (!TextUtils.isEmpty(((avqd) aucd2.b).F)) {
                                                            a(num.intValue(), obj2);
                                                        }
                                                        String str9 = (String) obj2;
                                                        if (aucd2.c) {
                                                            aucd.c();
                                                            aucd2.c = false;
                                                        }
                                                        avqd avqd55 = (avqd) aucd2.b;
                                                        avqd avqd56 = avqd.al;
                                                        str9.getClass();
                                                        avqd55.a |= JGCastService.FLAG_PRIVATE_DISPLAY;
                                                        avqd55.F = str9;
                                                        return;
                                                    case 1000026:
                                                        if (((avqd) aucd2.b).G != 0) {
                                                            a(num.intValue(), obj2);
                                                        }
                                                        int intValue7 = ((Integer) obj2).intValue();
                                                        if (aucd2.c) {
                                                            aucd.c();
                                                            aucd2.c = false;
                                                        }
                                                        avqd avqd57 = (avqd) aucd2.b;
                                                        avqd avqd58 = avqd.al;
                                                        avqd57.a |= Integer.MIN_VALUE;
                                                        avqd57.G = intValue7;
                                                        return;
                                                    default:
                                                        switch (intValue) {
                                                            case 1000028:
                                                                if (!TextUtils.isEmpty(((avqd) aucd2.b).H)) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                String str10 = (String) obj2;
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd59 = (avqd) aucd2.b;
                                                                avqd avqd60 = avqd.al;
                                                                str10.getClass();
                                                                avqd59.b |= 1;
                                                                avqd59.H = str10;
                                                                return;
                                                            case 1000029:
                                                                if (!TextUtils.isEmpty(((avqd) aucd2.b).I)) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                String str11 = (String) obj2;
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd61 = (avqd) aucd2.b;
                                                                avqd avqd62 = avqd.al;
                                                                str11.getClass();
                                                                avqd61.b |= 2;
                                                                avqd61.I = str11;
                                                                return;
                                                            case 1000030:
                                                                if (!TextUtils.isEmpty(((avqd) aucd2.b).J)) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                String str12 = (String) obj2;
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd63 = (avqd) aucd2.b;
                                                                avqd avqd64 = avqd.al;
                                                                str12.getClass();
                                                                avqd63.b |= 4;
                                                                avqd63.J = str12;
                                                                return;
                                                            case 1000031:
                                                                if (((avqd) aucd2.b).K != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue8 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd65 = (avqd) aucd2.b;
                                                                avqd avqd66 = avqd.al;
                                                                avqd65.b |= 8;
                                                                avqd65.K = intValue8;
                                                                return;
                                                            case 1000032:
                                                                if (((avqd) aucd2.b).L != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue9 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd67 = (avqd) aucd2.b;
                                                                avqd avqd68 = avqd.al;
                                                                avqd67.b |= 16;
                                                                avqd67.L = intValue9;
                                                                return;
                                                            case 1000033:
                                                                if (((avqd) aucd2.b).M != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue10 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd69 = (avqd) aucd2.b;
                                                                avqd avqd70 = avqd.al;
                                                                avqd69.b |= 32;
                                                                avqd69.M = intValue10;
                                                                return;
                                                            case 1000034:
                                                                if (((avqd) aucd2.b).N != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue11 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd71 = (avqd) aucd2.b;
                                                                avqd avqd72 = avqd.al;
                                                                avqd71.b |= 64;
                                                                avqd71.N = intValue11;
                                                                return;
                                                            case 1000035:
                                                                if (!TextUtils.isEmpty(((avqd) aucd2.b).O)) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                String str13 = (String) obj2;
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd73 = (avqd) aucd2.b;
                                                                avqd avqd74 = avqd.al;
                                                                str13.getClass();
                                                                avqd73.b |= 128;
                                                                avqd73.O = str13;
                                                                return;
                                                            case 1000036:
                                                                if (((avqd) aucd2.b).P != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue12 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd75 = (avqd) aucd2.b;
                                                                avqd avqd76 = avqd.al;
                                                                avqd75.b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                                avqd75.P = intValue12;
                                                                return;
                                                            case 1000037:
                                                                if (((avqd) aucd2.b).Q != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue13 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd77 = (avqd) aucd2.b;
                                                                avqd avqd78 = avqd.al;
                                                                avqd77.b |= 512;
                                                                avqd77.Q = intValue13;
                                                                return;
                                                            case 1000038:
                                                                if (((avqd) aucd2.b).R != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue14 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd79 = (avqd) aucd2.b;
                                                                avqd avqd80 = avqd.al;
                                                                avqd79.b |= 1024;
                                                                avqd79.R = intValue14;
                                                                return;
                                                            case 1000039:
                                                                if (!TextUtils.isEmpty(((avqd) aucd2.b).W)) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                String str14 = (String) obj2;
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd81 = (avqd) aucd2.b;
                                                                avqd avqd82 = avqd.al;
                                                                str14.getClass();
                                                                avqd81.b |= 2048;
                                                                avqd81.W = str14;
                                                                return;
                                                            case 1000040:
                                                                if (!TextUtils.isEmpty(((avqd) aucd2.b).X)) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                String str15 = (String) obj2;
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd83 = (avqd) aucd2.b;
                                                                avqd avqd84 = avqd.al;
                                                                str15.getClass();
                                                                avqd83.b |= FragmentTransaction.TRANSIT_ENTER_MASK;
                                                                avqd83.X = str15;
                                                                return;
                                                            case 1000041:
                                                                if (((avqd) aucd2.b).Y != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue15 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd85 = (avqd) aucd2.b;
                                                                avqd avqd86 = avqd.al;
                                                                avqd85.b |= FragmentTransaction.TRANSIT_EXIT_MASK;
                                                                avqd85.Y = intValue15;
                                                                return;
                                                            case 1000042:
                                                                if (((avqd) aucd2.b).Z != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue16 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd87 = (avqd) aucd2.b;
                                                                avqd avqd88 = avqd.al;
                                                                avqd87.b |= 16384;
                                                                avqd87.Z = intValue16;
                                                                return;
                                                            case 1000043:
                                                                if (((avqd) aucd2.b).aa != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue17 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd89 = (avqd) aucd2.b;
                                                                avqd avqd90 = avqd.al;
                                                                avqd89.b |= 32768;
                                                                avqd89.aa = intValue17;
                                                                return;
                                                            case 1000044:
                                                                if (((avqd) aucd2.b).ab != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue18 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd91 = (avqd) aucd2.b;
                                                                avqd avqd92 = avqd.al;
                                                                avqd91.b |= 65536;
                                                                avqd91.ab = intValue18;
                                                                return;
                                                            case 1000045:
                                                                if (((avqd) aucd2.b).ac != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue19 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd93 = (avqd) aucd2.b;
                                                                avqd avqd94 = avqd.al;
                                                                avqd93.b |= 131072;
                                                                avqd93.ac = intValue19;
                                                                return;
                                                            case 1000046:
                                                                if (((avqd) aucd2.b).ad != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue20 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd95 = (avqd) aucd2.b;
                                                                avqd avqd96 = avqd.al;
                                                                avqd95.b = 262144 | avqd95.b;
                                                                avqd95.ad = intValue20;
                                                                return;
                                                            case 1000047:
                                                                if (((avqd) aucd2.b).ae != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue21 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd97 = (avqd) aucd2.b;
                                                                avqd avqd98 = avqd.al;
                                                                avqd97.b |= 524288;
                                                                avqd97.ae = intValue21;
                                                                return;
                                                            case 1000048:
                                                                if (((avqd) aucd2.b).af != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue22 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd99 = (avqd) aucd2.b;
                                                                avqd avqd100 = avqd.al;
                                                                avqd99.b |= 1048576;
                                                                avqd99.af = intValue22;
                                                                return;
                                                            case 1000049:
                                                                if (((avqd) aucd2.b).ag != 0) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                int intValue23 = ((Integer) obj2).intValue();
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd101 = (avqd) aucd2.b;
                                                                avqd avqd102 = avqd.al;
                                                                avqd101.b |= 2097152;
                                                                avqd101.ag = intValue23;
                                                                return;
                                                            case 1000050:
                                                                if (!TextUtils.isEmpty(((avqd) aucd2.b).ah)) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                String str16 = (String) obj2;
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd103 = (avqd) aucd2.b;
                                                                avqd avqd104 = avqd.al;
                                                                str16.getClass();
                                                                avqd103.b |= 33554432;
                                                                avqd103.ah = str16;
                                                                return;
                                                            case 1000051:
                                                                if (!TextUtils.isEmpty(((avqd) aucd2.b).ai)) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                String str17 = (String) obj2;
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd105 = (avqd) aucd2.b;
                                                                avqd avqd106 = avqd.al;
                                                                str17.getClass();
                                                                avqd105.b |= 67108864;
                                                                avqd105.ai = str17;
                                                                return;
                                                            case 1000052:
                                                                if (!TextUtils.isEmpty(((avqd) aucd2.b).aj)) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                String str18 = (String) obj2;
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd107 = (avqd) aucd2.b;
                                                                avqd avqd108 = avqd.al;
                                                                str18.getClass();
                                                                avqd107.b |= 134217728;
                                                                avqd107.aj = str18;
                                                                return;
                                                            case 1000053:
                                                                if (!TextUtils.isEmpty(((avqd) aucd2.b).ak)) {
                                                                    a(num.intValue(), obj2);
                                                                }
                                                                String str19 = (String) obj2;
                                                                if (aucd2.c) {
                                                                    aucd.c();
                                                                    aucd2.c = false;
                                                                }
                                                                avqd avqd109 = (avqd) aucd2.b;
                                                                avqd avqd110 = avqd.al;
                                                                str19.getClass();
                                                                avqd109.b |= 268435456;
                                                                avqd109.ak = str19;
                                                                return;
                                                            default:
                                                                b(num.intValue(), obj2);
                                                                return;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            }
        } catch (ClassCastException e) {
            ClassCastException classCastException = e;
            int intValue24 = num.intValue();
            if (azqq.c()) {
                String valueOf = String.valueOf(obj);
                String message = classCastException.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60 + String.valueOf(message).length());
                sb.append("Unpackable field in log: ");
                sb.append(intValue24);
                sb.append(" with value ");
                sb.append(valueOf);
                sb.append("Wrong type: ");
                sb.append(message);
                sb.toString();
            }
            this.b++;
        }
    }
}
