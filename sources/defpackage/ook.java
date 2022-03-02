package defpackage;

import java.util.Collection;

/* renamed from: ook  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ook {
    public final nzu a;
    public final ofn b;
    public final aoru c;
    public final Collection d;

    public ook(nzu nzu, ofn ofn, aoru aoru, Collection collection) {
        this.a = nzu;
        this.b = ofn;
        this.c = aoru;
        this.d = collection;
    }

    public static void a(aoru aoru, nzu nzu, ofn ofn, Collection collection) {
        aoru.execute(new ooj(new ook(nzu, ofn, aoru, collection)));
    }
}
