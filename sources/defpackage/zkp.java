package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import com.google.android.gms.plus.sharebox.AddToCircleChimeraActivity;

/* renamed from: zkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zkp extends AsyncTask {
    final /* synthetic */ AddToCircleChimeraActivity a;
    private final String b;
    private final ImageView c;
    private final ParcelFileDescriptor d;

    public zkp(AddToCircleChimeraActivity addToCircleChimeraActivity, String str, ImageView imageView, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = addToCircleChimeraActivity;
        this.b = str;
        this.c = imageView;
        this.d = parcelFileDescriptor;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            return wlu.a(this.d);
        } finally {
            jjt.a(this.d);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            AddToCircleChimeraActivity addToCircleChimeraActivity = this.a;
            int i = AddToCircleChimeraActivity.d;
            addToCircleChimeraActivity.b.a((Object) this.b, (Object) bitmap);
            if (this.b.equals(this.c.getTag())) {
                this.c.setImageBitmap(bitmap);
            }
        }
    }
}
