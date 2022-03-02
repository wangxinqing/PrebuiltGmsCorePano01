package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.util.Property;

/* renamed from: aep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aep extends Property {
    public aep(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).c);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).a(((Float) obj2).floatValue());
    }
}
