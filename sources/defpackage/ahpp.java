package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: ahpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahpp {
    public static final List a = Arrays.asList(new Integer[]{5, 4});
    private static final List b = Arrays.asList(new Integer[]{0, 16});

    public static DetectedActivity a(ActivityRecognitionResult activityRecognitionResult) {
        DetectedActivity b2 = activityRecognitionResult.b();
        int a2 = b2.a();
        int i = b2.e;
        if (a2 == 17 || a2 == 16) {
            a2 = 0;
        }
        return new DetectedActivity(a2, i);
    }

    public static boolean a(ActivityTransitionEvent activityTransitionEvent) {
        int i = activityTransitionEvent.a;
        return i == 8 || i == 7 || i == 2;
    }

    protected static List a(List list, Set set) {
        ativ.a((Object) list);
        ativ.a((Object) set);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) list.get(i);
            if (!set.contains(Integer.valueOf(activityTransitionEvent.a))) {
                arrayList.add(activityTransitionEvent);
            }
        }
        return arrayList;
    }

    public static boolean a(int i) {
        return b.contains(Integer.valueOf(i));
    }
}
