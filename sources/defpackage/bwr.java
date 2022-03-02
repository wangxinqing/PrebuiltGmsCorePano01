package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl;

/* renamed from: bwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bwr implements jvm {
    final IBinder a = new Binder();
    final /* synthetic */ bwu b;

    public bwr(bwu bwu) {
        this.b = bwu;
    }

    public final void a(FenceStateImpl fenceStateImpl) {
        String str;
        if (fenceStateImpl == null || !TextUtils.equals(this.b.c, fenceStateImpl.c)) {
            anih anih = (anih) ((anih) bxk.a.b()).a("bwr", "a", 58, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            String str2 = this.b.c;
            if (fenceStateImpl != null) {
                str = fenceStateImpl.c;
            } else {
                str = "none";
            }
            anih.a("[EvaluateFenceOperation] No fenceState or fence key does not match. expected=%s, got=%s", (Object) str2, (Object) str);
        } else if (fenceStateImpl.a == 0) {
            ((anih) ((anih) bxk.a.b()).a("bwr", "a", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[EvaluateFenceOperation] current fenceState is UNKNOWN");
        } else {
            this.b.a(0, fenceStateImpl);
        }
    }

    public final void a(FenceTriggerInfoImpl fenceTriggerInfoImpl) {
    }

    public final IBinder asBinder() {
        return this.a;
    }
}
