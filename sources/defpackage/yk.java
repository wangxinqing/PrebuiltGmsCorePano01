package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* renamed from: yk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yk extends abe {
    @ViewDebug.ExportedProperty
    public boolean a;
    @ViewDebug.ExportedProperty
    public int b;
    @ViewDebug.ExportedProperty
    public int c;
    @ViewDebug.ExportedProperty
    public boolean d;
    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public yk() {
        super(-2);
        this.a = false;
    }

    public yk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public yk(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public yk(yk ykVar) {
        super((ViewGroup.LayoutParams) ykVar);
        this.a = ykVar.a;
    }
}
