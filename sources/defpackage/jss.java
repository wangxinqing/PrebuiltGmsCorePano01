package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: jss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jss extends jta {
    private final String c;

    public jss(Context context, String str) {
        super(context);
        iva.a(str, (Object) "URI must not be empty.");
        this.c = str;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        try {
            return amri.c(MediaStore.Images.Media.getBitmap(getContext().getContentResolver(), Uri.parse(this.c)));
        } catch (Exception e) {
            return ampu.a;
        }
    }
}
