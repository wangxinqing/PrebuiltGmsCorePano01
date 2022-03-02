package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;

/* renamed from: hyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hyu implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ RecyclerView a;
    final /* synthetic */ AccountPickerChimeraActivity b;

    public hyu(AccountPickerChimeraActivity accountPickerChimeraActivity, RecyclerView recyclerView) {
        this.b = accountPickerChimeraActivity;
        this.a = recyclerView;
    }

    public final void onGlobalLayout() {
        AccountPickerChimeraActivity accountPickerChimeraActivity = this.b;
        accountPickerChimeraActivity.j.g.a(accountPickerChimeraActivity, new hyt(this));
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
