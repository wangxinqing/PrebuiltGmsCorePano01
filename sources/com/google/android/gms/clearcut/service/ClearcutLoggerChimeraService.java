package com.google.android.gms.clearcut.service;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.Closeable;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ClearcutLoggerChimeraService extends nio {
    public static final aoru a = jfm.b(10);
    public static final hoj b = new htc(ihs.b());
    private static final Set l = anax.a("LB_C", "CL_C", "CL_DM");
    private hvh k;

    public ClearcutLoggerChimeraService() {
        super(new int[]{40}, new String[]{"com.google.android.gms.clearcut.service.START"}, Collections.emptySet(), 3, a, (Map) null);
    }

    public static void a(Context context, String str, nit nit, LogEventParcelable logEventParcelable) {
        avqq avqq;
        if (logEventParcelable.a != null) {
            if (!awta.c()) {
                if (jhg.b()) {
                    return;
                }
            } else if (nit.b == 2) {
                return;
            }
            int i = logEventParcelable.a.c;
            if (i == 24 || i == 493 || i == 494 || l.contains(logEventParcelable.a.g)) {
                PlayLoggerContext playLoggerContext = logEventParcelable.a;
                String str2 = playLoggerContext.g;
                int i2 = playLoggerContext.c;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 64);
                sb.append("Log source can only be written to from GmsCore: ");
                sb.append(str2);
                sb.append(" and ");
                sb.append(i2);
                throw new SecurityException(sb.toString());
            }
            avqt a2 = awta.a.a().a();
            int callingUid = Binder.getCallingUid();
            Map unmodifiableMap = Collections.unmodifiableMap(a2.c);
            int i3 = 0;
            if (!unmodifiableMap.isEmpty() && (avqq = (avqq) unmodifiableMap.get(str)) != null) {
                int i4 = logEventParcelable.a.b;
                aucx aucx = avqq.a;
                int size = aucx.size();
                for (int i5 = 0; i5 < size; i5++) {
                    avqp avqp = (avqp) aucx.get(i5);
                    if (i4 <= avqp.b && i4 >= avqp.a) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 31);
                        sb2.append("Log blocked: pkg=");
                        sb2.append(str);
                        sb2.append(" v=");
                        sb2.append(i4);
                        throw new SecurityException(sb2.toString());
                    }
                }
            }
            if (a2.a) {
                if (awta.c()) {
                    int i6 = nit.b;
                    int i7 = i6 - 1;
                    if (i6 == 0) {
                        throw null;
                    } else if (i7 != 0) {
                        if (i7 != 1 && i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4 && i7 != 5) {
                                    throw new AssertionError();
                                }
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else if (hya.a(context).a(callingUid)) {
                    return;
                }
                PlayLoggerContext playLoggerContext2 = logEventParcelable.a;
                int i8 = playLoggerContext2.c;
                String str3 = playLoggerContext2.g;
                aucx aucx2 = a2.b;
                int size2 = aucx2.size();
                while (i3 < size2) {
                    avqs avqs = (avqs) aucx2.get(i3);
                    if (avqs.b != i8) {
                        i3++;
                        if (avqs.a.equals(str3)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 42);
                sb3.append("Log source is restricted: ");
                sb3.append(str3);
                sb3.append(" and ");
                sb3.append(i8);
                throw new SecurityException(sb3.toString());
            }
        }
    }

    public final void onCreate() {
        this.k = hvk.c();
    }

    public final void onDestroy() {
        jjt.b((Closeable) this.k);
    }

    public static boolean a(String str) {
        if (new isq(str).a()) {
            return amsk.a(',').c(awtu.a.b().a()).contains(str) || Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu") || Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys");
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit.a(new hti(this, new nix(this, this.e, this.f), this.k, nit, getServiceRequest.d));
    }
}
