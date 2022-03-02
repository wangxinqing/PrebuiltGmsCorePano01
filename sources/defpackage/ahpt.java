package defpackage;

import com.google.android.gms.location.ActivityTransitionEvent;
import java.util.List;

/* renamed from: ahpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahpt {
    public final aizy a;
    public boolean b = false;
    public boolean c = false;
    public long d = 0;
    public final ahpu e = new ahpu();

    public ahpt(aizy aizy) {
        this.a = aizy;
    }

    public static ActivityTransitionEvent a(int i, int i2, long j) {
        return new ActivityTransitionEvent(i, i2, j);
    }

    public static final ActivityTransitionEvent a(List list) {
        if (!list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) list.get(size);
                if (activityTransitionEvent.b == 1) {
                    return activityTransitionEvent;
                }
            }
        }
        return null;
    }
}
