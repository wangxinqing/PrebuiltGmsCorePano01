package defpackage;

import android.util.Property;

/* renamed from: eaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class eaj extends Property {
    public eaj(String str) {
        super(Integer.class, str);
    }

    public abstract void a(Object obj, int i);

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        a(obj, ((Integer) obj2).intValue());
    }
}
