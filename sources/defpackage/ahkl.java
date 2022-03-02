package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.List;
import java.util.Locale;

/* renamed from: ahkl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahkl {
    public final ActivityRecognitionResult a;
    public final ahip b;
    public final List c;

    public ahkl(ActivityRecognitionResult activityRecognitionResult, ahip ahip, List list) {
        this.a = activityRecognitionResult;
        this.b = ahip;
        this.c = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.ENGLISH, "OffBodyDetection [result=%s, error=%s, ", new Object[]{this.a, this.b}));
        sb.append("accelWindowResults=[");
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = (ahkk) list.get(i);
            if (obj == null) {
                obj = "null";
            }
            sb.append(obj);
            sb.append(", ");
        }
        sb.append(']');
        return sb.toString();
    }
}
