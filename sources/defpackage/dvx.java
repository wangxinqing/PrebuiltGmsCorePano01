package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;
import java.io.IOException;

/* renamed from: dvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dvx extends AsyncTask {
    final /* synthetic */ AppInviteChimeraActivity a;
    private final Context b;
    private final Uri c;
    private final ImageView d;

    public dvx(AppInviteChimeraActivity appInviteChimeraActivity, Context context, Uri uri, ImageView imageView) {
        this.a = appInviteChimeraActivity;
        this.b = context;
        this.c = uri;
        this.d = imageView;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        String scheme = this.c.getScheme();
        if (scheme.equals("http") || scheme.equals("https")) {
            ibq ibq = wlt.a;
            wlj wlj = (wlj) xdh.a(this.a.a, this.c.toString()).a();
            if (wlj.aO() == null || !wlj.aO().c()) {
                return null;
            }
            ParcelFileDescriptor b2 = wlj.b();
            try {
                return wlu.a(b2);
            } finally {
                jjt.a(b2);
            }
        } else {
            try {
                return MediaStore.Images.Media.getBitmap(this.b.getContentResolver(), this.c);
            } catch (IOException e) {
                String valueOf = String.valueOf(this.c.toString());
                Log.e("AppInvite", valueOf.length() == 0 ? new String("Cannot load image from: ") : "Cannot load image from: ".concat(valueOf));
                return null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        super.onPostExecute(bitmap);
        if (!isCancelled() && bitmap != null) {
            this.a.i = bitmap;
            this.d.setImageDrawable(new BitmapDrawable(this.b.getResources(), bitmap));
            this.a.g.setVisibility(0);
        }
    }
}
