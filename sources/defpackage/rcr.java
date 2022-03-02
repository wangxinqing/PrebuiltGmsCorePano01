package defpackage;

import com.google.android.gms.location.ActivityTransition;
import java.util.Comparator;

/* renamed from: rcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rcr implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        int i = activityTransition.a;
        int i2 = activityTransition2.a;
        if (i != i2) {
            return i >= i2 ? 1 : -1;
        }
        int i3 = activityTransition.b;
        int i4 = activityTransition2.b;
        if (i3 == i4) {
            return 0;
        }
        return i3 >= i4 ? 1 : -1;
    }
}
