package defpackage;

import android.util.Log;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.libs.vcdiff.VcDiffDecoder;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: cjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cjw {
    public static ContextData a(bsz bsz, atsc atsc, jut jut) {
        atpx atpx;
        if (VcDiffDecoder.a) {
            byte[] k = atsc.c.k();
            if (k != null && k.length > 0) {
                atpr atpr = atsc.b;
                if (atpr == null) {
                    atpr = atpr.b;
                }
                atjv a = atjv.a(atsc.a);
                if (a == null) {
                    a = atjv.UNKNOWN_CONTEXT_NAME;
                }
                if (atpr != null && atpr.a.size() != 0) {
                    aucx aucx = atpr.a;
                    int size = aucx.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        atpx = (atpx) aucx.get(i);
                        atjv a2 = atjv.a(atpx.b);
                        if (a2 == null) {
                            a2 = atjv.UNKNOWN_CONTEXT_NAME;
                        }
                        i++;
                        if (a2 == a) {
                            break;
                        }
                    }
                }
                atpx = null;
                if (atpx == null) {
                    anih anih = (anih) ((anih) bxk.a.b()).a("cjw", "a", 64, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                    atjv a3 = atjv.a(atsc.a);
                    if (a3 == null) {
                        a3 = atjv.UNKNOWN_CONTEXT_NAME;
                    }
                    anih.a("[ContextDeltaHandler] Received invalid delta context sync token for context = %s", (Object) a3);
                    return null;
                }
                jtm jtm = new jtm();
                atjv a4 = atjv.a(atpx.b);
                if (a4 == null) {
                    a4 = atjv.UNKNOWN_CONTEXT_NAME;
                }
                int i2 = a4.bA;
                long a5 = bvl.a(atpx.c);
                juu juu = new juu();
                juu.a(a5, a5);
                jtm.a(i2, juu.a());
                ArrayList arrayList = cbi.p().a((ContextDataFilterImpl) jtm.a(), cbi.a(bsz, "ContextDeltaHandler")).b;
                ContextData contextData = arrayList.size() > 0 ? (ContextData) arrayList.get(0) : null;
                if (contextData == null) {
                    anih anih2 = (anih) ((anih) bxk.a.b()).a("cjw", "a", 73, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                    atjv a6 = atjv.a(atsc.a);
                    if (a6 == null) {
                        a6 = atjv.UNKNOWN_CONTEXT_NAME;
                    }
                    anih2.a("[ContextDeltaHandler] No existing data for context name = %s", (Object) a6);
                    return null;
                }
                byte[] nativeDecoder = VcDiffDecoder.nativeDecoder(contextData.k(), k);
                if (nativeDecoder == null) {
                    return null;
                }
                new Object[1][0] = Integer.valueOf(nativeDecoder.length);
                jti jti = new jti(contextData.f(), contextData.g(), contextData.i());
                int i3 = (atsc.d << 3) | 2;
                iva.a((Object) nativeDecoder);
                byte[] bArr = new byte[(aubk.i(i3) + aubk.d(nativeDecoder))];
                aubk a7 = aubk.a(bArr);
                try {
                    a7.d(i3);
                    a7.c(nativeDecoder);
                    aubc a8 = aubc.a(bArr);
                    aucd aucd = jti.a;
                    aubs c = aubs.c();
                    aucj aucj = (aucj) atjm.a.c(4);
                    aueq a9 = aueh.a.a((Object) aucj);
                    a9.a(aucj, aubd.a(a8), c);
                    a9.d(aucj);
                    aucj.b(aucj);
                    atjm atjm = (atjm) aucj;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    atjl atjl = (atjl) aucd.b;
                    atjl atjl2 = atjl.k;
                    atjm.getClass();
                    atjl.h = atjm;
                    atjl.a |= 64;
                } catch (IOException e) {
                    if (!(e.getCause() instanceof auda)) {
                        throw new auda(e.getMessage());
                    }
                    throw ((auda) e.getCause());
                } catch (RuntimeException e2) {
                    if (e2.getCause() instanceof auda) {
                        throw ((auda) e2.getCause());
                    }
                    throw e2;
                } catch (IOException e3) {
                    Log.e("ContextData", "Could not write extension.", e3);
                }
                jti.a(jut);
                ContextData a10 = jti.a();
                a10.a(contextData.e().c(), contextData.e().a.e);
                return a10;
            }
            anih anih3 = (anih) ((anih) bxk.a.c()).a("cjw", "a", 54, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            atjv a11 = atjv.a(atsc.a);
            if (a11 == null) {
                a11 = atjv.UNKNOWN_CONTEXT_NAME;
            }
            anih3.a("[ContextDeltaHandler] Received invalid encoded differential for context = %s", (Object) a11);
            return null;
        }
        ((anih) ((anih) bxk.a.b()).a("cjw", "a", 47, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextDeltaHandler] VcDiff decoding library is not initialized!!!!");
        return null;
    }
}
