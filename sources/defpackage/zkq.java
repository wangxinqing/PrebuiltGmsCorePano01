package defpackage;

import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import com.google.android.gms.plus.sharebox.AddToCircleChimeraActivity;

/* renamed from: zkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zkq implements icm {
    final /* synthetic */ AddToCircleChimeraActivity a;
    private final String b;
    private final ImageView c;

    public zkq(AddToCircleChimeraActivity addToCircleChimeraActivity, String str, ImageView imageView) {
        this.a = addToCircleChimeraActivity;
        this.b = str;
        this.c = imageView;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        ParcelFileDescriptor b2;
        wlj wlj = (wlj) icl;
        if (wlj.aO().c() && (b2 = wlj.b()) != null) {
            new zkp(this.a, this.b, this.c, b2).execute(new Void[0]);
        }
    }
}
