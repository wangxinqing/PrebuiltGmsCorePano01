package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import com.google.android.gms.R;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: txk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class txk extends udg {
    public final RemoteViews E;
    public final Context F;

    public txk(Context context) {
        super(context);
        this.F = context;
        this.E = twb.a(context, R.layout.fast_pair_battery_notification);
    }

    public static String a(Context context, TrueWirelessHeadset trueWirelessHeadset) {
        return aryk.a(trueWirelessHeadset, new txf(context, trueWirelessHeadset), new txg(context, trueWirelessHeadset), new txh(context, trueWirelessHeadset));
    }

    public final Notification b() {
        boolean z = true;
        if (aymw.g()) {
            try {
                RemoteViews remoteViews = this.E;
                Context context = this.F;
                remoteViews.apply(context, new LinearLayout(context));
            } catch (Resources.NotFoundException e) {
                anih anih = (anih) tsp.a.c();
                anih.a((Throwable) e);
                anih.a("Failed to build notification, not setting custom view.");
                z = false;
            }
        }
        RemoteViews remoteViews2 = this.E;
        if (remoteViews2 != null && z) {
            this.x = remoteViews2;
        }
        return super.b();
    }

    public final void a(HeadsetPiece headsetPiece, AtomicInteger atomicInteger, txc txc) {
        RemoteViews a = twb.a(this.F, R.layout.fast_pair_battery_notification_child_value);
        if (this.E == null) {
            jjg jjg = tsp.a;
            a(atomicInteger, txc);
        } else if (a == null) {
            jjg jjg2 = tsp.a;
            a(atomicInteger, txc);
        } else if (headsetPiece.b() == -1) {
            jjg jjg3 = tsp.a;
            a(atomicInteger, txc);
        } else {
            int b = headsetPiece.b();
            StringBuilder sb = new StringBuilder(12);
            sb.append(b);
            sb.append("%");
            a.setTextViewText(16908290, sb.toString());
            a.setInt(16908295, "setColorFilter", this.F.getResources().getColor(!headsetPiece.g() ? R.color.fast_pair_battery_level_normal : R.color.fast_pair_battery_level_low));
            a.setImageViewResource(16908295, headsetPiece.d() ? headsetPiece.b() > 20 ? headsetPiece.b() > 40 ? headsetPiece.b() > 60 ? headsetPiece.b() >= 100 ? R.drawable.quantum_ic_battery_charging_full_vd_theme_24 : R.drawable.quantum_ic_battery_charging_80_vd_theme_24 : R.drawable.quantum_ic_battery_charging_60_vd_theme_24 : R.drawable.quantum_ic_battery_charging_30_vd_theme_24 : R.drawable.quantum_ic_battery_charging_20_vd_theme_24 : headsetPiece.b() > headsetPiece.a() ? headsetPiece.b() > 20 ? headsetPiece.b() > 40 ? headsetPiece.b() > 60 ? headsetPiece.b() >= 100 ? R.drawable.quantum_ic_battery_full_vd_theme_24 : R.drawable.quantum_ic_battery_80_vd_theme_24 : R.drawable.quantum_ic_battery_60_vd_theme_24 : R.drawable.quantum_ic_battery_30_vd_theme_24 : R.drawable.quantum_ic_battery_20_vd_theme_24 : R.drawable.quantum_ic_battery_alert_vd_theme_24);
            this.E.addView(16908290, a);
            ((anih) tsp.a.d()).a("start to download the image of battery notification.Latch count %s", (Object) "invalid");
            jfm.b(9).execute(new txi(this, headsetPiece, a, atomicInteger, txc));
        }
    }

    public final void a(AtomicInteger atomicInteger, txc txc) {
        if (atomicInteger.decrementAndGet() == 0) {
            jjg jjg = tsp.a;
            txd txd = txc.a;
            TrueWirelessHeadset trueWirelessHeadset = txc.b;
            synchronized (txd) {
                if (txd.f != null) {
                    ((thb) thl.a(txd.b, thb.class)).a(txd.a, b());
                    tsu tsu = txd.c;
                    asom asom = asom.FAST_PAIR_BATTERY_NOTIFICATION_SHOWN;
                    String f = trueWirelessHeadset.f();
                    String str = txd.f;
                    long j = -1;
                    if (trueWirelessHeadset.g() != -1) {
                        j = txd.d.a() - trueWirelessHeadset.g();
                    }
                    int a = TrueWirelessHeadset.a(trueWirelessHeadset.b().b());
                    if (TrueWirelessHeadset.a(trueWirelessHeadset.c().b())) {
                        a++;
                    }
                    if (TrueWirelessHeadset.a(trueWirelessHeadset.d().b())) {
                        a++;
                    }
                    tsu.a(asom, f, str, j, a);
                    return;
                }
                return;
            }
        }
        jjg jjg2 = tsp.a;
        atomicInteger.get();
    }
}
