package defpackage;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: asb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asb extends Property {
    public asb(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return qb.C((View) obj);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        qb.a((View) obj, (Rect) obj2);
    }
}
