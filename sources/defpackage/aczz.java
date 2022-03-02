package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aczz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aczz extends aczm {
    private static final jjg a = jjg.a();
    private final Set b;
    private final adao k = new adao(this.c, this.g);

    public aczz(Context context, adbx adbx, ClientContext clientContext, String str, UdcCacheRequest udcCacheRequest) {
        super(context, adbx, clientContext, str, "GetSettingsCacheOperation");
        Set set;
        if (r8 != 0) {
            set = jir.a(r8, true);
        } else {
            set = new LinkedHashSet();
        }
        for (int valueOf : udcCacheRequest.a) {
            set.add(Integer.valueOf(valueOf));
        }
        this.b = set;
        this.i = true;
    }

    public static UdcCacheResponse.UdcSetting a(int i, int i2, boolean z) {
        return new UdcCacheResponse.UdcSetting(i, i2, new UdcCacheResponse.SettingAvailability(z));
    }

    private final void a(boolean z, SparseArray sparseArray) {
        int a2;
        adan a3 = this.k.a(z, this.b);
        if (a3.a.c()) {
            for (atyt atyt : a3.b) {
                if (this.b.contains(Integer.valueOf(atyt.b)) && (a2 = atys.a(atyt.c)) != 0 && a2 == 2) {
                    aczy aczy = new aczy(atyt);
                    sparseArray.put(aczy.c, aczy);
                }
            }
            return;
        }
        ((anih) ((anih) a.c()).a("aczz", "a", 161, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Could not retrieve client-managed settings");
    }

    public final void a(Context context) {
        boolean z;
        int a2;
        super.a(context);
        b();
        if (!TextUtils.isEmpty(this.f)) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            boolean z2 = true;
            if (addd.a(azrk.a.a().O())) {
                for (Integer intValue : this.b) {
                    ((ahgz) addd.a().d.a()).b(Integer.valueOf(intValue.intValue()));
                }
                atomicBoolean.set(true);
            }
            SparseArray sparseArray = new SparseArray(this.b.size());
            acyb a3 = new addp(adee.a(context).a(this.g, aosd.a()), this.j).a();
            if (a3 == null || (a3.a & 1) == 0) {
                z = false;
            } else {
                atwh atwh = a3.b;
                if (atwh == null) {
                    atwh = atwh.d;
                }
                aucx aucx = atwh.b;
                int size = aucx.size();
                for (int i = 0; i < size; i++) {
                    aczy aczy = new aczy((atwg) aucx.get(i));
                    sparseArray.put(aczy.c, aczy);
                }
                z = true;
            }
            if (azrk.a.a().P() && addd.a(azrk.a.a().L())) {
                ((ahgz) addd.a().c.a()).b(Boolean.valueOf(z));
                atomicBoolean.set(true);
            }
            adan a4 = this.k.a(true, this.b);
            if (!a4.a.c()) {
                ((anih) ((anih) a.c()).a("aczz", "a", 161, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Could not retrieve client-managed settings");
            } else {
                for (atyt atyt : a4.b) {
                    if (this.b.contains(Integer.valueOf(atyt.b)) && (a2 = atys.a(atyt.c)) != 0 && a2 == 2) {
                        aczy aczy2 = new aczy(atyt);
                        sparseArray.put(aczy2.c, aczy2);
                    }
                }
            }
            List a5 = jir.a(this.b.size());
            List a6 = jir.a();
            Set a7 = adhs.a();
            boolean z3 = false;
            for (Integer intValue2 : this.b) {
                int intValue3 = intValue2.intValue();
                Integer valueOf = Integer.valueOf(intValue3);
                if (a7.contains(valueOf)) {
                    a5.add(a(intValue3, 999, false));
                    z3 = true;
                } else {
                    aczy aczy3 = (aczy) sparseArray.get(intValue3);
                    if (aczy3 != null) {
                        a5.add(aczy3.a);
                        if (aczy3.a.b != 2) {
                            if (aczy3.b) {
                                a6.add(valueOf);
                            } else {
                                z3 = true;
                            }
                        }
                    } else {
                        a5.add(a(intValue3, 999, false));
                        z3 = true;
                    }
                }
            }
            int[] a8 = jhx.a((Collection) a6);
            if (z3 || this.b.isEmpty()) {
                z2 = false;
            }
            UdcCacheResponse udcCacheResponse = new UdcCacheResponse(a5, a8, z2);
            if (atomicBoolean.get()) {
                long N = azrk.a.a().N();
                if (N > 0) {
                    addd.a(N, TimeUnit.MILLISECONDS);
                }
            }
            a(0);
            this.d.a(Status.a, udcCacheResponse);
            return;
        }
        throw new nja(5, (String) null);
    }

    public final void a(Status status) {
        a(status.i);
        this.d.a(status, (UdcCacheResponse) null);
    }
}
