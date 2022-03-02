package defpackage;

import android.util.Property;
import android.view.View;

/* renamed from: asa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asa extends Property {
    public asa(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(asc.a((View) obj));
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        asc.a((View) obj, ((Float) obj2).floatValue());
    }
}
