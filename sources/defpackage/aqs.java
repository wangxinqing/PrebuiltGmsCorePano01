package defpackage;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: aqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqs extends Property {
    public aqs(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        View view = (View) obj;
        return null;
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        int round = Math.round(pointF.x);
        int round2 = Math.round(pointF.y);
        asc.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
    }
}
