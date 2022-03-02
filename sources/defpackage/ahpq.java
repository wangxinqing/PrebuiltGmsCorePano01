package defpackage;

import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ahpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahpq implements aizr {
    private final ahjc a;
    private List b = new ArrayList();

    public ahpq(ahjc ahjc) {
        this.a = ahjc;
    }

    private static boolean a(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ActivityTransition activityTransition = (ActivityTransition) list.get(i2);
            if (activityTransition.a == 22 && activityTransition.b == i) {
                return true;
            }
        }
        return false;
    }

    private final synchronized void b(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (a(this.b, 0)) {
            arrayList.add(new ActivityTransitionEvent(22, 0, TimeUnit.MILLISECONDS.toNanos(currentTimeMillis)));
        }
        if (a(this.b, 1)) {
            arrayList.add(new ActivityTransitionEvent(22, 1, TimeUnit.MILLISECONDS.toNanos(currentTimeMillis)));
        }
        if (!arrayList.isEmpty()) {
            this.a.a((List) arrayList, i);
        }
    }

    public final synchronized void a(List list) {
        this.b = list;
    }

    public final void a(int i) {
        if (axyl.a.a().chreCcTransitionHealthEventEnabled() && axyl.b()) {
            b(4);
        }
    }

    public final boolean a(aizq aizq) {
        if (axyl.b() && aizq.f) {
            b(0);
        }
        return false;
    }
}
