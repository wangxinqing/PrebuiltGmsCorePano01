package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.internal.InitializationParams;

/* renamed from: swt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class swt {
    final Context a;
    String b;
    String c;
    String d;
    Boolean e;
    long f;
    InitializationParams g;
    boolean h = true;

    public swt(Context context, InitializationParams initializationParams) {
        iva.a((Object) context);
        Context applicationContext = context.getApplicationContext();
        iva.a((Object) applicationContext);
        this.a = applicationContext;
        if (initializationParams != null) {
            this.g = initializationParams;
            this.b = initializationParams.f;
            this.c = initializationParams.e;
            this.d = initializationParams.d;
            this.h = initializationParams.c;
            this.f = initializationParams.b;
            Bundle bundle = initializationParams.g;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
