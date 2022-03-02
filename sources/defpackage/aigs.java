package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.List;

/* renamed from: aigs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aigs extends aign {
    final /* synthetic */ aigu a;

    public aigs(aigu aigu) {
        this.a = aigu;
    }

    public final void a() {
        aigu aigu = this.a;
        aigt aigt = aigu.e;
        if (aigt != null) {
            String str = aigu.g;
            aigw aigw = (aigw) aigt;
            if (!aigw.b && axxg.d()) {
                aigw.b = true;
                aidf aidf = aigw.a;
                aidf.a(34, aidf.m.a((Object) str));
                if (((aigg) aigt).f()) {
                    aigw.b(false);
                }
            }
        }
    }

    public final void a(List list) {
        if (this.a.b(list)) {
            aigu aigu = this.a;
            aigu.a(aigu.a);
        }
    }

    public final void b() {
        aigt aigt = this.a.e;
        if (aigt != null) {
            aigw aigw = (aigw) aigt;
            if (aigw.b) {
                aigw.b = false;
                aigw.a.a(35);
                if (((aigg) aigt).f()) {
                    aigw.b(false);
                }
            }
        }
    }

    public final void c() {
        aigu aigu = this.a;
        aigu.h = null;
        aigu.a(aigu.b);
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        this.a.b(activityRecognitionResult);
    }

    public final void a(boolean z, String str) {
        this.a.b(z, str);
        aigu aigu = this.a;
        aigu.a(!aigu.f ? aigu.a : aigu.b);
    }
}
