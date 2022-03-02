package defpackage;

import android.text.TextUtils;
import com.google.android.chimera.Service;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.chromium.net.UrlRequest;

/* renamed from: bys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bys {
    public static void a(bzk bzk, clg clg, bvt bvt, ContextManagerClientInfo contextManagerClientInfo) {
        bzk bzk2 = bzk;
        atjs atjs = atjs.UNKNOWN_CONTEXT_FENCE_TYPE;
        switch (bzk2.a.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 22:
                for (bzk a : bzk.a()) {
                    a(a, clg, bvt, contextManagerClientInfo);
                }
                clg clg2 = clg;
                bvt bvt2 = bvt;
                ContextManagerClientInfo contextManagerClientInfo2 = contextManagerClientInfo;
                break;
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
            case Service.START_CONTINUATION_MASK /*15*/:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
                for (int b : bzk.g()) {
                    a(clg, jtj.b(b), cbb.a(), (cbc) null, bvt, contextManagerClientInfo);
                }
                clg clg3 = clg;
                bvt bvt3 = bvt;
                ContextManagerClientInfo contextManagerClientInfo3 = contextManagerClientInfo;
                break;
            case 6:
                int i = bzk.k().b;
                if (i == 4) {
                    atjv atjv = atjv.PLACES;
                    cbb b2 = cbb.b();
                    aucd o = atkm.j.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    atkm atkm = (atkm) o.b;
                    atkm.b = 7;
                    atkm.a |= 1;
                    a(clg, atjv, b2, new cbc((atkm) o.i()), bvt, contextManagerClientInfo);
                    a(clg, atjv.SCREEN, cbb.b(), (cbc) null, bvt, contextManagerClientInfo);
                    a(clg, atjv.USER_LOCATION, cbb.b(), (cbc) null, bvt, contextManagerClientInfo);
                    break;
                } else {
                    if (i == 5) {
                        a(clg, atjv.PLACES, cbb.b(), cbc.a(awuz.z(), (int) awuz.x()), bvt, contextManagerClientInfo);
                        if (!awuz.q()) {
                            clg clg4 = clg;
                            bvt bvt4 = bvt;
                            ContextManagerClientInfo contextManagerClientInfo4 = contextManagerClientInfo;
                            break;
                        }
                    }
                    a(clg, atjv.PLACES, cbb.b(), (cbc) null, bvt, contextManagerClientInfo);
                    break;
                }
            case 12:
                List a2 = bzk.l().a();
                int size = a2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    atjf atjf = (atjf) a2.get(i2);
                    atjv atjv2 = atjv.DETECTED_BEACON;
                    cbb a3 = cbb.a();
                    String str = atjf.b;
                    String str2 = atjf.c;
                    byte[] k = atjf.d.k();
                    aucd o2 = atkm.j.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    atkm atkm2 = (atkm) o2.b;
                    atkm2.b = 4;
                    atkm2.a |= 1;
                    if (!TextUtils.isEmpty(str)) {
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        atkm atkm3 = (atkm) o2.b;
                        str.getClass();
                        atkm3.a |= 8;
                        atkm3.e = str;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        atkm atkm4 = (atkm) o2.b;
                        str2.getClass();
                        atkm4.a |= 16;
                        atkm4.f = str2;
                    }
                    if (k != null && k.length > 0) {
                        auay a4 = auay.a(k);
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        atkm atkm5 = (atkm) o2.b;
                        a4.getClass();
                        atkm5.a |= 32;
                        atkm5.g = a4;
                    }
                    a(clg, atjv2, a3, new cbc((atkm) o2.i()), bvt, contextManagerClientInfo);
                }
                clg clg5 = clg;
                bvt bvt5 = bvt;
                ContextManagerClientInfo contextManagerClientInfo5 = contextManagerClientInfo;
                break;
            case 23:
                atjv atjv3 = atjv.DND_MODE;
                cbb a5 = cbb.a();
                aucd o3 = atkm.j.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                atkm atkm6 = (atkm) o3.b;
                atkm6.b = 9;
                int i3 = atkm6.a | 1;
                atkm6.a = i3;
                atkm6.a = i3 | 512;
                atkm6.i = 64;
                a(clg, atjv3, a5, new cbc((atkm) o3.i()), bvt, contextManagerClientInfo);
                clg clg6 = clg;
                bvt bvt6 = bvt;
                ContextManagerClientInfo contextManagerClientInfo6 = contextManagerClientInfo;
                break;
            default:
                clg clg7 = clg;
                bvt bvt7 = bvt;
                ContextManagerClientInfo contextManagerClientInfo7 = contextManagerClientInfo;
                ((anih) ((anih) bxk.a.b()).a("bys", "a", 153, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[InterestRecordAppender] Unexpected fence type : %s", bzk2.a.z);
                break;
        }
        if (!jir.a((Collection) bzk.m())) {
            long v = awuz.v();
            if (v > 0) {
                for (Integer intValue : bzk.m()) {
                    if (intValue.intValue() == 1) {
                        a(clg, atjv.USER_LOCATION, cbb.b(), cbc.a(v, 102), bvt, contextManagerClientInfo);
                        return;
                    }
                }
            }
        }
    }

    private static void a(clg clg, atjv atjv, cbb cbb, cbc cbc, bvt bvt, ContextManagerClientInfo contextManagerClientInfo) {
        caq caq = new caq(UUID.randomUUID().toString(), atjv, cbb, contextManagerClientInfo);
        caq.a(cai.a());
        caq.a(bvt, (jwi) null);
        if (cbc != null) {
            caq.a(cbc);
        }
        clg.a(atjv.bA, caq.a());
        new Object[1][0] = Integer.valueOf(atjv.bA);
    }
}
