package defpackage;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.analytics.internal.Command;
import com.google.android.gms.analytics.service.ChimeraAnalyticsService;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: dpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dpe extends bhw implements dpf {
    final /* synthetic */ ChimeraAnalyticsService a;
    private final Map b;
    private final Map c;
    private final Set d;

    public dpe() {
        super("com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    public final void a(Map map, long j, String str, List list) {
        Map map2 = map;
        this.a.a().a("Device AnalyticsService received hit", map);
        int callingUid = Binder.getCallingUid();
        if (callingUid > 0) {
            String[] a2 = jni.b(this.a.getApplicationContext()).a(callingUid);
            if (a2.length == 1 && !this.d.contains(a2[0])) {
                new ivh(-1, a2[0], iyc.ANALYTICS).a(this.a.getApplicationContext(), 0);
                this.d.add(a2[0]);
            }
            dpc dpc = new dpc(this.a.a(), map, j, dpx.d(str), 0, callingUid, list);
            String str2 = dpc.g;
            if ("ma1b3".equals(str2) || "ma1b2".equals(str2)) {
                String a3 = dpc.a("tid", "");
                String a4 = dpc.a("t", "");
                Long valueOf = Long.valueOf(j);
                if (!"transaction".equals(a4) && !"tran".equals(a4) && !"trans".equals(a4) && !"item".equals(a4)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 11);
                    sb.append(callingUid);
                    sb.append(a3);
                    String sb2 = sb.toString();
                    if (!this.b.containsKey(sb2)) {
                        this.b.put(sb2, Double.valueOf((double) ((Long) doz.c.a()).longValue()));
                    }
                    if (!this.c.containsKey(sb2)) {
                        Map map3 = this.c;
                        jiq jiq = this.a.a.c;
                        map3.put(sb2, Long.valueOf(System.currentTimeMillis()));
                    }
                    double doubleValue = ((Double) this.b.get(sb2)).doubleValue();
                    if (doubleValue < ((double) ((Long) doz.c.a()).longValue())) {
                        double longValue = (double) (((float) (valueOf.longValue() - ((Long) this.c.get(sb2)).longValue())) / 1000.0f);
                        double doubleValue2 = ((Double) doz.d.a()).doubleValue();
                        Double.isNaN(longValue);
                        double d2 = longValue * doubleValue2;
                        if (d2 > 0.0d) {
                            doubleValue = Math.min(doubleValue + d2, (double) ((Long) doz.c.a()).longValue());
                            this.c.put(sb2, valueOf);
                        }
                    }
                    if (doubleValue < 1.0d) {
                        this.b.put(sb2, Double.valueOf(doubleValue));
                        this.a.a().b("Device AnalyticsService hit rate limit exceeded, hit not sent");
                        this.a.a().a("Device AnalyticsService - app exceeded rate limit. tid, ht, appUid", a3, a4, Integer.valueOf(callingUid));
                        return;
                    }
                    this.b.put(sb2, Double.valueOf(doubleValue - 4.0d));
                }
            }
            this.a.b.b();
            dly b2 = this.a.b();
            iva.a((Object) dpc);
            b2.q();
            b2.f();
            iva.a(dpc.e, (Object) "AppUID is required");
            b2.b("Store hit requested", dpc);
            try {
                b2.g().a((Callable) new dlv(b2, dpc)).get();
            } catch (InterruptedException e) {
                b2.d("storeHit interrupted", e);
            } catch (ExecutionException e2) {
                b2.e("storeHit failed", e2);
            }
        } else {
            this.a.b.b();
            this.a.a().e("Device AnalyticsService binder returned invalid uid", Integer.valueOf(callingUid));
            this.a.a().a(map, "Invalid calling uid");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dpe(ChimeraAnalyticsService chimeraAnalyticsService) {
        super("com.google.android.gms.analytics.internal.IAnalyticsService");
        this.a = chimeraAnalyticsService;
        this.b = new nz();
        this.c = new nz();
        this.d = new ob();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a(bhx.c(parcel), parcel.readLong(), parcel.readString(), parcel.createTypedArrayList(Command.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            this.a.a().b("Device AnalyticsService clearHits call received");
            int callingUid = Binder.getCallingUid();
            if (callingUid > 0) {
                dly b2 = this.a.b();
                iva.a(callingUid);
                b2.q();
                b2.f();
                b2.g().a((Runnable) new dlw(b2, callingUid));
            } else {
                this.a.a().e("Device AnalyticsService binder returned invalid uid", Integer.valueOf(callingUid));
            }
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            String str = dmb.a;
            parcel2.writeNoException();
            parcel2.writeString(str);
        }
        return true;
    }
}
