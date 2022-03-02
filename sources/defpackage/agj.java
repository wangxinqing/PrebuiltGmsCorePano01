package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* renamed from: agj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agj {
    public final Intent a;

    public agj(Intent intent) {
        this.a = intent;
    }

    public final void a(Context context, Uri uri) {
        this.a.setData(uri);
        Intent intent = this.a;
        int i = Build.VERSION.SDK_INT;
        context.startActivity(intent, (Bundle) null);
    }
}
