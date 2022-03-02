package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: nlg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class nlg extends ibn {
    public final int a() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ ibo a(Context context, Looper looper, ise ise, Object obj, ica ica, icb icb) {
        nli nli;
        nli nli2 = (nli) obj;
        if (nli2 == null) {
            nli = new nlh().a();
        } else {
            nli = nli2;
        }
        return new nme(context, looper, ise, nli, ica, icb);
    }
}
