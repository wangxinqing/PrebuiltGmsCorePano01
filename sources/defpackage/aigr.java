package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.List;

/* renamed from: aigr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aigr extends aign {
    final /* synthetic */ aigu a;

    public aigr(aigu aigu) {
        this.a = aigu;
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        this.a.b(activityRecognitionResult);
    }

    public final void a(List list) {
        aigu aigu;
        aign aign;
        if (this.a.b(list)) {
            aigu = this.a;
            aign = aigu.a;
        } else {
            aigu = this.a;
            if (aigu.h != null) {
                aign = aigu.c;
            } else {
                return;
            }
        }
        aigu.a(aign);
    }

    public final void a(boolean z, String str) {
        this.a.b(z, str);
        aigu aigu = this.a;
        if (!aigu.f) {
            aigu.a(aigu.a);
        }
    }
}
