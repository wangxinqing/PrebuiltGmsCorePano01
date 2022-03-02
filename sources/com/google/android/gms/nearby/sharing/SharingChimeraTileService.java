package com.google.android.gms.nearby.sharing;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.service.quicksettings.Tile;
import com.google.android.chimera.TileService;
import com.google.android.gms.R;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SharingChimeraTileService extends TileService {
    public static final /* synthetic */ int b = 0;
    private static final AtomicInteger c = new AtomicInteger(new SecureRandom().nextInt());
    public vts a;
    private BroadcastReceiver d;
    private boolean e = false;

    private final void a() {
        Icon icon;
        Tile qsTile = getQsTile();
        if (qsTile == null) {
            ((anih) vvj.a.d()).a("Failed to invalidate tile state.");
            return;
        }
        if (this.e) {
            icon = whr.a(getResources().getDrawable(R.drawable.sharing_ic_tile));
            jjg jjg = vvj.a;
        } else {
            icon = whr.a(getResources().getDrawable(R.drawable.sharing_ic_tile_disabled));
            jjg jjg2 = vvj.a;
        }
        qsTile.setIcon(icon);
        qsTile.setState(1);
        qsTile.updateTile();
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void onClick() {
        if (ayni.a.a().am()) {
            a("com.google.android.gms.nearby.sharing.InternalReceiveSurfaceActivity");
        } else if (!this.e) {
            this.a.a().a((acvv) new vsj(this));
        } else {
            a("com.google.android.gms.nearby.sharing.InternalReceiveSurfaceActivity");
        }
    }

    public final void onCreate() {
        super.onCreate();
        this.a = tcn.c(this);
        this.d = new nla("nearby") {
            public final void a(Context context, Intent intent) {
                SharingChimeraTileService sharingChimeraTileService = SharingChimeraTileService.this;
                int i = SharingChimeraTileService.b;
                sharingChimeraTileService.a.p().a((acvv) new vsk(this));
            }
        };
        ((anih) vvj.a.d()).a("SharingTileService created.");
    }

    public final void onDestroy() {
        super.onDestroy();
        ((anih) vvj.a.d()).a("SharingTileService destroyed");
    }

    public final void onStartListening() {
        a();
        thp.a(this, this.d, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
        this.a.p().a((acvv) new vsi(this));
    }

    public final void onStopListening() {
        thp.a((Context) this, this.d);
    }

    public final void a(String str) {
        try {
            PendingIntent.getActivity(this, c.getAndIncrement(), new Intent().addFlags(268435456).addFlags(32768).setClassName(this, str), 134217728).send();
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (PendingIntent.CanceledException e2) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e2);
            anih.a("SharingTileService failed to launch %s", (Object) str);
        }
    }

    public final void a(boolean z) {
        this.e = z;
        a();
    }
}
