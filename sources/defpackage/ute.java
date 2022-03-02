package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: ute  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ute {
    public final ClientContext a;
    public final utm b;
    public final utk c;
    public final utn d;
    public final utl e;

    public ute(Context context) {
        ClientContext clientContext = new ClientContext();
        this.a = clientContext;
        clientContext.f = "com.google.android.gms";
        izd izd = new izd(context, "instantmessaging-pa.googleapis.com", 443, context.getApplicationInfo().uid, 9732);
        izd.b = false;
        izd.a("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        izd.a("X-Android-Package", context.getPackageName());
        izd.a("X-Android-Cert", jhg.h(context, context.getPackageName()));
        String valueOf = String.valueOf(Integer.toString(1));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("grpc-Nearby/");
        sb.append(valueOf);
        sb.append("/1");
        izd.a("User-Agent", sb.toString());
        String valueOf2 = String.valueOf(context.getPackageName());
        String str = valueOf2.length() == 0 ? new String("android-app://") : "android-app://".concat(valueOf2);
        izd.a("Sec-X-Google-Grpc", "1");
        izd.a("Origin", str);
        this.b = new utm(izd);
        this.c = new utk(izd);
        this.d = new utn(izd);
        this.e = new utl(izd);
    }
}
