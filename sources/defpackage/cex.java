package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import java.util.Map;

/* renamed from: cex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cex extends ccy {
    public static final ccj b = new ccj(cew.a, "SemanticLocationProducer", new int[]{74}, (int[]) null);
    private Map k;
    private final PendingIntent l = PendingIntent.getBroadcast(this.d, 0, new Intent("android.gms.contextmanager.GEOFENCE"), 134217728);

    public cex(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
    }

    private static final ParcelableGeofence a(String str, LatLng latLng, float f) {
        rdo rdo = new rdo();
        rdo.b = 3;
        rdo.a = str;
        rdo.b();
        rdo.e = 0;
        rdo.a(latLng.a, latLng.b, f);
        return rdo.a();
    }

    /* access modifiers changed from: protected */
    public final void b() {
        ren.a(this.d).d(this.l).a((acvp) new bva("[SemanticLocationProducer] reset Geofences", new Object[0]));
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.gms.contextmanager.GEOFENCE");
        return intentFilter;
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        if (jir.a(this.k)) {
            ((anih) ((anih) bxk.a.c()).a("cex", "j", 132, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[SemanticLocationProducer] The location of Home and Work alias is not available.");
            return;
        }
        rdv rdv = new rdv();
        rdv.b(3);
        for (Map.Entry entry : this.k.entrySet()) {
            String str = (String) entry.getKey();
            LatLng latLng = (LatLng) entry.getValue();
            Object[] objArr = {str, latLng};
            rdv.a(a(str, latLng, (float) awuz.a.a().aE()));
            if (str.equals("Home")) {
                rdv.a(a("Travel", latLng, (float) awuz.a.a().aF()));
            }
        }
        GeofencingRequest a = rdv.a();
        ren.a(cbi.f()).a(a, this.l).a((acvp) new bva("[SemanticLocationProducer] add Geofence %s", a));
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.k = cbi.H().a(this.e);
        j();
    }

    public final void a(Context context, Intent intent) {
        if ("android.gms.contextmanager.GEOFENCE".equals(intent.getAction())) {
            rdu a = rdu.a(intent);
            if (!a.a()) {
                aucd o = atuh.c.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atuh atuh = (atuh) o.b;
                atuh.b = 0;
                atuh.a |= 1;
                List list = a.c;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String str = ((ParcelableGeofence) list.get(i)).a;
                    int i2 = a.b;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            atuh atuh2 = (atuh) o.b;
                            atuh2.b = 0;
                            atuh2.a |= 1;
                        } else if (str.equals("Travel")) {
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            atuh atuh3 = (atuh) o.b;
                            atuh3.b = 3;
                            atuh3.a |= 1;
                        }
                    } else if (str.equals("Home")) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        atuh atuh4 = (atuh) o.b;
                        atuh4.b = 1;
                        atuh4.a |= 1;
                    } else if (str.equals("Work")) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        atuh atuh5 = (atuh) o.b;
                        atuh5.b = 2;
                        atuh5.a |= 1;
                    }
                }
                jti jti = new jti(4, 74, 1);
                jti.a(atuh.d, (atuh) o.i());
                c(jti.a());
                return;
            }
            ((anih) ((anih) bxk.a.b()).a("cex", "a", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[SemanticLocationProducer] Geofence intent error %d", a.a);
        }
    }

    public final void a(cas cas, cas cas2) {
        Object[] objArr = {cas, cas2};
        Map a = cbi.H().a(this.e);
        if (a == null) {
            ((anih) ((anih) bxk.a.b()).a("cex", "a", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[SemanticLocationProducer] Unexpected null aliasToLatLng returned");
        } else if (!this.k.equals(a)) {
            j();
        }
    }
}
