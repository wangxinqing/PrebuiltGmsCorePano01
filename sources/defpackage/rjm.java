package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: rjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rjm extends ibn {
    public final /* bridge */ /* synthetic */ ibo a(Context context, Looper looper, ise ise, Object obj, ica ica, icb icb) {
        rir rir;
        String str;
        rir rir2 = (rir) obj;
        if (rir2 == null) {
            rir = new riq().a();
        } else {
            rir = rir2;
        }
        String packageName = context.getPackageName();
        String str2 = rir.a;
        if (str2 == null) {
            str = packageName;
        } else {
            str = str2;
        }
        return new rjn(context, looper, ise, ica, icb, str, rir);
    }
}
