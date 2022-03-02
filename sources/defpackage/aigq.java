package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.List;

/* renamed from: aigq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aigq extends aign {
    final /* synthetic */ aigu a;

    public aigq(aigu aigu) {
        this.a = aigu;
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        aign aign;
        int a2 = activityRecognitionResult.a().a();
        if (a2 == 2 || a2 == 3) {
            aigu aigu = this.a;
            if (!aigu.f) {
                aign = aigu.a;
            } else {
                aign = aigu.b;
            }
            aigu.a(aign);
        }
    }

    public final void a(List list) {
        if (this.a.b(list)) {
            aigu aigu = this.a;
            if (aigu.f) {
                aigu.a(aigu.a);
            }
        }
    }

    public final void a(boolean z, String str) {
        this.a.b(z, str);
    }
}
