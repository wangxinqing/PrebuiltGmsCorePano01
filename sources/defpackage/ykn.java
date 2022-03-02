package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusSession;

/* renamed from: ykn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ykn extends ibn {
    public final int a() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ ibo a(Context context, Looper looper, ise ise, Object obj, ica ica, icb icb) {
        ykp ykp = (ykp) obj;
        if (ykp == null) {
            ykp = new ykp();
        }
        ise ise2 = ise;
        return new ytv(context, looper, ise2, new PlusSession(ise.b().name, jkx.a(ise2.c), (String[]) ykp.a.toArray(new String[0]), new String[0], context.getPackageName(), context.getPackageName(), (String) null, new PlusCommonExtras()), ica, icb);
    }
}
