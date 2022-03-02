package defpackage;

import java.util.HashSet;

/* renamed from: aewo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aewo extends awem {
    private final awef b;

    public aewo(bapu bapu, bapu bapu2, awef awef) {
        super(bapu2, awey.a(aewo.class), bapu);
        this.b = aweu.a(awef);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return this.b.b();
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        HashSet hashSet = new HashSet();
        amzy amzy = ((afcd) obj).a;
        int size = amzy.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(((aukz) amzy.get(i)).f);
        }
        return aorl.a((Object) hashSet);
    }
}
