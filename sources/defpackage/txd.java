package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.R;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: txd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class txd {
    public static final int a = 1391908237;
    private static int h = ((int) SystemClock.elapsedRealtime());
    public final Context b;
    public final tsu c;
    public final jiq d;
    public final Map e = new HashMap();
    public String f;
    public TrueWirelessHeadset g;
    private final anax i;

    public txd(Context context) {
        this.b = context;
        this.c = (tsu) thl.a(context, tsu.class);
        this.d = (jiq) thl.a(context, jiq.class);
        anav anav = new anav();
        for (String parseInt : aymt.a.a().j().split(",", -1)) {
            anav.b(Integer.valueOf(Integer.parseInt(parseInt)));
        }
        this.i = anav.a();
    }

    private final PendingIntent a(Intent intent) {
        Context context = this.b;
        int i2 = h;
        h = i2 + 1;
        return PendingIntent.getService(context, i2, intent, 134217728);
    }

    private final boolean a(HeadsetPiece headsetPiece, HeadsetPiece headsetPiece2) {
        if (!headsetPiece.d()) {
            anhj a2 = this.i.iterator();
            while (a2.hasNext()) {
                int intValue = ((Integer) a2.next()).intValue();
                if (headsetPiece.b() > 0 && headsetPiece.b() <= intValue && headsetPiece2.b() > intValue) {
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized void a() {
        ((thb) thl.a(this.b, thb.class)).a(a);
        this.f = null;
        this.g = null;
    }

    public final synchronized void a(TrueWirelessHeadset trueWirelessHeadset, String str, auay auay) {
        int i2;
        long j;
        long j2;
        long j3;
        TrueWirelessHeadset trueWirelessHeadset2 = trueWirelessHeadset;
        String str2 = str;
        synchronized (this) {
            if (ijp.a() == null || ijp.a().a.isEnabled()) {
                this.f = str2;
                this.g = trueWirelessHeadset2;
                if (this.e.containsKey(str2)) {
                    TrueWirelessHeadset trueWirelessHeadset3 = (TrueWirelessHeadset) this.e.get(str2);
                    if (trueWirelessHeadset3 != null) {
                        if (!a(trueWirelessHeadset.b(), trueWirelessHeadset3.b())) {
                            if (a(trueWirelessHeadset.c(), trueWirelessHeadset3.c())) {
                            }
                        }
                        this.e.remove(str2);
                    } else if (aymw.a.a().bm() && (trueWirelessHeadset.b().g() || trueWirelessHeadset.c().g())) {
                        this.e.remove(str2);
                    }
                    jjg jjg = tsp.a;
                    return;
                }
                txc txc = new txc(this, trueWirelessHeadset2);
                txk txk = new txk(this.b);
                txk.a("DEVICES_WITHIN_REACH_REBRANDED");
                Context context = this.b;
                if (!aymw.a.a().bH()) {
                    i2 = udc.a(context);
                } else {
                    i2 = hdg.a(context, R.drawable.quantum_ic_headset_black_24);
                }
                txk.b(i2);
                txk.b(a(DiscoveryChimeraService.a(((udf) thl.a(this.b, udf.class)).a).setAction("com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BATTERY_NOTIFICATION_DISMISS").putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", this.f).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", trueWirelessHeadset.f())));
                txk.u = kf.b(this.b, R.color.discovery_activity_accent);
                txk.A = TimeUnit.SECONDS.toMillis(aymt.a.a().i());
                txk.c(true);
                Bundle bundle = new Bundle();
                bundle.putString("android.substName", this.b.getResources().getString(R.string.common_devices));
                txk.a(bundle);
                txk.f = a(DiscoveryChimeraService.a(((udf) thl.a(this.b, udf.class)).a).setAction("com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BATTERY_NOTIFICATION_CLICK").putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", this.f).putExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY", auay.k()).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", trueWirelessHeadset.f()));
                if (aymw.a.a().ao()) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    String str3 = this.f;
                    Uri uri = bis.a;
                    String valueOf = String.valueOf(Uri.encode("FAST_PAIR"));
                    Cursor query = this.b.getContentResolver().query(Uri.withAppendedPath(uri, valueOf.length() == 0 ? new String("id/") : "id/".concat(valueOf)).buildUpon().appendQueryParameter("address", str3).appendQueryParameter("battery_id", "1").appendQueryParameter("battery_level", String.valueOf(trueWirelessHeadset.b().b())).appendQueryParameter("battery_id", "2").appendQueryParameter("battery_level", String.valueOf(trueWirelessHeadset.c().b())).appendQueryParameter("battery_id", "3").appendQueryParameter("battery_level", String.valueOf(trueWirelessHeadset.d().b())).appendQueryParameter("timestamp", String.valueOf(System.currentTimeMillis())).build(), new String[]{"battery_estimate", "estimate_ready"}, (String) null, (String[]) null, (String) null);
                    if (query == null || !query.moveToFirst()) {
                        j3 = 0;
                    } else {
                        if (query.getInt(query.getColumnIndex("estimate_ready")) == 1) {
                            j3 = query.getLong(query.getColumnIndex("battery_estimate"));
                        } else {
                            j3 = 0;
                        }
                        query.close();
                    }
                    ((anih) tsp.a.d()).a("FastPair: Smart battery = %s", j3);
                    j = timeUnit.toMinutes(Long.valueOf(j3).longValue());
                } else {
                    j = 0;
                }
                if (j != 0) {
                    this.c.a(asom.FAST_PAIR_BATTERY_NOTIFICATION_DISPLAYED_SMART_BATTERY, trueWirelessHeadset.f(), this.f, 0, 0);
                }
                ((anih) tsp.a.d()).a("start to populate the battery notification.");
                String a2 = trueWirelessHeadset.a();
                tso tso = (tso) thl.a(txk.F, tso.class);
                if (j > 0) {
                    if (j >= 60) {
                        j2 = j / 60;
                        j %= 60;
                    } else {
                        j2 = 0;
                    }
                    if (j2 > 0) {
                        a2 = tso.a("fast_pair_headset_smart_battery_hr_min", a2, Long.valueOf(j2), Long.valueOf(j));
                    } else {
                        a2 = tso.a("fast_pair_headset_smart_battery_min", a2, Long.valueOf(j));
                    }
                } else if (trueWirelessHeadset.b().g() || trueWirelessHeadset.c().g() || trueWirelessHeadset.d().g()) {
                    a2 = tso.a("fast_pair_headset_battery_level_low", a2);
                }
                txk.E.setTextViewText(16908310, a2);
                txk.E.setImageViewResource(16908294, R.drawable.quantum_ic_headset_black_24);
                AtomicInteger atomicInteger = new AtomicInteger(3);
                txk.E.removeAllViews(16908290);
                String a3 = txk.a(txk.F, trueWirelessHeadset2);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 1 + String.valueOf(a3).length());
                sb.append(a2);
                sb.append(" ");
                sb.append(a3);
                String sb2 = sb.toString();
                txk.E.setContentDescription(16908290, sb2);
                txk.b(sb2);
                txk.a(trueWirelessHeadset.b(), atomicInteger, txc);
                txk.a(trueWirelessHeadset.d(), atomicInteger, txc);
                txk.a(trueWirelessHeadset.c(), atomicInteger, txc);
                txk.e(a2);
                txk.b((CharSequence) txk.a(txk.F, trueWirelessHeadset2));
            }
        }
    }

    public final void a(String str) {
        if (this.e.containsKey(str)) {
            ((anih) tsp.a.d()).a("FastPairBattery: Removed suppressed battery %s", (Object) str);
            this.e.remove(str);
        }
    }
}
