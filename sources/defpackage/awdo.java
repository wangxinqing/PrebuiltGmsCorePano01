package defpackage;

import java.util.LinkedHashMap;

/* renamed from: awdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awdo {
    final LinkedHashMap a;

    public awdo(int i) {
        this.a = awdq.b(i);
    }

    public final awdv a() {
        return new awdv(this.a);
    }

    public final void a(Object obj, bapu bapu) {
        LinkedHashMap linkedHashMap = this.a;
        awdx.a(obj, "key");
        awdx.a((Object) bapu, "provider");
        linkedHashMap.put(obj, bapu);
    }
}
