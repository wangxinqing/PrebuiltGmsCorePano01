package defpackage;

import com.android.location.provider.ActivityChangedEvent;
import com.android.location.provider.ActivityRecognitionEvent;
import com.android.location.provider.ActivityRecognitionProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aivy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aivy implements ActivityRecognitionProvider.Sink {
    public final List a = new ArrayList();
    public long b = 0;
    final /* synthetic */ aivz c;

    public aivy(aivz aivz) {
        this.c = aivz;
    }

    public final void a(ActivityRecognitionEvent activityRecognitionEvent) {
        ajag ajag = new ajag(activityRecognitionEvent.getTimestampNs(), ((Integer) aivz.b.get(activityRecognitionEvent.getActivity())).intValue(), ((Integer) aivz.c.get(Integer.valueOf(activityRecognitionEvent.getEventType()))).intValue());
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ajad ajad = (ajad) list.get(i);
            ajad.b(ahnk.HARDWARE_TALA.am);
            ajad.a(Collections.singletonList(ajag));
        }
    }

    public final void onActivityChanged(ActivityChangedEvent activityChangedEvent) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityChangedEvent[");
        boolean z = true;
        for (ActivityRecognitionEvent activityRecognitionEvent : activityChangedEvent.getActivityRecognitionEvents()) {
            if (!z) {
                sb.append(", ");
            }
            int eventType = activityRecognitionEvent.getEventType();
            if (eventType != 0) {
                str = eventType != 1 ? eventType != 2 ? Integer.toString(eventType) : "EXIT" : "ENTER";
            } else {
                str = "FLUSH_COMPLETE";
            }
            sb.append(str);
            sb.append(' ');
            sb.append(activityRecognitionEvent.getActivity());
            sb.append(" @");
            sb.append(activityRecognitionEvent.getTimestampNs());
            z = false;
        }
        sb.append(']');
        String valueOf = String.valueOf(sb.toString());
        if (valueOf.length() == 0) {
            new String("onActivityChanged ");
        } else {
            "onActivityChanged ".concat(valueOf);
        }
        boolean a2 = this.c.a.a((Runnable) new aivx(this, activityChangedEvent));
    }
}
