package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: asdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asdu {
    public final asht a;
    public final ascs b;
    public final SharedPreferences c;
    public final ascn d;
    public final asjt e = new asdh(this, "UserEnabledSettingSaved", new asjt[0]);
    public final asjt f = new asdi(this, "Disabled", this.e);
    public final asjt g = new asdj(this, "Enabled", this.e);
    public final asjt h = new asdk(this, "UserSettingsSaved", this.e, this.g);
    public final asjt i = new asdm(this, "RevertedBackgroundScannerPiggybacking", new asjt[0]);
    final asjt j = new asdn(this, "Discovering", this.r, this.e, this.g);
    final asjt k = new asdo(this, "NotDiscovering", new asjt[0]);
    public final asjt l = new asdp(this, "Discoverable", this.h, this.g);
    public final asjt m = new asdb(this, "RevertedDiscoverable", new asjt[0]);
    public final asjt n = new asdc(this, "StopBleUuidAndTokenAdvertiseState", new asjt[0]);
    public final asjt o = new asdd(this, "RevertedName", new asjt[0]);
    public final asjt p = new asde(this, "RevertedEnabled", new asjt[0]);
    public final asjt q = new asdg(this, "Unmodified", this.m, this.o, this.s, this.p, this.i);
    private final asjt r = new asdl(this, "BackgroundScannerPiggybacking", new asjt[0]);
    private final asjt s = new asdf(this, "RemovedUserSettings", new asjt[0]);

    public asdu(Context context, ascs ascs, SharedPreferences sharedPreferences, ascn ascn) {
        this.a = (asht) thl.a(context, asht.class);
        this.b = ascs;
        this.c = sharedPreferences;
        this.d = ascn;
        if (sharedPreferences.contains("updated")) {
            long currentTimeMillis = System.currentTimeMillis() - this.c.getLong("updated", 0);
            if (currentTimeMillis > 86400000) {
                ((anih) ((anih) asil.a.b()).a("asdu", "a", 73, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothStates: Very old original state file: %d h", TimeUnit.MILLISECONDS.toHours(currentTimeMillis));
            }
        }
    }

    private final void a() {
        if (this.c.contains("updated")) {
            long currentTimeMillis = System.currentTimeMillis() - this.c.getLong("updated", 0);
            if (currentTimeMillis > 86400000) {
                ((anih) ((anih) asil.a.b()).a("asdu", "a", 73, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothStates: Very old original state file: %d h", TimeUnit.MILLISECONDS.toHours(currentTimeMillis));
            }
        }
    }

    public final boolean a(SharedPreferences.Editor editor, String str) {
        boolean commit = editor.putLong("updated", System.currentTimeMillis()).commit();
        if (commit) {
            jjg jjg = asil.a;
        } else {
            ((anih) ((anih) asil.a.b()).a("asdu", "a", 63, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothStates: Failed to store to disk and %s", (Object) str);
        }
        return commit;
    }
}
