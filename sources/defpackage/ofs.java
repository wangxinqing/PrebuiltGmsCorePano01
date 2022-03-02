package defpackage;

import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import java.io.File;

/* renamed from: ofs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofs extends AsyncTask {
    final /* synthetic */ File a;
    final /* synthetic */ boolean b;
    final /* synthetic */ File c;
    final /* synthetic */ String d;
    final /* synthetic */ Screenshot e;
    final /* synthetic */ ofu f;

    public ofs(File file, boolean z, File file2, String str, Screenshot screenshot, ofu ofu) {
        this.a = file;
        this.b = z;
        this.c = file2;
        this.d = str;
        this.e = screenshot;
        this.f = ofu;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (this.a.length() > 0) {
            return Screenshot.a(BitmapFactory.decodeFile(this.a.getAbsolutePath()));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Screenshot screenshot = (Screenshot) obj;
        if (this.a != null && this.b) {
            ofx.a(this.c, this.d, ".bmp");
        }
        Screenshot screenshot2 = this.e;
        if (screenshot != null) {
            screenshot2.a = screenshot.a;
            screenshot2.b = screenshot.b;
            screenshot2.c = screenshot.c;
        }
        ofu ofu = this.f;
        if (ofu != null) {
            ofu.a(screenshot);
        }
    }
}
