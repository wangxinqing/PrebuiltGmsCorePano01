package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;

/* renamed from: dvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dvw extends AsyncTask {
    public final icf a;
    final /* synthetic */ AppInviteChimeraActivity b;
    private final Context c;
    private final Toolbar d;

    public dvw(AppInviteChimeraActivity appInviteChimeraActivity, Context context, icc icc, String str, Toolbar toolbar) {
        this.b = appInviteChimeraActivity;
        this.c = context;
        appInviteChimeraActivity.a = icc;
        ibq ibq = wlt.a;
        this.a = xdh.b(icc, str, 1, 0);
        this.d = toolbar;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        wlj wlj = (wlj) this.a.a();
        if (wlj == null || wlj.aO() == null || !wlj.aO().c()) {
            return null;
        }
        ParcelFileDescriptor b2 = wlj.b();
        try {
            Bitmap a2 = wlu.a(b2);
            if (a2 != null) {
                if (a2.getWidth() != a2.getHeight()) {
                    a2 = jmd.a(a2, Math.max(a2.getWidth(), a2.getHeight()));
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.c.getResources(), jmd.a(this.c, a2, new Paint()));
                jjt.a(b2);
                return bitmapDrawable;
            }
            jjt.a(b2);
            return null;
        } catch (Throwable th) {
            jjt.a(b2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        super.onPostExecute(bitmapDrawable);
        if (!isCancelled() && bitmapDrawable != null) {
            this.d.b((Drawable) bitmapDrawable);
            this.b.n = true;
        }
    }
}
