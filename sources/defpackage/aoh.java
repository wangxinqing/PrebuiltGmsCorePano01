package defpackage;

import android.app.slice.SliceManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.slice.Slice;
import java.util.Set;

/* renamed from: aoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoh implements Runnable {
    final /* synthetic */ aoj a;

    public aoh(aoj aoj) {
        this.a = aoj;
    }

    public final void run() {
        Slice slice;
        this.a.a();
        aoj aoj = this.a;
        Context context = aoj.f.a;
        Uri uri = aoj.a;
        Set set = apv.c;
        if (Build.VERSION.SDK_INT < 28) {
            slice = apb.a(context, uri, set);
        } else {
            slice = ans.a(((SliceManager) context.getSystemService(SliceManager.class)).bindSlice(uri, ans.a(set)), context);
        }
        this.a.b.execute(new aog(this, slice));
    }
}
