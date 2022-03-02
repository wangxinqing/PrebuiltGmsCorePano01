package defpackage;

import java.util.AbstractMap;

/* renamed from: argx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class argx extends AbstractMap.SimpleEntry {
    final /* synthetic */ argy a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public argx(argy argy, Object obj, Object obj2) {
        super(obj, obj2);
        this.a = argy;
    }

    public final Object setValue(Object obj) {
        return this.a.a(obj);
    }
}
