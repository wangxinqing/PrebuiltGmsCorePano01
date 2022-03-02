package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;

/* renamed from: cvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cvs {
    private static volatile WeakReference c = new WeakReference((Object) null);
    public volatile cvr a;
    public final CountDownLatch b = new CountDownLatch(1);

    /* JADX WARNING: type inference failed for: r0v3, types: [mby, android.os.IBinder] */
    private cvs() {
        ? a2 = mbz.a((Object) Collections.synchronizedList(new ArrayList()));
        Bundle bundle = new Bundle();
        fy.a(bundle, "settingsListKey", a2);
        bundle.putString("className", "GmscoreSettingsProvider");
        Intent intent = new Intent("com.google.android.gms.GOOGLE_SETTINGS_OPERATION").setPackage(ihs.b().getPackageName());
        intent.putExtras(bundle);
        ihs.b().startService(intent);
    }

    public static cvs a() {
        cvs cvs = (cvs) c.get();
        if (cvs != null) {
            return cvs;
        }
        cvs cvs2 = new cvs();
        c = new WeakReference(cvs2);
        return cvs2;
    }

    public final cvp a(int i) {
        this.b.await();
        return (cvp) this.a.b.get(Integer.valueOf(i));
    }
}
