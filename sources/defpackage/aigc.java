package defpackage;

import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.List;

/* renamed from: aigc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aigc extends aifz {
    long b;
    final /* synthetic */ aigf c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aigc(aigf aigf) {
        super(aigf);
        this.c = aigf;
    }

    private final boolean a() {
        return SystemClock.elapsedRealtime() - this.b > ayaw.a.a().vehicleActivityTimeoutMs();
    }

    public final void b() {
        this.b = SystemClock.elapsedRealtime();
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        if (!a()) {
            int a = activityRecognitionResult.a().a();
            if (a == 0 || a == 1) {
                this.b = SystemClock.elapsedRealtime();
            } else if (a == 2) {
                a(this.c.g);
            }
        } else {
            a(this.c.g);
            this.c.a(activityRecognitionResult);
        }
    }

    public final void a(List list) {
        if (a()) {
            a(this.c.g);
            this.c.b(list);
        } else if (aigf.a((Location) list.get(list.size() - 1))) {
            this.b = SystemClock.elapsedRealtime();
        }
    }
}
