package defpackage;

import com.android.location.provider.ActivityChangedEvent;
import com.android.location.provider.ActivityRecognitionEvent;
import java.util.List;

/* renamed from: aivx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aivx implements Runnable {
    final /* synthetic */ ActivityChangedEvent a;
    final /* synthetic */ aivy b;

    public aivx(aivy aivy, ActivityChangedEvent activityChangedEvent) {
        this.b = aivy;
        this.a = activityChangedEvent;
    }

    public final void run() {
        aivy aivy;
        if (!this.b.a.isEmpty()) {
            for (ActivityRecognitionEvent activityRecognitionEvent : this.a.getActivityRecognitionEvents()) {
                if (activityRecognitionEvent.getEventType() == 0) {
                    List list = this.b.a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((ajad) list.get(i)).s();
                    }
                } else {
                    if (!"android.activity_recognition.tilting".equals(activityRecognitionEvent.getActivity())) {
                        long timestampNs = activityRecognitionEvent.getTimestampNs();
                        aivy aivy2 = this.b;
                        if (timestampNs >= aivy2.b) {
                            aivy2.b = activityRecognitionEvent.getTimestampNs();
                            aivy = this.b;
                        }
                    } else {
                        aivy = this.b;
                    }
                    aivy.a(activityRecognitionEvent);
                }
            }
        }
    }
}
