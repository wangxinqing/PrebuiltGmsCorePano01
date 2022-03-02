package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import java.io.Closeable;

/* renamed from: wpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class wpe extends wpc {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wpe(String str, String str2, int i, wmq wmq, String str3) {
        super(str, !((Boolean) xhb.a.a()).booleanValue() ? null : str2, i, wmq, str3);
        xip.a();
    }

    /* access modifiers changed from: protected */
    public final wpb c(Context context) {
        Pair pair;
        yco yco;
        yco yco2;
        yci d = d(context);
        if (d == null) {
            return wpb.a;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptor = d.a;
            yco yco3 = null;
            if (aywy.l()) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor(), (Rect) null, options);
                pair = Pair.create(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            } else {
                pair = Pair.create(-1, -1);
            }
            boolean cy = aywy.a.a().cy();
            ParcelFileDescriptor parcelFileDescriptor2 = d.b;
            if (parcelFileDescriptor2 != null) {
                if (!cy) {
                    yco[] a = ycp.a.a();
                    yco = a[0];
                    yco2 = a[1];
                    iva.a((Object) yco2);
                    iva.a((Object) parcelFileDescriptor2);
                    ycy.a(new wpd(parcelFileDescriptor2, yco2, (int) aywy.a.a().ae()));
                    yco3 = yco;
                } else {
                    yco3 = new yco(parcelFileDescriptor2);
                }
            }
            wpb a2 = wpb.a(yco3, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), cy);
            jjt.a(d.a);
            return a2;
        } catch (Exception e) {
            jjt.a((Closeable) yco);
            jjt.a((Closeable) yco2);
            throw e;
        } catch (Exception e2) {
            try {
                jjt.a(d.b);
                throw e2;
            } catch (Throwable th) {
                jjt.a(d.a);
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract yci d(Context context);
}
