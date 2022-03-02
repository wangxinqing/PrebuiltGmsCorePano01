package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* renamed from: aqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqp extends Property {
    public aqp(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        aqv aqv = (aqv) obj;
        return null;
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        aqv aqv = (aqv) obj;
        PointF pointF = (PointF) obj2;
        aqv.c = Math.round(pointF.x);
        aqv.d = Math.round(pointF.y);
        int i = aqv.f + 1;
        aqv.f = i;
        if (aqv.e == i) {
            aqv.a();
        }
    }
}
