package defpackage;

import android.view.View;
import com.google.android.gms.R;

/* renamed from: pu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pu extends py {
    public pu(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls);
    }

    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }
}
