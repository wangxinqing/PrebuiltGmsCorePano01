package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Pair;
import java.io.Closeable;

/* renamed from: wpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class wpa extends wpc {
    /* access modifiers changed from: protected */
    public final wpb c(Context context) {
        Pair pair;
        byte[] d = d(context);
        if (d == wpc.c || d == null) {
            return wpb.a;
        }
        if (d == wpc.d) {
            return wpb.b;
        }
        if (aywy.l()) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(d, 0, d.length, options);
            pair = Pair.create(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        } else {
            pair = Pair.create(-1, -1);
        }
        yco[] a = ycp.a.a();
        yco yco = a[0];
        yco yco2 = a[1];
        try {
            iva.a((Object) yco2);
            iva.a((Object) d);
            ycy.a(new woz(yco2, d));
            return wpb.a(yco, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), false);
        } catch (Exception e) {
            jjt.a((Closeable) yco);
            jjt.a((Closeable) yco2);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public abstract byte[] d(Context context);

    public wpa(String str, int i, wmq wmq, String str2) {
        super(str, i, wmq, str2);
    }

    protected wpa(String str, int i, wmq wmq, String str2, byte[] bArr) {
        super(str, i, wmq, str2);
    }
}
