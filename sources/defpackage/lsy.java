package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.drivingmode.LocationActivityTransitionIntentOperation;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lsy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lsy {
    final PendingIntent a;
    final iby b;
    private final Context c;

    public lsy(Context context) {
        this.c = context;
        Intent startIntent = IntentOperation.getStartIntent(context, LocationActivityTransitionIntentOperation.class, "com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION");
        amrl.a((Object) startIntent);
        PendingIntent service = PendingIntent.getService(this.c, 0, startIntent, 134217728);
        amrl.a((Object) service);
        this.a = service;
        this.b = rcd.a(context);
    }

    public final void a() {
        iby iby = this.b;
        ArrayList arrayList = new ArrayList();
        rco rco = new rco();
        rco.a = 0;
        rco.a(0);
        arrayList.add(rco.a());
        rco rco2 = new rco();
        rco2.a = 0;
        rco2.a(1);
        arrayList.add(rco2.a());
        rco rco3 = new rco();
        rco3.a = 8;
        rco3.a(0);
        arrayList.add(rco3.a());
        rco rco4 = new rco();
        rco4.a = 7;
        rco4.a(0);
        arrayList.add(rco4.a());
        if (awqd.b()) {
            rco rco5 = new rco();
            rco5.a = 3;
            rco5.a(0);
            arrayList.add(rco5.a());
            rco rco6 = new rco();
            rco6.a = 3;
            rco6.a(1);
            arrayList.add(rco6.a());
        }
        acwa a2 = iby.a(new ActivityTransitionRequest(arrayList, "DrivingMode", (List) null), this.a);
        a2.a(lss.a);
        a2.a(lst.a);
    }
}
