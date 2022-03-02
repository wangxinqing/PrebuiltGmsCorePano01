package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahnr {
    public final Context a;
    public final ahnq b;
    public final ahnv c = new ahnv();

    public ahnr(Context context, ahnq ahnq) {
        this.a = context;
        this.b = ahnq;
        if (axzm.a.a().arDndDecisionEngineEnabled()) {
            PendingIntent service = PendingIntent.getService(context, 0, ahnp.a(context), 0);
            iby a2 = rcd.a(context);
            ArrayList arrayList = new ArrayList();
            if (!axxd.a.a().enableDrivingDndWithRoadRail() || !axwr.b() || !axwr.c()) {
                rco rco = new rco();
                rco.a = 0;
                rco.a(0);
                arrayList.add(rco.a());
                rco rco2 = new rco();
                rco2.a = 0;
                rco2.a(1);
                arrayList.add(rco2.a());
            } else {
                rco rco3 = new rco();
                rco3.a = 16;
                rco3.a(0);
                arrayList.add(rco3.a());
                rco rco4 = new rco();
                rco4.a = 16;
                rco4.a(1);
                arrayList.add(rco4.a());
            }
            rco rco5 = new rco();
            rco5.a = 8;
            rco5.a(0);
            arrayList.add(rco5.a());
            rco rco6 = new rco();
            rco6.a = 7;
            rco6.a(0);
            arrayList.add(rco6.a());
            acwa a3 = a2.a(new ActivityTransitionRequest(arrayList, "ardnd", (List) null), service);
            a3.a((acvv) new ahnl());
            a3.a((acvs) new ahnm());
        }
    }
}
