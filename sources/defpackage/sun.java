package defpackage;

import android.content.pm.PackageManager;

/* renamed from: sun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sun extends sux {
    public sun(sze sze) {
        super(sze);
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        int i;
        try {
            i = jni.b(z()).a(str, 0).uid;
        } catch (PackageManager.NameNotFoundException e) {
            i = -1;
        }
        if (i != -1) {
            izj.a(13056, i);
        } else {
            izj.b(13056);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        izj.a();
    }
}
