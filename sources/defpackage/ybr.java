package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import com.google.android.gms.people.ui.widget.AvatarReferenceImageView;

/* renamed from: ybr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ybr extends AsyncTask {
    final /* synthetic */ AvatarReferenceImageView a;
    private final Context b;
    private final long c;
    private final boolean d;

    public ybr(AvatarReferenceImageView avatarReferenceImageView, long j, boolean z) {
        this.a = avatarReferenceImageView;
        this.b = avatarReferenceImageView.getContext();
        this.c = j;
        this.d = z;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Bitmap decodeByteArray;
        Void[] voidArr = (Void[]) objArr;
        byte[] b2 = wto.b(this.b, this.c, true);
        if (b2 == null || (decodeByteArray = BitmapFactory.decodeByteArray(b2, 0, b2.length)) == null) {
            return null;
        }
        if (this.d) {
            if (decodeByteArray.getWidth() != decodeByteArray.getHeight()) {
                decodeByteArray = jmd.a(decodeByteArray, Math.max(decodeByteArray.getWidth(), decodeByteArray.getHeight()));
            }
            decodeByteArray = jmd.a(this.b, decodeByteArray, new Paint());
        }
        return new BitmapDrawable(this.b.getResources(), decodeByteArray);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        super.onPostExecute(bitmapDrawable);
        Long valueOf = Long.valueOf(this.c);
        AvatarReferenceImageView avatarReferenceImageView = this.a;
        int i = AvatarReferenceImageView.h;
        if (ius.a(valueOf, avatarReferenceImageView.c)) {
            boolean z = this.d;
            AvatarReferenceImageView avatarReferenceImageView2 = this.a;
            if (z == avatarReferenceImageView2.g) {
                avatarReferenceImageView2.f = null;
                avatarReferenceImageView2.d = bitmapDrawable;
                if (!isCancelled() && bitmapDrawable != null) {
                    this.a.a.setImageDrawable(bitmapDrawable);
                    this.a.c();
                }
            }
        }
    }
}
