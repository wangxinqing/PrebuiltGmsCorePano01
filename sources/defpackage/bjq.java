package defpackage;

import android.content.Context;
import android.service.quicksettings.TileService;

/* renamed from: bjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bjq extends TileService {
    final /* synthetic */ com.google.android.chimera.TileService a;

    public bjq(com.google.android.chimera.TileService tileService) {
        this.a = tileService;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void onClick() {
        this.a.onClick();
    }

    public final void onStartListening() {
        this.a.onStartListening();
    }

    public final void onStopListening() {
        this.a.onStopListening();
    }

    public final void onTileAdded() {
        this.a.onTileAdded();
    }

    public final void onTileRemoved() {
        this.a.onTileRemoved();
    }
}
