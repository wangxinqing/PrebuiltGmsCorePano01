package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.Collections;
import java.util.List;

/* renamed from: aibi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aibi implements ahzw {
    private final List c;

    public aibi(ActivityRecognitionResult activityRecognitionResult) {
        amrl.a((Object) activityRecognitionResult);
        this.c = Collections.singletonList(activityRecognitionResult);
    }

    public final List a(long j) {
        return a(j, 60000, ahzw.a);
    }

    public final boolean a() {
        return true;
    }

    public final List b() {
        return a(ahzw.a);
    }

    public final long c() {
        return ((ActivityRecognitionResult) this.c.get(0)).c;
    }

    public final List a(long j, long j2, ahzv ahzv) {
        if (j < ((ActivityRecognitionResult) this.c.get(0)).c) {
            return a(ahzv);
        }
        return Collections.emptyList();
    }

    public final List a(ahzv ahzv) {
        ActivityRecognitionResult a = ahzv.a((ActivityRecognitionResult) this.c.get(0));
        if (a == null) {
            return Collections.emptyList();
        }
        if (a.equals(this.c.get(0))) {
            return this.c;
        }
        return Collections.singletonList(a);
    }
}
