package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: aapy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aapy implements jms {
    static final jms a = new aapy();

    private aapy() {
    }

    public final jmr a(ViewGroup viewGroup, int i) {
        return new aaqb(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.scanned_apps_settings_item, viewGroup, false));
    }
}
