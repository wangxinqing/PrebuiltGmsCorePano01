package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.plus.data.internal.PlusImageView;
import java.io.IOException;

/* renamed from: ysv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ysv extends AsyncTask {
    final /* synthetic */ PlusImageView a;
    private final int b;

    public ysv(PlusImageView plusImageView, int i) {
        this.a = plusImageView;
        this.b = i;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        double d;
        ParcelFileDescriptor parcelFileDescriptor = ((ParcelFileDescriptor[]) objArr)[0];
        try {
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            int i = this.b;
            if (i > 0) {
                double width = (double) decodeFileDescriptor.getWidth();
                double height = (double) decodeFileDescriptor.getHeight();
                if (width <= height) {
                    double d2 = (double) i;
                    Double.isNaN(d2);
                    Double.isNaN(height);
                    d = d2 / height;
                } else {
                    double d3 = (double) i;
                    Double.isNaN(d3);
                    Double.isNaN(width);
                    d = d3 / width;
                }
                Double.isNaN(width);
                int i2 = (int) ((width * d) + 0.5d);
                Double.isNaN(height);
                decodeFileDescriptor = Bitmap.createScaledBitmap(decodeFileDescriptor, i2, (int) ((height * d) + 0.5d), true);
            } else {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e) {
                    e = e;
                }
            }
            return decodeFileDescriptor;
            return decodeFileDescriptor;
        } finally {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e2) {
                Log.e("PlusImageView", "closed failed", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        PlusImageView plusImageView = this.a;
        plusImageView.d = (Bitmap) obj;
        if (plusImageView.b) {
            plusImageView.setImageBitmap(plusImageView.d);
        }
    }
}
