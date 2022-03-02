package defpackage;

import android.widget.ListView;

/* renamed from: io  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class io implements Runnable {
    final /* synthetic */ iq a;

    public io(iq iqVar) {
        this.a = iqVar;
    }

    public final void run() {
        ListView listView = this.a.b;
        listView.focusableViewAvailable(listView);
    }
}
