package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.android.volley.VolleyError;

/* renamed from: jsy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jsy extends jta {
    private final String c;

    public jsy(Context context, String str) {
        super(context);
        iva.a(str, (Object) "URL must not be empty.");
        this.c = str;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        try {
            izb a = izb.a(getContext());
            a.g = 6400;
            byte[] a2 = a.a(getContext(), this.c);
            return amri.c(BitmapFactory.decodeByteArray(a2, 0, a2.length));
        } catch (VolleyError e) {
            return ampu.a;
        }
    }
}
