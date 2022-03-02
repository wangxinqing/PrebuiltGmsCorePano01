package defpackage;

import android.content.pm.PackageManager;

/* renamed from: dpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dpj extends dpn {
    public dpj(dmd dmd) {
        super(dmd);
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        int i;
        try {
            i = jni.b(d()).a(str, 0).uid;
        } catch (PackageManager.NameNotFoundException e) {
            e().b(5, "Couldn't find appInfo for package", e, (Object) null, (Object) null);
            i = -1;
        }
        izj.a(512, i);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        izj.a();
    }
}
