package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.Collections;
import java.util.List;

/* renamed from: ibn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ibn {
    public int a() {
        return Integer.MAX_VALUE;
    }

    @Deprecated
    public ibo a(Context context, Looper looper, ise ise, Object obj, ica ica, icb icb) {
        return a(context, looper, ise, obj, (iea) ica, (igg) icb);
    }

    public ibo a(Context context, Looper looper, ise ise, Object obj, iea iea, igg igg) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public List a(Object obj) {
        return Collections.emptyList();
    }
}
