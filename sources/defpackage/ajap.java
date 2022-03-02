package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.Comparator;

/* renamed from: ajap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajap implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j = ((ActivityRecognitionResult) obj).c;
        long j2 = ((ActivityRecognitionResult) obj2).c;
        if (j != j2) {
            return j >= j2 ? 1 : -1;
        }
        return 0;
    }
}
