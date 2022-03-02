package defpackage;

import android.util.LruCache;

/* renamed from: kiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kiv extends LruCache {
    public kiv(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        knc knc = (knc) obj;
        kiw kiw = (kiw) obj2;
        kiw kiw2 = (kiw) obj3;
        if (kiw != null) {
            kiw.a.c();
        }
    }
}
