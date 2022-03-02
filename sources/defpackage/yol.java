package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import android.util.Log;
import com.google.android.gms.plus.audience.AudienceSelectionListPersonView;
import java.io.InputStream;

/* renamed from: yol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yol extends AsyncTask {
    final /* synthetic */ String a;
    final /* synthetic */ Object b;
    final /* synthetic */ AudienceSelectionListPersonView c;
    final /* synthetic */ boolean d;
    final /* synthetic */ yoy e;

    public yol(yoy yoy, String str, Object obj, AudienceSelectionListPersonView audienceSelectionListPersonView, boolean z) {
        this.e = yoy;
        this.a = str;
        this.b = obj;
        this.c = audienceSelectionListPersonView;
        this.d = z;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            yoy yoy = this.e;
            int i = yoy.E;
            InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(yoy.M.getContentResolver(), Uri.parse(this.a));
            if (openContactPhotoInputStream != null) {
                return BitmapFactory.decodeStream(openContactPhotoInputStream);
            }
            return null;
        } catch (Exception e2) {
            Log.e("AudienceSelectionAdapter", "Exception opening ContactsDB avatar", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            yoy yoy = this.e;
            int i = yoy.E;
            yoy.D.a((Object) this.a, (Object) bitmap);
            Object obj2 = this.b;
            AudienceSelectionListPersonView audienceSelectionListPersonView = this.c;
            if (obj2 == audienceSelectionListPersonView.d) {
                this.e.a(audienceSelectionListPersonView, bitmap, this.d);
            }
        }
    }
}
