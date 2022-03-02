package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import java.io.IOException;

/* renamed from: yro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yro extends AsyncTask {
    final /* synthetic */ yrp a;
    private final String b;
    private final ImageView c;
    private final ParcelFileDescriptor d;

    public yro(yrp yrp, ParcelFileDescriptor parcelFileDescriptor, String str, ImageView imageView) {
        this.a = yrp;
        this.d = parcelFileDescriptor;
        this.b = str;
        this.c = imageView;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            Bitmap a2 = wlu.a(this.d);
            Bitmap bitmap = null;
            if (a2 != null) {
                bitmap = jju.a(a2);
                this.d.close();
            }
            return bitmap;
        } finally {
            try {
                this.d.close();
            } catch (IOException e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.a.b.a((Object) this.b, (Object) bitmap);
            yrp.a(bitmap, this.c);
        }
    }
}
