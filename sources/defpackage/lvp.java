package defpackage;

import android.os.Bundle;

/* renamed from: lvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lvp extends lut {
    final /* synthetic */ lvr a;

    public lvp(lvr lvr) {
        this.a = lvr;
    }

    public final void a() {
        boolean z;
        this.a.g.a(anxx.DRIVING_MODE_FRX_DOWNLOAD, anxw.DRIVING_MODE_FRX_READY);
        this.a.a.b("com.google.android.projection.gearhead");
        lvt lvt = new lvt();
        Bundle arguments = lvt.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            z = true;
        } else {
            z = false;
        }
        arguments.putBoolean("DrivingModeFrxGearheadSetupFragment.force_launch", true);
        if (z) {
            lvt.setArguments(arguments);
        }
        this.a.m().c(lvt);
    }
}
