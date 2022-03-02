package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* renamed from: cye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class cye extends RecyclerView {
    public cye(Context context) {
        super(context);
        setLayoutManager(new abk());
    }

    /* renamed from: c */
    public final abk getLayoutManager() {
        abk abk = (abk) super.getLayoutManager();
        if (abk != null) {
            return abk;
        }
        throw new IllegalStateException();
    }

    public final void setLayoutManager(act act) {
        amrl.a((Object) act);
        amrl.a(act instanceof abk, "LinearRecyclerView requires a LinearLayoutManager, but got %s", (Object) act.getClass().getName());
        super.setLayoutManager(act);
    }

    public cye(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutManager(new abk());
    }
}
