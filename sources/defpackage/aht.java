package defpackage;

import android.database.DataSetObserver;

/* renamed from: aht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aht extends DataSetObserver {
    final /* synthetic */ ahu a;

    public aht(ahu ahu) {
        this.a = ahu;
    }

    public final void onChanged() {
        ahu ahu = this.a;
        ahu.b = true;
        ahu.notifyDataSetChanged();
    }

    public final void onInvalidated() {
        ahu ahu = this.a;
        ahu.b = false;
        ahu.notifyDataSetInvalidated();
    }
}
