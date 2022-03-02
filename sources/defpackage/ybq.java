package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.people.model.AvatarReference;
import com.google.android.gms.people.ui.widget.AvatarReferenceImageView;

/* renamed from: ybq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ybq extends AsyncTask {
    public final icf a;
    final /* synthetic */ AvatarReferenceImageView b;
    private final Context c;
    private final AvatarReference d;
    private final boolean e;

    public ybq(AvatarReferenceImageView avatarReferenceImageView, icc icc, AvatarReference avatarReference, wli wli, boolean z) {
        this.b = avatarReferenceImageView;
        this.c = avatarReferenceImageView.getContext();
        ibq ibq = wlt.a;
        this.a = icc.a((idf) new xde(icc, avatarReference, wli));
        this.d = avatarReference;
        this.e = z;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        wlj wlj = (wlj) this.a.a();
        BitmapDrawable bitmapDrawable = null;
        if (wlj.aO() != null && wlj.aO().c()) {
            ParcelFileDescriptor b2 = wlj.b();
            try {
                Bitmap a2 = wlu.a(b2);
                if (a2 != null) {
                    if (this.e) {
                        if (a2.getWidth() != a2.getHeight()) {
                            a2 = jmd.a(a2, Math.max(a2.getWidth(), a2.getHeight()));
                        }
                        a2 = jmd.a(this.c, a2, new Paint());
                    }
                    bitmapDrawable = new BitmapDrawable(this.c.getResources(), a2);
                }
            } finally {
                jjt.a(b2);
            }
        }
        return bitmapDrawable;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        super.onPostExecute(bitmapDrawable);
        AvatarReference avatarReference = this.d;
        AvatarReferenceImageView avatarReferenceImageView = this.b;
        int i = AvatarReferenceImageView.h;
        if (avatarReference.equals(avatarReferenceImageView.b)) {
            boolean z = this.e;
            AvatarReferenceImageView avatarReferenceImageView2 = this.b;
            if (z == avatarReferenceImageView2.g) {
                avatarReferenceImageView2.e = null;
                avatarReferenceImageView2.d = bitmapDrawable;
                if (!isCancelled() && bitmapDrawable != null) {
                    this.b.a.setImageDrawable(bitmapDrawable);
                    this.b.c();
                }
            }
        }
    }
}
