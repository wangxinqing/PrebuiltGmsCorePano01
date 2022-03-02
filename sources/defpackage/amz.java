package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;

/* renamed from: amz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amz extends oz {
    final /* synthetic */ ana b;

    public amz(ana ana) {
        this.b = ana;
    }

    public final void a(View view, qs qsVar) {
        this.b.e.a(view, qsVar);
        int childAdapterPosition = this.b.d.getChildAdapterPosition(view);
        acg adapter = this.b.d.getAdapter();
        if (adapter instanceof amt) {
            Preference f = ((amt) adapter).f(childAdapterPosition);
        }
    }

    public final boolean a(View view, int i, Bundle bundle) {
        return this.b.e.a(view, i, bundle);
    }
}
