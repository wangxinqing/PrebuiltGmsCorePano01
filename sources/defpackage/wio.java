package defpackage;

import android.os.Message;
import com.google.android.gms.nearby.sharing.view.ContentView;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: wio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wio extends qvr {
    private final WeakReference a;

    public wio(ContentView contentView) {
        this.a = new WeakReference(contentView);
    }

    public final void handleMessage(Message message) {
        ContentView contentView = (ContentView) this.a.get();
        if (contentView != null && message.what == 1) {
            contentView.a((List) message.obj);
        }
    }
}
