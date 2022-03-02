package defpackage;

import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* renamed from: ahph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahph extends ArrayList {
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        if (!super.add(activityTransitionEvent)) {
            return false;
        }
        if (!DetectedActivity.b(activityTransitionEvent.a)) {
            return true;
        }
        return super.add(new ActivityTransitionEvent(0, activityTransitionEvent.b, activityTransitionEvent.c));
    }
}
