package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.gms.R;

/* renamed from: tuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tuy extends arwm {
    final /* synthetic */ Context a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tuy(String str, Context context) {
        super(str);
        this.a = context;
    }

    public final void run() {
        Toast.makeText(this.a, R.string.fast_pair_enabling_bluetooth, 0).show();
    }
}
