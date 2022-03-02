package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* renamed from: aqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqo extends Property {
    public aqo(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        aqv aqv = (aqv) obj;
        return null;
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        aqv aqv = (aqv) obj;
        PointF pointF = (PointF) obj2;
        aqv.a = Math.round(pointF.x);
        aqv.b = Math.round(pointF.y);
        int i = aqv.e + 1;
        aqv.e = i;
        if (i == aqv.f) {
            aqv.a();
        }
    }
}
