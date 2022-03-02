package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.setupdesign.items.ExpandableSwitchItem;

/* renamed from: alic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alic extends oz {
    final /* synthetic */ ExpandableSwitchItem b;

    public alic(ExpandableSwitchItem expandableSwitchItem) {
        this.b = expandableSwitchItem;
    }

    public final void a(View view, qs qsVar) {
        super.a(view, qsVar);
        qsVar.a(this.b.a ? qp.e : qp.d);
    }

    public final boolean a(View view, int i, Bundle bundle) {
        if (i != 262144 && i != 524288) {
            return super.a(view, i, bundle);
        }
        ExpandableSwitchItem expandableSwitchItem = this.b;
        expandableSwitchItem.a(!expandableSwitchItem.a);
        return true;
    }
}
