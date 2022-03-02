package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: agbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agbj extends AsyncTask {
    private final ParcelFileDescriptor a;
    private final agcl b;

    public agbj(ParcelFileDescriptor parcelFileDescriptor, agcl agcl) {
        this.a = parcelFileDescriptor;
        this.b = agcl;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.a);
        try {
            return BitmapFactory.decodeStream(autoCloseInputStream);
        } finally {
            try {
                autoCloseInputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.b.a((Bitmap) obj);
    }
}
