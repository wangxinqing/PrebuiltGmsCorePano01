package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

/* renamed from: eaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class eaf extends RecyclerView {
    protected dzw a;
    public acy b;

    public eaf(Context context) {
        super(context);
        super.setOnScrollListener(new eae(this));
    }

    public abstract void a(int i);

    public abstract void a(int i, int i2, int i3);

    public final void setOnScrollListener(acy acy) {
        this.b = acy;
    }
}
