package defpackage;

import android.os.Bundle;

/* renamed from: acml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acml extends acmn {
    private static final iwd c = acqa.a("Setup", "UI", "HeadlessLockScreenFragment");
    private boolean b = false;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c.a("Created headless Lock Screen fragment", new Object[0]);
        if (bundle != null) {
            this.b = bundle.getBoolean("deviceLocked", false);
        }
        if (!this.b) {
            this.b = true;
            c.b("Locking device", new Object[0]);
            a();
            return;
        }
        c.b("Device already locked", new Object[0]);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("deviceLocked", this.b);
    }
}
