package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.text.DateFormat;
import java.util.Date;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NotificationChimeraBroadcastReceiver extends IntentOperation {
    public thb a;
    private vts b;
    private vwj c;

    public NotificationChimeraBroadcastReceiver() {
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.b = tcn.c(this);
        this.a = thb.a((Context) this);
        this.c = vwj.a(getApplicationContext());
    }

    public final void onHandleIntent(Intent intent) {
        if (!ayni.p()) {
            return;
        }
        if (intent.getAction() == null) {
            ((anih) vvj.a.d()).a("Received unexpected broadcast with no action");
        } else if (!"com.google.android.gms.nearby.sharing.ACTION_DISMISS".equals(intent.getAction()) || !"nearby_sharing_alert".equals(intent.getStringExtra("channel_id"))) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("share_target_bytes");
            if (byteArrayExtra != null) {
                try {
                    ShareTarget shareTarget = (ShareTarget) wib.a(byteArrayExtra, ShareTarget.CREATOR);
                    char c2 = 65535;
                    int intExtra = intent.getIntExtra("notification_id", -1);
                    String action = intent.getAction();
                    switch (action.hashCode()) {
                        case -1796513094:
                            if (action.equals("com.google.android.gms.nearby.sharing.ACTION_DISMISS")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case -1258243400:
                            if (action.equals("com.google.android.gms.nearby.sharing.ACTION_ACCEPT")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -1202506710:
                            if (action.equals("com.google.android.gms.nearby.sharing.ACTION_CANCEL")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -769492657:
                            if (action.equals("com.google.android.gms.nearby.sharing.ACTION_REJECT")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 119790586:
                            if (action.equals("com.google.android.gms.nearby.sharing.ACTION_OPEN")) {
                                c2 = 4;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 == 1) {
                            this.b.d(shareTarget);
                        } else if (c2 == 2 || c2 == 3) {
                            this.b.b(shareTarget);
                        } else if (c2 == 4) {
                            this.b.c(shareTarget);
                        }
                        this.a.a("nearby_sharing", intExtra);
                        return;
                    }
                    this.b.a(shareTarget).a((acvs) new vmy(this, intExtra));
                } catch (IllegalArgumentException e) {
                    anih anih = (anih) vvj.a.d();
                    anih.a((Throwable) e);
                    anih.a("Received unexpected broadcast with invalid share target");
                }
            } else {
                ((anih) vvj.a.d()).a("Received unexpected broadcast with no share target");
            }
        } else {
            vwj vwj = this.c;
            vwj.c().edit().putLong("most_recent_notification_dismissed_timestamp", vwj.a.a()).apply();
            ((anih) ((anih) vvj.a.d()).a("vwj", "a", 76, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("User dismissed the fast init notification. Not showing the notification until %s.", (Object) DateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis() + ayni.u())));
        }
    }

    NotificationChimeraBroadcastReceiver(vts vts, thb thb, vwj vwj) {
        this.b = vts;
        this.a = thb;
        this.c = vwj;
    }
}
