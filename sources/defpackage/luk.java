package defpackage;

import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;

/* renamed from: luk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class luk implements View.OnClickListener {
    private final lum a;
    private final String b;

    public luk(lum lum, String str) {
        this.a = lum;
        this.b = str;
    }

    public void onClick(View view) {
        lum lum = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        sb.append("Behavior Option ");
        sb.append(str);
        sb.append(" clicked.");
        sb.toString();
        lum.a.b(lxg.MANUAL);
        luu luu = lum.a;
        try {
            luu.c.b(str);
        } catch (RemoteException e) {
            Log.i("CAR.DRIVINGMODE", "saveBehaviorChoice RemoteException", e);
        }
        luu.r();
        luj a2 = luj.a(str);
        if (a2.c() == 3 && !a2.d(lum.getContext())) {
            lum.a("DND_ACCESS");
        } else if (a2.c() == 2 && !a2.d(lum.getContext())) {
            lum.a("GEARHEAD_INSTALL");
        }
        if (lum.getTargetFragment() != null) {
            lum.getTargetFragment().onActivityResult(lum.getTargetRequestCode(), -1, new Intent());
        }
        lum.dismiss();
    }
}
