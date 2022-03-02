package defpackage;

import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahpr {
    static {
        ahpr.class.getSimpleName();
    }

    public static ActivityTransitionRequest a(ahps ahps, ahpq ahpq, ActivityTransitionRequest activityTransitionRequest) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (activityTransitionRequest != null) {
            for (ActivityTransition activityTransition : activityTransitionRequest.b) {
                if (activityTransition.a == 22) {
                    arrayList.add(activityTransition);
                }
            }
        }
        Object[] objArr = new Object[1];
        if (!arrayList.isEmpty()) {
            str = "requested";
        } else {
            str = "did not request";
        }
        objArr[0] = str;
        if (ahps != null) {
            String valueOf = String.valueOf(arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Received car crash transition requests? ");
            sb.append(valueOf);
            sb.toString();
            ahps.a = arrayList;
            ahps.a();
        }
        if (ahpq != null) {
            ahpq.a((List) arrayList);
        }
        if (arrayList.isEmpty()) {
            return activityTransitionRequest;
        }
        ArrayList arrayList2 = new ArrayList();
        for (ActivityTransition activityTransition2 : activityTransitionRequest.b) {
            if (activityTransition2.a != 22) {
                arrayList2.add(activityTransition2);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new ActivityTransitionRequest(arrayList2, activityTransitionRequest.c, activityTransitionRequest.d);
        }
        return null;
    }
}
