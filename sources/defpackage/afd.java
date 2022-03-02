package defpackage;

import android.view.View;
import android.view.Window;

/* renamed from: afd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afd implements View.OnClickListener {
    final wd a = new wd(this.b.a.getContext(), this.b.d);
    final /* synthetic */ aff b;

    public afd(aff aff) {
        this.b = aff;
    }

    public void onClick(View view) {
        aff aff = this.b;
        Window.Callback callback = aff.e;
        if (callback != null && aff.f) {
            callback.onMenuItemSelected(0, this.a);
        }
    }
}
