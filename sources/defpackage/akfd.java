package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: akfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class akfd extends FrameLayout {
    protected final ArrayList a;

    public akfd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
        if (attributeSet != null) {
            a(context, attributeSet);
        }
        this.a = new ArrayList();
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(Context context, AttributeSet attributeSet);

    /* access modifiers changed from: protected */
    public final void b() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((akfc) arrayList.get(i)).a();
        }
    }
}
